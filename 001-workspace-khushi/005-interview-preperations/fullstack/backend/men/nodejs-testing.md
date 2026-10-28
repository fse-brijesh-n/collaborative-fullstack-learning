# Node.js Testing Interview Q&A

## Overview
Node.js Testing involves unit tests, integration tests, and end-to-end tests using frameworks like Jest, Mocha, and tools like Sinon, Chai, and Supertest.

---

## Interview Questions & Answers

1. **What is Testing?**
   - Testing is the practice of writing code to verify that application code works correctly under various conditions.

2. **What are the types of Testing?**
   - Unit testing (individual functions), integration testing (multiple components), and end-to-end testing (full application flow).

3. **What is Unit Testing?**
   - Unit testing tests individual functions or components in isolation to ensure correctness.

4. **What is Jest?**
   - Jest is a JavaScript testing framework from Facebook with built-in assertion library, mocking, and coverage reporting.

5. **What are the advantages of Jest?**
   - Zero configuration, fast parallel test execution, snapshot testing, excellent documentation, and great IDE integration.

6. **What is a Test Suite?**
   - A Test Suite is a collection of related test cases, created using `describe()`.

7. **What is a Test Case?**
   - A Test Case is an individual test checking a specific behavior, created using `test()` or `it()`.

8. **What is an Assertion?**
   - An Assertion is a statement checking if a condition is true, using matchers like `expect()`.

9. **What is a Matcher in Jest?**
   - A Matcher is a function comparing actual vs expected values (e.g., `toEqual()`, `toBe()`, `toContain()`).

10. **What is a Mock in Testing?**
    - A Mock is a fake implementation replacing a real function or module to isolate the code under test.

11. **What is the difference between Mock and Stub?**
    - Mock tracks calls and interactions; Stub provides predefined responses without tracking.

12. **What is Sinon.js?**
    - Sinon is a library providing standalone test spies, stubs, and mocks for JavaScript.

13. **What is a Spy in Testing?**
    - A Spy wraps an existing function to track calls, arguments, and return values without changing behavior.

14. **What is a Stub in Testing?**
    - A Stub replaces a real function with a controlled implementation for testing.

15. **What is the difference between Spy and Stub?**
    - Spy wraps existing functions, Stub replaces functions completely.

16. **What is Mocha?**
    - Mocha is a JavaScript testing framework providing test organization, hooks, and reporting.

17. **What is Chai?**
    - Chai is an assertion library providing readable BDD/TDD style assertions (expect, should, assert).

18. **What is the difference between Mocha and Jest?**
    - Jest is all-in-one with built-in assertions; Mocha requires separate assertion libraries like Chai.

19. **What is Supertest?**
    - Supertest is a library for testing HTTP APIs by providing a fluent interface for making requests.

20. **How do you test async functions in Jest?**
    - Return promises, use `async/await` with `done()` callback, or use Jest's native async support.

21. **What is a Snapshot Test?**
    - Snapshot testing compares output against a previously saved snapshot to detect unintended changes.

22. **What are the drawbacks of Snapshot Testing?**
    - False positives, large snapshots difficult to review, and need careful snapshot updates.

23. **What is Test Coverage?**
    - Test coverage measures the percentage of code executed by tests.

24. **What is Code Coverage?**
    - Code coverage shows which lines, branches, and functions are covered by tests.

25. **What are Coverage Metrics?**
    - Line coverage, Branch coverage, Function coverage, and Statement coverage.

26. **What is 100% Code Coverage?**
    - When all executable code is executed by tests, but doesn't guarantee all bugs are caught.

27. **What is a beforeEach Hook?**
    - A `beforeEach()` hook runs before each test case for common setup.

28. **What is an afterEach Hook?**
    - An `afterEach()` hook runs after each test case for cleanup.

29. **What is beforeAll Hook?**
    - A `beforeAll()` hook runs once before all tests in a suite.

30. **What is afterAll Hook?**
    - An `afterAll()` hook runs once after all tests in a suite.

31. **What is Integration Testing?**
    - Integration testing checks how multiple components work together.

32. **How do you test database operations?**
    - Use test databases, in-memory databases, or mock the database layer with stubs.

33. **What is an In-Memory Database?**
    - An in-memory database (like SQLite in-memory) stores data in RAM for fast test execution.

34. **What is Database Seeding in Tests?**
    - Seeding populates test database with initial data before running tests.

35. **How do you test API endpoints?**
    - Use HTTP testing libraries like Supertest to make requests and verify responses.

36. **How do you mock HTTP requests in tests?**
    - Use libraries like nock or jest.mock() to intercept and mock HTTP calls.

37. **What is nock?**
    - nock is a library for mocking HTTP requests in Node.js tests.

38. **What is jest.mock()?**
    - `jest.mock()` replaces a module with a mock implementation at the beginning of tests.

39. **How do you mock environment variables in Jest?**
    - Use `process.env.VARIABLE = 'value'` or `jest-dotenv` for .env file support.

40. **What is Test-Driven Development (TDD)?**
    - TDD is writing tests before implementation, using tests to guide design decisions.

41. **What is Behavior-Driven Development (BDD)?**
    - BDD uses human-readable test syntax with `describe()` and `it()` to align tests with business requirements.

42. **What is End-to-End Testing?**
    - E2E testing tests complete application workflows from user perspective.

43. **What tools are used for E2E Testing in Node.js?**
    - Puppeteer, Playwright, Cypress for frontend; Supertest for backend APIs.

44. **What is Puppeteer?**
    - Puppeteer is a Node.js library for controlling headless Chrome/Chromium for E2E testing.

45. **What is Playwright?**
    - Playwright is a browser automation library supporting Chrome, Firefox, and Safari for E2E testing.

46. **How do you organize tests in Node.js?**
    - Group related tests in suites using `describe()`, use descriptive names, separate unit/integration/e2e.

47. **What is Continuous Integration Testing?**
    - Running tests automatically on code commits to catch issues early.

48. **What is the AAA Pattern?**
    - Arrange (setup), Act (execute), Assert (verify)—organizing test structure for clarity.

49. **What are testing best practices?**
    - Write tests alongside code, test behavior not implementation, use meaningful names, isolate dependencies.

50. **What is the difference between Test Pyramid and Testing Trophy?**
    - Pyramid emphasizes many unit tests, few integration tests, fewer e2e tests. Trophy emphasizes integration tests balance.

51. **How do you handle timeouts in tests?**
    - Use `jest.setTimeout()` to set test timeout, or use `jest.useFakeTimers()` for timer-based code.

52. **What is Jest.useFakeTimers()?**
    - `jest.useFakeTimers()` replaces real timers with mock timers for testing time-based code.

53. **How do you test promises in Jest?**
    - Return promise from test, use `async/await`, or use `done()` callback.

54. **How do you test error cases?**
    - Use `expect().toThrow()` for synchronous errors or `rejects.toThrow()` for promise rejections.

55. **What is Performance Testing?**
    - Testing response times and resource usage under various load conditions.

56. **What is Load Testing?**
    - Testing system behavior under high load using tools like Artillery or Apache JMeter.

57. **How do you test event emitters?**
    - Use Jest's mock functions to verify event handlers are called with expected arguments.

58. **What is the difference between shallow and deep equality?**
    - Shallow equality compares references; deep equality compares all nested values.

59. **How do you skip tests in Jest?**
    - Use `test.skip()` or `it.skip()` to skip specific tests.

60. **How do you isolate tests?**
    - Use separate test files, mock external dependencies, and reset mocks between tests with `jest.clearAllMocks()`.

---

## Testing Frameworks Comparison

| Aspect | Jest | Mocha | Jasmine |
|--------|------|-------|---------|
| Setup | Zero config | Needs setup | Built-in |
| Assertions | Built-in | Requires Chai | Built-in |
| Mocking | Built-in | Needs Sinon | Built-in |
| Speed | Fast | Good | Good |
| Async | Native support | Good | Good |
| Snapshots | Yes | No | No |

---

## Best Practices

1. Write tests alongside code (TDD/BDD)
2. Follow AAA pattern (Arrange, Act, Assert)
3. Use descriptive test names
4. Test behavior, not implementation
5. Mock external dependencies
6. Keep tests isolated and independent
7. Aim for meaningful coverage, not 100%
8. Run tests frequently in CI/CD
9. Maintain test database for consistency
10. Clean up resources in afterEach hooks

---

## Common Mistakes

1. Testing implementation instead of behavior
2. Not isolating dependencies with mocks
3. Tests depending on each other
4. Using inappropriate assertions
5. Not mocking external API calls
6. Over-mocking causing brittle tests
7. Not cleaning up after tests
8. Ignoring test organization
9. Testing too many things in one test
10. Not documenting test purposes

---

## Summary

Master unit testing with Jest, integration testing with Supertest, and e2e testing with Puppeteer/Playwright. Use Sinon for advanced mocking. Follow TDD principles, organize tests logically, and maintain meaningful coverage. Understand the testing pyramid and automate tests in CI/CD pipelines.

---

## References

- [Jest Official Documentation](https://jestjs.io/)
- [Mocha Documentation](https://mochajs.org/)
- [Chai Assertion Library](https://www.chaijs.com/)
- [Sinon.js Documentation](https://sinonjs.org/)
- [Supertest Package](https://github.com/visionmedia/supertest)
