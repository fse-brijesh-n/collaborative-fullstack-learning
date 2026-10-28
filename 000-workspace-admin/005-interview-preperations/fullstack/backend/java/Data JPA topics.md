Spring Data JPA & NoSQL – In‑Depth Guide (SQL + NoSQL)

This guide dissects the Spring Data family into its smallest components, covering Spring Data JPA for relational databases and Spring Data modules for NoSQL (MongoDB, Redis, Cassandra, Elasticsearch, Neo4j). Every concept is explained with internal mechanics, configuration details, and code examples. It focuses on pure Spring Data within a Spring Framework context (no Spring Boot auto‑configuration).

---

Part 1: Foundations of Spring Data

Spring Data’s mission is to provide a familiar and consistent, Spring‑based programming model for data access while still retaining the special traits of the underlying data store.

It makes it easy to use data access technologies, relational and non‑relational databases, map‑reduce frameworks, and cloud‑based data services.

Core Concepts

· Repository pattern – a central interface that abstracts data access.
· Domain base classes – AbstractAggregateRoot, Persistable, etc.
· Template classes – JdbcTemplate, MongoTemplate, RedisTemplate, etc., provide lower‑level operations.
· Object Mapping – conversion between domain objects and native data structures (e.g., EntityManager for JPA, MongoConverter for MongoDB).
· Declarative query derivation – method names are parsed to create queries.

Repository Hierarchy

All Spring Data repositories extend Repository<T, ID> (marker interface). The main sub‑interfaces:

· CrudRepository<T, ID> – provides save, findById, existsById, findAll, count, delete, etc.
· PagingAndSortingRepository<T, ID> – adds findAll(Pageable) and findAll(Sort).
· JpaRepository<T, ID> (JPA specific) – adds JPA‑related methods (flush, saveAndFlush, deleteInBatch, etc.).
· MongoRepository<T, ID> (MongoDB) – adds findAll(Sort), insert, save, etc.
· ReactiveCrudRepository<T, ID> – for reactive data stores.

Custom repositories can add custom methods.

---

Part 2: Spring Data JPA (Relational Databases)

Spring Data JPA simplifies the implementation of data access layers by providing ready‑to‑use repository implementations. It is built on top of the JPA (Hibernate, EclipseLink, etc.) specification.

2.1 Configuration

In a pure Spring application (no Boot), you must set up:

· A DataSource.
· An EntityManagerFactory (JPA) or LocalContainerEntityManagerFactoryBean.
· A JpaTransactionManager.
· Enable JPA repositories via @EnableJpaRepositories or XML.

Java Config Example

```java
@Configuration
@EnableJpaRepositories(basePackages = "com.example.repository")
@EnableTransactionManagement
public class JpaConfig {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost/mydb");
        ds.setUsername("root");
        ds.setPassword("secret");
        return ds;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource ds, JpaVendorAdapter jpaVendor) {
        LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
        emf.setDataSource(ds);
        emf.setPackagesToScan("com.example.entity");
        emf.setJpaVendorAdapter(jpaVendor);
        Properties jpaProperties = new Properties();
        jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
        jpaProperties.put("hibernate.show_sql", "true");
        jpaProperties.put("hibernate.hbm2ddl.auto", "update");
        emf.setJpaProperties(jpaProperties);
        return emf;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.MYSQL);
        return adapter;
    }

    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
        return new JpaTransactionManager(emf);
    }
}
```

XML Config Example

```xml
<jpa:repositories base-package="com.example.repository" />
<bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
    ... 
</bean>
<bean id="entityManagerFactory" class="org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean">
    <property name="dataSource" ref="dataSource"/>
    <property name="packagesToScan" value="com.example.entity"/>
    <property name="jpaVendorAdapter">
        <bean class="org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter"/>
    </property>
    <property name="jpaProperties">
        <props>
            <prop key="hibernate.dialect">org.hibernate.dialect.MySQL8Dialect</prop>
            <prop key="hibernate.show_sql">true</prop>
            <prop key="hibernate.hbm2ddl.auto">update</prop>
        </props>
    </property>
</bean>
<bean id="transactionManager" class="org.springframework.orm.jpa.JpaTransactionManager">
    <property name="entityManagerFactory" ref="entityManagerFactory"/>
</bean>
<tx:annotation-driven transaction-manager="transactionManager"/>
```

2.2 Domain Model

Entities are annotated with JPA annotations (@Entity, @Id, etc.). Spring Data JPA can use any valid JPA entity.

```java
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @Enumerated(EnumType.STRING)
    private Status status;
    // constructors, getters, setters...
}
```

2.3 Repository Interfaces

Define an interface that extends JpaRepository (or CrudRepository, PagingAndSortingRepository).

```java
public interface UserRepository extends JpaRepository<User, Long> {
    // Derived query methods
    List<User> findByName(String name);
    Optional<User> findByEmail(String email);
    long countByStatus(Status status);
    boolean existsByName(String name);
    void deleteByName(String name);
}
```

Spring Data creates a proxy (by default using SimpleJpaRepository) that implements the interface. At runtime, calls are delegated to the proxy, which generates the appropriate JPA queries.

JpaRepository methods:

· findAll() – returns all entities.
· findById(ID id) – returns Optional.
· save(S entity) – persists or merges.
· saveAll(Iterable<S> entities).
· delete(T entity).
· deleteById(ID id).
· flush() – synchronize persistence context.
· saveAndFlush(T entity).
· deleteInBatch(Iterable<T> entities) – bulk delete.
· getOne(ID id) / getReferenceById(ID id) – returns a reference (lazy proxy).

2.4 Query Methods – Derived Queries

Spring Data parses method names and creates queries automatically. The parser recognizes predicates:

· Property traversal: findByAddressCity(String city)
· Keywords: And, Or, Between, LessThan, GreaterThan, Like, Containing, StartingWith, EndingWith, IgnoreCase, OrderBy, Top, First, Distinct.
· Limiting: findTop3ByOrderByAgeDesc().
· Streaming: Stream<User> readAllBy().
· Async: Future<User> findByEmail(String email) (with @Async).

Return types: List, Set, Optional, Stream, Page, Slice, Future, CompletableFuture.

Example:

```java
Page<User> findByNameContainingIgnoreCase(String name, Pageable pageable);
List<User> findTop5ByStatusOrderByCreatedAtDesc(Status status);
```

2.5 @Query – Custom Queries

For more complex queries, use @Query with JPQL or native SQL.

```java
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.email LIKE %:domain%")
    List<User> findByEmailDomain(@Param("domain") String domain);

    @Query("SELECT u FROM User u JOIN u.roles r WHERE r.name = :roleName")
    List<User> findByRoleName(@Param("roleName") String roleName);

    // Native query
    @Query(value = "SELECT * FROM users WHERE YEAR(birth_date) = :year", nativeQuery = true)
    List<User> findByBirthYear(@Param("year") int year);
}
```

Named queries defined on the entity (@NamedQuery) are also supported: just name the repository method the same as the named query.

2.6 Modifying Queries

For UPDATE and DELETE operations, use @Modifying along with @Query. Must be executed within a transaction.

```java
@Modifying
@Query("UPDATE User u SET u.status = :status WHERE u.lastLogin < :date")
int deactivateInactiveUsers(@Param("status") Status status, @Param("date") LocalDate date);

@Modifying
@Query("DELETE FROM User u WHERE u.status = :status")
void deleteByStatus(@Param("status") Status status);
```

@Modifying(flushAutomatically = true, clearAutomatically = true) can be set to manage persistence context after execution.

2.7 Sorting and Pagination

· Sort passed directly: Sort.by("name").ascending().and(Sort.by("age").descending()).
· Pageable interface, use PageRequest.of(page, size, sort).

```java
Page<User> users = userRepository.findAll(PageRequest.of(0, 10, Sort.by("name")));
```

Page provides total count, total pages, etc. Slice only knows whether there is a next slice (more efficient for large datasets when total count not needed).

2.8 Specifications (JPA Criteria API)

For dynamic queries, use JpaSpecificationExecutor<T> and Specification objects.

```java
public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {
}
```

```java
Specification<User> spec = (root, query, cb) -> {
    List<Predicate> predicates = new ArrayList<>();
    if (name != null) predicates.add(cb.like(root.get("name"), "%" + name + "%"));
    if (status != null) predicates.add(cb.equal(root.get("status"), status));
    return cb.and(predicates.toArray(new Predicate[0]));
};
List<User> users = userRepository.findAll(spec);
```

Combine with Pageable and Sort.

2.9 Querydsl Integration

If Querydsl is on classpath, enable with QuerydslPredicateExecutor<T>. Then use BooleanBuilder to create dynamic predicates.

2.10 Custom Repository Implementations

To add methods that cannot be implemented by query derivation or @Query:

1. Define an interface with the custom methods (e.g., UserRepositoryCustom).
2. Create an implementation class (UserRepositoryCustomImpl). The name must end with Impl by default (customizable).
3. Make the main repository interface extend both JpaRepository and the custom interface.

```java
public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryCustom { }

public interface UserRepositoryCustom {
    List<User> findSomeComplexQuery();
}

@Repository
public class UserRepositoryCustomImpl implements UserRepositoryCustom {
    @PersistenceContext
    private EntityManager em;

    public List<User> findSomeComplexQuery() {
        // use EntityManager directly
    }
}
```

Spring Data picks up the Impl class automatically.

2.11 Auditing

Spring Data provides @CreatedDate, @LastModifiedDate, @CreatedBy, @LastModifiedBy with JPA.

Enable auditing: @EnableJpaAuditing on a configuration class, and use @EntityListeners(AuditingEntityListener.class) on entities.

```java
@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class JpaAuditingConfig {
    @Bean
    public AuditorAware<String> auditorProvider() {
        return () -> Optional.ofNullable(SecurityContextHolder.getContext())
                .map(ctx -> ctx.getAuthentication().getName());
    }
}

@Entity
@EntityListeners(AuditingEntityListener.class)
public class User {
    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime updatedAt;
    @CreatedBy
    private String createdBy;
    @LastModifiedBy
    private String modifiedBy;
}
```

2.12 Entity Graphs

Define fetch plans to avoid N+1 issues.

```java
@NamedEntityGraph(name = "User.roles", attributeNodes = @NamedAttributeNode("roles"))
@Entity
public class User { ... }

// In repository
@EntityGraph("User.roles")
List<User> findAll();
```

Dynamic entity graphs can be built with EntityGraph type hint.

2.13 Transactions

Spring Data JPA repositories by default have @Transactional(readOnly = true) on the class level for query methods. Write methods (save, delete) are @Transactional. You can override with custom @Transactional at service layer.

2.14 Testing

Use @DataJpaTest (Spring Boot) or set up a test context manually. Use @Sql to load test data.

```java
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JpaConfig.class})
@Transactional
public class UserRepositoryTest {
    @Autowired private UserRepository repo;
    @Test public void testFindByName() { ... }
}
```

2.15 Common Pitfalls

· N+1 problem: Use @EntityGraph, JOIN FETCH, or @BatchSize.
· LazyInitializationException: Access lazy properties outside transaction.
· Optional with get(): use orElseThrow.
· Large collections in IN clause: better to use subquery.
· Modifying queries without @Transactional will fail.

---

Part 3: Spring Data NoSQL

Spring Data offers consistent programming model across NoSQL stores. Each module adapts the repository abstraction.

3.1 Spring Data MongoDB

MongoDB is a document‑oriented database. Spring Data MongoDB provides:

· MongoTemplate – low‑level operations.
· MongoRepository – high‑level repository.
· Object‑Document mapping via @Document, @Id, etc.
· Query derivation and @Query with JSON‑based queries.
· Aggregation support.
· GridFS for large files.
· Transactions (MongoDB 4.0+ replica set).

3.1.1 Configuration

```java
@Configuration
@EnableMongoRepositories(basePackages = "com.example.repository")
public class MongoConfig {
    @Bean
    public MongoClient mongoClient() {
        return MongoClients.create("mongodb://localhost:27017/mydb");
    }
    @Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongoClient(), "mydb");
    }
}
```

XML:

```xml
<mongo:repositories base-package="com.example.repository"/>
<mongo:mongo-client host="localhost" port="27017"/>
<mongo:template dbname="mydb"/>
```

3.1.2 Domain Model

```java
@Document(collection = "users")
public class User {
    @Id
    private String id;
    @Indexed(unique = true)
    private String email;
    private String name;
    private int age;
    @CreatedDate
    private Instant createdAt;
    // ...
}
```

The @Id field maps to MongoDB’s _id (can be String, ObjectId, BigInteger).

3.1.3 Repositories

```java
public interface UserRepository extends MongoRepository<User, String> {
    List<User> findByName(String name);
    Optional<User> findByEmail(String email);
    @Query("{ 'age' : { $gt : ?0 } }")
    List<User> findOlderThan(int age);
    long deleteByName(String name);
}
```

MongoRepository extends PagingAndSortingRepository and CrudRepository. It provides methods like findAll(Sort), insert, saveAll.

3.1.4 Query Methods

Derived queries support similar keywords as JPA, but translated to MongoDB queries (e.g., findByNameIgnoreCase, findByAgeBetween). Property expressions traverse nested documents (e.g., findByAddressCity).

Limiting and sorting: works as expected.

3.1.5 JSON‑Based @Query

Use MongoDB query syntax (JSON) inside @Query. Supports ?0, ?1 for parameters.

```java
@Query(value = "{ 'name' : ?0, 'age' : { $lt : ?1 } }", fields = "{ 'name' : 1, 'age' : 1 }")
List<User> findByNameAndAgeLessThan(String name, int age);
```

For updates:

```java
@Query(value = "{ 'name' : ?0 }")
@Update("{ '$set' : { 'status' : ?1 } }")
long updateUserStatus(String name, String status);
```

3.1.6 MongoTemplate

For more complex operations, MongoTemplate provides methods like find, insert, updateFirst, updateMulti, upsert, remove, findAndModify, aggregate, etc.

```java
@Autowired
private MongoTemplate mongoTemplate;

public List<User> findActiveUsersOlderThan(int age) {
    Query query = new Query();
    query.addCriteria(Criteria.where("status").is("ACTIVE")
                     .and("age").gt(age));
    return mongoTemplate.find(query, User.class);
}
```

3.1.7 Aggregation

Spring Data MongoDB supports the aggregation framework with Aggregation class.

```java
Aggregation agg = Aggregation.newAggregation(
    Aggregation.match(Criteria.where("status").is("ACTIVE")),
    Aggregation.group("age").count().as("count"),
    Aggregation.sort(Sort.Direction.ASC, "age")
);
AggregationResults<AgeCount> results = mongoTemplate.aggregate(agg, "users", AgeCount.class);
```

Repositories can also declare @Aggregation methods.

3.1.8 Transactions

MongoDB 4.0+ supports multi‑document transactions on replica sets. Spring Data MongoDB provides @Transactional using MongoTransactionManager.

Configuration:

```java
@Bean
public MongoTransactionManager transactionManager(MongoDatabaseFactory dbFactory) {
    return new MongoTransactionManager(dbFactory);
}
```

Then @Transactional on service methods.

3.1.9 GridFS

For storing large files, use GridFsTemplate and GridFsOperations.

```java
@Autowired
private GridFsTemplate gridFsTemplate;

public String storeFile(InputStream inputStream, String filename) {
    ObjectId fileId = gridFsTemplate.store(inputStream, filename);
    return fileId.toString();
}
```

3.1.10 Auditing

Same annotations @CreatedDate, @LastModifiedDate supported with @EnableMongoAuditing.

3.1.11 Indexes

Create indexes programmatically or via @Indexed, @CompoundIndex.

```java
@CompoundIndex(def = "{'name':1, 'age':-1}")
@Entity
public class User { ... }
```

Or use MongoTemplate.indexOps().

3.2 Spring Data Redis

Redis is an in‑memory data structure store. Spring Data Redis provides RedisTemplate and repository support via @RedisHash.

Configuration:

```java
@Bean
public RedisConnectionFactory redisConnectionFactory() {
    return new LettuceConnectionFactory("localhost", 6379);
}
@Bean
public RedisTemplate<String, String> redisTemplate() {
    RedisTemplate<String, String> template = new RedisTemplate<>();
    template.setConnectionFactory(redisConnectionFactory());
    return template;
}
```

Domain: @RedisHash("users") class with @Id.
Repository: CrudRepository or PagingAndSortingRepository. Query methods are supported but limited.

RedisTemplate: provides ops for values, lists, sets, hashes, etc.

3.3 Spring Data Cassandra

For Apache Cassandra. Configuration: CassandraClusterFactoryBean, CassandraSessionFactoryBean. Domain: @Table, @PrimaryKey. Repository: CassandraRepository (extends CrudRepository). Query derivation supports findBy..., and @Query with CQL.

Cassandra repository methods often require partition key in query due to data modeling constraints.

3.4 Spring Data Elasticsearch

For Elasticsearch (document search engine). Configuration: ElasticsearchRestTemplate. Domain: @Document with @Id. Repository: ElasticsearchRepository. Query methods with naming, @Query with JSON‑based Elasticsearch query DSL.

Supports aggregation, highlighting, and scroll.

3.5 Spring Data Neo4j

For Neo4j graph database. Configuration: Neo4jClient or Driver. Domain: @Node, @Relationship. Repository: Neo4jRepository. Query methods derived and @Query with Cypher. Supports graph traversal.

---

4. Common Features Across Spring Data Modules

· Projections: interface‑based or DTO projections to load subsets of data.
· Query by Example (QBE): QueryByExampleExecutor with Example matcher.
· Events: @DomainEvents, AbstractAggregateRoot for publishing events from aggregates.
· Reactive support: Reactive repositories (ReactiveCrudRepository, ReactiveMongoRepository) using Project Reactor.
· CDI integration and Kotlin extensions.
· Multi‑store support: possible to use multiple Spring Data modules in the same application (with care to not overlap repository definitions).

---

5. Common Interview Questions

1. What is Spring Data? How does it simplify data access?
2. Explain the repository hierarchy in Spring Data.
3. How does query derivation work? What keywords can be used?
4. How do you write a custom query with @Query? What are the differences between JPQL and native queries?
5. What is the difference between CrudRepository, PagingAndSortingRepository, and JpaRepository?
6. How to implement a custom repository method?
7. How do you handle dynamic queries? (Specifications, Querydsl)
8. How to enable auditing in Spring Data JPA? What annotations are used?
9. What is the N+1 problem, and how to solve it with Spring Data JPA?
10. How to paginate and sort query results?
11. Explain the configuration needed to set up Spring Data JPA in a pure Spring application.
12. How does Spring Data MongoDB's query methods work? What about JSON queries?
13. How to perform aggregations in Spring Data MongoDB?
14. What is the difference between MongoRepository and JpaRepository?
15. How to implement transactions in MongoDB with Spring Data?
16. How does Spring Data Redis store entities?
17. How do you handle schema evolution in Spring Data MongoDB?
18. What are projections and how are they used?
19. How to use Query by Example?
20. Can you use multiple Spring Data modules in the same application? How to avoid conflicts?

---

This guide provides a comprehensive breakdown of Spring Data for both SQL and NoSQL, ensuring you can handle any data access interview question.
