# 2. Hexagonal Architecture (Ports & Adapters)

## The core idea

Hexagonal Architecture (a.k.a. "Ports & Adapters", coined by Alistair Cockburn) puts your
**business logic (the domain) at the center**, completely isolated from frameworks,
databases, and web technology. Everything outside the domain talks to it only through
well-defined interfaces called **ports**. Framework-specific code that implements or calls
those ports is called an **adapter**.

```
                       ┌─────────────────────────────┐
        inbound        │                              │        outbound
   (driving) adapters   │            DOMAIN            │   (driven) adapters
                       │      (framework-free core)   │
  ┌────────────┐        │                              │        ┌────────────────┐
  │ REST        │──────▶│  port/in   ───▶  Use Cases    │───────▶│ JPA Repository  │
  │ Controller  │        │  (interfaces)  (application) │  port/out              │
  └────────────┘        │                              │        └────────────────┘
                       └─────────────────────────────┘
```

- **Inbound (driving) side**: something *outside* calls *into* the domain to make it do
  work — an HTTP request hitting a `@RestController`, a `@Scheduled` job tick, a message
  consumer. These adapters depend on an **inbound port** (a use-case interface) and call it;
  they never contain business logic themselves.
- **Outbound (driven) side**: the domain needs something from the *outside world* — save a
  row, read a row, call another service. The domain defines an **outbound port** interface
  describing exactly what it needs (e.g. "save this user, find a user by username"), and an
  adapter (JPA repository wrapper, HTTP client, etc.) implements that interface.

The domain **never imports** Spring, JPA, `javax.servlet`, or any web/persistence library.
It only knows plain Java + its own port interfaces. This is what makes the architecture
"hexagonal" — the domain is a shape with many equal sides (ports), and you can plug any
adapter into any port without the domain caring.

## Package layout used in every business service

Every one of `auth-service`, `batch-processing-service`, `document-service`, and
`logging-service` follows this exact structure (example: `auth-service`):

```
com.example.authservice/
├── domain/
│   ├── model/
│   │   └── User.java                       ← plain Java class, no annotations from JPA/Spring
│   └── port/
│       ├── in/
│       │   ├── RegisterUserUseCase.java    ← inbound port (what the outside can ask of us)
│       │   └── LoginUseCase.java
│       └── out/
│           └── UserRepositoryPort.java     ← outbound port (what we need from the outside)
├── application/
│   └── service/
│       ├── RegisterUserService.java        ← implements RegisterUserUseCase
│       └── LoginService.java               ← implements LoginUseCase
├── adapter/
│   ├── in/
│   │   └── web/
│   │       ├── AuthController.java         ← @RestController, calls the *UseCase port
│   │       ├── RegisterRequest.java / LoginRequest.java  ← request DTOs
│   │       └── GlobalExceptionHandler.java
│   └── out/
│       └── persistence/
│           ├── UserJpaEntity.java          ← @Entity, Spring Data JPA row mapping
│           ├── UserJpaRepository.java      ← Spring Data JpaRepository interface
│           └── UserRepositoryAdapter.java  ← implements UserRepositoryPort using the JPA repo
├── config/
│   └── BeanConfig.java                     ← wires ports to implementations, security, etc.
└── AuthServiceApplication.java             ← @SpringBootApplication entry point
```

`batch-processing-service` additionally has an `adapter/in/scheduler` package (a
`@Scheduled` inbound adapter) alongside `adapter/in/web`, showing that a single use case
can be driven by more than one inbound adapter.

## Walking through one real request: `POST /auth/register`

1. **`AuthController`** (`adapter/in/web`) receives the HTTP POST, deserializes the JSON
   body into `RegisterRequest`, and calls `registerUserUseCase.register(...)`.
   The controller depends only on the **`RegisterUserUseCase`** interface (a port), not on
   any concrete class — Spring injects whichever bean implements it.
2. **`RegisterUserService`** (`application/service`) implements `RegisterUserUseCase`. This
   is where the actual business rule lives: check the username isn't taken, hash the
   password, build a `User` domain object, and ask the outbound port to persist it:
   `userRepositoryPort.save(user)`.
3. **`UserRepositoryPort`** (`domain/port/out`) is just an interface:
   `Optional<User> findByUsername(String username); User save(User user);` — the domain
   doesn't know or care that this is backed by JPA/H2.
4. **`UserRepositoryAdapter`** (`adapter/out/persistence`) implements `UserRepositoryPort`.
   It converts the framework-free `User` domain object to/from `UserJpaEntity` (the
   `@Entity` class with JPA annotations) and delegates to `UserJpaRepository`
   (`extends JpaRepository<UserJpaEntity, Long>`).
5. Response flows back up the same chain: adapter → service → controller → HTTP JSON.

Notice the **dependency direction**: `adapter.in.web` depends on `domain.port.in`;
`application.service` depends on `domain.port.in` (implements it) and `domain.port.out`
(calls it); `adapter.out.persistence` depends on `domain.port.out` (implements it) and on
`domain.model`. **`domain` depends on nothing.** This is the Dependency Inversion Principle
applied architecturally — the "inner" layer defines the interfaces, the "outer" layers
implement or consume them, so the domain can be unit-tested with plain Java mocks and no
Spring context at all (see the `*ServiceTest.java` files in every service's `src/test`).

## Why this is worth learning

- **Testability**: `RegisterUserServiceTest` mocks `UserRepositoryPort` with Mockito — no
  database, no Spring context, tests run in milliseconds.
- **Replaceability**: swapping H2 for Postgres means changing `UserRepositoryAdapter` and
  `application.yml` — zero changes to `domain` or `application`. Swapping REST for gRPC
  means adding a new inbound adapter — zero changes to `application` or `domain`.
- **Clear boundaries for code review**: "is this business logic?" → it belongs in
  `domain`/`application`. "Is this a technology detail?" → it belongs in `adapter`.

## Next

Continue to [3. Project Structure Reference](03-project-structure.md) for a full map of
every module and file in the repo.
