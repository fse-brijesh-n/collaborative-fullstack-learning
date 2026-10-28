# 5. Deployment (Docker Compose & CI/CD)

## Local / single-machine deployment: Docker Compose

The root [`docker-compose.yml`](../docker-compose.yml) is the "deploy everything" file.
It defines 7 services on one bridge network (`microservices-net`):

| Container | Image | Host port |
|---|---|---|
| `eureka-server` | `learning/eureka-server:1.0.0` | 8761 |
| `api-gateway` | `learning/api-gateway:1.0.0` | 8080 |
| `auth-service` | `learning/auth-service:1.0.0` | 8081 |
| `batch-processing-service` | `learning/batch-processing-service:1.0.0` | 8082 |
| `document-service` | `learning/document-service:1.0.0` | 8083 |
| `logging-service` | `learning/logging-service:1.0.0` | 8084 |
| `frontend` | `learning/frontend:1.0.0` | 3000 |

```powershell
docker compose up --build     # build images + start everything
docker compose ps              # check status
docker compose logs -f api-gateway   # tail one service's logs
docker compose down             # stop and remove containers (add -v to also drop volumes)
```

Each business service's `Dockerfile` uses the **repo root as the build context** (see the
`context: .` in `docker-compose.yml`) so a scoped Maven build can include `common-service`
automatically — you don't need to `mvn install` common-service into your local `~/.m2`
first; the Docker build does it inside the image build stage.

All 4 business services share one `JWT_SECRET` environment variable (defined once via the
YAML anchor `&jwt-secret` and reused with `<<: *jwt-secret`) so a token minted by
`auth-service` validates correctly against the other three — see
[docs/10](10-authentication-and-tokens.md).

The `frontend` container serves static files via nginx and talks directly to
`api-gateway:8080` from the browser (not container-to-container — the browser itself makes
the request), which is why CORS is configured on the gateway (see
[docs/12](12-frontend.md)).

## CI/CD: two pipelines, one switch

Both pipeline definitions live in the repo **at all times**:

| File | Platform |
|---|---|
| [`.github/workflows/ci-cd.yml`](../.github/workflows/ci-cd.yml) | GitHub Actions |
| [`azure-pipelines.yml`](../azure-pipelines.yml) | Azure DevOps |

Which one actually does work is controlled by a single properties file at the repo root,
[`ci-pipeline.properties`](../ci-pipeline.properties):

```properties
ci.pipeline=github-actions
# or:
ci.pipeline=azure-devops
```

- Every pipeline run starts by reading this file. If the value doesn't match its own
  platform name, the pipeline exits immediately as a no-op — so both can be enabled on
  their respective platforms simultaneously without ever double-deploying.
- Switching CI/CD systems is a **one-line edit** to `ci-pipeline.properties` — nothing else
  needs to change.
- The root `pom.xml` also loads this same file via the `properties-maven-plugin` (bound to
  the `initialize` phase), so `${ci.pipeline}` is available as a normal Maven property
  during any build if you ever need to branch build logic on it — the value still lives in
  exactly one place, avoiding drift between "what Maven thinks" and "what CI thinks".

## What each pipeline actually does (identical steps, different syntax)

Triggered by a push to `main`, or manually ("Run workflow" in GitHub Actions /
"Run pipeline" in Azure DevOps — this is the "single-click" deploy):

1. **Build & test** — `mvn -B clean install` for the whole reactor. This is the exact same
   command described in [docs/04](04-getting-started.md); if it passes on your machine, it
   passes in CI, and vice versa.
2. **Build & push images** — one Docker image per deployable service (excluding
   `common-service`, which has no Dockerfile), tagged `:latest` and `:<short-sha>`, pushed
   to GitHub Container Registry (`ghcr.io`) — used by *both* pipelines so images always land
   in one consistent place regardless of which CI system built them.
3. **Deploy** — `docker compose up -d --build` runs directly on the CI runner/agent as a
   self-contained deployment demo (there's no external production server target configured
   for this learning project — wiring one in is a natural next exercise, see
   [docs/07](07-adding-new-microservice.md) for the same "extend the pipeline" pattern
   applied to a new service).
4. **Smoke test** — waits for Eureka's health endpoint, then calls the gateway's health
   endpoint and a real `auth-service` register call through the gateway.
5. **Tear down** — `docker compose down -v` so the runner doesn't accumulate state between
   builds.

## One-time setup

- **GitHub Actions**: nothing to configure — it uses the automatically-provided
  `GITHUB_TOKEN` (with `packages: write` permission) to push to `ghcr.io`.
- **Azure DevOps**: define these pipeline variables (mark `GHCR_TOKEN` as **secret**):

  | Variable | Value |
  |---|---|
  | `GHCR_USERNAME` | a GitHub username |
  | `GHCR_TOKEN` | a GitHub Personal Access Token with `write:packages` scope |
  | `IMAGE_OWNER` | e.g. `your-github-username/central-parent` |

## Deploying a fresh environment (e.g. a new VM/server)

1. Install Docker + Compose v2 on the target machine.
2. Copy (or `git clone`) the repo, or just `docker-compose.yml` plus a `.env` with the
   image tags if you're pulling pre-built images instead of building locally.
3. `docker compose pull && docker compose up -d` (if using pre-built `ghcr.io` images) or
   `docker compose up -d --build` (build from source on that machine).
4. Confirm `http://<host>:8761` shows all 5 business/infra services `UP`, then
   `http://<host>:3000` for the frontend.

## Next

Continue to [6. Git Workflow](06-git-workflow.md) for how changes actually reach `main`
and get deployed by the pipeline described above.
