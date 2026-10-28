# Complete React & Backend Development Handbook  
**Detailed Table of Contents with Subfolder Projects**

## 🔀 Engineering Workflow & Git Collaboration (Company-Grade)

> Every module's project MUST follow this professional workflow.

### 1. Repository Setup (Fork & Clone)

| Step | Command | Purpose |
|------|---------|---------|
| Fork | GitHub UI → "Fork" | Create personal copy |
| Clone | `git clone git@github.com:<you>/fullstack-roadmap.git` | Copy to local |
| Add upstream | `git remote add upstream git@github.com:org/fullstack-roadmap.git` | Track original |
| Verify | `git remote -v` | Confirm remotes |
| Sync main | `git fetch upstream && git checkout main && git merge upstream/main` | Stay updated |

### 2. Branch Strategy

| Branch | Naming Convention | Purpose |
|--------|------------------|---------|
| `main` | `main` | Production-ready, protected |
| `develop` | `develop` | Integration branch |
| Feature | `feature/JIRA-123-user-auth` | New features |
| Bugfix | `bugfix/JIRA-456-login-error` | Non-critical fixes |
| Hotfix | `hotfix/JIRA-789-prod-down` | Critical production |
| Release | `release/v1.2.0` | Release preparation |
| Chore | `chore/update-deps` | Maintenance |
| Docs | `docs/api-readme` | Documentation |
| Refactor | `refactor/service-layer` | Code cleanup |
| Design | `design/figma-login-flow` | Design assets |

### 3. Commit Conventions (Conventional Commits)

| Type | Description | Example |
|------|-------------|---------|
| `feat` | New feature | `feat(auth): add JWT refresh token` |
| `fix` | Bug fix | `fix(cart): resolve null pointer` |
| `docs` | Documentation | `docs(readme): update setup steps` |
| `style` | Formatting | `style: apply prettier` |
| `refactor` | Code refactor | `refactor(user): extract mapper` |
| `perf` | Performance | `perf(query): add index hint` |
| `test` | Tests | `test(auth): add login tests` |
| `build` | Build system | `build: bump spring boot to 3.3` |
| `ci` | CI config | `ci: add sonar step` |
| `chore` | Maintenance | `chore: update .gitignore` |
| `revert` | Revert commit | `revert: feat(auth) ...` |
| `design` | Design assets | `design: add login wireframes` |

### 4. Code Review & Approval

| Step | Actor | Action |
|------|-------|--------|
| 1 | Author | Open PR, assign reviewers |
| 2 | CI | Run build, tests, lint, security scan |
| 3 | Reviewer | Review code, comment, request changes |
| 4 | Designer | Review UI/UX (if applicable) |
| 5 | Author | Address feedback, push fixes |
| 6 | Reviewer | Approve |
| 7 | Maintainer | Merge |

### 5. Review Rules

| Rule | `main` | `develop` |
|------|--------|-----------|
| Require PR | ✅ | ✅ |
| Required approvals | 2 | 1 |
| Design approval | ✅ (UI) | ✅ (UI) |
| Dismiss stale approvals | ✅ | ✅ |
| Require status checks | ✅ | ✅ |
| Require conversation resolution | ✅ | ✅ |
| Require signed commits | ✅ | ❌ |
| Require linear history | ✅ | ✅ |

### 6. Merge Strategies

| Strategy | When to Use | Command |
|----------|-------------|---------|
| Squash & Merge | Feature branches (default) | `gh pr merge --squash` |
| Rebase & Merge | Linear history preferred | `gh pr merge --rebase` |
| Merge Commit | Preserve history | `gh pr merge --merge` |

### 7. Release & Versioning (SemVer)

| Version | Meaning | Example |
|---------|---------|---------|
| MAJOR | Breaking change | `1.0.0 → 2.0.0` |
| MINOR | New feature | `1.0.0 → 1.1.0` |
| PATCH | Bug fix | `1.0.0 → 1.0.1` |

---
# Backend : Express.js
---

## 📚 Module 1 — Node.js

| Sub-Module | Topics |
|------------|--------|
| 01-01 Fundamentals | Architecture, V8, Event Loop, Non-Blocking I/O, npm, package.json |
| 01-02 Core Modules | fs, path, os, http, https, events, stream, crypto, buffer, worker_threads, child_process |
| 01-03 Async | Callbacks, Promises, async/await, EventEmitter, Streams (Readable/Writable/Transform) |
| 01-04 APIs | File System, HTTP Server, Env Vars, Process, Clustering, Signal Handling |
| 01-05 Performance | Profiling, Diagnostics, Memory Leaks, perf_hooks |

**Project:** CLI Tool & HTTP Server

---
## 📚 Module 2 — MongoDB

| Sub-Module | Topics |
|------------|--------|
| 02-01 Fundamentals | NoSQL, Documents, Collections, BSON, Shell, CRUD |
| 02-02 Querying | Operators, Projection, Sort, Pagination, Aggregation, Map-Reduce |
| 02-03 Modeling | Embedded vs Referenced, Patterns, Relationships, Denormalization |
| 02-04 Indexing | Types, Compound, Text, Geospatial, TTL, Explain |
| 02-05 Mongoose | Schemas, Models, Validation, Middleware, Population, Virtuals |
| 02-06 Advanced | ACID Transactions, Replica Sets, Sharding, Change Streams, Time Series |

**Project:** E-Commerce Backend (Node + MongoDB)
---

## 📚 Module 3 — Express.js

> **3.1 → 3.9** are major phases.  
> Each `03-xx` is a sub-module and can be built as a mini-project.  
> Order follows dependency: each step depends on the previous one.  
> Dependency IDs use phase-prefixed form: `3.1-03-01` = Module 3.1 / Sub-module 03-01.

---

### 📚 Module 3.1 Fundamentals & Setup

| Sub-Module | Topics |
|------------|--------|
| 03-01 Setup | Setup → **Mini-project:** Hello Express API. Depends: Node/HTTP. |
| 03-02 Routing | Routing → **Mini-project:** Route playground. Depends: 3.1-03-01. |
| 03-03 Middleware | Middleware → **Mini-project:** Logger + request ID. Depends: 3.1-03-02. |
| 03-04 Error Handling | Error Handling → **Mini-project:** 404/500 JSON handler. Depends: 3.1-03-03. |
| 03-05 Template Engines | Template Engines → **Mini-project:** EJS/Handlebars page. Depends: 3.1-03-04. |
| 03-06 Express Setup | Express server, routes, middleware, basic API → **Mini-project:** Basic Express server + health route. Depends: 3.1-03-01–3.1-03-05. |

---

### 📚 Module 3.2 REST API Design

| Sub-Module | Topics |
|------------|--------|
| 03-01 REST Methods | Methods → **Mini-project:** Method explorer. Depends: 3.1-03-06. |
| 03-02 Status Codes | Status Codes → **Mini-project:** Status code simulator. Depends: 3.2-03-01. |
| 03-03 Content Negotiation | Content Negotiation → **Mini-project:** JSON/XML response. Depends: 3.2-03-02. |
| 03-04 API Versioning | API Versioning → **Mini-project:** `/api/v1` vs `/api/v2`. Depends: 3.2-03-03. |

---

### 📚 Module 3.3 CRUD API

| Sub-Module | Topics |
|------------|--------|
| 03-01 CRUD — Create | Create → **Mini-project:** POST endpoint. Depends: 3.2-03-01–3.2-03-04. |
| 03-02 CRUD — Read | Read → **Mini-project:** GET list + GET by ID. Depends: 3.3-03-01. |
| 03-03 CRUD — Update | Update → **Mini-project:** PUT/PATCH. Depends: 3.3-03-02. |
| 03-04 CRUD — Delete | Delete → **Mini-project:** DELETE + 204. Depends: 3.3-03-03. |
| 03-05 CRUD — Params/Body | Params/Body → **Mini-project:** Postman/Thunder tests. Depends: 3.3-03-04. |

---

### 📚 Module 3.4 Validation & Error Handling

| Sub-Module | Topics |
|------------|--------|
| 03-01 Input Validation | Input Validation → **Mini-project:** Joi/Zod/express-validator schema. Depends: 3.3-03-05. |
| 03-02 DTOs | DTOs → **Mini-project:** Request/response shaping. Depends: 3.4-03-01. |
| 03-03 Sanitization | Sanitization → **Mini-project:** Clean user input. Depends: 3.4-03-02. |
| 03-04 Central Error Middleware | Central Error Middleware → **Mini-project:** Unified error format. Depends: 3.4-03-03. |
| 03-05 Async Errors | Async Errors → **Mini-project:** Async wrapper. Depends: 3.4-03-04. |

---

### 📚 Module 3.5 MongoDB & Mongoose

| Sub-Module | Topics |
|------------|--------|
| 03-01 MongoDB Connection | Connection → **Mini-project:** MongoDB Atlas/local connect. Depends: 3.4-03-05. |
| 03-02 Mongoose Schema | Schema → **Mini-project:** User/Note schema. Depends: 3.5-03-01. |
| 03-03 Mongoose Models | Models → **Mini-project:** Mongoose model CRUD. Depends: 3.5-03-02. |
| 03-04 Relationships | Relationships → **Mini-project:** Populate author/comments. Depends: 3.5-03-03. |
| 03-05 Indexes | Indexes → **Mini-project:** Search/filter optimization. Depends: 3.5-03-04. |

---

### 📚 Module 3.6 Architecture

| Sub-Module | Topics |
|------------|--------|
| 03-01 MVC | MVC → **Mini-project:** Split routes/controllers/views. Depends: 3.5-03-01–3.5-03-05. |
| 03-02 Architecture Layers | Routes → Controllers → Services → Repositories → **Mini-project:** Layered refactor. Depends: 3.6-03-01. |
| 03-03 Validation Layer | DTOs + Validation Layer → **Mini-project:** Schema + service validation. Depends: 3.6-03-02. |

---

### 📚 Module 3.7 Security & Auth

| Sub-Module | Topics |
|------------|--------|
| 03-01 User Model | User Model → **Mini-project:** Register/login schema. Depends: 3.6-03-03. |
| 03-02 bcrypt | bcrypt → **Mini-project:** Password hashing. Depends: 3.7-03-01. |
| 03-03 JWT | JWT → **Mini-project:** Access/refresh tokens. Depends: 3.7-03-02. |
| 03-04 Protected Routes | Protected Routes → **Mini-project:** Auth middleware. Depends: 3.7-03-03. |
| 03-05 Roles | Roles → **Mini-project:** Admin/user guard. Depends: 3.7-03-04. |
| 03-06 CORS | CORS → **Mini-project:** Cross-origin config. Depends: 3.7-03-05. |
| 03-07 Helmet | Helmet → **Mini-project:** Security headers. Depends: 3.7-03-06. |
| 03-08 Rate Limiting | Rate Limiting → **Mini-project:** Brute-force protection. Depends: 3.7-03-07. |
| 03-09 OAuth2 | OAuth2 → **Mini-project:** Optional provider login. Depends: 3.7-03-08. |

---

### 📚 Module 3.8 File Upload

| Sub-Module | Topics |
|------------|--------|
| 03-01 Multer | Multer → **Mini-project:** Single/multiple upload. Depends: 3.7-03-01–3.7-03-09. |
| 03-02 Storage | Storage → **Mini-project:** Disk vs memory. Depends: 3.8-03-01. |
| 03-03 File Validation | File Validation → **Mini-project:** Type/size limits. Depends: 3.8-03-02. |
| 03-04 Static Serving | Static Serving → **Mini-project:** Serve uploaded files. Depends: 3.8-03-03. |
| 03-05 Cloud Storage | Cloud Storage → **Mini-project:** Cloudinary/S3 optional. Depends: 3.8-03-04. |

---

### 📚 Module 3.9 Advanced Express

| Sub-Module | Topics |
|------------|--------|
| 03-01 Nodemailer | Nodemailer → **Mini-project:** Welcome/reset email. Depends: 3.8-03-01–3.8-03-05. |
| 03-02 Socket.io | Socket.io → **Mini-project:** Live notifications. Depends: 3.9-03-01. |
| 03-03 Cron | Cron → **Mini-project:** Scheduled cleanup. Depends: 3.9-03-02. |
| 03-04 Winston/Pino | Winston/Pino → **Mini-project:** Structured logging. Depends: 3.9-03-03. |
| 03-05 Swagger | Swagger/OpenAPI → **Mini-project:** API docs. Depends: 3.9-03-04. |

---

## 📚 Module 4 Deployment Fullstack

| Sub-Module | Topics |
|------------|--------|
| 04-01 Env Vars | Env Vars → **Mini-project:** Secrets/config. Depends: 3.9-03-01–3.9-03-05. |
| 04-02 Backend Deploy | Backend Deploy → **Mini-project:** Render/Railway. Depends: 04-01. |
| 04-03 Frontend Deploy | Frontend Deploy → **Mini-project:** Vercel/Netlify. Depends: 04-02. |
| 04-04 MongoDB Atlas | MongoDB Atlas → **Mini-project:** Production DB. Depends: 04-03. |
| 04-05 CORS/Cookies | CORS/Cookies → **Mini-project:** Production auth config. Depends: 04-04. |
| 04-06 CI/CD | CI/CD → **Mini-project:** Auto deploy. Depends: 04-05. |
| 04-07 Monitoring | Monitoring → **Mini-project:** Logs/health checks. Depends: 04-06. |

---

**Capstone**

| Sub-Module | Topics |
|------------|--------|
| Capstone | **Project:** Production REST API with Auth — CRUD + MongoDB + JWT + validation + uploads + Swagger + deployment. Depends: All Module 3 + Module 4. |

**Project:** Production REST API with Auth

---

## Module Projects  
*(Each is a larger, full-featured React Vite project integrating all previous concepts.)*

| Subfolder | Description |
|-----------|-------------|
| `01-ecommerce-app` | Product listing, cart, checkout, auth, API integration. |
| `02-social-media-dashboard` | User feed, posts, likes, comments, profiles. |
| `03-task-management-app` | Kanban board, drag-and-drop, CRUD. |
| `04-chat-application` | Real-time chat, WebSockets, rooms. |
| `05-blog-platform` | Blog posts, Markdown, comments, admin panel. |
| `06-portfolio-website` | Portfolio with animations, contact form. |
| `07-admin-dashboard` | Data visualization, charts, tables. |
| `08-video-streaming-app` | Video list, player, comments (YouTube clone). |
| `09-food-delivery-app` | Menu, cart, order tracking. |
| `10-real-estate-listing` | Listings, maps, filters. |

---

## Final Cheat Sheet  
| Subfolder | Description |
|-----------|-------------|
| `cheat-sheet` | A React Vite app that displays a comprehensive cheat sheet of React concepts, hooks, patterns, and common snippets. |

---

## Final Interview Revision  
| Subfolder | Description |
|-----------|-------------|
| `interview-revision` | A React Vite app with flashcards, key concepts, and interview questions for quick revision. |

---

This structure ensures **no topic is missed** and provides a hands-on project for every concept, building from zero to full-stack proficiency.
---

---
```
Designed by
Mr.Brijesh Nishad (Full Stack Engineer)
```
