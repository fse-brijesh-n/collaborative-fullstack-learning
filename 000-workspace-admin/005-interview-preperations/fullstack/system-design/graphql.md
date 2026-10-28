# GraphQL Interview Q&A

## Overview
GraphQL is a query language and runtime for APIs that allows clients to request exactly the data they need, providing a more efficient alternative to REST APIs.

---

## Interview Questions & Answers

1. **What is GraphQL?**
   - GraphQL is a query language and server-side runtime for APIs that enables clients to request only the data they need, improving efficiency and flexibility compared to REST.

2. **What are the main differences between GraphQL and REST?**
   - GraphQL uses a single endpoint and allows flexible data requests, while REST uses multiple endpoints with fixed response structures. GraphQL reduces over-fetching and under-fetching.

3. **What is a Query in GraphQL?**
   - A Query is a request for data from a GraphQL server, similar to GET requests in REST but with the flexibility to specify exact fields needed.

4. **What is a Mutation in GraphQL?**
   - A Mutation is an operation for modifying server state, similar to POST/PUT/DELETE in REST.

5. **What is a Subscription in GraphQL?**
   - A Subscription enables real-time data updates by maintaining a connection with the server and pushing updates to clients when data changes.

6. **What is a Schema in GraphQL?**
   - A Schema defines the structure of the GraphQL API, including types, fields, and their relationships. It serves as a contract between client and server.

7. **What is a Type in GraphQL?**
   - A Type defines an object with fields, representing a shape of data that can be queried.

8. **What are scalar types in GraphQL?**
   - Scalar types are primitive data types: String, Int, Float, Boolean, and ID.

9. **What is an Enum in GraphQL?**
   - An Enum is a scalar type with predefined possible values, ensuring only valid values are used.

10. **What is an Interface in GraphQL?**
    - An Interface is an abstract type that defines a set of fields that types must implement.

11. **What is a Union in GraphQL?**
    - A Union is a type that represents one of several possible types, allowing a field to return different types.

12. **What is an Input Type in GraphQL?**
    - An Input Type is used for passing complex objects as arguments to queries and mutations.

13. **What is the difference between Type and Input Type?**
    - Types are used for output (responses), while Input Types are used for input (arguments).

14. **What is a Field in GraphQL?**
    - A Field is a property of a Type that returns a specific data type or another Type.

15. **What is a Resolver in GraphQL?**
    - A Resolver is a function that returns data for a field, mapping GraphQL queries to actual data sources.

16. **What is an Argument in GraphQL?**
    - An Argument is a parameter passed to a field, allowing customization of the field's behavior and response.

17. **What is the difference between Query and Mutation?**
    - Queries read data without side effects, while Mutations modify server state and can have side effects.

18. **What is a Fragment in GraphQL?**
    - A Fragment is a reusable piece of a query or mutation that can be included in multiple places.

19. **What are Variables in GraphQL?**
    - Variables allow parameterizing queries by passing dynamic values instead of hardcoding them.

20. **What is Aliasing in GraphQL?**
    - Aliasing allows renaming field names in the response without changing the actual field name in the schema.

21. **What is Introspection in GraphQL?**
    - Introspection allows querying the GraphQL schema itself, enabling tools like GraphiQL to provide autocomplete and documentation.

22. **What is the N+1 Query Problem in GraphQL?**
    - N+1 occurs when resolving a list of items requires an additional query for each item, causing performance issues. Solved using DataLoader.

23. **What is DataLoader in GraphQL?**
    - DataLoader is a utility that batches database requests to prevent N+1 query problems.

24. **What is pagination in GraphQL?**
    - Pagination limits the number of results returned, improving performance for large datasets using offset/limit or cursor-based pagination.

25. **What is Cursor-Based Pagination?**
    - Cursor-based pagination uses encoded cursors to mark position in a result set, providing stable pagination across data changes.

26. **What is a Directive in GraphQL?**
    - A Directive modifies the execution or inclusion of fields using @ syntax (e.g., @skip, @include, @deprecated).

27. **What are built-in directives in GraphQL?**
    - @skip(if: Boolean!), @include(if: Boolean!), and @deprecated(reason: String) are built-in directives.

28. **What is the difference between @skip and @include directives?**
    - @skip excludes a field if the condition is true, while @include includes a field if the condition is true.

29. **What is Authorization in GraphQL?**
    - Authorization controls what data users can access based on their permissions, implemented at resolver level.

30. **What is Authentication in GraphQL?**
    - Authentication verifies user identity, typically using JWT tokens passed in headers.

31. **What is Error Handling in GraphQL?**
    - GraphQL responses include an errors array containing field-level errors with messages and paths.

32. **What is Batch Processing in GraphQL?**
    - Batch processing groups multiple queries into a single request for efficiency.

33. **What is the difference between Serial and Parallel Execution in GraphQL?**
    - Serial execution processes fields sequentially, while parallel execution processes independent fields concurrently.

34. **What is Schema Stitching in GraphQL?**
    - Schema Stitching combines multiple GraphQL schemas into a single unified schema.

35. **What is Federation in GraphQL?**
    - Federation allows multiple GraphQL services to work together seamlessly, sharing a single composed schema.

36. **What is Apollo Federation?**
    - Apollo Federation is a framework for building federated GraphQL architectures with multiple services.

37. **What is Caching in GraphQL?**
    - Caching stores query results to reduce redundant computations and database queries.

38. **What is HTTP Caching in GraphQL?**
    - Since GraphQL uses POST, traditional HTTP caching is limited; solutions include GET-based queries or cache control headers.

39. **What is Subscription in GraphQL?**
    - Subscriptions enable real-time data by maintaining persistent connections and pushing updates.

40. **What protocols support GraphQL Subscriptions?**
    - WebSockets, Server-Sent Events (SSE), and HTTP streaming support subscriptions.

41. **What is Middleware in GraphQL?**
    - Middleware intercepts and processes requests before reaching resolvers, useful for logging, authentication, and validation.

42. **What is Context in GraphQL?**
    - Context is an object shared across all resolvers in a query, containing user info, database connections, etc.

43. **What is the difference between GraphQL and gRPC?**
    - GraphQL is query-language based with flexible data requests, while gRPC uses binary protocol for high-performance RPC.

44. **What is the SDL (Schema Definition Language) in GraphQL?**
    - SDL is the syntax for defining GraphQL schemas using type definitions.

45. **What are best practices for GraphQL Schema Design?**
    - Use descriptive names, organize fields logically, implement pagination, use custom scalars carefully, and version APIs thoughtfully.

46. **How do you optimize GraphQL queries?**
    - Use fragments for reusability, implement DataLoader for batch processing, use selective field requests, and cache results.

47. **What are common security issues in GraphQL?**
    - Over-exposing data, missing authentication/authorization, N+1 attacks, query depth attacks, and field-level access issues.

48. **What is Query Depth Limiting?**
    - Query Depth Limiting restricts how deeply nested queries can be, preventing DoS attacks.

49. **What is Query Complexity Analysis?**
    - Complexity analysis assigns weights to fields and calculates query complexity to prevent expensive queries.

50. **How do you implement rate limiting in GraphQL?**
    - Use middleware to track requests, implement per-user/IP limits, and return 429 errors when exceeded.

51. **What is Testing in GraphQL?**
    - Test resolvers unit tests, integration tests with databases, query validation, and error handling.

52. **What tools are used for GraphQL development?**
    - Apollo Server, GraphQL.js, graphql-yoga, Hasura, AWS AppSync, and GraphQL IDEs like GraphiQL and Apollo Studio.

53. **What is GraphiQL?**
    - GraphiQL is an IDE for exploring and testing GraphQL queries with schema introspection and autocomplete.

54. **What is Apollo Studio?**
    - Apollo Studio is a cloud platform for managing GraphQL schemas, monitoring APIs, and collaborating with teams.

55. **How do you handle file uploads in GraphQL?**
    - Use scalar types for file references, implement multipart form-data handling, or use dedicated upload mutations.

56. **What is the difference between Relay and Apollo Client?**
    - Relay is Facebook's GraphQL client with cursor-based pagination standards, while Apollo Client is more flexible and widely used.

57. **What is a Connection in Relay?**
    - A Connection is a standard pattern for pagination using edges, nodes, and pageInfo for standardized API design.

58. **How do you handle versioning in GraphQL?**
    - Use @deprecated directives, create new fields with different names, support multiple schema versions, or use namespacing.

59. **What is a Circular Reference in GraphQL?**
    - When types reference each other, causing potential infinite loops. Resolved using interfaces or flattening the schema.

60. **How do you implement real-time notifications in GraphQL?**
    - Use Subscriptions with WebSocket connections, publish events to subscribers when data changes, and manage subscription lifecycle.

---

## Key Concepts

### Core Concepts
- **Schema**: Type definitions and structure
- **Query**: Read operations
- **Mutation**: Write operations
- **Subscription**: Real-time updates
- **Resolver**: Function returning field data

### Type System
- **Scalars**: Primitive types
- **Objects**: Complex types with fields
- **Enums**: Enumerated values
- **Interfaces**: Abstract types
- **Unions**: Multiple possible types

### Advanced Features
- **Fragments**: Reusable query pieces
- **Directives**: Query modifiers
- **Introspection**: Schema querying
- **Federation**: Multi-service APIs
- **DataLoader**: Batch processing

---

## Best Practices

1. Design schema for business domain, not UI
2. Implement proper error handling with meaningful messages
3. Use authentication and authorization at resolver level
4. Implement DataLoader to prevent N+1 queries
5. Use pagination for large result sets
6. Add field-level complexity analysis
7. Implement rate limiting and query depth limits
8. Cache strategically using context objects
9. Document schema with descriptions
10. Use Subscriptions carefully with cleanup

---

## Common Mistakes

1. Over-exposing sensitive data in resolvers
2. Not implementing pagination, causing performance issues
3. Missing authentication/authorization checks
4. Using N+1 query patterns without DataLoader
5. Allowing deeply nested queries causing DoS
6. Not validating input arguments
7. Poor error messages exposing implementation details
8. Not managing subscription cleanup properly
9. Ignoring query complexity in production
10. Creating overly complex schema structures

---

## Performance Optimization

1. Implement DataLoader for batching queries
2. Use cursor-based pagination for large datasets
3. Cache resolved data in context object
4. Implement query complexity analysis
5. Use field-level caching with CDN
6. Batch mutations when possible
7. Optimize database queries in resolvers
8. Use connection pools for database access
9. Implement server-side caching strategies
10. Monitor query performance with tools

---

## Debugging Tips

1. **Use GraphiQL/Apollo Studio**: Test queries interactively
2. **Enable query logging**: Log all incoming queries
3. **Debug Resolvers**: Add console.log or use debugger
4. **Check Errors Array**: GraphQL responses include detailed errors
5. **Use Introspection**: Query __schema to inspect types
6. **Test with Variables**: Separate query from data
7. **Check DataLoader Batching**: Verify batch size and timing
8. **Profile Performance**: Measure resolver execution time
9. **Validate Input**: Check argument types and values
10. **Check Context**: Verify auth info and dependencies available

---

## Summary

GraphQL provides efficient data fetching through flexible queries, mutations, and subscriptions. Master schema design, resolver patterns, and N+1 prevention with DataLoader. Implement security, pagination, and caching. Understand federation for scaling to multiple services.

---

## References

- [GraphQL Official Documentation](https://graphql.org/)
- [Apollo GraphQL Docs](https://www.apollographql.com/docs/)
- [GraphQL Best Practices](https://graphql.org/learn/best-practices/)
- [How to GraphQL Tutorial](https://www.howtographql.com/)
