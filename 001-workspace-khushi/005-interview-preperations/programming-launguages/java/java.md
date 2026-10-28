```1. Q: What is Java?
   A: Java is a high-level, object-oriented programming language developed by Sun Microsystems (now owned by Oracle). It is platform-independent due to its JVM (Java Virtual Machine).

2. Q: What are the key features of Java?
   A: Java is platform-independent, object-oriented, secure, robust, multi-threaded, and supports automatic memory management (Garbage Collection).

3. Q: What is the difference between JDK, JRE, and JVM?
   A: JDK (Java Development Kit) contains JRE (Java Runtime Environment) and development tools. JRE provides libraries and JVM (Java Virtual Machine) to execute Java programs.

4. Q: What is the purpose of the ‘static’ keyword in Java?
   A: The ‘static’ keyword is used to create class-level members that can be accessed without creating an object of the class.

5. Q: What is the difference between ‘==’ and ‘equals()’ in Java?
   A: ‘==’ compares object references, whereas ‘equals()’ compares object content (if overridden in a class like String).

6. Q: What is the difference between method overloading and method overriding?
   A: Overloading occurs when multiple methods have the same name but different parameters. Overriding occurs when a subclass provides a specific implementation for a method in its superclass.

7. Q: What is a constructor in Java?
   A: A constructor is a special method that initializes an object. It has the same name as the class and does not return any value.

8. Q: What is the difference between an interface and an abstract class?
   A: An abstract class can have both abstract and concrete methods, while an interface only has abstract methods (until Java 8, where default methods were introduced).

9. Q: What is the significance of the ‘final’ keyword?
   A: ‘final’ can be used for variables (constants), methods (prevent overriding), and classes (prevent inheritance).

10. Q: What is exception handling in Java?
    A: Exception handling is a mechanism to handle runtime errors using try, catch, finally, throw, and throws keywords.

11. Q: What is the difference between checked and unchecked exceptions?
    A: Checked exceptions are checked at compile-time (e.g., IOException), whereas unchecked exceptions occur at runtime (e.g., NullPointerException).

12. Q: What is multi-threading in Java?
    A: Multi-threading allows concurrent execution of two or more threads to maximize CPU utilization.

13. Q: How do you create a thread in Java?
    A: By extending the Thread class or implementing the Runnable interface.

14. Q: What is synchronization in Java?
    A: Synchronization prevents multiple threads from accessing a critical section of code simultaneously, ensuring data consistency.

15. Q: What is the difference between HashMap and Hashtable?
    A: HashMap is not synchronized, while Hashtable is synchronized and thread-safe.

16. Q: What is a lambda expression in Java?
    A: A lambda expression provides a clear and concise way to represent an anonymous function.

17. Q: What is the difference between ArrayList and LinkedList?
    A: ArrayList is backed by a dynamic array and provides fast random access, while LinkedList is implemented using a doubly linked list and provides efficient insertion/deletion.

18. Q: What is garbage collection in Java?
    A: Garbage collection automatically removes unused objects from memory to free up space.

19. Q: What is the difference between stack and heap memory?
    A: Stack memory stores method calls and local variables, while heap memory stores objects dynamically allocated at runtime.

20. Q: What is a functional interface in Java?
    A: A functional interface has exactly one abstract method and can be used with lambda expressions.

21. Q: What is the purpose of the ‘transient’ keyword in Java?
    A: The ‘transient’ keyword prevents a variable from being serialized.

22. Q: What is reflection in Java?
    A: Reflection allows inspecting and manipulating classes, methods, and fields at runtime.

23. Q: What are design patterns in Java?
    A: Design patterns are reusable solutions to common software design problems, such as Singleton, Factory, and Observer patterns.

24. Q: What is the difference between deep copy and shallow copy?
    A: A deep copy creates a new independent object, while a shallow copy only copies references to the original object.

25. Q: What is JDBC?
    A: JDBC (Java Database Connectivity) is an API that allows Java applications to interact with databases.

26. Q: What is Spring Framework?
    A: Spring is a lightweight Java framework for building enterprise applications with features like dependency injection and AOP.

27. Q: What is Hibernate?
    A: Hibernate is an ORM (Object-Relational Mapping) framework that simplifies database interactions in Java.

28. Q: What is a RESTful API in Java?
    A: A RESTful API is an API that follows REST principles and uses HTTP methods (GET, POST, PUT, DELETE) for communication.

29. Q: What is dependency injection in Java?
    A: Dependency injection is a design pattern where dependencies are injected into a class instead of being created inside it.

30. Q: What is the difference between SOAP and REST?
    A: SOAP is a protocol that uses XML for message exchange, while REST is an architectural style that supports multiple formats like JSON.

31. Q: What is an annotation in Java?
    A: Annotations provide metadata about code and are used for configuration, documentation, and runtime processing.

32. Q: What is serialization in Java?
    A: Serialization converts an object into a byte stream for storage or transmission.

33. Q: What is the Java Memory Model (JMM)?
    A: The JMM defines how threads interact through memory and guarantees visibility and ordering of shared variables.

34. Q: What is a daemon thread in Java?
    A: A daemon thread runs in the background and terminates when all user threads finish execution.

35. Q: What is an Enum in Java?
    A: An Enum is a special data type used to define collections of constants.

36. Q: What is the difference between String, StringBuffer, and StringBuilder?
    A: String is immutable, while StringBuffer and StringBuilder are mutable. StringBuilder is faster than StringBuffer as it is not synchronized.

37. Q: What is a Proxy class in Java?
    A: A Proxy class allows creating dynamic implementations of interfaces at runtime.

38. Q: What is method reference in Java?
    A: A method reference is a shorthand notation of a lambda expression to refer to an existing method.

39. Q: What is the difference between Comparator and Comparable?
    A: Comparable is used for natural ordering, whereas Comparator allows custom sorting logic.

40. Q: What is the default scope of a bean in Spring?
    A: The default scope of a Spring bean is singleton.

41. Q: What is Autowiring in Spring?
    A: Autowiring automatically injects dependencies into beans using annotations like @Autowired.

42. Q: What is the difference between @Component, @Service, and @Repository?
    A: @Component is a generic annotation, @Service is for service layer, and @Repository is for DAO layer.

43. Q: What is Lazy Loading in Hibernate?
    A: Lazy loading delays the loading of objects until they are needed.

44. Q: What is a Microservice?
    A: A microservice is an independent, loosely coupled service that performs a specific function.

45. Q: What is the role of an API Gateway in Microservices?
    A: API Gateway manages API requests, authentication, and rate limiting.

46. Q: What is the difference between SOAP Web Services and REST Web Services?
    A: SOAP uses XML and strict standards, while REST is more flexible and supports multiple data formats.

47. Q: What is the purpose of the ‘volatile’ keyword?
    A: The ‘volatile’ keyword ensures that a variable's value is always read from main memory.

48. Q: What is the Observer Design Pattern?
    A: The Observer pattern allows multiple objects to listen for changes in a subject.

49. Q: What is the difference between Executors and Threads in Java?
    A: Executors manage thread pools, while threads represent individual tasks.

50. Q: How do you handle memory leaks in Java?
    A: Use proper resource management, avoid circular references, and utilize profiling tools.
```
```
51. What is the difference between ConcurrentHashMap and HashMap?
HashMap: Not thread-safe, allows one null key and multiple null values.

ConcurrentHashMap: Thread-safe, does not allow null keys or values, and provides better performance in multi-threaded environments.

52. What is the difference between CountDownLatch and CyclicBarrier?
CountDownLatch: A thread waits for other threads to complete their tasks before proceeding.

CyclicBarrier: A set of threads wait for each other to reach a common barrier point.

53. What is the purpose of the CompletableFuture class in Java?
CompletableFuture is used for asynchronous programming and supports chaining, combining, and handling exceptions in asynchronous tasks.

54. What is the difference between Stream and Collection in Java?
Collection: A data structure to store and manipulate groups of objects.

Stream: A sequence of elements supporting sequential and parallel aggregate operations.

55. What is the difference between map() and flatMap() in Java Streams?
map(): Transforms each element of the stream into another object.

flatMap(): Transforms each element into a stream and flattens the resulting streams into a single stream.

56. What is the purpose of the Optional class in Java?
Optional is used to represent an object that may or may not contain a non-null value, reducing the need for null checks.

57. What is the difference between peek() and forEach() in Java Streams?
peek(): Used for debugging and intermediate operations.

forEach(): Used for terminal operations to perform an action on each element.

58. What is the difference between parallelStream() and stream().parallel()?
Both methods enable parallel processing, but parallelStream() is a direct method on collections, while stream().parallel() is a method on the Stream interface.

59. What is the purpose of the Spliterator interface in Java?
Spliterator is used for traversing and partitioning elements of a source, especially for parallel processing.

60. What is the difference between ReentrantLock and synchronized?
synchronized: Built-in keyword for thread synchronization.

ReentrantLock: Provides more flexibility, such as try-lock, fairness, and interruptible locks.

61. What is the purpose of the StampedLock class in Java?
StampedLock is an advanced lock that supports optimistic locking, read/write locks, and improved performance over ReentrantReadWriteLock.

62. What is the difference between ThreadLocal and InheritableThreadLocal?
ThreadLocal: Provides thread-specific variables.

InheritableThreadLocal: Allows child threads to inherit values from parent threads.

63. What is the purpose of the Phaser class in Java?
Phaser is a reusable synchronization barrier that allows threads to wait for each other at multiple phases.

64. What is the difference between ForkJoinPool and ExecutorService?
ExecutorService: A general-purpose thread pool.

ForkJoinPool: Optimized for divide-and-conquer tasks using the fork-join framework.

65. What is the purpose of the VarHandle class in Java?
VarHandle provides low-level, atomic operations on variables, replacing sun.misc.Unsafe in modern Java.

66. What is the difference between AtomicInteger and volatile int?
AtomicInteger: Provides atomic operations like increment, decrement, and compare-and-swap.

volatile int: Ensures visibility but does not provide atomicity.

67. What is the purpose of the Flow API in Java?
The Flow API provides interfaces for implementing reactive streams in Java.

68. What is the difference between Predicate, Consumer, and Supplier in Java?
Predicate: Represents a boolean-valued function.

Consumer: Represents an operation that accepts a single input and returns no result.

Supplier: Represents a supplier of results.

69. What is the purpose of the MethodHandle class in Java?
MethodHandle provides a direct, type-safe reference to a method or field, enabling dynamic invocation.

70. What is the difference between ClassLoader and ModuleLayer in Java?
ClassLoader: Loads classes into the JVM.

ModuleLayer: Manages modules in a modular system (introduced in Java 9).

71. What is the purpose of the ServiceLoader class in Java?
ServiceLoader is used to load service providers implementing a specific interface.

72. What is the difference between ProcessBuilder and Runtime.exec()?
Runtime.exec(): Executes a command in a separate process.

ProcessBuilder: Provides more control over process creation and environment.

73. What is the purpose of the Compact Strings feature in Java?
Compact Strings optimize memory usage by using a byte array instead of a char array for strings containing only Latin-1 characters.

74. What is the difference between String::new and String::valueOf?
String::new: Creates a new String object.

String::valueOf: Converts an object to its string representation.

75. What is the purpose of the StackWalker class in Java?
StackWalker provides a way to traverse and filter stack traces efficiently.

76. What is the difference between ByteBuffer and MappedByteBuffer?
ByteBuffer: A buffer for bytes.

MappedByteBuffer: A direct buffer mapped to a region of a file.

77. What is the purpose of the Varargs feature in Java?
Varargs allows a method to accept a variable number of arguments of the same type.

78. What is the difference between try-with-resources and finally?
try-with-resources: Automatically closes resources declared in the try block.

finally: Executes code regardless of whether an exception occurs.

79. What is the purpose of the @SafeVarargs annotation in Java?
@SafeVarargs suppresses warnings related to heap pollution when using varargs with generic types.

80. What is the difference between Pattern.compile() and String.matches()?
Pattern.compile(): Compiles a regex pattern for reuse.

String.matches(): Compiles and matches a regex in one step.

81. What is the purpose of the Files class in Java?
The Files class provides utility methods for file operations, such as reading, writing, and copying.

82. What is the difference between BufferedReader and Scanner?
BufferedReader: Efficient for reading large text files.

Scanner: Provides parsing capabilities for primitive types and strings.

83. What is the purpose of the NIO.2 API in Java?
NIO.2 provides improved file I/O operations, including asynchronous file channels and file system APIs.

84. What is the difference between FileChannel and AsynchronousFileChannel?
FileChannel: Synchronous file operations.

AsynchronousFileChannel: Asynchronous file operations.

85. What is the purpose of the WatchService class in Java?
WatchService monitors directories for changes, such as file creation, modification, or deletion.

86. What is the difference between JVM, JRE, and JDK?
JVM: Executes Java bytecode.

JRE: Provides libraries and JVM to run Java applications.

JDK: Includes JRE and development tools for creating Java applications.

87. What is the purpose of the jshell tool in Java?
jshell is an interactive REPL (Read-Eval-Print Loop) tool for testing Java code snippets.

88. What is the difference between module-info.java and MANIFEST.MF?
module-info.java: Defines modules in the Java Platform Module System (JPMS).

MANIFEST.MF: Defines metadata for JAR files.

89. What is the purpose of the jlink tool in Java?
jlink creates custom runtime images by linking modules and their dependencies.

90. What is the difference between javac and java commands?
javac: Compiles Java source code into bytecode.

java: Executes Java bytecode.

91. What is the purpose of the jmod tool in Java?
jmod creates JMOD files for packaging modules.

92. What is the difference between JIT and AOT compilation?
JIT (Just-In-Time): Compiles bytecode to native code at runtime.

AOT (Ahead-Of-Time): Compiles bytecode to native code before execution.

93. What is the purpose of the GraalVM in Java?
GraalVM is a high-performance runtime that supports multiple languages and provides AOT compilation.

94. What is the difference between G1GC and ZGC?
G1GC: A garbage collector designed for low-latency applications.

ZGC: A scalable, low-latency garbage collector for large heaps.

95. What is the purpose of the Epsilon garbage collector?
Epsilon is a no-op garbage collector used for performance testing and short-lived applications.

96. What is the difference between JVM and Docker?
JVM: Executes Java bytecode.

Docker: A platform for containerizing applications, including JVM-based apps.

97. What is the purpose of the jstat tool in Java?
jstat monitors JVM statistics, such as garbage collection and memory usage.

98. What is the difference between jmap and jhat?
jmap: Generates heap dumps.

jhat: Analyzes heap dumps.

99. What is the purpose of the jstack tool in Java?
jstack generates thread dumps for debugging and analyzing thread states.

100. What is the difference between JMX and JFR?
JMX (Java Management Extensions): Monitors and manages JVM and application metrics.

JFR (Java Flight Recorder): Records detailed runtime events for performance analysis.

```
```
101. What is the difference between String, StringBuffer, and StringBuilder? Provide an example.
Answer:

String: Immutable and thread-safe.

StringBuffer: Mutable and thread-safe.

StringBuilder: Mutable and not thread-safe.

Example:

java
Copy
String str = "Hello";
str.concat(" World"); // Creates a new String object

StringBuffer buffer = new StringBuffer("Hello");
buffer.append(" World"); // Modifies the same object

StringBuilder builder = new StringBuilder("Hello");
builder.append(" World"); // Modifies the same object
102. Write a Java program to reverse a string using recursion.
Answer:

java
Copy
public class ReverseString {
    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverse("Hello")); // Output: olleH
    }
}
103. Write a Java program to find the factorial of a number using recursion.
Answer:

java
Copy
public class Factorial {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); // Output: 120
    }
}
104. Write a Java program to check if a number is prime.
Answer:

java
Copy
public class PrimeNumber {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(29)); // Output: true
    }
}
105. Write a Java program to find the Fibonacci series using recursion.
Answer:

java
Copy
public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + " "); // Output: 0 1 1 2 3 5 8 13 21 34
        }
    }
}
106. Write a Java program to implement a custom Comparator for sorting.
Answer:

java
Copy
import java.util.*;

class Employee {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class AgeComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.age - e2.age;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("John", 30),
            new Employee("Alice", 25)
        );
        Collections.sort(employees, new AgeComparator());
        employees.forEach(e -> System.out.println(e.name + " " + e.age));
    }
}
107. Write a Java program to demonstrate the use of Optional.
Answer:

java
Copy
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(null);
        System.out.println(optional.orElse("Default Value")); // Output: Default Value
    }
}
108. Write a Java program to demonstrate the use of Stream API.
Answer:

java
Copy
import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println); // Output: 2 4
    }
}
109. Write a Java program to demonstrate the use of flatMap in Streams.
Answer:

java
Copy
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
            Arrays.asList("a", "b"),
            Arrays.asList("c", "d")
        );
        List<String> flatList = listOfLists.stream()
                                           .flatMap(List::stream)
                                           .collect(Collectors.toList());
        System.out.println(flatList); // Output: [a, b, c, d]
    }
}
110. Write a Java program to demonstrate the use of CompletableFuture.
Answer:

java
Copy
import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> "Hello")
                         .thenApply(s -> s + " World")
                         .thenAccept(System.out::println); // Output: Hello World
    }
}
111. Write a Java program to demonstrate the use of ThreadLocal.
Answer:

java
Copy
public class ThreadLocalExample {
    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        threadLocal.set("Main Thread");
        System.out.println(threadLocal.get()); // Output: Main Thread

        new Thread(() -> {
            threadLocal.set("Worker Thread");
            System.out.println(threadLocal.get()); // Output: Worker Thread
        }).start();
    }
}
112. Write a Java program to demonstrate the use of ReentrantLock.
Answer:

java
Copy
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    private static final ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        lock.lock();
        try {
            System.out.println("Locked by " + Thread.currentThread().getName());
        } finally {
            lock.unlock();
        }
    }
}
113. Write a Java program to demonstrate the use of AtomicInteger.
Answer:

java
Copy
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
    private static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {
        System.out.println(counter.incrementAndGet()); // Output: 1
    }
}

```
