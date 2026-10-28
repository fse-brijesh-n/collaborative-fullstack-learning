# Design Patterns Interview Q&A

## Overview
Design Patterns are reusable solutions to common problems in software design. They provide templates for writing maintainable, scalable, and robust code across different domains.

---

## Interview Questions & Answers

1. **What is a Design Pattern?**
   - A design pattern is a reusable solution to a common programming problem, providing a template for solving similar issues.

2. **What are the categories of Design Patterns?**
   - Creational (object creation), Structural (composition), Behavioral (object interaction and responsibility).

3. **What is Singleton Pattern?**
   - Ensures a class has only one instance with global access point.

4. **When do you use Singleton Pattern?**
   - Database connection, logger, configuration manager, thread pool.

5. **What are the problems with Singleton?**
   - Hard to test, hidden dependencies, global state, difficulty with subclassing.

6. **What is Factory Pattern?**
   - Creates objects without specifying exact classes, using factory methods.

7. **What are the types of Factory Pattern?**
   - Simple Factory, Factory Method, Abstract Factory.

8. **What is Factory Method Pattern?**
   - Subclasses decide which class to instantiate through a factory method.

9. **When do you use Factory Pattern?**
   - Creating objects with complex initialization, object type determined at runtime.

10. **What is Abstract Factory Pattern?**
    - Creates families of related objects without specifying concrete classes.

11. **What is Builder Pattern?**
    - Constructs complex objects step-by-step using fluent interface.

12. **When do you use Builder Pattern?**
    - Objects with many optional parameters, complex construction logic.

13. **What is Adapter Pattern?**
    - Converts interface of one class to another clients expect, bridging incompatible interfaces.

14. **When do you use Adapter Pattern?**
    - Legacy code integration, third-party library interface conversion.

15. **What is Decorator Pattern?**
    - Attaches additional responsibilities to objects dynamically.

16. **What is the difference between Decorator and Inheritance?**
    - Decorator adds functionality to instances; inheritance applies to all class instances.

17. **What is Facade Pattern?**
    - Provides simplified interface to complex subsystem.

18. **When do you use Facade Pattern?**
    - Simplifying library usage, decoupling client from complex components.

19. **What is Proxy Pattern?**
    - Provides substitute controlling access to another object.

20. **What are types of Proxy?**
    - Remote proxy, virtual proxy, protection proxy, logging proxy.

21. **What is Observer Pattern?**
    - Defines one-to-many dependency where subject notifies observers of state changes.

22. **When do you use Observer Pattern?**
    - Event handling systems, reactive programming, MVC architectures.

23. **What is Strategy Pattern?**
    - Defines family of algorithms encapsulated and interchangeable.

24. **When do you use Strategy Pattern?**
    - Multiple algorithms for a task, choosing algorithm at runtime.

25. **What is Command Pattern?**
    - Encapsulates request as object, parameterizing clients with different requests.

26. **When do you use Command Pattern?**
    - Undo/redo functionality, task scheduling, callback mechanisms.

27. **What is State Pattern?**
    - Object alters behavior when internal state changes, appearing to change class.

28. **What is the difference between State and Strategy?**
    - State changes object behavior; Strategy allows client to choose algorithm.

29. **What is Iterator Pattern?**
    - Provides way to access elements of collection sequentially without exposing structure.

30. **When do you use Iterator Pattern?**
    - Traversing different collection types uniformly.

31. **What is Template Method Pattern?**
    - Defines algorithm skeleton in base class, subclasses fill in steps.

32. **When do you use Template Method Pattern?**
    - Common algorithm with variant implementations.

33. **What is Chain of Responsibility Pattern?**
    - Passes request along chain of handlers until one processes it.

34. **When do you use Chain of Responsibility Pattern?**
    - Event handling, logging levels, request routing.

35. **What is Interpreter Pattern?**
    - Defines grammar representation and interpreter for domain language.

36. **When do you use Interpreter Pattern?**
    - Domain-specific languages, configuration parsing.

37. **What is Visitor Pattern?**
    - Represents operation to perform on elements of object structure.

38. **When do you use Visitor Pattern?**
    - Operations on complex object structures, avoiding modifying classes.

39. **What is Memento Pattern?**
    - Captures and externalizes object state for later restoration.

40. **When do you use Memento Pattern?**
    - Undo/redo, snapshots, checkpoints.

41. **What is the difference between Memento and Snapshot?**
    - Memento is a pattern for state capture; Snapshot is mechanism for state serialization.

42. **What is Mediator Pattern?**
    - Centralizes complex communication between multiple objects.

43. **When do you use Mediator Pattern?**
    - Decoupling objects with complex interaction patterns.

44. **What is Bridge Pattern?**
    - Decouples abstraction from implementation allowing independent variation.

45. **When do you use Bridge Pattern?**
    - Multiple implementations of abstraction, avoiding class explosion.

46. **What is Composite Pattern?**
    - Composes objects into tree structures representing part-whole hierarchies.

47. **When do you use Composite Pattern?**
    - File system trees, UI component hierarchies, organizational structures.

48. **What is Flyweight Pattern?**
    - Shares common state among multiple objects to save memory.

49. **When do you use Flyweight Pattern?**
    - Large number of similar objects, memory optimization.

50. **What is Immutable Object Pattern?**
    - Objects that cannot be modified after creation.

51. **Benefits of Immutable Objects?**
    - Thread safety, easier reasoning, cache friendly, no defensive copying.

52. **What is Repository Pattern?**
    - Mediates between domain and data source layers abstracting data access.

53. **What is Dependency Injection?**
    - Dependencies provided externally rather than created internally.

54. **What are types of Dependency Injection?**
    - Constructor injection, setter injection, interface injection.

55. **What is Service Locator Pattern?**
    - Central registry locating services instead of passing dependencies.

56. **What is the difference between Dependency Injection and Service Locator?**
    - DI explicitly provides dependencies; Service Locator is implicit lookup.

57. **What is Model-View-Controller (MVC)?**
    - Separates application into Model (data), View (UI), Controller (logic).

58. **What is Model-View-ViewModel (MVVM)?**
    - Separates UI from logic with ViewModel bridging View and Model.

59. **What is Model-View-Presenter (MVP)?**
    - Presenter handles all UI logic, View is passive.

60. **What are SOLID Principles?**
    - Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation, Dependency Inversion.

---

## Design Pattern Categories

| Category | Patterns |
|----------|----------|
| **Creational** | Singleton, Factory, Abstract Factory, Builder, Prototype |
| **Structural** | Adapter, Bridge, Composite, Decorator, Facade, Proxy, Flyweight |
| **Behavioral** | Observer, Strategy, Command, State, Iterator, Template Method, Chain of Responsibility, Mediator, Visitor, Memento, Interpreter |

---

## Best Practices

1. Use patterns to solve real problems, not prematurely
2. Choose appropriate pattern for situation
3. Combine patterns when needed
4. Keep implementations simple
5. Document pattern usage
6. Refactor to patterns incrementally
7. Avoid pattern overuse
8. Consider team familiarity
9. Review SOLID principles
10. Test pattern implementations thoroughly

---

## Common Mistakes

1. Using patterns unnecessarily
2. Forcing wrong pattern for situation
3. Over-engineering simple problems
4. Not understanding pattern before using
5. Mixing patterns inappropriately
6. Ignoring performance implications
7. Poor pattern documentation
8. Using outdated patterns
9. Not considering maintainability
10. Incorrect pattern implementation

---

## Pattern Selection Guide

- **Need single instance?** → Singleton
- **Creating object families?** → Abstract Factory
- **Complex initialization?** → Builder
- **Interface conversion?** → Adapter
- **Add functionality dynamically?** → Decorator
- **Simplify complex subsystem?** → Facade
- **Control access to object?** → Proxy
- **Notify multiple objects of change?** → Observer
- **Multiple algorithms?** → Strategy
- **Encapsulate request?** → Command
- **Object changes behavior by state?** → State
- **Traverse collection uniformly?** → Iterator
- **Define algorithm skeleton?** → Template Method

---

## Summary

Master creational patterns for object creation (Singleton, Factory, Builder), structural patterns for composition (Adapter, Decorator, Facade, Proxy), and behavioral patterns for interaction (Observer, Strategy, Command, State). Apply SOLID principles and use patterns to solve real problems, not as premature optimization.

---

## References

- [Design Patterns: Elements of Reusable Object-Oriented Software](https://www.oreilly.com/library/view/design-patterns-elements/0201633612/)
- [Head First Design Patterns](https://www.oreilly.com/library/view/head-first-design/0596007124/)
- [Refactoring Guru Design Patterns](https://refactoring.guru/design-patterns)
- [SOLID Principles](https://en.wikipedia.org/wiki/SOLID)
