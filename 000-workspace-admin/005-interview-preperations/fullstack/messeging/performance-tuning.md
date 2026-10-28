# Performance Tuning & Optimization Interview Q&A

## Overview
Performance Tuning covers identifying bottlenecks, measuring metrics, optimization strategies at code, database, and infrastructure levels, and maintaining application performance.

---

## Interview Questions & Answers

1. **What is Performance?**
   - Measure of how fast system responds to requests and completes tasks.

2. **What is Latency?**
   - Time delay between request and response.

3. **What is Throughput?**
   - Number of requests completed per unit time.

4. **What is Response Time?**
   - Total time from request to response received.

5. **What is Tail Latency?**
   - Latency of slowest requests (p99, p99.9).

6. **Why focus on Tail Latency?**
   - User experience impacted by slowest requests, not averages.

7. **What is Profiling?**
   - Measuring resource usage (CPU, memory, I/O) of code sections.

8. **What is Performance Bottleneck?**
   - Component limiting overall system performance.

9. **How do you identify Bottlenecks?**
   - Profiling, monitoring, benchmarking, load testing.

10. **What is Premature Optimization?**
    - Optimizing before identifying actual bottlenecks.

11. **What is Benchmark?**
    - Measurable test comparing performance under controlled conditions.

12. **What is Load Test?**
    - Testing system under expected production load.

13. **What is Stress Test?**
    - Testing system beyond normal capacity.

14. **What are Performance Metrics?**
    - Response time, throughput, CPU, memory, I/O, error rate.

15. **What is CPU Profiling?**
    - Measuring CPU time spent in functions.

16. **What is Memory Profiling?**
    - Measuring memory allocation and heap usage.

17. **What is I/O Profiling?**
    - Measuring disk and network I/O operations.

18. **What is Flame Graph?**
    - Visualization showing CPU time distribution across functions.

19. **What is Optimization Strategy?**
    - Improving specific aspect (speed, memory, scalability).

20. **What is Algorithm Optimization?**
    - Choosing more efficient algorithms reducing time complexity.

21. **What is Caching?**
    - Storing frequently accessed data in fast storage.

22. **What is Memoization?**
    - Caching function results avoiding recomputation.

23. **What is Lazy Loading?**
    - Deferring resource loading until needed.

24. **What is Batch Processing?**
    - Grouping operations for efficiency.

25. **What is Connection Pooling?**
    - Reusing database connections reducing overhead.

26. **What is Query Optimization?**
    - Improving database query performance through indexing and refactoring.

27. **What is Database Index?**
    - Data structure speeding up data retrieval.

28. **What is Query Plan?**
    - Sequence of steps database uses to execute query.

29. **What is N+1 Query Problem?**
    - Executing many queries instead of single join.

30. **What is Code Optimization?**
    - Improving code efficiency for speed/memory.

31. **What is Loop Optimization?**
    - Improving loop performance by reducing iterations or work.

32. **What is String Concatenation Optimization?**
    - Using StringBuilder instead of repeated + operator.

33. **What is Garbage Collection Tuning?**
    - Configuring GC for performance requirements.

34. **What is Heap Size Tuning?**
    - Adjusting heap size to prevent GC overhead.

35. **What is Object Pooling?**
    - Reusing objects avoiding allocation overhead.

36. **What is Memory Leak?**
    - Objects held in memory no longer needed.

37. **What is Compression?**
    - Reducing data size for faster transmission.

38. **What is GZIP Compression?**
    - Compressing HTTP responses for bandwidth reduction.

39. **What is Minification?**
    - Removing unnecessary characters from code/resources.

40. **What is Code Splitting?**
    - Dividing code into smaller chunks loaded as needed.

41. **What is Tree Shaking?**
    - Removing unused code from bundles.

42. **What is Image Optimization?**
    - Reducing image file size while maintaining quality.

43. **What is Lazy Load Images?**
    - Loading images only when they enter viewport.

44. **What is Responsive Images?**
    - Serving appropriately sized images for device.

45. **What is HTTP Caching?**
    - Using Cache-Control and ETags for browser caching.

46. **What is CDN?**
    - Content Delivery Network for geographic distribution.

47. **What is Database Replication?**
    - Copying data across servers for read scaling.

48. **What is Read Replica?**
    - Replica handling read-only requests.

49. **What is Database Sharding?**
    - Partitioning data across multiple databases.

50. **What is Denormalization?**
    - Adding redundancy for query performance.

51. **What is Async Processing?**
    - Processing tasks without blocking caller.

52. **What is Message Queue?**
    - Decoupling services for async communication.

53. **What is Microservices Scaling?**
    - Scaling individual services independently.

54. **What is Horizontal Scaling?**
    - Adding more servers for capacity.

55. **What is Vertical Scaling?**
    - Adding resources to existing server.

56. **What is Load Balancing?**
    - Distributing load across servers.

57. **What is Caching Strategy?**
    - Deciding what, where, when to cache.

58. **What is Performance Regression?**
    - Unintended performance degradation.

59. **What is SLA (Service Level Agreement)?**
    - Commitment to performance targets.

60. **What is Performance Testing in CI/CD?**
    - Automated performance tests in build pipeline.

---

## Common Performance Issues

| Issue | Cause | Solution |
|-------|-------|----------|
| **Slow Response** | Inefficient algorithm | Algorithm optimization |
| **High CPU** | Tight loops, heavy processing | Optimize code, async |
| **High Memory** | Memory leaks, large objects | Fix leaks, optimize allocation |
| **Database Slow** | Missing index, N+1 queries | Index, batch queries |
| **Network Slow** | Large payloads, many requests | Compression, HTTP/2 |

---

## Optimization Priority

1. Identify bottlenecks (measure before optimizing)
2. Algorithm improvements first (biggest impact)
3. Database optimization (indexing, queries)
4. Caching (appropriate strategy)
5. Code-level optimization
6. Infrastructure scaling
7. Monitoring and alerting

---

## Best Practices

1. Measure before optimizing
2. Profile to identify bottlenecks
3. Optimize algorithms first
4. Use caching strategically
5. Monitor in production
6. Test performance regularly
7. Load test before deployment
8. Document performance requirements
9. Avoid premature optimization
10. Set performance budgets

---

## Common Mistakes

1. Optimizing without profiling
2. Premature optimization
3. Wrong optimization focus
4. Ignoring tail latency
5. Not monitoring production
6. Inadequate load testing
7. Over-caching
8. Wrong cache strategy
9. Not benchmarking
10. Ignoring infrastructure limits

---

## Summary

Identify performance bottlenecks through profiling and monitoring. Optimize algorithms, database queries, and caching. Use load testing to verify improvements. Monitor production metrics. Follow optimization priorities: algorithms first, then database, caching, code, and infrastructure.

---

## References

- [Performance.now() API](https://developer.mozilla.org/en-US/docs/Web/API/Performance)
- [Chrome DevTools Performance](https://developer.chrome.com/docs/devtools/performance/)
- [Google Web Vitals](https://web.dev/vitals/)
- [Site Reliability Engineering](https://sre.google/books/)
