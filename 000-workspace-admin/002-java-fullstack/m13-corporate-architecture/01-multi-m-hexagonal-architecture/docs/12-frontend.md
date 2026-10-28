# 12. Frontend

## What it is

A tiny, dependency-free browser console for the whole system, living in `frontend/`:

```
frontend/
├── index.html   ← tabbed UI: Auth / Batch Jobs / Documents / Logs
├── style.css     ← dark theme
├── app.js         ← all logic: fetch wrapper, tab switching, form handlers
└── Dockerfile      ← nginx:1.27-alpine, serves the 3 files above on port 80
```

Deliberately **plain HTML/CSS/vanilla JS — no npm, no build step, no framework**. Any
developer can open the three files directly in an editor and understand the entire
front-end in a few minutes, which matters more for a learning project than the
productivity gains of a full frontend framework/bundler.

## Running it

**Locally (any static file server):**

```powershell
cd frontend
python -m http.server 3000
```

Then open **http://localhost:3000**.

**Via Docker Compose (part of the full stack):**

```powershell
docker compose up --build
```

`frontend` is one of the 7 services defined in `docker-compose.yml`, mapped to host port
`3000` (`3000:80`), served by nginx from the Dockerfile.

Either way, you land on the same tabbed UI. The **"Gateway URL"** field at the top defaults
to `http://localhost:8080` — change it if your `api-gateway` is reachable elsewhere.

## The four tabs

| Tab | Backed by | Actions |
|---|---|---|
| **Auth** | `auth-service` | Register a user, log in (stores the returned JWT) |
| **Batch Jobs** | `batch-processing-service` | Trigger a job by name, list job runs (optionally filtered by name) |
| **Documents** | `document-service` | Upload a file (multipart), list documents, download a document |
| **Logs** | `logging-service` | Post a log entry, list log entries (optionally filtered by source service) |

All requests go **directly from the browser to the API Gateway** at the configured
Gateway URL — the frontend never talks to individual services directly, exactly mirroring
how a real client application would use this system (see [docs/03](03-project-structure.md)
for the gateway's route table).

## How authentication works in the UI

1. Fill in the Auth tab's login form and submit.
2. `app.js`'s login handler calls `POST /auth/api/auth/login` through the gateway, and on a
   successful response stores `response.data.token` in `localStorage` (`demo_jwt` key) and
   updates a status pill ("Logged in as \<username\>").
3. Every subsequent call goes through a shared `callApi()` fetch wrapper that automatically
   attaches `Authorization: Bearer <token>` to every request **except** the public
   register/login endpoints — see [docs/10](10-authentication-and-tokens.md) for the full
   token contract every backend service enforces.
4. If you haven't logged in yet, calls to protected endpoints (Batch Jobs, Documents, Logs
   tabs) will come back `401` — the JSON response is pretty-printed into the on-page output
   box so you can see exactly what the backend returned, which is useful for learning how
   the auth flow behaves, not just whether it "works."

## Why CORS matters here (and how it's solved)

The frontend (origin `http://localhost:3000`) and the gateway (origin
`http://localhost:8080`) are **different origins** by browser rules (different port =
different origin), so every request from the frontend to the gateway is a
**cross-origin request**. For any request with a JSON body or custom header (which is most
of what this frontend does), the browser first sends an invisible **preflight**
`OPTIONS` request; the actual request is only sent if the preflight response says the
origin/method/headers are allowed.

The gateway allows this via an explicit `CorsWebFilter` bean —
`api-gateway/src/main/java/com/example/gateway/config/CorsConfig.java`:

```java
@Bean
public CorsWebFilter corsWebFilter() {
    CorsConfiguration configuration = new CorsConfiguration();
    configuration.setAllowedOriginPatterns(List.of("*"));
    configuration.setAllowedMethods(List.of("GET","POST","PUT","PATCH","DELETE","OPTIONS"));
    configuration.setAllowedHeaders(List.of("*"));
    configuration.setAllowCredentials(false);

    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    source.registerCorsConfiguration("/**", configuration);
    return new CorsWebFilter(source);
}
```

This applies to every route (`/**`), for any origin (fine for a learning project — lock
this down to a specific origin allow-list before using this pattern in production), and
covers all the HTTP methods the frontend uses (including the `OPTIONS` preflight itself
and multipart `POST` for document upload).

An earlier attempt used Spring Cloud Gateway's **properties-based**
`spring.cloud.gateway.globalcors.cors-configurations` YAML config instead of this Java
bean — it looked correct in the YAML but didn't actually get applied at runtime
(preflight requests came back `403`). See [docs/09](09-troubleshooting.md) for the full
story of that bug and why the explicit bean approach is what this project uses.

**Verifying CORS yourself**: `curl`/PowerShell's HTTP cmdlets don't enforce CORS, so a
successful `curl` call doesn't prove the browser would allow it. Test the actual preflight:

```powershell
curl.exe -i -X OPTIONS "http://localhost:8080/auth/api/auth/login" `
  -H "Origin: http://localhost:3000" `
  -H "Access-Control-Request-Method: POST" `
  -H "Access-Control-Request-Headers: content-type"
```

You should see `HTTP/1.1 200 OK` with an `Access-Control-Allow-Origin` header in the
response — that's what makes the real browser request work.

## Extending the frontend

Adding a UI for a new backend feature (e.g. the "delete document" example from
[docs/08](08-adding-new-feature.md)):

1. Add a button/element to the relevant tab in `index.html`.
2. Add a handler in `app.js` that calls `callApi(...)` with the new path/method — the
   fetch wrapper already handles attaching the auth header and rendering the JSON result.
3. No build step — just refresh the browser tab to see your change (or restart
   `python -m http.server` / the nginx container if using Docker Compose).

## Next

You've now read the whole documentation set. Return to the [docs index](README.md) for
the full reading path, or jump back into [docs/04](04-getting-started.md) to actually run
everything end-to-end.
