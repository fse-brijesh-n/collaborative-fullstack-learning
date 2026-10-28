# Caching Strategies Interview Q&A

## Overview
Caching Strategies optimize performance by storing frequently accessed data in fast-access storage. Key patterns include cache-aside, write-through, write-behind, and strategies for cache invalidation.

---

## Interview Questions & Answers

1. **What is Caching?**
   - Caching stores frequently accessed data in fast storage (memory) to reduce latency and load on backend.

2. **What are Types of Caching?**
   - Client-side, CDN, database query cache, in-memory (Redis, Memcached), cache layer.

3. **What is Client-Side Caching?**
   - Browser caching using HTTP headers (Cache-Control, ETag, Last-Modified).

4. **What is CDN Caching?**
   - Content Delivery Network caching static content at edge locations.

5. **What is Database Query Caching?**
   - Caching query results to avoid repeated database queries.

6. **What is In-Memory Caching?**
   - Storing data in RAM using Redis, Memcached for ultra-fast access.

7. **What is Cache Layer?**
   - Dedicated caching infrastructure between application and database.

8. **What is Cache-Aside Pattern?**
   - Application checks cache; on miss, fetches from database and updates cache.

9. **What are Cache-Aside Disadvantages?**
   - Cache misses cause latency, stale data possible, duplicate requests.

10. **What is Write-Through Cache Pattern?**
    - Writes go through cache to database synchronously.

11. **What are Write-Through Advantages?**
    - Consistent data, cache always updated, suitable for important data.

12. **What are Write-Through Disadvantages?**
    - Slower writes due to database latency, cache miss on reads.

13. **What is Write-Behind (Write-Back) Pattern?**
    - Writes go to cache first, asynchronously synced to database.

14. **What are Write-Behind Advantages?**
    - Fast writes, batching reduces database load.

15. **What are Write-Behind Disadvantages?**
    - Data loss risk if cache fails before sync, eventual consistency.

16. **What is Write-Around Pattern?**
    - Writes bypass cache, going directly to database.

17. **When do you use Write-Around?**
    - When data written rarely read, avoiding cache pollution.

18. **What is Cache Invalidation?**
    - Removing outdated data from cache when source data changes.

19. **What are Cache Invalidation Strategies?**
    - TTL (time-to-live), explicit invalidation, LRU eviction, event-based.

20. **What is TTL (Time-To-Live)?**
    - Cache entry expires after specified duration.

21. **What is Explicit Invalidation?**
    - Manually removing cache entries when data changes.

22. **What is LRU (Least Recently Used) Eviction?**
    - Evicting least-accessed entries when cache is full.

23. **What is Event-Based Invalidation?**
    - Cache invalidated when specific events occur.

24. **What is Cache Stampede?**
    - Multiple requests querying database simultaneously when cache expires.

25. **How do you prevent Cache Stampede?**
    - Probabilistic early expiration, lock-based invalidation, cache warming.

26. **What is Probabilistic Early Expiration?**
    - Pre-expiring cache entries before actual expiration.

27. **What is Lock-Based Invalidation?**
    - Locking cache entry while refreshing from source.

28. **What is Cache Warming?**
    - Pre-loading cache with data before peak load.

29. **What is Redis?**
    - In-memory data store supporting strings, lists, sets, hashes, sorted sets.

30. **What is Memcached?**
    - Simple in-memory cache for key-value data.

31. **What is the difference between Redis and Memcached?**
    - Redis supports data structures and persistence; Memcached is simpler, pure cache.

32. **What is Redis Persistence?**
    - RDB (snapshots) and AOF (append-only file) for durability.

33. **What is Redis Replication?**
    - Master-Slave replication for redundancy and read scaling.

34. **What is Redis Sentinel?**
    - High-availability framework for automatic failover.

35. **What is Redis Cluster?**
    - Distributed Redis for horizontal scaling and sharding.

36. **What is Hashing in Distributed Caching?**
    - Determining which cache node stores key-value pair.

37. **What is Consistent Hashing?**
    - Hashing algorithm minimizing key redistribution when nodes added/removed.

38. **What is Eviction Policy?**
    - Strategy for removing entries when cache is full.

39. **What are Redis Eviction Policies?**
    - Noeviction, LRU, LFU, TTL-based, random.

40. **What is Cache Coherence?**
    - Consistency of data across multiple cache instances.

41. **What is Multi-Tier Caching?**
    - Multiple caching levels (L1, L2, L3) with increasing capacity.

42. **What is Query Result Caching?**
    - Caching database query results.

43. **What is Page Caching?**
    - Caching entire web pages or templates.

44. **What is Fragment Caching?**
    - Caching individual page fragments or components.

45. **What is Object Caching?**
    - Caching serialized objects.

46. **What is Cache Partitioning?**
    - Dividing cache across multiple servers.

47. **What is Cache Replication?**
    - Duplicating cache entries across nodes for redundancy.

48. **What is Cache Coherency Problem?**
    - Multiple copies of data potentially out of sync.

49. **What is the difference between Strong and Eventual Consistency?**
    - Strong: all replicas immediately consistent; Eventual: consistency after some time.

50. **What is Cache Performance Metric?**
    - Hit ratio, miss ratio, latency, throughput.

51. **What is Cache Hit Ratio?**
    - Percentage of requests finding data in cache.

52. **What is Bloom Filter for Caching?**
    - Data structure probabilistically checking element membership, preventing cache misses.

53. **What is Local Caching?**
    - In-process caching in application memory (e.g., Guava Cache).

54. **What is Distributed Caching?**
    - Caching shared across multiple servers (Redis, Memcached).

55. **What are Local Cache Advantages?**
    - Ultra-fast access, no network latency.

56. **What are Local Cache Disadvantages?**
    - Inconsistency across instances, memory limited.

57. **What is Cache-Aside with Warming?**
    - Loading cache with data before application starts.

58. **What is Cache Compression?**
    - Compressing cached data to reduce memory usage.

59. **What is Lazy Loading?**
    - Loading data into cache only when requested.

60. **How do you monitor cache performance?**
    - Hit ratio, eviction rate, memory usage, latency metrics.

---

## Caching Decision Tree

```
Do you need persistence?
├─ YES: Redis
└─ NO: Need data structures?
    ├─ YES: Redis
    └─ NO: Memcached (simple)

Multiple servers?
├─ YES: Redis/Memcached cluster
└─ NO: Local cache (Guava)
```

---

## Best Practices

1. Cache reads, not writes
2. Use appropriate TTL
3. Monitor cache hit ratio
4. Implement cache warming
5. Use consistent hashing
6. Handle cache failures gracefully
7. Invalidate strategically
8. Avoid cache stampede
9. Consider serialization cost
10. Monitor memory usage

---

## Common Mistakes

1. Caching write-heavy data
2. Wrong invalidation strategy
3. Not handling cache failures
4. Excessive TTL values
5. Storing too much in cache
6. Missing monitoring
7. Not warming cache
8. Inconsistent cache data
9. Over-caching
10. Ignoring serialization overhead

---

## Caching Patterns Summary

| Pattern | Best For | Tradeoff |
|---------|----------|----------|
| **Cache-Aside** | Read-heavy | Cache misses, stale data |
| **Write-Through** | Important data | Slow writes |
| **Write-Behind** | Write-heavy | Data loss risk |
| **Write-Around** | Rarely-read | Cache miss on reads |

---

## Summary

Master caching patterns: cache-aside, write-through, write-behind, and write-around. Understand invalidation strategies, cache stampede prevention, and distributed caching with Redis. Implement monitoring and choose appropriate cache storage based on requirements.

---

## References

- [Redis Official Documentation](https://redis.io/documentation)
- [Memcached Wiki](https://memcached.org/)
- [Cache Patterns](https://codeahoy.com/2017/08/11/caching-strategies-different-ways-to-cache-data/)
- [High Scalability Caching](http://highscalability.com/)
