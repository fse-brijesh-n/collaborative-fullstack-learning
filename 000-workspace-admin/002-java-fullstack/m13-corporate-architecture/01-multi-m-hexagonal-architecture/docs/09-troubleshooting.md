# 9. Troubleshooting

Real problems hit while building this project, and how they were diagnosed and fixed —
useful both as direct fixes and as examples of the *diagnostic process* for similar
issues you'll hit extending this project.

## "It builds a jar, but `java -jar service.jar` does nothing / exits immediately / isn't runnable"

**Symptom**: `mvn clean install` succeeds, but the produced jar isn't a runnable Spring
Boot fat jar (no embedded dependencies, `java -jar` fails with
`no main manifest attribute`).

**Root cause**: the `spring-boot-maven-plugin` was declared in `pluginManagement` in the
parent POM but never actually **bound with an execution** (`<executions><execution>
<goals><goal>repackage</goal>`) in a way every child inherited — without an explicit
`repackage` goal execution, the plugin doesn't repackage the plain jar into an executable
one.

**Fix**: ensure every deployable child's `<build><plugins>` includes the plugin *and* that
either the parent's `pluginManagement` or the child itself binds the `repackage` goal
(Spring Boot's own parent starter normally does this by default when you extend
`spring-boot-starter-parent` — since this project uses BOM import instead of parent
inheritance, the goal execution has to be explicit). Verify by unzipping the built jar and
confirming `BOOT-INF/classes` and `BOOT-INF/lib` exist.

## "`@RequestParam`/`@PathVariable` binding fails at runtime with a 500 error, even though the code looks correct"

**Symptom**: An endpoint like `@GetMapping("/{id}") get(@PathVariable Long id)` throws at
runtime — Spring can't resolve the parameter name — even though the code compiles fine and
looks identical to countless working examples online.

**Root cause**: **missing `-parameters` javac flag.** Without it, compiled bytecode doesn't
retain method parameter names (they show up as `arg0`, `arg1`, …), so Spring MVC can't map
`@PathVariable`/`@RequestParam` to the parameter unless you *also* explicitly write
`@PathVariable("id") Long id` everywhere. Modern Spring Boot tooling (via
`spring-boot-starter-parent`) enables this flag by default — but a from-scratch parent POM
that doesn't extend `spring-boot-starter-parent` (as this project intentionally doesn't, to
demonstrate a from-scratch multi-module setup) must opt in manually.

**Fix**: add this to the parent POM's `maven-compiler-plugin` configuration in
`pluginManagement`:

```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-compiler-plugin</artifactId>
    <configuration>
        <parameters>true</parameters>
    </configuration>
</plugin>
```

Rebuild (`mvn clean install`) — a clean rebuild is required since this changes compiler
output, incremental compiles won't pick it up.

## "CORS preflight (`OPTIONS`) returns 403, or the actual response has no `Access-Control-Allow-Origin` header"

**Symptom**: calling the gateway directly with tools like `curl`/PowerShell's
`Invoke-RestMethod` succeeds (status 200/201), but the exact same call from a **real
browser's** `fetch()` fails with a CORS error in the console, and the network tab shows the
response has no `Access-Control-Allow-Origin` header (or the preflight `OPTIONS` request
itself returns 403).

**Root cause / trap**: `curl` and PowerShell's HTTP cmdlets **do not enforce or even check
CORS** — they send the request and show you whatever comes back, regardless of an
`Origin`/`Access-Control-Allow-Origin` mismatch. A successful `curl` response proves the
*endpoint* works, but proves **nothing** about whether a browser would allow the response to
reach client-side JavaScript. You must explicitly send an `OPTIONS` preflight with
`Access-Control-Request-Method`/`Access-Control-Request-Headers` to actually test CORS:

```powershell
curl.exe -i -X OPTIONS "http://localhost:8080/auth/api/auth/login" `
  -H "Origin: http://localhost:3000" `
  -H "Access-Control-Request-Method: POST" `
  -H "Access-Control-Request-Headers: content-type"
```

In this project, the initial CORS setup used Spring Cloud Gateway's
**properties-based** config (`spring.cloud.gateway.globalcors.cors-configurations` in
`application.yml`) — the YAML parsed correctly, but at runtime the `CorsConfigurationSource`
lookup was never actually matching, so preflight requests were rejected (403) by Spring's
`DefaultCorsProcessor.handleInvalidCorsRequest()`, and real requests carried no
`Access-Control-Allow-Origin` header at all.

**Fix**: replace the properties-based config with an explicit `CorsWebFilter` **Java
bean** — see `api-gateway/src/main/java/com/example/gateway/config/CorsConfig.java`:

```java
@Configuration
public class CorsConfig {
    @Bean
    public CorsWebFilter corsWebFilter() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOriginPatterns(List.of("*"));
        configuration.setAllowedMethods(List.of("GET","POST","PUT","PATCH","DELETE","OPTIONS"));
        configuration.setAllowedHeaders(List.of("*"));
        configuration.setAllowCredentials(false);

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return new CorsWebFilter(source);
    }
}
```

This is more reliable and far easier to debug/unit-test than the YAML properties approach.
After adding it, re-run the `curl -X OPTIONS` check above — you should see `200 OK` with
`Access-Control-Allow-Origin` in the response headers, and a normal cross-origin POST should
carry the same header. See [docs/12](12-frontend.md) for the full frontend/CORS story.

## "Flyway fails on startup: `Migration checksum mismatch` or `Found non-empty schema... without metadata table`"

**Symptom**: after adding Flyway to a service that previously used
`ddl-auto: update`/`create`, startup fails.

**Root cause**: Flyway found tables already created by Hibernate's auto-DDL in a prior run
(no `flyway_schema_history` table to reconcile against), or someone edited an already-applied
migration file (changing its checksum).

**Fix**:
- For local/dev H2 in-memory databases (as in this project), the database resets on every
  restart, so this is rarely hit — but if you see it, delete any local file-based H2 data
  file if you've configured one, or just restart (in-memory DBs are gone on JVM exit anyway).
- **Never edit a migration file that has already been applied/merged** — add a new
  `Vn+1__...sql` file instead. See [docs/11](11-database-migrations.md).
- Ensure `ddl-auto` is `validate` (not `update`/`create`) once Flyway owns the schema —
  otherwise the two mechanisms fight over who creates tables.

## "Service won't register with Eureka / gateway returns 503 for a route"

**Checklist**:
1. Is `eureka-server` actually up? Check http://localhost:8761 — it must be UP *before*
   other services fully start their Eureka client registration (a short delay after
   starting Eureka is normal; see [docs/04](04-getting-started.md)).
2. Does the service's `application.yml` have the correct
   `eureka.client.service-url.defaultZone` (matches `EUREKA_URI` env var when run via
   Docker Compose)?
3. Does `spring.application.name` match exactly what the gateway route's `uri: lb://...`
   expects (case-insensitive, but must match the registered name)?
4. Give it ~30-45 seconds after startup — Eureka's default lease renewal interval means
   fresh registrations can take a short time to propagate to the gateway's local cache.

## Next

If your issue isn't listed here, check the relevant topic doc (
[02](02-hexagonal-architecture.md) for structure questions,
[11](11-database-migrations.md) for schema/Flyway questions,
[12](12-frontend.md) for CORS/frontend questions) or open an issue/PR describing the
problem and fix so future contributors benefit — this file is meant to keep growing.
