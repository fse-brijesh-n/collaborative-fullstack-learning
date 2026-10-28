# Distributed Systems Interview Q&A

## Overview
Distributed Systems covers consensus algorithms, fault tolerance, data consistency, communication patterns, and architectural principles for building reliable systems across multiple machines.

---

## Interview Questions & Answers

1. **What is Distributed System?**
   - System with multiple computers communicating over network, appearing as single system to users.

2. **What are Distributed System Challenges?**
   - Network delays, partial failures, inconsistency, coordination, scalability.

3. **What is Partial Failure?**
   - Some components fail while others continue operating.

4. **What is the difference between Distributed and Parallel Systems?**
   - Distributed systems are geographically dispersed; parallel systems are in same location.

5. **What is Network Partition?**
   - Communication failure between groups of nodes.

6. **What is Byzantine Failure?**
   - Node behaves unpredictably or maliciously.

7. **What is Byzantine Fault Tolerance?**
   - System continuing correctly even with byzantine failures.

8. **What is CAP Theorem?**
   - Can't guarantee all of Consistency, Availability, Partition tolerance.

9. **What is Consistency?**
   - All nodes see same data at same time.

10. **What is Availability?**
    - System responding to requests even with failures.

11. **What is Partition Tolerance?**
    - System continuing despite network partitions.

12. **What is Strong Consistency?**
    - All replicas immediately reflect writes.

13. **What is Eventual Consistency?**
    - Replicas eventually consistent after writes.

14. **What is Consensus Algorithm?**
    - Algorithm achieving agreement among distributed nodes.

15. **What is Paxos?**
    - Consensus algorithm guaranteeing agreement in faulty systems.

16. **What is Raft?**
    - Simpler consensus algorithm than Paxos for leader election and log replication.

17. **What is Leader Election?**
    - Process selecting single node as leader for coordination.

18. **What is Quorum?**
    - Minimum number of nodes for decision-making.

19. **What is Majority Quorum?**
    - More than half of total nodes.

20. **What is Split Brain?**
    - Two groups independently making conflicting decisions.

21. **What is Heartbeat?**
    - Periodic signal confirming node is alive.

22. **What is Timeout?**
    - Assuming failure if no heartbeat within time window.

23. **What is State Machine Replication?**
    - Replicating deterministic state machine across nodes.

24. **What is Log Replication?**
    - Replicating command log to ensure consistency.

25. **What is Lamport Timestamp?**
    - Logical clock ordering events without synchronized physical clocks.

26. **What is Vector Clock?**
    - Extension of Lamport timestamps tracking causal relationships.

27. **What is Happened-Before Relationship?**
    - Causal ordering of events in distributed system.

28. **What is Causality?**
    - Event B depends on event A if A happened before B.

29. **What is Snapshot?**
    - Consistent system state at logical point in time.

30. **What is Checkpointing?**
    - Saving system state for recovery from failures.

31. **What is Message Passing?**
    - Inter-process communication via messages.

32. **What is RPC (Remote Procedure Call)?**
    - Calling procedures on remote machines as local calls.

33. **What is gRPC?**
    - High-performance RPC framework using Protocol Buffers.

34. **What is Serialization?**
    - Converting objects to byte streams for transmission.

35. **What is Deserialization?**
    - Reconstructing objects from byte streams.

36. **What is Marshalling?**
    - Preparing data for transmission (serialization + encoding).

37. **What is Unmarshalling?**
    - Reconstructing from transmitted format.

38. **What is Load Balancing?**
    - Distributing load across servers.

39. **What is Service Discovery?**
    - Dynamically locating services in system.

40. **What is Load Balancer Failure?**
    - No single point of failure for load balancer.

41. **What is Health Check?**
    - Periodic verification that nodes are operational.

42. **What is Failover?**
    - Automatic switching to backup on failure.

43. **What is Replication Factor?**
    - Number of copies for data availability.

44. **What is Shard Key?**
    - Key determining data partition in sharding.

45. **What is Two-Phase Commit?**
    - Protocol ensuring atomicity in distributed transactions.

46. **What is Prepare Phase in 2PC?**
    - Coordinating resources to commit/abort.

47. **What is Commit Phase in 2PC?**
    - Actually executing decisions.

48. **What is Saga Pattern?**
    - Long-running transactions with compensating transactions.

49. **What is Orchestration vs Choreography?**
    - Orchestration has central coordinator; choreography is event-based.

50. **What is Idempotency?**
    - Operation producing same result if repeated.

51. **What is Idempotent Key?**
    - Unique key preventing duplicate processing.

52. **What is At-Least-Once Delivery?**
    - Messages delivered at least once, possible duplicates.

53. **What is At-Most-Once Delivery?**
    - Messages delivered at most once, possible loss.

54. **What is Exactly-Once Delivery?**
    - Ideal but typically implemented with idempotency.

55. **What is Monitoring in Distributed Systems?**
    - Observing system for health and performance.

56. **What are Three Pillars of Observability?**
    - Metrics, Logs, Traces.

57. **What is Distributed Tracing?**
    - Following request path through multiple services.

58. **What is SLO (Service Level Objective)?**
    - Target metrics like availability, latency.

59. **What is SLA (Service Level Agreement)?**
    - Contractual commitment to SLO with penalties.

60. **What is Eventual Consistency Model?**
    - System guarantees consistency eventually with defined conflicts resolution.

---

## Key Distributed Concepts

| Concept | Definition |
|---------|-----------|
| **Consistency** | Data agreement across nodes |
| **Availability** | System responsiveness |
| **Partition Tolerance** | Operation during network split |
| **Consensus** | Agreement among nodes |
| **Replication** | Data duplication |
| **Sharding** | Data partitioning |
| **Failover** | Automatic recovery |

---

## Best Practices

1. Assume network failures will occur
2. Implement health checks
3. Use quorum-based decisions
4. Design for idempotency
5. Implement distributed tracing
6. Monitor all three pillars
7. Use consensus algorithms
8. Handle partial failures
9. Plan for split-brain
10. Test failure scenarios

---

## Common Mistakes

1. Assuming reliable networks
2. Ignoring Byzantine failures
3. Poor consensus design
4. No idempotency
5. Inadequate monitoring
6. Not handling timeouts
7. Circular dependencies
8. Poor data partitioning
9. Missing health checks
10. Not testing failures

---

## Summary

Understand CAP theorem, ACID vs BASE, and consistency models. Master consensus algorithms (Paxos, Raft), replication strategies, and failure detection. Know state machine replication, distributed tracing, and saga patterns. Design resilient systems with health checks and proper monitoring.

---

## References

- [Designing Data-Intensive Applications](https://dataintensive.info/)
- [Distributed Systems](https://www.distributed-systems.net/)
- [Raft Consensus](https://raft.io/)
- [Google Distributed Systems](https://research.google/pubs/pub45855/)
