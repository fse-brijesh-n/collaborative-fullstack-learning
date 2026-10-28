```
1. What are the four main principles of OOP?
   - Encapsulation, Abstraction, Inheritance, and Polymorphism.

2. What is Encapsulation in OOP?
   - Encapsulation is the technique of binding data and methods into a single unit (class) and restricting direct access to it.

3. What is Abstraction in OOP?
   - Abstraction is hiding the implementation details and showing only the relevant information to the user.

4. What is Inheritance in OOP?
   - Inheritance allows one class to acquire the properties and behaviors of another class.

5. What is Polymorphism in OOP?
   - Polymorphism allows methods to take different forms, enabling method overloading and overriding.

6. Explain method overloading and method overriding.
   - Overloading: Same method name but different parameters.
   - Overriding: Redefining a method in a subclass.

7. What is a constructor in Java?
   - A constructor is a special method used to initialize objects.

8. What is a destructor in OOP?
   - A destructor is used to free memory when an object is destroyed.

9. Can we overload constructors in Java?
   - Yes, by using different parameter lists.

10. What is the difference between static and dynamic binding?
    - Static binding occurs at compile-time, whereas dynamic binding occurs at runtime.

11. What is an abstract class?
    - An abstract class is a class that cannot be instantiated and may contain abstract methods.

12. What is an interface in Java?
    - An interface is a blueprint that contains only abstract methods.

13. Difference between abstract class and interface?
    - Abstract class: Can have both abstract and concrete methods.
    - Interface: Contains only abstract methods (before Java 8).

14. What is multiple inheritance? Does Java support it?
    - Multiple inheritance means a class inheriting from multiple classes. Java supports multiple inheritance through interfaces.

15. What is a super keyword in Java?
    - The `super` keyword is used to refer to the parent class.

16. What is `this` keyword in Java?
    - The `this` keyword refers to the current class instance.

17. Can an interface extend another interface?
    - Yes, an interface can extend another interface in Java.

18. What is the diamond problem in Java?
    - The diamond problem occurs due to multiple inheritance ambiguity; Java prevents it using interfaces.

19. What is aggregation in OOP?
    - Aggregation is a relationship where one class contains an object of another class.

20. What is composition in OOP?
    - Composition is a stronger relationship where an object's lifetime is dependent on another object.

21. What is a final class in Java?
    - A final class cannot be extended.

22. What is the difference between association, aggregation, and composition?
    - Association: General relationship between objects.
    - Aggregation: One object contains another (weak dependency).
    - Composition: Strong dependency between objects.

23. What is a copy constructor?
    - A copy constructor creates a new object by copying another object.

24. What is object cloning?
    - Object cloning allows creating an exact copy of an object using the `clone()` method.

25. What is the use of the `instanceof` keyword?
    - The `instanceof` keyword checks if an object is an instance of a class.

26. What is method hiding in Java?
    - Method hiding occurs when a subclass defines a static method with the same signature as a parent class.

27. Can we override static methods?
    - No, static methods belong to the class, not to an instance.

28. What is the difference between method overloading and method overriding?
    - Overloading: Same method name, different parameters.
    - Overriding: Redefining a method in a subclass.

29. Can a constructor be private?
    - Yes, a private constructor is used in Singleton design patterns.

30. What is the singleton pattern?
    - A singleton ensures only one instance of a class exists.

31. What is an enum in Java?
    - An enum is a special class used to define constants.

32. What is upcasting and downcasting?
    - Upcasting: Converting a subclass reference to a superclass reference.
    - Downcasting: Converting a superclass reference to a subclass reference.

33. What is an abstract method?
    - An abstract method has no implementation and must be overridden.

34. What is meant by cohesion in OOP?
    - Cohesion measures how closely related a class's methods are.

35. What is coupling in OOP?
    - Coupling is the dependency between classes.

36. What is an inner class in Java?
    - A class defined within another class.

37. What is a nested static class?
    - A static inner class that does not require an instance of the outer class.

38. What is functional interface in Java?
    - An interface with exactly one abstract method (used in lambda expressions).

39. What is method reference in Java?
    - A method reference allows referring to a method without invoking it.

40. What is the use of the `default` keyword in interfaces?
    - The `default` keyword allows adding method implementations in interfaces (Java 8+).

41. Can we create an object of an abstract class?
    - No, an abstract class cannot be instantiated.

42. What is a factory pattern in OOP?
    - A design pattern that provides an interface for creating objects.

43. What is dependency injection?
    - A technique where dependencies are injected instead of being created inside a class.

44. What is the difference between the prototype and singleton pattern?
    - Prototype: Multiple instances.
    - Singleton: Only one instance.

45. What is the observer pattern?
    - A design pattern where an object maintains a list of dependents.

46. What is a proxy pattern?
    - A design pattern that provides a surrogate for another object.

47. What is the difference between an object and a class?
    - Class: A blueprint.
    - Object: An instance of a class.

48. What is lazy initialization?
    - Delaying object creation until it is required.

49. What is the difference between static and non-static methods?
    - Static methods belong to a class, non-static methods belong to an instance.

50. What is garbage collection in Java?
    - Automatic memory management where unused objects are removed.

Example Code:

class Animal {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();
    }
}
```
