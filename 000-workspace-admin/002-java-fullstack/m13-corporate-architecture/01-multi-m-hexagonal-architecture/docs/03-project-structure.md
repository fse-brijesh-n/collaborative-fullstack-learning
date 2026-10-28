# 3. Project Structure Reference

A map of every module and the files inside it. Use this as a lookup table — "where does
X live?" — rather than reading top-to-bottom.

## Repository root

```
central-parent/
├── pom.xml                       ← parent POM (see docs/01)
├── docker-compose.yml            ← runs all 7 containers (6 services + frontend)
├── ci-pipeline.properties        ← chooses github-actions | azure-devops (see docs/05)
├── azure-pipelines.yml           ← Azure DevOps pipeline definition
├── .github/workflows/ci-cd.yml   ← GitHub Actions pipeline definition
├── .dockerignore
├── README.md                     ← top-level quick start
├── docs/                         ← you are here
│   ├── README.md                 ← docs index
│   └── 01..12-*.md
├── common-service/               ← shared library, not deployed
├── eureka-server/                ← service discovery
├── api-gateway/                  ← single entry point
├── auth-service/                 ← business service
├── batch-processing-service/     ← business service
├── document-service/             ← business service
├── logging-service/              ← business service
└── frontend/                     ← static browser UI (see docs/12)
```

## `common-service` (shared library, `packaging=jar`, no Dockerfile)

```
src/main/java/com/example/common/
├── dto/
│   ├── ApiResponse.java          ← { success, message, data, timestamp } envelope
│   └── ErrorResponse.java        ← { success=false, message, status, timestamp }
├── exception/
│   ├── BusinessException.java
│   └── ResourceNotFoundException.java
└── security/
    ├── JwtUtil.java              ← generate/parse/validate JWTs (HS256)
    └── JwtAuthenticationFilter.java  ← Spring Security filter, reusable by every service
src/test/java/com/example/common/security/
├── JwtUtilTest.java
└── JwtAuthenticationFilterTest.java
```

## `eureka-server` (infra service, port 8761)

```
src/main/java/com/example/eureka/
└── EurekaServerApplication.java  ← @EnableEurekaServer
src/main/resources/application.yml
src/test/java/.../EurekaServerApplicationTests.java
Dockerfile
```

## `api-gateway` (infra service, port 8080)

```
src/main/java/com/example/gateway/
├── ApiGatewayApplication.java
└── config/
    └── CorsConfig.java           ← explicit CorsWebFilter bean (see docs/09, docs/12)
src/main/resources/application.yml  ← 4 StripPrefix routes: /auth/**, /batch/**, /documents/**, /logs/**
src/test/java/.../ApiGatewayApplicationTests.java
Dockerfile
```

## Business services (`auth-service`, `batch-processing-service`, `document-service`, `logging-service`)

All four follow the identical hexagonal package layout described in
[docs/02](02-hexagonal-architecture.md):

```
src/main/java/com/example/<service>/
├── <Service>Application.java
├── domain/
│   ├── model/
│   └── port/{in,out}/
├── application/service/
├── adapter/
│   ├── in/web/ (+ in/scheduler for batch-processing-service)
│   └── out/persistence/
└── config/
src/main/resources/
├── application.yml               ← ddl-auto: validate, flyway.enabled: true (see docs/11)
└── db/migration/
    ├── V1__create_*_table.sql
    └── V2__add_index_*.sql
src/test/java/com/example/<service>/
├── application/service/*ServiceTest.java   ← unit tests, Mockito, no Spring context
└── <Service>ApplicationTests.java          ← integration test, full Spring context + MockMvc
Dockerfile
```

| Service | Port | Owns table(s) | Key endpoints (behind gateway) |
|---|---|---|---|
| `auth-service` | 8081 | `users` | `POST /auth/api/auth/register`, `POST /auth/api/auth/login` |
| `batch-processing-service` | 8082 | `job_runs` | `POST /batch/api/batch/jobs/{name}/trigger`, `GET /batch/api/batch/jobs` |
| `document-service` | 8083 | `documents` | `POST /documents/api/documents`, `GET /documents/api/documents`, `GET /documents/api/documents/{id}` |
| `logging-service` | 8084 | `log_entries` | `POST /logs/api/logs`, `GET /logs/api/logs` |

## `frontend/` (static UI, not part of the Maven reactor)

```
frontend/
├── index.html      ← tabbed UI: Auth / Batch Jobs / Documents / Logs
├── style.css        ← dark theme
├── app.js            ← fetch wrapper + JWT bearer token handling + all tab logic
└── Dockerfile        ← nginx:1.27-alpine, serves the 3 files on port 80
```

## Next

Continue to [4. Getting Started](04-getting-started.md) to actually build and run the
project.
