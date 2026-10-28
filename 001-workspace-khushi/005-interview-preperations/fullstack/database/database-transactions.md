# Database Transactions Interview Q&A

## Overview
Database Transactions ensure ACID properties, data consistency, and integrity. They handle concurrent access, isolation levels, and recovery from failures.

---

## Interview Questions & Answers

1. **What is a Transaction?**
   - Transaction is atomic unit of work completing entirely or not at all.

2. **What is ACID?**
   - Atomicity (all-or-nothing), Consistency (valid state), Isolation (independence), Durability (persistence).

3. **What is Atomicity?**
   - All changes in transaction apply or none apply.

4. **What is Consistency?**
   - Transaction takes database from one valid state to another.

5. **What is Isolation?**
   - Transactions don't interfere with each other's execution.

6. **What is Durability?**
   - Once committed, changes persist even after failures.

7. **What is Dirty Read?**
   - Reading uncommitted changes from another transaction.

8. **What is Non-Repeatable Read?**
   - Same query returns different results within transaction.

9. **What is Phantom Read?**
   - Rows added/removed by other transaction affecting result set.

10. **What are Isolation Levels?**
    - Read Uncommitted, Read Committed, Repeatable Read, Serializable.

11. **What is Read Uncommitted?**
    - Lowest isolation; allows dirty reads.

12. **What is Read Committed?**
    - Prevents dirty reads; default level in most databases.

13. **What is Repeatable Read?**
    - Prevents dirty and non-repeatable reads.

14. **What is Serializable?**
    - Highest isolation; prevents all anomalies.

15. **What is Locking?**
    - Mechanism preventing concurrent access to data.

16. **What is Shared Lock (Read Lock)?**
    - Multiple transactions can hold simultaneously for reading.

17. **What is Exclusive Lock (Write Lock)?**
    - Only one transaction can hold for modification.

18. **What is Deadlock?**
    - Two transactions waiting for locks held by each other.

19. **How do you detect Deadlock?**
    - Wait-for graph, timeout, deadlock detection algorithms.

20. **How do you recover from Deadlock?**
    - Rollback one transaction, retry with backoff.

21. **What is Two-Phase Locking (2PL)?**
    - Lock acquisition phase, then lock release phase.

22. **What is Two-Phase Commit (2PC)?**
    - Protocol ensuring atomicity in distributed transactions.

23. **What are phases in 2PC?**
    - Prepare phase (vote), Commit phase (execute).

24. **What is Optimistic Locking?**
    - Checking for conflicts at commit time without locking.

25. **What is Pessimistic Locking?**
    - Acquiring locks before accessing data.

26. **When do you use Optimistic Locking?**
    - Low-contention scenarios to improve concurrency.

27. **When do you use Pessimistic Locking?**
    - High-contention scenarios to prevent conflicts.

28. **What is Version Control for Optimistic Locking?**
    - Version number incremented on updates, checked on commit.

29. **What is Timestamp Ordering?**
    - Using timestamps to order transactions and detect conflicts.

30. **What is MVCC (Multi-Version Concurrency Control)?**
    - Multiple versions of data for concurrent read/write.

31. **How does MVCC work?**
    - Writers create new versions; readers see snapshot version.

32. **What are MVCC Benefits?**
    - Readers never blocked by writers; high concurrency.

33. **What is Snapshot Isolation?**
    - Transaction works on consistent snapshot of data.

34. **What is BEGIN TRANSACTION?**
    - Starting explicit transaction.

35. **What is COMMIT?**
    - Saving transaction changes permanently.

36. **What is ROLLBACK?**
    - Undoing all transaction changes.

37. **What is SAVEPOINT?**
    - Marker for partial rollback within transaction.

38. **What is @Transactional in Spring?**
    - Annotation declaring method/class as transactional.

39. **What is Propagation in @Transactional?**
    - How transaction interacts with existing transaction.

40. **What are Propagation Values?**
    - REQUIRED (create if needed), SUPPORTS (use existing), MANDATORY, REQUIRES_NEW, etc.

41. **What is Isolation in @Transactional?**
    - Specifying isolation level for transaction.

42. **What is readOnly in @Transactional?**
    - Hint marking transaction read-only for optimization.

43. **What is timeout in @Transactional?**
    - Maximum time transaction can run before rollback.

44. **What is rollbackFor?**
    - Specifying exceptions causing rollback.

45. **What is noRollbackFor?**
    - Specifying exceptions not causing rollback.

46. **What is Compensating Transaction?**
    - Inverse operation undoing previous transaction.

47. **What is Saga Pattern?**
    - Long-running transaction with compensating transactions.

48. **What is Event Sourcing?**
    - Storing state changes as immutable events.

49. **What is CAP Theorem?**
    - Can't simultaneously guarantee Consistency, Availability, Partition tolerance.

50. **What is BASE (Eventually Consistent)?**
    - Basically Available, Soft state, Eventually consistent.

51. **What is Write-Ahead Logging (WAL)?**
    - Logging changes before applying to database.

52. **What is Checkpoint?**
    - Flushing committed changes to disk.

53. **What is Recovery Process?**
    - Using WAL to recover from failures.

54. **What is Cascading Rollback?**
    - One rollback triggering others causing inefficiency.

55. **What is Abort Protocol?**
    - Protocol preventing cascading rollback.

56. **What is Serialization Issue?**
    - Transactions violating serializability.

57. **What is Strict 2PL?**
    - Holding exclusive locks until transaction end.

58. **What is Timestamp-based Concurrency Control?**
    - Using timestamps to order transactions.

59. **What is SQL Transaction Control?**
    - Using BEGIN, COMMIT, ROLLBACK, SAVEPOINT.

60. **What is Connection Pooling for Transactions?**
    - Maintaining pool of connections for transaction execution.

---

## Isolation Level Comparison

| Level | Dirty | Non-Rep | Phantom |
|-------|-------|---------|---------|
| **Read Uncommitted** | ✓ | ✓ | ✓ |
| **Read Committed** | ✗ | ✓ | ✓ |
| **Repeatable Read** | ✗ | ✗ | ✓ |
| **Serializable** | ✗ | ✗ | ✗ |

---

## Best Practices

1. Use appropriate isolation level
2. Keep transactions short
3. Handle rollback scenarios
4. Use connection pooling
5. Implement proper error handling
6. Avoid nested transactions when possible
7. Monitor transaction performance
8. Use optimistic locking for low-contention
9. Implement compensating transactions for sagas
10. Test concurrent transactions

---

## Common Mistakes

1. Too-long transactions
2. Wrong isolation level
3. Not handling rollback
4. Ignoring deadlock possibility
5. Insufficient connection pool
6. Not testing concurrent scenarios
7. Missing error handling
8. Poor transaction logging
9. Nested transactions without care
10. Ignoring performance impact

---

## Summary

Master ACID properties, isolation levels, and locking strategies (pessimistic/optimistic). Understand MVCC for concurrency, 2PC for distributed transactions, and saga pattern for long-running operations. Know Spring @Transactional configuration and transaction management best practices.

---

## References

- [Database Transactions Guide](https://en.wikipedia.org/wiki/Database_transaction)
- [ACID Properties](https://en.wikipedia.org/wiki/ACID)
- [Spring Transaction Management](https://spring.io/projects/spring-framework)
- [PostgreSQL Transaction Documentation](https://www.postgresql.org/docs/current/tutorial-transactions.html)
