# System Design Interview Q&A

## Overview
System Design is the process of defining the architecture and components of a system to handle large-scale applications. It covers scalability, availability, consistency, performance, and maintainability.

---

## Interview Questions & Answers

1. **What is System Design?**
   - System Design is the process of architecting a system to handle requirements at scale, considering scalability, availability, consistency, performance, and cost.

2. **What are the key components of System Design?**
   - Load balancing, caching, databases, message queues, CDN, monitoring, and API gateways.

3. **What is Scalability?**
   - Scalability is the ability of a system to handle increased load by adding resources (horizontal or vertical scaling).

4. **What is Vertical Scaling?**
   - Vertical scaling increases the capacity of a single server by adding more CPU, RAM, or storage.

5. **What is Horizontal Scaling?**
   - Horizontal scaling increases capacity by adding more servers to distribute the load.

6. **What is the difference between Vertical and Horizontal Scaling?**
   - Vertical scaling has limits and single-point-of-failure risks, while horizontal scaling is more flexible but requires coordination.

7. **What is Load Balancing?**
   - Load balancing distributes incoming requests across multiple servers to prevent overload on any single server.

8. **What are the types of Load Balancing?**
   - Round-robin, least connections, IP hash, weighted, and geographic load balancing.

9. **What is Round-Robin Load Balancing?**
   - Requests are distributed equally across servers in circular order.

10. **What is Least Connections Load Balancing?**
    - Requests are sent to the server with the fewest active connections.

11. **What is Caching?**
    - Caching stores frequently accessed data in memory for faster retrieval.

12. **What are the types of Caching?**
    - Client-side caching, CDN caching, database query caching, and in-memory caching (Redis, Memcached).

13. **What is Cache Invalidation?**
    - Cache invalidation removes outdated data from cache to ensure consistency with the source.

14. **What are Cache Invalidation Strategies?**
    - TTL (time-to-live), write-through, write-behind, and event-based invalidation.

15. **What is the Cache Stampede Problem?**
    - When cache expires, multiple requests query the database simultaneously, overloading it.

16. **How do you prevent Cache Stampede?**
    - Use probabilistic early expiration, lock-based invalidation, or cache warming.

17. **What is a Content Delivery Network (CDN)?**
    - A CDN distributes content globally through edge servers close to users for faster delivery.

18. **How does CDN work?**
    - Users request content from nearest edge server; if not cached, it fetches from origin and caches for future requests.

19. **What is Database Replication?**
    - Replication maintains copies of data across multiple servers for redundancy and availability.

20. **What are the types of Replication?**
    - Master-Slave (primary-secondary), Master-Master (bidirectional), and multi-datacenter replication.

21. **What is Database Sharding?**
    - Sharding partitions data across multiple databases based on a shard key for scalability.

22. **What is a Shard Key?**
    - A shard key is a field used to determine which database partition contains specific data.

23. **What are the challenges of Sharding?**
    - Uneven distribution, cross-shard queries complexity, and resharding data when scale changes.

24. **What is Database Normalization?**
    - Normalization organizes data to reduce redundancy and improve data integrity.

25. **What is Database Denormalization?**
    - Denormalization combines data to improve query performance, accepting some data redundancy.

26. **When do you use Denormalization?**
    - For read-heavy systems where query performance is critical and consistency can be eventual.

27. **What is ACID?**
    - Atomicity (all-or-nothing), Consistency (valid state), Isolation (concurrent independence), Durability (persistence).

28. **What is BASE?**
    - Basically Available, Soft state, Eventually consistent—opposite of ACID, used for distributed systems.

29. **What is Eventual Consistency?**
    - Data may be temporarily inconsistent but becomes consistent eventually across all replicas.

30. **What is Strong Consistency?**
    - All replicas reflect the same data immediately after a write.

31. **What is a Message Queue?**
    - A message queue decouples services by allowing asynchronous communication.

32. **What are the benefits of Message Queues?**
    - Loose coupling, asynchronous processing, better fault tolerance, and scalability.

33. **What is Publish-Subscribe (Pub-Sub)?**
    - Publishers send messages to topics; subscribers receive messages from topics they subscribe to.

34. **What is the difference between Message Queue and Pub-Sub?**
    - Message Queue routes messages to one consumer, while Pub-Sub broadcasts to multiple subscribers.

35. **What is an API Gateway?**
    - An API Gateway routes requests to appropriate services, providing authentication, rate limiting, and load balancing.

36. **What functions does an API Gateway provide?**
    - Request routing, authentication, rate limiting, request/response transformation, and monitoring.

37. **What is Rate Limiting?**
    - Rate limiting restricts the number of requests a client can make in a time window.

38. **What are Rate Limiting Algorithms?**
    - Token bucket, leaky bucket, sliding window, and fixed window.

39. **What is the Microservices Architecture?**
    - A software architecture where applications are composed of loosely coupled, independently deployable services.

40. **What are the benefits of Microservices?**
    - Independent scaling, technology flexibility, easier deployment, and fault isolation.

41. **What are the challenges of Microservices?**
    - Network latency, data consistency, debugging complexity, and operational overhead.

42. **What is a Service Mesh?**
    - A dedicated infrastructure layer managing service-to-service communication.

43. **What is Circuit Breaker Pattern?**
    - A pattern that prevents cascading failures by stopping requests to failing services.

44. **What is Bulkhead Pattern?**
    - Isolating components to prevent failures in one component from affecting others.

45. **What is Retry Logic?**
    - Automatically retrying failed requests with exponential backoff to handle transient failures.

46. **What is Monitoring and Observability?**
    - Monitoring tracks system metrics; observability enables understanding system behavior from external outputs.

47. **What are the Three Pillars of Observability?**
    - Metrics (quantitative measurements), Logs (detailed events), and Traces (request flows).

48. **What is Distributed Tracing?**
    - Tracking a request's path through multiple services to identify bottlenecks and failures.

49. **What is an SLO (Service Level Objective)?**
    - Target availability and performance metrics a service commits to maintaining.

50. **What is an SLA (Service Level Agreement)?**
    - Contractual commitment to SLO with penalties for missing targets.

51. **What is the CAP Theorem?**
    - Consistency, Availability, Partition tolerance—a distributed system can guarantee only two of three.

52. **What is Availability?**
    - Availability is the percentage of time a system is operational and accessible.

53. **What is Latency?**
    - Latency is the time delay between a request and response.

54. **What is Throughput?**
    - Throughput is the number of requests processed per unit time.

55. **What is a Database Connection Pool?**
    - A pool maintains reusable database connections, reducing overhead of connection creation.

56. **What is Read Replicas?**
    - Replicas dedicated for read operations, used to distribute read load.

57. **What is the Master-Slave Replication Pattern?**
    - Master handles writes; slaves handle reads and provide redundancy.

58. **What is the Master-Master Replication Pattern?**
    - All databases can accept writes, but requires conflict resolution mechanisms.

59. **What is Consensus Algorithm?**
    - Algorithms like Raft and Paxos that achieve agreement among distributed nodes.

60. **How do you design a large-scale system?**
    - Start with requirements and constraints, identify bottlenecks, apply caching and load balancing, implement asynchronous processing, and use CDN for static content.

---

## Common System Design Scenarios

### Design a URL Shortener (like bit.ly)
- Use hash functions to generate short codes
- Store mappings in database with optional expiration
- Use cache for frequent redirects
- Implement rate limiting to prevent abuse

### Design a Social Media Feed (like Twitter)
- Use graph database or denormalized data structure
- Implement fanout for distributing posts to followers
- Use cache for feed retrieval
- Handle real-time updates with WebSockets

### Design Video Streaming Platform (like YouTube)
- Use CDN for video distribution
- Implement adaptive bitrate streaming
- Use object storage (S3) for video files
- Implement recommendation engine

### Design Online Marketplace (like Amazon)
- Implement microservices for products, orders, payments
- Use message queue for order processing
- Implement search engine for product discovery
- Use caching for frequently accessed products

### Design Real-Time Chat Application
- Use WebSockets for real-time communication
- Implement message queue for reliability
- Use database for message history
- Implement distributed session management

---

## Key Concepts

### Scalability
- Horizontal vs vertical scaling
- Load balancing strategies
- Database sharding

### Reliability
- Replication and failover
- Backup and recovery
- Circuit breaker patterns

### Performance
- Caching strategies
- CDN usage
- Database optimization

### Maintainability
- Clear API design
- Monitoring and logging
- Documentation

---

## Best Practices

1. Start with requirements and constraints
2. Identify bottlenecks before optimizing
3. Use caching strategically
4. Implement load balancing for scalability
5. Design for fault tolerance with replicas
6. Use async processing for non-critical operations
7. Implement monitoring and alerting
8. Plan for capacity and growth
9. Use database indexing strategically
10. Document architecture decisions

---

## Common Mistakes

1. Over-engineering for scale before validating demand
2. Not considering single points of failure
3. Ignoring network latency in distributed systems
4. Poor database schema design
5. Insufficient monitoring and alerting
6. Not planning for data backup and recovery
7. Over-caching causing consistency issues
8. Ignoring security in design phase
9. Not considering operational complexity
10. Inadequate documentation

---

## Summary

System design requires balancing scalability, availability, consistency, and performance. Master load balancing, caching, replication, sharding, and asynchronous processing. Understand CAP theorem, ACID/BASE, and various architectural patterns. Practice designing real-world systems like URL shorteners, feeds, and streaming platforms.

---

## References

- [System Design Primer](https://github.com/donnemartin/system-design-primer)
- [Designing Data-Intensive Applications](https://dataintensive.info/)
- [High Scalability Blog](http://highscalability.com/)
- [AWS Architecture Center](https://aws.amazon.com/architecture/)
