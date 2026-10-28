# Java Advanced Topics Interview Q&A

## Overview
Java Advanced topics cover JVM internals, garbage collection, memory management, concurrency internals, and performance optimization for experienced Java developers.

---

## Interview Questions & Answers

1. **What is the JVM (Java Virtual Machine)?**
   - JVM is an abstract computing machine that enables a computer to run Java programs and programs written in other languages compiled to Java bytecode.

2. **How does Java achieve platform independence?**
   - Java programs compile to bytecode that runs on any JVM, regardless of the underlying OS or hardware.

3. **What is the Java Memory Model (JMM)?**
   - JMM defines how threads interact through memory and provides rules for visibility and ordering of shared variable access.

4. **What are the memory areas in JVM?**
   - Heap (shared objects), Stack (method calls and local variables), Method Area (class structures), Program Counter, and Native Method Stack.

5. **What is the Heap?**
   - Heap is the runtime memory area where objects are allocated, shared across all threads.

6. **What is the Stack?**
   - Stack stores method calls and local variables, with each thread having its own stack.

7. **What is the Method Area?**
   - Method Area (Class/Static Area) stores class structures, method data, code, runtime constant pools.

8. **What is Garbage Collection?**
   - Garbage Collection automatically reclaims memory by removing unreachable objects.

9. **What is Generational Hypothesis?**
   - Objects tend to die young; most objects are collected soon after creation.

10. **What are Garbage Collection Generations?**
    - Young Generation (new objects), Old Generation (long-lived objects), and Permanent Generation (class metadata).

11. **What is the Young Generation?**
    - Where new objects are allocated; collections are frequent and fast.

12. **What is the Old Generation?**
    - Where long-lived objects reside; collections are less frequent but take longer.

13. **What is Mark-Sweep Garbage Collection?**
    - Mark identifies reachable objects; Sweep removes unreachable objects.

14. **What is Mark-Compact Garbage Collection?**
    - Mark identifies reachable objects; Compact moves them together to reduce fragmentation.

15. **What is Mark-Copy Garbage Collection?**
    - Mark identifies reachable objects in one space; Copy moves them to another space.

16. **What is the difference between Serial and Parallel GC?**
    - Serial GC uses one thread; Parallel GC uses multiple threads for concurrent collection.

17. **What is Concurrent Garbage Collection?**
    - GC runs concurrently with application threads, reducing pause times.

18. **What is CMS (Concurrent Mark Sweep)?**
    - CMS garbage collector performs mark/sweep concurrently with minimal pause times.

19. **What is G1 (Garbage First)?**
    - G1 divides heap into regions and collects regions with most garbage first, providing predictable pause times.

20. **What is Stop-the-World?**
    - All application threads pause during full garbage collection for the GC to work.

21. **What is Full GC?**
    - Full Garbage Collection collects entire heap (Young and Old generations) with longest pause times.

22. **What is Minor GC?**
    - Minor GC collects Young Generation, more frequent with shorter pause times.

23. **What is Major GC?**
    - Major GC collects Old Generation, less frequent but longer pause times.

24. **What is GC Tuning?**
    - Adjusting JVM flags to optimize GC behavior for specific application requirements.

25. **What are common GC flags?**
    - `-Xms` (initial heap), `-Xmx` (max heap), `-XX:+UseG1GC` (G1 GC), `-XX:+PrintGCDetails` (logging).

26. **What is Memory Leak in Java?**
    - Memory leak occurs when objects are unreachable but still held in memory (static references, circular references).

27. **How do you detect Memory Leaks?**
    - Use profiling tools like JProfiler, YourKit, or Java Flight Recorder to analyze heap dumps.

28. **What is Heap Dump?**
    - Heap dump is a snapshot of all objects in heap at a specific time, used for analyzing memory issues.

29. **What is Object Layout in Memory?**
    - Objects in heap contain object header (mark word, class reference) followed by field data and padding.

30. **What is Mark Word?**
    - Mark word stores object metadata like hash code, lock state, and garbage collection information.

31. **What is Biased Locking?**
    - Optimization assuming an object is locked by one thread, reducing synchronization overhead.

32. **What is Lock Coarsening?**
    - Combining multiple consecutive lock acquisitions into a single lock for efficiency.

33. **What is Lock Elimination?**
    - Compiler optimization removing locks when escape analysis proves they're unnecessary.

34. **What is Escape Analysis?**
    - Determines if an object's reference escapes a method or thread, enabling optimizations.

35. **What is TLAB (Thread Local Allocation Buffer)?**
    - TLAB allocates per-thread buffers in heap, reducing contention for thread-safe allocation.

36. **What is Intrinsic Lock?**
    - Java's built-in locking mechanism using synchronized keyword and object monitors.

37. **What is Monitor?**
    - A monitor is a synchronization construct associated with each Java object for mutual exclusion.

38. **What is Happens-Before?**
    - Happens-Before defines the order of memory operations, ensuring visibility across threads.

39. **What is Volatile?**
    - Volatile ensures visibility and prevents instruction reordering for memory operations.

40. **What is AtomicInteger?**
    - AtomicInteger provides atomic operations on integers without explicit synchronization using Compare-And-Swap (CAS).

41. **What is Compare-And-Swap (CAS)?**
    - CAS atomically updates a value if it matches the expected value, without blocking.

42. **What is ABA Problem?**
    - In CAS, value changes from A to B to A, making CAS unable to detect the change.

43. **What is ThreadLocal?**
    - ThreadLocal provides thread-isolated variable storage, each thread having its own value.

44. **What is ThreadLocal Memory Leak?**
    - Memory leak from not removing ThreadLocal values, keeping objects alive indefinitely.

45. **What is Fork/Join Framework?**
    - Framework for parallel processing using divide-and-conquer, recursively splitting work among threads.

46. **What is CompletableFuture?**
    - CompletableFuture enables asynchronous programming with composable operations on futures.

47. **What is Reactive Streams?**
    - Reactive Streams provide non-blocking, backpressure-aware asynchronous data handling.

48. **What is Backpressure?**
    - Mechanism for consumer to signal producer to slow down when overloaded.

49. **What is ClassLoader Hierarchy?**
    - Bootstrap ClassLoader (JDK classes), Extension ClassLoader (JDK extensions), Application ClassLoader (user classes).

50. **What is Class Loading Process?**
    - Loading (read bytecode), Linking (verify, prepare, resolve), Initialization (execute static code).

51. **What is Double Checked Locking?**
    - Pattern minimizing synchronization overhead by checking condition twice around lock.

52. **What is Singleton Pattern in Multithreaded Environment?**
    - Use static initializer (class loader ensures thread safety) or synchronized getInstance().

53. **What is Method Inlining?**
    - JIT compilation optimizing by replacing method calls with actual method code.

54. **What is Devirtualization?**
    - Optimization converting virtual method calls to direct calls when target is known.

55. **What is Speculative Optimization?**
    - JIT making assumptions about code paths and deoptimizing if assumptions fail.

56. **What is OSR (On-Stack Replacement)?**
    - Replacing currently executing method with optimized version without leaving method.

57. **What is String Interning?**
    - Storing single copy of identical strings; `intern()` adds to string pool.

58. **What is Metaspace?**
    - Native memory region storing class metadata in Java 8+, replacing PermGen.

59. **What is OutOfMemoryError?**
    - Exception thrown when JVM cannot allocate more memory or GC cannot reclaim enough space.

60. **What is the difference between Stack Overflow and Heap Overflow?**
    - Stack Overflow from deep recursion; Heap Overflow from excessive object allocation.

---

## JVM Flags for Performance Tuning

| Flag | Purpose |
|------|---------|
| `-Xms1g` | Initial heap size |
| `-Xmx4g` | Maximum heap size |
| `-XX:+UseG1GC` | Use G1 garbage collector |
| `-XX:+PrintGCDetails` | Log GC events |
| `-XX:+UnlockDiagnosticVMOptions` | Enable diagnostic options |
| `-XX:+PrintCompilation` | Log JIT compilation |
| `-XX:TieredStopAtLevel=4` | Limit JIT compilation levels |

---

## Best Practices

1. Monitor memory usage with JVM tools
2. Tune heap sizes for specific workload
3. Use appropriate garbage collector
4. Avoid static references causing leaks
5. Use ThreadLocal carefully, remove on cleanup
6. Understand happens-before relationships
7. Use AtomicXXX for simple atomic operations
8. Profile before optimizing
9. Avoid excessive object creation
10. Monitor GC pause times in production

---

## Common Mistakes

1. Setting wrong heap sizes (too small or too large)
2. Using volatile unnecessarily
3. Premature optimization without profiling
4. Ignoring GC pause times
5. Creating memory leaks with static references
6. Over-synchronizing code
7. Using wrong data structures
8. Not escaping analysis opportunities
9. Blocking operations in event loop
10. Not monitoring production performance

---

## Summary

Master JVM internals including memory layout, garbage collection types and tuning, concurrency mechanisms, and performance optimizations. Understand memory model, ClassLoading, and profiling tools. Know when to use ThreadLocal, Atomic classes, and synchronization primitives.

---

## References

- [Java Memory Model](https://docs.oracle.com/javase/specs/jls/se21/html/jls-17.html)
- [Java Garbage Collection](https://docs.oracle.com/en/java/javase/21/gctuning/)
- [Java Virtual Machine Specification](https://docs.oracle.com/javase/specs/jvms/se21/html/)
- [Mechanical Sympathy Blog](https://mechanical-sympathy.blogspot.com/)
