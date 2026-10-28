Microservices with Spring Boot – Ultimate In‑Depth Guide (Beginner to Advanced)

This guide provides an exhaustive, layered walkthrough of building microservices with Spring Boot and the Spring Cloud ecosystem. It covers everything from core principles to production‑ready patterns, internal mechanisms, and interview‑ready explanations. Every concept is broken down with code examples and best practices.

---

Table of Contents

1. Introduction to Microservices
2. Monolithic vs Microservices Architecture
3. Principles and Design Fundamentals
4. Domain‑Driven Design (DDD) & Bounded Contexts
5. Service Decomposition Strategies
6. Communication in Microservices
   · 6.1 Synchronous Communication
     · 6.1.1 REST with RestTemplate & WebClient
     · 6.1.2 OpenFeign (Declarative REST Client)
     · 6.1.3 gRPC (Protocol Buffers)
   · 6.2 Asynchronous Communication
     · 6.2.1 Messaging with Spring Cloud Stream (RabbitMQ / Kafka)
     · 6.2.2 Publish‑Subscribe & Event‑Driven Architecture
     · 6.2.3 Message Ordering, Idempotency & Dead Letter Queues
7. Service Discovery
   · 7.1 Client‑Side Discovery with Eureka
   · 7.2 Alternatives: Consul, Zookeeper
   · 7.3 Kubernetes‑Native Service Discovery
8. API Gateway
   · 8.1 Spring Cloud Gateway
   · 8.2 Route Predicates, Filters, Global Filters
   · 8.3 Rate Limiting, Circuit Breaker in Gateway
   · 8.4 Custom Gateway Filters
   · 8.5 Zuul (Legacy)
9. Configuration Management
   · 9.1 Spring Cloud Config Server (Git Backend)
   · 9.2 Refresh, Bus, and Vault Integration
   · 9.3 Kubernetes ConfigMaps & Secrets
10. Resilience & Fault Tolerance
    · 10.1 Circuit Breaker with Resilience4j
    · 10.2 Retry, Rate Limiter, Bulkhead, Time Limiter
    · 10.3 Fallback Methods and Resilience Annotations
11. Distributed Tracing & Observability
    · 11.1 Micrometer Tracing with Zipkin
    · 11.2 OpenTelemetry Integration
    · 11.3 Centralized Logging (ELK / Loki)
12. Security in Microservices
    · 12.1 OAuth2 and JWT Fundamentals
    · 12.2 Setting Up an Authorization Server (Keycloak)
    · 12.3 Resource Server Configuration
    · 12.4 Inter‑Service Authentication (Client Credentials, mTLS)
    · 12.5 API Gateway as Security Enforcement Point
13. Data Management Patterns
    · 13.1 Database per Service
    · 13.2 Shared Database? (Anti‑pattern discussion)
    · 13.3 Saga Pattern
      · 13.3.1 Choreography‑Based Saga
      · 13.3.2 Orchestration‑Based Saga (with Axon Framework example)
    · 13.4 CQRS & Event Sourcing
    · 13.5 Transactional Outbox & Change Data Capture (Debezium)
14. Testing Microservices
    · 14.1 Unit, Integration, End‑to‑End
    · 14.2 Consumer‑Driven Contract Testing (Spring Cloud Contract)
    · 14.3 Testcontainers for Real Dependencies
15. Containerization & Orchestration
    · 15.1 Dockerfile Best Practices & Buildpacks
    · 15.2 Docker Compose for Local Development
    · 15.3 Kubernetes Essentials (Deployments, Services, Ingress)
    · 15.4 Health Probes (Liveness & Readiness)
    · 15.5 Service Mesh (Istio, Linkerd) – Sidecar Pattern
16. Deployment Strategies
    · 16.1 Blue‑Green, Canary, Rolling, A/B Testing
17. Monitoring & Alerting
    · 17.1 Prometheus, Grafana, Micrometer
    · 17.2 Alerting Rules
18. Event‑Driven Architecture & Advanced Patterns
    · 18.1 Domain Events & Event Sourcing
    · 18.2 Change Data Capture (Debezium)
    · 18.3 Backpressure and Reactive Streams
19. Infrastructure & DevOps
    · 19.1 CI/CD Pipelines
    · 19.2 GitOps with ArgoCD / Flux
20. Best Practices, Anti‑patterns, and Interview Q&A

---

1. Introduction to Microservices

Microservices is an architectural style that decomposes an application into a suite of small, independently deployable services, each running in its own process and communicating via lightweight mechanisms (often HTTP/REST or asynchronous messaging). Each service is built around a business capability and can be developed, deployed, and scaled independently.

Key Drivers:

· Faster time‑to‑market.
· Scalability of individual components.
· Technology heterogeneity.
· Resilience through isolation.
· Smaller, focused teams (2‑pizza rule).

Challenges:

· Distributed system complexity.
· Network reliability, latency.
· Data consistency.
· Operational overhead (monitoring, logging, deployment).

---

2. Monolithic vs Microservices Architecture

Characteristic Monolith Microservices
Codebase Single large codebase Multiple small, independent codebases
Deployability Entire application deployed as one unit Each service deployed independently
Scalability Whole application scaled (vertical/ horizontal) Scale only the needed services
Team Organization Often organized around technology layers Organized around business capabilities
Data Storage Typically one shared database Database per service (polyglot persistence)
Communication In‑process function calls Network calls (REST, gRPC, messaging)
Reliability Single point of failure can bring everything down Failure isolation; a failing service doesn’t crash others
Development Speed Slower as codebase grows Faster due to independent teams
Technology Stack Usually uniform (one language, one DB) Freedom to choose per service
Testing Simpler end‑to‑end testing Complex integration and contract testing required

When to use Microservices: large, evolving systems where independent scaling, frequent releases, and multiple teams are necessary.

---

3. Principles and Design Fundamentals

· Componentization via Services – each service is a replaceable unit.
· Organized around Business Capabilities – cross‑functional teams owning the full lifecycle.
· Smart Endpoints and Dumb Pipes – business logic in services, not in ESB or messaging middleware.
· Decentralized Governance – each team chooses their stack and tools.
· Decentralized Data Management – each service owns its database schema.
· Infrastructure Automation – CI/CD, automated testing, and deployment pipelines.
· Design for Failure – implement timeouts, retries, circuit breakers, bulkheads.
· Evolutionary Design – services can be individually replaced or evolved.

---

4. Domain‑Driven Design (DDD) & Bounded Contexts

DDD helps identify service boundaries by modeling the business domain.

· Entity, Value Object, Aggregate – building blocks.
· Bounded Context – a logical boundary where a particular domain model is defined and applies. A microservice typically aligns with one bounded context.
· Ubiquitous Language – a common, rigorous language shared by developers and domain experts within a bounded context.
· Context Mapping – relationships between bounded contexts: Shared Kernel, Customer‑Supplier, Conformist, Anticorruption Layer, Open Host Service, Published Language.

Using DDD, we decompose a system into subdomains and map each to a microservice.

---

5. Service Decomposition Strategies

· Decompose by Business Capability: identify capabilities (e.g., Customer Management, Order Management, Billing) and create a service for each.
· Decompose by Subdomain (DDD) – align with bounded contexts.
· Strangler Fig Pattern: gradually replace specific functionality of a monolith with microservices, keeping the monolith operational until all pieces are extracted.
· Decompose by Verb (Use Case) / Nouns – not recommended for larger systems.

Sizing: a microservice should be small enough to be owned by a small team and big enough not to need excessive inter‑service chitchat.

---

6. Communication in Microservices

6.1 Synchronous Communication

6.1.1 REST with WebClient and RestTemplate

RestTemplate is deprecated in Spring Framework 6; use WebClient (reactive, non‑blocking).

```java
// WebClient bean
@Bean
public WebClient.Builder webClientBuilder() {
    return WebClient.builder();
}

// Usage in service
@Service
public class UserServiceClient {
    private final WebClient webClient;
    public UserServiceClient(WebClient.Builder builder) {
        this.webClient = builder.baseUrl("http://user-service").build();
    }
    public Mono<UserDto> getUser(Long id) {
        return webClient.get()
            .uri("/users/{id}", id)
            .retrieve()
            .bodyToMono(UserDto.class);
    }
}
```

For synchronous blocking calls (if necessary), call .block() but beware of performance.

RestTemplate (legacy):

```java
@Bean
@LoadBalanced
public RestTemplate restTemplate() { return new RestTemplate(); }
// then use service name: restTemplate.getForObject("http://user-service/users/1", User.class);
```

6.1.2 OpenFeign (Declarative REST Client)

Spring Cloud OpenFeign integrates with Eureka and Ribbon (or Spring Cloud LoadBalancer) for client‑side load balancing.

```java
@FeignClient(name = "user-service")
public interface UserClient {
    @GetMapping("/users/{id}")
    UserDto getUser(@PathVariable("id") Long id);
}
```

Enable Feign with @EnableFeignClients. It automatically creates proxy implementations.

6.1.3 gRPC (High‑Performance RPC)

gRPC uses Protocol Buffers (protobuf) for binary serialization, supports bi‑directional streaming, and is language‑agnostic. Spring Boot integration via grpc-spring-boot-starter.

Define .proto files, generate stubs, implement service:

```java
@GrpcService
public class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase {
    @Override
    public void getUser(GetUserRequest request, StreamObserver<UserResponse> responseObserver) {
        // ...
    }
}
```

gRPC is more efficient than REST for high‑throughput internal communication.

6.2 Asynchronous Communication

6.2.1 Messaging with Spring Cloud Stream

Spring Cloud Stream provides a binder abstraction for RabbitMQ, Apache Kafka, and others. It promotes functional programming model (supplier, function, consumer).

Example with Kafka:

```java
@SpringBootApplication
public class OrderServiceApplication {
    public static void main(String[] args) { SpringApplication.run(...); }

    @Bean
    public Function<Order, OrderConfirmation> processOrder() {
        return order -> {
            // business logic
            return new OrderConfirmation(order.getId(), "CONFIRMED");
        };
    }
}
```

Configuration:

```yaml
spring.cloud.stream.bindings.processOrder-in-0.destination: orders
spring.cloud.stream.bindings.processOrder-out-0.destination: orderConfirmations
spring.cloud.stream.kafka.binder.brokers: localhost:9092
```

6.2.2 Event‑Driven Architecture

Services publish domain events (e.g., OrderPlaced, PaymentReceived) to a message broker. Subscribing services react accordingly, achieving loose coupling and eventual consistency.

Design considerations:

· Idempotency: guarantee processing exactly‑once (or at‑least‑once with idempotent consumers).
· Event Schema Evolution: use schema registry (e.g., Confluent Schema Registry) to manage Avro/Protobuf schemas.
· Dead Letter Queues (DLQ): handle messages that cannot be processed after retries.
· Ordering: ensure events for a given entity (e.g., one order) are processed in order (Kafka partitions keyed by entity id).

6.2.3 Message Ordering and Reliability

· Kafka: partitions guarantee order per key.
· RabbitMQ: queues preserve order, but multiple consumers can affect.
· Idempotent consumers track already processed message IDs (e.g., in Redis or a processed_events table).

---

7. Service Discovery

In dynamic environments, services need to locate each other without hardcoded IP addresses.

7.1 Client‑Side Discovery with Eureka

· Eureka Server (@EnableEurekaServer) holds registry of service instances.
· Eureka Client (@EnableDiscoveryClient) registers itself and queries the registry.
· Client‑side load balancing: Spring Cloud LoadBalancer (replaces Ribbon) integrated with RestTemplate/WebClient.

Configuration:

```yaml
# Eureka Server
server.port=8761
eureka.client.register-with-eureka=false
eureka.client.fetch-registry=false
```

```yaml
# Client (user-service)
spring.application.name=user-service
eureka.client.service-url.defaultZone=http://localhost:8761/eureka/
```

Load balanced WebClient:

```java
@Bean
@LoadBalanced
public WebClient.Builder webClientBuilder() { return WebClient.builder(); }
// Then use service name in URI: webClient.get().uri("http://user-service/...")
```

7.2 Alternatives: Consul, Zookeeper

Spring Cloud supports Consul (spring-cloud-starter-consul-discovery) and Zookeeper as service registries. The pattern remains the same.

7.3 Kubernetes‑Native Service Discovery

In Kubernetes, the kube-dns and Service resources provide built‑in service discovery. Using spring-cloud-kubernetes, Spring Boot can discover services via Kubernetes API without Eureka.

---

8. API Gateway

The API Gateway is the single entry point for external clients. It routes requests to backend microservices and handles cross‑cutting concerns.

8.1 Spring Cloud Gateway

Built on Spring WebFlux, it is reactive and non‑blocking.

```yaml
spring:
  cloud:
    gateway:
      routes:
        - id: user-service
          uri: lb://user-service   # load balanced via discovery
          predicates:
            - Path=/api/users/**
          filters:
            - StripPrefix=1
```

Add spring-cloud-starter-gateway. It auto‑configures with Eureka.

8.2 Route Predicates and Filters

· Predicates: Path, Method, Header, Query, Cookie, Host, RemoteAddr, etc.
· Filters: AddRequestHeader, AddRequestParameter, SetStatus, RedirectTo, PrefixPath, StripPrefix, Retry, RequestRateLimiter, CircuitBreaker.
· Global Filters: applied to all routes (can be customized).

8.3 Rate Limiting with Redis

```yaml
filters:
  - name: RequestRateLimiter
    args:
      redis-rate-limiter.replenishRate: 10
      redis-rate-limiter.burstCapacity: 20
```

Requires spring-boot-starter-data-redis-reactive and a ReactiveRedisConnectionFactory.

8.4 Circuit Breaker in Gateway

Combine with Resilience4j:

```yaml
filters:
  - name: CircuitBreaker
    args:
      name: userServiceCB
      fallbackUri: forward:/fallback/user
```

8.5 Custom Gateway Filters

Implement GatewayFilter or GlobalFilter for cross‑cutting logic.

```java
@Component
public class AuthGlobalFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        // Check Authorization header, validate JWT, etc.
        return chain.filter(exchange);
    }
    @Override
    public int getOrder() { return -1; }
}
```

---

9. Configuration Management

9.1 Spring Cloud Config Server

Centralized configuration stored in Git, Vault, or a file system.

· Server: @EnableConfigServer
  ```yaml
  spring.cloud.config.server.git.uri=https://github.com/myorg/config-repo
  spring.cloud.config.server.git.searchPaths= '{application}'
  ```
· Client: bootstrap configuration (Boot 2.x) or spring.config.import=configserver:http://localhost:8888 (Boot 3.x).
  ```yaml
  spring.application.name=user-service
  spring.cloud.config.uri=http://localhost:8888
  ```

Properties are resolved per {application}-{profile}.yml.

9.2 Refresh, Bus, and Vault Integration

· @RefreshScope on beans that need to be updated without restart. Trigger refresh via POST /actuator/refresh.
· Spring Cloud Bus links multiple instances to a message broker; a refresh event on one instance propagates to all.
· Vault backend for secrets (tokens, passwords) with dynamic secrets and lease management.

9.3 Kubernetes ConfigMaps & Secrets

If deploying to Kubernetes, you can use spring-cloud-kubernetes to load properties from ConfigMaps and Secrets directly, bypassing a config server.

---

10. Resilience & Fault Tolerance

10.1 Circuit Breaker (Resilience4j)

States: CLOSED (normal) → OPEN (after failure threshold exceeded, rejects calls) → HALF_OPEN (after wait time, allows limited test calls) → CLOSED or OPEN.

Annotate methods:

```java
@CircuitBreaker(name = "userService", fallbackMethod = "getUserFallback")
public UserDto getUser(Long id) {
    return webClient.get().uri("/users/{id}", id).retrieve().bodyToMono(UserDto.class).block();
}
public UserDto getUserFallback(Long id, Exception ex) { return new UserDto(id, "Fallback"); }
```

Or use CircuitBreakerFactory programmatically.

10.2 Other Resilience4j Modules

· Retry: @Retry(name = "userService", fallbackMethod = "...")
· RateLimiter: @RateLimiter(name = "userService")
· Bulkhead: @Bulkhead(name = "userService") (limits concurrent calls)
· TimeLimiter: @TimeLimiter(name = "userService") (sets timeout)

Configuration in application.yml:

```yaml
resilience4j:
  circuitbreaker:
    instances:
      userService:
        sliding-window-size: 10
        failure-rate-threshold: 50
        wait-duration-in-open-state: 10s
        permitted-number-of-calls-in-half-open-state: 3
  retry:
    instances:
      userService:
        max-attempts: 3
        wait-duration: 1s
```

10.3 Fallback and Exception Handling

Fallback methods must match the original method signature (plus an extra Exception parameter if desired). They provide graceful degradation.

---

11. Distributed Tracing & Observability

11.1 Micrometer Tracing with Zipkin

Add micrometer-tracing-bridge-brave and zipkin-reporter-brave. Each service propagates trace and span IDs via HTTP headers (b3 format). Zipkin collects and visualizes traces.

```yaml
management.tracing.sampling.probability=1.0
management.zipkin.tracing.endpoint=http://localhost:9411/api/v2/spans
```

11.2 OpenTelemetry

Use micrometer-tracing-bridge-otel for OpenTelemetry integration. Can export to Jaeger, Zipkin, or any OTLP‑compatible backend.

11.3 Centralized Logging

· Use logstash-logback-encoder to format logs as JSON, including traceId and spanId.
· Ship logs to ELK (Elasticsearch, Logstash, Kibana) or Grafana Loki.
· Correlate logs and traces in UI.

---

12. Security in Microservices

12.1 OAuth2 & JWT Basics

· Authorization Server (Keycloak, Okta, Spring Authorization Server) issues access tokens (JWTs).
· Resource Server validates tokens on each request.
· Client (API Gateway or backend service) presents token.

12.2 Keycloak as Authorization Server

Set up a realm, client, and users. Obtain tokens via grant_type=password or client_credentials.

12.3 Resource Server Configuration

```java
@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth.anyRequest().authenticated())
            .oauth2ResourceServer(oauth2 -> oauth2.jwt(Customizer.withDefaults()));
        return http.build();
    }
}
```

```yaml
spring.security.oauth2.resourceserver.jwt.issuer-uri=http://auth-server/realms/myrealm
```

12.4 Inter‑Service Authentication

· Propagate JWT: the initial caller's token can be passed downstream using Feign interceptor or WebClient filter.
· Client Credentials Grant: service calls auth server to obtain its own token (machine‑to‑machine).
· Mutual TLS (mTLS): services present X.509 certificates for authentication at transport level.

12.5 API Gateway as Enforcement Point

The gateway can validate JWTs and reject unauthenticated requests before they reach backend services. Spring Cloud Gateway can use OAuth2ResourceServer support or a custom global filter.

---

13. Data Management Patterns

13.1 Database per Service

Each service owns its database and schema. No direct database access from other services.

Benefits: loose coupling, independent scalability.
Challenges: cross‑service queries, data consistency.

13.2 Shared Database (Anti‑pattern)

Sharing a database causes tight coupling and defeats the purpose of microservices. Avoid.

13.3 Saga Pattern – Distributed Transactions

Sagas coordinate a series of local transactions across services.

13.3.1 Choreography‑Based Saga

Each service publishes an event after its local transaction, which triggers the next service. If a failure occurs, compensating events are published to roll back.

Example:

· Order Service → OrderPlaced event.
· Inventory Service reserves stock → StockReserved event (or StockInsufficient).
· Payment Service processes payment → PaymentProcessed.
· On failure, PaymentFailed triggers compensating CancelOrder and ReleaseStock.

13.3.2 Orchestration‑Based Saga (with Axon)

A central Saga object (orchestrator) sends commands and listens to events, deciding the next step.

Axon Framework provides DDD and CQRS support. A Saga is a long‑running transaction:

```java
@Saga
public class OrderSaga {
    @StartSaga
    @SagaEventHandler(associationProperty = "orderId")
    public void on(OrderCreatedEvent event) {
        commandGateway.send(new ReserveStockCmd(...));
    }
    @SagaEventHandler(associationProperty = "orderId")
    public void on(StockReservedEvent event) {
        commandGateway.send(new ProcessPaymentCmd(...));
    }
    // compensating actions for failure
}
```

13.4 CQRS & Event Sourcing

· CQRS: separate read and write models. Commands update the write model, events are published, and read models are updated asynchronously (often in a different database optimized for queries).
· Event Sourcing: the state is stored as a sequence of events. The current state is reconstructed by replaying events. This works well with CQRS.

Axon Framework or Eventuate implement these patterns.

13.5 Transactional Outbox & Change Data Capture

To reliably publish events after a database transaction (without 2‑phase commit), use the Outbox pattern: write events to an outbox table in the same local transaction. A separate process (e.g., Debezium) tails the database log and publishes events to Kafka.

Debezium is a CDC (Change Data Capture) tool that reads the database transaction log and streams changes to Kafka topics. This enables reliable, decoupled event publishing.

---

14. Testing Microservices

14.1 Unit, Integration, End‑to‑End

· Unit Tests: test service logic in isolation; mock dependencies (Mockito). No Spring context.
· Integration Tests: @SpringBootTest with TestRestTemplate or WebTestClient. Use Testcontainers for databases, message brokers.
· End‑to‑End Tests: deploy the full system in a staging environment; use Selenium, Cypress, or Postman collections.

14.2 Contract Testing (Spring Cloud Contract)

Ensures that the provider and consumer agree on the API.

Provider: defines contracts (Groovy/YAML) that specify request/response. Spring Cloud Contract generates tests that verify the provider. It publishes stubs as a JAR.

Consumer: uses @AutoConfigureStubRunner to load the stubs and test that the client correctly parses responses.

```groovy
// contract.groovy
Contract.make {
    request { method GET(); url '/users/1' }
    response { status 200; body([id:1, name:"John"]) }
}
```

This prevents integration drift without full end‑to‑end tests.

14.3 Testcontainers

Spin up real Docker containers for integration tests: new MongoDBContainer(DockerImageName.parse("mongo:6.0")). Used with @Testcontainers.

---

15. Containerization & Orchestration

15.1 Dockerfile Best Practices

· Use multi‑stage builds to separate build and runtime.
· Use a minimal base image (e.g., eclipse-temurin:17-jre-alpine).
· Run as non‑root user.
· Use layered JARs to optimize Docker cache (spring-boot-maven-plugin with <layers><enabled>true</enabled></layers>).

15.2 Docker Compose for Local Development

Define all services, databases, and brokers in docker-compose.yml. Not for production.

15.3 Kubernetes Essentials

· Deployment: manages pods and replicas.
· Service: exposes pods internally (ClusterIP) or externally (NodePort, LoadBalancer).
· Ingress: routes external HTTP traffic to services.
· ConfigMap & Secret: configuration objects.
· Namespaces for isolation.

15.4 Health Probes

Kubernetes uses liveness and readiness probes. Spring Boot Actuator provides:

```yaml
livenessProbe:
  httpGet:
    path: /actuator/health/liveness
    port: 8080
readinessProbe:
  httpGet:
    path: /actuator/health/readiness
    port: 8080
```

15.5 Service Mesh (Istio, Linkerd)

Service mesh adds a sidecar proxy (Envoy) to each pod, handling service‑to‑service communication, security (mTLS), retries, circuit breaking, and telemetry without code changes.

Spring Boot integrates with the mesh; no special code needed, but the mesh provides the resilience features.

---

16. Deployment Strategies

· Blue‑Green: two identical environments (blue = current, green = new). Traffic switched after validation.
· Canary: a small percentage of users get the new version; gradually increase.
· Rolling: update instances one by one (Kubernetes default).
· A/B Testing: similar to canary, but based on user segments for feature testing.

Kubernetes supports rolling updates natively; Istio/Flagger enable canary deployments.

---

17. Monitoring & Alerting

17.1 Prometheus, Grafana, Micrometer

· Micrometer exports metrics; add micrometer-registry-prometheus.
· Prometheus scrapes /actuator/prometheus.
· Grafana dashboards visualize metrics (JVM, HTTP, custom business metrics).

Custom metric:

```java
Counter ordersPlaced = Counter.builder("orders.placed").register(meterRegistry);
ordersPlaced.increment();
```

17.2 Alerting

Prometheus Alertmanager sends alerts based on rules (e.g., error rate > 5%, latency > 1s). Notifications via Slack, email, PagerDuty.

---

18. Event‑Driven Architecture & Advanced Patterns

18.1 Domain Events & Event Sourcing

Every state change is captured as an event. Events are the source of truth. The current state is derived by replaying events. This naturally enables audit trails, temporal queries, and complete rebuild of read models.

18.2 Change Data Capture (Debezium)

Debezium tails the database transaction log and pushes row‑level changes to Kafka. This is an alternative to the Outbox pattern for publishing events, but it exposes internal schema.

18.3 Backpressure

Reactive streams (Project Reactor) provide backpressure – the consumer controls the rate at which it receives data. Spring WebFlux and Spring Cloud Stream reactive bindings support this.

---

19. Infrastructure & DevOps

19.1 CI/CD Pipelines

Automated pipeline (GitHub Actions, GitLab CI, Jenkins) that:

· Builds and unit tests.
· Runs integration tests (Testcontainers).
· Publishes Docker images to a registry.
· Deploys to Kubernetes (kubectl apply, Helm upgrade).

19.2 GitOps (ArgoCD, Flux)

The desired state of the cluster is declared in a Git repository. An operator (ArgoCD) ensures the cluster matches the Git state. All changes are made via pull requests, providing auditability.

---

20. Best Practices, Anti‑patterns, and Interview Q&A

Best Practices:

· Design for failure (timeouts, retries, circuit breakers).
· Use API versioning.
· Centralized logging and tracing.
· Automate everything.
· Keep services small, but not nano.
· Use database per service.
· Ensure backward compatibility.

Anti‑patterns:

· Shared database.
· Distributed monolith (tight coupling).
· Over‑communicating fine‑grained services (chatty).
· Inadequate monitoring.

Interview Questions:

1. What are the pros and cons of microservices?
2. Explain service discovery, configuration management, and API gateway in a microservices ecosystem.
3. How do you handle distributed transactions? (Saga, Outbox)
4. What is the Circuit Breaker pattern? States?
5. How do you secure inter‑service communication?
6. Compare REST, gRPC, and messaging for microservice communication.
7. What is CQRS and Event Sourcing? When would you apply them?
8. How do you test microservices? What is contract testing?
9. Explain the role of Docker and Kubernetes.
10. How do you implement a CI/CD pipeline for microservices?

---

This guide provides an exhaustive, layered exploration of microservices with Spring Boot, covering every essential topic from beginner to advanced. It is designed to be your definitive reference for building, deploying, and interviewing on modern microservices architectures.
