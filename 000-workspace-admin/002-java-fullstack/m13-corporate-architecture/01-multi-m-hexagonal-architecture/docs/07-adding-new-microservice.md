# 7. Adding a New Microservice

Walkthrough for scaffolding a brand-new hexagonal business service (e.g. a hypothetical
`notification-service`) and wiring it into the parent build, service discovery, the
gateway, Docker Compose, and CI/CD. Follow this in order — each step depends on the
previous one being in place.

## 1. Create the module folder and POM

```
notification-service/
├── pom.xml
└── src/main/java/com/example/notificationservice/
```

`pom.xml` — copy an existing business service's POM (e.g. `logging-service/pom.xml`) as a
starting point and change the `artifactId`/`finalName`:

```xml
<parent>
    <groupId>com.example</groupId>
    <artifactId>central-parent</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</parent>

<artifactId>notification-service</artifactId>
<packaging>jar</packaging>

<dependencies>
    <dependency>
        <groupId>com.example</groupId>
        <artifactId>common-service</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-security</artifactId>
    </dependency>
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
    </dependency>
    <dependency>
        <groupId>org.flywaydb</groupId>
        <artifactId>flyway-core</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>

<build>
    <finalName>notification-service</finalName>
    <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
        </plugin>
    </plugins>
</build>
```

Notice: **no versions anywhere** — they all come from the parent's
`<dependencyManagement>` (see [docs/01](01-parent-child-architecture.md)). That's the whole
point of the parent-child setup.

## 2. Register the module in the parent POM

Add one line to the root `pom.xml`'s `<modules>` list:

```xml
<modules>
    <module>common-service</module>
    <module>eureka-server</module>
    <module>api-gateway</module>
    <module>auth-service</module>
    <module>batch-processing-service</module>
    <module>document-service</module>
    <module>logging-service</module>
    <module>notification-service</module>   <!-- new -->
</modules>
```

That's it — `mvn clean install` from the root now builds it too.

## 3. Build the hexagonal package structure

Follow [docs/02](02-hexagonal-architecture.md) exactly:

```
com.example.notificationservice/
├── NotificationServiceApplication.java   ← @SpringBootApplication
├── domain/
│   ├── model/Notification.java           ← plain Java, no annotations
│   └── port/
│       ├── in/SendNotificationUseCase.java
│       └── out/NotificationRepositoryPort.java
├── application/service/SendNotificationService.java   ← implements the in-port, calls the out-port
├── adapter/
│   ├── in/web/NotificationController.java             ← @RestController
│   └── out/persistence/
│       ├── NotificationJpaEntity.java
│       ├── NotificationJpaRepository.java
│       └── NotificationRepositoryAdapter.java          ← implements the out-port
└── config/BeanConfig.java
```

## 4. Configuration: `application.yml`

Copy `logging-service/src/main/resources/application.yml` as a template and change:

- `server.port` — pick an unused port (next free one after 8084 → `8085`).
- `spring.application.name: notification-service` — this is the name Eureka and the
  gateway will use to find it.
- `spring.datasource.url: jdbc:h2:mem:notificationdb` — a unique in-memory DB name.
- Keep `spring.jpa.hibernate.ddl-auto: validate` and
  `spring.flyway.enabled: true` / `spring.flyway.locations: classpath:db/migration` —
  see [docs/11](11-database-migrations.md).

## 5. Add the Flyway baseline migration

```
src/main/resources/db/migration/V1__create_notifications_table.sql
```

Write the `CREATE TABLE` statement to exactly match `NotificationJpaEntity`'s column
mapping. This becomes the team's shared source of truth for the schema going forward —
never edit this file once merged; add `V2__...sql`, `V3__...sql`, etc. for later changes.

## 6. Route it through the API Gateway

Add a route in `api-gateway/src/main/resources/application.yml` (StripPrefix pattern,
matching the existing 4 routes):

```yaml
spring:
  cloud:
    gateway:
      routes:
        - id: notification-service
          uri: lb://notification-service
          predicates:
            - Path=/notifications/**
          filters:
            - StripPrefix=1
```

`lb://notification-service` means "load-balance across whatever instances are registered
in Eureka under that name" — no hardcoded host/port.

## 7. Write tests

- `application/service/SendNotificationServiceTest.java` — Mockito-mocked port, no Spring
  context (fast unit test).
- `NotificationServiceApplicationTests.java` — full Spring Boot context + MockMvc
  integration test, following the pattern in any existing `*ApplicationTests.java`.

Run `mvn clean install` from the root to confirm the whole reactor (old + new module)
still builds and all tests pass.

## 8. Add a Dockerfile

Copy `logging-service/Dockerfile`, change the module path/jar name to
`notification-service`.

## 9. Wire it into Docker Compose

Add a service block to `docker-compose.yml` (copy an existing business service's block,
change the port and container name):

```yaml
  notification-service:
    build:
      context: .
      dockerfile: notification-service/Dockerfile
    image: learning/notification-service:1.0.0
    container_name: notification-service
    ports:
      - "8085:8085"
    environment:
      EUREKA_URI: http://eureka-server:8761/eureka/
      <<: *jwt-secret
    depends_on:
      - eureka-server
    networks:
      - microservices-net
```

## 10. Wire it into CI/CD

Add `notification-service` to the `for svc in ...` loop in both
`.github/workflows/ci-cd.yml` and `azure-pipelines.yml` (image build/push step) — see
[docs/05](05-deployment.md).

## 11. (Optional) Add a frontend tab

If the new service needs a UI, add a new tab to `frontend/index.html` and a corresponding
section in `frontend/app.js` following the existing tabs — see
[docs/12](12-frontend.md).

## 12. Open a PR

Follow [docs/06](06-git-workflow.md) — feature branch, PR, CI runs `mvn -B clean install`
automatically, review, merge.

## Next

If you're instead adding a feature to an **existing** service (not a whole new one), see
[8. Adding a New Feature](08-adding-new-feature.md) — it's a smaller, faster version of
this same process.
