```md
# Module 02: React Fundamentals

This module covers the core building blocks of React: JSX, components, props, state, and rendering patterns. By the end of this module, you will understand how React applications are structured and how data flows between components.

## What is React

### 1.1 Definition

React is an open-source JavaScript library for building user interfaces, primarily for single-page applications (SPAs). It was developed by Facebook (Meta) and released in 2013. React allows developers to create reusable UI components that manage their own state and efficiently update when data changes.

### 1.2 Why It Exists

React was created to solve the problem of building large, complex, and dynamic web applications. Traditional approaches (vanilla JS + direct DOM manipulation) become difficult to maintain as the UI grows. React introduces a component-based architecture and a declarative programming style, making code more predictable, reusable, and easier to debug.

### 1.3 Purpose

- Build interactive UIs with reusable components
- Manage UI state efficiently
- Automatically update the DOM when state changes (via virtual DOM)
- Enable single-page application experiences

### 1.4 Prerequisites

- HTML, CSS, JavaScript (ES6+)
- Understanding of DOM and events

### 1.5 Core Concepts

- **Components**: Reusable, independent pieces of UI
- **JSX**: Syntax extension for writing HTML-like code in JavaScript
- **Virtual DOM**: In-memory representation of the real DOM
- **State & Props**: Data management within and between components
- **Unidirectional Data Flow**: Data flows from parent to child via props

### 1.6 Internal Working

React uses a virtual DOM and reconciliation to efficiently update the real DOM. When state changes, React creates a new virtual DOM tree, compares it with the previous one (diffing), and applies only the minimal changes to the real DOM.

### 1.7 Real-World Usage

React is used by companies like Facebook, Instagram, Netflix, Airbnb, and countless others to build dynamic user interfaces.

### 1.8 Advantages

- Component reuse
- Strong community and ecosystem
- Performance optimizations (virtual DOM)
- Unidirectional data flow simplifies reasoning
- Rich tooling (React DevTools, etc.)

### 1.9 Disadvantages

- It's a library, not a full framework – requires additional libraries for routing, state management, etc.
- JSX may have a learning curve for developers used to separating HTML and JS
- Rapid ecosystem changes can lead to decision fatigue

### 1.10 Comparison with Alternatives

| Feature | React | Angular | Vue |
|---------|-------|---------|-----|
| Type | Library | Framework | Framework |
| Learning Curve | Moderate | Steep | Gentle |
| Data Binding | One-way | Two-way | Two-way |
| Ecosystem | Huge | Large | Medium |
| Performance | Excellent | Good | Excellent |
| Use Case | Flexible, component-based SPAs | Enterprise, full-featured apps | Progressive, flexible apps |

## Virtual DOM

### 2.1 Definition

The Virtual DOM (VDOM) is a lightweight JavaScript representation of the real DOM. React maintains a virtual DOM tree in memory and uses it to compute the most efficient way to update the actual DOM.

### 2.2 Why It Exists

Manipulating the real DOM is slow. By working with a virtual representation and batching changes, React minimizes direct DOM operations, resulting in better performance.

### 2.3 How It Works

1. On initial render, React creates a virtual DOM tree.
2. When state or props change, React creates a new virtual DOM tree.
3. React diffs the new tree with the old one to find changes.
4. React applies only the necessary changes to the real DOM.

### 2.4 Internal Working Diagram

<!-- Placeholder: Virtual DOM diffing diagram -->

### 2.5 Interview Questions

**Q: What is the Virtual DOM and how does it improve performance?**

**Answer:** The Virtual DOM is an in-memory representation of the real DOM. React updates it quickly, diffs it with the previous version, and then applies the minimal set of changes to the real DOM, reducing expensive direct DOM manipulations.

## JSX

### 3.1 Definition

JSX stands for JavaScript XML. It is a syntax extension for JavaScript that allows writing HTML-like code within JavaScript. JSX is not a separate language; it is transpiled to regular JavaScript function calls (`React.createElement`).

### 3.2 Why It Exists

JSX makes it easier to visualize and write UI code because it resembles the structure of the UI itself. It allows mixing JavaScript expressions with HTML-like syntax, making components more readable.

### 3.3 Syntax

```jsx
const element = <h1>Hello, world!</h1>;
```

Under the hood, this compiles to:

```js
const element = React.createElement('h1', null, 'Hello, world!');
```

### 3.4 JSX Expressions

You can embed any JavaScript expression inside JSX by wrapping it in curly braces `{}`.

```jsx
const name = 'Alice';
const element = <h1>Hello, {name}</h1>;
```

Expressions can be variables, function calls, ternary operators, etc., but not statements (like `if` or `for`).

### 3.5 JSX Rules

- Must have a single root element (use fragments if necessary).
- Tags must be closed (self-closing tags like `<img />`).
- Attributes use camelCase (`className` instead of `class`, `onClick` instead of `onclick`).
- JavaScript expressions go in `{}`.
- Style attribute takes an object with camelCase properties.
- JSX comments use `{/* comment */}`.

### 3.6 Basic Example

```jsx
const user = { firstName: 'John', lastName: 'Doe' };

const greeting = (
  <div>
    <h1>Welcome, {user.firstName}!</h1>
    <p>Your full name is {user.firstName} {user.lastName}.</p>
  </div>
);
```

### 3.7 Practical Example

Conditional rendering with JSX:

```jsx
const isLoggedIn = true;

return (
  <div>
    {isLoggedIn ? <button>Logout</button> : <button>Login</button>}
  </div>
);
```

### 3.8 Interview Questions

**Q: What is JSX?**

**Answer:** JSX is a syntax extension for JavaScript that allows writing HTML-like code in JavaScript. It is transpiled to `React.createElement` calls and makes React components more readable and expressive.

## Components

### 4.1 Definition

Components are the building blocks of a React application. They are independent, reusable pieces of UI that can accept inputs (props) and manage their own state. Components can be functional (using functions) or class-based (using ES6 classes).

### 4.2 Why It Exists

Components promote reusability, separation of concerns, and maintainability. They allow you to break down a complex UI into smaller, manageable pieces that can be developed, tested, and debugged independently.

### 4.3 Functional Components

Functional components are the modern standard. They are JavaScript functions that return JSX.

```jsx
function Welcome(props) {
  return <h1>Hello, {props.name}</h1>;
}

// Arrow function equivalent
const Welcome = (props) => <h1>Hello, {props.name}</h1>;
```

### 4.4 Class Components (legacy)

Class components use ES6 classes and have access to lifecycle methods and state via `this.state`.

```jsx
class Welcome extends React.Component {
  render() {
    return <h1>Hello, {this.props.name}</h1>;
  }
}
```

> **Note:** Functional components with hooks are now the preferred approach. Class components are mostly legacy, but you should understand them for existing codebases and interviews.

### 4.5 Component Composition

Components can be nested inside other components, enabling composition.

```jsx
function App() {
  return (
    <div>
      <Header />
      <Content />
      <Footer />
    </div>
  );
}
```

### 4.6 Interview Questions

**Q: What is the difference between functional and class components?**

**Answer:** Functional components are plain JavaScript functions that return JSX and use hooks for state and lifecycle. Class components extend `React.Component` and use `this.state` and lifecycle methods. Functional components are simpler, more lightweight, and the modern standard.

## Props

### 5.1 Definition

Props (short for "properties") are read-only inputs passed from a parent component to a child component. They allow data to flow down the component tree in a unidirectional manner.

### 5.2 Why It Exists

Props enable component reuse with different data. Without props, each component would be hardcoded, and you couldn't customize its behavior or content.

### 5.3 Passing Props

```jsx
function Welcome(props) {
  return <h1>Hello, {props.name}</h1>;
}

// Parent component
function App() {
  return <Welcome name="Alice" />;
}
```

### 5.4 Default Props

You can define default values for props using `defaultProps` (class components) or default parameter syntax (functional components).

Functional component with default parameter:

```jsx
function Welcome({ name = 'Guest' }) {
  return <h1>Hello, {name}</h1>;
}
```

### 5.5 Props Destructuring

Destructuring props makes code cleaner by extracting values directly:

```jsx
function Welcome({ name, age }) {
  return <p>{name} is {age} years old.</p>;
}
```

### 5.6 Props are Immutable

A component should never modify its own props. Props are owned by the parent and passed down. To change data, the child must call a callback function passed from the parent.

### 5.7 Interview Questions

**Q: What are props in React?**

**Answer:** Props are read-only inputs passed from a parent component to a child component. They are immutable and allow data to flow down the component tree.

**Q: Can a child modify its props?**

**Answer:** No. Props are immutable. A child can trigger changes by calling a callback function passed via props, which the parent then handles.

## State

### 6.1 Definition

State is data that is managed within a component and can change over time. Unlike props, state is mutable and is owned by the component itself. When state changes, React re-renders the component to reflect the new data.

### 6.2 Why It Exists

State allows components to be dynamic and interactive. Without state, components would be static and unable to respond to user actions or data updates.

### 6.3 useState Hook

The `useState` hook is the primary way to add state to functional components.

```jsx
import { useState } from 'react';

function Counter() {
  const [count, setCount] = useState(0);

  return (
    <button onClick={() => setCount(count + 1)}>
      Count: {count}
    </button>
  );
}
```

### 6.4 State Updates

State updates are asynchronous. React may batch multiple updates for performance. Use the functional updater form when the new state depends on the previous state:

```js
setCount(prevCount => prevCount + 1);
```

### 6.5 State Immutability

You should never mutate state directly. Always create a new object/array and use the setter function.

**Wrong:**

```js
user.name = 'New Name';
setUser(user); // Mutating original object (bad)
```

**Correct:**

```js
setUser({ ...user, name: 'New Name' });
```

For arrays, use methods like `map`, `filter`, `concat`, or the spread operator to create new arrays.

### 6.6 Lifting State Up

When multiple components need to share state, the state should be "lifted" to their closest common ancestor. The ancestor holds the state and passes it down as props along with callback functions to update it.

### 6.7 Interview Questions

**Q: What is state in React?**

**Answer:** State is data managed within a component that can change over time. It causes the component to re-render when updated.

**Q: Why is state immutability important?**

**Answer:** Direct mutation of state can lead to bugs and prevents React from detecting changes efficiently. Immutability ensures predictable updates and enables performance optimizations like `React.memo`.

## Parent → Child Communication

### 7.1 Definition

Data flows from parent to child via props. The parent passes values as attributes, and the child receives them as props.

### 7.2 Example

```jsx
function Child({ message }) {
  return <p>{message}</p>;
}

function Parent() {
  return <Child message="Hello from parent!" />;
}
```

### 7.3 Why It's Important

This unidirectional flow makes data flow predictable and easier to debug. It is the foundation of React's data model.

## Child → Parent Communication

### 8.1 Definition

Children communicate with parents by calling callback functions passed as props. The parent defines a function and passes it to the child. The child invokes it with some data.

### 8.2 Example

```jsx
function Child({ onButtonClick }) {
  return <button onClick={() => onButtonClick('Data from child')}>Click me</button>;
}

function Parent() {
  const handleClick = (data) => {
    console.log(data);
  };

  return <Child onButtonClick={handleClick} />;
}
```

### 8.3 Use Cases

- Form input handling
- Triggering parent state updates from a child

## Sibling Communication

### 9.1 Definition

Sibling components cannot communicate directly. They must go through their common parent. The parent holds the shared state and passes it down to both siblings.

### 9.2 Example

```jsx
function SiblingA({ sharedData }) {
  return <p>Data: {sharedData}</p>;
}

function SiblingB({ onDataChange }) {
  return <button onClick={() => onDataChange('New data')}>Change data</button>;
}

function Parent() {
  const [data, setData] = useState('Initial data');

  return (
    <div>
      <SiblingA sharedData={data} />
      <SiblingB onDataChange={setData} />
    </div>
  );
}
```

### 9.3 Diagram

<!-- Placeholder: Sibling communication via parent diagram -->

## Conditional Rendering

### 10.1 Definition

Conditional rendering in React allows you to show or hide UI elements based on certain conditions. It works the same way as conditions in JavaScript.

### 10.2 Methods

- `if`/`else` statements (outside JSX)
- Ternary operator (inside JSX)
- Logical `&&` operator (for single condition)
- `switch` statement (rare)

### 10.3 Examples

**Ternary:**

```jsx
function Greeting({ isLoggedIn }) {
  return (
    <div>
      {isLoggedIn ? <h1>Welcome back!</h1> : <h1>Please sign in.</h1>}
    </div>
  );
}
```

**Logical `&&`:**

```jsx
function Notification({ hasNewMessages }) {
  return (
    <div>
      {hasNewMessages && <p>You have new messages!</p>}
    </div>
  );
}
```

**If/else outside JSX:**

```jsx
function UserStatus({ isLoading }) {
  if (isLoading) {
    return <p>Loading...</p>;
  } else {
    return <p>Loaded!</p>;
  }
}
```

### 10.4 Best Practices

- Prefer ternary for simple conditions; use `&&` when rendering only when condition is true.
- Avoid complex logic inside JSX; extract to variables or helper functions.

## List Rendering

### 11.1 Definition

List rendering is the process of generating multiple JSX elements from an array of data. React uses the `map()` method to transform each item into JSX.

### 11.2 Example

```jsx
const fruits = ['Apple', 'Banana', 'Cherry'];

function FruitList() {
  return (
    <ul>
      {fruits.map((fruit, index) => (
        <li key={index}>{fruit}</li>
      ))}
    </ul>
  );
}
```

### 11.3 Keys

Keys are special attributes that help React identify which items have changed, been added, or removed. They should be unique among siblings and stable across renders.

- Use a unique identifier from the data (e.g., `id`) instead of array index when possible.
- Index can be used as a last resort if the list is static and has no reordering.

**Why keys matter:** Without keys, React may re-render items inefficiently, causing performance issues and state loss.

## Fragments

### 12.1 Definition

Fragments allow grouping multiple elements without adding an extra DOM node. They are declared using `<React.Fragment>` or the shorthand `<>...</>`.

### 12.2 Why Use Fragments

Sometimes you need to return multiple siblings from a component, but JSX requires a single root. Using a `<div>` wrapper adds an unnecessary DOM node, which can affect CSS and layout. Fragments solve this.

### 12.3 Example

```jsx
function Component() {
  return (
    <>
      <h1>Title</h1>
      <p>Description</p>
    </>
  );
}
```

You can also pass a `key` to fragments when rendering lists:

```jsx
<React.Fragment key={item.id}>
  ...
</React.Fragment>
```

## Component Composition

### 13.1 Definition

Component composition is the practice of building complex UIs by combining simpler components. Instead of creating monolithic components, you compose smaller ones together, using props and children.

### 13.2 Example

```jsx
function Card({ title, children }) {
  return (
    <div className="card">
      <h2>{title}</h2>
      <div>{children}</div>
    </div>
  );
}

function App() {
  return (
    <Card title="Dashboard">
      <p>Welcome to the dashboard!</p>
      <button>Go to settings</button>
    </Card>
  );
}
```

### 13.3 Special children Prop

The `children` prop is automatically passed to components and contains any nested JSX. It allows you to create wrapper components that can accept arbitrary content.

## Module 02 – Quick Revision

- React is a component-based UI library.
- JSX is HTML-like syntax in JavaScript.
- Components are reusable functions returning JSX.
- Props are read-only inputs; state is internal mutable data.
- Data flows down (parent→child); child→parent via callbacks.
- Use `useState` for state, keep state immutable.
- Keys are essential for list rendering.
- Fragments avoid extra DOM nodes.
- Composition is the core pattern for building UIs.

## Interview Questions – Module 02

### Beginner

**Q: What is a component in React?**

**Answer:** A component is a reusable piece of UI, defined as a function or class, that returns JSX and can accept props.

**Q: What is the difference between state and props?**

**Answer:** Props are read-only and passed from parent to child. State is internal to a component and can be changed over time.

**Q: What is JSX?**

**Answer:** JSX is a syntax extension that allows writing HTML-like code in JavaScript, which is transpiled to `React.createElement` calls.

### Intermediate

**Q: Explain how child-to-parent communication works.**

**Answer:** The parent passes a callback function as a prop to the child. The child invokes that function with data, which the parent then uses to update its state.

**Q: What is the purpose of keys in list rendering?**

**Answer:** Keys help React identify which items have changed, been added, or removed. They enable efficient diffing and preserve component state during re-renders.

**Q: Why should you avoid using array index as key?**

**Answer:** Using index as key can cause issues when the list order changes, leading to incorrect state updates and performance problems. It's better to use a stable unique identifier from the data.

### Advanced

**Q: How does React's virtual DOM diffing work at a high level?**

**Answer:** When state changes, React creates a new virtual DOM tree and compares it with the previous one. It finds differences and then updates only the changed parts of the real DOM, minimizing expensive DOM operations.

**Q: What is "lifting state up" and why is it necessary?**

**Answer:** Lifting state up means moving shared state to the closest common ancestor of components that need it. This is necessary for sibling components to share data and ensures a single source of truth.

**Q: Explain the concept of component composition and its benefits.**

**Answer:** Composition involves building complex UIs from smaller, reusable components. It promotes reusability, separation of concerns, and makes code easier to maintain and test.

### Scenario-Based

**Q: You have a list of 1000 items and notice slow re-renders when updating one item. What would you do?**

**Answer:** I would first ensure that each item has a stable, unique key. Then I'd consider using `React.memo` on the item component to prevent unnecessary re-renders if the props haven't changed. If the list is extremely long, I'd implement virtualization (e.g., `react-window`) to render only visible items.

### Coding Questions

**1. Write a functional component that takes a name prop and displays a greeting.**

```jsx
function Greeting({ name }) {
  return <h1>Hello, {name}!</h1>;
}
```

**2. Create a counter component with increment and decrement buttons using useState.**

```jsx
import { useState } from 'react';

function Counter() {
  const [count, setCount] = useState(0);

  return (
    <div>
      <button onClick={() => setCount(count - 1)}>-</button>
      <span>{count}</span>
      <button onClick={() => setCount(count + 1)}>+</button>
    </div>
  );
}
```

**3. Given an array of objects `[{id:1, name:'Alice'}, {id:2, name:'Bob'}]`, render an unordered list of names.**

```jsx
function NameList({ users }) {
  return (
    <ul>
      {users.map(user => (
        <li key={user.id}>{user.name}</li>
      ))}
    </ul>
  );
}
```

## Common Mistakes & Best Practices (Module 02)

| Mistake | Best Practice |
|---------|---------------|
| Mutating state directly | Always create a new object/array and use setter |
| Using array index as key | Use stable unique IDs |
| Not returning a single root from component | Use fragments (`<>`) when needed |
| Forgetting to close JSX tags | Always close tags (self-closing) |
| Using `class` instead of `className` | Use `className` in JSX |
| Placing complex logic inside JSX | Extract logic to variables/functions |

## Real-World Scenario: Building a Simple Comment System

**Problem:** You need to display a list of comments and allow users to add new ones. The input form is in a separate component, and the list is in another. Both need to share state.

**Solution:**

- Lift the comments state to the parent component (`App`).
- Pass comments array to `CommentList` as props.
- Pass a callback function to `CommentForm` to add new comments.
- Use controlled input to manage form state.

**Architecture:**

<!-- Placeholder: Architecture diagram: App holds state, passes to CommentList and callback to CommentForm -->

**Implementation (simplified):**

```jsx
import { useState } from 'react';

function CommentForm({ onAddComment }) {
  const [text, setText] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    if (text.trim()) {
      onAddComment(text);
      setText('');
    }
  };

  return (
    <form onSubmit={handleSubmit}>
      <input value={text} onChange={(e) => setText(e.target.value)} />
      <button type="submit">Add Comment</button>
    </form>
  );
}

function CommentList({ comments }) {
  return (
    <ul>
      {comments.map((comment, i) => (
        <li key={i}>{comment}</li>
      ))}
    </ul>
  );
}

function App() {
  const [comments, setComments] = useState([]);

  const addComment = (text) => {
    setComments([...comments, text]);
  };

  return (
    <div>
      <CommentForm onAddComment={addComment} />
      <CommentList comments={comments} />
    </div>
  );
}
```
```