# Software Architecture Interview Q&A

## Overview
Software Architecture covers architectural patterns, principles, design decisions, scalability, modularity, and building maintainable, flexible systems that evolve with changing requirements.

---

## Interview Questions & Answers

1. **What is Software Architecture?**
   - High-level design decisions about system structure, components, and their interactions.

2. **What are Architectural Styles?**
   - Patterns for structuring applications (MVC, MVVM, Layered, Microservices, etc.).

3. **What is Layered Architecture?**
   - Horizontal layers (Presentation, Business, Data) separating concerns.

4. **What are Layered Architecture Advantages?**
   - Clear separation of concerns, testable, familiar, easy to organize.

5. **What are Layered Architecture Disadvantages?**
   - Monolithic, vertical integration, scaling difficulties.

6. **What is MVC (Model-View-Controller)?**
   - Model (data), View (UI), Controller (logic) separation.

7. **What is MVVM (Model-View-ViewModel)?**
   - Model (data), View (UI), ViewModel (UI logic) with data binding.

8. **What is MVP (Model-View-Presenter)?**
   - Presenter handles all UI logic, View is passive.

9. **What is Microservices Architecture?**
   - Independent, loosely coupled services organized around business capabilities.

10. **What are Microservices Advantages?**
    - Independent scaling, technology flexibility, easier deployment, fault isolation.

11. **What are Microservices Disadvantages?**
    - Network latency, data consistency, debugging complexity, operational overhead.

12. **What is Service-Oriented Architecture (SOA)?**
    - Services providing business functionality, more coarse-grained than microservices.

13. **What is CQRS (Command Query Responsibility Segregation)?**
    - Separating read and write models.

14. **What is Event Sourcing?**
    - Storing state changes as immutable events.

15. **What is Hexagonal Architecture (Ports & Adapters)?**
    - Isolating domain logic with adapters for external systems.

16. **What is Clean Architecture?**
    - Concentric layers with dependency pointing inward to domain logic.

17. **What is Monolithic Architecture?**
    - Single codebase deployment unit containing all functionality.

18. **What are Monolithic Advantages?**
    - Simple deployment, easier debugging, better performance initially.

19. **What are Monolithic Disadvantages?**
    - Scaling limitations, technology lock-in, slow development cycles.

20. **What is Strangler Pattern?**
    - Incrementally replacing monolith with microservices.

21. **What is Serverless Architecture?**
    - Event-driven architecture without managing servers (Lambda, Cloud Functions).

22. **What are Serverless Advantages?**
    - Pay-per-execution, no infrastructure management, auto-scaling.

23. **What are Serverless Disadvantages?**
    - Vendor lock-in, latency (cold starts), limited execution time, debugging difficulty.

24. **What is Component Architecture?**
    - Organizing system into reusable, independently deployable components.

25. **What is Domain-Driven Design (DDD)?**
    - Aligning software with business domain through ubiquitous language.

26. **What is Bounded Context in DDD?**
    - Explicit boundary around subsystem with own model.

27. **What is Aggregation in DDD?**
    - Grouping entities and value objects into units.

28. **What is SOLID Principles?**
    - Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation, Dependency Inversion.

29. **What is Single Responsibility Principle?**
    - Class should have single reason to change.

30. **What is Open/Closed Principle?**
    - Open for extension, closed for modification.

31. **What is Liskov Substitution Principle?**
    - Subtypes must be substitutable for base types.

32. **What is Interface Segregation Principle?**
    - Clients shouldn't depend on interfaces they don't use.

33. **What is Dependency Inversion Principle?**
    - Depend on abstractions, not concretions.

34. **What is Cohesion?**
    - Degree to which components belong together.

35. **What is Coupling?**
    - Degree of interdependence between components.

36. **What is Loose Coupling?**
    - Components independent of implementation details.

37. **What is High Cohesion?**
    - Components having related, focused responsibilities.

38. **What is API Gateway Pattern?**
    - Single entry point routing requests to services.

39. **What is Backend for Frontend (BFF)?**
    - Separate backend optimized for each frontend client.

40. **What is Anti-Patterns?**
    - Common solutions causing more problems than benefits.

41. **What is God Object Anti-Pattern?**
    - Single object knowing and doing too much.

42. **What is Circular Dependencies Anti-Pattern?**
    - Components depending on each other creating maintenance issues.

43. **What is Database Anti-Pattern?**
    - Sharing database between services tight coupling data.

44. **What is Scalability?**
    - Ability to handle growing load.

45. **What is Elasticity?**
    - Ability to scale up/down based on demand.

46. **What is Load Balancing?**
    - Distributing requests across multiple instances.

47. **What is Data Replication?**
    - Copying data across systems for redundancy.

48. **What is Sharding?**
    - Partitioning data across multiple databases.

49. **What is Caching Strategy?**
    - Placing frequently accessed data in fast storage.

50. **What is Compression?**
    - Reducing data size for storage and transmission.

51. **What is Failover?**
    - Automatically switching to backup on failure.

52. **What is Redundancy?**
    - Multiple instances preventing single points of failure.

53. **What is Monitoring?**
    - Tracking system health and performance.

54. **What is Observability?**
    - Ability to understand system state from external outputs.

55. **What is Logging?**
    - Recording events for debugging and monitoring.

56. **What is Tracing?**
    - Following requests through system components.

57. **What is Metrics Collection?**
    - Gathering quantitative data about system performance.

58. **What is Versioning?**
    - Managing API/service changes across versions.

59. **What is Blue-Green Deployment?**
    - Switching between two identical environments.

60. **What is Canary Deployment?**
    - Gradually rolling out changes to subset of users.

---

## Architectural Decision Process

1. Identify requirements and constraints
2. Explore architectural options
3. Evaluate trade-offs
4. Document decisions
5. Communicate clearly
6. Review and iterate

---

## Best Practices

1. Align architecture with business goals
2. Keep components loosely coupled
3. Prioritize high cohesion
4. Design for scalability
5. Plan for failure
6. Monitor and observe
7. Use appropriate patterns
8. Avoid premature optimization
9. Document architecture
10. Review decisions regularly

---

## Common Mistakes

1. Over-engineering complexity
2. Poor separation of concerns
3. Tight coupling
4. Single points of failure
5. Inadequate monitoring
6. Ignoring scalability
7. Wrong tool for problem
8. Technical debt accumulation
9. Poor documentation
10. Ignoring operational concerns

---

## Summary

Master architectural styles (layered, microservices, serverless), design principles (SOLID, DDD), and patterns (CQRS, event sourcing). Understand scalability, resilience, and monitoring. Choose appropriate architecture based on requirements, trade-offs, and constraints.

---

## References

- [Software Architecture Guide](https://martinfowler.com/architecture/)
- [Microservices Patterns](https://microservices.io/patterns/index.html)
- [System Design Primer](https://github.com/donnemartin/system-design-primer)
- [Clean Architecture](https://www.oreilly.com/library/view/clean-architecture/9780134494272/)
