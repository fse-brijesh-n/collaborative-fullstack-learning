# Java Concurrency Interview Q&A

## Overview
Java Concurrency covers multithreading, synchronization, thread pools, concurrent collections, locks, and modern concurrent utilities for building thread-safe, scalable applications.

---

## Interview Questions & Answers

1. **What is Concurrency?**
   - Concurrency is executing multiple tasks simultaneously using threads to maximize CPU utilization.

2. **What is Thread?**
   - Thread is lightweight process with independent execution path sharing memory with other threads.

3. **How do you create a Thread?**
   - Extend Thread class or implement Runnable interface.

4. **What is the difference between Thread and Runnable?**
   - Thread is class; Runnable is interface allowing multiple inheritance benefits.

5. **What is Thread Lifecycle?**
   - New → Runnable → Running → Blocked/Waiting → Terminated.

6. **What is New State?**
   - Thread created but not started; start() not called yet.

7. **What is Runnable State?**
   - Thread ready to run but waiting for CPU time.

8. **What is Running State?**
   - Thread actively executing.

9. **What is Blocked/Waiting State?**
   - Thread paused (lock wait, sleep, I/O wait).

10. **What is Terminated State?**
    - Thread execution completed or stopped.

11. **What is start() method?**
    - Creates new thread and calls run() in that thread.

12. **What is run() method?**
    - Method containing thread's executable code.

13. **Why not call run() directly?**
    - Calling run() executes in current thread; start() creates new thread.

14. **What is Synchronization?**
    - Mechanism preventing multiple threads from accessing shared resource simultaneously.

15. **What is synchronized keyword?**
    - Keyword ensuring only one thread executes block at a time.

16. **What is Synchronized Method?**
    - Entire method locked; only one thread can execute.

17. **What is Synchronized Block?**
    - Specific code section locked; more flexible than method synchronization.

18. **What is Intrinsic Lock (Monitor Lock)?**
    - Built-in lock associated with each object.

19. **What is Deadlock?**
    - Two or more threads waiting for locks held by each other.

20. **How do you prevent Deadlock?**
    - Lock ordering, timeout, avoiding nested locks, try-finally for lock release.

21. **What is Race Condition?**
    - Multiple threads accessing/modifying shared data causing unpredictable results.

22. **What is Volatile Keyword?**
    - Ensures visibility; volatile variables read from main memory, not cache.

23. **What is Atomic Variable?**
    - Thread-safe variable with atomic operations (AtomicInteger, AtomicBoolean).

24. **What is CAS (Compare-And-Swap)?**
    - Atomic operation comparing value and swapping if match, without blocking.

25. **What is ABA Problem?**
    - Value changes A→B→A; CAS cannot detect change.

26. **What is AtomicInteger?**
    - Thread-safe integer wrapper with atomic operations.

27. **What is AtomicReference?**
    - Thread-safe object reference wrapper.

28. **What are Atomic Collections?**
    - CopyOnWriteArrayList, ConcurrentHashMap for thread-safe collection operations.

29. **What is CopyOnWriteArrayList?**
    - Thread-safe list creating copy on modification, good for mostly-read workloads.

30. **What is ConcurrentHashMap?**
    - Thread-safe map with segment locking for better concurrency than Hashtable.

31. **What is Lock Interface?**
    - Replacement for synchronized keyword providing more control.

32. **What is ReentrantLock?**
    - Lock allowing same thread to acquire multiple times without deadlock.

33. **What is ReadWriteLock?**
    - Multiple readers or single writer pattern.

34. **What is StampedLock?**
    - High-performance lock supporting optimistic reading.

35. **What is Condition Variable?**
    - Mechanism for threads to wait for specific condition.

36. **What is wait()?**
    - Thread releases lock and waits for notification.

37. **What is notify()?**
    - Wakes one waiting thread.

38. **What is notifyAll()?**
    - Wakes all waiting threads.

39. **What is Producer-Consumer Problem?**
    - Classic concurrency problem with producers creating data, consumers processing.

40. **What is BlockingQueue?**
    - Queue blocking when empty (poll) or full (put).

41. **What is LinkedBlockingQueue?**
    - Unbounded or bounded blocking queue.

42. **What is PriorityBlockingQueue?**
    - Blocking queue with element priority ordering.

43. **What is SynchronousQueue?**
    - Queue with no capacity; put and take must match.

44. **What is ThreadPool?**
    - Reusable pool of threads for executing tasks.

45. **What is ExecutorService?**
    - Interface for managing thread pool and task execution.

46. **What is Executors utility?**
    - Factory methods creating thread pools (newFixedThreadPool, newCachedThreadPool).

47. **What is FixedThreadPool?**
    - ThreadPool with fixed number of threads.

48. **What is CachedThreadPool?**
    - ThreadPool creating threads as needed, reusing idle threads.

49. **What is ScheduledExecutorService?**
    - ThreadPool supporting delayed and periodic task execution.

50. **What is Future?**
    - Represents result of asynchronous computation.

51. **What is get() method in Future?**
    - Blocking call retrieving result when ready.

52. **What is isDone()?**
    - Checking if task completed.

53. **What is isCancelled()?**
    - Checking if task was cancelled.

54. **What is cancel()?**
    - Cancelling task execution.

55. **What is CompletableFuture?**
    - Future with explicit completion and composition capabilities.

56. **What is Fork/Join Framework?**
    - Framework for parallel processing using divide-and-conquer.

57. **What is ForkJoinTask?**
    - Task for fork/join framework.

58. **What is RecursiveTask?**
    - ForkJoinTask returning result.

59. **What is Thread Interrupt?**
    - Mechanism requesting thread to stop gracefully.

60. **What is interrupted()?**
    - Static method checking current thread's interrupt status.

---

## Concurrency Best Practices

| Practice | Description |
|----------|-------------|
| **Minimize Locking** | Reduce synchronized blocks |
| **Use Thread Pools** | Avoid creating threads manually |
| **Prefer Immutability** | Immutable objects need no sync |
| **Use Concurrent Collections** | Better than synchronized collections |
| **Avoid Nested Locks** | Prevents deadlock |
| **Use Volatile Carefully** | Not substitute for synchronization |
| **Test with Stress Tests** | Find concurrency bugs |
| **Use Modern Utilities** | CompletableFuture, ForkJoin |

---

## Synchronized vs Lock

| Aspect | Synchronized | Lock |
|--------|------------|------|
| **Syntax** | Keyword | Explicit acquire/release |
| **Flexibility** | Limited | High |
| **Reentrant** | Yes | Yes (ReentrantLock) |
| **Fairness** | No | Configurable |
| **Timeout** | No | Yes (tryLock) |
| **Performance** | Good | Better in contention |

---

## Best Practices

1. Prefer immutable objects
2. Use thread pools over manual threads
3. Minimize synchronization scope
4. Use concurrent collections
5. Avoid nested locks
6. Use volatile for flags only
7. Handle interrupts properly
8. Test concurrency thoroughly
9. Use modern utilities (CompletableFuture)
10. Document thread-safety guarantees

---

## Common Mistakes

1. Calling run() instead of start()
2. Not synchronizing shared mutable state
3. Over-synchronizing causing bottlenecks
4. Deadlock from nested locks
5. Not handling InterruptedException
6. Using volatile as synchronization
7. Race conditions in initialization
8. Blocking operations in thread pool
9. Not testing concurrent code
10. Ignoring thread-safety documentation

---

## Summary

Master thread creation and lifecycle, synchronization mechanisms (synchronized keyword, locks), atomic variables, and concurrent collections. Understand thread pools, futures, and async programming with CompletableFuture. Know deadlock prevention, race condition avoidance, and modern concurrency utilities.

---

## References

- [Java Concurrency in Practice](https://www.oreilly.com/library/view/java-concurrency-in/0596007957/)
- [Java Official Concurrency Guide](https://docs.oracle.com/javase/tutorial/essential/concurrency/)
- [Baeldung Concurrency](https://www.baeldung.com/java-concurrency)
- [Java Memory Model](https://docs.oracle.com/javase/specs/jls/se21/html/jls-17.html)
