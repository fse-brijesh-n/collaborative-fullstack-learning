Spring Framework In-Depth Guide (Without Spring Boot)

This guide covers the core Spring Framework (including Core, AOP, MVC, Data Access, Security) in exhaustive detail. No Spring Boot is included. Every concept is broken down into its smallest components, with internal mechanisms, configuration options, and code examples. Ideal for deep-dive interview preparation and pure Spring applications (WAR deployments, XML/annotation-based configuration).

---

1. Introduction to Spring Framework

Spring is a lightweight, modular application framework that provides a comprehensive programming and configuration model for Java applications. It addresses the plumbing of enterprise applications, allowing developers to focus on business logic.

Key characteristics:

· Non-invasive: does not force you to extend framework classes or implement specific interfaces (in most cases).
· POJO-based: works with plain old Java objects.
· Modular: composed of ~20 modules grouped into Core Container, AOP, Data Access/Integration, Web, Test, etc.
· IoC Container: manages beans and their wiring.
· AOP: declarative services (transactions, security) via proxies.
· Portable: runs on any Java EE server, embedded in Tomcat/Jetty, or standalone.

Modules overview:

· Core Container: spring-core, spring-beans, spring-context, spring-expression (SpEL).
· AOP: spring-aop, aspectjrt, aspectjweaver (optional).
· Data Access/Integration: spring-jdbc, spring-orm, spring-tx, spring-jms.
· Web: spring-web, spring-webmvc, spring-websocket, spring-webmvc-portlet (deprecated).
· Test: spring-test.

Dependencies: We'll use Maven/Gradle artifacts like org.springframework:spring-context, spring-webmvc, etc.

---

2. Inversion of Control (IoC) & Dependency Injection (DI)

2.1 The IoC Principle

In traditional programming, objects create their own dependencies (using new). In IoC, the framework creates and wires objects. The control of object creation and lifecycle is inverted from the application code to the container.

Benefits:

· Loose coupling – classes depend on interfaces, not concrete implementations.
· Easier testing – dependencies can be mocked.
· Centralized configuration.

2.2 Dependency Injection Types

Spring supports three injection styles:

1. Constructor Injection – all required dependencies are supplied via the constructor. Preferred for mandatory dependencies, immutability, and testability.
2. Setter Injection – optional dependencies injected via setter methods.
3. Field Injection – using @Autowired on fields (convenient but reduces testability without Spring container).

Example (Constructor Injection):

```java
public class UserService {
    private final UserRepository userRepository;
    // constructor
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
```

With XML configuration, <constructor-arg>; with annotations, @Autowired on constructor (or @Inject).

2.3 Auto-wiring Modes

Spring can automatically wire bean collaborations by inspecting the container's contents. Modes:

· no – default, must manually specify refs.
· byName – autowire by property name matching bean id.
· byType – if exactly one bean of property type exists, inject it; else exception.
· constructor – analogous to byType but for constructor arguments.

In annotation-based config, @Autowired behaves like byType by default, with @Qualifier for disambiguation.

---

3. The Spring IoC Container

The container is represented by the org.springframework.beans.factory.BeanFactory interface and its subinterface org.springframework.context.ApplicationContext.

3.1 BeanFactory

The root interface for accessing a Spring container. Provides basic bean management:

· getBean(String name)
· containsBean(String name)
· isSingleton(String name)

Implementations:

· DefaultListableBeanFactory: the most common implementation, used by the context internally.
· XmlBeanFactory (deprecated) – used for XML configuration.

BeanFactory lazily instantiates singleton beans (default). Eager loading can be set via lazy-init="false".

3.2 ApplicationContext

Extends BeanFactory and adds enterprise-specific functionality:

· Internationalization (i18n) via MessageSource.
· Event publication to registered listeners.
· Resource loading (classpath, file, URL).
· AOP integration (automatic proxy creation).
· Automatic BeanPostProcessor registration.
· Automatic BeanFactoryPostProcessor registration (e.g., property placeholders).

Implementations:

· ClassPathXmlApplicationContext – from classpath XML.
· FileSystemXmlApplicationContext – from file system XML.
· AnnotationConfigApplicationContext – for @Configuration classes (Java config).
· GenericWebApplicationContext, XmlWebApplicationContext – for web.

All ApplicationContext implementations eagerly pre-instantiate singleton beans.

Creation:

```java
ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
UserService service = ctx.getBean(UserService.class);
```

3.3 Container Hierarchy

A context can be a child of another context, allowing isolated bean definitions with a common parent. In web apps, the root WebApplicationContext is the parent for dispatcher servlet contexts.

---

4. Bean Configuration

Beans are defined using metadata: XML files, annotations, or Java config.

4.1 XML Configuration

Root element <beans> with default namespace http://www.springframework.org/schema/beans.

```xml
<beans xmlns="...beans">
    <bean id="userRepository" class="com.example.InMemoryUserRepository" />
    <bean id="userService" class="com.example.UserService">
        <constructor-arg ref="userRepository" />
    </bean>
</beans>
```

Bean properties:

· id – unique identifier.
· name – one or more aliases (separated by commas, semicolons, spaces).
· class – fully qualified class name.
· scope – singleton, prototype, etc.
· init-method, destroy-method.
· lazy-init="true".

Dependency injection:

· <constructor-arg ref="beanId" /> or <constructor-arg value="literal" />.
· <property name="propertyName" ref="beanId" />.
· <list>, <set>, <map>, <props> for collections.

4.2 Annotation-Based Configuration

Spring scans the classpath for stereotypes and auto-wires.

Annotations:

· @Component – generic component.
· @Repository – DAO, adds persistence exception translation.
· @Service – business service.
· @Controller – web controller.

Enabling component scanning:

```xml
<context:component-scan base-package="com.example" />
```

Or in Java config:

```java
@Configuration
@ComponentScan("com.example")
public class AppConfig {}
```

Auto-wiring annotations:

· @Autowired on field, setter, constructor.
· @Qualifier("beanId") when multiple beans match.
· @Resource (JSR-250) – by name then by type.
· @Inject (JSR-330) – like @Autowired.

@Value: inject property values.

```java
@Value("${app.max}") private int max;
```

@Scope to change scope.

4.3 Java Configuration (JavaConfig)

Since Spring 3.0. @Configuration classes replace XML.

```java
@Configuration
public class AppConfig {
    @Bean
    public UserRepository userRepository() { return new InMemoryUserRepository(); }
    @Bean
    public UserService userService() {
        return new UserService(userRepository());
    }
}
```

@Bean marks a factory method. The container intercepts calls to @Bean methods (via CGLIB subclassing of @Configuration classes) to return the same instance (singleton by default).

@Import: combine multiple config classes.

@Profile: conditionally include beans.

4.4 Mixing Configuration Styles

You can combine XML and annotations:

· <context:annotation-config/> activates annotation processing for existing beans.
· <context:component-scan/> does that plus scanning.
· Import XML from Java config: @ImportResource("classpath:beans.xml").
· Import Java config from XML: <bean class="com.example.AppConfig"/>.

---

5. Bean Scopes

Scope Description
singleton (default) One instance per Spring container.
prototype New instance each time requested.
request One instance per HTTP request (web context).
session One instance per HTTP session.
application One per ServletContext.
websocket One per WebSocket session.

Singleton vs Prototype:

· Singleton beans are created at container startup (eager) unless lazy-init="true". They are cached for subsequent lookups.
· Prototype beans are created each time; Spring does not manage their full lifecycle – destruction callbacks are not called.
· Singleton beans can be injected with prototype beans, but the prototype will be created only once if injected via field/setter (the singleton holds the same instance). To get a new prototype each time, use method injection (@Lookup) or ObjectFactory.

Custom scopes: implement org.springframework.beans.factory.config.Scope and register.

5.1 Scope Declaration

XML:

```xml
<bean id="myBean" class="com.example.MyBean" scope="prototype" />
```

Annotation:

```java
@Component
@Scope("prototype")
public class MyBean {}
```

5.2 Scoped Proxy

When a singleton bean depends on a shorter-lived scoped bean (e.g., session), you need a proxy. In XML: <aop:scoped-proxy /> inside the bean definition. Annotation: @Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS).

---

6. Bean Lifecycle

1. Instantiation – Object created using constructor or factory method.
2. Populate properties – Dependencies injected.
3. BeanNameAware, BeanFactoryAware, ApplicationContextAware – setter methods called.
4. BeanPostProcessor – postProcessBeforeInitialization.
5. InitializingBean.afterPropertiesSet() or custom init method (@PostConstruct or init-method).
6. BeanPostProcessor – postProcessAfterInitialization.
7. Bean ready for use.
8. Destruction callbacks – DisposableBean.destroy(), custom destroy method (@PreDestroy or destroy-method), when container shuts down.

Custom initialization/destroy hooks:

· XML: init-method="init" destroy-method="cleanup" (or default-init-method/default-destroy-method at beans level).
· Annotations: @PostConstruct and @PreDestroy (JSR-250).
· Interfaces: InitializingBean, DisposableBean (not recommended, ties to Spring).

Aware interfaces for container callbacks:

· ApplicationContextAware – receive context.
· BeanNameAware – get bean name.
· BeanFactoryAware – get factory.
· MessageSourceAware, ResourceLoaderAware, etc.

---

7. Dependency Injection Details

7.1 Constructor-Based DI

Preferred for mandatory dependencies. Can have parameters resolved by type or by index/name with @ConstructorProperties. Use @Autowired on constructor (if only one constructor, it's optional in Spring 4.3+).

```java
@Component
public class MyService {
    private final MyRepository repo;
    @Autowired // optional if only one constructor
    public MyService(MyRepository repo) { this.repo = repo; }
}
```

7.2 Setter-Based DI

Used for optional dependencies.

```java
@Component
public class MyService {
    private MyRepository repo;
    @Autowired
    public void setMyRepository(MyRepository repo) { this.repo = repo; }
}
```

7.3 Field Injection

```java
@Component
public class MyService {
    @Autowired
    private MyRepository repo;
}
```

Convenient but makes unit testing without Spring container harder (use @InjectMocks or reflection). Not recommended for production.

7.4 @Qualifier and @Primary

When multiple beans of same type exist:

· @Qualifier("beanId") to specify which one.
· @Primary to make one bean the default when no qualifier specified.

7.5 @Resource (JSR-250)

@Resource(name="beanName") matches by name, then by type. Supports field and setter injection.

7.6 @Inject (JSR-330)

Works like @Autowired, with @Named for qualifier.

7.7 Lazy Initialization

@Lazy on bean definition delays creation until first request (or injection). Can be applied at injection point: @Lazy @Autowired to inject a lazy proxy.

7.8 Method Injection (@Lookup)

To get a new instance of a prototype bean from a singleton every time a method is called, use @Lookup.

```java
@Component
public abstract class CommandManager {
    @Lookup
    protected abstract Command createCommand();
}
```

Spring generates a subclass that overrides the lookup method and calls getBean().

---

8. Java-Based Configuration and @Configuration Internals

8.1 @Configuration vs @Component

@Configuration is a stereotype annotation that indicates a class declares one or more @Bean methods and may be processed by the container to generate bean definitions. @Configuration classes are full configuration classes; they are CGLIB enhanced to intercept @Bean method calls and ensure singleton semantics.

@Component alone does not trigger that enhancement; if a @Component class has @Bean methods, they are called directly (no proxy), and each call creates a new instance (not singleton).

Thus, use @Configuration for configuration classes.

8.2 CGLIB Proxying

At runtime, Spring creates a CGLIB subclass of the @Configuration class. When a @Bean method is invoked from within the configuration class, the proxy intercepts and returns the single existing bean instance if already created, or delegates to the superclass method otherwise.

Limitations:

· @Configuration class must not be final.
· Methods must be overridable (not private, final).
· To avoid CGLIB, use @Bean methods on separate @Component classes and rely on @Autowired injection.

8.3 @Import

Used to aggregate multiple configuration classes:

```java
@Configuration
@Import({ DatabaseConfig.class, SecurityConfig.class })
public class AppConfig {}
```

8.4 @Profile

Conditional bean registration based on active profiles. Can be used at class or method level.

```java
@Configuration
@Profile("dev")
public class DevConfig { ... }
```

Activate profiles via:

· context.getEnvironment().setActiveProfiles("dev")
· spring.profiles.active system property / env variable.
· -Dspring.profiles.active=dev
· Web.xml: context-param.

8.5 @PropertySource

Adds property file to Spring Environment.

```java
@Configuration
@PropertySource("classpath:app.properties")
public class AppConfig {
    @Autowired Environment env;
    @Value("${db.url}") String url;
}
```

---

9. Environment and Property Resolution

The Environment interface provides access to profiles and properties.

Properties come from multiple sources (in order):

1. JVM system properties
2. OS environment variables
3. JNDI
4. Servlet init parameters
5. Property files loaded via @PropertySource
6. Programmatic properties

PropertySourcesPlaceholderConfigurer (or <context:property-placeholder>) resolves ${...} placeholders in bean definitions and @Value annotations. In Spring 3.1+, it's automatically registered if @Configuration classes use @PropertySource, and a PropertySourcesPlaceholderConfigurer bean is present.

Example:

```xml
<context:property-placeholder location="classpath:db.properties" />
<bean id="dataSource" class="...DriverManagerDataSource">
    <property name="url" value="${db.url}" />
</bean>
```

Or using @Value:

```java
@Value("${db.url}") private String url;
```

SpEL can also resolve properties: @Value("#{environment['db.url']}").

---

10. Spring Expression Language (SpEL)

SpEL allows dynamic querying and manipulation of an object graph at runtime. It can be used in XML and annotation-based config.

Syntax: #{ expression }

Features:

· Access properties: #{ bean.property }
· Call methods: #{ myBean.calculate() }
· Operators: #{ 2 + 3 }, #{ value > 100 ? 'large' : 'small' }
· Regular expressions: #{ email matches '.+@.+\..+' }
· Collections: #{ {1,2,3} }
· Variables: #{ #root } (available in Spring Security expressions)
· Access system properties: #{ systemProperties['user.home'] }

Example:

```xml
<bean id="myBean" class="com.example.MyBean">
    <property name="max" value="#{ T(java.lang.Math).random() * 100 }" />
</bean>
```

Annotation:

```java
@Value("#{ systemProperties['user.region'] }") private String region;
```

SpEL is evaluated by the SpelExpressionParser.

---

11. Aspect-Oriented Programming (AOP) with Spring

11.1 Concepts Recap

· Aspect: Modularization of cross-cutting concern (e.g., logging, transactions).
· Join point: A point during execution (method execution, exception handler). Spring AOP only supports method execution join points.
· Advice: Action taken at a join point (Before, After, Around, etc.).
· Pointcut: Predicate matching join points. Written using AspectJ pointcut expression language.
· Introduction: Adding new methods/attributes to existing objects (declare parents).
· Target object: Object being advised.
· Proxy: Object created by AOP framework to implement aspect contracts (advice + target).
· Weaving: Linking aspects with objects (Spring performs weaving at runtime via proxies).

11.2 Enabling Spring AOP

· XML: <aop:aspectj-autoproxy />
· Java config: @EnableAspectJAutoProxy
· If you use @Configuration and component scanning, add @EnableAspectJAutoProxy.

Internally, this registers AnnotationAwareAspectJAutoProxyCreator which is a BeanPostProcessor that wraps beans with proxies.

11.3 Aspect Declarations

Aspects are ordinary classes annotated with @Aspect and @Component.

```java
@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.example.service.*.*(..))")
    public void logBefore(JoinPoint joinPoint) { ... }
}
```

Aspect instantiation models: perthis, pertarget – rarely used.

11.4 Pointcut Expressions

Spring AOP uses AspectJ pointcut expression language but only supports a subset. Common designators:

· execution(modifiers-pattern? ret-type-pattern declaring-type-pattern?name-pattern(param-pattern) throws-pattern?)
  Example: execution(public * com.example.service.*.*(..))
· within(com.example.service.*) – all methods in classes in the package.
· this(com.example.service.MyInterface) – proxy implements interface.
· target(com.example.service.MyInterface) – target object implements interface.
· args(java.lang.String) – method arguments.
· @annotation(com.example.Loggable) – method has the annotation.
· @within(com.example.Secure) – class has annotation.
· bean(beanName) – Spring bean name.

Combined with logical operators: &&, ||, !.

Common pointcut expression for all methods in service layer:
execution(* com.example..service.*.*(..))

Sharing pointcuts:

```java
@Pointcut("execution(* com.example.service.*.*(..))")
public void serviceLayer() {}

@Before("serviceLayer()")
public void logBefore(JoinPoint jp) { ... }
```

11.5 Advice Types

· @Before: run before method execution. Cannot prevent execution (except by throwing exception).
· @AfterReturning(pointcut=..., returning="result"): after successful return. Can access return value.
· @AfterThrowing(pointcut=..., throwing="ex"): after exception thrown.
· @After: after method (finally), regardless of outcome.
· @Around: surrounds method. Must call ProceedingJoinPoint.proceed(). Can modify arguments, return value, or skip execution.

```java
@Around("execution(* com.example.service.*.*(..))")
public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
    long start = System.currentTimeMillis();
    Object proceed = joinPoint.proceed();
    long executionTime = System.currentTimeMillis() - start;
    return proceed;
}
```

11.6 Advice Ordering

When multiple aspects apply at the same join point, order can be defined with @Order(priority). Lower values have higher precedence. For @Before, highest goes first; for @After, highest goes last.

11.7 Proxying Mechanisms

Spring AOP uses either JDK dynamic proxies or CGLIB.

JDK dynamic proxy: If target object implements at least one interface, by default a proxy is created that implements all interfaces. The proxy delegates to the target.

CGLIB proxy: If target class does not implement interfaces (or if proxy-target-class="true" is set), Spring creates a subclass of the target class.

Configuration:

· XML: <aop:aspectj-autoproxy proxy-target-class="true" />
· Annotation: @EnableAspectJAutoProxy(proxyTargetClass = true)

CGLIB limitations: cannot proxy final classes/methods; private methods not intercepted; constructors not intercepted.

Self-invocation problem: If a method within the target object calls another method on this, the call bypasses the proxy, so AOP advice is not applied. Use AopContext.currentProxy() or refactor.

11.8 Declarative Transaction Management via AOP

<tx:annotation-driven /> or @EnableTransactionManagement registers a transaction advisor that intercepts @Transactional methods. Internally uses AOP.

---

12. Spring MVC – Web Layer (Traditional, Non-Boot)

Spring MVC is a request-based web framework built on the Servlet API. It provides model-view-controller architecture.

12.1 DispatcherServlet

Central servlet that dispatches requests to handlers.

Web.xml configuration:

```xml
<servlet>
    <servlet-name>dispatcher</servlet-name>
    <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
    <load-on-startup>1</load-on-startup>
</servlet>
<servlet-mapping>
    <servlet-name>dispatcher</servlet-name>
    <url-pattern>/</url-pattern>
</servlet-mapping>
```

The DispatcherServlet loads its own WebApplicationContext (defaults to dispatcher-servlet.xml). This context is a child of the root context (loaded by ContextLoaderListener).

Root context setup:

```xml
<listener>
    <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
</listener>
<context-param>
    <param-name>contextConfigLocation</param-name>
    <param-value>/WEB-INF/root-context.xml</param-value>
</context-param>
```

12.2 Request Processing Flow

1. DispatcherServlet receives request.
2. HandlerMapping determines which controller method handles request.
3. DispatcherServlet invokes the handler via HandlerAdapter.
4. Handler returns a ModelAndView or @ResponseBody.
5. If ModelAndView, ViewResolver resolves logical view name to actual View.
6. View renders the model.
7. Response sent.

12.3 Controllers

Marked with @Controller and @RequestMapping at class/method level.

```java
@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public String getUser(@PathVariable Long id, Model model) {
        model.addAttribute("user", userService.findById(id));
        return "userView"; // logical view name
    }
}
```

Return types:

· String – logical view name.
· ModelAndView – explicit.
· void – response handled by HttpServletResponse.
· @ResponseBody – response body directly (REST).
· HttpEntity/ResponseEntity – full HTTP response.
· View object.

Method arguments: @PathVariable, @RequestParam, @RequestHeader, @CookieValue, @RequestBody, HttpServletRequest, HttpSession, Principal, etc.

12.4 View Resolvers

Interface ViewResolver maps logical view names to actual views.

Common implementations:

· InternalResourceViewResolver – for JSPs.
  ```xml
  <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
      <property name="prefix" value="/WEB-INF/views/" />
      <property name="suffix" value=".jsp" />
  </bean>
  ```
· BeanNameViewResolver – maps to bean names.
· ResourceBundleViewResolver – from properties file.
· ContentNegotiatingViewResolver – chooses based on Accept header or file extension.

Chaining: multiple resolvers can be configured in order.

12.5 Handler Mappings

Determine which handler to invoke for a request.

· RequestMappingHandlerMapping – for @RequestMapping annotations (default with <mvc:annotation-driven/>).
· SimpleUrlHandlerMapping – explicit URL mapping to bean names.
· BeanNameUrlHandlerMapping – maps URLs to bean names matching the URL pattern.

12.6 Handler Adapters

Invoke the handler. RequestMappingHandlerAdapter for @RequestMapping methods.

12.7 Interceptors

HandlerInterceptor interface allows pre/post handling of requests.

```java
public class LoggingInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        // before handler
        return true; // proceed
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
        // after handler, before view rendering
    }
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        // after view rendering
    }
}
```

Register with:

```xml
<mvc:interceptors>
    <bean class="com.example.LoggingInterceptor" />
</mvc:interceptors>
```

12.8 Exception Handling in MVC

· @ExceptionHandler – within a controller.
· @ControllerAdvice – global exception handler.
· HandlerExceptionResolver interface – low-level; implementations: DefaultHandlerExceptionResolver, SimpleMappingExceptionResolver (map exception to view), etc.

Example:

```java
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ModelAndView handleError(HttpServletRequest req, Exception ex) {
        // return error view
    }
}
```

12.9 Form Handling & Validation

Spring MVC supports binding request parameters to form backing objects.

Form object:

```java
public class UserForm {
    @NotNull private String name;
    @Email private String email;
}
```

Controller:

```java
@PostMapping("/register")
public String register(@Valid @ModelAttribute UserForm form, BindingResult result, Model model) {
    if (result.hasErrors()) return "registration";
    // process
    return "redirect:/success";
}
```

Use @Valid and BindingResult. @ModelAttribute can be used to pre-populate reference data.

JSR-303 validation: need a Validator implementation (Hibernate Validator). Spring integrates with <mvc:annotation-driven/> which registers LocalValidatorFactoryBean.

12.10 REST with Spring MVC

@RestController = @Controller + @ResponseBody.

Use @GetMapping, @PostMapping, etc.

JSON support: include Jackson library; <mvc:annotation-driven/> registers MappingJackson2HttpMessageConverter automatically.

@RequestBody: deserializes JSON to object.
@ResponseBody: serializes object to JSON.

Exception handling for REST:
@ControllerAdvice with @ExceptionHandler returning ResponseEntity.

Content negotiation to support XML as well: add JAXB annotations or MappingJackson2XmlHttpMessageConverter.

12.11 Web Application Initialization without web.xml (Servlet 3.0+)

Implement WebApplicationInitializer (Spring's interface) or extend AbstractAnnotationConfigDispatcherServletInitializer.

```java
public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() { return new Class[] { RootConfig.class }; }
    @Override
    protected Class<?>[] getServletConfigClasses() { return new Class[] { WebConfig.class }; }
    @Override
    protected String[] getServletMappings() { return new String[] { "/" }; }
}
```

This replaces web.xml using ServletContainerInitializer.

---

13. Spring Data Access & Transactions

13.1 Spring JDBC (JdbcTemplate)

Simplifies JDBC usage, eliminates boilerplate, and handles resource management.

Configuration:

```xml
<bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
    <property name="driverClassName" value="com.mysql.cj.jdbc.Driver" />
    <property name="url" value="jdbc:mysql://localhost/test" />
    <property name="username" value="root" />
    <property name="password" value="secret" />
</bean>
<bean id="jdbcTemplate" class="org.springframework.jdbc.core.JdbcTemplate">
    <property name="dataSource" ref="dataSource" />
</bean>
```

Usage:

```java
@Autowired private JdbcTemplate jdbcTemplate;

int count = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM users", Integer.class);
List<User> users = jdbcTemplate.query("SELECT * FROM users", new UserRowMapper());
```

RowMapper<T> maps a ResultSet row to object.

Exception translation: Spring's JDBC framework translates SQL exceptions into DataAccessException hierarchy (e.g., DuplicateKeyException).

13.2 Integrating Hibernate/JPA

Hibernate SessionFactory setup:

```xml
<bean id="sessionFactory" class="org.springframework.orm.hibernate5.LocalSessionFactoryBean">
    <property name="dataSource" ref="dataSource" />
    <property name="packagesToScan" value="com.example.entity" />
    <property name="hibernateProperties">
        <props>
            <prop key="hibernate.dialect">org.hibernate.dialect.MySQLDialect</prop>
        </props>
    </property>
</bean>
```

Then HibernateTemplate (optional) or SessionFactory.getCurrentSession().

JPA:
Use LocalContainerEntityManagerFactoryBean and JpaTransactionManager.

```xml
<bean id="entityManagerFactory" class="org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean">
    <property name="dataSource" ref="dataSource" />
    <property name="packagesToScan" value="com.example.entity" />
    <property name="jpaVendorAdapter">
        <bean class="org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter" />
    </property>
</bean>
<bean id="transactionManager" class="org.springframework.orm.jpa.JpaTransactionManager">
    <property name="entityManagerFactory" ref="entityManagerFactory" />
</bean>
```

Enable JPA repositories with <jpa:repositories base-package="com.example.repository" /> and Spring Data JPA.

13.3 Transaction Management

Spring provides a consistent programming model across different transaction APIs (JDBC, JPA, Hibernate, JMS).

Key interfaces:

· PlatformTransactionManager – JDBC: DataSourceTransactionManager; JPA: JpaTransactionManager; Hibernate: HibernateTransactionManager.
· TransactionDefinition – propagation, isolation, timeout, read-only.
· TransactionStatus – current status.

Declarative transactions via annotations:
Enable with <tx:annotation-driven /> or @EnableTransactionManagement.

```java
@Service
public class UserService {
    @Transactional
    public void createUser(User user) { ... }
}
```

@Transactional attributes:

· propagation: REQUIRED (default), REQUIRES_NEW, NESTED, SUPPORTS, etc.
· isolation: DEFAULT, READ_UNCOMMITTED, READ_COMMITTED, REPEATABLE_READ, SERIALIZABLE.
· timeout, readOnly, rollbackFor, noRollbackFor.

How it works:
AOP proxy wraps the bean; when method invoked, transaction advisor begins transaction, calls method, and commits/rolls back based on outcome.

13.4 Spring Data JPA

Define repository interfaces; Spring Data provides implementations.

```java
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByName(String name);
    @Query("SELECT u FROM User u WHERE u.age > :age")
    List<User> findByAgeGreaterThan(@Param("age") int age);
}
```

Works with Spring Data JPA, not part of core Spring Framework but commonly used. Configure via <jpa:repositories>.

---

14. Spring Security (Pure Spring Framework)

Spring Security is a powerful authentication and access-control framework. It integrates with Spring Framework.

14.1 Architecture

A chain of servlet filters (the "Security Filter Chain") is responsible for authentication and authorization. The core filter is FilterChainProxy, which delegates to a list of SecurityFilterChain instances.

Key components:

· AuthenticationManager – central interface for authentication.
· ProviderManager – default implementation that iterates over AuthenticationProvider list.
· AuthenticationProvider – e.g., DaoAuthenticationProvider, LdapAuthenticationProvider.
· UserDetailsService – loads user-specific data.
· SecurityContextHolder – holds the security context (authentication) for the current thread.

14.2 Configuration (XML-based)

Add spring-security-web and spring-security-config.

web.xml declares a DelegatingFilterProxy:

```xml
<filter>
    <filter-name>springSecurityFilterChain</filter-name>
    <filter-class>org.springframework.web.filter.DelegatingFilterProxy</filter-class>
</filter>
<filter-mapping>
    <filter-name>springSecurityFilterChain</filter-name>
    <url-pattern>/*</url-pattern>
</filter-mapping>
```

Security context XML (e.g., security-context.xml):

```xml
<http auto-config="true">
    <intercept-url pattern="/admin/**" access="ROLE_ADMIN" />
    <intercept-url pattern="/**" access="ROLE_USER" />
    <form-login login-page="/login" default-target-url="/home" />
    <logout logout-success-url="/login?logout" />
</http>
<authentication-manager>
    <authentication-provider>
        <user-service>
            <user name="admin" password="{noop}admin" authorities="ROLE_ADMIN" />
            <user name="user" password="{noop}user" authorities="ROLE_USER" />
        </user-service>
    </authentication-provider>
</authentication-manager>
```

14.3 Authentication Flow

1. User submits credentials to /login.
2. UsernamePasswordAuthenticationFilter processes it.
3. Authentication request passed to AuthenticationManager.
4. DaoAuthenticationProvider (or other) validates against UserDetailsService.
5. If successful, stores authentication in SecurityContextHolder.
6. Subsequent requests are filtered, and SecurityContextHolder provides current user.

14.4 Authorization

· @PreAuthorize, @PostAuthorize, @Secured, @RolesAllowed – method-level security (requires global-method-security enabled).
· @EnableGlobalMethodSecurity (Spring Security 3.2+).
· In XML: <global-method-security pre-post-annotations="enabled" />.

14.5 CSRF Protection

Enabled by default in Spring Security. For stateless APIs, disable with <csrf disabled="true"/> or http.csrf().disable() in Java config (but that's Boot style). In pure Spring Security XML, use <csrf disabled="true"/>.

14.6 Custom Authentication Provider

Implement AuthenticationProvider and register as bean:

```xml
<authentication-manager>
    <authentication-provider ref="customAuthProvider" />
</authentication-manager>
<bean id="customAuthProvider" class="com.example.MyAuthProvider" />
```

14.7 JWT Authentication (Custom Filter)

Create a custom filter that extends GenericFilterBean, extracts JWT from request, validates, and sets security context. Then add filter before UsernamePasswordAuthenticationFilter using:

```xml
<http>
    <custom-filter ref="jwtAuthFilter" before="FORM_LOGIN_FILTER" />
</http>
<bean id="jwtAuthFilter" class="com.example.JwtAuthFilter" />
```

---

15. Testing with Spring Framework

Spring provides a testing module (spring-test) to facilitate integration testing.

15.1 Unit Testing

Use Mockito or EasyMock to mock dependencies; no Spring context needed.

15.2 Integration Testing

@RunWith(SpringJUnit4ClassRunner.class) (JUnit 4) or @ExtendWith(SpringExtension.class) (JUnit 5) loads the Spring context.

@ContextConfiguration specifies configuration classes/XML files.

```java
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class UserServiceTest {
    @Autowired UserService userService;
    @Test public void testCreateUser() { ... }
}
```

Transaction management for tests: @Transactional rolls back database changes after each test.

Mocking beans: Use @MockBean (Spring Boot) or manual mock creation; with pure Spring, you can use @DirtiesContext or define test-specific configuration.

Web testing: MockMvc from spring-test. Setup with @WebAppConfiguration and @ContextConfiguration, then MockMvcBuilders.webAppContextSetup(wac).

```java
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = WebConfig.class)
public class UserControllerTest {
    @Autowired WebApplicationContext wac;
    MockMvc mockMvc;
    @Before public void setup() { mockMvc = MockMvcBuilders.webAppContextSetup(wac).build(); }
    @Test public void testGetUser() throws Exception {
        mockMvc.perform(get("/users/1"))
               .andExpect(status().isOk());
    }
}
```

---

16. Additional Spring Framework Topics

· Spring JMS: JmsTemplate, message-driven POJOs.
· Spring JMS: @JmsListener.
· Spring Web Services: contract-first SOAP services.
· Spring Remoting: RMI, Hessian, Burlap.
· Spring Caching: @Cacheable, @CacheEvict, @EnableCaching. Implementations: Ehcache, Caffeine.
· Spring Scheduling: @Scheduled with @EnableScheduling. Thread pool for async methods @Async and @EnableAsync.
· Spring Events: ApplicationEvent and ApplicationListener. Publish events via ApplicationEventPublisher.
· Resource abstraction: Resource interface for classpath, file, URL resources.
· I18N: MessageSource for internationalization.

---

17. Summary of Key Interview Questions (Pure Spring)

· Explain IoC and DI. How does Spring implement them?
· What is the difference between BeanFactory and ApplicationContext?
· Explain bean lifecycle in Spring.
· What are the different scopes of Spring beans? How do you handle a prototype bean injected into a singleton?
· How does @Autowired work? What to do if multiple beans of same type?
· What is the difference between @Component, @Service, @Repository, @Controller?
· How does @Configuration work? Why are CGLIB proxies needed?
· Describe the AOP terminology: join point, pointcut, advice, aspect.
· How does Spring implement AOP? JDK dynamic proxy vs CGLIB. Explain the self-invocation problem.
· Walk through the Spring MVC request lifecycle.
· What is the difference between @Controller and @RestController?
· How do you handle exceptions in Spring MVC?
· How are transactions managed in Spring? What is @Transactional doing?
· Explain the Spring Security filter chain. How is authentication processed?
· How do you implement JWT-based authentication in Spring Security (without Boot)?
· How do you test Spring applications?
· How do you configure a data source in Spring?

---

This guide provides a comprehensive deep dive into the Spring Framework (excluding Spring Boot) covering every detail from basic IoC to AOP, MVC, Data, and Security. With this, you have a solid reference for interviews and pure Spring development.
