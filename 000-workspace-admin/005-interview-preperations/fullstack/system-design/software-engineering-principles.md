# Software Engineering Principles Interview Q&A

## Overview
Software Engineering Principles provide guidelines for writing maintainable, scalable, and quality code. Key principles include SOLID, DRY, KISS, YAGNI, and refactoring practices.

---

## Interview Questions & Answers

1. **What are Software Engineering Principles?**
   - Guidelines promoting code quality, maintainability, and best practices.

2. **What is SOLID?**
   - Five principles for object-oriented design: SRP, OCP, LSP, ISP, DIP.

3. **What is Single Responsibility Principle?**
   - Class should have single reason to change, one responsibility.

4. **What is Open/Closed Principle?**
   - Classes open for extension, closed for modification.

5. **What is Liskov Substitution Principle?**
   - Subclasses substitutable for base classes without breaking code.

6. **What is Interface Segregation Principle?**
   - Clients shouldn't depend on interfaces they don't use.

7. **What is Dependency Inversion Principle?**
   - Depend on abstractions, not concrete implementations.

8. **What is DRY (Don't Repeat Yourself)?**
   - Avoid code duplication through abstraction and reuse.

9. **What is WET (Write Everything Twice)?**
   - Anti-pattern of repeating code multiple times.

10. **What is KISS (Keep It Simple, Stupid)?**
    - Prefer simple solutions over complex ones.

11. **What is YAGNI (You Ain't Gonna Need It)?**
    - Don't build features you don't currently need.

12. **What is Premature Optimization?**
    - Optimizing before proving it's a bottleneck.

13. **What is Refactoring?**
    - Improving code structure without changing functionality.

14. **What is Code Smell?**
    - Indicator of potential deeper problem in code.

15. **What are Code Smells?**
    - Duplicated code, long methods, large classes, long parameter lists.

16. **What is Technical Debt?**
    - Accumulated shortcuts and suboptimal solutions.

17. **What is Cohesion?**
    - Degree to which components belong together.

18. **What is Coupling?**
    - Degree of interdependence between components.

19. **What is Tight Coupling?**
    - Components dependent on implementation details.

20. **What is Loose Coupling?**
    - Components independent of internal details.

21. **What is High Cohesion?**
    - Related functionality grouped together.

22. **What is Separation of Concerns?**
    - Dividing system into distinct sections addressing specific concerns.

23. **What is Abstraction?**
    - Hiding complexity behind simple interface.

24. **What is Encapsulation?**
    - Bundling data and methods, hiding internals.

25. **What is Inheritance?**
    - Acquiring properties/methods from parent class.

26. **What is Composition?**
    - Building complex objects from simpler ones.

27. **What is Favor Composition Over Inheritance?**
    - Prefer object composition to class inheritance.

28. **What is Don't Use Inheritance for Code Reuse?**
    - Use composition or mixins instead.

29. **What is Interface?**
    - Contract defining what methods class must implement.

30. **What is Abstract Class?**
    - Class that cannot be instantiated, provides interface and implementation.

31. **What is Polymorphism?**
    - Objects different types behave in similar ways.

32. **What is Method Overloading?**
    - Multiple methods same name, different parameters.

33. **What is Method Overriding?**
    - Subclass providing different implementation than parent.

34. **What is The Boy Scout Rule?**
    - Leave code better than found (incremental improvement).

35. **What is Mutation Testing?**
    - Testing robustness by introducing code changes.

36. **What is Code Review?**
    - Peer examination of code before merging.

37. **What is Pair Programming?**
    - Two programmers working on same code.

38. **What is Mob Programming?**
    - Entire team collaborating on single code section.

39. **What is Continuous Integration?**
    - Frequent code integration with automated tests.

40. **What is Continuous Delivery?**
    - Automated deployment to production-ready state.

41. **What is Continuous Deployment?**
    - Automated deployment to production.

42. **What is Version Control?**
    - Tracking and managing code changes over time.

43. **What is Semantic Versioning?**
    - Major.Minor.Patch versioning scheme.

44. **What is Git Flow?**
    - Branching strategy for organized development.

45. **What is Feature Branch?**
    - Separate branch for developing feature.

46. **What is Pull Request?**
    - Request to merge changes proposing review.

47. **What is Merge Conflict?**
    - Conflicting changes in same code section.

48. **What is Rebasing?**
    - Reapplying commits on different base.

49. **What is Documentation?**
    - Explaining code, system, API for users/developers.

50. **What is Self-Documenting Code?**
    - Clear variable/function names making code self-explanatory.

51. **What is Comments vs Documentation?**
    - Comments explain why; documentation explains what/how.

52. **What is API Documentation?**
    - Explaining endpoints, parameters, responses.

53. **What is README?**
    - Project overview, setup, usage documentation.

54. **What is CHANGELOG?**
    - Recording significant changes between versions.

55. **What is Logging?**
    - Recording events for debugging and monitoring.

56. **What is Debugging?**
    - Finding and fixing bugs.

57. **What is Assertion?**
    - Statement checking condition is true.

58. **What is Defensive Programming?**
    - Validating inputs and assumptions.

59. **What is Fail Fast?**
    - Detecting and reporting errors immediately.

60. **What is Fail Safe?**
    - Continuing operation gracefully when errors occur.

---

## Principles Summary

| Principle | Focus |
|-----------|-------|
| **SRP** | Single responsibility |
| **OCP** | Extensibility |
| **LSP** | Substitutability |
| **ISP** | Interface segregation |
| **DIP** | Abstraction over concretion |
| **DRY** | Code reuse |
| **KISS** | Simplicity |
| **YAGNI** | Necessities only |

---

## Refactoring Techniques

| Technique | Purpose |
|-----------|---------|
| **Extract Method** | Create new method from code section |
| **Rename** | Improve clarity with better names |
| **Extract Class** | Split responsibilities |
| **Introduce Parameter** | Make behavior configurable |
| **Remove Duplication** | Apply DRY principle |
| **Simplify Logic** | Complex conditionals to clear code |

---

## Best Practices

1. Write code for humans, not machines
2. Apply SOLID principles
3. Keep it simple (KISS)
4. Build what's needed now (YAGNI)
5. Refactor regularly
6. Write tests alongside code
7. Practice code review
8. Document important decisions
9. Use version control
10. Monitor and improve

---

## Common Mistakes

1. Over-engineering solutions
2. Violating SOLID principles
3. Code duplication (DRY violation)
4. Tight coupling
5. Poor naming
6. Insufficient documentation
7. Ignoring code smells
8. Premature optimization
9. No version control discipline
10. Inadequate testing

---

## Code Smell Examples

```
// Duplicated code
if (type === 'user') { ... }
if (type === 'admin') { ... }

// Long method
function doEverything() { ... 100 lines ... }

// Large class
class Application { ... many responsibilities ... }

// Long parameter list
function process(a, b, c, d, e, f, g) { ... }

// Feature envy
obj1.field = obj2.computeValue() + obj3.field
```

---

## Summary

Understand SOLID principles for OO design. Apply DRY (no duplication), KISS (keep simple), YAGNI (build needed now). Practice refactoring to improve code quality. Use version control, code reviews, and continuous integration. Write self-documenting code with appropriate tests.

---

## References

- [Clean Code](https://www.oreilly.com/library/view/clean-code-a/9780136083238/)
- [Refactoring: Improving the Design of Existing Code](https://refactoring.com/)
- [SOLID Principles](https://en.wikipedia.org/wiki/SOLID)
- [Code Smells](https://refactoring.guru/refactoring/smells)
