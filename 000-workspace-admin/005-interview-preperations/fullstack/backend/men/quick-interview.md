# The Ultimate Mern Full-Stack Developer Interview Guide

This comprehensive guide covers everything from Frontend Fundamentals to Advanced Backend Architecture. It combines in-depth theoretical deep dives, practical code snippets, and over 350+ top interview questions & answers across the MERN stack (MongoDB, Express.js, React.js, Node.js) and testing.

---

## Table of Contents

1. [Frontend Fundamentals: HTML, CSS, Tailwind & Lucide](#1-frontend-fundamentals)
2. [React.js Deep Dive & Q&A](#2-reactjs)
3. [React State Management & Q&A](#3-react-state-management)
4. [Node.js Deep Dive & Q&A](#4-nodejs)
5. [Express.js Deep Dive & Q&A](#5-expressjs)
6. [MongoDB Deep Dive & Q&A](#6-mongodb)
7. [Mongoose ODM Deep Dive & Q&A](#7-mongoose)
8. [Testing in Node.js & Q&A](#8-testing)

---

## 1. Frontend Fundamentals
### HTML5, CSS3, Tailwind CSS & Lucide Icons

#### HTML5
*   **Semantics:** Use semantic tags (`<header>`, `<nav>`, `<main>`, `<article>`, `<section>`, `<aside>`, `<footer>`) to improve SEO and Accessibility (a11y).
*   **Accessibility (ARIA):** Use `role`, `aria-label`, `aria-hidden` and keyboard focusability (`tabindex`) to ensure inclusivity.
*   **Multimedia:** `<picture>`, `<video>`, and `<audio>` tags natively support responsive media and multiple formats.

#### CSS3
*   **Box Model:** Content, Padding, Border, Margin. Always use `box-sizing: border-box`.
*   **Flexbox vs Grid:** Flexbox is for 1D layouts (rows OR columns). Grid is for 2D layouts (rows AND columns).
*   **Modern Features:** CSS Variables (`--var`), Container Queries (`@container`), CSS Nesting, and functions like `clamp()`, `calc()`.

#### Tailwind CSS
*   **Utility-First:** Compose designs using small, single-purpose classes (`bg-blue-500`, `flex`, `justify-between`).
*   **Responsiveness:** Mobile-first approach using prefixes (`sm:`, `md:`, `lg:`, `xl:`).
*   **JIT Compiler:** Automatically purges unused CSS for tiny production builds.

#### Lucide Icons
*   **Usage:** A beautifully consistent SVG icon library. `npm install lucide-react`
*   **Implementation:** `<Camera size={32} color="red" strokeWidth={1.5} className="cursor-pointer" />`

---

## 2. React.js

### Deep Dive Concepts
*   **Virtual DOM:** A lightweight in-memory representation of the real DOM. React diffs the old and new vDOM and updates only the changed parts (Reconciliation).
*   **Hooks:** 
    *   `useState`: Manages local state.
    *   `useEffect`: Handles side effects (data fetching, subscriptions).
    *   `useMemo` & `useCallback`: Performance optimization by memoizing values and functions.
    *   `useRef`: Mutable ref object that persists across renders without causing re-renders.
*   **Context API:** Avoids prop-drilling for low-frequency global state (themes, auth).

### Top 50 React Interview Questions

1. **What is React.js?** React.js is a JavaScript library for building user interfaces, especially for single-page applications where UI updates dynamically.
2. **What are the main features of React?** Virtual DOM, JSX, Component-Based Architecture, Unidirectional Data Flow, and Hooks.
3. **What is JSX in React?** JSX (JavaScript XML) is a syntax extension that allows writing HTML in JavaScript.
4. **What is the Virtual DOM?** A lightweight copy of the actual DOM that React uses to optimize rendering by updating only the changed parts.
5. **How does React handle data flow?** React uses unidirectional data flow, meaning data is passed down from parent to child components.
6. **What is the difference between a class component and a functional component?** Class components use lifecycle methods and state; functional components use hooks and are simpler to write.
7. **What are React Hooks?** Functions like `useState` and `useEffect` that allow functional components to use state and lifecycle features.
8. **Explain useState hook.** `useState` allows a functional component to manage state.
9. **What is useEffect in React?** A hook that runs side effects in function components, like fetching data or DOM manipulation.
10. **How do you handle forms in React?** Using controlled components where state manages input values.
11. **What is a controlled component?** A component where form inputs are controlled by React state.
12. **What is an uncontrolled component?** A form component where the DOM itself maintains the input state using Refs.
13. **What is the importance of keys in React lists?** Keys help React efficiently identify, update, and render list items during reconciliation.
14. **What are props in React?** Props (properties) allow read-only data to be passed from parent to child components.
15. **What is Prop Drilling?** The process of passing data through multiple levels of components unnecessarily.
16. **How do you avoid Prop Drilling?** Using React Context API or state management libraries like Redux/Zustand.
17. **What is Context API in React?** A way to manage state globally and avoid prop drilling natively.
18. **What is Redux?** A state management library that centralizes application state.
19. **What is the difference between Redux and Context API?** Redux offers more structure and middleware support for high-frequency updates, while Context API is simpler but less optimized for rapid changes.
20. **What is React Router?** A library for handling navigation in React applications.
21. **How do you implement routing in React?** Using `BrowserRouter`, `Routes`, `Route`, and `Link` from React Router.
22. **What is lazy loading in React?** A technique (`React.lazy`, `<Suspense>`) to load components asynchronously to improve initial load performance.
23. **What is the difference between useMemo and useCallback?** `useMemo` memoizes computed values, while `useCallback` memoizes function references.
24. **What is Refs in React?** Refs allow direct access to DOM elements or component instances.
25. **How do you create a ref in React?** Using the `useRef()` hook for functional components.
26. **What is the difference between useRef and useState?** `useRef` persists values without causing re-renders, unlike `useState`.
27. **What is HOC (Higher-Order Component) in React?** A function that takes a component and returns a new enhanced component.
28. **What is the difference between controlled and uncontrolled inputs?** Controlled are managed by state, uncontrolled rely on the DOM.
29. **What is an Error Boundary in React?** A class component that catches JavaScript errors in child components and displays a fallback UI.
30. **How does React handle events?** React uses synthetic events to provide cross-browser compatibility.
31. **What is reconciliation in React?** The process React uses to update the UI efficiently using the Virtual DOM diffing algorithm.
32. **What are portals in React?** A way (`ReactDOM.createPortal`) to render components outside the main DOM tree (useful for Modals).
33. **How do you optimize React performance?** Using memoization, lazy loading, code-splitting, and efficient state management.
34. **What is a Pure Component in React?** A class component that implements a shallow comparison in `shouldComponentUpdate` for performance.
35. **What is the difference between React.memo and useMemo?** `React.memo` is used to memoize entire components, while `useMemo` is used for specific values inside a component.
36. **What is the difference between useState and useReducer?** `useState` is for simple state, `useReducer` is useful for complex state logic involving multiple sub-values.
37. **How do you handle side effects in React?** Using `useEffect`.
38. **What is a Fragment in React?** A way (`<></>` or `<React.Fragment>`) to group multiple elements without adding extra nodes to the DOM.
39. **What is React.StrictMode?** A wrapper tool for highlighting potential issues in an application during development.
40. **What is the difference between useEffect and componentDidMount?** `useEffect(fn, [])` emulates `componentDidMount` in functional components.
41. **How do you handle conditional rendering in React?** Using ternary operators (`?:`) or logical AND (`&&`).
42. **How do you fetch data in React?** Using `fetch()`, Axios, or React Query inside `useEffect`.
43. **What is event delegation in React?** React attaches a single event listener to the root of the document to handle all events efficiently.
44. **How do you update state based on the previous state?** By passing a callback function to the state setter (`setCount(prev => prev + 1)`).
45. **What is hydration in React?** The process of attaching event listeners to server-rendered HTML.
46. **How do you test React components?** Using Jest and React Testing Library.
47. **What is React Fiber?** The new reconciliation engine in React 16+ designed for faster, interruptible rendering.
48. **How do you handle global state in React?** Context API, Redux, Zustand, Recoil, etc.
49. **What is the difference between local and global state?** Local is scoped to a component; global is shared across the app.
50. **What is Concurrent Mode in React?** A set of features to improve responsiveness by rendering UI interruptibly.
51. **What are React Server Components (RSC)?** Components that render exclusively on the server, resulting in zero bundle size on the client and direct access to backend resources.
52. **`useLayoutEffect` vs `useEffect`?** `useEffect` runs asynchronously after the render is painted to the screen; `useLayoutEffect` runs synchronously after DOM mutations but before the browser paints.
53. **What is `useTransition`?** A hook that lets you mark state updates as non-urgent, keeping the UI responsive during heavy rendering.
54. **What is `useDeferredValue`?** A hook that lets you defer updating a less important part of the UI (like a search results list) while keeping the input responsive.
55. **How does React.memo do deep comparison?** By default, it does a shallow comparison. You can pass a custom `areEqual` function as the second argument to perform deep comparison.
56. **What is the Render Phase vs Commit Phase?** The Render Phase calculates changes (pure and can be interrupted). The Commit Phase applies those changes to the DOM (synchronous and cannot be interrupted).
57. **How do Portals handle event bubbling?** Even though a portal can be anywhere in the DOM tree, it behaves like a normal React child, meaning events bubble up to ancestors in the React tree.
58. **Why does Strict Mode render components twice in development?** To help detect unexpected side effects in the render phase, ensuring components are pure.
59. **What is a Custom Hook?** A JavaScript function whose name starts with `use` and that may call other Hooks, used to extract stateful logic from a component.
60. **What is the `useSyncExternalStore` hook?** A hook recommended for reading and subscribing from external data sources in a way that’s compatible with concurrent rendering.

---

## 3. React State Management

### Deep Dive Concepts
*   **Redux:** Single source of truth, immutable state updates via pure reducers, dispatched actions. Good for highly complex apps.
*   **Zustand:** Lightweight, minimal boilerplate, modern alternative to Redux.
*   **MobX:** Reactive state management using observables and decorators.
*   **Recoil/Jotai:** Atomic state management, fine-grained reactivity.
*   **Decision Tree:** 
    *   Simple App? -> `useState`
    *   Need Shared State? -> `Context API` (if static) or `Zustand/Jotai` (if dynamic)
    *   Complex Nested Updates? -> `Redux` or `Zustand`

### Top 60 State Management Interview Questions

1. **What is State Management in React?** Handles application state centrally, ensuring consistent, predictable state across components.
2. **What are the types of State?** Local component state, shared state, global state.
3. **What is Props Drilling?** Passing props through many intermediate components to reach deeply nested components.
4. **What is the problem with Props Drilling?** Makes code hard to maintain, verbose, and prone to bugs.
5. **What is Context API?** Provides a way to pass data through the component tree without passing props down manually at every level.
6. **How do you create a Context?** Use `React.createContext()`.
7. **What is ContextProvider?** A component that wraps a subtree to supply context value to descendants.
8. **How do you consume Context?** Use the `useContext()` hook.
9. **What are the limitations of Context API?** Not optimized for frequent changes; causes re-renders of all consumers when value changes.
10. **When should you use Context API?** For static/infrequent data (themes, language, auth user).
11. **What is Redux?** A predictable state container using unidirectional data flow and pure reducers.
12. **What are Redux Core Concepts?** Store, Actions, Reducers, Dispatch.
13. **What is a Store in Redux?** Single source of truth holding entire application state.
14. **What is an Action in Redux?** Object with a `type` property describing what happened.
15. **What is a Reducer in Redux?** Pure function taking current state and action, returning new state.
16. **What is Dispatch?** Function sending actions to the Redux store to trigger state changes.
17. **What is a Selector in Redux?** Function extracting specific state values from the Redux store.
18. **What are Redux Middleware?** Functions intercepting dispatched actions, enabling logging, async actions, etc.
19. **What is Redux Thunk?** Middleware allowing action creators to return functions for async operations.
20. **What is Redux Saga?** Library using generator functions for complex side effects management.
21. **What is the difference between Thunk and Saga?** Thunk is simpler for basic async; Saga is powerful for complex async flows.
22. **What is MobX?** Reactive state management library using observables.
23. **What is an Observable in MobX?** Object that automatically tracks changes and notifies observers.
24. **Difference between Redux and MobX?** Redux is predictable/explicit; MobX is reactive/implicit.
25. **What is Zustand?** Lightweight state management library with minimal boilerplate.
26. **What is Recoil?** Facebook's state management library using atoms and selectors for fine-grained reactivity.
27. **What is an Atom in Recoil?** Unit of state that components can subscribe to.
28. **What is a Selector in Recoil?** Derived state computed from atoms and other selectors.
29. **What is Jotai?** Primitive and flexible state management using atoms similar to Recoil but simpler.
30. **Difference between Recoil and Jotai?** Recoil is more complex with heavy DevTools; Jotai is simpler and highly flexible.
31. **What is Immer?** Library enabling immutable updates with mutable syntax.
32. **What is the benefit of Immer?** Simplifies immutable state updates, drastically reducing boilerplate.
33. **What is Normalization in State Management?** Organizing state to avoid duplication and maintain consistency (flat structures).
34. **What is Denormalization?** Pre-computing derived state to improve read performance at the cost of redundancy.
35. **When should you normalize state?** Complex nested data, frequent updates, ensuring data consistency.
36. **What is Memoization in State Management?** Caching computed values to prevent unnecessary recalculations.
37. **What is useCallback?** Hook memoizing function references to prevent unnecessary child re-renders.
38. **What is useMemo?** Hook memoizing computed values to prevent unnecessary calculations.
39. **What is React.memo?** Component wrapper preventing re-renders if props are unchanged.
40. **What is Atomic State?** Breaking state into the smallest independent units (atoms) for fine-grained reactivity.
41. **Difference between Local and Global State?** Local is managed by a single component; Global is accessible everywhere.
42. **When should you lift state up?** When multiple sibling components need to share and sync state.
43. **What is State Colocalization?** Keeping state as close as possible to where it's used.
44. **Difference between state and props?** State is mutable/internal; props are immutable/external.
45. **What is Flux Architecture?** Unidirectional flow: Action → Dispatcher → Store → View.
46. **How does Redux follow Flux?** It implements Flux principles with Actions, Store, Reducers, and unidirectional flow.
47. **What is Time-Travel Debugging?** Debugging feature in Redux replaying state changes to any previous state.
48. **What is Redux DevTools?** Browser extension for action inspection and time-travel debugging.
49. **What is Hot Module Replacement (HMR)?** Updating modules during development without full page reload.
50. **What is Code Splitting in State Management?** Lazy loading state management slices to reduce initial bundle size.
51. **What is Async State Management?** Managing asynchronous operations (API calls) within the state library.
52. **How do you handle API calls in Redux?** Using middleware like Thunk or Saga, or modern RTK Query.
53. **What is Error Handling in State Management?** Tracking and managing errors in central state for UI consistency.
54. **What is Loading State?** Tracking async progress to show UI loading indicators.
55. **What is Cache Invalidation?** Removing stale cached data when it needs refreshing.
56. **What is Request Deduplication?** Preventing duplicate API requests for the same data within a time window.
57. **What is Optimistic Updates?** Updating the UI immediately before server confirmation for better perceived performance.
58. **What is a Rollback?** Reverting optimistic updates if the server request fails.
59. **What is State Persistence?** Saving state to `localStorage`/`sessionStorage` to persist across sessions.
60. **What is the future of React State Management?** Server components, integration with GraphQL/React Query, and simpler atomic patterns.
61. **Redux Toolkit (RTK) vs legacy Redux?** RTK abstracts setup, includes Redux Thunk and Immer by default, and dramatically reduces boilerplate.
62. **How does Zustand handle re-renders?** Zustand allows components to select specific state slices, subscribing only to those changes, avoiding unnecessary renders.
63. **What are transient updates in Zustand?** Updating state without causing a React re-render, useful for highly frequent updates like scroll positions.
64. **What is Reselect?** A library for creating memoized selector functions for Redux, computing derived data efficiently.
65. **What are Atom Families in Recoil/Jotai?** A utility that returns a parameterized atom based on the parameters you pass to it, useful for dynamic state collections.
66. **How to optimize Context API performance?** Split state into multiple smaller contexts (e.g., one for theme, one for user) or use `useMemo` to memoize the context value.
67. **Server State vs Client State?** Client State handles UI (modals, forms); Server State handles asynchronous data fetched from a backend (caching, deduplication).
68. **What is React Query (TanStack Query)?** A powerful asynchronous state management library for fetching, caching, and updating server state in React.
69. **What is RTK Query?** An advanced data fetching and caching tool built into Redux Toolkit, providing functionality similar to React Query.
70. **How does Jotai differ from Context API?** Jotai provides atomic state pieces preventing the re-rendering of the entire component tree, unlike Context API which triggers a render for all consumers.

---

## 4. Node.js

### Deep Dive Concepts
*   **Architecture:** V8 Engine + libuv. Single-threaded main execution, but utilizes a background thread pool for I/O.
*   **Event Loop:** Phased execution model (Timers -> Pending Callbacks -> Idle/Prepare -> Poll -> Check -> Close). Microtasks (Promises, `nextTick`) run between phases.
*   **Modules:** CommonJS (`require()`) vs ES Modules (`import`).
*   **Streams:** Readable, Writable, Duplex, Transform. Vital for memory-efficient data processing.

### Top 50 Node.js Interview Questions

1. **What is Node.js?** A runtime environment that allows JavaScript to run on the server side, built on Chrome's V8 engine.
2. **Difference between Node.js and JavaScript?** JS is a language; Node.js is a runtime environment executing JS outside the browser.
3. **Explain the event-driven architecture of Node.js.** It uses an event loop to handle asynchronous non-blocking I/O operations efficiently.
4. **Synchronous vs Asynchronous in Node?** Synchronous blocks execution; Asynchronous allows tasks to execute concurrently.
5. **What is the purpose of the event loop?** It processes async operations, making Node.js non-blocking.
6. **What are streams in Node.js?** Data handling methods to process files efficiently without loading them into memory (Readable, Writable, Duplex, Transform).
7. **`process.nextTick()` vs `setImmediate()`?** `nextTick` fires immediately after the current operation (before event loop phases); `setImmediate` fires in the Check phase of the event loop.
8. **Role of the `require()` function?** Used to import CommonJS modules.
9. **Different types of modules?** Core modules (fs, http), local modules, third-party modules (npm).
10. **CommonJS vs ES6 modules?** CommonJS uses `require()`/`module.exports`; ES6 uses `import`/`export`.
11. **What is middleware in Express.js?** Functions that process requests before sending a response.
12. **Purpose of `package.json`?** Contains project metadata, scripts, and dependencies.
13. **How does Node handle file operations asynchronously?** Using the `fs` module with callbacks, promises, or async/await.
14. **Purpose of the `cluster` module?** Enables multi-core execution by spawning worker processes sharing the same port.
15. **How do you create an HTTP server?** Using the `http` module: `http.createServer((req, res) => {...}).listen(3000)`
16. **`fork()` vs `spawn()`?** `fork()` creates a new V8 Node.js process with a communication channel; `spawn()` runs a new OS child process.
17. **`process.env` vs `dotenv`?** `process.env` accesses variables; `dotenv` is a package that loads them from a `.env` file into `process.env`.
18. **How to handle uncaught exceptions?** Using `process.on('uncaughtException', callback)`.
19. **What is a promise?** An object representing the eventual completion or failure of an asynchronous operation.
20. **Purpose of async/await?** Syntactic sugar that simplifies asynchronous code to read like synchronous code.
21. **What is an event emitter?** A class (`EventEmitter`) that allows handling custom events (publish/subscribe pattern).
22. **What is CORS?** Cross-Origin Resource Sharing controls HTTP requests between different domains for security.
23. **What is JWT?** JSON Web Token used for secure, stateless authentication.
24. **Purpose of the `buffer` module?** Provides a way to handle raw binary data.
25. **`readFile` vs `createReadStream`?** `readFile` loads the entire file into RAM; `createReadStream` streams data in chunks.
26. **How to implement WebSockets?** Using the `ws` or `socket.io` module.
27. **PUT vs PATCH in REST?** PUT replaces an entire resource; PATCH updates a partial aspect of it.
28. **Purpose of Nodemon?** Automatically restarts the Node server when file changes are detected.
29. **Role of bcrypt?** Hashes passwords securely using salts.
30. **What are worker threads?** `worker_threads` run CPU-intensive JavaScript code in parallel threads to avoid blocking the main event loop.
31. **Session-based vs Token-based auth?** Session stores user data in server memory/DB; Token-based stores a signed JWT on the client.
32. **What is Express.js?** A minimalist web framework for building Node.js applications.
33. **How to implement error handling in Express?** Using an error-handling middleware with 4 arguments `(err, req, res, next)`.
34. **What is PM2?** A production process manager for Node.js apps with load balancing and auto-restart capabilities.
35. **How to handle file uploads?** Using the `multer` middleware.
36. **How to secure a Node app?** Helmet, CORS policies, rate limiting, and parameter sanitization.
37. **Global vs Local npm installation?** Global modules are available system-wide (CLI tools); local are project-specific.
38. **Purpose of the `crypto` module?** Provides cryptographic functionalities like hashing, HMAC, cipher, decipher.
39. **How to connect to a database?** Using ODM/ORMs like Mongoose (MongoDB) or Sequelize/Prisma (SQL).
40. **How do you handle concurrency in Node?** Using async/await, Promise.all, and worker threads.
41. **Purpose of the `http` module?** Enables creating low-level HTTP servers and clients.
42. **`process.exit()` vs `process.kill()`?** `exit()` terminates the current process gracefully; `kill()` sends a specific signal to a process ID.
43. **What is microservice architecture?** Dividing an application into small, independent, loosely coupled services.
44. **How to implement auth?** Using Passport.js or custom JWT middleware.
45. **What is an API gateway?** A single entry point that routes client requests to corresponding microservices.
46. **How to prevent SQL injection?** Using parameterized queries or ORM libraries.
47. **`process.stdin` vs `readline` module?** `stdin` reads raw input streams; `readline` provides a clean interface for line-by-line user input.
48. **How to create a CLI tool?** Using the `readline` module, `commander.js`, or `yargs`.
49. **What is Helmet?** Security middleware for Express that sets HTTP security headers.
50. **How to implement rate limiting?** Using `express-rate-limit` or Redis.
51. **What is `UV_THREADPOOL_SIZE`?** An environment variable controlling the number of threads libuv uses for async I/O tasks like DNS lookups or file system operations (default is 4).
52. **Macrotasks vs Microtasks priority?** Microtasks (`process.nextTick`, Promises) always execute before the event loop continues to the next Macrotask (Timers, I/O).
53. **How to detect memory leaks in Node.js?** Using heap dumps (`v8.getHeapSnapshot()`), chrome devtools inspector, and tools like Clinic.js.
54. **What is IPC (Inter-Process Communication)?** A mechanism allowing parent and child processes to send messages to each other using `process.send()` and `.on('message')`.
55. **How does V8 Garbage Collection work?** It uses a generational hypothesis, utilizing a fast Scavenger for young objects and a Mark-Sweep algorithm for old objects.
56. **What is backpressure in streams?** When data is read faster than it can be written, buffers fill up. `stream.pipe()` handles this automatically by pausing and resuming the readable stream.
57. **Worker Threads vs Child Processes?** Worker Threads share the same process memory; Child Processes have separate memory allocations and V8 instances.
58. **What are Native Addons (N-API)?** Dynamically linked shared objects written in C/C++ that can be loaded into Node.js using `require()` to execute high-performance tasks.
59. **What is `AsyncLocalStorage`?** A class in the `async_hooks` module to store and retrieve state throughout the lifecycle of an asynchronous operation (like request-scoped variables).
60. **What is the `cluster` module's scheduling policy?** It uses a Round-Robin approach by default on all platforms (except Windows) to distribute incoming connections to workers.

---

## 5. Express.js

### Deep Dive Concepts
*   **Routing:** Flexible URL-based routing (`app.get('/users/:id')`).
*   **Middleware:** Functions that access `req`, `res`, and `next()`. Types: App-level, Router-level, Error-handling, Built-in, Third-party.
*   **Error Handling:** Use `try/catch` with `next(err)` for async routes, or use `express-async-errors`.
*   **Security:** Always use Helmet, CORS, Rate Limiting, and prevent NoSQL/SQL injection via input validation (`express-validator`).

### Top 50 Express.js Interview Questions

1. **What is Express.js, and why is it used?** A minimalist web framework for Node.js used to build robust web applications and REST APIs easily.
2. **How to install and set up Express?** `npm install express`, `const express = require('express'); const app = express();`.
3. **What are middleware functions?** Functions that execute during the request-response cycle. They can modify req/res, end requests, or pass control via `next()`.
4. **How to define a basic route?** `app.get('/route', (req, res) => { res.send('Hello!'); });`
5. **Difference between `app.use()` and `app.get()`?** `app.use()` applies middleware to all HTTP methods; `app.get()` handles specific GET requests.
6. **How to handle POST requests?** `app.post('/route', ...)` and include `app.use(express.json())` middleware.
7. **What is `express.Router()`?** Allows creating modular, mountable route handlers.
8. **How to handle query parameters?** Access via `req.query.name` for `/route?name=John`.
9. **How to handle route parameters?** Access via `req.params.id` for `/users/:id`.
10. **How to implement error handling?** `app.use((err, req, res, next) => { res.status(500).send('Error'); });`
11. **What is CORS and how to enable it?** Cross-Origin Resource Sharing. Enable via `npm install cors` and `app.use(cors())`.
12. **How to serve static files?** `app.use(express.static('public'))`.
13. **How to handle URL-encoded form data?** `app.use(express.urlencoded({ extended: true }))`.
14. **What is `next()`?** A callback that passes control to the next middleware in the stack.
15. **How to structure a large Express app?** Use MVC (Models, Views, Controllers), services, and modular routing.
16. **How to implement authentication?** Using JWTs, Passport.js, or express-session.
17. **How to handle file uploads?** Using the `multer` package.
18. **How to connect Express with MongoDB?** Using Mongoose: `mongoose.connect('uri')`.
19. **What are status codes?** Standard HTTP responses: 200 (OK), 201 (Created), 400 (Bad Request), 404 (Not Found), 500 (Server Error).
20. **How to log requests?** Using the `morgan` middleware.
21. **How to enable sessions?** Using the `express-session` package.
22. **How to secure Express apps?** Helmet, rate limiting, sanitization, and strict auth.
23. **What is `app.locals`?** Storage for global variables accessible across the application and in templates.
24. **How to use environment variables?** Using the `dotenv` package (`process.env.VAR_NAME`).
25. **Popular templating engines?** EJS, Pug, Handlebars.
26. **How to create a RESTful API?** Define stateless routes for CRUD operations using standard HTTP methods and JSON responses.
27. **What is rate limiting?** Limiting requests from an IP using `express-rate-limit` to prevent DDoS.
28. **How to schedule tasks?** Using `node-cron` or `agenda`.
29. **Synchronous vs Asynchronous middleware?** Sync runs sequentially; Async uses `async/await` and requires calling `next(err)` on failure.
30. **How to prevent SQL injection?** Parameterized queries and ORMs.
31. **How to prevent XSS?** Input sanitization and `helmet`.
32. **How to prevent CSRF?** Using the `csurf` (or `csrf-csrf`) middleware.
33. **How to send an email?** Using the `nodemailer` package.
34. **How to compress responses?** Using the `compression` middleware.
35. **What is Express error-handling middleware?** Middleware specifically with four arguments: `(err, req, res, next)`.
36. **How to implement OAuth?** Using Passport.js with specific OAuth strategies (Google, GitHub).
37. **How to manage dependencies?** via `package.json` and `npm`.
38. **How to implement WebSockets?** Integrating `socket.io` with the underlying HTTP server.
39. **How to validate request data?** Using `express-validator` or `Joi`/`Zod`.
40. **How to handle background jobs?** Using queues like Bull or Agenda.
41. **Role of `body-parser`?** Parses incoming request bodies (now built into Express as `express.json()`).
42. **How to handle timeouts?** Using the `connect-timeout` middleware.
43. **How to handle concurrent requests?** Express is non-blocking, but for heavy load use clustering, PM2, or Load Balancers.
44. **What is an API Gateway?** A reverse proxy that manages and routes API requests to various microservices.
45. **How to unit test Express?** Using Jest and Supertest.
46. **How to handle multiple environments?** Using `.env` files and `NODE_ENV` checks.
47. **How to integrate Redis?** Using the `redis` package for caching or session storage.
48. **How to debug Express?** `console.log()`, the `debug` module, or the Node.js native inspector.
49. **How to set up HTTPS?** Passing SSL certificates to the native `https.createServer(options, app)`.
50. **What is an ETag?** An HTTP header used for cache validation, reducing unnecessary network traffic.
51. **How does Express routing internally work?** It uses a Layer architecture to build a routing tree, matching paths sequentially via regex-like pattern matching.
52. **Express 4 vs Express 5 error handling?** Express 5 automatically catches rejected promises in async middleware/routes without needing to explicitly call `next(err)`.
53. **How to write a custom middleware for specific edge cases?** `const customAuth = (roles) => (req, res, next) => { if (roles.includes(req.user.role)) next(); else res.status(403).send('Forbidden'); }`.
54. **How to scale an Express app?** Use reverse proxies (Nginx), Load Balancers, PM2 clustering, and horizontal scaling across multiple servers or containers.
55. **What are body parsing limits?** `express.json({ limit: '10kb' })` prevents memory exhaustion attacks by blocking enormous payloads.
56. **How to handle WebSockets with Express routing?** You usually mount `socket.io` onto the same HTTP server instance Express uses, allowing them to share the port.
57. **Can Express natively handle HTTP/2?** Native Express doesn't fully support HTTP/2 features like Server Push easily; usually, it's better to terminate HTTP/2 at the Nginx reverse proxy level.
58. **What is `express.Router({ mergeParams: true })`?** Allows child routers to access parameters defined in the parent router's path.
59. **How to test Express routes without spinning up a real server?** Pass the Express `app` instance directly to `supertest` (`request(app).get('/api')`), which binds to an ephemeral port.
60. **What is the `res.format()` method?** Performs content negotiation based on the Accept HTTP header to send back HTML, JSON, or XML depending on what the client requested.

---

## 6. MongoDB

### Deep Dive Concepts
*   **Document Model:** Data is stored in flexible, JSON-like BSON documents. No strict schema constraints natively.
*   **Aggregation Framework:** Powerful pipeline for data transformation (`$match`, `$group`, `$lookup`, `$project`).
*   **Indexing:** Vastly improves query performance (`createIndex`). Types: Single, Compound, Text, Geospatial, Hashed.
*   **Scaling & High Availability:** Sharding (horizontal scaling) and Replica Sets (redundancy).

### Top 50 MongoDB Interview Questions

1. **What is MongoDB?** A NoSQL database that stores data in a flexible, JSON-like format.
2. **Relational DB vs MongoDB?** MongoDB uses a document-oriented model with no fixed schema, unlike table-based relational DBs.
3. **What is a collection?** A group of documents (analogous to a table in SQL).
4. **What is a document?** A JSON-like data structure containing key-value pairs (analogous to a row).
5. **What is the default database?** The "test" database.
6. **What are indexes?** Data structures that improve query performance by allowing fast lookups.
7. **How to create an index?** `db.collection.createIndex({ field: 1 })`.
8. **What is a primary key?** The `_id` field uniquely identifies a document.
9. **How to insert a document?** `db.collection.insertOne({ name: "John" })`.
10. **How to insert multiple documents?** `db.collection.insertMany([{...}, {...}])`.
11. **How to retrieve all documents?** `db.collection.find()`.
12. **How to retrieve specific fields?** Using projection: `db.collection.find({}, { name: 1, _id: 0 })`.
13. **How to update a document?** `db.collection.updateOne({ name: "John" }, { $set: { age: 30 } })`.
14. **How to delete a document?** `db.collection.deleteOne({ name: "John" })`.
15. **Difference between `find()` and `findOne()`?** `find()` returns a cursor to multiple documents; `findOne()` returns a single document.
16. **What is aggregation?** Processing data through a pipeline to return computed results (like SQL's GROUP BY).
17. **Use of `$match`?** Filters documents based on conditions in an aggregation pipeline.
18. **Use of `$group`?** Groups documents by a specified key and applies aggregate functions (`$sum`, `$avg`).
19. **How does MongoDB handle transactions?** Multi-document ACID transactions are supported across collections in replica sets.
20. **What is sharding?** Partitioning data horizontally across multiple servers to handle large datasets.
21. **What is replication?** Creating multiple copies of data across servers (Replica Sets) to ensure high availability.
22. **What is a replica set?** A group of mongod instances that maintain the same dataset.
23. **How to backup a database?** Using `mongodump` (backup) and `mongorestore` (restore).
24. **What is a capped collection?** A fixed-size collection that automatically overwrites old documents when full.
25. **What is GridFS?** A specification for storing large files (like images/videos) exceeding the 16MB document limit.
26. **How to increase write performance?** Using sharding, optimizing indexes, and adjusting Write Concerns.
27. **How does MongoDB store data internally?** In BSON (Binary JSON) format.
28. **What is `$lookup`?** Performs a left outer JOIN to another collection in the same database.
29. **Difference between `$set` and `$push`?** `$set` updates/adds a field; `$push` appends an element to an array.
30. **How to handle schema validation?** Using JSON Schema validation rules at the collection level.
31. **What is `ObjectId`?** A 12-byte unique identifier assigned to the `_id` field.
32. **What are TTL indexes?** Time-To-Live indexes automatically delete documents after a certain time interval.
33. **What is `$unwind`?** Deconstructs an array field from the input documents to output a document for each element.
34. **How to perform text search?** Using text indexes and `$text` queries.
35. **What is a compound index?** An index on multiple fields.
36. **How to perform geospatial queries?** Using `2dsphere` indexes and `$geoWithin` / `$near`.
37. **What is `$out`?** Writes the aggregation pipeline result to a completely new collection.
38. **What is `$merge`?** Merges the aggregation pipeline result into an existing collection.
39. **How does MongoDB handle concurrency?** Using document-level locking and optimistic concurrency control.
40. **What is `$facet`?** Processes multiple aggregation pipelines within a single stage on the same set of input documents.
41. **What is `$redact`?** Restricts the contents of the documents based on information stored in the documents themselves.
42. **Advantages of MongoDB?** Scalability, flexibility (schemaless), high availability, and developer-friendly JSON format.
43. **Disadvantages of MongoDB?** High memory usage, steep learning curve for complex aggregations, no traditional relational constraints.
44. **How to enable authentication?** Start `mongod` with `--auth` and create users with specific RBAC roles.
45. **What is `$setIntersection`?** Returns common elements found in two or more arrays.
46. **What is `$setUnion`?** Merges arrays and removes duplicate values.
47. **What is `$setDifference`?** Returns elements present in the first array but not in the second.
48. **How to handle large datasets?** Sharding, proper indexing, and optimizing queries to return only needed fields.
49. **What is `$expr`?** Allows the use of aggregation expressions within standard query languages (like `find`).
50. **How to improve query performance?** Avoid collection scans via indexing, ensure queries are covered by indexes, and optimize pipelines.
51. **What is the WiredTiger storage engine?** The default engine since v3.2, offering document-level concurrency control, compression, and efficient memory usage.
52. **What is a Covered Query?** A query where all fields requested are part of an index, allowing MongoDB to return results directly from the index without examining documents.
53. **How to analyze an execution plan?** Append `.explain("executionStats")` to a query to view details like `totalDocsExamined` vs `nReturned`.
54. **Write Concern vs Read Concern?** Write Concern guarantees a write has propagated to X nodes; Read Concern controls the isolation level of data read (e.g., 'majority' ensures data won't roll back).
55. **What is the Oplog?** A special capped collection in Replica Sets that records all operations modifying data, used to sync secondary nodes.
56. **How does a Sharded Cluster architecture work?** It consists of Shards (data nodes), `mongos` (query routers), and Config Servers (metadata/routing info).
57. **What are Chunk Migrations?** The balancer moving chunks of data between shards to maintain an even distribution of data.
58. **`$lookup` vs `$graphLookup`?** `$lookup` is a standard left-outer join; `$graphLookup` performs recursive searches on a collection, useful for hierarchical/tree data.
59. **What are Time Series collections?** Optimized collections introduced in v5.0 designed specifically to store sequences of measurements over time with lower storage footprint.
60. **What is Client-Side Field Level Encryption (CSFLE)?** A feature allowing the driver to encrypt specific document fields before sending them to the database, ensuring the server never sees plaintext.

---

## 7. Mongoose

### Deep Dive Concepts
*   **ODM (Object Data Modeling):** Enforces schemas at the application level over MongoDB's schemaless nature.
*   **Schemas & Models:** Define data shape, types, required fields, and create models to interface with DB.
*   **Hooks (Middleware):** `pre` and `post` hooks for operations (e.g., hashing passwords before `save`).
*   **Population:** Allows referencing documents in other collections (similar to SQL Joins) natively in JS.

### Top 50 Mongoose Interview Questions

1. **What is Mongoose?** An ODM library for MongoDB and Node.js providing schema validation and query building.
2. **How to install Mongoose?** `npm install mongoose`.
3. **How to connect to MongoDB?** `mongoose.connect('mongodb://localhost:27017/mydb')`.
4. **What are schemas?** Definitions of the structure of documents, including fields, types, and validation rules.
5. **How to define a schema?** `const UserSchema = new mongoose.Schema({ name: String, age: Number });`.
6. **What is a Mongoose model?** A compiled constructor from a schema allowing queries and mutations.
7. **How to create a model?** `const User = mongoose.model('User', UserSchema);`.
8. **How to insert a document?** `await User.create({ name: 'John' });` or `new User({...}).save();`.
9. **How to retrieve all documents?** `User.find({})`.
10. **How to find a document by ID?** `User.findById(id)`.
11. **How to update a document?** `User.findByIdAndUpdate(id, { age: 35 }, { new: true });`.
12. **How to delete a document?** `User.findByIdAndDelete(id);`.
13. **What are middlewares (hooks)?** Functions running before (`pre`) or after (`post`) operations.
14. **How to add validation?** Use schema options like `required: true`, `min`, `max`, or custom validators.
15. **How to handle errors?** Standard `try-catch` blocks with `async/await` or `.catch()`.
16. **What is population?** Replacing specified paths in a document with referenced documents from other collections.
17. **How to perform population?** `.populate('author')`.
18. **What is a virtual field?** A computed property not stored in MongoDB but available in the JS object.
19. **How to define a virtual field?** `schema.virtual('fullName').get(function() { return this.firstName + ' ' + this.lastName; });`.
20. **What is a discriminator?** A schema inheritance mechanism for storing multiple models in the same collection.
21. **How to implement indexing?** `schema.index({ field: 1 })`.
22. **What are instance methods?** Custom functions attached to specific document instances via `schema.methods`.
23. **What are static methods?** Custom functions attached to the Model itself via `schema.statics`.
24. **Difference between `lean()` and normal queries?** `lean()` returns plain JS objects instead of heavy Mongoose documents (faster).
25. **What is `timestamps: true`?** Schema option that automatically adds `createdAt` and `updatedAt` fields.
26. **How to implement soft delete?** Add a `deleted: Boolean` field and filter by it, instead of physical deletion.
27. **What is `toJSON`?** A transformation method applied when documents are serialized to JSON (useful for hiding passwords).
28. **How to create a nested schema?** Define a schema and nest it inside a parent schema's field as an array or object.
29. **`findOneAndUpdate` vs `findByIdAndUpdate`?** Same internal logic, but one searches by a custom query and the other specifically by `_id`.
30. **How to use transactions?** Using `mongoose.startSession()`, `session.startTransaction()`, and passing `{ session }` to operations.
31. **What was `useFindAndModify: false`?** A legacy connection option to enforce modern MongoDB drivers for updates.
32. **How to handle connection events?** `mongoose.connection.on('connected', callback)`.
33. **What are aggregation pipelines in Mongoose?** Handled via `Model.aggregate([{ $match: {...} }])`.
34. **`find()` vs `aggregate()`?** `find` is for basic retrieval; `aggregate` allows complex multi-stage data processing.
35. **How to limit query results?** `.limit(10)`.
36. **What does `distinct()` do?** Retrieves all unique values of a specific field.
37. **How to count documents?** `.countDocuments({ condition: true })`.
38. **How to set default values?** Use `default: value` in the schema field definition.
39. **`validate` vs `pre('save')`?** `validate` checks rules before saving; `pre('save')` executes arbitrary logic before saving.
40. **How to sort query results?** `.sort({ createdAt: -1 })` (descending).
41. **What is a capped collection in Mongoose?** Define `{ capped: { size: 1024, max: 1000 } }` in schema options.
42. **How to handle relationships?** By storing references (ObjectIds) or embedding subdocuments.
43. **How to implement full-text search?** `schema.index({ content: 'text' })` and querying with `$text`.
44. **What is Mongoose auto-increment?** Requires a third-party plugin (like `mongoose-sequence`) to emulate SQL auto-increment behavior.
45. **`save()` vs `create()`?** `create()` instantiates and saves multiple docs at once; `save()` is called on a single instance.
46. **What is `.exec()`?** Explicitly executes the query and returns a true Promise, resulting in better stack traces.
47. **How to handle bulk operations?** `Model.bulkWrite([{ insertOne: {...} }, ...])`.
48. **How to prevent duplicate records?** Add `unique: true` to the schema field (creates a unique index).
49. **How to remove a field during an update?** Use the `$unset` operator in the update payload.
50. **`updateOne()` vs `updateMany()`?** `updateOne` applies changes to the first matched document; `updateMany` updates all matches.
51. **What is Optimistic Concurrency Control in Mongoose?** It uses the internal `__v` (versionKey) field to prevent lost updates when multiple clients modify the same document concurrently.
52. **`populate` vs Aggregation `$lookup` performance?** `populate` executes multiple queries and joins in Node.js (memory intensive); `$lookup` performs the join natively inside the MongoDB engine (faster for large datasets).
53. **What are Discriminators?** A schema inheritance mechanism enabling polymorphic data, storing differently structured documents in a single collection using a discriminator key (e.g., `type`).
54. **How do Mongoose Connection Pools work?** Mongoose maintains a pool of open sockets (default 100) to reuse connections instead of opening a new one per request, improving performance.
55. **Subdocuments vs Nested Paths?** Subdocuments are schemas inside schemas and have their own `_id` and middleware; Nested Paths are just nested objects without extra Mongoose features.
56. **Why use `lean()` for read-heavy operations?** It skips instantiating full Mongoose documents with getters/setters/methods, significantly reducing memory footprint and CPU usage.
57. **How to handle transaction retries?** Wrap transactions in a retry loop to handle transient `TransientTransactionError` or `UnknownTransactionCommitResult` exceptions.
58. **What is the `strict` schema option?** It prevents saving fields to the database that are not explicitly defined in the schema (defaults to true).
59. **How to create a sparse unique index?** `schema.index({ email: 1 }, { unique: true, sparse: true })` allows multiple documents to not have the field, but enforces uniqueness if the field exists.
60. **What is Mongoose Plugins?** Reusable logic/functions that can be applied to multiple schemas (e.g., adding `createdAt` and `updatedAt` behavior manually or soft-delete logic).

---

## 8. Testing

### Deep Dive Concepts
*   **Jest:** All-in-one framework by Facebook. Zero config, fast, built-in mocking, and snapshot testing.
*   **Supertest:** Library specifically for testing HTTP APIs natively.
*   **Spies vs Stubs vs Mocks:** 
    *   *Spy:* Wraps a function to track execution.
    *   *Stub:* Replaces a function with controlled behavior.
    *   *Mock:* Tracks calls AND replaces behavior.
*   **E2E vs Integration vs Unit:** Testing the full flow (E2E) vs combining modules (Integration) vs isolated functions (Unit).

### Top 60 Node.js Testing Interview Questions

1. **What is Testing?** Writing code to verify that application code works correctly under various conditions.
2. **What are the types of Testing?** Unit (isolated), Integration (combined), End-to-End/E2E (full flow).
3. **What is Unit Testing?** Testing individual functions or components in absolute isolation.
4. **What is Jest?** A JS testing framework with built-in assertions, mocking, and coverage reporting.
5. **Advantages of Jest?** Zero config, parallel execution, snapshot testing, and great React integration.
6. **What is a Test Suite?** A collection of related test cases grouped by `describe()`.
7. **What is a Test Case?** An individual test checking a specific behavior, defined by `test()` or `it()`.
8. **What is an Assertion?** A statement checking if a condition is true, using `expect()`.
9. **What is a Matcher?** A function comparing actual vs expected values (`toEqual`, `toBe`).
10. **What is a Mock?** A fake implementation replacing a real function/module to isolate code.
11. **Mock vs Stub?** Mock tracks interactions; Stub provides predefined responses without deep tracking.
12. **What is Sinon.js?** A library providing standalone spies, stubs, and mocks.
13. **What is a Spy?** Wraps a function to track calls, arguments, and returns without changing behavior.
14. **What is a Stub?** Replaces a real function with a controlled, hardcoded implementation.
15. **Spy vs Stub?** Spy observes; Stub replaces.
16. **What is Mocha?** A flexible JS testing framework that relies on external assertion libraries.
17. **What is Chai?** An assertion library providing BDD/TDD style assertions (`expect`, `should`).
18. **Mocha vs Jest?** Jest is all-in-one; Mocha requires separate assertion/mocking libraries.
19. **What is Supertest?** A library for testing HTTP APIs by providing a fluent interface for making requests.
20. **How to test async functions in Jest?** Return a Promise, use `async/await`, or use the `done()` callback.
21. **What is a Snapshot Test?** Compares UI/Object output against a previously saved reference file to detect unintended changes.
22. **Drawbacks of Snapshot Testing?** False positives, large unreadable snapshots, and maintenance overhead.
23. **What is Test Coverage?** A metric measuring the percentage of codebase executed by tests.
24. **What is Code Coverage?** Detailed tracking of lines, branches, and functions hit by tests.
25. **What are Coverage Metrics?** Line, Branch, Function, and Statement coverage.
26. **What is 100% Code Coverage?** All executable code is tested, but it does *not* guarantee all logical bugs are caught.
27. **What is a `beforeEach` Hook?** Code that runs before every single test case in a suite.
28. **What is an `afterEach` Hook?** Code that runs after every test case (ideal for cleanup).
29. **What is `beforeAll` Hook?** Code that runs once before all tests in a file begin (e.g., DB connection).
30. **What is `afterAll` Hook?** Code that runs once after all tests finish (e.g., DB disconnection).
31. **What is Integration Testing?** Checking how multiple components or modules work together.
32. **How to test database operations?** Use test databases, in-memory DBs (like SQLite), or mock the DB layer.
33. **What is an In-Memory Database?** A DB storing data purely in RAM for blazing fast test execution.
34. **What is Database Seeding in Tests?** Populating the test database with initial mock data before running tests.
35. **How to test API endpoints?** Use `Supertest` to simulate HTTP requests and verify responses.
36. **How to mock HTTP requests?** Use `nock` or `jest.mock()` to intercept external HTTP calls.
37. **What is `nock`?** An HTTP mocking library for Node.js tests.
38. **What is `jest.mock()`?** Hoists and replaces a module with a mock implementation before tests run.
39. **How to mock environment variables?** Override `process.env.VAR` manually or use `jest-dotenv`.
40. **What is TDD (Test-Driven Development)?** Writing tests *before* writing the implementation code (Red-Green-Refactor).
41. **What is BDD (Behavior-Driven Development)?** Using human-readable syntax (`describe`/`it`) to align tests with business requirements.
42. **What is End-to-End (E2E) Testing?** Testing the complete application workflow from the user's perspective.
43. **Tools for E2E Testing?** Puppeteer, Playwright, Cypress.
44. **What is Puppeteer?** A Node.js library controlling headless Chrome for browser automation and E2E testing.
45. **What is Playwright?** A modern browser automation library supporting Chrome, Firefox, and Safari natively.
46. **How to organize tests?** Group via `describe()`, use descriptive names, and segregate unit/integration/E2E folders.
47. **What is CI (Continuous Integration) Testing?** Automatically running test suites on code commits (GitHub Actions) to catch regressions.
48. **What is the AAA Pattern?** Arrange (setup), Act (execute), Assert (verify).
49. **Best practices for testing?** Test behavior not implementation, isolate dependencies, name tests clearly.
50. **Test Pyramid vs Testing Trophy?** Pyramid: Many unit, some integration, few E2E. Trophy: Focuses heavily on Integration tests as the sweet spot.
51. **How to handle test timeouts?** Use `jest.setTimeout(ms)` or utilize fake timers.
52. **What is `jest.useFakeTimers()`?** Replaces native OS timers (`setTimeout`) with controllable mock timers to speed up tests.
53. **How to test promises in Jest?** `await expect(promise).resolves.toEqual(value)`.
54. **How to test error cases?** `expect(() => fn()).toThrow()` or `await expect(promise).rejects.toThrow()`.
55. **What is Performance Testing?** Testing response times and resource usage under load.
56. **What is Load Testing?** Simulating high traffic using tools like Artillery, k6, or JMeter.
57. **How to test event emitters?** Use Jest mock functions to verify if event listeners trigger with correct arguments.
58. **Shallow vs Deep equality?** Shallow compares memory references; Deep compares all nested primitive values (`toEqual()`).
59. **How to skip tests?** Use `test.skip()` or `it.skip()`. Focus a test using `test.only()`.
60. **How to isolate tests completely?** Mock external dependencies, clear mocks with `jest.clearAllMocks()` in `afterEach`.
61. **Mocking ES Modules vs CommonJS in Jest?** CommonJS uses `jest.mock()`; ES Modules require experimental support or using `jest.unstable_mockModule()` with top-level await.
62. **How to test Race Conditions?** Simulate concurrent requests using `Promise.all()` to fire multiple operations simultaneously and verify the database/state integrity.
63. **What do Coverage Reports miss?** They track execution of lines, but completely miss testing for correct business logic, edge cases, or handling specific payloads.
64. **How does Supertest work under the hood?** It creates a raw HTTP server from the Express `app` instance, binds it to a random ephemeral port, sends the request, and closes the port.
65. **Best practices for Database Setup/Teardown?** Always use a separate test database. Truncate tables or drop collections in `beforeEach` or `afterEach` to ensure tests don't pollute each other's state.
66. **What is Mutation Testing?** A technique where small mutations are deliberately introduced into the source code to check if your test suite catches the errors (e.g., Stryker Mutator).
67. **How to mock the Date object?** `jest.useFakeTimers().setSystemTime(new Date('2024-01-01'))` freezes time to prevent tests relying on the current date from failing later.
68. **What is a Flaky Test?** A test that sometimes passes and sometimes fails without code changes (usually due to race conditions, poor isolation, or network timeouts).
69. **How to handle WebSockets in Jest?** Extract the Socket logic and mock the event emitter, or use a tool like `socket.io-client` against a local test server.
70. **What is the Factory Pattern in testing?** Using tools like `factory-bot` or Fishery to generate reliable, customizable mock objects instead of hardcoding fixtures everywhere.

---
*Good luck with your interview preparation! Remember to deeply understand the "why" behind these answers, as interviewers love to probe further into underlying concepts.*
