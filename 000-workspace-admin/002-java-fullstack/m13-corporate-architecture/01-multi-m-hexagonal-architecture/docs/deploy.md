# Deploy

This file is a convenience entry point for developers specifically searching for a
"deploy" guide. The full content lives in
[05-deployment.md](05-deployment.md) — read that file for the complete details on Docker
Compose and the dual CI/CD pipelines. Below is a fast-reference summary.

## Deploy everything locally with Docker Compose

```powershell
docker compose up --build   # build images + start all 7 containers
docker compose ps            # check status
docker compose down           # stop and remove everything
```

Services: `eureka-server` (8761), `api-gateway` (8080), `auth-service` (8081),
`batch-processing-service` (8082), `document-service` (8083), `logging-service` (8084),
`frontend` (3000).

## Single-click CI/CD deploy

Two pipelines exist side by side; only one is "active" at a time, selected by
[`ci-pipeline.properties`](../ci-pipeline.properties):

```properties
ci.pipeline=github-actions   # or: azure-devops
```

| Pipeline | File | Trigger |
|---|---|---|
| GitHub Actions | [`.github/workflows/ci-cd.yml`](../.github/workflows/ci-cd.yml) | Push to `main`, or the "Run workflow" button (Actions tab) |
| Azure DevOps | [`azure-pipelines.yml`](../azure-pipelines.yml) | Push to `main`, or "Run pipeline" button |

Both do the same thing: `mvn -B clean install` (build + test) → build & push Docker images
to `ghcr.io` → `docker compose up -d --build` on the runner → smoke test → tear down.

## Full details

See [05-deployment.md](05-deployment.md) for:
- Complete service/port table
- Environment variables (shared `JWT_SECRET`, `EUREKA_URI`)
- Step-by-step pipeline breakdown
- One-time setup required for Azure DevOps (`GHCR_USERNAME`, `GHCR_TOKEN`, `IMAGE_OWNER`)
- How to deploy to a fresh server/VM
