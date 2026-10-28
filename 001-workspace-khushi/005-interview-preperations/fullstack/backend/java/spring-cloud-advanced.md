# Spring Cloud Advanced Interview Q&A

## Overview
Spring Cloud provides tools for building microservices architectures including service discovery, configuration management, resilience patterns, load balancing, and distributed tracing.

---

## Interview Questions & Answers

1. **What is Spring Cloud?**
   - Spring Cloud provides tools for building cloud-native applications with microservices patterns.

2. **What is Service Discovery?**
   - Automatic detection and location of services in a distributed system.

3. **What are Service Discovery Servers?**
   - Eureka (Netflix), Consul (HashiCorp), Zookeeper, etcd.

4. **What is Eureka?**
   - Spring Cloud service registry for service discovery and load balancing.

5. **How does Eureka work?**
   - Services register with Eureka Server; clients query Eureka for service locations.

6. **What is Eureka Client?**
   - Spring Boot application registering itself with Eureka Server.

7. **What is Heartbeat in Eureka?**
   - Periodic signals from clients to Eureka Server confirming service is alive.

8. **What is Eureka Server?**
   - Central registry storing service metadata and availability.

9. **What is Spring Cloud Config?**
   - Centralized configuration management for distributed systems.

10. **What is Config Server?**
    - Central server managing configurations for multiple applications.

11. **What is Config Client?**
    - Application retrieving configuration from Config Server.

12. **What configuration sources does Config Server support?**
    - Git, filesystem, Vault, database, property files.

13. **What is @RefreshScope?**
    - Annotation enabling property refresh without application restart.

14. **What is Configuration Refresh?**
    - Reloading properties from Config Server without restarting.

15. **What is Spring Cloud LoadBalancer?**
    - Client-side load balancer for distributing requests across services.

16. **What load balancing strategies exist?**
    - Round Robin (default), Random, Weighted Response Time.

17. **What is Feign Client?**
    - Declarative HTTP client for microservice communication.

18. **What is @FeignClient?**
    - Annotation creating Feign client interface for REST calls.

19. **What is Circuit Breaker?**
    - Resilience pattern preventing cascading failures.

20. **What is Hystrix?**
    - Netflix circuit breaker library (deprecated, replaced by Resilience4j).

21. **What is Resilience4j?**
    - Lightweight resilience library with circuit breaker, retry, timeout.

22. **What is @CircuitBreaker?**
    - Annotation implementing circuit breaker on methods.

23. **What are Circuit Breaker States?**
    - Closed (normal), Open (failing, reject requests), Half-Open (testing).

24. **What is @Retry?**
    - Annotation retrying failed method invocation.

25. **What is @Timeout?**
    - Annotation setting maximum execution time for method.

26. **What is @Bulkhead?**
    - Annotation isolating components to prevent cascading failures.

27. **What is Thread Pool Isolation?**
    - Bulkhead using separate thread pools for different service calls.

28. **What is Semaphore Isolation?**
    - Bulkhead using semaphores limiting concurrent calls.

29. **What is Distributed Tracing?**
    - Tracking request path through multiple services.

30. **What is Spring Cloud Sleuth?**
    - Distributed tracing framework for Spring Cloud applications.

31. **What is Trace ID?**
    - Unique identifier following request across services.

32. **What is Span ID?**
    - Unique identifier for specific operation within trace.

33. **What is Zipkin?**
    - Distributed tracing system visualizing service interactions.

34. **What is OpenTelemetry?**
    - Standard for instrumenting, generating, collecting telemetry.

35. **What is Spring Cloud Bus?**
    - Broadcast channel for distributed configuration updates.

36. **What is Spring Cloud Stream?**
    - Framework for building event-driven microservices.

37. **What are Bindings in Spring Cloud Stream?**
    - Input (source) and Output (destination) connections to message brokers.

38. **What is @StreamListener?**
    - Annotation listening to messages on input binding.

39. **What is Spring Cloud Gateway?**
    - API Gateway for routing, filtering, and managing requests.

40. **What is Route in Gateway?**
    - Rule for matching and routing requests to microservices.

41. **What are Gateway Filters?**
    - Components processing requests/responses passing through gateway.

42. **What are Global Filters in Gateway?**
    - Filters applying to all routes in gateway.

43. **What is Rate Limiting in Gateway?**
    - Restricting requests using RequestRateLimiterGatewayFilterFactory.

44. **What is OAuth2 in Spring Cloud?**
    - OAuth2 server and resource server for microservices security.

45. **What is Resource Server?**
    - Server protecting resources and validating access tokens.

46. **What is Authorization Server?**
    - Server issuing tokens for authentication and authorization.

47. **What is JWT in Spring Cloud Security?**
    - Stateless authentication using JSON Web Tokens.

48. **What is Spring Cloud Security?**
    - Security framework for microservices (deprecated in favor of Spring Security).

49. **What is @EnableOAuth2Sso?**
    - Annotation enabling OAuth2 Single Sign-On (deprecated).

50. **What is Distributed Session?**
    - Session state shared across multiple instances.

51. **What is Session Replication?**
    - Copying session data across instances for high availability.

52. **What is Spring Session?**
    - Framework for managing distributed sessions.

53. **What is @EnableSpringHttpSession?**
    - Annotation enabling Spring HTTP session support.

54. **What are Session Stores?**
    - Redis, JDBC, MongoDB for persisting session data.

55. **What is Metrics Collection?**
    - Gathering metrics for monitoring and alerting.

56. **What is Micrometer?**
    - Metrics instrumentation library for Spring applications.

57. **What is Actuator Endpoint?**
    - HTTP endpoint exposing application metrics and information.

58. **What is Health Indicator?**
    - Component reporting health status of service or dependency.

59. **What is Service Mesh?**
    - Infrastructure layer for service-to-service communication.

60. **What is Istio?**
    - Popular service mesh providing traffic management and security.

---

## Spring Cloud Ecosystem

| Component | Purpose |
|-----------|---------|
| **Eureka** | Service Discovery |
| **Config** | Centralized Configuration |
| **LoadBalancer** | Client-side Load Balancing |
| **Feign** | Declarative HTTP Client |
| **Circuit Breaker** | Resilience Pattern |
| **Gateway** | API Gateway |
| **Stream** | Event-driven Microservices |
| **Sleuth** | Distributed Tracing |
| **Session** | Distributed Sessions |

---

## Microservices Patterns

| Pattern | Purpose |
|---------|---------|
| **Service Discovery** | Locate services dynamically |
| **Circuit Breaker** | Prevent cascading failures |
| **Retry** | Handle transient failures |
| **Timeout** | Prevent hanging requests |
| **Bulkhead** | Isolate failures |
| **API Gateway** | Single entry point |
| **Event-driven** | Asynchronous communication |
| **Distributed Tracing** | Track requests across services |

---

## Best Practices

1. Use service discovery for dynamic environments
2. Implement circuit breakers for resilience
3. Centralize configuration management
4. Monitor services with metrics and tracing
5. Implement proper authentication/authorization
6. Use API Gateway for cross-cutting concerns
7. Implement distributed transactions carefully
8. Use message-driven communication
9. Monitor distributed transactions
10. Document service contracts

---

## Common Mistakes

1. Not implementing circuit breakers
2. Synchronous communication overuse
3. Ignoring service discovery
4. Missing distributed tracing
5. Poor error handling
6. Inadequate monitoring
7. Not centralizing configuration
8. Security overlooked
9. Tight coupling between services
10. No service versioning strategy

---

## Summary

Master Spring Cloud components: Eureka for service discovery, Config for configuration, LoadBalancer for load balancing, Feign for HTTP clients, Circuit Breaker for resilience, Gateway for API routing, and Sleuth for distributed tracing. Implement microservices patterns and ensure proper monitoring, security, and resilience.

---

## References

- [Spring Cloud Documentation](https://spring.io/projects/spring-cloud)
- [Microservices Patterns](https://microservices.io/patterns/index.html)
- [Resilience4j Documentation](https://resilience4j.readme.io/)
- [Spring Cloud Gateway](https://cloud.spring.io/spring-cloud-gateway/)
