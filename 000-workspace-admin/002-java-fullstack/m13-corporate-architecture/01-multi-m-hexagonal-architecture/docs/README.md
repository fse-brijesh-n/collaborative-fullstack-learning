# Documentation Index

Welcome! This folder is the learning guide for the `central-parent` project. Read the
docs in order if you're new, or jump straight to the topic you need.

| # | Document | What you'll learn |
|---|----------|--------------------|
| 1 | [Parent-Child (Maven Multi-Module) Architecture](01-parent-child-architecture.md) | How the root POM shares config with all services and enables a single-command build |
| 2 | [Hexagonal Architecture (Ports & Adapters)](02-hexagonal-architecture.md) | How each microservice is internally layered, and why |
| 3 | [Project Structure Reference](03-project-structure.md) | A map of every module, package, and file in the repo |
| 4 | [Getting Started](04-getting-started.md) | Prerequisites, cloning, first build, running locally |
| 5 | [Deployment (Docker Compose & CI/CD)](05-deployment.md) | Running the full stack in containers, and the automated pipelines |
| 6 | [Git Workflow](06-git-workflow.md) | Feature branches → PR → review → merge → test → UAT → deploy |
| 7 | [Adding a New Microservice](07-adding-new-microservice.md) | Step-by-step: scaffold a new hexagonal service and wire it into the parent build |
| 8 | [Adding a New Feature to an Existing Service](08-adding-new-feature.md) | Step-by-step: add a use case end-to-end (domain → application → adapters) |
| 9 | [Troubleshooting](09-troubleshooting.md) | Common problems and fixes (real bugs hit while building this project) |
| 10 | [Authentication and Tokens](10-authentication-and-tokens.md) | How JWT issuing/validation works across all services |
| 11 | [Database Migrations](11-database-migrations.md) | Flyway workflow: adding/evolving schema safely as a team |
| 12 | [Frontend](12-frontend.md) | Running/extending the browser UI, and how CORS is configured |

Two convenience aliases also exist at the repo/docs root for developers who search for
these exact filenames: [`developer-guide.md`](developer-guide.md) (→ docs 1-4, 6-8) and
[`deploy.md`](deploy.md) (→ doc 5).

## Suggested reading path

- **First time on the project?** Read 1 → 2 → 3 → 4, then run the app locally.
- **About to deploy or set up CI/CD?** Read 5.
- **About to contribute a change?** Read 6, then 7 or 8 depending on whether you're adding
  a whole new service or a feature inside an existing one.
- **Working with authentication, schema changes, or the frontend?** Read 10, 11, 12
  respectively.
- **Something broke?** Check 9 first.
