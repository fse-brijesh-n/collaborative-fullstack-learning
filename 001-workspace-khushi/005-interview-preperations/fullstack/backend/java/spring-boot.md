```
1. Q: What is Spring Boot and how does it simplify application development?
   A: Spring Boot is a framework that simplifies the development of Java applications by providing embedded servers, auto-configuration, and a set of pre-built features.

2. Q: What are the main features of Spring Boot?
   A: Features include auto-configuration, embedded servers, Spring Boot Starter dependencies, Spring Boot Actuator, and Spring Boot CLI.

3. Q: What is the difference between Spring and Spring Boot?
   A: Spring is a framework with many modules, while Spring Boot simplifies application setup with embedded servers, auto-configuration, and opinionated defaults.

4. Q: What is Spring Boot Starter?
   A: A Spring Boot Starter is a set of dependency descriptors that include common dependencies required for specific functionalities (e.g., spring-boot-starter-web).

5. Q: What is auto-configuration in Spring Boot?
   A: Auto-configuration automatically configures beans based on classpath dependencies and settings, reducing the need for manual configuration.

6. Q: How do you disable auto-configuration in Spring Boot?
   A: Use the @EnableAutoConfiguration(exclude = {ClassName.class}) or @SpringBootApplication(exclude = {ClassName.class}) annotation.

7. Q: What is an embedded server in Spring Boot?
   A: An embedded server (Tomcat, Jetty, Undertow) runs within the application, eliminating the need for external deployment.

8. Q: How do you change the default port in Spring Boot?
   A: Set the property `server.port=8081` in application.properties or application.yml.

9. Q: What is the use of Spring Boot Actuator?
   A: Actuator provides endpoints for monitoring and managing a Spring Boot application, such as health checks and metrics.

10. Q: How do you enable Actuator endpoints?
    A: Add the dependency `spring-boot-starter-actuator` and configure endpoints in `application.properties`.

11. Q: What is Spring Boot DevTools?
    A: DevTools enhances developer productivity by enabling features like auto-restart, live reload, and debugging support.

12. Q: How do you create a Spring Boot project?
    A: Use Spring Initializr (start.spring.io) or create a project manually with Maven/Gradle dependencies.

13. Q: What is @SpringBootApplication?
    A: It is a combination of @Configuration, @EnableAutoConfiguration, and @ComponentScan, serving as the entry point for Spring Boot applications.

14. Q: How do you handle exceptions globally in Spring Boot?
    A: Use @ControllerAdvice and @ExceptionHandler to define global exception-handling logic.

15. Q: What is the purpose of @RestController?
    A: It combines @Controller and @ResponseBody, simplifying RESTful service creation.

16. Q: What is the difference between @Component, @Service, and @Repository?
    A: All are Spring-managed beans, but @Service is for business logic, @Repository is for database operations, and @Component is a generic stereotype.

17. Q: How do you connect a Spring Boot application to a database?
    A: Configure `spring.datasource.url`, `username`, and `password` in application.properties and use Spring Data JPA or JDBC.

18. Q: What is Spring Data JPA?
    A: It is a module that simplifies database interactions using repositories, eliminating boilerplate code.

19. Q: How do you define an entity in Spring Boot?
    A: Use @Entity, @Table, and @Id annotations in a class representing a database table.

20. Q: What is the difference between CrudRepository and JpaRepository?
    A: JpaRepository extends CrudRepository and provides additional features like pagination and batch processing.

21. Q: How do you implement pagination in Spring Boot?
    A: Use Pageable in repository methods, e.g., `findAll(Pageable pageable)`.

22. Q: What is Spring Boot Security?
    A: It provides authentication and authorization features using filters and configurations.

23. Q: How do you secure a REST API in Spring Boot?
    A: Use Spring Security with JWT, OAuth2, or Basic Authentication.

24. Q: What is JWT authentication?
    A: JWT (JSON Web Token) is a token-based authentication mechanism used to secure APIs.

25. Q: How do you enable CORS in a Spring Boot application?
    A: Use `@CrossOrigin` annotation or configure CORS globally via WebMvcConfigurer.

26. Q: What is Spring Boot caching?
    A: It provides caching support using @Cacheable, @CacheEvict, and @EnableCaching annotations.

27. Q: How do you configure logging in Spring Boot?
    A: Use application.properties (logging.level.root=INFO) or logback.xml.

28. Q: What is Spring Boot Microservices?
    A: A way to develop independent, scalable services that communicate over REST APIs.

29. Q: How do you enable Swagger in a Spring Boot application?
    A: Add Springfox dependency and annotate controllers with @Api and @ApiOperation.

30. Q: What is the difference between synchronous and asynchronous processing in Spring Boot?
    A: Synchronous processing blocks execution until a task completes, while asynchronous processing executes tasks concurrently using @Async.

31. Q: What is @Bean in Spring Boot?
    A: It defines a bean in a Spring configuration class.

32. Q: What is the use of @Primary annotation?
    A: It marks a bean as the primary candidate for autowiring when multiple beans of the same type exist.

33. Q: How does Spring Boot handle circular dependencies?
    A: By throwing a BeanCurrentlyInCreationException or resolving it using @Lazy.

34. Q: What is an ApplicationRunner in Spring Boot?
    A: It is an interface used to execute logic after the application starts.

35. Q: What is Spring Boot Scheduler?
    A: It schedules tasks using @Scheduled annotation with cron expressions.

36. Q: How do you enable asynchronous processing in Spring Boot?
    A: Use @EnableAsync and @Async annotations.

37. Q: What is the difference between @Transactional and @EnableTransactionManagement?
    A: @Transactional manages individual transactions, while @EnableTransactionManagement enables transaction support.

38. Q: How do you handle properties in Spring Boot?
    A: Use @Value annotation or bind properties using @ConfigurationProperties.

39. Q: What is Circuit Breaker in Spring Boot?
    A: A resilience pattern to prevent service failures using Hystrix or Resilience4j.

40. Q: What is Feign Client in Spring Boot?
    A: A declarative HTTP client used in microservices for inter-service communication.

41. Q: How do you monitor a Spring Boot application?
    A: Use Spring Boot Actuator, Micrometer, Prometheus, and Grafana.

42. Q: What is Spring Cloud?
    A: It provides tools for building distributed systems and microservices.

43. Q: What is Config Server in Spring Cloud?
    A: It is a centralized configuration management service for microservices.

44. Q: How do you handle transactions in Spring Boot?
    A: Using @Transactional annotation for atomicity.

45. Q: What is the difference between @PathVariable and @RequestParam?
    A: @PathVariable extracts values from URL path, while @RequestParam extracts query parameters.

46. Q: How do you handle file uploads in Spring Boot?
    A: Use MultipartFile with @RequestParam in controllers.

47. Q: What is Spring Boot WebFlux?
    A: It is a reactive programming framework for handling asynchronous and event-driven applications.

48. Q: What is a Profile in Spring Boot?
    A: Profiles define environment-specific configurations using @Profile annotation.

49. Q: How do you configure environment variables in Spring Boot?
    A: Use application.properties, system properties, or environment variables.

50. Q: What is Spring Boot Admin?
    A: A UI-based monitoring tool for managing Spring Boot applications.
```
