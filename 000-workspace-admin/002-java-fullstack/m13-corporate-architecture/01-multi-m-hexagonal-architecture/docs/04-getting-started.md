# 4. Getting Started (Developer Guide)

This is the practical "clone it and run it" guide. If you only read one doc before writing
code, read this one.

## Prerequisites

| Tool | Version | Why |
|---|---|---|
| JDK | 17 | Matches `<java.version>` in the parent POM |
| Maven | 3.9+ (or use the included behavior of your IDE) | Builds the multi-module reactor |
| Docker Desktop / Docker Engine + Compose v2 | any recent | Runs the full stack in containers |
| Git | any recent | Feature branch workflow (see [docs/06](06-git-workflow.md)) |

No database installation is required — every service uses an embedded H2 in-memory
database, and Flyway creates the schema automatically on startup (see
[docs/11](11-database-migrations.md)).

## 1. Clone and build

```powershell
git clone <your-fork-url>
cd central-parent
mvn clean install
```

This single command:

1. Builds `common-service` first (nothing else depends on anything, so it's built first).
2. Builds `eureka-server`, `api-gateway`, `auth-service`, `batch-processing-service`,
   `document-service`, `logging-service` — each depends on `common-service`, which Maven's
   reactor already resolved.
3. Runs **every unit and integration test** in the repo (39 tests as of this writing) —
   this is the exact same command your CI/CD pipeline runs (see
   [docs/05](05-deployment.md)), so if it's green locally, it will be green in CI.
4. Packages each business/infra module into a runnable "fat jar" under `target/`
   (e.g. `auth-service/target/auth-service.jar`).

If you only want to iterate on one service without rebuilding everything:

```powershell
mvn -pl auth-service -am clean install
```

## 2. Run locally without Docker (fastest inner loop)

Open **six terminals** (order matters — Eureka first, then everything else can start in
any order since they all just need Eureka to be reachable):

```powershell
# Terminal 1
cd eureka-server; mvn spring-boot:run

# Terminal 2 (wait ~15s for Eureka to be up first)
cd api-gateway; mvn spring-boot:run

# Terminals 3-6 (any order)
cd auth-service; mvn spring-boot:run
cd batch-processing-service; mvn spring-boot:run
cd document-service; mvn spring-boot:run
cd logging-service; mvn spring-boot:run
```

Or, run the packaged jars directly (useful after `mvn clean install`, no need to keep
Maven's own process running):

```powershell
java -jar eureka-server/target/eureka-server.jar
java -jar api-gateway/target/api-gateway.jar
java -jar auth-service/target/auth-service.jar
java -jar batch-processing-service/target/batch-processing-service.jar
java -jar document-service/target/document-service.jar
java -jar logging-service/target/logging-service.jar
```

Check everything registered correctly: open http://localhost:8761 (Eureka dashboard) — you
should see `API-GATEWAY`, `AUTH-SERVICE`, `BATCH-PROCESSING-SERVICE`, `DOCUMENT-SERVICE`,
and `LOGGING-SERVICE` all listed with status `UP`.

## 3. Run the frontend

The frontend is plain static HTML/CSS/JS — no build step, no npm install.

```powershell
cd frontend
python -m http.server 3000
```

(or any other static file server — `npx serve -l 3000`, VS Code "Live Server" extension,
etc.) Then open **http://localhost:3000** in your browser. The gateway URL field defaults
to `http://localhost:8080` — change it if your gateway runs elsewhere. See
[docs/12](12-frontend.md) for a full walkthrough of the UI and how CORS is configured to
allow this.

## 4. Run everything with Docker Compose (closest to production)

```powershell
docker compose up --build
```

This builds one Docker image per deployable service (using the repo root as the build
context so `common-service` is compiled in as part of each image) plus the `frontend`
image, and starts all 7 containers on a shared bridge network. See
[docs/05](05-deployment.md) for full details, environment variables, and how to tear it
down.

## 5. Try it end-to-end

Through the gateway (works identically whether services are running locally or via
Docker Compose — the gateway is always on port 8080):

```powershell
# Register + login
curl -X POST http://localhost:8080/auth/api/auth/register -H "Content-Type: application/json" -d '{"username":"alice","password":"secret1","role":"USER"}'
$token = (curl -s -X POST http://localhost:8080/auth/api/auth/login -H "Content-Type: application/json" -d '{"username":"alice","password":"secret1"}' | ConvertFrom-Json).data.token

# Call an authenticated endpoint
curl http://localhost:8080/batch/api/batch/jobs -H "Authorization: Bearer $token"
```

Or just open the frontend at http://localhost:3000 and click through the tabs — the
Auth tab handles register/login for you and stores the token for the other tabs
automatically.

## Where to go next

- New to the architecture? Read [docs/01](01-parent-child-architecture.md) and
  [docs/02](02-hexagonal-architecture.md).
- About to deploy? Read [docs/05](05-deployment.md).
- About to contribute a change? Read [docs/06](06-git-workflow.md), then
  [docs/07](07-adding-new-microservice.md) or [docs/08](08-adding-new-feature.md).
- Something not working? Check [docs/09](09-troubleshooting.md) first.
