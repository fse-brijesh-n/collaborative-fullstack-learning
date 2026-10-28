# PostgreSQL Advanced Interview Q&A

## Overview
PostgreSQL Advanced covers indexing strategies, query optimization, transactions, concurrency, partitioning, replication, and performance tuning for large-scale database systems.

---

## Interview Questions & Answers

1. **What is PostgreSQL?**
   - PostgreSQL is a powerful, open-source relational database with advanced features like JSONB, arrays, and extensions.

2. **What is VACUUM in PostgreSQL?**
   - VACUUM reclaims storage from deleted/updated rows, maintaining database performance.

3. **What is ANALYZE in PostgreSQL?**
   - ANALYZE gathers statistics about table contents, improving query planner decisions.

4. **What is the difference between VACUUM and ANALYZE?**
   - VACUUM removes dead tuples; ANALYZE updates statistics for query planning.

5. **What is AUTOVACUUM?**
   - PostgreSQL background process automatically running VACUUM and ANALYZE.

6. **What are PostgreSQL Indexes?**
   - Indexes speed up data retrieval but slow down inserts/updates.

7. **What types of Indexes exist?**
   - B-tree (default), Hash, GiST, GIN, BRIN, BLOOM.

8. **What is B-tree Index?**
   - Balanced tree index suitable for range queries and equality comparisons.

9. **What is Hash Index?**
   - Hash index suitable only for equality comparisons, not range queries.

10. **What is GiST Index?**
    - Generalized Search Tree for complex data types and spatial queries.

11. **What is GIN Index?**
    - Generalized Inverted Index for array and full-text search.

12. **What is BRIN Index?**
    - Block Range Index for large tables with naturally ordered data.

13. **What is Partial Index?**
    - Index on subset of table rows matching WHERE condition.

14. **When do you use Partial Index?**
    - When frequently querying specific subset of rows.

15. **What is Covering Index (Index Only Scan)?**
    - Index containing all columns needed for query, avoiding table access.

16. **What is EXPLAIN?**
    - Command showing query execution plan for performance analysis.

17. **What is EXPLAIN ANALYZE?**
    - EXPLAIN showing actual execution statistics.

18. **What are Query Plan Nodes?**
    - Sequential Scan, Index Scan, Bitmap Index Scan, Hash Join, Merge Join, etc.

19. **What is Sequential Scan?**
    - Reading entire table row by row, suitable for small tables.

20. **What is Index Scan?**
    - Using index to find rows, faster for selective queries.

21. **What is Bitmap Index Scan?**
    - Using multiple indexes combined with bitmap operations.

22. **What is Query Planner?**
    - PostgreSQL component generating optimal execution plans.

23. **What is Statistics Collection?**
    - Gathering data about table distribution for query optimization.

24. **What are PostgreSQL Transactions?**
    - ACID-compliant unit of work ensuring data consistency.

25. **What is ACID?**
    - Atomicity (all-or-nothing), Consistency (valid state), Isolation (concurrent independence), Durability (persistence).

26. **What are Isolation Levels?**
    - Read Uncommitted, Read Committed, Repeatable Read, Serializable.

27. **What is Dirty Read?**
    - Reading uncommitted data from another transaction.

28. **What is Non-repeatable Read?**
    - Data changed between two reads in same transaction.

29. **What is Phantom Read?**
    - New rows inserted between reads affecting result set.

30. **What is Read Committed?**
    - Default isolation level; prevents dirty reads.

31. **What is Repeatable Read?**
    - Prevents dirty and non-repeatable reads using snapshots.

32. **What is Serializable?**
    - Highest isolation level preventing all anomalies.

33. **What is MVCC (Multi-Version Concurrency Control)?**
    - PostgreSQL mechanism maintaining multiple versions of rows.

34. **Benefits of MVCC?**
    - Readers don't block writers, writes don't block readers.

35. **What is Tuple Visibility?**
    - Determining which row versions are visible to transactions.

36. **What is Transaction ID (XID)?**
    - Identifier for transaction in PostgreSQL.

37. **What is XID Wraparound?**
    - Issue when transaction IDs overflow causing data visibility problems.

38. **What is Deadlock in PostgreSQL?**
    - Two transactions waiting for locks held by each other.

39. **How do you prevent Deadlock?**
    - Order lock acquisition consistently, use shorter transactions, reduce lock contention.

40. **What is Table Partitioning?**
    - Dividing large table into smaller physical pieces for performance.

41. **What are Partitioning Methods?**
    - Range partitioning, List partitioning, Hash partitioning, Composite partitioning.

42. **What is Range Partitioning?**
    - Partitioning based on value ranges (e.g., by date).

43. **What is List Partitioning?**
    - Partitioning based on predefined list of values.

44. **What is Hash Partitioning?**
    - Partitioning using hash function on column.

45. **What is Foreign Data Wrapper (FDW)?**
    - PostgreSQL extension accessing data from external sources.

46. **What is Window Function?**
    - Function operating on subset of rows (window) related to current row.

47. **What are Common Window Functions?**
    - ROW_NUMBER(), RANK(), DENSE_RANK(), LAG(), LEAD(), SUM() OVER.

48. **What is CTE (Common Table Expression)?**
    - Named temporary query result used in main query.

49. **What is Recursive CTE?**
    - CTE referring to itself for hierarchical queries.

50. **What is JSON/JSONB in PostgreSQL?**
    - Native JSON data type, JSONB is binary format with better performance.

51. **What is Full-Text Search?**
    - PostgreSQL full-text search capability with relevance ranking.

52. **What is Replication in PostgreSQL?**
    - Copying data to standby servers for redundancy and scaling.

53. **What is Streaming Replication?**
    - WAL (Write-Ahead Log) streamed continuously to standby.

54. **What is WAL (Write-Ahead Logging)?**
    - PostgreSQL logging changes before applying to database ensuring durability.

55. **What is Logical Replication?**
    - Replicating changes at logical level (INSERT, UPDATE, DELETE).

56. **What is Physical Replication?**
    - Byte-for-byte replication of data files.

57. **What is Standby Server?**
    - Read-only replica of primary database.

58. **What is Failover?**
    - Promoting standby to primary when primary fails.

59. **What is Connection Pooling?**
    - PgBouncer or pgpool-II maintaining connection pool.

60. **How do you monitor PostgreSQL?**
    - pg_stat_statements, pg_stat_activity, logs, monitoring tools (Prometheus, DataGrip).

---

## Performance Optimization Checklist

- Use appropriate indexes
- Analyze query plans with EXPLAIN
- Configure VACUUM/AUTOVACUUM
- Monitor slow queries
- Use connection pooling
- Partition large tables
- Archive old data
- Update table statistics
- Tune work_mem and shared_buffers
- Monitor cache hit ratio

---

## Best Practices

1. Create indexes on frequently filtered columns
2. Regularly VACUUM and ANALYZE
3. Monitor query performance
4. Use prepared statements
5. Set appropriate isolation levels
6. Use partitioning for large tables
7. Configure connection pooling
8. Enable WAL for replication
9. Monitor disk space
10. Regular backups with PITR

---

## Common Mistakes

1. Missing indexes on large tables
2. Not VACUUM/ANALYZE regularly
3. Wrong isolation levels
4. Sequential scans on large tables
5. N+1 query problems
6. Poor connection management
7. Not monitoring performance
8. Inadequate backups
9. Wrong data types
10. No query optimization

---

## Summary

Master indexing strategies (B-tree, GIN, BRIN), query optimization with EXPLAIN, ACID transactions, and MVCC concurrency. Understand partitioning, replication, and performance tuning. Use VACUUM, ANALYZE, and monitoring tools for production performance.

---

## References

- [PostgreSQL Official Docs](https://www.postgresql.org/docs/)
- [PostgreSQL Performance Tuning](https://www.postgresql.org/docs/current/performance-tips.html)
- [PostgreSQL MVCC](https://www.postgresql.org/docs/current/mvcc.html)
- [PostgreSQL Administration](https://www.postgresql.org/docs/current/admin.html)
