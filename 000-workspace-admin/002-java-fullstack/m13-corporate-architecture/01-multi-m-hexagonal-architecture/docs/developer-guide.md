# Developer Guide

This file is a convenience entry point for developers specifically searching for a
"developer guide" — all the actual content lives in the numbered docs below, organized by
topic so each concern has its own focused, maintainable file.

## Quick links

| Topic | Doc |
|---|---|
| How the Maven parent-child build works | [01-parent-child-architecture.md](01-parent-child-architecture.md) |
| How each service is structured internally (Hexagonal / Ports & Adapters) | [02-hexagonal-architecture.md](02-hexagonal-architecture.md) |
| Full map of every module/file in the repo | [03-project-structure.md](03-project-structure.md) |
| Clone, build, and run everything locally | [04-getting-started.md](04-getting-started.md) |
| Feature branches, PRs, review, merge | [06-git-workflow.md](06-git-workflow.md) |
| Scaffold a brand-new microservice | [07-adding-new-microservice.md](07-adding-new-microservice.md) |
| Add a feature to an existing service | [08-adding-new-feature.md](08-adding-new-feature.md) |
| Common problems and fixes | [09-troubleshooting.md](09-troubleshooting.md) |
| JWT auth flow across services | [10-authentication-and-tokens.md](10-authentication-and-tokens.md) |
| Flyway schema migration workflow | [11-database-migrations.md](11-database-migrations.md) |
| Browser frontend, CORS | [12-frontend.md](12-frontend.md) |

## TL;DR — first day on the project

```powershell
git clone <your-fork-url>
cd central-parent
mvn clean install                      # builds + tests everything, single command
```

Then start the 6 backend services (see [04-getting-started.md](04-getting-started.md) for
the exact commands) and open the frontend at http://localhost:3000, or run
`docker compose up --build` to run the entire stack (backend + frontend) in containers —
see [deploy.md](deploy.md) for deployment specifics.

For deployment/CI-CD specifically, see [deploy.md](deploy.md) (alias of
[05-deployment.md](05-deployment.md)).
