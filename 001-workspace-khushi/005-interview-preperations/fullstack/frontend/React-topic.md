React Interview Preparation Guide

This guide covers key React concepts with explanations and code snippets to help you prepare for interviews.

---

React Fundamentals

What is React?

React is a JavaScript library for building user interfaces, primarily single-page applications. It uses a component-based architecture and a virtual DOM for efficient rendering.

Virtual DOM

The virtual DOM is a lightweight in-memory representation of the real DOM. When state changes, React creates a new virtual DOM tree, compares it with the previous one (diffing), and updates only the changed parts in the real DOM (reconciliation). This minimizes expensive DOM manipulations.

JSX

JSX is a syntax extension that looks like HTML but gets compiled to React.createElement() calls. It allows you to write UI markup directly inside JavaScript.

```jsx
const element = <h1>Hello, World!</h1>;
// compiles to: React.createElement('h1', null, 'Hello, World!')
```

Rules:

· Must have one parent element (use Fragments <></> if needed)
· JavaScript expressions go inside {}
· Use className instead of class, htmlFor instead of for

Components (Functional & Class)

Functional Component – A JavaScript function that accepts props and returns JSX.

```jsx
function Welcome(props) {
  return <h1>Hello, {props.name}</h1>;
}
```

Class Component – ES6 class extending React.Component with a render() method.

```jsx
class Welcome extends React.Component {
  render() {
    return <h1>Hello, {this.props.name}</h1>;
  }
}
```

Nowadays, functional components with hooks are preferred.

Props

Props (properties) are read-only data passed from parent to child component.

```jsx
function Greeting({ name }) {
  return <p>Hi {name}!</p>;
}
<Greeting name="Alice" />
```

State

State is mutable data managed within a component. In functional components, use the useState hook.

```jsx
const [count, setCount] = useState(0);
```

State updates are asynchronous; use the functional form when updating based on previous state.

```jsx
setCount(prev => prev + 1);
```

Conditional Rendering

Render different UI based on conditions using JavaScript operators.

```jsx
function UserGreeting({ isLoggedIn }) {
  return isLoggedIn ? <h1>Welcome back!</h1> : <h1>Please sign in.</h1>;
}
// or using &&
{isLoggedIn && <Dashboard />}
```

Lists and Keys

Use .map() to render lists. Each list item needs a unique key prop to help React identify changes.

```jsx
const todos = ['Learn React', 'Build App'];
return (
  <ul>
    {todos.map((todo, index) => (
      <li key={index}>{todo}</li>
    ))}
  </ul>
);
```

Avoid using index as key if items can reorder; use a unique ID.

Event Handling

React events are named using camelCase and passed as function references.

```jsx
<button onClick={() => alert('Clicked!')}>Click</button>
// or
function handleClick() { alert('Clicked!'); }
<button onClick={handleClick}>Click</button>
```

To prevent default behavior: event.preventDefault(). In class components, you often bind methods in the constructor.

Forms (Controlled & Uncontrolled Components)

Controlled Component – Form data is handled by React state.

```jsx
const [name, setName] = useState('');
<input value={name} onChange={e => setName(e.target.value)} />
```

Uncontrolled Component – The DOM itself maintains the form data, accessed via refs.

```jsx
const inputRef = useRef();
<input ref={inputRef} />
// read value with inputRef.current.value
```

Controlled components give more control, while uncontrolled ones are useful for simple scenarios or integrating non-React code.

---

React Hooks

useState

Adds state to functional components.

```jsx
import { useState } from 'react';
const [state, setState] = useState(initialValue);
```

Calling setState triggers a re-render.

useEffect

Handles side effects: data fetching, subscriptions, DOM manipulation.

```jsx
useEffect(() => {
  // side effect code
  return () => {
    // cleanup (optional)
  };
}, [dependencies]);
```

· No dependency array → runs after every render.
· Empty [] → runs once after mount.
· With dependencies → runs when dependencies change.

useRef

Returns a mutable ref object that persists across renders.

```jsx
const inputRef = useRef(null);
<input ref={inputRef} />
// inputRef.current.focus();
```

Changing .current does not cause re-render.

useMemo

Memoizes a computed value to avoid expensive recalculations.

```jsx
const memoizedValue = useMemo(() => computeExpensive(a, b), [a, b]);
```

useCallback

Returns a memoized callback function to prevent unnecessary re-renders of child components.

```jsx
const memoizedCallback = useCallback(() => doSomething(a, b), [a, b]);
```

Use it when passing callbacks to optimized child components (e.g., React.memo).

useContext

Consumes a context value without wrapping in Context.Consumer.

```jsx
const ThemeContext = React.createContext('light');
function ThemedButton() {
  const theme = useContext(ThemeContext);
  return <button className={theme}>Themed</button>;
}
```

useReducer

Alternative to useState for complex state logic. Accepts a reducer function and initial state.

```jsx
const [state, dispatch] = useReducer(reducer, initialState);
```

Example reducer:

```jsx
function reducer(state, action) {
  switch (action.type) {
    case 'increment': return { count: state.count + 1 };
    default: return state;
  }
}
```

Custom Hooks

Reusable functions that start with use and can use other hooks.

```jsx
function useWindowWidth() {
  const [width, setWidth] = useState(window.innerWidth);
  useEffect(() => {
    const handler = () => setWidth(window.innerWidth);
    window.addEventListener('resize', handler);
    return () => window.removeEventListener('resize', handler);
  }, []);
  return width;
}
```

---

Component Lifecycle

Mounting, Updating, Unmounting

· Mounting: Component is created and inserted into the DOM.
· Updating: Component re-renders due to state/props changes.
· Unmounting: Component is removed from the DOM.

Lifecycle methods (Class Components)

· componentDidMount() – called after mount; ideal for API calls.
· componentDidUpdate(prevProps, prevState) – called after update; compare prev and current.
· componentWillUnmount() – called before unmount; cleanup (remove timers, subscriptions).

useEffect lifecycle equivalent

· useEffect(() => {}, []) → componentDidMount
· useEffect(() => {}, [deps]) → componentDidUpdate (runs when deps change)
· Return cleanup function → componentWillUnmount

```jsx
useEffect(() => {
  // componentDidMount logic
  const timer = setInterval(() => {}, 1000);
  return () => clearInterval(timer); // componentWillUnmount
}, []);
```

---

React Router

BrowserRouter

Wraps the entire app to enable routing with HTML5 history API.

```jsx
import { BrowserRouter } from 'react-router-dom';
<BrowserRouter>
  <App />
</BrowserRouter>
```

Routes & Route

Define path-to-component mapping.

```jsx
<Routes>
  <Route path="/" element={<Home />} />
  <Route path="/about" element={<About />} />
</Routes>
```

Link

Navigates without full page reload.

```jsx
<Link to="/about">About</Link>
```

NavLink

Like Link but can apply active styling based on current route.

```jsx
<NavLink to="/about" className={({ isActive }) => isActive ? 'active' : ''}>About</NavLink>
```

useNavigate

Hook to navigate programmatically.

```jsx
const navigate = useNavigate();
navigate('/dashboard');
// replace: navigate('/login', { replace: true });
```

useParams

Access route parameters.

```jsx
// Route: <Route path="/user/:id" element={<User />} />
function User() {
  const { id } = useParams();
  return <div>User ID: {id}</div>;
}
```

useLocation

Returns current location object (pathname, search, state).

```jsx
const location = useLocation();
console.log(location.pathname);
```

Nested Routes

Render child routes inside a parent component using <Outlet />.

```jsx
<Route path="/dashboard" element={<Dashboard />}>
  <Route index element={<DashboardHome />} />
  <Route path="stats" element={<Stats />} />
</Route>
```

Dashboard component renders <Outlet />.

Protected Routes

Wrap route elements with a component that checks authentication.

```jsx
function ProtectedRoute({ children }) {
  const isAuth = useAuth();
  return isAuth ? children : <Navigate to="/login" replace />;
}
```

Usage: <Route path="/admin" element={<ProtectedRoute><Admin /></ProtectedRoute>} />

404 (Not Found) Routes

Add a catch-all route with path="*".

```jsx
<Route path="*" element={<NotFound />} />
```

---

API Integration

Fetch API

Built-in browser API for making HTTP requests.

```jsx
fetch('https://api.example.com/data')
  .then(res => res.json())
  .then(data => console.log(data))
  .catch(err => console.error(err));
```

Axios

Third-party library with a cleaner API, automatic JSON parsing, and interceptors.

```jsx
import axios from 'axios';
axios.get('/api/data')
  .then(response => console.log(response.data))
  .catch(error => console.error(error));
```

Async/Await

Write asynchronous code like synchronous code.

```jsx
async function fetchData() {
  try {
    const res = await axios.get('/api/data');
    setData(res.data);
  } catch (err) {
    setError(err.message);
  }
}
```

Error Handling

Always handle errors using try/catch (or .catch()). Show user-friendly messages and potentially retry.

Loading States

Track loading status with a state variable.

```jsx
const [loading, setLoading] = useState(false);
const fetchData = async () => {
  setLoading(true);
  try { /* ... */ } 
  finally { setLoading(false); }
};
if (loading) return <Spinner />;
```

---

State Management

Context API

Built-in way to pass data through the component tree without prop drilling.

```jsx
const ThemeContext = React.createContext();
function App() {
  return (
    <ThemeContext.Provider value="dark">
      <Toolbar />
    </ThemeContext.Provider>
  );
}
function Toolbar() {
  const theme = useContext(ThemeContext);
  return <div className={theme}>...</div>;
}
```

Suitable for low-frequency updates (theme, locale). Not ideal for high-frequency changes due to re-renders of all consumers.

Redux Fundamentals

A predictable state container with a single store, actions, and reducers.

· Store: Holds the whole state tree.
· Actions: Plain objects describing what happened { type: 'INCREMENT', payload: 1 }.
· Reducers: Pure functions (state, action) => newState.
· Dispatch: The only way to trigger a state change.
· Selectors: Functions that extract specific pieces of state.

Redux Toolkit

Official recommended way to write Redux logic. Provides createSlice, configureStore, and simplifies immutable updates with Immer.

```jsx
// counterSlice.js
import { createSlice } from '@reduxjs/toolkit';
const counterSlice = createSlice({
  name: 'counter',
  initialState: { value: 0 },
  reducers: {
    increment: state => { state.value += 1; },
    decrement: state => { state.value -= 1; },
  }
});
export const { increment, decrement } = counterSlice.actions;
export default counterSlice.reducer;

// store.js
import { configureStore } from '@reduxjs/toolkit';
import counterReducer from './counterSlice';
export const store = configureStore({ reducer: { counter: counterReducer } });
```

Use in components with useSelector and useDispatch from react-redux.

---

Performance Optimization

React.memo

Prevents re-render of a functional component if props haven't changed (shallow comparison).

```jsx
const MyComponent = React.memo(function MyComponent(props) {
  return <div>{props.value}</div>;
});
```

useMemo

Memoizes expensive computations. Already described in Hooks section.

useCallback

Memoizes callback functions. Prevents child re-renders when passed as props.

Lazy Loading

Dynamically import components to split code.

```jsx
const OtherComponent = React.lazy(() => import('./OtherComponent'));
```

Wrap in <Suspense> with a fallback UI.

```jsx
<Suspense fallback={<div>Loading...</div>}>
  <OtherComponent />
</Suspense>
```

Code Splitting

Technique to break your bundle into smaller chunks (using dynamic import() and React.lazy). Vite and Webpack support it out of the box.

---

Advanced Topics

Higher-Order Components (HOC)

A function that takes a component and returns a new enhanced component.

```jsx
function withLogging(WrappedComponent) {
  return function(props) {
    console.log('rendering');
    return <WrappedComponent {...props} />;
  };
}
```

Used for cross-cutting concerns (e.g., withRouter in older React Router).

Render Props

A component that accepts a function as a prop to decide what to render.

```jsx
class MouseTracker extends React.Component {
  state = { x: 0, y: 0 };
  handleMouseMove = e => this.setState({ x: e.clientX, y: e.clientY });
  render() {
    return <div onMouseMove={this.handleMouseMove}>{this.props.render(this.state)}</div>;
  }
}
// Usage:
<MouseTracker render={({ x, y }) => <h1>Mouse: {x}, {y}</h1>} />
```

Portals

Render children into a DOM node outside the parent component's hierarchy.

```jsx
import ReactDOM from 'react-dom';
return ReactDOM.createPortal(
  <div className="modal">{children}</div>,
  document.getElementById('modal-root')
);
```

Useful for modals, tooltips.

Error Boundaries

Class components that catch errors in their child component tree and display a fallback UI.

```jsx
class ErrorBoundary extends React.Component {
  state = { hasError: false };
  static getDerivedStateFromError(error) { return { hasError: true }; }
  componentDidCatch(error, info) { logError(error, info); }
  render() {
    if (this.state.hasError) return <h1>Something went wrong.</h1>;
    return this.props.children;
  }
}
```

Wrap components: <ErrorBoundary><MyComponent /></ErrorBoundary>.

Fragments

Group multiple elements without adding extra DOM nodes.

```jsx
<>
  <td>Cell 1</td>
  <td>Cell 2</td>
</>
```

Forward Ref

Pass a ref through a component to a child DOM element.

```jsx
const FancyInput = React.forwardRef((props, ref) => (
  <input ref={ref} className="fancy" {...props} />
));
// Parent: <FancyInput ref={inputRef} />
```

Prop Drilling

Passing props through many intermediate components that don't need them. Solutions: Context API, Redux, component composition.

Lifting State Up

Moving shared state to the closest common ancestor to synchronize multiple components.

```jsx
function Parent() {
  const [value, setValue] = useState('');
  return <>
    <InputA value={value} onChange={setValue} />
    <InputB value={value} onChange={setValue} />
  </>;
}
```

Composition vs Inheritance

React recommends composition over inheritance. Use props.children, slots (passing elements as props), and HOCs to reuse code. Example:

```jsx
function Dialog(props) {
  return <div className="dialog">{props.children}</div>;
}
<Dialog><h1>Title</h1><p>Content</p></Dialog>
```

---

Testing

Jest

A JavaScript testing framework with built-in assertions, mocking, and coverage. Used by default in Create React App and Vite setups.

```js
test('adds 1 + 2 to equal 3', () => {
  expect(1 + 2).toBe(3);
});
```

React Testing Library

Focuses on testing components from the user’s perspective (rendering, querying elements, simulating events).

```jsx
import { render, screen, fireEvent } from '@testing-library/react';
import Button from './Button';

test('calls onClick prop when clicked', () => {
  const handleClick = jest.fn();
  render(<Button onClick={handleClick}>Click Me</Button>);
  fireEvent.click(screen.getByText(/click me/i));
  expect(handleClick).toHaveBeenCalledTimes(1);
});
```

Prefer queries like getByRole, getByText, etc., and avoid testing implementation details.

---

React + Backend

REST APIs

Standard HTTP methods for CRUD operations. React apps interact with REST endpoints via fetch or axios.

CRUD Operations

· Create: POST /items
· Read: GET /items or GET /items/:id
· Update: PUT/PATCH /items/:id
· Delete: DELETE /items/:id

```js
// Example with async/await
const createItem = async (data) => {
  const response = await axios.post('/api/items', data);
  return response.data;
};
```

JWT Authentication

Typical flow:

1. User logs in, server returns a JWT.
2. Store JWT in localStorage or an HTTP-only cookie.
3. Attach JWT to request headers: Authorization: Bearer <token>.
4. Protect routes based on token presence and validity.

```js
axios.interceptors.request.use(config => {
  const token = localStorage.getItem('token');
  if (token) config.headers.Authorization = `Bearer ${token}`;
  return config;
});
```

CORS

Cross-Origin Resource Sharing. If the API is on a different domain, the server must include appropriate headers (e.g., Access-Control-Allow-Origin). In development, use a proxy (e.g., in Vite or CRA) to avoid CORS issues.

Environment Variables

Store configuration like API base URLs. In Vite, variables prefixed with VITE_ are exposed.

```js
// .env
VITE_API_URL=https://api.example.com

// Usage:
const apiUrl = import.meta.env.VITE_API_URL;
```

In Create React App, variables must start with REACT_APP_ and are accessed via process.env.REACT_APP_VAR.

---

Build & Deployment

Vite vs Create React App

· Create React App (CRA) – built on Webpack, zero-config, but slower in development and builds. Many projects are moving away from it.
· Vite – uses native ES modules and Rollup, extremely fast dev server and optimized builds. Current recommended tool for new React projects.

npm vs npx

· npm – package manager to install dependencies: npm install react.
· npx – executes packages without globally installing them: npx create-react-app my-app. It can also run project-specific binaries from node_modules/.bin.

Production Build

Create an optimized production bundle:

· Vite: npm run build (outputs to dist/)
· CRA: npm run build (outputs to build/)
  The build minifies code, tree shakes, and applies performance optimizations.

Deployment Basics

Deploy the contents of the build folder (dist or build) to any static hosting service:

· Netlify / Vercel: Drag-and-drop or connect Git repo, auto-deploys on push.
· AWS S3 + CloudFront: Upload build folder to S3 bucket configured for static website hosting.
· GitHub Pages: Use gh-pages package or GitHub Actions.
· Apache/Nginx: Serve the folder with proper rewrite rules for client-side routing (e.g., fallback to index.html).

Example configuration for Nginx:

```
location / {
  try_files $uri /index.html;
}
```

---

This guide covers the essential React topics for interviews. Good luck!
