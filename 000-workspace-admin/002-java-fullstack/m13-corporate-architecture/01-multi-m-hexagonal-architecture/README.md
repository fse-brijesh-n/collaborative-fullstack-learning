# central-parent — Maven Parent-Child Microservices with Hexagonal Architecture

A learning project demonstrating:

1. A **Maven multi-module (parent-child)** build: one root `pom.xml` shares configuration
   (Java version, Spring Boot/Cloud BOMs, plugin management) across all child modules, and
   `mvn clean install` from the root builds everything in a single command.
2. **Hexagonal Architecture (Ports & Adapters)** inside each business microservice.
3. **Eureka** service discovery + **Spring Cloud Gateway** as a single entry point.
4. **Docker Compose** to run the whole system together.
5. **Flyway** SQL migrations for safe, team-friendly schema evolution.
6. A **browser frontend** (`frontend/`) that exercises every service through the gateway.
7. Dual **CI/CD pipelines** (GitHub Actions + Azure DevOps) for single-click build/deploy.

## 📚 Full documentation

This README is a quick-start summary. For the complete learning guide — architecture,
deployment, Git workflow, adding new services/features, database migrations,
authentication, the frontend, and troubleshooting — see the **[`docs/`](docs/README.md)**
folder. Start with [`docs/developer-guide.md`](docs/developer-guide.md) or
[`docs/deploy.md`](docs/deploy.md), or browse the full index at
[`docs/README.md`](docs/README.md).

## Modules

| Module                        | Role                                   | Port |
|--------------------------------|-----------------------------------------|------|
| `common-service`                | Shared library (DTOs, exceptions, JWT util) — **not deployed** | – |
| `eureka-server`                 | Service discovery registry             | 8761 |
| `api-gateway`                   | Single entry point, routes to services | 8080 |
| `auth-service`                  | Register/login, issues JWT             | 8081 |
| `batch-processing-service`      | Trigger/track batch job runs           | 8082 |
| `document-service`              | Upload/download/list documents         | 8083 |
| `logging-service`               | Receive & query log events              | 8084 |
| `frontend`                      | Static browser UI for all services (via gateway) | 3000 |

Each business service (`auth-service`, `batch-processing-service`, `document-service`,
`logging-service`) is internally organized as:

```
domain/
  model/        framework-free domain objects
  port/in/      inbound ports (use-case interfaces)
  port/out/     outbound ports (e.g. repository interfaces)
application/
  service/      use-case implementations (orchestration only)
adapter/
  in/web/       REST controllers (+ batch-processing also has in/scheduler)
  out/persistence/  Spring Data JPA entities/repos + port implementations
config/          Spring bean wiring (JWT, password encoder, etc.)
```

Each service owns its own in-memory H2 database (no shared DB).

## Build (single command)

```powershell
mvn clean install
```

This builds `common-service` first, then every business/infra module that depends on it,
in the correct reactor order.

## Run locally without Docker

Start in this order (each in its own terminal):

```powershell
cd eureka-server; mvn spring-boot:run
cd api-gateway; mvn spring-boot:run
cd auth-service; mvn spring-boot:run
cd batch-processing-service; mvn spring-boot:run
cd document-service; mvn spring-boot:run
cd logging-service; mvn spring-boot:run
```

Eureka dashboard: http://localhost:8761

## Try it in your browser (frontend)

The `frontend/` folder is a small dependency-free HTML/CSS/JS console covering every
service (Auth, Batch Jobs, Documents, Logs tabs). No build step required:

```powershell
cd frontend
python -m http.server 3000
```

Open **http://localhost:3000**, confirm/adjust the "Gateway URL" field (defaults to
`http://localhost:8080`), register a user, log in, then try the other tabs — the JWT is
stored automatically and attached to every subsequent request. See
[`docs/12-frontend.md`](docs/12-frontend.md) for the full walkthrough, including how CORS
is configured so the browser can call the gateway directly. When running via
`docker compose up --build` (below), the frontend is also available at
http://localhost:3000 with no extra steps.

Example calls through the gateway (port 8080):

```powershell
curl -X POST http://localhost:8080/auth/api/auth/register -H "Content-Type: application/json" -d '{"username":"alice","password":"secret1"}'
curl -X POST http://localhost:8080/auth/api/auth/login -H "Content-Type: application/json" -d '{"username":"alice","password":"secret1"}'
curl -X POST http://localhost:8080/batch/api/batch/jobs/demo-job/trigger
curl http://localhost:8080/batch/api/batch/jobs
curl -X POST http://localhost:8080/logs/api/logs -H "Content-Type: application/json" -d '{"sourceService":"auth-service","level":"INFO","message":"hello"}'
curl http://localhost:8080/logs/api/logs
```

## Run with Docker Compose

Requires Docker Desktop / Docker Engine with Compose v2.

```powershell
docker compose up --build
```

This builds one image per deployable service (each Dockerfile runs a scoped Maven
reactor build using the repo root as context, so `common-service` is compiled and
included automatically) plus the `frontend` image, and starts all 7 containers on a
shared `microservices-net` bridge network. `api-gateway` is reachable at
http://localhost:8080, the frontend at http://localhost:3000.

To stop and remove containers:

```powershell
docker compose down
```

## Database migrations (Flyway)

Every business service manages its schema via **Flyway** SQL migration files in
`src/main/resources/db/migration/` (`ddl-auto: validate`, not `update`/`create`) so schema
changes are reviewable, version-controlled, and safe for a team to evolve together. See
[`docs/11-database-migrations.md`](docs/11-database-migrations.md) for the full workflow
(never edit an applied migration — always add a new `Vn__*.sql` file).

## Notes


- H2 is in-memory: data resets whenever a service restarts — fine for learning.
- JWT secret/expiry are configurable via `JWT_SECRET` env var (see `auth-service/src/main/resources/application.yml`).
- `common-service` has no Dockerfile — it's a library JAR consumed at build time only.

## CI/CD (single-click build & deploy)

Two ready-to-use pipelines live in this repo:

| File                              | Platform       |
|------------------------------------|----------------|
| `.github/workflows/ci-cd.yml`      | GitHub Actions |
| `azure-pipelines.yml`               | Azure DevOps   |

Both pipelines are present at all times, but only **one** of them actually builds/deploys
at a time — controlled by a dedicated properties file at the repo root, `ci-pipeline.properties`:

```properties
ci.pipeline=github-actions
# or:
ci.pipeline=azure-devops
```

- If `ci.pipeline=github-actions`, the GitHub Actions workflow runs its build/push/deploy
  steps; the Azure Pipelines definition detects the mismatch and exits as a no-op.
- If `ci.pipeline=azure-devops`, it's the other way around.

Switching CI/CD systems is a one-line edit to `ci-pipeline.properties` — no changes needed
in either pipeline file or the POM. The root `pom.xml` also loads this same file via the
`properties-maven-plugin` (bound to the `initialize` phase, parent module only) so
`${ci.pipeline}` is available as a normal Maven property during the build if needed —
the value itself still lives in one place.

Each pipeline, on trigger (manual "Run"/"workflow_dispatch" button = single click, or a push
to `main`):

1. Builds the whole Maven reactor in one command (`mvn clean install`).
2. Runs unit tests.
3. Builds a Docker image per deployable service and pushes it to GitHub Container Registry
   (`ghcr.io`) — used by both pipelines so image storage is consistent regardless of which
   CI system built them.
4. Runs `docker compose up -d --build` directly on the CI runner/agent as a self-contained
   deployment demo (there's no external production server configured for this learning
   project).
5. Waits for Eureka to become healthy, smoke-tests the gateway and an auth-service endpoint.
6. Tears the demo stack back down.

### Setup required

- **GitHub Actions**: nothing extra — it uses the built-in `GITHUB_TOKEN` to push to `ghcr.io`.
- **Azure DevOps**: define these pipeline variables (mark `GHCR_TOKEN` as secret):
  - `GHCR_USERNAME` — a GitHub username
  - `GHCR_TOKEN` — a GitHub Personal Access Token with `write:packages` scope
  - `IMAGE_OWNER` — e.g. `your-github-username/central-parent`

