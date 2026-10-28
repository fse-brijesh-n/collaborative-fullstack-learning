# Complete React & Full-Stack Development Handbook  
**Detailed Table of Contents with Subfolder Projects**

Each subfolder listed below is a **React Vite project** (except where noted) that covers the specific concepts of that module. The projects are designed to be hands-on and incremental, building a strong foundation from prerequisites to full-stack development.

## 🔀 Engineering Workflow & Git Collaboration (Company-Grade)

> Every module's project MUST follow this professional workflow.

### 1. Repository Setup (Fork & Clone)

| Step | Command | Purpose |
|------|---------|---------|
| Fork | GitHub UI → "Fork" | Create personal copy |
| Clone | `git clone git@github.com:<you>/fullstack-roadmap.git` | Copy to local |
| Add upstream | `git remote add upstream git@github.com:org/fullstack-roadmap.git` | Track original |
| Verify | `git remote -v` | Confirm remotes |
| Sync main | `git fetch upstream && git checkout main && git merge upstream/main` | Stay updated |

### 2. Branch Strategy

| Branch | Naming Convention | Purpose |
|--------|------------------|---------|
| `main` | `main` | Production-ready, protected |
| `develop` | `develop` | Integration branch |
| Feature | `feature/JIRA-123-user-auth` | New features |
| Bugfix | `bugfix/JIRA-456-login-error` | Non-critical fixes |
| Hotfix | `hotfix/JIRA-789-prod-down` | Critical production |
| Release | `release/v1.2.0` | Release preparation |
| Chore | `chore/update-deps` | Maintenance |
| Docs | `docs/api-readme` | Documentation |
| Refactor | `refactor/service-layer` | Code cleanup |
| Design | `design/figma-login-flow` | Design assets |

### 3. Commit Conventions (Conventional Commits)

| Type | Description | Example |
|------|-------------|---------|
| `feat` | New feature | `feat(auth): add JWT refresh token` |
| `fix` | Bug fix | `fix(cart): resolve null pointer` |
| `docs` | Documentation | `docs(readme): update setup steps` |
| `style` | Formatting | `style: apply prettier` |
| `refactor` | Code refactor | `refactor(user): extract mapper` |
| `perf` | Performance | `perf(query): add index hint` |
| `test` | Tests | `test(auth): add login tests` |
| `build` | Build system | `build: bump spring boot to 3.3` |
| `ci` | CI config | `ci: add sonar step` |
| `chore` | Maintenance | `chore: update .gitignore` |
| `revert` | Revert commit | `revert: feat(auth) ...` |
| `design` | Design assets | `design: add login wireframes` |

### 4. Code Review & Approval

| Step | Actor | Action |
|------|-------|--------|
| 1 | Author | Open PR, assign reviewers |
| 2 | CI | Run build, tests, lint, security scan |
| 3 | Reviewer | Review code, comment, request changes |
| 4 | Designer | Review UI/UX (if applicable) |
| 5 | Author | Address feedback, push fixes |
| 6 | Reviewer | Approve |
| 7 | Maintainer | Merge |

### 5. Review Rules

| Rule | `main` | `develop` |
|------|--------|-----------|
| Require PR | ✅ | ✅ |
| Required approvals | 2 | 1 |
| Design approval | ✅ (UI) | ✅ (UI) |
| Dismiss stale approvals | ✅ | ✅ |
| Require status checks | ✅ | ✅ |
| Require conversation resolution | ✅ | ✅ |
| Require signed commits | ✅ | ❌ |
| Require linear history | ✅ | ✅ |

### 6. Merge Strategies

| Strategy | When to Use | Command |
|----------|-------------|---------|
| Squash & Merge | Feature branches (default) | `gh pr merge --squash` |
| Rebase & Merge | Linear history preferred | `gh pr merge --rebase` |
| Merge Commit | Preserve history | `gh pr merge --merge` |

### 7. Release & Versioning (SemVer)

| Version | Meaning | Example |
|---------|---------|---------|
| MAJOR | Breaking change | `1.0.0 → 2.0.0` |
| MINOR | New feature | `1.0.0 → 1.1.0` |
| PATCH | Bug fix | `1.0.0 → 1.0.1` |

---
# Frontend : React.js
---

## 📚 Module 00 — Design Thinking & Figma

| Sub-Module | Topics |
|------------|--------|
| 00-01 Design Thinking | Empathize, Define, Ideate, Prototype, Test, Double Diamond, Design Sprint |
| 00-02 UX Research | User Interviews, Surveys, Personas, Empathy Maps, Journey Maps, User Stories |
| 00-03 Information Architecture | Sitemaps, User Flows, Card Sorting, Navigation Patterns |
| 00-04 Wireframing | Low-Fidelity, Mid-Fidelity, High-Fidelity, Sketching, Crazy 8s |
| 00-05 Figma Fundamentals | Frames, Auto Layout, Constraints, Components, Variants, Styles |
| 00-06 Figma Advanced | Design Tokens, Component Sets, Variables, Modes, Prototyping, Smart Animate |
| 00-07 Design Systems | Atomic Design, Tokens, Component Library, Documentation, Storybook |
| 00-08 Prototyping | Clickable Prototypes, Micro-interactions, Transitions, User Testing |
| 00-09 Handoff | Dev Mode, Inspect, Zeplin, Specs, Redlines, Asset Export |
| 00-10 Accessibility Design | Color Contrast (WCAG), Focus States, Touch Targets, Inclusive Design |
| 00-11 Visual Design | Typography, Color Theory, Spacing, Grid Systems, Hierarchy |
| 00-12 Design Critique | Heuristics (Nielsen), Feedback, Iteration, A/B Testing |

**Project:** End-to-End Design of a SaaS Dashboard (Research → Wireframe → Hi-Fi → Prototype → Handoff)

---

---

## 📚 Module 01 — Internet & Web Fundamentals

| Sub-Module | Topics |
|------------|--------|
| 01-01 How Internet Works | Client-Server, DNS, HTTP/HTTPS, HTTP/2, HTTP/3 (QUIC), TCP/IP, Request-Response, Status Codes, CDN basics |
| 01-02 Web Browsers | Browser Architecture, Rendering Engine, V8, Browser Storage, DevTools, Lighthouse, Core Web Vitals |
| 01-03 Web Security | HTTPS/TLS, CORS, CSP, XSS, CSRF, SQL Injection, Same-Origin, OWASP Top 10 |
| 01-04 Web Protocols | REST, GraphQL, gRPC, WebSocket, SSE, WebRTC |
| 01-05 Version Control | Git Internals, Branching, Merge vs Rebase, Cherry-pick, Bisect, Conventional Commits |
| 01-06 Domain & Hosting | Domain Registrar, DNS Records, SSL/TLS Certificates, CDN, Reverse Proxy |

**Project:** Personal Portfolio with Git Workflow (Fork → PR → Review → Merge)

---

---

## Module 02: Prerequisites · HTML · CSS · JavaScript · Projects  
*(These projects use React Vite as a playground to practice foundational web technologies within a component environment.)*

| Subfolder | Description |
|-----------|-------------|
| `02-01-html-basics` | Semantic HTML, forms, tables, multimedia, accessibility attributes. |
| `02-02-css-fundamentals` | Selectors, box model, units, positioning, display, z-index. |
| `02-03-css-flexbox-grid` | Flexbox and CSS Grid layouts with practical examples. |
| `02-04-css-responsive-design` | Media queries, mobile-first design, fluid typography, viewport units. |
| `02-05-css-animations-transitions` | CSS transitions, keyframe animations, transforms. |
| `02-06-js-fundamentals` | Variables, data types, operators, control flow, loops. |
| `02-07-js-functions-scope` | Function declarations, expressions, arrow functions, scope, closures. |
| `02-08-js-arrays-objects` | Array methods, object manipulation, destructuring, spread/rest. |
| `02-09-js-dom-manipulation` | DOM API, selecting elements, events, creating/removing nodes (using `useRef`/`useEffect` for demonstration). |
| `02-10-js-async` | Callbacks, promises, async/await, fetch, error handling. |
| `02-11-js-modules` | ES modules, import/export, default and named exports. |
| `02-12-prereq-projects` | Small integrated projects: todo list, calculator, quiz app (built with vanilla JS concepts inside React). |

---

---

## Module 03: React Setup  

| Subfolder | Description |
|-----------|-------------|
| `001-older-way-by-nodejs-team-create-react-project_By_hand_manual` | **Manual React Setup (Older Way)** – Create a React project from scratch: install React, ReactDOM, Babel, Webpack manually; configure `webpack.config.js`, `.babelrc`; understand the underlying tooling. |
| `002-official-way-by-react-js-team-using-npm-npx` | **Create React App (Official Way)** – Use `npx create-react-app` to bootstrap a project; explore CRA structure, scripts, and default configuration. |
| `003-latest-way-by-vite-team-using-npm-vite` | **Vite Setup (Latest Way)** – Use `npm create vite@latest` to set up a React project with Vite; understand the speed benefits and modern configuration. |
| `03-01-vite-setup` | Creating a Vite project, folder structure, `main.jsx`, `App.jsx`, dev server. |
| `03-02-jsx-basics` | JSX syntax, embedding expressions, attributes, self-closing tags, comments. |
| `03-03-components-intro` | Functional components, importing/exporting components, rendering. |
| `03-04-reactdom-render` | `ReactDOM.createRoot`, `render`, `StrictMode`, mounting. |
| `03-05-project-structure` | Organizing files, components folder, assets, public folder. |

---

This now includes the three historical/setup approaches at the top, ensuring learners understand the evolution and different ways to start a React project.

---

---
 
## Module 04: React Fundamentals

| Subfolder | Description |
|-----------|-------------|
| `04-00-jsx` | Deep dive into JSX rendering, JS expressions, conditional rendering, attributes, arrays, `.map()`, lists. |
| `04-01-components-rendering` | Rendering React components, component tree, root component, importing/exporting components. |
| `04-02-props-parent-to-child-component` | Passing data to components via props, destructuring props, prop types basics. |
| `04-03-use-state-hook` | Introduction to `useState` hook, initializing and updating local state. |
| `04-04-event-handling-basics` | Basic React event handling with `onClick`, `onChange`, `onSubmit`, event handler functions, and events with state. |
| `04-05-value-child-cmpnt-fun-var-pass-as-props` | Passing values, child components, functions, and variables as props; callback props. |
| `04-06-conditional-rendering` | Conditional rendering with `if`/`else`, ternary operators, logical `&&`, returning `null`. |
| `04-07-functional-components` | Deep dive into functional components, default props, `props.children`. |
| `04-08-state-basics` | `useState` in depth: batching behavior, functional updates, object/array state. |
| `04-09-rendering-lists` | Rendering arrays with `.map()`, importance of keys, filtering/sorting lists. |
| `04-10-fragments` | `React.Fragment`, shorthand `<>`, avoiding extra DOM nodes. |
| `04-11-composition` | `props.children`, composition vs inheritance, slots pattern. |
| `04-12-props-validation` | PropTypes, defaultProps, type checking for props. |
| `04-13-form` | Handling forms in React, controlled and uncontrolled components, form state, input fields, `textarea`, `select`, checkbox, radio buttons, form submission, validation, and resetting forms. |
| `04-14-useEffect` | Deep dive into the `useEffect` hook, side effects, dependency arrays, cleanup functions, effect execution, fetching data, and avoiding unnecessary effects. |
| `04-15-json` | Working with JSON data in React, JSON structure, `JSON.parse()`, `JSON.stringify()`, handling API JSON responses, transforming JSON data, and rendering JSON data in components. |
| `04-16-mock-rest-backend-fetch` | Working with **JSONPlaceholder** for consuming online mock REST APIs, practicing GET/POST/PUT/PATCH/DELETE requests, handling API responses, and testing React API integration; working separately with **JSON Server** to create and manage a local mock REST backend using `db.json`, defining custom resources and REST endpoints, serving JSON data, implementing and testing GET/POST/PUT/PATCH/DELETE requests, using query parameters for filtering and searching, and practicing complete mock API integration using the **Fetch API** without a real backend. |
| `04-17-axios` | Making API requests in React using **Axios**, including GET/POST/PUT/PATCH/DELETE requests, request configuration, headers, request bodies, query and path parameters, handling responses, loading and error states, and integrating REST APIs with React components. |
| `04-18-styling-css-tailwind` | Styling React applications with CSS and Tailwind CSS, CSS fundamentals, selectors, box model, layout, Flexbox, Grid, responsive design, reusable styles, Tailwind utility classes, responsive utilities, states, component styling, and building responsive React UIs. |
| `Project: Learning & Project Repository Manager` | A generic application to manage technologies, courses, modules, submodules, topics, code folders, exercises, projects, and progress. |

```
UI:
┌─────────────────────────────────────────────────────────┐
│ Learning & Project Repository             + Add         │
├─────────────────────────────────────────────────────────┤
│ Search...          Technology ▼       Status ▼          │
├─────────────────────────────────────────────────────────┤
│                                                         │
│ Java                                                    │
│ ├── Core Java                                           │
│ │   ├── OOP                         ✓Completed          │
│ │   ├── Collections                 ✓Completed          │
│ │   └── Multithreading              ●In Progress        │
│ │                                                       │
│ Spring Boot                                             │
│ ├── Spring Core                                         │
│ ├── Spring MVC                                          │
│ └── Spring Security                                     │
│                                                         │
│ React                                                   │
│ ├── Fundamentals                                        │
│ └── API Integration                                     │
│                                                         │
└─────────────────────────────────────────────────────────┘
```
---

This structure now includes basic event handling before advanced prop-passing concepts, providing a granular progression from JSX fundamentals through components, props, state, events, conditional rendering, lists, composition, and props validation.


---

---

## Module 05: Events & DOM 
*(Expanded with additional subfolders for deeper coverage)*

| Subfolder | Description |
|-----------|-------------|
| `05-01-event-handling` | Synthetic events, `onClick`, `onChange`, event object basics. |
| `05-02-event-binding` | Arrow functions in render, binding in class components (brief). |
| `05-03-passing-arguments` | Passing parameters to event handlers. |
| `05-04-form-events-handling` | `onSubmit`, `onChange`, controlled vs uncontrolled inputs. |
| `05-05-keyboard-mouse-events` | `onKeyDown`, `onKeyUp`, `onMouseEnter`, `onMouseLeave`. |
| `05-06-refs-basics` | `useRef` for DOM access, reading values, focusing elements. |
| `05-07-uncontrolled-components` | Using refs to read form values on submit. |
| `05-08-event-propagation` | Event bubbling, capturing, `stopPropagation`, `preventDefault`, event delegation. |
| `05-09-event-object-deep-dive` | SyntheticEvent properties, `target` vs `currentTarget`, event pooling (legacy), `persist()`. |
| `05-10-keyboard-event-handler` | Advanced keyboard events: key combinations, `key` vs `keyCode`, global keyboard shortcuts. |
| `05-11-dom-manipulation-useref` | Advanced `useRef` for DOM manipulation: measuring elements, managing focus, timers, imperative APIs. |

---

This expansion provides a more granular progression from basic event handling to advanced topics like propagation, event object internals, and extensive DOM manipulation with refs.

---

---

## Module 06: Components & Lifecycle 
*(Original topics plus added subfolders for class-based CRUD, functional lifecycle, and performance optimizations mimicking shouldComponentUpdate)*

| Subfolder | Description |
|-----------|-------------|
| `06-01-class-components` | Class syntax, `this.state`, `this.setState`, rendering. |
| `06-02-lifecycle-methods` | `componentDidMount`, `componentDidUpdate`, `componentWillUnmount`. |
| `06-03-useeffect-lifecycle` | Mimicking lifecycle with `useEffect` (mount, update, unmount). |
| `06-04-cleanup-effects` | Cleanup functions, subscriptions, timers. |
| `06-05-error-boundaries` | Class-based error boundary component, catching errors. |
| `06-06-higher-order-components` | HOC pattern, enhancing components. |
| `06-07-render-props` | Render prop pattern, sharing logic. |
| `06-08-class-components-crud-app` | **Class Component CRUD App** – Build a complete Task Manager app using class components, state, lifecycle methods, and forms. |
| `06-09-functional-components-lifecycle` | **Functional Lifecycle Deep Dive** – Explore mount and update phases in functional components using `useEffect` and `useLayoutEffect` with various dependency arrays. |
| `06-10-useeffect-did-mount-update` | **useEffect as componentDidMount & componentDidUpdate** – Simulate class lifecycle methods with `useEffect` dependency arrays, including infinite loop pitfalls. |
| `06-11-component-should-update-usememo` | **useMemo for shouldComponentUpdate** – Use `useMemo` to memoize computed values and prevent unnecessary recalculations, optimizing render performance. |
| `06-12-component-should-update-usecallback` | **useCallback for shouldComponentUpdate** – Use `useCallback` to stabilize function references and prevent unnecessary child re-renders, akin to shouldComponentUpdate. |

---

This expanded module covers both class and functional component lifecycles, plus practical patterns for optimizing component updates with memoization hooks.

---

---

## Module 07: Hooks (Real-World Focused)
*(Filtered to include only hooks that are commonly used in production React applications)*

| Subfolder | Description |
|-----------|-------------|
| `07-01-usestate-deep-dive` | The core state hook — lazy init, functional updates, object/array state. |
| `07-02-useeffect-deep-dive` | Side effects, data fetching, subscriptions, cleanup, dependency arrays. |
| `07-03-usecontext` | Consume context values; avoid prop drilling in real apps. |
| `07-04-usereducer` | Manage complex state transitions with actions (e.g., forms, carts). |
| `07-05-usememo-usecallback` | Prevent expensive recalculations and stabilize function references. |
| `07-06-useref-deep-dive` | Access DOM nodes, keep mutable values, store previous values. |
| `07-07-uselayouteffect` | Run effects synchronously after DOM mutations; measure layout, avoid flicker. |
| `07-08-useimperativehandle` | Expose imperative methods from child components (e.g., focus, scroll). |
| `07-09-useid` | Generate stable unique IDs for form inputs and accessibility attributes. |
| `07-10-usetransition` | Mark non-urgent updates to keep UI responsive during heavy rendering. |
| `07-11-usedeferredvalue` | Defer rendering of a value (e.g., search results) to keep inputs fast. |
| `07-12-usesyncexternalstore` | Subscribe to external stores (Redux, Zustand, browser APIs) safely. |
| `07-13-rules-of-hooks` | Understand and enforce hook rules to avoid bugs. |
| `07-14-custom-hooks-intro` | Build reusable hooks; share logic across components. |
| `07-15-use-previous` | Track the previous value of state or props (useful in effects). |
| `07-16-use-local-storage` | Persist state to `localStorage` and sync across tabs. |
| `07-17-use-debounce-throttle` | Limit how often a function runs (search inputs, scroll handlers). |
| `07-18-use-on-click-outside` | Detect clicks outside an element — close modals, dropdowns, popovers. |
| `07-19-use-event-listener` | Attach and clean up event listeners declaratively. |
| `07-20-use-media-query` | Respond to CSS media queries in JavaScript for responsive layouts. |
| `07-21-use-window-size` | Track viewport width/height for responsive components. |
| `07-22-use-fetch` | Simple data fetching with loading, error, and cancellation. |
| `07-23-use-form` | Manage form state, validation, and submission easily. |
| `07-24-use-toggle` | Simple boolean state toggling (show/hide, open/close). |
| `07-25-use-interval-timeout` | Declarative timers that clean up automatically. |
| `07-26-use-hover` | Track hover state of an element (tooltips, effects). |
| `07-27-use-document-title` | Update the browser tab title dynamically. |

---

**Removed hooks (rarely used in production):**  
- `useDebugValue` — only for custom hook library authors during development.  
- `useInsertionEffect` — extremely niche; intended only for CSS-in-JS library internals.  
- `useHistory` (custom undo/redo) — too specific; not generally needed in typical apps.

This list focuses on hooks you will actually encounter and use in day-to-day React development, ensuring every topic is practical and immediately applicable.

---

---

## Module 08: Advanced State  
*(Renamed folder slugs and descriptions to be more meaningful, simple, and reflect real-world usage)*

| Subfolder | Description |
|-----------|-------------|
| `08-01-shared-state-lifting-up` | **Lifting State Up** – Share state between sibling components by moving it to their common parent (real use: synced inputs, cart count). |
| `08-02-global-state-context-reducer` | **Context + useReducer for Global State** – Combine Context API and reducer to manage app-wide state (real use: theme, user, cart). |
| `08-03-normalizing-state-data` | **State Normalization** – Store data in flat structures keyed by ID to avoid duplication and simplify updates (real use: lists of entities like posts, users). |
| `08-04-immutable-update-patterns` | **Immutable Updates for Objects & Arrays** – Safely update nested state using spread, map, filter without mutating (real use: adding/removing items in arrays). |
| `08-05-immer-simplify-immutability` | **Immer for Simpler Immutable Updates** – Use the Immer library to write mutating-like syntax while producing immutable updates (real use: complex nested state). |
| `08-06-url-state-search-params` | **URL Search Params as State** – Use `useSearchParams` to read/write query parameters; share state via URL (real use: filters, pagination, shareable links). |
| `08-07-server-state-react-query` | **Server State with React Query** – Fetch, cache, and synchronize server data; handle loading/error/mutations (real use: API data that changes on server). |
| `08-08-state-machines-xstate` | **Finite State Machines with XState** – Model complex UI states with explicit transitions (real use: multi-step forms, onboarding, complex UI flows). |

Now every folder name clearly states its purpose, making it easier to understand what real-world problem it solves.

---

---

## Module 09: Forms

| Subfolder | Description |
|-----------|-------------|
| `09-01-controlled-forms` | Controlled inputs, text, select, checkbox, radio. |
| `09-02-uncontrolled-forms` | Uncontrolled inputs, `defaultValue`, refs. |
| `09-03-form-validation` | Manual validation, error messages, validation on submit. ,joi |
| `09-04-react-hook-form` | Using React Hook Form library. |
| `09-05-formik` | Using Formik library. |
| `09-06-custom-form-hooks` | Building a custom `useForm` hook. |
| `09-07-dynamic-forms` | Adding/removing fields dynamically. |
| `09-08-file-upload` | File input, preview, uploading with FormData. |
| `09-09-multi-step-forms` | Wizard pattern, step navigation, state per step. |

---

---

## Module 10: API Integration

| Subfolder | Description |
|-----------|-------------|
| `10-01-fetch-api` | Fetching data with `fetch` in `useEffect`, loading/error. |
| `10-02-axios` | Axios setup, interceptors, base URL. |
| `10-03-loading-error-states` | Handling loading, error, success UI states. |
| `10-04-abort-controller` | Cancelling requests, cleanup. |
| `10-05-react-query` | React Query for data fetching, caching, mutations. |
| `10-06-swr` | SWR library for data fetching. |
| `10-07-graphql-intro` | Apollo Client, queries, mutations. |
| `10-08-websockets` | Real-time data with WebSockets (e.g., Socket.IO client). |

---

---

## Module 11: React Router  
*(Expanded with additional focused subfolders covering all key routing concepts)*

| Subfolder | Description |
|-----------|-------------|
| `11-01-basic-routing` | `BrowserRouter`, `Routes`, `Route`, `Link`. |
| `11-02-nested-routes` | Nested routes, `Outlet`, layout routes. |
| `11-03-route-params` | `useParams`, dynamic route segments. |
| `11-04-navigation` | `useNavigate`, `useLocation`, `NavLink` active styles. |
| `11-05-query-params` | `useSearchParams`, reading/writing query strings. |
| `11-06-protected-routes` | Route guards, redirect if not authenticated. |
| `11-07-lazy-loading-routes` | Code splitting with `React.lazy`, `Suspense`. |
| `11-08-404-handling` | Catch-all route, custom 404 page. |
| `11-09-route-transitions` | Animating route changes with Framer Motion. |
| `11-10-react-router-dom-anchor-vs-create-browser-router` | Compare `<a>` tags vs `createBrowserRouter` and `RouterProvider`; understand full router setup. |
| `11-11-react-router-link` | Deep dive into `Link` component: internal navigation, state passing, replacement behavior. |
| `11-12-react-router-navlink` | `NavLink` for active styles, `className` function, `end` prop for exact matching. |
| `11-13-react-router-useparam-route-parameter` | Using `useParams` to read dynamic route parameters; multiple params, nested params. |
| `11-14-react-router-uselocation-query-parameter` | Using `useLocation` to read query strings; parsing with `URLSearchParams`. |
| `11-15-react-router-usenavigate` | Programmatic navigation with `useNavigate`; redirects, history stack, `replace`. |
| `11-16-react-nested-router-outlet-to-child-route-renders-in-parent` | Nested routes with `Outlet`; rendering child routes inside parent layout; index routes. |
| `11-17-react-router-not-found-route` | Dedicated 404 route with `path="*"`; custom not-found component; nested 404s. |
| `11-18-form-handling-with-route` | Submitting forms and navigating based on results; combining form actions with routing. |
| `11-19-react-router-browser-router` | Deep dive into `BrowserRouter` configuration, basename, history, and server requirements. |

This comprehensive module now covers every fundamental and advanced React Router concept with dedicated hands-on projects, ensuring no topic is missed.

---

---

## Module 12: Authentication & Authorization (Simplified)  
*(Rewritten with simple, clear folder names and descriptions for real-world use)*

| Subfolder | Description |
|-----------|-------------|
| `12-01-login-jwt` | User logs in, gets a token, and we send it with every request. |
| `12-02-route-guards` | Protect pages so only logged-in users can see them. |
| `12-03-role-based-access` | Show or hide UI based on user role (admin, editor, regular user). |
| `12-04-token-refresh` | Keep user logged in by silently refreshing the token when it expires. |
| `12-05-social-login` | Sign in with Google / GitHub accounts. |
| `12-06-password-reset` | Send reset link via email, let user set a new password. |
| `12-07-user-session-context` | Store the logged-in user data in a global context so any component can access it. |

This version uses plain language and focuses on what each part does in a typical app.

---

---

## Module 13: State Management  
*(Redux Basics and Redux Toolkit broken down into focused, real-world subfolders)*

| Subfolder | Description |
|-----------|-------------|
| `13-01-redux-store-create` | Create a Redux store — the single source of truth for your app state. |
| `13-02-redux-actions` | Define action types and action creators — what happened in your app. |
| `13-03-redux-reducers` | Write reducers to update state immutably when actions are dispatched. |
| `13-04-redux-dispatch` | Dispatch actions from UI events; see how state changes flow through the store. |
| `13-05-redux-connect` | Use `connect` in class components to map state and dispatch to props. |
| `13-06-redux-toolkit-setup` | Configure the store with `configureStore` — modern Redux setup with sensible defaults. |
| `13-07-redux-toolkit-slice` | Use `createSlice` to define reducers and actions in one place — less boilerplate. |
| `13-08-redux-toolkit-hooks` | Use `useSelector` and `useDispatch` in functional components to read and update state. |
| `13-09-redux-toolkit-async-thunks` | Handle API calls and async logic with `createAsyncThunk`. |
| `13-10-rtk-query` | Data fetching and caching built into Redux Toolkit — automatic loading/error states. |
| `13-11-zustand` | Tiny, fast state library — simple store, no boilerplate. Great for small/medium apps. |
| `13-12-jotai` | Atomic state — independent pieces of state that compose easily. Good for React-first granular state. |
| `13-13-recoil` | Facebook's state library using atoms and selectors — less common now, but similar to Jotai. |
| `13-14-mobx` | Observable-based state — automatic tracking of what changed. Use if you like reactive, non-functional style. |
| `13-15-context-vs-redux` | When to use built-in Context vs a full state library — compare performance, complexity, and real-world scenarios. |

Now Redux is broken into individual concepts, making it easier to learn step by step and build real projects.

---

---

## Module 14: Styling

| Subfolder | Description |
|-----------|-------------|
| `14-01-css-modules` | Scoped CSS with CSS Modules. |
| `14-02-styled-components` | CSS-in-JS with Styled Components. |
| `14-03-emotion` | Emotion library for CSS-in-JS. |
| `14-04-tailwind-css` | Utility-first CSS with Tailwind. |
| `14-05-sass` | Sass preprocessor, variables, mixins. |
| `14-06-css-in-js-comparison` | Comparing different CSS-in-JS libraries. |
| `14-07-ui-libraries` | Material-UI, Ant Design, Chakra UI usage. |
| `14-08-theming-dark-mode` | Theme context, CSS variables, dark mode toggle. |

---
# Backend : Express.js
---

## 📚 Module 1 — Node.js

| Sub-Module | Topics |
|------------|--------|
| 01-01 Fundamentals | Architecture, V8, Event Loop, Non-Blocking I/O, npm, package.json |
| 01-02 Core Modules | fs, path, os, http, https, events, stream, crypto, buffer, worker_threads, child_process |
| 01-03 Async | Callbacks, Promises, async/await, EventEmitter, Streams (Readable/Writable/Transform) |
| 01-04 APIs | File System, HTTP Server, Env Vars, Process, Clustering, Signal Handling |
| 01-05 Performance | Profiling, Diagnostics, Memory Leaks, perf_hooks |

**Project:** CLI Tool & HTTP Server

---
## 📚 Module 2 — MongoDB

| Sub-Module | Topics |
|------------|--------|
| 02-01 Fundamentals | NoSQL, Documents, Collections, BSON, Shell, CRUD |
| 02-02 Querying | Operators, Projection, Sort, Pagination, Aggregation, Map-Reduce |
| 02-03 Modeling | Embedded vs Referenced, Patterns, Relationships, Denormalization |
| 02-04 Indexing | Types, Compound, Text, Geospatial, TTL, Explain |
| 02-05 Mongoose | Schemas, Models, Validation, Middleware, Population, Virtuals |
| 02-06 Advanced | ACID Transactions, Replica Sets, Sharding, Change Streams, Time Series |

**Project:** E-Commerce Backend (Node + MongoDB)
---

## 📚 Module 3 — Express.js

> **3.1 → 3.9** are major phases.  
> Each `03-xx` is a sub-module and can be built as a mini-project.  
> Order follows dependency: each step depends on the previous one.  
> Dependency IDs use phase-prefixed form: `3.1-03-01` = Module 3.1 / Sub-module 03-01.

---

### 📚 Module 3.1 Fundamentals & Setup

| Sub-Module | Topics |
|------------|--------|
| 03-01 Setup | Setup → **Mini-project:** Hello Express API. Depends: Node/HTTP. |
| 03-02 Routing | Routing → **Mini-project:** Route playground. Depends: 3.1-03-01. |
| 03-03 Middleware | Middleware → **Mini-project:** Logger + request ID. Depends: 3.1-03-02. |
| 03-04 Error Handling | Error Handling → **Mini-project:** 404/500 JSON handler. Depends: 3.1-03-03. |
| 03-05 Template Engines | Template Engines → **Mini-project:** EJS/Handlebars page. Depends: 3.1-03-04. |
| 03-06 Express Setup | Express server, routes, middleware, basic API → **Mini-project:** Basic Express server + health route. Depends: 3.1-03-01–3.1-03-05. |

---

### 📚 Module 3.2 REST API Design

| Sub-Module | Topics |
|------------|--------|
| 03-01 REST Methods | Methods → **Mini-project:** Method explorer. Depends: 3.1-03-06. |
| 03-02 Status Codes | Status Codes → **Mini-project:** Status code simulator. Depends: 3.2-03-01. |
| 03-03 Content Negotiation | Content Negotiation → **Mini-project:** JSON/XML response. Depends: 3.2-03-02. |
| 03-04 API Versioning | API Versioning → **Mini-project:** `/api/v1` vs `/api/v2`. Depends: 3.2-03-03. |

---

### 📚 Module 3.3 CRUD API

| Sub-Module | Topics |
|------------|--------|
| 03-01 CRUD — Create | Create → **Mini-project:** POST endpoint. Depends: 3.2-03-01–3.2-03-04. |
| 03-02 CRUD — Read | Read → **Mini-project:** GET list + GET by ID. Depends: 3.3-03-01. |
| 03-03 CRUD — Update | Update → **Mini-project:** PUT/PATCH. Depends: 3.3-03-02. |
| 03-04 CRUD — Delete | Delete → **Mini-project:** DELETE + 204. Depends: 3.3-03-03. |
| 03-05 CRUD — Params/Body | Params/Body → **Mini-project:** Postman/Thunder tests. Depends: 3.3-03-04. |

---

### 📚 Module 3.4 Validation & Error Handling

| Sub-Module | Topics |
|------------|--------|
| 03-01 Input Validation | Input Validation → **Mini-project:** Joi/Zod/express-validator schema. Depends: 3.3-03-05. |
| 03-02 DTOs | DTOs → **Mini-project:** Request/response shaping. Depends: 3.4-03-01. |
| 03-03 Sanitization | Sanitization → **Mini-project:** Clean user input. Depends: 3.4-03-02. |
| 03-04 Central Error Middleware | Central Error Middleware → **Mini-project:** Unified error format. Depends: 3.4-03-03. |
| 03-05 Async Errors | Async Errors → **Mini-project:** Async wrapper. Depends: 3.4-03-04. |

---

### 📚 Module 3.5 MongoDB & Mongoose

| Sub-Module | Topics |
|------------|--------|
| 03-01 MongoDB Connection | Connection → **Mini-project:** MongoDB Atlas/local connect. Depends: 3.4-03-05. |
| 03-02 Mongoose Schema | Schema → **Mini-project:** User/Note schema. Depends: 3.5-03-01. |
| 03-03 Mongoose Models | Models → **Mini-project:** Mongoose model CRUD. Depends: 3.5-03-02. |
| 03-04 Relationships | Relationships → **Mini-project:** Populate author/comments. Depends: 3.5-03-03. |
| 03-05 Indexes | Indexes → **Mini-project:** Search/filter optimization. Depends: 3.5-03-04. |

---

### 📚 Module 3.6 Architecture

| Sub-Module | Topics |
|------------|--------|
| 03-01 MVC | MVC → **Mini-project:** Split routes/controllers/views. Depends: 3.5-03-01–3.5-03-05. |
| 03-02 Architecture Layers | Routes → Controllers → Services → Repositories → **Mini-project:** Layered refactor. Depends: 3.6-03-01. |
| 03-03 Validation Layer | DTOs + Validation Layer → **Mini-project:** Schema + service validation. Depends: 3.6-03-02. |

---

### 📚 Module 3.7 Security & Auth

| Sub-Module | Topics |
|------------|--------|
| 03-01 User Model | User Model → **Mini-project:** Register/login schema. Depends: 3.6-03-03. |
| 03-02 bcrypt | bcrypt → **Mini-project:** Password hashing. Depends: 3.7-03-01. |
| 03-03 JWT | JWT → **Mini-project:** Access/refresh tokens. Depends: 3.7-03-02. |
| 03-04 Protected Routes | Protected Routes → **Mini-project:** Auth middleware. Depends: 3.7-03-03. |
| 03-05 Roles | Roles → **Mini-project:** Admin/user guard. Depends: 3.7-03-04. |
| 03-06 CORS | CORS → **Mini-project:** Cross-origin config. Depends: 3.7-03-05. |
| 03-07 Helmet | Helmet → **Mini-project:** Security headers. Depends: 3.7-03-06. |
| 03-08 Rate Limiting | Rate Limiting → **Mini-project:** Brute-force protection. Depends: 3.7-03-07. |
| 03-09 OAuth2 | OAuth2 → **Mini-project:** Optional provider login. Depends: 3.7-03-08. |

---

### 📚 Module 3.8 File Upload

| Sub-Module | Topics |
|------------|--------|
| 03-01 Multer | Multer → **Mini-project:** Single/multiple upload. Depends: 3.7-03-01–3.7-03-09. |
| 03-02 Storage | Storage → **Mini-project:** Disk vs memory. Depends: 3.8-03-01. |
| 03-03 File Validation | File Validation → **Mini-project:** Type/size limits. Depends: 3.8-03-02. |
| 03-04 Static Serving | Static Serving → **Mini-project:** Serve uploaded files. Depends: 3.8-03-03. |
| 03-05 Cloud Storage | Cloud Storage → **Mini-project:** Cloudinary/S3 optional. Depends: 3.8-03-04. |

---

### 📚 Module 3.9 Advanced Express

| Sub-Module | Topics |
|------------|--------|
| 03-01 Nodemailer | Nodemailer → **Mini-project:** Welcome/reset email. Depends: 3.8-03-01–3.8-03-05. |
| 03-02 Socket.io | Socket.io → **Mini-project:** Live notifications. Depends: 3.9-03-01. |
| 03-03 Cron | Cron → **Mini-project:** Scheduled cleanup. Depends: 3.9-03-02. |
| 03-04 Winston/Pino | Winston/Pino → **Mini-project:** Structured logging. Depends: 3.9-03-03. |
| 03-05 Swagger | Swagger/OpenAPI → **Mini-project:** API docs. Depends: 3.9-03-04. |

---

## 📚 Module 4 Deployment Fullstack

| Sub-Module | Topics |
|------------|--------|
| 04-01 Env Vars | Env Vars → **Mini-project:** Secrets/config. Depends: 3.9-03-01–3.9-03-05. |
| 04-02 Backend Deploy | Backend Deploy → **Mini-project:** Render/Railway. Depends: 04-01. |
| 04-03 Frontend Deploy | Frontend Deploy → **Mini-project:** Vercel/Netlify. Depends: 04-02. |
| 04-04 MongoDB Atlas | MongoDB Atlas → **Mini-project:** Production DB. Depends: 04-03. |
| 04-05 CORS/Cookies | CORS/Cookies → **Mini-project:** Production auth config. Depends: 04-04. |
| 04-06 CI/CD | CI/CD → **Mini-project:** Auto deploy. Depends: 04-05. |
| 04-07 Monitoring | Monitoring → **Mini-project:** Logs/health checks. Depends: 04-06. |

---

**Capstone**

| Sub-Module | Topics |
|------------|--------|
| Capstone | **Project:** Production REST API with Auth — CRUD + MongoDB + JWT + validation + uploads + Swagger + deployment. Depends: All Module 3 + Module 4. |

**Project:** Production REST API with Auth

---

## Module Projects  
*(Each is a larger, full-featured React Vite project integrating all previous concepts.)*

| Subfolder | Description |
|-----------|-------------|
| `01-ecommerce-app` | Product listing, cart, checkout, auth, API integration. |
| `02-social-media-dashboard` | User feed, posts, likes, comments, profiles. |
| `03-task-management-app` | Kanban board, drag-and-drop, CRUD. |
| `04-chat-application` | Real-time chat, WebSockets, rooms. |
| `05-blog-platform` | Blog posts, Markdown, comments, admin panel. |
| `06-portfolio-website` | Portfolio with animations, contact form. |
| `07-admin-dashboard` | Data visualization, charts, tables. |
| `08-video-streaming-app` | Video list, player, comments (YouTube clone). |
| `09-food-delivery-app` | Menu, cart, order tracking. |
| `10-real-estate-listing` | Listings, maps, filters. |

---

## Final Cheat Sheet  
| Subfolder | Description |
|-----------|-------------|
| `cheat-sheet` | A React Vite app that displays a comprehensive cheat sheet of React concepts, hooks, patterns, and common snippets. |

---

## Final Interview Revision  
| Subfolder | Description |
|-----------|-------------|
| `interview-revision` | A React Vite app with flashcards, key concepts, and interview questions for quick revision. |

---

This structure ensures **no topic is missed** and provides a hands-on project for every concept, building from zero to full-stack proficiency.
---

---
```
Designed by
Mr.Brijesh Nishad (Full Stack Engineer)
```
