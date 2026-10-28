# API Design Interview Q&A

## Overview
API Design involves creating well-structured, scalable, and maintainable APIs following REST principles, GraphQL standards, or gRPC specifications with proper versioning, authentication, and documentation.

---

## Interview Questions & Answers

1. **What is an API (Application Programming Interface)?**
   - An API is a contract between client and server defining how clients can interact with server resources.

2. **What is REST (Representational State Transfer)?**
   - REST is an architectural style using HTTP methods (GET, POST, PUT, DELETE) on resources identified by URLs.

3. **What are the principles of REST?**
   - Client-server architecture, statelessness, cacheability, uniform interface, layered system, code-on-demand.

4. **What is the difference between REST and RPC?**
   - REST is resource-centric with standard HTTP methods; RPC is action-centric with custom remote procedure calls.

5. **What is RESTful API?**
   - An API following REST architectural principles with resources identified by URLs and operations by HTTP methods.

6. **What is HTTP Status Code?**
   - Three-digit codes indicating request result: 1xx (informational), 2xx (success), 3xx (redirect), 4xx (client error), 5xx (server error).

7. **What does 200 status code mean?**
   - OK - Request succeeded and resource returned.

8. **What does 201 status code mean?**
   - Created - Resource created successfully, usually with Location header.

9. **What does 204 status code mean?**
   - No Content - Request succeeded but no content to return (often for DELETE).

10. **What does 400 status code mean?**
    - Bad Request - Client error in request format or validation.

11. **What does 401 status code mean?**
    - Unauthorized - Authentication required or failed.

12. **What does 403 status code mean?**
    - Forbidden - Authenticated but lacking authorization for resource.

13. **What does 404 status code mean?**
    - Not Found - Resource does not exist.

14. **What does 500 status code mean?**
    - Internal Server Error - Server error executing request.

15. **What is API Versioning?**
    - Versioning manages API changes while maintaining backward compatibility.

16. **What are API Versioning Strategies?**
    - URL path versioning (`/v1/users`), query parameter (`?version=1`), header versioning, media type versioning.

17. **What is URL Versioning?**
    - Including version in URL path (e.g., `/api/v1/users`).

18. **What is Header Versioning?**
    - Specifying version in request header (e.g., `Accept: application/vnd.myapi.v1+json`).

19. **What is Pagination?**
    - Breaking large result sets into smaller pages for performance.

20. **What are Pagination Methods?**
    - Offset/limit, cursor-based, keyset pagination.

21. **What is Offset/Limit Pagination?**
    - Using `offset` and `limit` parameters to paginate results.

22. **What is Cursor-Based Pagination?**
    - Using cursor tokens to mark position, handling data changes better than offset.

23. **What is Filtering?**
    - Allowing clients to request specific subset of resources using query parameters.

24. **What is Sorting?**
    - Allowing clients to specify result order using `sort` parameter.

25. **What is Caching in APIs?**
    - Storing responses to reduce server load and improve performance.

26. **What is Cache-Control Header?**
    - HTTP header specifying cache behavior: `public/private`, `max-age`, `no-cache`, `no-store`.

27. **What is ETag?**
    - HTTP header with unique identifier for resource version, enabling cache validation.

28. **What is HTTP Conditional Request?**
    - Using headers like `If-None-Match` or `If-Modified-Since` for cache validation.

29. **What is CORS (Cross-Origin Resource Sharing)?**
    - Mechanism allowing browsers to make cross-origin requests with server permission.

30. **What are CORS Headers?**
    - `Access-Control-Allow-Origin`, `Access-Control-Allow-Methods`, `Access-Control-Allow-Headers`.

31. **What is Authentication?**
    - Verifying user identity using credentials like username/password, tokens, or certificates.

32. **What is Authorization?**
    - Determining what authenticated user can access based on permissions.

33. **What is Basic Authentication?**
    - Sending base64-encoded username:password in Authorization header.

34. **What is JWT (JSON Web Token)?**
    - JWT is self-contained token containing encoded payload with claims, enabling stateless authentication.

35. **What are JWT Components?**
    - Header (algorithm/type), Payload (claims), Signature (validates token).

36. **What is OAuth2?**
    - OAuth2 is authorization framework for delegated access without sharing passwords.

37. **What are OAuth2 Grant Types?**
    - Authorization Code, Implicit, Client Credentials, Resource Owner Password Credentials, Refresh Token.

38. **What is Rate Limiting?**
    - Restricting number of requests per client in time window.

39. **What is Throttling?**
    - Slowing down requests instead of rejecting them (soft rate limit).

40. **What are Rate Limiting Headers?**
    - `X-RateLimit-Limit`, `X-RateLimit-Remaining`, `X-RateLimit-Reset`.

41. **What is Content Negotiation?**
    - Client specifying desired response format using `Accept` header.

42. **What is Content Type Header?**
    - Specifying response data format: `application/json`, `application/xml`, etc.

43. **What is HATEOAS (Hypermedia As The Engine Of Application State)?**
    - API responses include links to related resources, allowing client navigation.

44. **What is API Documentation?**
    - Comprehensive guide explaining API endpoints, parameters, responses, and examples.

45. **What is OpenAPI Specification?**
    - Machine-readable specification for REST APIs enabling documentation and code generation.

46. **What is Swagger/Swashbuckle?**
    - Tools for creating interactive API documentation from OpenAPI specifications.

47. **What is API Gateway?**
    - Component managing API requests, providing authentication, rate limiting, routing.

48. **What is API Throttling vs Rate Limiting?**
    - Rate Limiting rejects excess requests; Throttling slows them down.

49. **What is Idempotence?**
    - API operations producing same result regardless of how many times executed.

50. **What are Idempotent HTTP Methods?**
    - GET, PUT, DELETE, HEAD (multiple calls same result); POST and PATCH are not.

51. **What is Idempotency Key?**
    - Client-provided key preventing duplicate processing if request retried.

52. **What is Request/Response Lifecycle?**
    - Request validation → Authentication → Authorization → Processing → Response formatting.

53. **What is Error Response Format?**
    - Consistent error format with code, message, and details for debugging.

54. **What is API Monitoring?**
    - Tracking API usage, performance, errors, and availability.

55. **What is API Analytics?**
    - Collecting and analyzing data about API usage, performance trends, and user behavior.

56. **What is Deprecation Policy?**
    - Plan for removing old API versions with warning period and migration guide.

57. **What is Backward Compatibility?**
    - API changes not breaking existing clients consuming the API.

58. **What is API Rate Limiting Algorithm?**
    - Token bucket, leaky bucket, sliding window, fixed window.

59. **What is API Resilience?**
    - Designing APIs to handle failures gracefully with retries, fallbacks, and circuit breakers.

60. **What is the difference between SOAP and REST?**
    - SOAP uses XML and formal contracts; REST uses JSON/XML and URIs for resources.

---

## API Design Best Practices

| Practice | Description |
|----------|-------------|
| **Versioning** | Use URL or header versioning for backward compatibility |
| **Status Codes** | Use appropriate HTTP status codes |
| **Naming Conventions** | Use plural nouns for resources (`/users` not `/user`) |
| **Pagination** | Implement for large datasets |
| **Filtering** | Allow query parameters for filtering |
| **Caching** | Use cache headers appropriately |
| **Documentation** | Provide comprehensive API docs |
| **Error Handling** | Return meaningful error messages |
| **Rate Limiting** | Protect against abuse |
| **Security** | Implement authentication/authorization |

---

## Best Practices

1. Use resource-oriented design with nouns in URLs
2. Use proper HTTP verbs and status codes
3. Implement versioning for backward compatibility
4. Provide comprehensive error messages
5. Use pagination and filtering for large datasets
6. Implement rate limiting and authentication
7. Document API thoroughly
8. Use consistent naming conventions
9. Follow HATEOAS for discoverability
10. Monitor API usage and performance

---

## Common Mistakes

1. Using verbs in URLs instead of resources
2. Wrong HTTP status codes
3. Inconsistent error formats
4. No pagination for large datasets
5. Exposing sensitive data
6. Poor API documentation
7. No rate limiting
8. Ignoring backward compatibility
9. Complex nested resources
10. No versioning strategy

---

## Summary

Master REST principles, HTTP status codes, and versioning strategies. Implement proper authentication/authorization, rate limiting, and error handling. Design scalable APIs with pagination, filtering, and caching. Understand HATEOAS, OpenAPI specifications, and API documentation best practices.

---

## References

- [REST API Design Rulebook](https://www.oreilly.com/library/view/rest-api-design/9781449317905/)
- [OpenAPI Specification](https://spec.openapis.org/)
- [JSON:API Standard](https://jsonapi.org/)
- [HTTP Status Codes](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status)
