# 10. Authentication and Tokens (JWT)

## Overview

Authentication is **stateless JWT** shared across all four business services via
`common-service`'s `JwtUtil` and `JwtAuthenticationFilter`. There's no session store, no
shared cache — each service independently validates the token's signature and expiry on
every request.

```
┌────────────┐  1. register/login   ┌──────────────┐
│  Browser /  │ ───────────────────▶│ auth-service   │  issues a signed JWT
│  frontend   │◀─────────────────── │                │
└────────────┘   { token: "..." }   └──────────────┘
       │
       │ 2. Authorization: Bearer <token>
       ▼
┌────────────┐     ┌──────────────────────┐     ┌───────────────────────────┐
│ api-gateway │────▶│ batch-processing-svc  │     │ document-service, logging- │
│ (routes only,     │ (validates token via  │ ... │ service (same filter)      │
│  no auth logic)   │ JwtAuthenticationFilter)     │                             │
└────────────┘     └──────────────────────┘     └───────────────────────────┘
```

The **gateway itself does not validate tokens** — it's a pure router (StripPrefix +
load-balancing to Eureka-registered instances). Each business service validates the token
independently using the shared `JwtAuthenticationFilter` from `common-service`. This keeps
the gateway simple and means a service is safe to call directly (bypassing the gateway,
e.g. in a test) without losing security.

## How a token is issued (`auth-service`)

`POST /auth/api/auth/register` → `RegisterUserService` hashes the password (BCrypt) and
persists a `User` via `UserRepositoryPort`.

`POST /auth/api/auth/login` → `LoginService`:
1. Looks up the user by username via `UserRepositoryPort`.
2. Verifies the password with `PasswordEncoder.matches(...)`.
3. Calls `JwtUtil.generateToken(username, Map.of("role", user.getRole()))` — the token's
   **subject** is the username, and it carries a `role` claim.
4. Returns `{ "token": "<jwt>" }` wrapped in the shared `ApiResponse` envelope.

## `JwtUtil` (`common-service`)

Framework-agnostic (no Spring imports) so it's trivially unit-testable
(`JwtUtilTest.java`). Key behavior:

- **Signing algorithm**: HS256 (HMAC-SHA256) — a single shared secret signs and verifies.
- **Secret padding**: if a shorter demo secret is supplied, it's padded to the 32-byte
  minimum HS256 requires — convenient for local dev, but in a real deployment always
  supply a properly generated 256-bit secret.
- **Claims**: `sub` (subject/username), `role`, `iat`, `exp`.
- `isTokenValid(token, expectedSubject)` — checks both subject match and non-expiry.

## `JwtAuthenticationFilter` (`common-service`)

A `OncePerRequestFilter` reused by every business service's Spring Security chain:

1. Reads the `Authorization: Bearer <token>` header.
2. If absent, passes the request through unauthenticated (lets Spring Security's own
   `@PreAuthorize`/`SecurityFilterChain` config decide whether the endpoint requires auth).
3. If present, parses it via `JwtUtil`, and if valid, populates the
   `SecurityContextHolder` with an authenticated principal (username) and a granted
   authority derived from the `role` claim.
4. If the token is invalid/expired, the request proceeds unauthenticated, and downstream
   Spring Security config returns `401` for any endpoint requiring authentication.

Each service's `config/BeanConfig.java` (or equivalent) wires this filter into its
`SecurityFilterChain`, and declares which endpoints require authentication (e.g. `/auth/**`
is public for register/login, everything else requires a valid Bearer token).

## Why the shared secret matters

All four business services must use the **exact same `JWT_SECRET`** — a token signed by
`auth-service` must verify against the identical HMAC key in `batch-processing-service`,
`document-service`, and `logging-service`. This project keeps it consistent via:

- **Local/dev**: each service's `application.yml` reads `${JWT_SECRET:default-dev-secret}`
  — same default fallback value across all four files.
- **Docker Compose**: a single YAML anchor `&jwt-secret` in `docker-compose.yml` is reused
  (`<<: *jwt-secret`) across the four business services' `environment:` blocks — one value,
  defined once, impossible to accidentally drift between services.
- **Production**: replace the anchor's value (or override via a real secrets manager /
  `.env` file kept out of source control) — never commit a real production secret.

## Testing tokens manually

```powershell
# Register (auth-service is public)
curl -X POST http://localhost:8080/auth/api/auth/register -H "Content-Type: application/json" -d '{"username":"alice","password":"secret1","role":"USER"}'

# Login → get a token
$resp = curl -s -X POST http://localhost:8080/auth/api/auth/login -H "Content-Type: application/json" -d '{"username":"alice","password":"secret1"}' | ConvertFrom-Json
$token = $resp.data.token

# Call a protected endpoint without a token → 401
curl -i http://localhost:8080/batch/api/batch/jobs

# With a token → 200
curl http://localhost:8080/batch/api/batch/jobs -H "Authorization: Bearer $token"
```

The frontend (see [docs/12](12-frontend.md)) automates exactly this flow: the Auth tab's
login form stores the returned token in memory/`localStorage`, and every subsequent tab's
fetch wrapper automatically attaches `Authorization: Bearer <token>`.

## Next

Continue to [11. Database Migrations](11-database-migrations.md) — the `role`/`username`
columns you just exercised are defined there via Flyway, not Hibernate auto-DDL.
