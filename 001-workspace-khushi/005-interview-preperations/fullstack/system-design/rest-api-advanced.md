# REST API Advanced Interview Q&A

## Overview
REST API Advanced covers API design patterns, security, versioning, documentation, testing, performance optimization, and best practices for building robust, scalable APIs.

---

## Interview Questions & Answers

1. **What is REST API?**
   - API following REST principles using HTTP methods on resources identified by URLs.

2. **What are REST Principles?**
   - Client-Server, Statelessness, Uniform Interface, Cacheability, Layered System.

3. **What is Resource?**
   - Anything identified by URI that clients interact with (users, orders, products).

4. **What is Representation?**
   - Current or desired state of resource (JSON, XML, HTML).

5. **What are HTTP Verbs?**
   - GET (retrieve), POST (create), PUT (replace), PATCH (partial update), DELETE (remove).

6. **What is POST vs PUT?**
   - POST creates new resource at URL determined by server; PUT creates/replaces at specific URL.

7. **What is POST vs PATCH?**
   - POST creates resource; PATCH partially updates existing resource.

8. **What is Idempotent?**
   - Operation producing same result if repeated.

9. **What are Idempotent HTTP Methods?**
   - GET, PUT, DELETE; POST and PATCH are not idempotent.

10. **What is Safe Method?**
    - Method not modifying state; GET, HEAD, OPTIONS are safe.

11. **What is Statelessness?**
    - Server not storing client context; each request contains all info.

12. **What is Uniform Interface?**
    - Consistent API design with resources, methods, and representations.

13. **What are Resource Naming Conventions?**
    - Use nouns not verbs (/users not /getUsers), plural (/users not /user).

14. **What is API Endpoint?**
    - URL path where API resource is accessed.

15. **What is Query Parameter?**
    - Parameter in URL query string (?key=value).

16. **What is Path Parameter?**
    - Parameter embedded in URL path (/users/{id}).

17. **What is Request Header?**
    - Metadata sent with request (Authorization, Content-Type).

18. **What is Response Header?**
    - Metadata returned with response (Cache-Control, ETag).

19. **What is Request Body?**
    - Data payload in request for POST/PUT/PATCH.

20. **What is Response Body?**
    - Data payload returned in response.

21. **What is Content Negotiation?**
    - Client specifying desired representation (Accept header).

22. **What is HATEOAS?**
    - Response includes links to related resources for navigation.

23. **What is Stateless Authentication?**
    - Server not storing session info; client provides credentials with each request.

24. **What is Token-Based Authentication?**
    - Client receives token, includes in Authorization header.

25. **What is Bearer Token?**
    - HTTP authentication scheme using "Bearer <token>" format.

26. **What is API Rate Limiting?**
    - Restricting requests per client in time window.

27. **What is Rate Limit Header?**
    - X-RateLimit-Limit, X-RateLimit-Remaining, X-RateLimit-Reset headers.

28. **What is Throttling?**
    - Slowing requests instead of rejecting (soft rate limit).

29. **What is Quota?**
    - Maximum requests per day/month/billing period.

30. **What is Pagination?**
    - Breaking large result sets into smaller pages.

31. **What is Offset/Limit Pagination?**
    - Using offset and limit parameters.

32. **What is Cursor-Based Pagination?**
    - Using cursor tokens for stable pagination.

33. **What is Keyset Pagination?**
    - Using last item's key as cursor.

34. **What is Filtering?**
    - Allowing query parameters to filter results.

35. **What is Sorting?**
    - Allowing query parameters to order results.

36. **What is Search?**
    - Full-text search capability on resources.

37. **What is Aggregation?**
    - Combining data from multiple sources.

38. **What is Batch Request?**
    - Multiple requests in single API call.

39. **What is Webhook?**
    - Server sending data to client-specified URL on events.

40. **What is Long Polling?**
    - Client repeatedly requesting for updates.

41. **What is WebSocket?**
    - Persistent bidirectional connection for real-time updates.

42. **What is Server-Sent Events (SSE)?**
    - Server pushing updates to client over HTTP.

43. **What is CORS (Cross-Origin Resource Sharing)?**
    - Browser mechanism allowing cross-origin requests.

44. **What are CORS Headers?**
    - Access-Control-Allow-Origin, Access-Control-Allow-Methods, Access-Control-Allow-Headers.

45. **What is Preflight Request?**
    - OPTIONS request checking CORS permissions before actual request.

46. **What is Error Response Format?**
    - Consistent error structure with code, message, details.

47. **What is Problem+JSON?**
    - Standard format for API errors.

48. **What is API Versioning?**
    - Managing API changes while maintaining backward compatibility.

49. **What is URL Path Versioning?**
    - Including version in URL (/v1/users).

50. **What is Query String Versioning?**
    - Version in query parameter (?version=1).

51. **What is Header Versioning?**
    - Version in Accept header.

52. **What is Media Type Versioning?**
    - Version in media type (application/vnd.api.v1+json).

53. **What is Deprecation?**
    - Warning clients about API endpoints being removed.

54. **What is Sunset Header?**
    - HTTP header indicating when endpoint will be removed.

55. **What is Breaking Change?**
    - Change incompatible with existing clients.

56. **What is Non-Breaking Change?**
    - Change maintaining backward compatibility.

57. **What is Backward Compatibility?**
    - Existing clients continue working after changes.

58. **What is Forward Compatibility?**
    - New clients work with old API versions.

59. **What is OpenAPI Specification?**
    - Machine-readable format for REST API specification.

60. **What is Swagger/OpenAPI UI?**
    - Interactive documentation and testing interface.

---

## HTTP Status Codes Reference

| Category | Codes | Meaning |
|----------|-------|---------|
| **2xx Success** | 200, 201, 204 | OK, Created, No Content |
| **3xx Redirect** | 300, 301, 304 | Multiple Choices, Moved Permanently, Not Modified |
| **4xx Client Error** | 400, 401, 403, 404 | Bad Request, Unauthorized, Forbidden, Not Found |
| **5xx Server Error** | 500, 502, 503 | Internal Server Error, Bad Gateway, Service Unavailable |

---

## Best Practices

1. Use standard HTTP methods appropriately
2. Use meaningful HTTP status codes
3. Version APIs for backward compatibility
4. Implement rate limiting
5. Use pagination for large datasets
6. Provide comprehensive documentation
7. Validate input strictly
8. Return consistent error formats
9. Use HATEOAS for discoverability
10. Implement proper security (authentication, authorization)

---

## Common Mistakes

1. Using verbs in URLs
2. Inconsistent status codes
3. No pagination for large results
4. Poor error messages
5. Missing documentation
6. Inadequate versioning
7. No rate limiting
8. Exposing internal details
9. Poor CORS implementation
10. No monitoring/logging

---

## API Security Checklist

- [ ] HTTPS only
- [ ] Input validation
- [ ] Authentication implemented
- [ ] Authorization checks
- [ ] Rate limiting
- [ ] CORS configured properly
- [ ] Security headers
- [ ] Logging and monitoring
- [ ] Encryption at rest
- [ ] API keys rotated
- [ ] No sensitive data in URLs
- [ ] Error messages don't leak info

---

## Summary

Master REST principles, HTTP methods, and status codes. Implement proper authentication/authorization, rate limiting, and pagination. Version APIs, document thoroughly with OpenAPI, and maintain backward compatibility. Use consistent error formats and security headers.

---

## References

- [REST API Best Practices](https://restfulapi.net/)
- [OpenAPI Specification](https://spec.openapis.org/)
- [JSON API Standard](https://jsonapi.org/)
- [HTTP Status Codes](https://httpwg.org/specs/rfc7231.html#status.codes)
