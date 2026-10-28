# React State Management Interview Q&A

## Overview
React State Management covers different approaches for managing application state including Context API, Redux, MobX, Zustand, Recoil, Jotai, and other modern state management libraries.

---

## Interview Questions & Answers

1. **What is State Management in React?**
   - State Management handles application state centrally, ensuring consistent, predictable state across components.

2. **What are the types of State?**
   - Local component state, shared state (multiple components), global state (entire application).

3. **What is Props Drilling (Prop Threading)?**
   - Passing props through many intermediate components to reach deeply nested components.

4. **What is the problem with Props Drilling?**
   - Makes code hard to maintain, verbose, and prone to bugs when props pass through unnecessary components.

5. **What is Context API?**
   - Context API provides way to pass data through component tree without passing props at every level.

6. **How do you create a Context?**
   - Use `React.createContext()` to create context.

7. **What is ContextProvider?**
   - Provider component wrapping subtree to supply context value to descendants.

8. **How do you consume Context?**
   - Use `useContext()` hook in functional components or `Context.Consumer` in class components.

9. **What are the limitations of Context API?**
   - Not optimized for frequent changes, causes unnecessary re-renders of all consumers.

10. **When should you use Context API?**
    - For static data (themes, language), authentication state, or simple shared state.

11. **What is Redux?**
    - Redux is a predictable state management library using unidirectional data flow and pure reducers.

12. **What are Redux Core Concepts?**
    - Store (state container), Actions (events), Reducers (state transformers), Dispatch (trigger actions).

13. **What is Store in Redux?**
    - Single source of truth holding entire application state.

14. **What is Action in Redux?**
    - Object with `type` property describing what happened.

15. **What is Reducer in Redux?**
    - Pure function taking current state and action, returning new state.

16. **What is Dispatch?**
    - Function sending actions to Redux store to trigger state changes.

17. **What is Selector in Redux?**
    - Function extracting specific state values from Redux store.

18. **What are Redux Middleware?**
    - Functions intercepting dispatched actions, enabling logging, async actions, etc.

19. **What is Redux Thunk?**
    - Middleware allowing action creators to return functions for async operations.

20. **What is Redux Saga?**
    - Library using generator functions for complex side effects management.

21. **What is the difference between Redux Thunk and Redux Saga?**
    - Thunk is simpler for basic async; Saga is more powerful for complex flows.

22. **What is MobX?**
    - Reactive state management library using decorators and observables.

23. **What is Observable in MobX?**
    - Object that automatically tracks changes and notifies observers.

24. **What is the difference between Redux and MobX?**
    - Redux is predictable with explicit state changes; MobX is reactive with implicit tracking.

25. **What is Zustand?**
    - Lightweight state management library with minimal boilerplate and simple API.

26. **What is Recoil?**
    - Facebook's state management library using atoms and selectors for fine-grained reactivity.

27. **What is Atom in Recoil?**
    - Unit of state that components can subscribe to.

28. **What is Selector in Recoil?**
    - Derived state computed from atoms and selectors.

29. **What is Jotai?**
    - Primitive and flexible state management using atoms similar to Recoil.

30. **What is the difference between Recoil and Jotai?**
    - Recoil is more complex with better DevTools; Jotai is simpler and more flexible.

31. **What is Immer?**
    - Library enabling immutable updates with mutable syntax.

32. **What is the benefit of Immer?**
    - Simplifies immutable state updates, reducing boilerplate code.

33. **What is Normalization in State Management?**
    - Organizing state to avoid duplication and maintain consistency.

34. **What is Denormalization?**
    - Pre-computing derived state to improve performance at cost of redundancy.

35. **When should you normalize state?**
    - Complex nested data, frequent updates, data consistency requirements.

36. **What is Memoization in State Management?**
    - Caching computed values to prevent unnecessary recalculations.

37. **What is useCallback?**
    - Hook memoizing function references to prevent unnecessary re-renders.

38. **What is useMemo?**
    - Hook memoizing computed values to prevent unnecessary calculations.

39. **What is React.memo?**
    - Component wrapper preventing re-renders if props unchanged.

40. **What is Atomic State?**
    - Breaking state into smallest independent units (atoms) for fine-grained reactivity.

41. **What is the difference between Local and Global State?**
    - Local state managed by component; global state managed by state management library.

42. **When should you lift state up?**
    - When multiple components need shared state.

43. **What is State Colocalization?**
    - Keeping state as close as possible to where it's used.

44. **What is the difference between state and props?**
    - State is mutable and managed by component; props are immutable and passed from parent.

45. **What is the Flux Architecture?**
    - Unidirectional data flow: Action → Dispatcher → Store → View.

46. **How does Redux follow Flux?**
    - Redux implements Flux principles with Actions, Store, Reducers, and unidirectional flow.

47. **What is Time-Travel Debugging in Redux?**
    - Debugging feature replaying state changes to any previous state.

48. **What is Redux DevTools?**
    - Browser extension enabling Redux time-travel debugging and action inspection.

49. **What is Hot Module Replacement (HMR)?**
    - Update modules during development without full page reload.

50. **What is Code Splitting in State Management?**
    - Lazy loading state management code to reduce initial bundle size.

51. **What is Async State Management?**
    - Managing asynchronous operations (API calls) in state management library.

52. **How do you handle API calls in Redux?**
    - Use middleware like Redux Thunk or Redux Saga for async operations.

53. **What is Error Handling in State Management?**
    - Tracking and managing errors in central state for consistent error display.

54. **What is Loading State?**
    - Tracking when async operations are in progress for UI loading indicators.

55. **What is Cache Invalidation?**
    - Removing stale cached data when it needs to be refreshed.

56. **What is Request Deduplication?**
    - Preventing duplicate API requests for same data within time window.

57. **What is Optimistic Updates?**
    - Updating UI immediately before server confirmation for better UX.

58. **What is Rollback?**
    - Reverting optimistic updates if server confirmation fails.

59. **What is State Persistence?**
    - Saving state to localStorage/sessionStorage for persistence across sessions.

60. **What is the future of React State Management?**
    - Server components, React 18 features, integration with backend GraphQL, simpler atomic patterns.

---

## State Management Comparison

| Library | Complexity | Best For | Bundle Size |
|---------|-----------|----------|-------------|
| **Context API** | Low | Simple apps | 0 bytes |
| **Redux** | High | Complex apps | ~40KB |
| **MobX** | Medium | Reactive systems | ~30KB |
| **Zustand** | Low | Modern apps | ~3KB |
| **Recoil** | Medium | Fine-grained reactivity | ~45KB |
| **Jotai** | Low | Atomic state | ~5KB |

---

## Best Practices

1. Choose state management based on app complexity
2. Keep state minimal and normalized
3. Use selectors to derive state
4. Colocalize state near usage
5. Implement proper error handling
6. Use DevTools for debugging
7. Memoize expensive computations
8. Avoid deeply nested state
9. Separate domain and UI state
10. Consider performance implications

---

## Common Mistakes

1. Over-normalizing simple state
2. Putting everything in global state
3. Not using selectors for derived data
4. Creating circular dependencies
5. Mutating state directly
6. Not handling async errors
7. Ignoring performance optimization
8. Too many state management tools
9. Poor state structure design
10. Not testing state logic

---

## Decision Tree

```
Simple app (< 5 components)?
├─ YES: useState (local state)
└─ NO: Need shared state?
    ├─ YES: Complex nested updates?
    │   ├─ YES: Redux or Zustand
    │   └─ NO: Context API or Jotai
    └─ NO: useState
```

---

## Summary

Choose state management based on complexity: useState for simple, Context API for basic sharing, Zustand/Jotai for modern minimalism, Redux for complex apps. Understand memoization, selectors, and normalization. Master async handling and DevTools for debugging.

---

## References

- [React Official Docs](https://react.dev/)
- [Redux Documentation](https://redux.js.org/)
- [Zustand Documentation](https://github.com/pmndrs/zustand)
- [Recoil Documentation](https://recoiljs.org/)
- [State Management Comparison](https://github.com/markerikson/redux-ecosystem-links)
