# 1. Parent-Child (Maven Multi-Module) Architecture

## What "parent-child" means here

This repository is a single **Maven reactor**: one root `pom.xml` (the *parent*, artifact
`central-parent`, `packaging=pom`) declares a list of *child* modules. Maven builds them
together, in dependency order, from one command.

```
central-parent/                 <- parent POM (packaging = pom, no source code of its own)
├── pom.xml
├── common-service/              <- child module (shared library)
├── eureka-server/               <- child module (deployable service)
├── api-gateway/                 <- child module (deployable service)
├── auth-service/                <- child module (deployable service)
├── batch-processing-service/    <- child module (deployable service)
├── document-service/            <- child module (deployable service)
└── logging-service/             <- child module (deployable service)
```

Each child's `pom.xml` declares:

```xml
<parent>
    <groupId>com.example</groupId>
    <artifactId>central-parent</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</parent>
```

That single line is what makes it a "child" — it inherits everything the parent defines.

## What the parent POM centralizes

Open the root [`pom.xml`](../pom.xml) and you'll find:

1. **`<properties>`** — one place to pin `java.version`, `spring-boot.version`,
   `spring-cloud.version`, `jjwt.version`. Bump a version here once, every child picks it up.
2. **`<dependencyManagement>`** — imports the Spring Boot and Spring Cloud BOMs
   (Bills of Materials) so child modules can declare a dependency like
   `spring-boot-starter-web` **without specifying a version** — the parent's BOM resolves it.
   It also pins the internal `common-service` version and the `jjwt-*` versions.
3. **`<build><pluginManagement>`** — configures the `spring-boot-maven-plugin` (repackages
   each service into a runnable "fat jar") and `maven-compiler-plugin` (Java release
   version) once, for every child to reuse.
4. **`<modules>`** — the list of child modules included in the reactor build.

## Why this matters (benefits you get for free)

- **One version bump, everywhere.** Change `spring-boot.version` in one file, every one of
  the 6 services rebuilds against the new version.
- **No dependency-version drift.** Because children never specify versions for
  Spring-managed dependencies, you can't accidentally end up with `auth-service` on Boot
  3.2.5 and `document-service` on 3.1.0.
- **Single-command build.** `mvn clean install` run from the repository root builds
  `common-service` first (nothing depends on it), then every other module that declares
  `common-service` as a dependency — Maven's reactor works out the correct order
  automatically from the `<dependency>` graph, you don't have to list modules in build order.
- **Consistent packaging.** Every deployable service's `pom.xml` looks almost identical
  (same plugin, same `<finalName>` pattern) because the mechanics live in the parent.

## How a child module looks

Example — `auth-service/pom.xml` (abridged):

```xml
<parent>
    <groupId>com.example</groupId>
    <artifactId>central-parent</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</parent>

<artifactId>auth-service</artifactId>
<packaging>jar</packaging>

<dependencies>
    <dependency>
        <groupId>com.example</groupId>
        <artifactId>common-service</artifactId>   <!-- no version needed -->
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>  <!-- no version needed -->
    </dependency>
    ...
</dependencies>

<build>
    <finalName>auth-service</finalName>
    <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>  <!-- version inherited -->
        </plugin>
    </plugins>
</build>
```

## `common-service`: the one child that isn't deployed

`common-service` is a normal Maven child module (`packaging=jar`), but unlike the other
six, it:

- Has **no** `spring-boot-maven-plugin` execution (it's a plain library JAR, not a runnable
  Spring Boot app — no `main()` method).
- Has **no Dockerfile** and is **not** listed in `docker-compose.yml`.
- Is consumed as a regular `<dependency>` by the four business services (see
  `auth-service`, `batch-processing-service`, `document-service`, `logging-service` POMs).

It holds shared, framework-light code: `ApiResponse`/`ErrorResponse` DTOs,
`BusinessException`/`ResourceNotFoundException`, and `JwtUtil`. Anything genuinely shared
across services belongs here — see
[Adding a New Microservice](07-adding-new-microservice.md) for guidance on what should and
shouldn't go into `common-service`.

## Building

```powershell
mvn clean install
```

Maven's reactor resolves module order from the dependency graph, so you never need to
list modules "in build order" in `<modules>` — although for readability this repo's
`<modules>` list still roughly follows the natural order (library → infra → business
services).

To build/test only one module and its dependencies (useful while iterating):

```powershell
mvn -pl auth-service -am clean install
```

`-pl auth-service` selects that module; `-am` ("also make") builds its dependencies
(`common-service`) first.

## Next

Continue to [2. Hexagonal Architecture](02-hexagonal-architecture.md) to see how each
business service is structured *inside*.
