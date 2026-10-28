```
# Data JPA Interview Questions and Answers

## 1. What is Spring Data JPA?
Spring Data JPA is a part of the Spring Data project that simplifies JPA-based database interactions. It provides a repository abstraction layer to reduce boilerplate code required for database operations.

## 2. What are the advantages of using Spring Data JPA?
- Reduces boilerplate code
- Provides built-in CRUD operations
- Supports custom query methods
- Enables pagination and sorting
- Integrates with Spring Boot easily

## 3. What is the difference between JPA and Hibernate?
| Feature | JPA | Hibernate |
|---------|-----|----------|
| Type | Specification | Implementation |
| Usage | Defines the API | Provides the implementation |
| Vendor-specific | Independent | Hibernate-specific features |
| Query Language | JPQL | HQL (Hibernate Query Language) |

## 4. What are the different types of repositories in Spring Data JPA?
- `CrudRepository<T, ID>`: Provides basic CRUD operations.
- `PagingAndSortingRepository<T, ID>`: Extends `CrudRepository` with pagination and sorting support.
- `JpaRepository<T, ID>`: Extends `PagingAndSortingRepository` with additional JPA-specific methods.

## 5. How do you create a JPA repository interface?
```java
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByLastName(String lastName);
}
```

## 6. What is the purpose of @Entity annotation?
The `@Entity` annotation marks a class as a JPA entity, allowing it to be mapped to a database table.

Example:
```java
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
```

## 7. What are the different ways to define a primary key in JPA?
- `@Id` with `@GeneratedValue`
- Composite key using `@EmbeddedId`
- Composite key using `@IdClass`

## 8. How does pagination work in Spring Data JPA?
Spring Data JPA provides `Pageable` and `Page<T>` interfaces for pagination.

Example:
```java
Page<User> users = userRepository.findAll(PageRequest.of(0, 10));
```

## 9. What is the difference between findById() and getOne()?
- `findById()`: Returns an `Optional<T>`, performs an immediate database query.
- `getOne()`: Returns a proxy object and fetches data lazily when accessed.

## 10. What is the use of @Query annotation?
The `@Query` annotation allows defining custom JPQL or native SQL queries.

Example:
```java
@Query("SELECT u FROM User u WHERE u.email = ?1")
User findByEmail(String email);
```

## 11. What is the purpose of the @Transactional annotation?
`@Transactional` ensures that a method runs within a transaction boundary.

Example:
```java
@Transactional
public void updateUser(User user) {
    userRepository.save(user);
}
```

## 12. What is Lazy and Eager fetching in JPA?
- **Lazy Fetching**: Fetches related entities only when needed.
- **Eager Fetching**: Fetches related entities immediately along with the main entity.

Example:
```java
@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
private List<Order> orders;
```

## 13. What is the difference between @OneToOne, @OneToMany, @ManyToOne, and @ManyToMany?
- `@OneToOne`: One-to-one relationship
- `@OneToMany`: One entity has multiple related entities
- `@ManyToOne`: Multiple entities relate to one entity
- `@ManyToMany`: Many entities relate to many entities

## 14. What is the difference between merge() and persist()?
- `persist()`: Inserts a new entity into the database.
- `merge()`: Updates an existing entity in the database.

## 15. How do you handle bidirectional relationships in JPA?
Use `mappedBy` in one entity and `@JoinColumn` in another.

Example:
```java
@Entity
public class User {
    @OneToMany(mappedBy = "user")
    private List<Order> orders;
}

@Entity
public class Order {
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
```

## 16. What is a Named Query in JPA?
A Named Query is a predefined JPQL query.

Example:
```java
@NamedQuery(name = "User.findByEmail", query = "SELECT u FROM User u WHERE u.email = :email")
```

## 17. How do you enable JPA auditing in Spring Boot?
Use `@EnableJpaAuditing` and `@EntityListeners(AuditingEntityListener.class)`.

Example:
```java
@Configuration
@EnableJpaAuditing
public class JpaConfig {}
```

```java
@Entity
@EntityListeners(AuditingEntityListener.class)
public class User {
    @CreatedDate
    private LocalDateTime createdAt;
}
```

## 18. What is the use of @Modifying annotation?
It is used to define update or delete queries in Spring Data JPA.

Example:
```java
@Modifying
@Query("UPDATE User u SET u.status = 'ACTIVE' WHERE u.id = ?1")
void activateUser(Long id);
```

## 19. What is the difference between EntityManager and SessionFactory?
- `EntityManager`: JPA interface for managing entities.
- `SessionFactory`: Hibernate-specific interface for handling sessions.

## 20. How do you perform batch processing in JPA?
Use `@BatchSize` or `entityManager.flush()` to handle batch inserts/updates.

Example:
```java
@BatchSize(size = 10)
private List<Order> orders;
```

---
These are some common Spring Data JPA interview questions and answers. Happy learning!


```
