# TypeScript Advanced Interview Q&A

## Overview
TypeScript Advanced covers generics, decorators, advanced types, utility types, module system, configuration, and best practices for building scalable type-safe applications.

---

## Interview Questions & Answers

1. **What is TypeScript?**
   - TypeScript is a superset of JavaScript adding static typing, interfaces, classes, and advanced features.

2. **What are Generics?**
   - Generics allow creating reusable components accepting multiple types while maintaining type safety.

3. **What is Generic Function?**
   - Function with type parameters that work with different types.

4. **What is Generic Class?**
   - Class with type parameters for type-safe implementations.

5. **What is Generic Interface?**
   - Interface with type parameters defining generic contracts.

6. **What is Type Parameter Constraint?**
   - Limiting generic type parameter to specific types using extends keyword.

7. **What is Keyof Operator?**
   - Operator extracting property keys from type as union type.

8. **What is TypeOf Operator?**
   - Operator getting type of value or extracting type from variable.

9. **What is Type Mapping?**
   - Creating new types by transforming existing types' properties.

10. **What is Conditional Type?**
    - Type that resolves to different type based on condition.

11. **What is Utility Types?**
    - Pre-defined generic types for common type transformations.

12. **What is Partial?**
    - Utility type making all properties optional.

13. **What is Required?**
    - Utility type making all properties required.

14. **What is Readonly?**
    - Utility type making all properties readonly.

15. **What is Record?**
    - Utility type creating object type with specific keys and value type.

16. **What is Pick?**
    - Utility type selecting specific properties from type.

17. **What is Omit?**
    - Utility type removing specific properties from type.

18. **What is Exclude?**
    - Utility type excluding specific types from union.

19. **What is Extract?**
    - Utility type extracting specific types from union.

20. **What is ReturnType?**
    - Utility type extracting return type from function.

21. **What is Parameters?**
    - Utility type extracting parameter types from function.

22. **What is InstanceType?**
    - Utility type getting instance type from constructor.

23. **What is NonNullable?**
    - Utility type excluding null and undefined.

24. **What is Decorator?**
    - Function modifying class, method, property, or parameter.

25. **What is Class Decorator?**
    - Decorator applied to class, modifying its behavior.

26. **What is Method Decorator?**
    - Decorator applied to class method.

27. **What is Property Decorator?**
    - Decorator applied to class property.

28. **What is Parameter Decorator?**
    - Decorator applied to method parameter.

29. **What is @experimentalDecorators?**
    - Compiler option enabling decorator support.

30. **What is Intersection Type?**
    - Combining multiple types with & operator.

31. **What is Union Type?**
    - Type that can be one of several types using | operator.

32. **What is Type Guard?**
    - Expression checking variable type at runtime.

33. **What is Discriminated Union?**
    - Union with common property for type narrowing.

34. **What is Literal Type?**
    - Type accepting specific literal values.

35. **What is String Literal Type?**
    - Type accepting specific string values.

36. **What is Numeric Literal Type?**
    - Type accepting specific number values.

37. **What is Boolean Literal Type?**
    - Type accepting true or false.

38. **What is Template Literal Type?**
    - Type using string templates for pattern matching.

39. **What is infer Keyword?**
    - Keyword inferring type variable in conditional types.

40. **What is Never Type?**
    - Type representing impossible value.

41. **What is Unknown Type?**
    - Type-safe alternative to any, requiring type checking.

42. **What is Any Type?**
    - Type disabling type checking, should be avoided.

43. **What is Type Assertion?**
    - Telling compiler specific type using as keyword.

44. **What is Non-null Assertion?**
    - Asserting value is not null/undefined using ! operator.

45. **What is Optional Chaining (?\.)?**
    - Safely accessing possibly null/undefined properties.

46. **What is Nullish Coalescing (??)?**
    - Operator providing default value for null/undefined.

47. **What is Enum?**
    - Type defining set of named constants.

48. **What is Numeric Enum?**
    - Enum with numeric values.

49. **What is String Enum?**
    - Enum with string values.

50. **What is Heterogeneous Enum?**
    - Enum with mixed numeric and string values.

51. **What is Const Enum?**
    - Enum inlined during compilation for better performance.

52. **What is Module?**
    - Unit of code with exports and imports.

53. **What is Namespace?**
    - Way to organize code logically within single file.

54. **What is Triple-Slash Directive?**
    - Comment referencing external type definitions.

55. **What is d.ts File?**
    - Type definition file for JavaScript libraries.

56. **What is Type Declaration File?**
    - File containing only type declarations (d.ts).

57. **What is Declaration Merging?**
    - Combining multiple declarations of same name.

58. **What is Interface Merging?**
    - Combining multiple interface declarations.

59. **What is strict Mode?**
    - TypeScript compiler option enabling all strict checking options.

60. **What are tsconfig.json Options?**
    - Compiler options like target, module, strict, skipLibCheck, esModuleInterop.

---

## Utility Types Reference

| Utility | Purpose |
|---------|---------|
| `Partial<T>` | Make all properties optional |
| `Required<T>` | Make all properties required |
| `Readonly<T>` | Make all properties readonly |
| `Record<K, V>` | Map keys to value type |
| `Pick<T, K>` | Select specific properties |
| `Omit<T, K>` | Remove specific properties |
| `Exclude<T, U>` | Remove types from union |
| `Extract<T, U>` | Extract types from union |
| `NonNullable<T>` | Remove null/undefined |
| `ReturnType<T>` | Extract function return type |

---

## Advanced Type Patterns

```typescript
// Generic constraint
function getProperty<T, K extends keyof T>(obj: T, key: K): T[K]

// Conditional type
type IsString<T> = T extends string ? true : false

// Type mapping
type Getters<T> = {
  [K in keyof T as `get${Capitalize<K & string>}`]: () => T[K]
}

// Discriminated union
type Shape = 
  | { kind: "circle"; radius: number }
  | { kind: "square"; side: number }
```

---

## Best Practices

1. Use strict mode
2. Avoid any type
3. Use generics for reusability
4. Leverage utility types
5. Use discriminated unions
6. Implement proper error handling
7. Use const enums for performance
8. Avoid declaration merging complexity
9. Use proper module patterns
10. Enable strict tsconfig options

---

## Common Mistakes

1. Excessive use of any
2. Ignoring strict mode
3. Over-engineering with generics
4. Not using utility types
5. Improper type assertion
6. Circular dependencies
7. Missing type definitions
8. Not exporting types
9. Forgetting readonly modifier
10. Over-using decorators

---

## Summary

Master generics for type-safe reusable code, advanced types (conditional, mapped, template literal), and utility types for transformations. Understand decorators, type guards, and discrimination. Use strict mode and proper tsconfig configuration for best practices.

---

## References

- [TypeScript Official Handbook](https://www.typescriptlang.org/docs/)
- [Advanced Types](https://www.typescriptlang.org/docs/handbook/2/types-from-types.html)
- [Utility Types](https://www.typescriptlang.org/docs/handbook/utility-types.html)
- [TypeScript Deep Dive](https://basarat.gitbook.io/typescript/)
