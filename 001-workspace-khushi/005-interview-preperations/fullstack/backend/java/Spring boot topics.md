Spring Boot Ultimate In‑Depth Guide (Beginner to Advanced – Every Topic Broken Down)

This guide covers Spring Boot from absolute fundamentals to advanced, production‑grade features. Each topic is dissected into the smallest components, with detailed explanations, internal mechanics, and runnable code examples. It is designed for mastery and interview preparation.

---

Table of Contents

1. Introduction to Spring Boot
2. Project Setup and Structure
3. Core Concepts: @SpringBootApplication, Auto‑Configuration, Starters
4. Externalized Configuration
5. Profiles
6. Logging
7. Web Development with Spring MVC
8. RESTful Web Services Deep Dive
9. Exception Handling & Error Responses
10. Content Negotiation, Filters, Interceptors, CORS
11. Reactive Web with Spring WebFlux
12. Data Access & Persistence
13. Spring Data JPA – In Depth
14. Transactions & Propagation
15. Flyway & Liquibase – Database Migrations
16. NoSQL Databases (MongoDB, Redis, Cassandra, Elasticsearch)
17. Caching with Spring Boot
18. AOP (Aspect‑Oriented Programming) in Spring Boot
19. Spring Security in Depth
20. Scheduling & Asynchronous Tasks
21. Messaging: JMS, RabbitMQ, Kafka
22. Validation
23. Testing Spring Boot Applications
24. Actuator – Production‑Ready Features
25. Spring Boot DevTools
26. Internationalization (i18n)
27. Mail Sending
28. REST Clients: RestTemplate & WebClient
29. Spring Batch
30. Docker & Cloud Deployment
31. GraalVM Native Images
32. Spring Boot 3.x – Jakarta EE 9 and Beyond
33. Best Practices and Pitfalls
34. Common Interview Questions

---

1. Introduction to Spring Boot

Spring Boot is an opinionated framework that builds on top of the Spring Framework to simplify the creation of standalone, production‑grade Spring‑based applications. It follows the convention over configuration principle, providing sensible defaults and auto‑configuration.

Why Spring Boot?

· Eliminates boilerplate code (XML configuration, manual bean wiring).
· Embeds a web server (Tomcat, Jetty, Undertow) – create a single executable JAR.
· Offers starters that pull in all necessary dependencies with guaranteed version compatibility.
· Provides auto‑configuration that configures beans automatically based on classpath.
· Production‑ready features out of the box (health checks, metrics, externalized configuration).

Core philosophy: “We opinionate the configuration, you can always override.”

---

2. Project Setup and Structure

Spring Boot projects are created via Spring Initializr (https://start.spring.io) or using IDEs (IntelliJ, Eclipse). Standard project layout:

```
myapp/
├── pom.xml  (or build.gradle)
└── src/
    ├── main/
    │   ├── java/
    │   │   └── com/example/
    │   │       ├── MyApplication.java          (main class)
    │   │       ├── controller/
    │   │       ├── service/
    │   │       ├── repository/
    │   │       ├── model/
    │   │       └── config/
    │   └── resources/
    │       ├── application.properties (or .yml)
    │       ├── static/                 (static resources: CSS, JS, images)
    │       └── templates/              (Thymeleaf, FreeMarker templates)
    └── test/
        └── java/ ...
```

The main class is the entry point:

```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
```

SpringApplication.run() bootstraps the application, creates the Spring context, triggers auto‑configuration, and starts the embedded server.

---

3. Core Concepts: @SpringBootApplication, Auto‑Configuration, Starters

3.1 @SpringBootApplication

A convenience annotation that combines:

· @SpringBootConfiguration (specialization of @Configuration – marks a configuration class).
· @EnableAutoConfiguration – triggers Spring Boot’s auto‑configuration.
· @ComponentScan – scans for components in the package of this class and its sub‑packages.

```java
// Equivalent to:
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan
public @interface SpringBootApplication { ... }
```

3.2 Auto‑Configuration Deep Dive

Auto‑configuration attempts to automatically configure your Spring application based on the dependencies present on the classpath. It is driven by @Conditional annotations and configuration classes listed in META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports (Spring Boot 3.x) or spring.factories.

How it works:

1. @EnableAutoConfiguration imports AutoConfigurationImportSelector.
2. The selector reads the list of auto‑configuration class names from the above file.
3. Each auto‑configuration class is evaluated. It typically has @Configuration and @ConditionalOnClass, @ConditionalOnMissingBean, etc.
4. If conditions match, beans defined in the class are registered.

Common conditional annotations:

· @ConditionalOnClass – class present on classpath.
· @ConditionalOnMissingClass – class not present.
· @ConditionalOnBean / @ConditionalOnMissingBean – bean presence.
· @ConditionalOnProperty – property value (prefix, name, havingValue).
· @ConditionalOnWebApplication / @ConditionalOnNotWebApplication.
· @ConditionalOnExpression – SpEL expression.

Example: DataSourceAutoConfiguration

```java
@Configuration
@ConditionalOnClass({ DataSource.class, EmbeddedDatabaseType.class })
@EnableConfigurationProperties(DataSourceProperties.class)
public class DataSourceAutoConfiguration {
    @Bean
    @ConditionalOnMissingBean
    public DataSource dataSource(DataSourceProperties properties) { ... }
}
```

Excluding auto‑configuration:

```java
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
```

Or via property: spring.autoconfigure.exclude=...

3.3 Starter POMs

Starters are a set of convenient dependency descriptors. They pull in all transitive dependencies with compatible versions. Examples:

· spring-boot-starter-web (Spring MVC, embedded Tomcat, Jackson, validation)
· spring-boot-starter-data-jpa (Hibernate, Spring Data JPA, HikariCP)
· spring-boot-starter-security
· spring-boot-starter-test (JUnit 5, Mockito, AssertJ, etc.)
· spring-boot-starter-aop

Creating a custom starter: combine an auto‑configuration module with a POM that bundles necessary dependencies.

---

4. Externalized Configuration

Spring Boot loads properties from multiple sources with a well‑defined precedence (highest first):

1. Command line arguments (--server.port=8081)
2. SPRING_APPLICATION_JSON environment variable
3. JNDI attributes (java:comp/env)
4. Java System properties (System.getProperties())
5. OS environment variables
6. RandomValuePropertySource (random.* properties)
7. Profile‑specific application-{profile}.properties outside JAR
8. Profile‑specific application-{profile}.properties inside JAR
9. Application properties outside JAR (application.properties)
10. Application properties inside JAR
11. @PropertySource on configuration classes
12. Default properties (SpringApplication.setDefaultProperties)

4.1 application.properties and application.yml

```properties
server.port=8080
app.name=MyApp
```

```yaml
server:
  port: 8080
app:
  name: MyApp
```

4.2 @Value vs @ConfigurationProperties

· @Value – injects a single property, supports SpEL.
  ```java
  @Value("${app.name}")
  private String appName;
  ```
· @ConfigurationProperties(prefix = "app") – binds a set of properties to a Java bean. Supports relaxed binding, validation, and nested structures.
  ```java
  @ConfigurationProperties(prefix = "app")
  @Component
  public class AppProperties {
      private String name;
      private int timeout = 30; // default
      // getters & setters
  }
  ```
  Enable with @EnableConfigurationProperties or @ConfigurationPropertiesScan.

4.3 Relaxed Binding

Properties can be written in different formats: app.timeout, app.time-out, APP_TIMEOUT all map to the same timeout field. Works only with @ConfigurationProperties, not @Value.

4.4 Random Properties

```properties
my.secret=${random.value}
my.uuid=${random.uuid}
my.number=${random.int(1,100)}
```

4.5 Property Validation

@ConfigurationProperties classes can be annotated with @Validated and JSR-303 constraints (@NotNull, @Min, etc.). Validation errors cause startup failure.

4.6 Custom Property Sources

@PropertySource loads additional .properties files. YAML not supported directly; use PropertySourceFactory for YAML.

---

5. Profiles

Spring profiles allow you to define beans and configuration specific to an environment (dev, test, prod).

5.1 @Profile Annotation

```java
@Component
@Profile("dev")
public class DevDatasourceConfig { ... }
```

5.2 Activating Profiles

· spring.profiles.active=dev,staging (in properties, environment variable, or command line)
· @ActiveProfiles("test") in test classes
· spring.profiles.include can add profiles without replacing active ones

5.3 Profile‑Specific Property Files

application-dev.properties overrides application.properties when the dev profile is active.

---

6. Logging

Spring Boot uses Logback as the default logging implementation (SLF4J API). Can switch to Log4j2 or Java Util Logging.

6.1 Configuration via Properties

```properties
logging.level.root=INFO
logging.level.com.example=DEBUG
logging.file.name=app.log
logging.file.path=/var/log/myapp
logging.pattern.console=%d{yyyy-MM-dd HH:mm:ss} %-5level %logger{36} - %msg%n
```

6.2 Log Groups

Group multiple packages under a single level:

```properties
logging.group.tomcat=org.apache.catalina,org.apache.coyote
logging.level.tomcat=TRACE
```

6.3 Custom Logback Configuration

Place logback-spring.xml in src/main/resources. Spring Boot allows <springProfile> tags within the configuration.

---

7. Web Development with Spring MVC

When spring-boot-starter-web is on the classpath, Spring Boot auto‑configures:

· DispatcherServlet (mapped to /)
· HttpMessageConverters (Jackson for JSON, String, etc.)
· Static resource handling from /static, /public, /resources, META-INF/resources
· ErrorController for error pages
· ContentNegotiatingViewResolver
· Template engine support if a template library is present

7.1 Serving Static Resources

Files placed in the above directories are served at the root URL. Customize with spring.web.resources.static-locations.

7.2 Template Engines (Thymeleaf)

If spring-boot-starter-thymeleaf is present, Thymeleaf auto‑configuration kicks in. Templates are resolved from src/main/resources/templates/. Example controller:

```java
@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Hello");
        return "home"; // resolves to templates/home.html
    }
}
```

7.3 Embedded Server Configuration

```properties
server.port=8080
server.servlet.context-path=/api
server.tomcat.max-threads=200
server.tomcat.connection-timeout=60s
server.compression.enabled=true
```

Switch to Jetty or Undertow: exclude spring-boot-starter-tomcat and include the corresponding starter.

---

8. RESTful Web Services Deep Dive

Use @RestController (which combines @Controller and @ResponseBody) to build REST APIs.

8.1 Request Mapping

```java
@RestController
@RequestMapping("/api/users")
public class UserController {
    @GetMapping
    public List<User> getAll() { ... }

    @GetMapping("/{id}")
    public User getById(@PathVariable Long id) { ... }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@Valid @RequestBody User user) { ... }

    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @RequestBody User user) { ... }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) { ... }
}
```

8.2 Request Parameters and Headers

```java
@GetMapping("/search")
public List<User> search(@RequestParam String name,
                         @RequestHeader("Authorization") String token) { ... }
```

8.3 Consuming Different Media Types

```java
@PostMapping(consumes = MediaType.APPLICATION_XML_VALUE)
public void processXML(@RequestBody User user) { ... }
```

Add jackson-dataformat-xml for XML support.

8.4 HATEOAS (Hypermedia)

Spring HATEOAS provides EntityModel, CollectionModel. Example:

```java
@GetMapping("/{id}")
public EntityModel<User> one(@PathVariable Long id) {
    User user = repository.findById(id).orElseThrow();
    return EntityModel.of(user,
        linkTo(methodOn(UserController.class).one(id)).withSelfRel(),
        linkTo(methodOn(UserController.class).all()).withRel("users"));
}
```

---

9. Exception Handling & Error Responses

Spring Boot provides /error mapping by default, handled by BasicErrorController. Customize with:

9.1 @ControllerAdvice + @ExceptionHandler

```java
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleNotFound(ResourceNotFoundException ex) {
        ErrorResponse error = new ErrorResponse("NOT_FOUND", ex.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleValidation(MethodArgumentNotValidException ex) {
        List<String> details = ex.getBindingResult().getFieldErrors()
                .stream().map(FieldError::getDefaultMessage).collect(toList());
        ErrorResponse error = new ErrorResponse("VALIDATION_FAILED", details.toString());
        return ResponseEntity.badRequest().body(error);
    }
}
```

9.2 Custom Error Attributes

Implement ErrorAttributes to change the fields in the default error response.

9.3 Custom Error Page

Place error.html in the templates folder. Spring Boot will render it for any unmapped error.

9.4 @ResponseStatus on Custom Exceptions

```java
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) { super(message); }
}
```

9.5 Problem Details (RFC 7807)

Spring Boot 3.x supports ProblemDetail and ErrorResponse out of the box. Use @ExceptionHandler returning ProblemDetail.

---

10. Content Negotiation, Filters, Interceptors, CORS

10.1 Content Negotiation

Configure via spring.mvc.contentnegotiation.favor-parameter=true to use ?format=json or ?format=xml. Accept header is also supported.

10.2 Filters

Standard servlet filters can be registered as Spring beans. Spring Boot auto‑configures them into the filter chain.

```java
@Component
public class CustomFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) { ... }
}
```

Order can be set with @Order or FilterRegistrationBean.

10.3 Interceptors

```java
@Component
public class LoggingInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        // ...
        return true;
    }
}
// Register in a WebMvcConfigurer:
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Autowired private LoggingInterceptor logInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(logInterceptor).addPathPatterns("/api/**");
    }
}
```

10.4 CORS

Enable globally:

```java
@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("http://localhost:3000")
                .allowedMethods("GET","POST","PUT","DELETE");
    }
}
```

Or use @CrossOrigin on controller/methods. Also configurable via spring.web.cors.* properties (Spring Boot 3.x).

---

11. Reactive Web with Spring WebFlux

Spring Boot can run reactive applications using Project Reactor. Add spring-boot-starter-webflux.

11.1 Basic Reactive Controller

```java
@RestController
@RequestMapping("/api/users")
public class ReactiveUserController {
    private final UserRepository repo;

    @GetMapping
    public Flux<User> getAll() { return repo.findAll(); }

    @GetMapping("/{id}")
    public Mono<User> getById(@PathVariable String id) { return repo.findById(id); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<User> create(@RequestBody User user) { return repo.save(user); }
}
```

11.2 Functional Endpoints (Router Functions)

```java
@Configuration
public class RouterConfig {
    @Bean
    public RouterFunction<ServerResponse> route(UserHandler handler) {
        return RouterFunctions
            .route(GET("/api/users"), handler::getAll)
            .andRoute(GET("/api/users/{id}"), handler::getById);
    }
}
```

11.3 Reactive Data Access

Spring Data provides reactive repositories: ReactiveMongoRepository, R2dbcRepository for SQL.

---

12. Data Access & Persistence

12.1 JDBC with Spring Boot

spring-boot-starter-jdbc configures JdbcTemplate and NamedParameterJdbcTemplate.

```java
@Autowired
private JdbcTemplate jdbc;

public List<User> findAll() {
    return jdbc.query("SELECT * FROM users", new BeanPropertyRowMapper<>(User.class));
}
```

DataSource auto‑configuration: HikariCP is the default connection pool. Configure:

```properties
spring.datasource.url=jdbc:mysql://localhost/mydb
spring.datasource.username=root
spring.datasource.password=secret
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.hikari.maximum-pool-size=10
```

12.2 Multiple DataSources

Define separate DataSource beans and a JdbcTemplate for each. Use @Primary to mark the main one. Then configure @EnableJpaRepositories and @EntityManagerFactory for each if using JPA.

---

13. Spring Data JPA – In Depth

Spring Boot auto‑configures Spring Data JPA when spring-boot-starter-data-jpa is present.

13.1 Repository Setup

```java
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByLastName(String lastName);
    @Query("SELECT u FROM User u WHERE u.email LIKE %:domain%")
    List<User> findByEmailDomain(@Param("domain") String domain);
    Page<User> findByAgeGreaterThan(int age, Pageable pageable);
}
```

13.2 Query Methods

Derived methods follow keywords: findBy..., readBy..., queryBy..., countBy..., deleteBy....
Predicate keywords: And, Or, Between, LessThan, GreaterThan, Like, IgnoreCase, OrderBy, Top, First, Distinct.

13.3 @Query Custom Queries

JPQL or native SQL.

```java
@Modifying
@Query("UPDATE User SET active = :active WHERE lastLogin < :date")
int deactivateInactive(@Param("active") boolean active, @Param("date") LocalDate date);
```

13.4 Specifications & QueryDSL

JpaSpecificationExecutor for dynamic queries. QueryDSL integration is also auto‑configured when the library is present.

13.5 Auditing

Enable with @EnableJpaAuditing. Annotations: @CreatedDate, @LastModifiedDate, @CreatedBy, @LastModifiedBy. Requires AuditorAware bean.

13.6 Entity Graphs

To solve N+1, define @NamedEntityGraph on entity, then use @EntityGraph on repository method.

```java
@EntityGraph(attributePaths = "roles")
List<User> findAll();
```

13.7 Pagination and Sorting

```java
Page<User> users = userRepository.findAll(PageRequest.of(0, 10, Sort.by("name").descending()));
```

13.8 Transactions

@Transactional on service methods. JpaTransactionManager is auto‑configured. Propagation levels: REQUIRED, REQUIRES_NEW, etc.

---

14. Transactions & Propagation

Transaction boundaries are managed with @Transactional. Spring Boot auto‑configures PlatformTransactionManager (JPA: JpaTransactionManager, JDBC: DataSourceTransactionManager).

14.1 Transaction Propagation

· REQUIRED (default): join existing transaction or create new.
· REQUIRES_NEW: always create a new transaction, suspend current.
· NESTED: nested transaction with savepoints (JDBC only).
· SUPPORTS, NOT_SUPPORTED, MANDATORY, NEVER.

```java
@Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED)
public void doSomething() { ... }
```

14.2 Rollback Rules

By default, rollback for RuntimeException and Error. Customize with rollbackFor and noRollbackFor.

14.3 Testing Transactions

Tests annotated with @Transactional will rollback by default. Use @Commit to override.

---

15. Flyway & Liquibase – Database Migrations

Spring Boot auto‑configures Flyway/Liquibase when the respective library is on the classpath.

15.1 Flyway

Place SQL migration scripts in src/main/resources/db/migration. Naming convention: V1__init.sql, V2__add_column.sql.

```properties
spring.flyway.enabled=true
spring.flyway.locations=classpath:db/migration
```

15.2 Liquibase

Place changelog files (YAML, XML, JSON, SQL) in src/main/resources/db/changelog. Master file db.changelog-master.yaml.

Spring Boot runs migrations on startup by default.

---

16. NoSQL Databases (MongoDB, Redis, Cassandra, Elasticsearch)

Spring Boot provides starters and auto‑configuration for several NoSQL stores. Each follows the same pattern: add the starter, configure connection properties, and use the template/repository.

16.1 MongoDB

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-mongodb</artifactId>
</dependency>
```

```properties
spring.data.mongodb.uri=mongodb://localhost/test
```

Repository: interface UserRepository extends MongoRepository<User, String> { ... }.
Template: MongoTemplate.

16.2 Redis

spring-boot-starter-data-redis provides StringRedisTemplate and RedisTemplate. Connection details: spring.redis.host, spring.redis.port.

Repositories for @RedisHash objects.

16.3 Cassandra

spring-boot-starter-data-cassandra with CassandraTemplate and CassandraRepository.

16.4 Elasticsearch

spring-boot-starter-data-elasticsearch supports ElasticsearchRestTemplate and ElasticsearchRepository.

---

17. Caching with Spring Boot

Add spring-boot-starter-cache and optionally a cache provider (Caffeine, Ehcache, Redis). Enable with @EnableCaching on a configuration class.

17.1 Declarative Annotations

```java
@Service
public class UserService {
    @Cacheable(value = "users", key = "#id")
    public User getUser(Long id) { ... }

    @CachePut(value = "users", key = "#user.id")
    public User updateUser(User user) { ... }

    @CacheEvict(value = "users", key = "#id")
    public void deleteUser(Long id) { ... }

    @CacheEvict(value = "users", allEntries = true)
    public void clearCache() { ... }
}
```

17.2 Configuration

```properties
spring.cache.type=caffeine
spring.cache.caffeine.spec=maximumSize=500,expireAfterWrite=600s
```

---

18. AOP (Aspect‑Oriented Programming) in Spring Boot

AOP is enabled by default when spring-boot-starter-aop is present (pulls in Spring AOP and AspectJ).

18.1 Defining Aspects

```java
@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.example.service.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Before: " + joinPoint.getSignature().getName());
    }

    @Around("@annotation(LogExecutionTime)")
    public Object measureTime(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = pjp.proceed();
        long duration = System.currentTimeMillis() - start;
        System.out.println("Execution time: " + duration + "ms");
        return result;
    }
}
```

18.2 Custom Annotations

```java
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LogExecutionTime {}
```

18.3 Enable AspectJ Proxies

Auto‑configured; no need for explicit @EnableAspectJAutoProxy.

---

19. Spring Security in Depth

Add spring-boot-starter-security to secure your application.

19.1 Default Security

· All endpoints are secured.
· A default user user with a generated password (printed in console).
· Form login and HTTP basic are enabled.

19.2 Custom Security Configuration (Spring Boot 3.x)

```java
@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/public/**").permitAll()
                .requestMatchers("/api/admin/**").hasRole("ADMIN")
                .anyRequest().authenticated()
            )
            .formLogin(withDefaults())
            .oauth2Login(withDefaults());
        return http.build();
    }
}
```

19.3 User Details Service

```java
@Bean
public UserDetailsService userDetailsService() {
    return username -> {
        User user = userRepository.findByUsername(username);
        if (user == null) throw new UsernameNotFoundException(username);
        return org.springframework.security.core.userdetails.User
                .withUsername(user.getUsername())
                .password(user.getPassword())
                .roles(user.getRoles().toArray(new String[0]))
                .build();
    };
}
```

19.4 Password Encoder

```java
@Bean
public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
}
```

19.5 JWT Authentication

Spring Security does not auto‑configure JWT. You create a filter that extracts the token, validates it, and sets the security context. The filter is added before UsernamePasswordAuthenticationFilter.

19.6 OAuth2 & OpenID Connect

Use spring-boot-starter-oauth2-client or spring-boot-starter-oauth2-resource-server. Configure:

```properties
spring.security.oauth2.client.registration.google.client-id=...
spring.security.oauth2.client.registration.google.client-secret=...
```

19.7 Method Security

Enable with @EnableMethodSecurity. Then @PreAuthorize, @PostAuthorize, @Secured.

---

20. Scheduling & Asynchronous Tasks

20.1 Scheduling

Enable with @EnableScheduling. Use @Scheduled on methods:

```java
@Component
public class ScheduledTasks {
    @Scheduled(fixedRate = 5000)
    public void report() { ... }

    @Scheduled(cron = "0 0 12 * * ?") // every day at noon
    public void dailyJob() { ... }
}
```

20.2 Asynchronous Execution

Enable with @EnableAsync. Mark methods @Async:

```java
@Service
public class EmailService {
    @Async
    public CompletableFuture<Void> sendEmail(String to) {
        // ...
        return CompletableFuture.completedFuture(null);
    }
}
```

Configure executor: spring.task.execution.pool.core-size=5, etc.

---

21. Messaging: JMS, RabbitMQ, Kafka

21.1 JMS (ActiveMQ Artemis)

spring-boot-starter-artemis auto‑configures a JmsTemplate. @JmsListener for receiving messages.

21.2 RabbitMQ

spring-boot-starter-amqp. RabbitTemplate for sending, @RabbitListener for receiving.

```properties
spring.rabbitmq.host=localhost
spring.rabbitmq.port=5672
```

21.3 Apache Kafka

spring-kafka starter. Properties: spring.kafka.bootstrap-servers. KafkaTemplate and @KafkaListener.

---

22. Validation

Spring Boot includes Hibernate Validator (JSR 380) via spring-boot-starter-validation. Validate request bodies:

```java
public class UserDto {
    @NotBlank
    private String name;
    @Min(18)
    private int age;
}
```

Controller: @Valid @RequestBody UserDto dto.
Validation errors trigger MethodArgumentNotValidException. Handle with @ExceptionHandler.

22.1 Custom Validators

```java
@Target(FIELD)
@Retention(RUNTIME)
@Constraint(validatedBy = MyValidator.class)
public @interface ValidEmail { ... }
```

---

23. Testing Spring Boot Applications

23.1 Unit Testing (no Spring context)

Use JUnit 5 + Mockito. Mock dependencies manually.

23.2 Integration Testing

@SpringBootTest loads the full context. Often combined with @AutoConfigureMockMvc.

23.3 Slice Tests

· @WebMvcTest: loads only web layer, auto‑configures MockMvc, uses @MockBean for services.
· @DataJpaTest: loads only JPA components, uses in‑memory database, @Entity classes and repositories.
· @JsonTest: tests JSON serialization.
· @RestClientTest: for REST client tests.

23.4 Mocking and Spying

@MockBean creates a mock and adds it to the context. @SpyBean wraps an existing bean.

23.5 Test Utilities

TestRestTemplate for integration tests (relative URLs, handles auth). WebTestClient for reactive.

---

24. Actuator – Production‑Ready Features

Add spring-boot-starter-actuator. Provides endpoints over HTTP and JMX.

24.1 Endpoints

Endpoint Description
/actuator/health Health status
/actuator/info Custom info
/actuator/metrics Micrometer metrics
/actuator/env Environment properties
/actuator/beans Spring beans
/actuator/loggers View/change log levels
/actuator/heapdump Download heap dump
/actuator/threaddump Thread dump
/actuator/conditions Auto‑configuration report

Exposure: management.endpoints.web.exposure.include=health,info,metrics.

24.2 Custom Health Indicator

```java
@Component
public class DatabaseHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        if (dbIsUp()) return Health.up().build();
        return Health.down().withDetail("Error", "DB Down").build();
    }
}
```

24.3 Custom Metrics

Inject MeterRegistry and register Counter, Gauge, Timer. Or use @Timed (with AOP).

24.4 Info Contributors

```java
@Component
public class BuildInfoContributor implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("app", Map.of("version", "1.0"));
    }
}
```

24.5 Prometheus

Add micrometer-registry-prometheus, then scrape /actuator/prometheus.

---

25. Spring Boot DevTools

A development‑time only module that provides:

· Automatic application restart when classpath changes (using two classloaders).
· LiveReload server for browser auto‑refresh.
· Global settings (~/.spring-boot-devtools.properties).
· Disables template caching.
  Add as optional dependency:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
    <optional>true</optional>
</dependency>
```

---

26. Internationalization (i18n)

Spring Boot auto‑configures MessageSource if a messages.properties file exists in root classpath. Define messages for different locales (messages_en.properties, messages_fr.properties).

26.1 Message Resolution

```java
@Autowired
private MessageSource messageSource;
// usage:
messageSource.getMessage("greeting", null, locale);
```

In Thymeleaf: #{greeting}.

26.2 Locale Resolution

AcceptHeaderLocaleResolver is default. Can customize to use a cookie, session, or fixed locale.

---

27. Mail Sending

spring-boot-starter-mail provides JavaMailSender auto‑configuration.

```properties
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=user@gmail.com
spring.mail.password=secret
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
```

```java
@Autowired
private JavaMailSender mailSender;
public void sendEmail(String to, String subject, String body) {
    SimpleMailMessage message = new SimpleMailMessage();
    message.setTo(to); message.setSubject(subject); message.setText(body);
    mailSender.send(message);
}
```

For MIME messages with attachments, use MimeMessageHelper.

---

28. REST Clients: RestTemplate & WebClient

28.1 RestTemplate (blocking)

Auto‑configured as a bean if spring-boot-starter-web is present. Use RestTemplateBuilder to create customized instances.

```java
@Bean
public RestTemplate restTemplate(RestTemplateBuilder builder) {
    return builder.basicAuthentication("user", "pass").build();
}
```

28.2 WebClient (reactive, non‑blocking)

Part of spring-boot-starter-webflux. Auto‑configured WebClient.Builder.

```java
@Autowired
private WebClient.Builder webClientBuilder;

public Mono<User> getUser(String id) {
    return webClientBuilder.build()
        .get()
        .uri("http://api.example.com/users/{id}", id)
        .retrieve()
        .bodyToMono(User.class);
}
```

---

29. Spring Batch

Add spring-boot-starter-batch. Spring Boot auto‑configures a JobRepository, JobLauncher, and basic infrastructure.

29.1 Job Definition

```java
@Configuration
@EnableBatchProcessing
public class BatchConfig {
    @Autowired private JobBuilderFactory jobs;
    @Autowired private StepBuilderFactory steps;

    @Bean
    public Job importUserJob(Step step1) {
        return jobs.get("importUserJob").start(step1).build();
    }

    @Bean
    public Step step1(ItemReader<User> reader, ItemProcessor<User, User> processor, ItemWriter<User> writer) {
        return steps.get("step1")
            .<User, User>chunk(10)
            .reader(reader).processor(processor).writer(writer)
            .build();
    }
}
```

29.2 Running Jobs

Batch jobs can be triggered on startup or via a controller using JobLauncher. Spring Boot disables automatic execution by default; set spring.batch.job.enabled=true.

---

30. Docker & Cloud Deployment

30.1 Dockerizing a Spring Boot App

Create a Dockerfile:

```dockerfile
FROM eclipse-temurin:17-jre-alpine
COPY target/myapp.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
```

Layered JARs (optimize caching):

```xml
<plugin>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-maven-plugin</artifactId>
    <configuration>
        <layers>
            <enabled>true</enabled>
        </layers>
    </configuration>
</plugin>
```

30.2 Cloud Platforms

Spring Boot apps run on any platform that supports Java: AWS Elastic Beanstalk, Heroku, Google App Engine, Azure, Kubernetes. Cloud Foundry and Kubernetes have dedicated support (Actuator endpoints for liveness/readiness).

---

31. GraalVM Native Images

Spring Boot 3.x supports ahead‑of‑time (AOT) compilation to native executables, drastically reducing memory footprint and startup time.

Steps:

1. Add GraalVM Native Build Tools plugin (Maven).
2. Run mvn -Pnative native:compile.
3. The result is a native binary.

Many dynamic features require reachability metadata (reflection, proxies). Spring Boot’s AOT engine generates hints. Some starters (like JDBC, JPA, Kafka) are already supported.

---

32. Spring Boot 3.x – Jakarta EE 9 and Beyond

· Jakarta EE 9 migration: javax.* → jakarta.* (e.g., javax.servlet → jakarta.servlet).
· Requires Java 17.
· Spring Security 6: WebSecurityConfigurerAdapter removed; use SecurityFilterChain bean.
· Improved observability with Micrometer Tracing.
· @AutoConfiguration (replaces @Configuration for auto‑config classes in Spring Boot 3.x).
· HTTP API client support (HttpServiceProxyFactory).

---

33. Best Practices and Pitfalls

· Keep @SpringBootApplication in the root package for component scanning.
· Use @ConfigurationProperties over @Value for grouped properties.
· Use Flyway/Liquibase instead of hibernate.ddl-auto in production.
· Secure Actuator endpoints in production.
· Profile‑specific configurations; never use default profile for production.
· Avoid calling @Async methods from within the same class (self‑invocation bypasses proxy).
· Use RestTemplateBuilder or WebClient.Builder for proper configuration.
· Prefer constructor injection.
· Tests: prefer slice tests over full context for faster feedback.
· Beware of @Transactional on private methods – it’s ignored.
· Don’t include DevTools in production.

---

34. Common Interview Questions

1. What is the difference between Spring and Spring Boot?
2. How does auto‑configuration work? Explain @ConditionalOnMissingBean.
3. How do you externalize configuration? Property precedence?
4. What are profiles? How to activate?
5. Explain the role of Actuator and how to customize health endpoints.
6. How do you secure a Spring Boot application?
7. What is the difference between @Component, @Service, @Repository, @Controller?
8. How to handle exceptions globally?
9. What are starters and name a few.
10. How to switch from Tomcat to Jetty?
11. Explain the difference between @SpringBootTest and @WebMvcTest.
12. How to enable caching in Spring Boot?
13. What is the purpose of @SpringBootApplication?
14. How does Spring Boot support database migrations?
15. How to create a custom auto‑configuration?
16. What is the difference between RestTemplate and WebClient?
17. How do you configure multiple data sources?
18. Explain the Spring Boot request lifecycle.
19. How to implement JWT authentication in Spring Boot?
20. What are the new features in Spring Boot 3.x?

---

This guide covers every essential Spring Boot topic from beginner to advanced, with detailed explanations and practical examples. It is your one‑stop reference for mastering Spring Boot and acing interviews.
