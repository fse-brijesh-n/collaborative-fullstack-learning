# 6. Git Workflow

This project uses a standard **feature-branch + pull request** workflow, ending in an
automated build/test/deploy triggered from `main` (see [docs/05](05-deployment.md)). This
doc walks through the full lifecycle of a change, from idea to production, including where
"UAT" fits in for a project that doesn't have a separate UAT server yet.

## Branch naming

| Prefix | Use for |
|---|---|
| `feature/<short-description>` | New functionality (new endpoint, new service, new UI tab) |
| `fix/<short-description>` | Bug fixes |
| `chore/<short-description>` | Tooling, CI, docs, dependency bumps |
| `hotfix/<short-description>` | Urgent production fix branched directly from `main` |

Examples: `feature/document-versioning`, `fix/jwt-expiry-off-by-one`,
`chore/upgrade-spring-boot-3.3`.

## Step-by-step lifecycle

### 1. Create a feature branch

```powershell
git checkout main
git pull origin main
git checkout -b feature/add-document-tags
```

### 2. Develop, following the architecture

- New business logic → `domain/` + `application/service/` (see [docs/02](02-hexagonal-architecture.md)).
- New endpoint → `adapter/in/web/`.
- New table/column → a **new** Flyway migration file, never edit an existing one (see
  [docs/11](11-database-migrations.md)).
- New frontend behavior → `frontend/app.js` (+ a new tab in `index.html` if needed, see
  [docs/12](12-frontend.md)).

### 3. Add/update tests locally

Every module has both unit tests (mocked ports, no Spring context) and one Spring Boot
integration test. Add tests for new behavior in the same style as the existing
`*ServiceTest.java` / `*ApplicationTests.java` files. Run the full suite before pushing:

```powershell
mvn clean install
```

This is exactly what CI will run — if it's red locally, it will be red in CI.

### 4. Commit and push

Use clear, imperative commit messages (`Add tag field to Document entity and endpoint`,
not `fix stuff`). Push the branch:

```powershell
git add .
git commit -m "Add tag field to Document entity and endpoint"
git push origin feature/add-document-tags
```

### 5. Open a Pull Request

Open a PR from `feature/add-document-tags` into `main`. In the PR description, note:

- What changed and why.
- Any new/changed Flyway migration files (call these out explicitly — they need extra
  reviewer attention since they touch shared schema state).
- Any new environment variables or config.

### 6. CI runs automatically on the PR

Both pipeline definitions are present, but only the one selected in
[`ci-pipeline.properties`](../ci-pipeline.properties) does real work (see
[docs/05](05-deployment.md)). Configure your CI platform to run the build/test job (step 1
of the pipeline — `mvn -B clean install`) as a **required check** on pull requests, so a PR
cannot be merged with a failing build or failing tests.

### 7. Code review

At least one other developer reviews the diff. Focus review attention on:

- Does new business logic live in `domain`/`application`, not leaking into a controller or
  JPA entity? (see [docs/02](02-hexagonal-architecture.md))
- Are Flyway migrations additive/backward-compatible, and is a new `Vn` file used instead of
  editing an old one?
- Do new endpoints have both unit and integration test coverage?

### 8. Merge to `main`

Use "squash and merge" (recommended for a learning repo — keeps `main`'s history one commit
per feature) or "merge commit", whichever your team standardizes on. Merging to `main`
triggers the full pipeline: build → test → image push → deploy → smoke test (see
[docs/05](05-deployment.md)).

### 9. "Test" and "UAT" stages

This learning project's pipeline deploys straight to a single self-contained Docker Compose
environment on the CI runner (there's no separate long-lived Test/UAT/Prod infrastructure
configured). In a real multi-environment setup, you would extend the pipeline
(`azure-pipelines.yml` / `ci-cd.yml`) with **environment-gated stages**, for example:

```
build-test  →  deploy-to-test  →  (automated/manual smoke tests)  →  deploy-to-uat
            →  (manual approval gate)  →  deploy-to-prod
```

Both GitHub Actions (`environment:` + required reviewers) and Azure DevOps
(`environment:` resource + approval checks) support this natively — it's a matter of adding
more jobs/stages that reuse the same Docker images already built once in step 1, and
pointing `docker compose` (or `kubectl`/Helm, if you outgrow Compose) at a different
target host/cluster per stage. This is a good exercise once you're comfortable with the
current single-stage pipeline — see [docs/07](07-adding-new-microservice.md) for the same
"extend the pipeline" mechanics applied when adding a new service.

### 10. Deploy

For this project, "deploy" = the pipeline's own `docker compose up -d --build` step running
against whichever host the CI runner/agent is on. For a persistent deployment, point that
same command (or a `docker compose pull && docker compose up -d` using the
already-pushed `ghcr.io` images) at your target server — see [docs/05](05-deployment.md)
"Deploying a fresh environment".

## Hotfixes

For an urgent production bug, branch directly from `main` (`hotfix/...`), fix, open a PR
back into `main`, and let the same pipeline run — there's no separate hotfix pipeline in
this project; the standard one is fast enough (`mvn -B clean install` + image build +
smoke test) to serve as the hotfix path too.

## Next

Continue to [7. Adding a New Microservice](07-adding-new-microservice.md) or
[8. Adding a New Feature](08-adding-new-feature.md) depending on the scope of your change.
