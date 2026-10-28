##Hibernate Framework
======================
```

This framework is an ORM(Object Relational Mapping) tool
It is a lightweight framework 
It will perform database related operation for our application 
It calls JDBC API internally to perform database related operations
It will perrform following tasks:
1) Loading driver class 
2) Creating connection object 
3) Creating statement objects
4) Creating SQL queries
5) Executing SQL queries
etc.

Hibernate is implementation of JPA (Java Persistence API) 

________________________________________

How to use hibernate in java project ?
________________________________________

1) Create maven project
2) Configure dependencies in pom.xml
3) Create persistence or model class 
4) Create HBM file 
5) Create CFG file
6) Create repository class

Step1:
What is maven?
It is one the build tool
Build tools are very useful tools for developer
It helps developer in application development such as
1) Creating directory structure of the project
2) Downloading project dependencies (external jar files) and adding them into project
3) Compiling source code of the project
4) creating partial unit testing code 
etc

Step2: 
Configure dependencies in pom.xml
______________________________________
Required dependencies added such as
1) Hibernate- core
2) Mysql-connector

Step3:
Creating persistent class 
_________________________________
Object of this model class will be saved/persisted by hibernate into database table.
Persisting object means saving sates of the object into table as a record 
This class must be java POJO class
POJO stands for plain old java Object
POJO class must have:
1) private instance variables
2) No-arguement constructor/non-parameterzied constructor
3) Getter and setter

Step4:
Create HBM file 
____________________
This must be an xml file
In this file you will have to map persistent class with database 
table
Instance variables of this class will be mapped with columns of the table 
Keep this file in scr folder


Step5:
Create CFG file
____________________
This must be an xml file 
In this file we need to configure following information
1) HBM2DDL auto property
2) Show-sql property
3) Dialect property
4) Database connection information (driver class name, url, username, password)
5) hbm file name 
etc
This file in scr folder

Step6:
Create repository class
________________________
This is also known as Dao class
In thia class you will have to write code to perform database operation.
You need to create following objects and call methods
1) Object of SessionFactory interface
2) Object of Session interface 
3) Object of Transaction interface
etc.
Object of SessionFactory interface keeps information of both cfg and hbm file
DDL operation will be performed by SessionFactory interface 
Object of Session interface will be created by 
openSession() method of SessionFactory interface
call methods of session interface to perform CRUD operation
(persisting object, deleting object, getting object , etc)



# Advanced Hibernate Interview Questions and Answers

## 1. What is Hibernate?
Hibernate is an **open-source ORM (Object-Relational Mapping) framework** for Java that simplifies database interactions by mapping Java objects to database tables.

## 2. What are the key features of Hibernate?
- **ORM (Object-Relational Mapping)**
- **Lazy Loading & Eager Loading**
- **First-level and Second-level Caching**
- **HQL (Hibernate Query Language)**
- **Automatic Schema Generation**
- **Transaction Management**
- **Integration with Spring, JPA, etc.**

## 3. What are the core interfaces in Hibernate?
- `SessionFactory`: Factory for `Session` objects.
- `Session`: Represents a unit of work.
- `Transaction`: Handles database transactions.
- `Query`: Executes HQL queries.
- `Criteria`: Used for dynamic queries.

## 4. What is the difference between `save()`, `persist()`, and `saveOrUpdate()`?

| Method            | Behavior |
|------------------|----------|
| `save(Object o)` | Saves object and returns the generated ID. |
| `persist(Object o)` | Similar to `save()`, but doesn’t return ID. |
| `saveOrUpdate(Object o)` | Saves if new, updates if already existing. |

## 5. What is the difference between `get()` and `load()`?

| Method  | Behavior |
|---------|----------|
| `get(Class, id)` | Returns `null` if the object is not found (Eager Loading). |
| `load(Class, id)` | Throws `ObjectNotFoundException` if not found (Lazy Loading). |

## 6. Explain First-level and Second-level Caching in Hibernate.
- **First-level Cache**: Enabled by default, tied to a Hibernate `Session`.
- **Second-level Cache**: Shared across multiple sessions, needs explicit configuration (e.g., EhCache, Redis).

## 7. How to enable second-level caching?
1. Add dependency:
```xml
<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-ehcache</artifactId>
    <version>5.4.0.Final</version>
</dependency>
```
2. Configure `hibernate.cfg.xml`:
```xml
<property name="hibernate.cache.use_second_level_cache">true</property>
<property name="hibernate.cache.region.factory_class">org.hibernate.cache.ehcache.EhCacheRegionFactory</property>
```
3. Use `@Cacheable` in entity:
```java
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Entity
public class Employee { }
```

## 8. What is HQL and how is it different from SQL?
HQL (Hibernate Query Language) is an **object-oriented query language**.
- Works with entity objects (`FROM Employee` instead of `SELECT * FROM employee`).
- Supports polymorphic queries.
- Database-independent.

Example:
```java
Query query = session.createQuery("FROM Employee WHERE salary > 50000");
List<Employee> list = query.list();
```

## 9. What is Criteria API and how is it different from HQL?
- **Criteria API**: Java-based, dynamic query creation.
- **HQL**: String-based, static query.

Example of Criteria API:
```java
CriteriaBuilder cb = session.getCriteriaBuilder();
CriteriaQuery<Employee> query = cb.createQuery(Employee.class);
Root<Employee> root = query.from(Employee.class);
query.select(root).where(cb.greaterThan(root.get("salary"), 50000));

List<Employee> list = session.createQuery(query).getResultList();
```

## 10. What are Named Queries in Hibernate?
Named Queries are predefined queries in the entity class.
```java
@NamedQuery(name="findEmployeeByName", query="FROM Employee WHERE name = :name")
@Entity
public class Employee { }
```
Usage:
```java
Query query = session.getNamedQuery("findEmployeeByName");
query.setParameter("name", "John");
List<Employee> result = query.list();
```

## 11. What are the different fetching strategies in Hibernate?
- **Lazy Fetching** (default) - Fetch only when needed.
- **Eager Fetching** - Fetch immediately.

Example:
```java
@OneToMany(fetch = FetchType.LAZY)
private List<Address> addresses;
```

## 12. What is Hibernate Inheritance Mapping?
- **Single Table Strategy (`@Inheritance(strategy = InheritanceType.SINGLE_TABLE)`)**
- **Joined Strategy (`@Inheritance(strategy = InheritanceType.JOINED)`)**
- **Table Per Class (`@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)`)**

## 13. What is the difference between `@OneToOne`, `@OneToMany`, and `@ManyToMany`?
| Annotation    | Description |
|--------------|-------------|
| `@OneToOne`  | One-to-one relationship. |
| `@OneToMany` | One-to-many relationship. |
| `@ManyToMany`| Many-to-many relationship. |

Example:
```java
@OneToMany(mappedBy="employee", cascade=CascadeType.ALL)
private List<Address> addresses;
```

## 14. What is Transaction Management in Hibernate?
Hibernate provides **automatic transaction management**.
```java
Session session = sessionFactory.openSession();
Transaction tx = session.beginTransaction();

Employee emp = new Employee();
emp.setName("John");
emp.setSalary(50000);
session.save(emp);

tx.commit();
session.close();
```

## 15. How does Hibernate handle database concurrency?
Hibernate uses **optimistic locking** and **pessimistic locking** to prevent concurrent updates.

Example of optimistic locking:
```java
@Version
private int version;
```

## 16. What are the different states of a Hibernate entity?
- **Transient** - Object is created but not persisted.
- **Persistent** - Object is associated with a Hibernate session.
- **Detached** - Object is no longer associated with a session.
- **Removed** - Object is marked for deletion.

## 17. What is `CascadeType` in Hibernate?
CascadeType defines **persistence operations** that should be propagated from parent to child.

| Cascade Type  | Description |
|--------------|-------------|
| `ALL`  | Apply all operations. |
| `PERSIST` | Cascade only `persist()`. |
| `MERGE` | Cascade only `merge()`. |
| `REMOVE` | Cascade `delete()`. |

Example:
```java
@OneToMany(mappedBy="employee", cascade=CascadeType.ALL)
private List<Address> addresses;
```

## 18. What is `hibernate.hbm2ddl.auto`?
- **update** - Updates schema, preserving data.
- **create** - Drops and recreates schema.
- **create-drop** - Drops schema on session close.
- **validate** - Validates schema but does not modify.

Example:
```xml
<property name="hibernate.hbm2ddl.auto">update</property>
```

## 19-50. (More advanced Hibernate questions and answers will be added here.)



```
19. What is the difference between merge() and update() in Hibernate?
Method	Behavior
update(Object o)	Updates the object in the database. Throws an exception if the object is already persistent in another session.
merge(Object o)	Copies the state of the object to the persistent object with the same identifier. If no persistent object exists, it saves the object.
Example:

java
Copy
Employee emp = session.get(Employee.class, 1);
emp.setSalary(60000);
session.update(emp); // Throws exception if emp is already persistent in another session.

Employee emp2 = new Employee();
emp2.setId(1);
emp2.setSalary(70000);
session.merge(emp2); // Safely merges the state.
20. What is the purpose of @DynamicUpdate in Hibernate?
@DynamicUpdate ensures that only the modified fields are included in the SQL UPDATE statement, improving performance.

Example:

java
Copy
@Entity
@DynamicUpdate
public class Employee {
    @Id
    private int id;
    private String name;
    private double salary;
}
21. What is the difference between @JoinColumn and @JoinTable?
Annotation	Description
@JoinColumn	Used to specify the foreign key column for a relationship.
@JoinTable	Used to define a join table for many-to-many relationships.
Example:

java
Copy
@OneToOne
@JoinColumn(name = "address_id")
private Address address;

@ManyToMany
@JoinTable(name = "employee_project",
           joinColumns = @JoinColumn(name = "employee_id"),
           inverseJoinColumns = @JoinColumn(name = "project_id"))
private List<Project> projects;
22. What is the purpose of @BatchSize in Hibernate?
@BatchSize is used to optimize lazy loading by fetching multiple entities in a single query.

Example:

java
Copy
@Entity
@BatchSize(size = 10)
public class Employee {
    @OneToMany(fetch = FetchType.LAZY)
    private List<Address> addresses;
}
23. What is the difference between @Embeddable and @Embedded?
Annotation	Description
@Embeddable	Marks a class as embeddable (can be embedded in another entity).
@Embedded	Marks a field in an entity as an embedded object.
Example:

java
Copy
@Embeddable
public class Address {
    private String city;
    private String state;
}

@Entity
public class Employee {
    @Embedded
    private Address address;
}
24. What is the purpose of @Formula in Hibernate?
@Formula is used to define a computed property in an entity that is not mapped to a database column.

Example:

java
Copy
@Entity
public class Employee {
    @Id
    private int id;
    private double salary;

    @Formula("salary * 0.2")
    private double tax;
}
25. What is the difference between @NaturalId and @Id?
Annotation	Description
@Id	Marks the primary key of an entity.
@NaturalId	Marks a unique business key (not necessarily the primary key).
Example:

java
Copy
@Entity
public class Employee {
    @Id
    private int id;

    @NaturalId
    private String email;
}
26. What is the purpose of @Filter in Hibernate?
@Filter is used to apply dynamic filters to entities or collections at runtime.

Example:

java
Copy
@Entity
@FilterDef(name = "activeEmployeeFilter", parameters = @ParamDef(name = "active", type = "boolean"))
@Filter(name = "activeEmployeeFilter", condition = "active = :active")
public class Employee {
    @Id
    private int id;
    private boolean active;
}

// Usage
session.enableFilter("activeEmployeeFilter").setParameter("active", true);
27. What is the difference between @GeneratedValue strategies?
Strategy	Description
GenerationType.AUTO	Automatically selects the strategy based on the database.
GenerationType.IDENTITY	Uses database identity columns.
GenerationType.SEQUENCE	Uses a database sequence.
GenerationType.TABLE	Uses a database table to simulate a sequence.
Example:

java
Copy
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq")
@SequenceGenerator(name = "emp_seq", sequenceName = "employee_seq", allocationSize = 1)
private int id;
28. What is the purpose of @Version in Hibernate?
@Version is used for optimistic locking to prevent concurrent updates.

Example:

java
Copy
@Entity
public class Employee {
    @Id
    private int id;

    @Version
    private int version;
}
29. What is the difference between @ElementCollection and @OneToMany?
Annotation	Description
@ElementCollection	Used for collections of basic types or embeddable objects.
@OneToMany	Used for collections of entities.
Example:

java
Copy
@Entity
public class Employee {
    @ElementCollection
    private List<String> phoneNumbers;

    @OneToMany
    private List<Address> addresses;
}
30. What is the purpose of @Fetch in Hibernate?
@Fetch is used to specify the fetching strategy for associations.

Example:

java
Copy
@OneToMany(fetch = FetchType.LAZY)
@Fetch(FetchMode.SUBSELECT)
private List<Address> addresses;
31. What is the difference between @Immutable and @ReadOnly?
Annotation	Description
@Immutable	Marks an entity as immutable (cannot be updated or deleted).
@ReadOnly	Marks a query result as read-only (cannot be modified).
Example:

java
Copy
@Entity
@Immutable
public class Employee {
    @Id
    private int id;
}

Query query = session.createQuery("FROM Employee");
query.setReadOnly(true);
32. What is the purpose of @Proxy in Hibernate?
@Proxy is used to specify a custom proxy class for lazy loading.

Example:

java
Copy
@Entity
@Proxy(proxyClass = EmployeeProxy.class)
public class Employee {
    @Id
    private int id;
}
33. What is the difference between @Subselect and @Synchronize?
Annotation	Description
@Subselect	Maps an entity to a SQL query (read-only).
@Synchronize	Specifies tables to synchronize with the query.
Example:

java
Copy
@Entity
@Subselect("SELECT id, name FROM employee")
@Synchronize("employee")
public class EmployeeView {
    @Id
    private int id;
    private String name;
}
34. What is the purpose of @Any in Hibernate?
@Any is used to map a polymorphic association to multiple entity types.

Example:

java
Copy
@Entity
public class Employee {
    @Id
    private int id;

    @Any(metaColumn = @Column(name = "address_type"))
    @AnyMetaDef(idType = "int", metaType = "string",
                metaValues = {
                    @MetaValue(value = "HOME", targetEntity = HomeAddress.class),
                    @MetaValue(value = "OFFICE", targetEntity = OfficeAddress.class)
                })
    @JoinColumn(name = "address_id")
    private Address address;
}
35. What is the difference between @FetchProfile and @Fetch?
Annotation	Description
@FetchProfile	Defines a named fetch profile for dynamic fetching.
@Fetch	Specifies the fetch strategy for an association.
Example:

java
Copy
@FetchProfile(name = "employeeWithAddresses", fetchOverrides = {
    @FetchProfile.FetchOverride(entity = Employee.class, association = "addresses", mode = FetchMode.JOIN)
})
36. What is the purpose of @LazyCollection in Hibernate?
@LazyCollection is used to specify the lazy loading strategy for collections.

Example:

java
Copy
@OneToMany
@LazyCollection(LazyCollectionOption.EXTRA)
private List<Address> addresses;
37. What is the difference between @NotFound and @JoinColumn?
Annotation	Description
@NotFound	Specifies the action to take when a foreign key reference is missing.
@JoinColumn	Specifies the foreign key column for a relationship.
Example:

java
Copy
@OneToOne
@JoinColumn(name = "address_id")
@NotFound(action = NotFoundAction.IGNORE)
private Address address;
38. What is the purpose of @OptimisticLocking in Hibernate?
@OptimisticLocking is used to enable or disable optimistic locking for an entity.

Example:

java
Copy
@Entity
@OptimisticLocking(type = OptimisticLockType.VERSION)
public class Employee {
    @Id
    private int id;

    @Version
    private int version;
}
39. What is the difference between @Polymorphism and @Inheritance?
Annotation	Description
@Polymorphism	Specifies how polymorphic queries should be handled.
@Inheritance	Specifies the inheritance strategy for an entity.
Example:

java
Copy
@Entity
@Polymorphism(type = PolymorphismType.EXPLICIT)
public class Employee {
    @Id
    private int id;
}
40. What is the purpose of @Tuplizer in Hibernate?
@Tuplizer is used to specify a custom tuplizer for an entity or component.

Example:

java
Copy
@Entity
@Tuplizer(impl = DynamicEntityTuplizer.class)
public class Employee {
    @Id
    private int id;
}
41. What is the difference between @Where and @Filter?
Annotation	Description
@Where	Applies a static SQL condition to an entity or collection.
@Filter	Applies a dynamic SQL condition at runtime.
Example:

java
Copy
@Entity
@Where(clause = "active = 1")
public class Employee {
    @Id
    private int id;
    private boolean active;
}
42. What is the purpose of @Cache in Hibernate?
@Cache is used to specify the caching strategy for an entity or collection.

Example:

java
Copy
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Employee {
    @Id
    private int id;
}
43. What is the difference between @NaturalIdCache and @Cache?
Annotation	Description
@NaturalIdCache	Enables caching for natural IDs.
@Cache	Enables caching for entities or collections.
Example:

java
Copy
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@NaturalIdCache
public class Employee {
    @Id
    private int id;

    @NaturalId
    private String email;
}
44. What is the purpose of @FetchMode in Hibernate?
@FetchMode is used to specify the fetch mode for an association.

Example:

java
Copy
@OneToMany
@Fetch(FetchMode.SUBSELECT)
private List<Address> addresses;
45. What is the difference between @JoinFormula and @JoinColumn?
Annotation	Description
@JoinFormula	Specifies a SQL formula for a join condition.
@JoinColumn	Specifies the foreign key column for a relationship.
Example:

java
Copy
@ManyToOne
@JoinFormula("CASE WHEN type = 'HOME' THEN home_address_id ELSE office_address_id END")
private Address address;
46. What is the purpose of @AnyMetaDef in Hibernate?
@AnyMetaDef is used to define metadata for polymorphic associations.

Example:

java
Copy
@Any(metaColumn = @Column(name = "address_type"))
@AnyMetaDef(idType = "int", metaType = "string",
            metaValues = {
                @MetaValue(value = "HOME", targetEntity = HomeAddress.class),
                @MetaValue(value = "OFFICE", targetEntity = OfficeAddress.class)
            })
@JoinColumn(name = "address_id")
private Address address;
47. What is the difference between @MetaValue and @AnyMetaDef?
Annotation	Description
@MetaValue	Defines a mapping between a value and an entity type.
@AnyMetaDef	Defines metadata for polymorphic associations.
48. What is the purpose of @FetchProfile in Hibernate?
@FetchProfile is used to define named fetch profiles for dynamic fetching.

Example:

java
Copy
@FetchProfile(name = "employeeWithAddresses", fetchOverrides = {
    @FetchProfile.FetchOverride(entity = Employee.class, association = "addresses", mode = FetchMode.JOIN)
})
49. What is the difference between @FetchMode and @FetchProfile?
Annotation	Description
@FetchMode	Specifies the fetch mode for an association.
@FetchProfile	Defines a named fetch profile for dynamic fetching.
50. What is the purpose of @LazyToOne in Hibernate?
@LazyToOne is used to specify the lazy loading strategy for a to-one association.

Example:

java
Copy
@OneToOne
@LazyToOne(LazyToOneOption.NO_PROXY)
private Address address;
These advanced questions and answers should help you prepare for in-depth Hibernate interviews. Let me know if you need further clarification or additional questions
```
