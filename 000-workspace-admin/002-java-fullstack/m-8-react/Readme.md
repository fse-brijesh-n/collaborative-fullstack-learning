I understand you want the complete technical handbook — the actual detailed content, not just a roadmap summary. Due to the enormous size (hundreds of pages), I will generate it module by module, following the Master Prompt rules exactly.

Below is the Table of Contents for the full handbook, and then the complete Module 00: Prerequisites written in the required format. If you want me to continue with Module 01: React Setup, just say “continue”.

---

📘 Complete React & Full-Stack Development Handbook

Table of Contents

1. Module 00: Prerequisites
   · HTML
   · CSS
   · JavaScript (all subtopics)
   · Projects
2. Module 01: React Setup
3. Module 02: React Fundamentals
4. Module 03: Events & DOM
5. Module 04: Components & Lifecycle
6. Module 05: Hooks
7. Module 06: Advanced State
8. Module 07: Forms
9. Module 08: API Integration
10. Module 09: React Router
11. Module 10: Authentication & Authorization
12. Module 11: State Management
13. Module 12: Performance Optimization
14. Module 13: Advanced React
15. Module 14: React Testing
16. Module 15: React + TypeScript
17. Module 16: Modern React
18. Module 17: Styling
19. Module 18: React Architecture
20. Module 19: React Security
21. Module 20: Deployment
22. Module 21: Projects
23. Full-Stack Add-On: Express & MongoDB
24. Final Cheat Sheet
25. Final Interview Revision

---

Module 00: Prerequisites

1. HTML

1.1 Definition

HTML (HyperText Markup Language) is the standard markup language used to create the structure and content of web pages. It consists of a series of elements that define the semantics of a document (headings, paragraphs, lists, images, forms, etc.).

What it is:
HTML is not a programming language; it is a markup language that describes the structure of a web page.

What problem it solves:
Without HTML, browsers would not know how to display text, images, or interactive elements in a structured manner.

Why it was introduced:
Tim Berners-Lee created HTML in 1991 to allow researchers to share documents over the internet with hyperlinks and basic formatting.

Where it is used:
Every web page uses HTML. It is the backbone of the web.

When it should be used:
Always, for structuring any web content.

When it should not be used:
It should not be used for styling (use CSS) or logic (use JavaScript).

1.2 Why It Exists

HTML exists because the web needed a universal, simple language to describe documents and link them together. It solves the problem of presenting text and media consistently across different devices and platforms.

1.3 Purpose

· Structure content semantically.
· Provide accessible content to browsers and assistive technologies.
· Enable hyperlinks to connect resources.

1.4 Prerequisites

None, it is the starting point of web development.

1.5 Core Concepts
```
· Elements: tags like <h1>, <p>, <div>.
· Attributes: provide additional information (e.g., id, class, src).
· Semantic HTML: elements that convey meaning (<header>, <nav>, <footer>).
· Forms: user input collection (<input>, <textarea>).
· Tables & Lists: structured data display.
· Media: <img>, <video>, <audio>.
```
1.6 Syntax

```html
<!DOCTYPE html>
<html>
<head>
  <title>Page Title</title>
</head>
<body>
  <h1>Heading</h1>
  <p>Paragraph</p>
</body>
</html>
```

1.7 Basic Example

```html
<h1>My First Web Page</h1>
<p>This is a paragraph.</p>
<a href="https://example.com">Visit Example</a>
```

1.8 Practical Example

A simple contact form:

```html
<form action="/submit" method="POST">
  <label for="name">Name:</label>
  <input type="text" id="name" name="name" required>
  <label for="email">Email:</label>
  <input type="email" id="email" name="email" required>
  <button type="submit">Submit</button>
</form>
```

1.9 Real-World Usage

Every website uses HTML. In React, HTML is generated via JSX (JavaScript XML), which compiles to HTML.

1.10 Common Mistakes

· Not using semantic elements (using <div> for everything).
· Forgetting alt attributes on images.
· Improper nesting of tags.
· Missing <!DOCTYPE html>.

1.11 Best Practices

· Use semantic HTML5 tags.
· Always include alt for images.
· Keep structure clean and indented.
· Validate HTML with W3C validator.
· Use labels with form inputs.

1.12 Interview Questions

Q1. What is HTML?
Answer: HTML is the standard markup language for creating web pages. It describes the structure of a webpage using elements like headings, paragraphs, and links.

Q2. What is semantic HTML?
Answer: Semantic HTML uses elements that carry meaning about their content, like <header>, <footer>, <article>, improving accessibility and SEO.

Q3. Difference between <div> and <span>?
Answer: <div> is block-level, used for grouping larger sections; <span> is inline, used for small pieces of text or inline styling.

---

2. CSS

2.1 Definition

CSS (Cascading Style Sheets) is a style sheet language used to describe the presentation of a document written in HTML. It controls layout, colors, fonts, spacing, and responsive design.

2.2 Why It Exists

CSS separates content (HTML) from presentation, enabling consistent styling across multiple pages and easier maintenance.

2.3 Purpose

· Style web pages visually.
· Create responsive layouts.
· Improve user experience.

2.4 Core Concepts

· Selectors: target elements (class, id, element, attribute).
· Box Model: content, padding, border, margin.
· Flexbox & Grid: layout systems.
· Responsive Design: media queries.
· Specificity & Cascade: rule precedence.

2.5 Syntax

```css
selector {
  property: value;
}
```

2.6 Basic Example

```css
body {
  font-family: Arial, sans-serif;
  background-color: #f0f0f0;
}
h1 {
  color: blue;
}
```

2.7 Practical Example

Centering a container with Flexbox:

```css
.container {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
}
```

2.8 Real-World Usage

In React, styling can be done via CSS files, CSS modules, styled-components, Tailwind, etc.

2.9 Common Mistakes

· Overuse of !important.
· Not using responsive units.
· Ignoring CSS specificity leading to conflicts.
· Not resetting default browser styles.

2.10 Best Practices

· Use a naming convention (BEM, etc.).
· Keep selectors simple.
· Use CSS variables for theming.
· Minimize global styles; prefer component-scoped CSS.

2.11 Interview Questions

Q1. What is the CSS box model?
Answer: The box model consists of content, padding, border, and margin. It determines how elements are sized and spaced.

Q2. What is Flexbox?
Answer: Flexbox is a one-dimensional layout method for arranging items in rows or columns, allowing easy alignment and distribution of space.

Q3. What is the difference between em and rem?
Answer: em is relative to the font size of the parent element, while rem is relative to the root element's font size.

---

3. JavaScript

3.1 Variables

Definition

Variables are containers for storing data values.

Why It Exists

JavaScript needs a way to store and manipulate data dynamically.

Purpose

To hold values that can be used and changed throughout the program.

Core Concepts

· var (function-scoped, legacy)
· let (block-scoped, modern)
· const (block-scoped, immutable reference)

Syntax

```javascript
let name = "John";
const age = 30;
var isActive = true; // avoid var
```

Basic Example

```javascript
let x = 5;
x = 10;
console.log(x); // 10
```

Common Mistakes

· Using var unintentionally causing hoisting issues.
· Reassigning const.
· Not initializing variables.

Best Practices

· Always use const by default, let when reassignment is needed.
· Avoid var.
· Use meaningful names.

Interview Questions

Q: What is the difference between let, const, and var?
Answer: var is function-scoped and can be redeclared; let is block-scoped and can be reassigned but not redeclared; const is block-scoped and cannot be reassigned or redeclared.

---

3.2 Data Types

Definition

JavaScript has dynamic types: primitive types (string, number, boolean, null, undefined, symbol, bigint) and reference types (object, array, function).

Why It Exists

Different data types allow representing different kinds of information.

Core Concepts

· Primitive: immutable, stored by value.
· Reference: mutable, stored by reference.

Examples

```javascript
let str = "Hello";        // string
let num = 42;             // number
let bool = true;          // boolean
let nothing = null;       // null
let undef;                // undefined
let obj = {a:1};          // object
let arr = [1,2,3];        // array (object)
```

Interview Questions

Q: What is the difference between null and undefined?
Answer: undefined means a variable has been declared but not assigned a value; null is an assignment value representing no value or empty object.

---

3.3 Operators

Definition

Operators perform operations on operands.

Types

· Arithmetic: + - * / %
· Assignment: = += -=
· Comparison: == === != !== > <
· Logical: && || !
· Ternary: condition ? expr1 : expr2
· Spread/Rest: ...

Important: == vs ===

== performs type coercion, === does not. Always use ===.

Interview Questions

Q: What is the difference between == and ===?
Answer: == compares values after type coercion; === compares both value and type without coercion, making it safer.

---

3.4 Functions

Definition

A function is a block of code designed to perform a particular task, executed when invoked.

Why It Exists

To reuse code, modularize logic, and avoid repetition.

Syntax

```javascript
function greet(name) {
  return `Hello, ${name}`;
}
```

Arrow Function (ES6)

```javascript
const greet = (name) => `Hello, ${name}`;
```

Interview Questions

Q: What is the difference between function declarations and function expressions?
Answer: Function declarations are hoisted and can be called before definition; function expressions are not hoisted.

---

3.5 Arrays

Definition

Arrays are ordered lists of values, accessed by index.

Why It Exists

To store multiple items in a single variable.

Core Methods

· push, pop, shift, unshift
· map, filter, reduce, find, forEach
· slice, splice, concat, includes

Examples

```javascript
const numbers = [1,2,3];
numbers.push(4);
const doubled = numbers.map(n => n*2);
const evens = numbers.filter(n => n%2 === 0);
const sum = numbers.reduce((acc,n) => acc+n, 0);
```

Interview Questions

Q: Difference between map and forEach?
Answer: map returns a new array with transformed elements; forEach just iterates and returns undefined.

---

3.6 Objects

Definition

Objects are collections of key-value pairs.

Why It Exists

To represent more complex data structures.

Syntax

```javascript
const person = {
  name: "Alice",
  age: 25,
  greet() { return `Hi, I'm ${this.name}`; }
};
```

Accessing Properties

· Dot notation: person.name
· Bracket notation: person['name']

Interview Questions

Q: How do you check if a property exists in an object?
Answer: Use 'prop' in obj or obj.hasOwnProperty('prop').

---

3.7 Destructuring

Definition

Destructuring allows unpacking values from arrays or objects into distinct variables.

Examples

```javascript
const [a, b] = [1,2];
const {name, age} = person;
```

Why Use

Concise code, less repetitive.

---

3.8 Spread & Rest

Spread (...)

Expands elements of an array or object.

```javascript
const arr1 = [1,2];
const arr2 = [...arr1, 3]; // [1,2,3]
const obj1 = {a:1};
const obj2 = {...obj1, b:2}; // {a:1,b:2}
```

Rest (...)

Collects remaining elements into an array.

```javascript
function sum(...nums) {
  return nums.reduce((a,b) => a+b, 0);
}
```

---

3.9 Modules

Definition

ES6 modules allow splitting code into separate files, exporting and importing functionality.

Export

```javascript
// math.js
export const add = (a,b) => a+b;
export default function multiply(a,b) { return a*b; }
```

Import

```javascript
import multiply, { add } from './math.js';
```

Why Use

Code organization, reusability, dependency management.

---

3.10 Promises

Definition

A Promise is an object representing the eventual completion or failure of an asynchronous operation.

States

· Pending
· Fulfilled
· Rejected

Syntax

```javascript
const promise = new Promise((resolve, reject) => {
  setTimeout(() => resolve("Done"), 1000);
});
promise.then(result => console.log(result));
```

Why Use

To handle asynchronous operations more cleanly than callbacks.

---

3.11 async / await

Definition

Syntactic sugar over Promises, allowing asynchronous code to be written in a synchronous style.

Example

```javascript
async function fetchData() {
  try {
    const response = await fetch(url);
    const data = await response.json();
    return data;
  } catch (error) {
    console.error(error);
  }
}
```

Why Use

Improves readability, easier error handling.

---

3.12 Fetch API

Definition

The Fetch API provides an interface for making HTTP requests (GET, POST, etc.) from the browser.

Example

```javascript
fetch('https://api.example.com/data')
  .then(res => res.json())
  .then(data => console.log(data));
```

With async/await

```javascript
const res = await fetch(url);
const data = await res.json();
```

---

3.13 DOM

Definition

The Document Object Model is a programming interface for web documents, representing the page structure as a tree of objects.

Why It Exists

Allows JavaScript to manipulate HTML and CSS dynamically.

Key Methods

· document.getElementById
· document.querySelector
· element.innerHTML
· element.style
· element.addEventListener

---

3.14 Events

Definition

Events are actions that occur in the browser (click, submit, keydown, etc.).

Handling

```javascript
button.addEventListener('click', () => {
  console.log('Clicked');
});
```

Event Object

Provides details about the event: event.target, event.preventDefault(), etc.

---

3.15 ES6+ Features

· Arrow functions
· Template literals
· Destructuring
· Spread/rest
· Modules
· Classes
· Promises
· Async/await
· let and const
· Default parameters
· Enhanced object literals

---

3.16 Prerequisites Projects (Hands-on)

Beginner

1. Build a static webpage using HTML and CSS.
2. Add a button that changes text using JavaScript.

Intermediate

1. Create a to-do list with add/delete functionality using DOM.
2. Build a simple calculator.

Advanced

1. Build a weather app fetching data from a public API.
2. Create a mini social feed with local storage.

---

4. Quick Revision – Module 00

· HTML defines structure, CSS defines style, JS defines behavior.
· Use const and let, not var.
· Master array methods: map, filter, reduce, find, forEach.
· Understand Promises and async/await for async operations.
· DOM manipulation and event handling are essential for React foundations.

---

5. Interview Questions – Module 00

Beginner

1. What is the DOM?
      The DOM is a tree-like representation of an HTML document, allowing JavaScript to access and modify elements.
2. What is an arrow function?
      A concise syntax for writing functions in ES6, with lexical this binding.

Intermediate

1. Explain the difference between map and filter.
      map transforms each element and returns a new array of the same length; filter returns a new array containing only elements that pass a condition.
2. What is the event loop?
      The event loop is a mechanism that allows JavaScript to perform non-blocking I/O by handling asynchronous callbacks in a queue.

Advanced

1. How does async/await improve over Promises?
      It provides a more readable, synchronous-looking code, making error handling with try/catch straightforward and avoiding chaining.
2. What is the difference between null and undefined?
      undefined is the default value of uninitialized variables; null is an intentional absence of any object value.

---

6. Real-World Scenario

Problem: A news website needs to display a list of articles fetched from a server and allow users to filter by category.

Solution using Module 00 concepts:

· HTML: Structure the article list and filter buttons.
· CSS: Style the layout using Flexbox/Grid.
· JavaScript:
  · Fetch articles using Fetch API with async/await.
  · Store data in an array.
  · Use map to render article cards.
  · Use filter to show only selected category.
  · Attach click events to filter buttons.
  · Update DOM dynamically.

---

7. Common Mistakes (Module 00)

1. Using var – leads to scoping bugs; use let/const.
2. Not handling Promises correctly – always use .catch or try/catch.
3. Mutating state directly in React later – but here, immutable patterns matter.
4. Ignoring semantic HTML – harms accessibility and SEO.
5. Not using === – can cause unexpected type coercion.

---

8. Best Practices (Module 00)

· Write clean, modular code.
· Use consistent naming conventions (camelCase for variables/functions).
· Prefer const over let when reassignment is not needed.
· Use template literals for string concatenation.
· Understand and utilize array methods instead of manual loops.
· Always handle asynchronous errors.

---

This is the complete Module 00 of the handbook. If you want me to continue with Module 01: React Setup, please say “continue”.

Module 01: React Setup

1. Overview

This module covers the foundational tools and configuration required to set up a React development environment. You will learn about npm (Node Package Manager), different ways to scaffold a React application, project structure, dependency management files (package.json and package-lock.json), and environment variables using .env files.

Understanding this module is essential before writing any React code because it establishes the foundation for building, running, and deploying React applications.

---

2. npm

2.1 Definition

npm stands for Node Package Manager. It is the default package manager for Node.js, used to install, share, and manage dependencies in JavaScript projects. npm consists of:

· A command-line tool (npm)
· An online registry (npmjs.com) where packages are published
· A set of scripts and configuration files to manage dependencies

2.2 Why It Exists

Before npm, developers had to manually download and include JavaScript libraries. npm solves this by:

· Automating dependency installation
· Managing versions
· Enabling easy sharing of reusable code
· Running scripts (build, test, start)

2.3 Purpose

· Install project dependencies
· Manage global tools
· Run scripts defined in package.json
· Publish your own packages

2.4 Prerequisites

· Node.js installed (includes npm)
· Basic command-line knowledge

2.5 Core Concepts

· Packages: Reusable pieces of code (libraries, frameworks, tools)
· Dependencies: Packages required by your project
· Semantic Versioning (SemVer): Version format MAJOR.MINOR.PATCH
· Registry: Central repository (npmjs.com)

2.6 Syntax / Common Commands

```bash
# Initialize a new package.json
npm init

# Initialize with defaults
npm init -y

# Install a dependency (local)
npm install <package-name>

# Install as dev dependency
npm install <package-name> --save-dev

# Install globally
npm install -g <package-name>

# Remove a dependency
npm uninstall <package-name>

# Run a script
npm run <script-name>

# List installed packages
npm list

# Update packages
npm update
```

2.7 Basic Example

```bash
# Create a new project folder
mkdir my-app
cd my-app

# Initialize package.json
npm init -y

# Install React and React DOM
npm install react react-dom

# Install a dev dependency
npm install --save-dev vite
```

After running npm install, a node_modules folder is created, and dependencies are added to package.json.

2.8 Practical Example

Setting up a React project with npm:

```bash
npm init -y
npm install react react-dom
npm install --save-dev @vitejs/plugin-react vite
```

2.9 Real-World Usage

Every modern JavaScript project uses npm (or an alternative like Yarn/pnpm) to manage dependencies. In React development, you'll use npm to install libraries like React Router, Axios, Redux, etc.

2.10 Common Mistakes

· Forgetting to save dependencies (--save is default in npm 5+, but still be aware)
· Installing global packages when local is sufficient
· Not using package-lock.json or ignoring version conflicts
· Using npm install with wrong flags

2.11 Best Practices

· Use npm install to add dependencies (it updates package.json automatically)
· Use --save-dev for build/test tools
· Commit package-lock.json to version control
· Use npm ci in CI/CD for reproducible installs

2.12 Interview Questions

Q1: What is npm?
Answer: npm is the default package manager for Node.js, used to install, manage, and share JavaScript packages. It also provides a command-line interface and an online registry.

Q2: What is the difference between dependencies and devDependencies?
Answer: dependencies are required for the application to run in production, while devDependencies are only needed during development and testing (e.g., build tools, testing frameworks).

Q3: What is Semantic Versioning?
Answer: Semantic Versioning (SemVer) uses a three-part version number MAJOR.MINOR.PATCH to communicate compatibility. Incrementing MAJOR indicates breaking changes, MINOR adds backward-compatible features, and PATCH fixes bugs.

---

3. npm React App (Create React App)

3.1 Definition

Create React App (CRA) is an officially supported, zero-configuration tool for setting up a React application. It abstracts away build configuration (webpack, Babel) and provides a pre-configured environment with a development server, testing, and production build scripts.

Note: CRA is being phased out in favor of more modern tools like Vite. The React team no longer recommends it for new projects. However, it is still widely used and relevant for legacy projects and learning.

3.2 Why It Exists

Setting up React manually requires configuring Babel, webpack, ESLint, etc. CRA solved this by providing a batteries-included template, allowing developers to start coding immediately.

3.3 Purpose

· Quick React project initialization
· Standardized project structure
· Built-in development server with hot reload
· Production build optimization

3.4 Prerequisites

· Node.js and npm
· Basic terminal knowledge

3.5 How to Create a React App with npm

```bash
npx create-react-app my-app
cd my-app
npm start
```

npx is used to run the package without globally installing it. It downloads the latest CRA template.

3.6 Project Structure (CRA)

```
my-app/
├── node_modules/
├── public/
│   ├── index.html
│   └── ...
├── src/
│   ├── App.js
│   ├── App.css
│   ├── index.js
│   └── ...
├── .gitignore
├── package.json
├── package-lock.json
└── README.md
```

3.7 Key Files

· public/index.html – main HTML file where React mounts
· src/index.js – entry point, renders <App /> into the root DOM node
· src/App.js – root component

3.8 Advantages

· Zero configuration
· Includes testing setup (Jest)
· Built-in environment variable support
· Easy to eject (if needed)

3.9 Disadvantages

· Slower build times (webpack based)
· Heavy dependencies
· Not easily customizable without ejecting
· Being deprecated in favor of Vite/Next.js

3.10 Comparison: CRA vs Vite

Feature Create React App Vite
Build Tool Webpack esbuild / Rollup
Dev Server Speed Slower Very fast (ES modules)
Configuration Hidden Minimal (vite.config.js)
Production Build Webpack Rollup
Current Status Deprecated Recommended

3.11 Interview Questions

Q: What is Create React App?
Answer: It is a zero-configuration tool for creating React applications, providing a pre-configured setup with webpack, Babel, and development server.

Q: Why is CRA being phased out?
Answer: CRA is becoming less recommended due to slower performance and lack of flexibility. Modern tools like Vite offer faster builds and more control. The React team now recommends using frameworks like Next.js or Vite for new projects.

---

4. Global npm App

4.1 Definition

A global npm package is installed system-wide, making its command-line tools available from any directory. Global packages are typically CLI tools (e.g., create-react-app, vite, nodemon).

4.2 Why It Exists

Some tools are used across multiple projects and not tied to a specific project. Installing them globally allows convenient access from anywhere.

4.3 Installation

```bash
npm install -g <package-name>
```

Example:

```bash
npm install -g create-react-app
```

After installation, you can run:

```bash
create-react-app my-app
```

4.4 Common Global Packages

· nodemon – auto-restart Node.js server
· eslint – linting tool
· vite – build tool
· typescript – TypeScript compiler

4.5 When to Use Global vs Local

· Global: CLI tools that are not part of the project's runtime dependencies (e.g., code generators).
· Local: All project-specific dependencies.

4.6 Best Practices

· Prefer npx to run one-off commands without global install (e.g., npx create-react-app my-app).
· Avoid installing too many global packages to prevent version conflicts.
· Use npm ls -g --depth=0 to list global packages.

4.7 Interview Questions

Q: What is the difference between global and local npm packages?
Answer: Global packages are installed system-wide and available as command-line tools from any directory, while local packages are installed in the node_modules of a specific project and only available within that project context.

---

5. Vite App

5.1 Definition

Vite is a modern build tool that provides a faster and leaner development experience for web projects. It uses native ES modules in development and bundles with Rollup in production. Vite is not limited to React; it supports Vue, Svelte, etc., but has excellent React support via plugins.

5.2 Why It Exists

Vite was created to address the slow startup and hot module replacement (HMR) of traditional bundlers like webpack. By leveraging native ES modules, Vite serves files on demand, dramatically improving dev server speed.

5.3 Purpose

· Fast development server
· Instant hot module replacement (HMR)
· Optimized production builds
· Modern tooling (TypeScript, JSX, CSS preprocessors out of the box)

5.4 Creating a Vite React App

```bash
npm create vite@latest my-react-app -- --template react
cd my-react-app
npm install
npm run dev
```

Or using yarn/pnpm:

```bash
yarn create vite my-react-app --template react
pnpm create vite my-react-app --template react
```

5.5 Project Structure (Vite React)

```
my-react-app/
├── node_modules/
├── public/
│   └── vite.svg
├── src/
│   ├── assets/
│   ├── App.css
│   ├── App.jsx
│   ├── index.css
│   └── main.jsx
├── .gitignore
├── index.html
├── package.json
├── package-lock.json
└── vite.config.js
```

Key differences from CRA:

· index.html is at the root, not inside public/
· Entry point is src/main.jsx
· vite.config.js allows customization

5.6 Configuration (vite.config.js)

```javascript
import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'

export default defineConfig({
  plugins: [react()],
  server: {
    port: 3000,
  },
})
```

5.7 Advantages

· Extremely fast dev server
· Lower memory footprint
· Native ES modules support
· Simple configuration
· Supports React Fast Refresh

5.8 Disadvantages

· Ecosystem is newer (though now mature)
· Some webpack-specific plugins not available
· Production build uses Rollup, may need additional config for advanced cases

5.9 Comparison: Vite vs CRA (expanded)

Feature Vite CRA
Startup time Instant Slow
HMR speed Fast Slower
Config file vite.config.js Hidden (or eject)
Production bundler Rollup Webpack
React support Official plugin Built-in
Learning curve Low Very low
Community Growing rapidly Mature but deprecated

5.10 Best Practices

· Use Vite for new React projects (recommended)
· Keep vite.config.js minimal; add plugins as needed
· Use environment variables with import.meta.env (different from CRA)
· For production, npm run build produces optimized static files in dist/

5.11 Interview Questions

Q: What is Vite and why is it faster than webpack?
Answer: Vite is a modern build tool that uses native ES modules during development, serving source files on demand instead of bundling everything upfront. This eliminates the initial bundling step, resulting in near-instant startup and fast HMR. For production, it uses Rollup to bundle.

Q: How do you create a React app with Vite?
Answer: Use npm create vite@latest my-app -- --template react, then npm install and npm run dev.

---

6. Project Structure

6.1 Definition

A well-organized project structure is crucial for maintainability and scalability. While CRA and Vite provide default structures, larger applications benefit from additional organization.

6.2 Common React Project Structure (Feature-Based)

```
src/
├── components/          # Reusable UI components
│   ├── Button/
│   │   ├── Button.jsx
│   │   └── Button.css
│   └── ...
├── features/            # Feature-specific components and logic
│   ├── auth/
│   │   ├── Login.jsx
│   │   └── authSlice.js
│   └── dashboard/
├── hooks/               # Custom hooks
├── services/            # API calls, business logic
├── store/               # State management (Redux, Context)
├── utils/               # Helper functions
├── assets/              # Images, fonts, static files
├── App.jsx
└── main.jsx
```

6.3 Why It Exists

A clear structure helps teams navigate code, reduces duplication, and makes it easier to add new features without breaking existing ones.

6.4 Key Considerations

· Component Reusability: Keep reusable components separate from feature-specific ones.
· Layers: Separate UI, business logic, and data fetching.
· Scalability: Structure should accommodate growth.

6.5 Best Practices

· Start simple; don't over-engineer
· Use consistent naming (PascalCase for components, camelCase for files)
· Group by feature, not by file type, for larger apps
· Avoid deeply nested folders

6.6 Example: Simple Vite React Project Layout

```
src/
├── components/
│   ├── Header.jsx
│   └── Footer.jsx
├── pages/
│   ├── Home.jsx
│   └── About.jsx
├── App.jsx
└── main.jsx
```

6.7 Interview Questions

Q: How do you structure a large React application?
Answer: I prefer a feature-based structure where related components, hooks, and state logic are grouped together. I also separate reusable components into a components folder and keep services/API calls in a separate services folder to maintain a clear separation of concerns.

---

7. package.json

7.1 Definition

package.json is a JSON file that contains metadata about the project and manages its dependencies, scripts, and configuration. It is the heart of any Node.js/npm project.

7.2 Why It Exists

It serves as a manifest for the project, allowing npm to install dependencies, run scripts, and provide information about the project.

7.3 Structure

```json
{
  "name": "my-app",
  "version": "1.0.0",
  "description": "A React application",
  "main": "src/main.jsx",
  "scripts": {
    "dev": "vite",
    "build": "vite build",
    "preview": "vite preview"
  },
  "dependencies": {
    "react": "^18.2.0",
    "react-dom": "^18.2.0"
  },
  "devDependencies": {
    "@vitejs/plugin-react": "^4.0.0",
    "vite": "^5.0.0"
  }
}
```

7.4 Key Fields

· name: Project name (lowercase, no spaces)
· version: Current version (SemVer)
· scripts: Custom commands executed via npm run <script>
· dependencies: Packages required in production
· devDependencies: Packages required only for development
· peerDependencies: Dependencies expected to be provided by the host environment
· engines: Specify required Node/npm versions

7.5 Scripts

Scripts are used to automate tasks:

```json
"scripts": {
  "start": "vite",
  "build": "vite build",
  "test": "vitest",
  "lint": "eslint ."
}
```

Run with:

```bash
npm run build
```

7.6 Best Practices

· Keep package name and version accurate
· Use npm install <pkg> to automatically update package.json
· Use npm pkg set to modify fields programmatically
· Document custom scripts in README

7.7 Interview Questions

Q: What is package.json?
Answer: package.json is a manifest file that contains project metadata, scripts, and dependency information. It enables npm to install dependencies and run scripts.

Q: What are dependencies vs devDependencies?
Answer: dependencies are packages required at runtime, while devDependencies are only needed during development, such as build tools and test frameworks.

---

8. package-lock.json

8.1 Definition

package-lock.json is an auto-generated file that locks the exact version of every dependency and sub-dependency in the project. It ensures reproducible installs across different environments.

8.2 Why It Exists

Without a lock file, npm would resolve dependency versions based on semver ranges (e.g., ^1.2.0), which could lead to different versions being installed at different times, causing bugs. package-lock.json records the exact resolved versions, ensuring consistency.

8.3 How It Works

When you run npm install, npm:

1. Reads package.json
2. Determines the dependency tree
3. Records the exact resolved versions in package-lock.json
4. Subsequent npm install uses the lock file to install identical versions

8.4 Important Rules

· Commit package-lock.json to version control (for applications)
· Do not manually edit it
· Use npm ci in CI/CD to install exactly from the lock file (faster and deterministic)
· npm install may update the lock file if package.json changes

8.5 Difference Between package.json and package-lock.json

Aspect package.json package-lock.json
Purpose Metadata, scripts, dependency ranges Exact dependency tree
Editable Yes, manually No, generated
Committed Yes Yes (applications)
Version info Ranges (^1.0.0) Exact (1.2.3)

8.6 Interview Questions

Q: What is package-lock.json?
Answer: It is a lock file generated by npm that records the exact version of every installed dependency and its dependencies, ensuring consistent installs across environments.

Q: Why should you commit package-lock.json?
Answer: Committing it ensures all team members and CI/CD pipelines use identical dependency versions, preventing unexpected bugs caused by version drift.

---

9. Environment Variables

9.1 Definition

Environment variables are dynamic values that affect the behavior of running processes. In React applications, they are used to store configuration settings such as API endpoints, keys, and feature flags without hardcoding them in source code.

9.2 Why It Exists

Separating configuration from code allows the same codebase to run in different environments (development, staging, production) with different settings. It also improves security by keeping secrets out of source code.

9.3 How to Use Environment Variables in React

· Create React App: Variables must be prefixed with REACT_APP_ and placed in .env files.
· Vite: Variables must be prefixed with VITE_ and accessed via import.meta.env.

9.4 .env Files

A .env file contains key-value pairs:

```
REACT_APP_API_URL=https://api.example.com
```

For Vite:

```
VITE_API_URL=https://api.example.com
```

9.5 Different .env Files

· .env – Default
· .env.local – Local overrides (not committed)
· .env.development – Development-specific
· .env.production – Production-specific
· .env.test – Test-specific

Priority: .env.local > specific env > .env

9.6 Accessing Environment Variables

CRA:

```javascript
const apiUrl = process.env.REACT_APP_API_URL;
```

Vite:

```javascript
const apiUrl = import.meta.env.VITE_API_URL;
```

9.7 Important Rules

· Do not commit .env files (add to .gitignore)
· Add .env.example to document required variables
· Restart dev server after changing .env
· Never store secrets in frontend code (anything in React is exposed to the browser)

9.8 Common Mistakes

· Forgetting to prefix variables correctly (REACT_APP_ or VITE_)
· Committing sensitive .env files to version control
· Not restarting server after changing env variables

9.9 Best Practices

· Use .env.local for local overrides
· Keep environment variable names consistent across environments
· Use a library like dotenv in Node.js (built-in in Vite and CRA)
· For security, never put API keys that must remain secret in frontend environment variables

9.10 Interview Questions

Q: How do you use environment variables in React?
Answer: In Create React App, variables must start with REACT_APP_ and are accessed via process.env.REACT_APP_*. In Vite, variables start with VITE_ and are accessed via import.meta.env.VITE_*.

Q: Why should .env files not be committed?
Answer: They often contain sensitive information like API keys, database URLs, or tokens. Committing them exposes secrets to anyone with repository access.

---

10. Real-World Scenario

Problem: A React application needs to consume an API whose URL changes depending on the environment (development uses localhost, production uses a cloud URL). The same code should run in both without modifications.

Solution: Use environment variables.

· Create .env.development:
  ```
  VITE_API_URL=http://localhost:3000/api
  ```
· Create .env.production:
  ```
  VITE_API_URL=https://api.myapp.com
  ```
· In code:
  ```javascript
  const apiUrl = import.meta.env.VITE_API_URL;
  fetch(apiUrl);
  ```

When building for production (npm run build), Vite automatically loads .env.production and sets the correct URL.

---

11. Module 01 – Quick Revision

· npm is the package manager for JavaScript.
· Create React App is deprecated; use Vite for new React projects.
· package.json defines dependencies and scripts; package-lock.json locks exact versions.
· Use npm install to add dependencies; npm ci for CI.
· Environment variables are stored in .env files; prefixes differ (REACT_APP_ vs VITE_).
· Never commit .env files with secrets.

---

12. Interview Questions – Module 01

Beginner

1. What is npm?
      npm is the Node Package Manager used to install and manage JavaScript packages.
2. What is the purpose of package.json?
      It contains project metadata, dependencies, and scripts.
3. How do you create a React app?
      Using Vite: npm create vite@latest my-app -- --template react, then cd my-app && npm install && npm run dev.

Intermediate

1. Explain the difference between dependencies and devDependencies.
      Dependencies are needed at runtime; devDependencies are only needed during development (e.g., build tools, test frameworks).
2. What is the role of package-lock.json?
      It locks exact versions of all dependencies, ensuring reproducible installs across environments.
3. How do environment variables work in Vite?
      Variables must be prefixed with VITE_ and are accessed via import.meta.env.VITE_*. They are defined in .env files.

Advanced

1. Why is Vite faster than webpack in development?
      Vite serves native ES modules directly, avoiding the need to bundle the entire application before serving. It uses esbuild for pre-bundling dependencies, which is extremely fast. HMR is instantaneous because only the changed module is invalidated.
2. What are the security concerns with environment variables in React?
      All environment variables prefixed with VITE_ or REACT_APP_ are embedded in the client-side bundle and visible to anyone. Therefore, they must never contain secrets like API keys or passwords; only public configuration should be stored there.
3. Explain the difference between npm install and npm ci.
      npm install reads package.json and may update package-lock.json if needed. It is used for local development. npm ci installs exactly from package-lock.json, deleting node_modules first, ensuring a clean, deterministic install. It is preferred in CI/CD.

Scenario-Based

Q: You are setting up a new React project for a team. Which tool would you choose and why?
Answer: I would choose Vite because it is fast, modern, and officially recommended for new React projects. It provides a better developer experience with instant HMR and simpler configuration. I would also set up a consistent project structure, use environment variables for configuration, and commit both package.json and package-lock.json to ensure consistent installs.

---

13. Common Mistakes & Best Practices Summary

Mistake Best Practice
Using CRA for new projects Use Vite or Next.js
Committing .env with secrets Add .env to .gitignore, use .env.example
Not committing package-lock.json Always commit it for applications
Installing packages without flags Use --save-dev for dev tools
Using global packages for project dependencies Keep project deps local

---

This concludes Module 01: React Setup. The next module is Module 02: React Fundamentals, covering JSX, Components, Props, State, and more.


Module 02: React Fundamentals

This module covers the core building blocks of React: JSX, components, props, state, and rendering patterns. By the end of this module, you will understand how React applications are structured and how data flows between components.

---

1. What is React

1.1 Definition

React is an open-source JavaScript library for building user interfaces, primarily for single-page applications (SPAs). It was developed by Facebook (Meta) and released in 2013. React allows developers to create reusable UI components that manage their own state and efficiently update when data changes.

1.2 Why It Exists

React was created to solve the problem of building large, complex, and dynamic web applications. Traditional approaches (vanilla JS + direct DOM manipulation) become difficult to maintain as the UI grows. React introduces a component-based architecture and a declarative programming style, making code more predictable, reusable, and easier to debug.

1.3 Purpose

· Build interactive UIs with reusable components
· Manage UI state efficiently
· Automatically update the DOM when state changes (via virtual DOM)
· Enable single-page application experiences

1.4 Prerequisites

· HTML, CSS, JavaScript (ES6+)
· Understanding of DOM and events

1.5 Core Concepts

· Components: Reusable, independent pieces of UI
· JSX: Syntax extension for writing HTML-like code in JavaScript
· Virtual DOM: In-memory representation of the real DOM
· State & Props: Data management within and between components
· Unidirectional Data Flow: Data flows from parent to child via props

1.6 Internal Working

React uses a virtual DOM and reconciliation to efficiently update the real DOM. When state changes, React creates a new virtual DOM tree, compares it with the previous one (diffing), and applies only the minimal changes to the real DOM.

1.7 Real-World Usage

React is used by companies like Facebook, Instagram, Netflix, Airbnb, and countless others to build dynamic user interfaces.

1.8 Advantages

· Component reuse
· Strong community and ecosystem
· Performance optimizations (virtual DOM)
· Unidirectional data flow simplifies reasoning
· Rich tooling (React DevTools, etc.)

1.9 Disadvantages

· It's a library, not a full framework – requires additional libraries for routing, state management, etc.
· JSX may have a learning curve for developers used to separating HTML and JS
· Rapid ecosystem changes can lead to decision fatigue

1.10 Comparison with Alternatives

Feature React Angular Vue
Type Library Framework Framework
Learning Curve Moderate Steep Gentle
Data Binding One-way Two-way Two-way
Ecosystem Huge Large Medium
Performance Excellent Good Excellent
Use Case Flexible, component-based SPAs Enterprise, full-featured apps Progressive, flexible apps

---

2. Virtual DOM

2.1 Definition

The Virtual DOM (VDOM) is a lightweight JavaScript representation of the real DOM. React maintains a virtual DOM tree in memory and uses it to compute the most efficient way to update the actual DOM.

2.2 Why It Exists

Manipulating the real DOM is slow. By working with a virtual representation and batching changes, React minimizes direct DOM operations, resulting in better performance.

2.3 How It Works

1. On initial render, React creates a virtual DOM tree.
2. When state or props change, React creates a new virtual DOM tree.
3. React diffs the new tree with the old one to find changes.
4. React applies only the necessary changes to the real DOM.

2.4 Internal Working Diagram

```mermaid
flowchart LR
    A[State Change] --> B[New Virtual DOM]
    B --> C[Diff with Old VDOM]
    C --> D[Compute Minimal Updates]
    D --> E[Update Real DOM]
```

2.5 Interview Questions

Q: What is the Virtual DOM and how does it improve performance?
Answer: The Virtual DOM is an in-memory representation of the real DOM. React updates it quickly, diffs it with the previous version, and then applies the minimal set of changes to the real DOM, reducing expensive direct DOM manipulations.

---

3. JSX

3.1 Definition

JSX stands for JavaScript XML. It is a syntax extension for JavaScript that allows writing HTML-like code within JavaScript. JSX is not a separate language; it is transpiled to regular JavaScript function calls (React.createElement).

3.2 Why It Exists

JSX makes it easier to visualize and write UI code because it resembles the structure of the UI itself. It allows mixing JavaScript expressions with HTML-like syntax, making components more readable.

3.3 Syntax

```jsx
const element = <h1>Hello, world!</h1>;
```

Under the hood, this compiles to:

```javascript
const element = React.createElement('h1', null, 'Hello, world!');
```

3.4 JSX Expressions

You can embed any JavaScript expression inside JSX by wrapping it in curly braces {}.

```jsx
const name = 'Alice';
const element = <h1>Hello, {name}</h1>;
```

Expressions can be variables, function calls, ternary operators, etc., but not statements (like if or for).

3.5 JSX Rules

1. Must have a single root element (use fragments if necessary).
2. Tags must be closed (self-closing tags like <img />).
3. Attributes use camelCase (className instead of class, onClick instead of onclick).
4. JavaScript expressions go in {}.
5. Style attribute takes an object with camelCase properties.
6. JSX comments use {/* comment */}.

3.6 Basic Example

```jsx
const user = { firstName: 'John', lastName: 'Doe' };

const greeting = (
  <div>
    <h1>Welcome, {user.firstName}!</h1>
    <p>Your full name is {user.firstName} {user.lastName}.</p>
  </div>
);
```

3.7 Practical Example

Conditional rendering with JSX:

```jsx
const isLoggedIn = true;

return (
  <div>
    {isLoggedIn ? <button>Logout</button> : <button>Login</button>}
  </div>
);
```

3.8 Interview Questions

Q: What is JSX?
Answer: JSX is a syntax extension for JavaScript that allows writing HTML-like code in JavaScript. It is transpiled to React.createElement calls and makes React components more readable and expressive.

---

4. Components

4.1 Definition

Components are the building blocks of a React application. They are independent, reusable pieces of UI that can accept inputs (props) and manage their own state. Components can be functional (using functions) or class-based (using ES6 classes).

4.2 Why It Exists

Components promote reusability, separation of concerns, and maintainability. They allow you to break down a complex UI into smaller, manageable pieces that can be developed, tested, and debugged independently.

4.3 Functional Components

Functional components are the modern standard. They are JavaScript functions that return JSX.

```jsx
function Welcome(props) {
  return <h1>Hello, {props.name}</h1>;
}

// Arrow function equivalent
const Welcome = (props) => <h1>Hello, {props.name}</h1>;
```

4.4 Class Components (legacy)

Class components use ES6 classes and have access to lifecycle methods and state via this.state.

```jsx
class Welcome extends React.Component {
  render() {
    return <h1>Hello, {this.props.name}</h1>;
  }
}
```

Note: Functional components with hooks are now the preferred approach. Class components are mostly legacy, but you should understand them for existing codebases and interviews.

4.5 Component Composition

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

4.6 Interview Questions

Q: What is the difference between functional and class components?
Answer: Functional components are plain JavaScript functions that return JSX and use hooks for state and lifecycle. Class components extend React.Component and use this.state and lifecycle methods. Functional components are simpler, more lightweight, and the modern standard.

---

5. Props

5.1 Definition

Props (short for "properties") are read-only inputs passed from a parent component to a child component. They allow data to flow down the component tree in a unidirectional manner.

5.2 Why It Exists

Props enable component reuse with different data. Without props, each component would be hardcoded, and you couldn't customize its behavior or content.

5.3 Passing Props

```jsx
function Welcome(props) {
  return <h1>Hello, {props.name}</h1>;
}

// Parent component
function App() {
  return <Welcome name="Alice" />;
}
```

5.4 Default Props

You can define default values for props using defaultProps (class components) or default parameter syntax (functional components).

Functional component with default parameter:

```jsx
function Welcome({ name = 'Guest' }) {
  return <h1>Hello, {name}</h1>;
}
```

5.5 Props Destructuring

Destructuring props makes code cleaner by extracting values directly:

```jsx
function Welcome({ name, age }) {
  return <p>{name} is {age} years old.</p>;
}
```

5.6 Props are Immutable

A component should never modify its own props. Props are owned by the parent and passed down. To change data, the child must call a callback function passed from the parent.

5.7 Interview Questions

Q: What are props in React?
Answer: Props are read-only inputs passed from a parent component to a child component. They are immutable and allow data to flow down the component tree.

Q: Can a child modify its props?
Answer: No. Props are immutable. A child can trigger changes by calling a callback function passed via props, which the parent then handles.

---

6. State

6.1 Definition

State is data that is managed within a component and can change over time. Unlike props, state is mutable and is owned by the component itself. When state changes, React re-renders the component to reflect the new data.

6.2 Why It Exists

State allows components to be dynamic and interactive. Without state, components would be static and unable to respond to user actions or data updates.

6.3 useState Hook

The useState hook is the primary way to add state to functional components.

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

6.4 State Updates

State updates are asynchronous. React may batch multiple updates for performance. Use the functional updater form when the new state depends on the previous state:

```jsx
setCount(prevCount => prevCount + 1);
```

6.5 State Immutability

You should never mutate state directly. Always create a new object/array and use the setter function.

Wrong:

```jsx
user.name = 'New Name';
setUser(user); // Mutating original object (bad)
```

Correct:

```jsx
setUser({ ...user, name: 'New Name' });
```

For arrays, use methods like map, filter, concat, or the spread operator to create new arrays.

6.6 Lifting State Up

When multiple components need to share state, the state should be "lifted" to their closest common ancestor. The ancestor holds the state and passes it down as props along with callback functions to update it.

6.7 Interview Questions

Q: What is state in React?
Answer: State is data managed within a component that can change over time. It causes the component to re-render when updated.

Q: Why is state immutability important?
Answer: Direct mutation of state can lead to bugs and prevents React from detecting changes efficiently. Immutability ensures predictable updates and enables performance optimizations like React.memo.

---

7. Parent → Child Communication

7.1 Definition

Data flows from parent to child via props. The parent passes values as attributes, and the child receives them as props.

7.2 Example

```jsx
function Child({ message }) {
  return <p>{message}</p>;
}

function Parent() {
  return <Child message="Hello from parent!" />;
}
```

7.3 Why It's Important

This unidirectional flow makes data flow predictable and easier to debug. It is the foundation of React's data model.

---

8. Child → Parent Communication

8.1 Definition

Children communicate with parents by calling callback functions passed as props. The parent defines a function and passes it to the child. The child invokes it with some data.

8.2 Example

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

8.3 Use Cases

· Form input handling
· Triggering parent state updates from a child

---

9. Sibling Communication

9.1 Definition

Sibling components cannot communicate directly. They must go through their common parent. The parent holds the shared state and passes it down to both siblings.

9.2 Example

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

9.3 Diagram

```mermaid
flowchart TD
    Parent[Parent Component] -->|props data| SiblingA[Sibling A]
    Parent -->|callback function| SiblingB[Sibling B]
    SiblingB -->|calls callback| Parent
    Parent -->|updates state| Parent
    Parent -->|re-renders with new data| SiblingA
```

---

10. Conditional Rendering

10.1 Definition

Conditional rendering in React allows you to show or hide UI elements based on certain conditions. It works the same way as conditions in JavaScript.

10.2 Methods

1. If/else statements (outside JSX)
2. Ternary operator (inside JSX)
3. Logical && operator (for single condition)
4. Switch statement (rare)

10.3 Examples

Ternary:

```jsx
function Greeting({ isLoggedIn }) {
  return (
    <div>
      {isLoggedIn ? <h1>Welcome back!</h1> : <h1>Please sign in.</h1>}
    </div>
  );
}
```

Logical &&:

```jsx
function Notification({ hasNewMessages }) {
  return (
    <div>
      {hasNewMessages && <p>You have new messages!</p>}
    </div>
  );
}
```

If/else outside JSX:

```jsx
function UserStatus({ isLoading }) {
  if (isLoading) {
    return <p>Loading...</p>;
  } else {
    return <p>Loaded!</p>;
  }
}
```

10.4 Best Practices

· Prefer ternary for simple conditions; use && when rendering only when condition is true.
· Avoid complex logic inside JSX; extract to variables or helper functions.

---

11. List Rendering

11.1 Definition

List rendering is the process of generating multiple JSX elements from an array of data. React uses the map() method to transform each item into JSX.

11.2 Example

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

11.3 Keys

Keys are special attributes that help React identify which items have changed, been added, or removed. They should be unique among siblings and stable across renders.

· Use a unique identifier from the data (e.g., id) instead of array index when possible.
· Index can be used as a last resort if the list is static and has no reordering.

Why keys matter: Without keys, React may re-render items inefficiently, causing performance issues and state loss.

---

12. Fragments

12.1 Definition

Fragments allow grouping multiple elements without adding an extra DOM node. They are declared using <React.Fragment> or the shorthand <>...</>.

12.2 Why Use Fragments

Sometimes you need to return multiple siblings from a component, but JSX requires a single root. Using a <div> wrapper adds an unnecessary DOM node, which can affect CSS and layout. Fragments solve this.

12.3 Example

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

You can also pass a key to fragments when rendering lists:

```jsx
<React.Fragment key={item.id}>
  ...
</React.Fragment>
```

---

13. Component Composition

13.1 Definition

Component composition is the practice of building complex UIs by combining simpler components. Instead of creating monolithic components, you compose smaller ones together, using props and children.

13.2 Example

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

13.3 Special children Prop

The children prop is automatically passed to components and contains any nested JSX. It allows you to create wrapper components that can accept arbitrary content.

---

14. Module 02 – Quick Revision

· React is a component-based UI library.
· JSX is HTML-like syntax in JavaScript.
· Components are reusable functions returning JSX.
· Props are read-only inputs; state is internal mutable data.
· Data flows down (parent→child); child→parent via callbacks.
· Use useState for state, keep state immutable.
· Keys are essential for list rendering.
· Fragments avoid extra DOM nodes.
· Composition is the core pattern for building UIs.

---

15. Interview Questions – Module 02

Beginner

1. What is a component in React?
      A component is a reusable piece of UI, defined as a function or class, that returns JSX and can accept props.
2. What is the difference between state and props?
      Props are read-only and passed from parent to child. State is internal to a component and can be changed over time.
3. What is JSX?
      JSX is a syntax extension that allows writing HTML-like code in JavaScript, which is transpiled to React.createElement calls.

Intermediate

1. Explain how child-to-parent communication works.
      The parent passes a callback function as a prop to the child. The child invokes that function with data, which the parent then uses to update its state.
2. What is the purpose of keys in list rendering?
      Keys help React identify which items have changed, been added, or removed. They enable efficient diffing and preserve component state during re-renders.
3. Why should you avoid using array index as key?
      Using index as key can cause issues when the list order changes, leading to incorrect state updates and performance problems. It's better to use a stable unique identifier from the data.

Advanced

1. How does React's virtual DOM diffing work at a high level?
      When state changes, React creates a new virtual DOM tree and compares it with the previous one. It finds differences and then updates only the changed parts of the real DOM, minimizing expensive DOM operations.
2. What is "lifting state up" and why is it necessary?
      Lifting state up means moving shared state to the closest common ancestor of components that need it. This is necessary for sibling components to share data and ensures a single source of truth.
3. Explain the concept of component composition and its benefits.
      Composition involves building complex UIs from smaller, reusable components. It promotes reusability, separation of concerns, and makes code easier to maintain and test.

Scenario-Based

Q: You have a list of 1000 items and notice slow re-renders when updating one item. What would you do?
Answer: I would first ensure that each item has a stable, unique key. Then I'd consider using React.memo on the item component to prevent unnecessary re-renders if the props haven't changed. If the list is extremely long, I'd implement virtualization (e.g., react-window) to render only visible items.

Coding Questions

1. Write a functional component that takes a name prop and displays a greeting.
   ```jsx
   function Greeting({ name }) {
     return <h1>Hello, {name}!</h1>;
   }
   ```
2. Create a counter component with increment and decrement buttons using useState.
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
3. Given an array of objects [{id:1, name:'Alice'}, {id:2, name:'Bob'}], render an unordered list of names.
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

---

16. Common Mistakes & Best Practices (Module 02)

Mistake Best Practice
Mutating state directly Always create a new object/array and use setter
Using array index as key Use stable unique IDs
Not returning a single root from component Use fragments (<>) when needed
Forgetting to close JSX tags Always close tags (self-closing)
Using class instead of className Use className in JSX
Placing complex logic inside JSX Extract logic to variables/functions

---

17. Real-World Scenario: Building a Simple Comment System

Problem: You need to display a list of comments and allow users to add new ones. The input form is in a separate component, and the list is in another. Both need to share state.

Solution:

· Lift the comments state to the parent component (App).
· Pass comments array to CommentList as props.
· Pass a callback function to CommentForm to add new comments.
· Use controlled input to manage form state.

Architecture:

```mermaid
flowchart LR
    App[App Component] -->|comments| CommentList[Comment List]
    App -->|onAddComment| CommentForm[Comment Form]
    CommentForm -->|calls onAddComment| App
    App -->|updates state| App
    App -->|re-renders| CommentList
```

Implementation (simplified):

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

---

This concludes Module 02: React Fundamentals. The next module will cover Events & DOM.




Module 03: Events & DOM

This module covers how React handles events and interacts with the Document Object Model (DOM). You will learn about event handling, synthetic events, event propagation, common event types, and how to access and manipulate DOM elements using refs. By the end, you will be able to build interactive components that respond to user input and integrate with the underlying DOM when necessary.

---

1. Event Handling

1.1 Definition

Event handling in React refers to the process of responding to user interactions (clicks, keyboard input, form submissions, etc.) by attaching event listener functions to JSX elements. React uses a declarative syntax where event handlers are passed as props, typically named with the on prefix (e.g., onClick, onChange).

1.2 Why It Exists

Web applications are interactive; they must respond to user actions. React provides a unified, cross-browser way to handle events using its synthetic event system, abstracting away browser inconsistencies and providing performance optimizations through event delegation.

1.3 Purpose

· Capture user input and interactions
· Trigger state updates and side effects
· Create dynamic, responsive UIs

1.4 Syntax

```jsx
<button onClick={handleClick}>Click me</button>
```

The handler function can be defined inline or passed as a reference.

1.5 Basic Example

```jsx
function App() {
  const handleClick = () => {
    alert('Button clicked!');
  };

  return <button onClick={handleClick}>Click</button>;
}
```

1.6 Important Notes

· React events are named using camelCase (e.g., onClick not onclick).
· Event handlers receive a SyntheticEvent object, not the native event.
· In React, return false does not prevent default behavior; you must call preventDefault().

---

2. Synthetic Events

2.1 Definition

A SyntheticEvent is a cross-browser wrapper around the browser's native event. React creates these objects to normalize event properties and behavior across different browsers.

2.2 Why It Exists

To ensure consistent event handling regardless of browser differences. It also enables React's event pooling (though pooling is mostly removed in React 17+), where synthetic events are reused for performance.

2.3 Key Characteristics

· Implements the same interface as native events (e.g., preventDefault, stopPropagation, target, currentTarget).
· In React 17+, event pooling is no longer performed; each event is a fresh object.
· Synthetic events are automatically destroyed after the event handler completes (in older versions), so you cannot access event properties asynchronously unless you call event.persist() (deprecated in React 17).

2.4 Accessing Native Event

You can access the underlying native event via event.nativeEvent.

2.5 Example

```jsx
function App() {
  const handleClick = (event) => {
    console.log(event);          // SyntheticEvent
    console.log(event.nativeEvent); // NativeEvent
  };

  return <button onClick={handleClick}>Click</button>;
}
```

---

3. Event Object

3.1 Definition

The event object is the parameter passed to the event handler. In React, it is a SyntheticEvent instance that contains information about the event (e.g., target element, mouse coordinates, key pressed).

3.2 Common Properties

Property Description
target The element that triggered the event
currentTarget The element the handler is attached to (in React, often the same as target unless using delegation)
type The event type (e.g., 'click')
preventDefault() Prevents the default browser action
stopPropagation() Stops the event from bubbling further

3.3 Example

```jsx
const handleChange = (event) => {
  console.log(event.target.value); // Input's current value
};
```

---

4. Event Propagation

4.1 Definition

Event propagation describes the path an event takes through the DOM tree. It consists of three phases:

1. Capturing phase: The event travels from the root to the target element.
2. Target phase: The event reaches the target.
3. Bubbling phase: The event travels back up from the target to the root.

4.2 Why It Matters

Understanding propagation allows you to control event flow, implement event delegation, and avoid unintended side effects.

---

5. Event Bubbling

5.1 Definition

Event bubbling is the process where an event triggered on a child element "bubbles" up to its ancestors. If a parent has an event listener for the same event type, it will be invoked after the child's handler.

5.2 Example

```jsx
function App() {
  const handleChildClick = () => console.log('Child clicked');
  const handleParentClick = () => console.log('Parent clicked');

  return (
    <div onClick={handleParentClick}>
      <button onClick={handleChildClick}>Click</button>
    </div>
  );
}
// Output on click: "Child clicked" then "Parent clicked"
```

5.3 In React

React's synthetic events also bubble, but they are attached to the root of the React tree (React 17+) for delegation, though the behavior from the developer's perspective remains the same.

---

6. Event Capturing

6.1 Definition

Event capturing is the opposite of bubbling: the event travels from the root down to the target element. In React, capturing is less commonly used, but you can attach capturing-phase listeners by appending Capture to the event name (e.g., onClickCapture).

6.2 Example

```jsx
<div onClickCapture={handleParentCapture}>
  <button onClick={handleChildClick}>Click</button>
</div>
```

When clicking the button, handleParentCapture fires first, then handleChildClick.

---

7. stopPropagation

7.1 Definition

stopPropagation() is a method on the SyntheticEvent that stops the event from continuing to propagate (bubbling or capturing) further in the DOM tree.

7.2 Why Use It

To prevent parent event handlers from being triggered when a child is clicked, ensuring isolated behavior.

7.3 Example

```jsx
const handleChildClick = (event) => {
  event.stopPropagation();
  console.log('Child clicked');
};
const handleParentClick = () => console.log('Parent clicked');

<div onClick={handleParentClick}>
  <button onClick={handleChildClick}>Click</button>
</div>
// Output: only "Child clicked"
```

7.4 Caution

Overusing stopPropagation can make event flow harder to debug. Use it only when necessary.

---

8. preventDefault

8.1 Definition

preventDefault() prevents the browser's default action associated with the event (e.g., form submission, link navigation, context menu).

8.2 Why Use It

To handle events entirely in JavaScript without triggering native browser behavior.

8.3 Example: Prevent form submission

```jsx
const handleSubmit = (event) => {
  event.preventDefault();
  // Perform custom form handling
};

<form onSubmit={handleSubmit}>
  <button type="submit">Submit</button>
</form>
```

---

9. Mouse Events

9.1 Definition

Mouse events are triggered by interactions with a mouse (or touchpad). Common React mouse events include:

· onClick
· onDoubleClick
· onMouseDown
· onMouseUp
· onMouseEnter
· onMouseLeave
· onMouseMove
· onContextMenu

9.2 Example

```jsx
function App() {
  const handleMouseEnter = () => console.log('Mouse entered');
  const handleMouseLeave = () => console.log('Mouse left');

  return (
    <div onMouseEnter={handleMouseEnter} onMouseLeave={handleMouseLeave}>
      Hover over me
    </div>
  );
}
```

---

10. Keyboard Events

10.1 Definition

Keyboard events are triggered by key presses. Common events:

· onKeyDown
· onKeyUp
· onKeyPress (deprecated in favor of onKeyDown)

10.2 Event Properties

· key: The character or key name (e.g., 'Enter', 'a').
· code: The physical key position (e.g., 'Enter', 'KeyA').
· altKey, ctrlKey, shiftKey, metaKey: Boolean modifiers.

10.3 Example: Handling Enter key

```jsx
const handleKeyDown = (event) => {
  if (event.key === 'Enter') {
    console.log('Enter pressed');
  }
};

<input onKeyDown={handleKeyDown} />
```

---

11. Form Events

11.1 Definition

Form events are specific to form elements and submission. The most common is onSubmit, but also onChange, onInput, onInvalid, etc.

11.2 Example: Controlled form with submit

```jsx
function Form() {
  const [name, setName] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    alert(`Submitted: ${name}`);
  };

  return (
    <form onSubmit={handleSubmit}>
      <input value={name} onChange={(e) => setName(e.target.value)} />
      <button type="submit">Submit</button>
    </form>
  );
}
```

---

12. Change Events

12.1 Definition

onChange fires when the value of an input, textarea, or select element changes. In React, onChange behaves like the input event (fires on every keystroke) rather than the native change event (fires on blur).

12.2 Example

```jsx
const [text, setText] = useState('');
<input value={text} onChange={(e) => setText(e.target.value)} />
```

12.3 Why It Differs from Native

React normalizes onChange to provide consistent behavior across browsers, making it fire for every input change, which is essential for controlled components.

---

13. Focus Events

13.1 Definition

Focus events occur when an element gains or loses focus. Common events:

· onFocus: When element receives focus.
· onBlur: When element loses focus.

13.2 Example

```jsx
<input 
  onFocus={() => console.log('Focused')}
  onBlur={() => console.log('Blurred')}
/>
```

---

14. useRef

14.1 Definition

useRef is a React hook that returns a mutable ref object whose .current property is initialized to the provided argument. It persists across renders and can be used to store any mutable value, but is most commonly used to access DOM elements.

14.2 Why It Exists

To allow imperative access to DOM elements and to store mutable values without causing re-renders.

14.3 Syntax

```jsx
const ref = useRef(initialValue);
```

14.4 Accessing DOM Elements

```jsx
import { useRef, useEffect } from 'react';

function App() {
  const inputRef = useRef(null);

  useEffect(() => {
    inputRef.current.focus(); // Focus the input on mount
  }, []);

  return <input ref={inputRef} />;
}
```

14.5 Important Notes

· Changing ref.current does not trigger a re-render.
· Attach ref to a JSX element using the ref attribute.
· In functional components, refs cannot be passed as props (but can be forwarded via forwardRef).

---

15. DOM Manipulation

15.1 Definition

React encourages a declarative approach where you update state and let React update the DOM. However, there are cases where you need to directly manipulate DOM elements (e.g., focusing, measuring sizes, integrating with third-party libraries). This is done using refs.

15.2 When to Use Direct DOM Manipulation

· Managing focus, selection, or media playback
· Triggering animations
· Integrating with non-React libraries
· Measuring element dimensions/positions

15.3 Best Practices

· Use refs sparingly; prefer declarative state/props when possible.
· Perform DOM reads/writes inside useEffect to avoid side effects during render.
· Clean up any DOM changes to avoid memory leaks.

---

16. Accessing DOM Elements

16.1 Using Callback Refs (alternative to useRef)

```jsx
function App() {
  let myElement = null;

  const setRef = (element) => {
    myElement = element;
  };

  useEffect(() => {
    if (myElement) {
      // Do something
    }
  }, []);

  return <div ref={setRef}>Hello</div>;
}
```

16.2 Using useRef with multiple elements (array of refs)

```jsx
const itemsRef = useRef([]);

<div ref={el => itemsRef.current[i] = el}>Item</div>
```

---

17. Forwarding Refs

17.1 Definition

Ref forwarding is a technique that allows a parent component to pass a ref down to a child component, giving the parent direct access to the child's DOM node or component instance.

17.2 Why It Exists

Functional components do not have instances, and refs are not accessible via props. forwardRef solves this by enabling ref forwarding to inner DOM elements or class components.

17.3 Syntax

```jsx
const Child = React.forwardRef((props, ref) => {
  return <input ref={ref} {...props} />;
});

function Parent() {
  const inputRef = useRef(null);
  return <Child ref={inputRef} />;
}
```

17.4 Use Cases

· Wrapping a custom input component that needs to expose focus/blur methods
· Integrating with higher-order components that need to pass refs

17.5 Example: Custom Input with forwardRef

```jsx
const TextInput = forwardRef((props, ref) => {
  return <input type="text" ref={ref} {...props} />;
});

function Parent() {
  const ref = useRef();
  const focusInput = () => ref.current.focus();
  return (
    <>
      <TextInput ref={ref} />
      <button onClick={focusInput}>Focus</button>
    </>
  );
}
```

---

18. Module 03 – Quick Revision

· React events are synthetic, camelCase, and attached via props.
· preventDefault stops default behavior; stopPropagation stops bubbling.
· Event propagation has capturing, target, and bubbling phases.
· useRef provides mutable references to DOM elements and values.
· Direct DOM manipulation is done via refs, ideally in useEffect.
· forwardRef allows passing refs to child components.

---

19. Interview Questions – Module 03

Beginner

1. How do you handle a button click in React?
      Attach an onClick prop to the button with a function handler.
2. What is a synthetic event?
      A cross-browser wrapper around native events that provides consistent behavior and properties.
3. What is the difference between preventDefault and stopPropagation?
      preventDefault stops the browser's default action; stopPropagation stops the event from bubbling to parent elements.

Intermediate

1. Explain event bubbling and capturing in React.
      Bubbling is when an event propagates from the target element up to ancestors; capturing is the opposite (from root to target). React events bubble by default; capturing is achieved with onClickCapture style props.
2. How do you access a DOM element in React?
      Using the useRef hook: create a ref, attach it via the ref attribute, and access the element via ref.current.
3. What is the purpose of forwardRef?
      It allows a parent component to pass a ref down to a child, giving direct access to the child's DOM node or instance.

Advanced

1. How does React's event delegation work?
      In React 17+, React attaches event listeners to the root DOM container (the element where the React tree is mounted) rather than to individual elements. Events are then dispatched to the appropriate component via synthetic event propagation.
2. Why is it not recommended to directly mutate the DOM in React?
      Direct DOM mutations can lead to inconsistencies between React's virtual DOM and the real DOM, causing bugs when React tries to reconcile changes. React should own the DOM; use refs only for imperative operations that cannot be done declaratively.
3. How would you manage focus on an input after it mounts?
      Use a ref and useEffect to focus the input when the component mounts:
   ```jsx
   useEffect(() => {
     inputRef.current.focus();
   }, []);
   ```

Scenario-Based

Q: You have a custom dropdown component and need to close it when clicking outside. How would you implement this?
Answer: Use a ref for the dropdown container, and add an event listener to the document for mousedown or click that checks if the click target is outside the ref. If outside, call a function to close the dropdown. Clean up the listener in useEffect to avoid leaks.

Coding Questions

1. Write a component that logs the value of an input every time the user types.

```jsx
function LogInput() {
  const [value, setValue] = useState('');
  const handleChange = (e) => {
    setValue(e.target.value);
    console.log(e.target.value);
  };
  return <input value={value} onChange={handleChange} />;
}
```

2. Create a button that prevents its default action when clicked (e.g., for a form submit).

```jsx
function SubmitButton() {
  const handleClick = (e) => {
    e.preventDefault();
    console.log('Default prevented');
  };
  return <button type="submit" onClick={handleClick}>Submit</button>;
}
```

---

20. Common Mistakes & Best Practices

Mistake Best Practice
Forgetting to call preventDefault on form submit Always handle form submission in onSubmit with preventDefault
Mutating the DOM directly instead of using state Use refs only for imperative tasks, rely on React state for UI
Attaching event listeners manually inside components without cleanup Use useEffect with cleanup or React's synthetic events
Overusing stopPropagation Use sparingly; consider alternative designs
Not using forwardRef when needed Use forwardRef to expose DOM handles in custom components

---

21. Real-World Scenario: Autocomplete Input

Problem: Build an autocomplete input that suggests items based on user typing. It must focus automatically on mount, close suggestions when clicking outside, and handle keyboard navigation (arrow keys, Enter).

Solution using this module's concepts:

· Use useRef to focus the input on mount.
· Use onChange to update state and filter suggestions.
· Use onKeyDown to handle arrow keys and Enter.
· Use a ref for the suggestions container and document event listener (via useEffect) to close when clicking outside.
· Use preventDefault to prevent form submission on Enter.

Implementation (simplified):

```jsx
import { useState, useRef, useEffect } from 'react';

function Autocomplete({ items }) {
  const [query, setQuery] = useState('');
  const [filtered, setFiltered] = useState([]);
  const [open, setOpen] = useState(false);
  const inputRef = useRef(null);
  const containerRef = useRef(null);

  useEffect(() => {
    inputRef.current.focus();
    const handleClickOutside = (e) => {
      if (containerRef.current && !containerRef.current.contains(e.target)) {
        setOpen(false);
      }
    };
    document.addEventListener('mousedown', handleClickOutside);
    return () => document.removeEventListener('mousedown', handleClickOutside);
  }, []);

  const handleChange = (e) => {
    const value = e.target.value;
    setQuery(value);
    setFiltered(items.filter(item => item.toLowerCase().includes(value.toLowerCase())));
    setOpen(true);
  };

  const handleKeyDown = (e) => {
    if (e.key === 'Enter') {
      e.preventDefault();
      setOpen(false);
    }
  };

  return (
    <div ref={containerRef}>
      <input
        ref={inputRef}
        value={query}
        onChange={handleChange}
        onKeyDown={handleKeyDown}
      />
      {open && filtered.length > 0 && (
        <ul>
          {filtered.map(item => <li key={item}>{item}</li>)}
        </ul>
      )}
    </div>
  );
}
```

---

This concludes Module 03: Events & DOM. The next module is Module 04: Components & Lifecycle.



Module 03: Events & DOM

This module covers how React handles events and interacts with the Document Object Model (DOM). You will learn about event handling, synthetic events, event propagation, common event types, and how to access and manipulate DOM elements using refs. By the end, you will be able to build interactive components that respond to user input and integrate with the underlying DOM when necessary.

---

1. Event Handling

1.1 Definition

Event handling in React refers to the process of responding to user interactions (clicks, keyboard input, form submissions, etc.) by attaching event listener functions to JSX elements. React uses a declarative syntax where event handlers are passed as props, typically named with the on prefix (e.g., onClick, onChange).

1.2 Why It Exists

Web applications are interactive; they must respond to user actions. React provides a unified, cross-browser way to handle events using its synthetic event system, abstracting away browser inconsistencies and providing performance optimizations through event delegation.

1.3 Purpose

· Capture user input and interactions
· Trigger state updates and side effects
· Create dynamic, responsive UIs

1.4 Syntax

```jsx
<button onClick={handleClick}>Click me</button>
```

The handler function can be defined inline or passed as a reference.

1.5 Basic Example

```jsx
function App() {
  const handleClick = () => {
    alert('Button clicked!');
  };

  return <button onClick={handleClick}>Click</button>;
}
```

1.6 Important Notes

· React events are named using camelCase (e.g., onClick not onclick).
· Event handlers receive a SyntheticEvent object, not the native event.
· In React, return false does not prevent default behavior; you must call preventDefault().

---

2. Synthetic Events

2.1 Definition

A SyntheticEvent is a cross-browser wrapper around the browser's native event. React creates these objects to normalize event properties and behavior across different browsers.

2.2 Why It Exists

To ensure consistent event handling regardless of browser differences. It also enables React's event pooling (though pooling is mostly removed in React 17+), where synthetic events are reused for performance.

2.3 Key Characteristics

· Implements the same interface as native events (e.g., preventDefault, stopPropagation, target, currentTarget).
· In React 17+, event pooling is no longer performed; each event is a fresh object.
· Synthetic events are automatically destroyed after the event handler completes (in older versions), so you cannot access event properties asynchronously unless you call event.persist() (deprecated in React 17).

2.4 Accessing Native Event

You can access the underlying native event via event.nativeEvent.

2.5 Example

```jsx
function App() {
  const handleClick = (event) => {
    console.log(event);          // SyntheticEvent
    console.log(event.nativeEvent); // NativeEvent
  };

  return <button onClick={handleClick}>Click</button>;
}
```

---

3. Event Object

3.1 Definition

The event object is the parameter passed to the event handler. In React, it is a SyntheticEvent instance that contains information about the event (e.g., target element, mouse coordinates, key pressed).

3.2 Common Properties

Property Description
target The element that triggered the event
currentTarget The element the handler is attached to (in React, often the same as target unless using delegation)
type The event type (e.g., 'click')
preventDefault() Prevents the default browser action
stopPropagation() Stops the event from bubbling further

3.3 Example

```jsx
const handleChange = (event) => {
  console.log(event.target.value); // Input's current value
};
```

---

4. Event Propagation

4.1 Definition

Event propagation describes the path an event takes through the DOM tree. It consists of three phases:

1. Capturing phase: The event travels from the root to the target element.
2. Target phase: The event reaches the target.
3. Bubbling phase: The event travels back up from the target to the root.

4.2 Why It Matters

Understanding propagation allows you to control event flow, implement event delegation, and avoid unintended side effects.

---

5. Event Bubbling

5.1 Definition

Event bubbling is the process where an event triggered on a child element "bubbles" up to its ancestors. If a parent has an event listener for the same event type, it will be invoked after the child's handler.

5.2 Example

```jsx
function App() {
  const handleChildClick = () => console.log('Child clicked');
  const handleParentClick = () => console.log('Parent clicked');

  return (
    <div onClick={handleParentClick}>
      <button onClick={handleChildClick}>Click</button>
    </div>
  );
}
// Output on click: "Child clicked" then "Parent clicked"
```

5.3 In React

React's synthetic events also bubble, but they are attached to the root of the React tree (React 17+) for delegation, though the behavior from the developer's perspective remains the same.

---

6. Event Capturing

6.1 Definition

Event capturing is the opposite of bubbling: the event travels from the root down to the target element. In React, capturing is less commonly used, but you can attach capturing-phase listeners by appending Capture to the event name (e.g., onClickCapture).

6.2 Example

```jsx
<div onClickCapture={handleParentCapture}>
  <button onClick={handleChildClick}>Click</button>
</div>
```

When clicking the button, handleParentCapture fires first, then handleChildClick.

---

7. stopPropagation

7.1 Definition

stopPropagation() is a method on the SyntheticEvent that stops the event from continuing to propagate (bubbling or capturing) further in the DOM tree.

7.2 Why Use It

To prevent parent event handlers from being triggered when a child is clicked, ensuring isolated behavior.

7.3 Example

```jsx
const handleChildClick = (event) => {
  event.stopPropagation();
  console.log('Child clicked');
};
const handleParentClick = () => console.log('Parent clicked');

<div onClick={handleParentClick}>
  <button onClick={handleChildClick}>Click</button>
</div>
// Output: only "Child clicked"
```

7.4 Caution

Overusing stopPropagation can make event flow harder to debug. Use it only when necessary.

---

8. preventDefault

8.1 Definition

preventDefault() prevents the browser's default action associated with the event (e.g., form submission, link navigation, context menu).

8.2 Why Use It

To handle events entirely in JavaScript without triggering native browser behavior.

8.3 Example: Prevent form submission

```jsx
const handleSubmit = (event) => {
  event.preventDefault();
  // Perform custom form handling
};

<form onSubmit={handleSubmit}>
  <button type="submit">Submit</button>
</form>
```

---

9. Mouse Events

9.1 Definition

Mouse events are triggered by interactions with a mouse (or touchpad). Common React mouse events include:

· onClick
· onDoubleClick
· onMouseDown
· onMouseUp
· onMouseEnter
· onMouseLeave
· onMouseMove
· onContextMenu

9.2 Example

```jsx
function App() {
  const handleMouseEnter = () => console.log('Mouse entered');
  const handleMouseLeave = () => console.log('Mouse left');

  return (
    <div onMouseEnter={handleMouseEnter} onMouseLeave={handleMouseLeave}>
      Hover over me
    </div>
  );
}
```

---

10. Keyboard Events

10.1 Definition

Keyboard events are triggered by key presses. Common events:

· onKeyDown
· onKeyUp
· onKeyPress (deprecated in favor of onKeyDown)

10.2 Event Properties

· key: The character or key name (e.g., 'Enter', 'a').
· code: The physical key position (e.g., 'Enter', 'KeyA').
· altKey, ctrlKey, shiftKey, metaKey: Boolean modifiers.

10.3 Example: Handling Enter key

```jsx
const handleKeyDown = (event) => {
  if (event.key === 'Enter') {
    console.log('Enter pressed');
  }
};

<input onKeyDown={handleKeyDown} />
```

---

11. Form Events

11.1 Definition

Form events are specific to form elements and submission. The most common is onSubmit, but also onChange, onInput, onInvalid, etc.

11.2 Example: Controlled form with submit

```jsx
function Form() {
  const [name, setName] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    alert(`Submitted: ${name}`);
  };

  return (
    <form onSubmit={handleSubmit}>
      <input value={name} onChange={(e) => setName(e.target.value)} />
      <button type="submit">Submit</button>
    </form>
  );
}
```

---

12. Change Events

12.1 Definition

onChange fires when the value of an input, textarea, or select element changes. In React, onChange behaves like the input event (fires on every keystroke) rather than the native change event (fires on blur).

12.2 Example

```jsx
const [text, setText] = useState('');
<input value={text} onChange={(e) => setText(e.target.value)} />
```

12.3 Why It Differs from Native

React normalizes onChange to provide consistent behavior across browsers, making it fire for every input change, which is essential for controlled components.

---

13. Focus Events

13.1 Definition

Focus events occur when an element gains or loses focus. Common events:

· onFocus: When element receives focus.
· onBlur: When element loses focus.

13.2 Example

```jsx
<input 
  onFocus={() => console.log('Focused')}
  onBlur={() => console.log('Blurred')}
/>
```

---

14. useRef

14.1 Definition

useRef is a React hook that returns a mutable ref object whose .current property is initialized to the provided argument. It persists across renders and can be used to store any mutable value, but is most commonly used to access DOM elements.

14.2 Why It Exists

To allow imperative access to DOM elements and to store mutable values without causing re-renders.

14.3 Syntax

```jsx
const ref = useRef(initialValue);
```

14.4 Accessing DOM Elements

```jsx
import { useRef, useEffect } from 'react';

function App() {
  const inputRef = useRef(null);

  useEffect(() => {
    inputRef.current.focus(); // Focus the input on mount
  }, []);

  return <input ref={inputRef} />;
}
```

14.5 Important Notes

· Changing ref.current does not trigger a re-render.
· Attach ref to a JSX element using the ref attribute.
· In functional components, refs cannot be passed as props (but can be forwarded via forwardRef).

---

15. DOM Manipulation

15.1 Definition

React encourages a declarative approach where you update state and let React update the DOM. However, there are cases where you need to directly manipulate DOM elements (e.g., focusing, measuring sizes, integrating with third-party libraries). This is done using refs.

15.2 When to Use Direct DOM Manipulation

· Managing focus, selection, or media playback
· Triggering animations
· Integrating with non-React libraries
· Measuring element dimensions/positions

15.3 Best Practices

· Use refs sparingly; prefer declarative state/props when possible.
· Perform DOM reads/writes inside useEffect to avoid side effects during render.
· Clean up any DOM changes to avoid memory leaks.

---

16. Accessing DOM Elements

16.1 Using Callback Refs (alternative to useRef)

```jsx
function App() {
  let myElement = null;

  const setRef = (element) => {
    myElement = element;
  };

  useEffect(() => {
    if (myElement) {
      // Do something
    }
  }, []);

  return <div ref={setRef}>Hello</div>;
}
```

16.2 Using useRef with multiple elements (array of refs)

```jsx
const itemsRef = useRef([]);

<div ref={el => itemsRef.current[i] = el}>Item</div>
```

---

17. Forwarding Refs

17.1 Definition

Ref forwarding is a technique that allows a parent component to pass a ref down to a child component, giving the parent direct access to the child's DOM node or component instance.

17.2 Why It Exists

Functional components do not have instances, and refs are not accessible via props. forwardRef solves this by enabling ref forwarding to inner DOM elements or class components.

17.3 Syntax

```jsx
const Child = React.forwardRef((props, ref) => {
  return <input ref={ref} {...props} />;
});

function Parent() {
  const inputRef = useRef(null);
  return <Child ref={inputRef} />;
}
```

17.4 Use Cases

· Wrapping a custom input component that needs to expose focus/blur methods
· Integrating with higher-order components that need to pass refs

17.5 Example: Custom Input with forwardRef

```jsx
const TextInput = forwardRef((props, ref) => {
  return <input type="text" ref={ref} {...props} />;
});

function Parent() {
  const ref = useRef();
  const focusInput = () => ref.current.focus();
  return (
    <>
      <TextInput ref={ref} />
      <button onClick={focusInput}>Focus</button>
    </>
  );
}
```

---

18. Module 03 – Quick Revision

· React events are synthetic, camelCase, and attached via props.
· preventDefault stops default behavior; stopPropagation stops bubbling.
· Event propagation has capturing, target, and bubbling phases.
· useRef provides mutable references to DOM elements and values.
· Direct DOM manipulation is done via refs, ideally in useEffect.
· forwardRef allows passing refs to child components.

---

19. Interview Questions – Module 03

Beginner

1. How do you handle a button click in React?
      Attach an onClick prop to the button with a function handler.
2. What is a synthetic event?
      A cross-browser wrapper around native events that provides consistent behavior and properties.
3. What is the difference between preventDefault and stopPropagation?
      preventDefault stops the browser's default action; stopPropagation stops the event from bubbling to parent elements.

Intermediate

1. Explain event bubbling and capturing in React.
      Bubbling is when an event propagates from the target element up to ancestors; capturing is the opposite (from root to target). React events bubble by default; capturing is achieved with onClickCapture style props.
2. How do you access a DOM element in React?
      Using the useRef hook: create a ref, attach it via the ref attribute, and access the element via ref.current.
3. What is the purpose of forwardRef?
      It allows a parent component to pass a ref down to a child, giving direct access to the child's DOM node or instance.

Advanced

1. How does React's event delegation work?
      In React 17+, React attaches event listeners to the root DOM container (the element where the React tree is mounted) rather than to individual elements. Events are then dispatched to the appropriate component via synthetic event propagation.
2. Why is it not recommended to directly mutate the DOM in React?
      Direct DOM mutations can lead to inconsistencies between React's virtual DOM and the real DOM, causing bugs when React tries to reconcile changes. React should own the DOM; use refs only for imperative operations that cannot be done declaratively.
3. How would you manage focus on an input after it mounts?
      Use a ref and useEffect to focus the input when the component mounts:
   ```jsx
   useEffect(() => {
     inputRef.current.focus();
   }, []);
   ```

Scenario-Based

Q: You have a custom dropdown component and need to close it when clicking outside. How would you implement this?
Answer: Use a ref for the dropdown container, and add an event listener to the document for mousedown or click that checks if the click target is outside the ref. If outside, call a function to close the dropdown. Clean up the listener in useEffect to avoid leaks.

Coding Questions

1. Write a component that logs the value of an input every time the user types.

```jsx
function LogInput() {
  const [value, setValue] = useState('');
  const handleChange = (e) => {
    setValue(e.target.value);
    console.log(e.target.value);
  };
  return <input value={value} onChange={handleChange} />;
}
```

2. Create a button that prevents its default action when clicked (e.g., for a form submit).

```jsx
function SubmitButton() {
  const handleClick = (e) => {
    e.preventDefault();
    console.log('Default prevented');
  };
  return <button type="submit" onClick={handleClick}>Submit</button>;
}
```

---

20. Common Mistakes & Best Practices

Mistake Best Practice
Forgetting to call preventDefault on form submit Always handle form submission in onSubmit with preventDefault
Mutating the DOM directly instead of using state Use refs only for imperative tasks, rely on React state for UI
Attaching event listeners manually inside components without cleanup Use useEffect with cleanup or React's synthetic events
Overusing stopPropagation Use sparingly; consider alternative designs
Not using forwardRef when needed Use forwardRef to expose DOM handles in custom components

---

21. Real-World Scenario: Autocomplete Input

Problem: Build an autocomplete input that suggests items based on user typing. It must focus automatically on mount, close suggestions when clicking outside, and handle keyboard navigation (arrow keys, Enter).

Solution using this module's concepts:

· Use useRef to focus the input on mount.
· Use onChange to update state and filter suggestions.
· Use onKeyDown to handle arrow keys and Enter.
· Use a ref for the suggestions container and document event listener (via useEffect) to close when clicking outside.
· Use preventDefault to prevent form submission on Enter.

Implementation (simplified):

```jsx
import { useState, useRef, useEffect } from 'react';

function Autocomplete({ items }) {
  const [query, setQuery] = useState('');
  const [filtered, setFiltered] = useState([]);
  const [open, setOpen] = useState(false);
  const inputRef = useRef(null);
  const containerRef = useRef(null);

  useEffect(() => {
    inputRef.current.focus();
    const handleClickOutside = (e) => {
      if (containerRef.current && !containerRef.current.contains(e.target)) {
        setOpen(false);
      }
    };
    document.addEventListener('mousedown', handleClickOutside);
    return () => document.removeEventListener('mousedown', handleClickOutside);
  }, []);

  const handleChange = (e) => {
    const value = e.target.value;
    setQuery(value);
    setFiltered(items.filter(item => item.toLowerCase().includes(value.toLowerCase())));
    setOpen(true);
  };

  const handleKeyDown = (e) => {
    if (e.key === 'Enter') {
      e.preventDefault();
      setOpen(false);
    }
  };

  return (
    <div ref={containerRef}>
      <input
        ref={inputRef}
        value={query}
        onChange={handleChange}
        onKeyDown={handleKeyDown}
      />
      {open && filtered.length > 0 && (
        <ul>
          {filtered.map(item => <li key={item}>{item}</li>)}
        </ul>
      )}
    </div>
  );
}
```

---

This concludes Module 03: Events & DOM. The next module is Module 04: Components & Lifecycle.




Module 04: Components & Lifecycle

This module dives deep into React component types, the component lifecycle, and the hooks that manage side effects and performance optimization. Understanding these concepts is crucial for building efficient, bug-free React applications.

---

1. Introduction

React components go through a series of phases from creation to destruction. These phases are collectively called the component lifecycle. In modern React, functional components use hooks like useEffect to handle lifecycle events, while class components use explicit lifecycle methods. This module covers both approaches, with emphasis on hooks as the modern standard.

---

2. Class Components

2.1 Definition

Class components are ES6 classes that extend React.Component. They have access to state via this.state, props via this.props, and lifecycle methods.

2.2 Why They Existed

Before React 16.8 (Hooks), class components were the only way to use state and lifecycle methods. They are still supported but are considered legacy for new code.

2.3 Syntax

```jsx
import React, { Component } from 'react';

class MyComponent extends Component {
  constructor(props) {
    super(props);
    this.state = { count: 0 };
  }

  render() {
    return <div>{this.state.count}</div>;
  }
}
```

2.4 Key Features

· this.state for local state
· Lifecycle methods (componentDidMount, componentDidUpdate, componentWillUnmount)
· this.props for props
· render() method is required

2.5 Common Mistakes

· Forgetting to call super(props) in constructor
· Mutating state directly (should use setState)
· Not binding methods (unless using arrow functions)

2.6 Why Prefer Functional Components?

· Simpler syntax
· Hooks allow same capabilities without class complexities
· Less boilerplate
· Better performance (theoretical)
· Easier testing and code reuse

---

3. Functional Components

3.1 Definition

Functional components are plain JavaScript functions that accept props as an argument and return JSX. They can use hooks to manage state and lifecycle.

3.2 Syntax

```jsx
function MyComponent({ name }) {
  return <div>Hello, {name}</div>;
}

// Arrow function
const MyComponent = ({ name }) => <div>Hello, {name}</div>;
```

3.3 Hooks in Functional Components

Hooks like useState, useEffect, useMemo, useCallback, etc., give functional components the ability to manage state and side effects.

3.4 Advantages

· Less code
· No this binding issues
· Easier to understand and test
· React team recommends functional components for new code

---

4. Component Lifecycle

4.1 Definition

The component lifecycle is the sequence of stages a component goes through from mounting to unmounting. Each stage has associated methods (in class components) or hooks (in functional components) that allow you to execute code at specific times.

4.2 Phases

1. Mounting: Component is created and inserted into the DOM.
2. Updating: Component re-renders due to changes in props or state.
3. Unmounting: Component is removed from the DOM.

4.3 Lifecycle Diagram

```mermaid
flowchart TD
    A[Mounting] --> B[componentDidMount / useEffect]
    B --> C[Updating]
    C --> D[componentDidUpdate / useEffect]
    D --> C
    C --> E[Unmounting]
    E --> F[componentWillUnmount / cleanup]
```

4.4 Mounting Phase

In class components:

· constructor() – Initialize state and bind methods.
· render() – Return JSX.
· componentDidMount() – Called after component is inserted into DOM. Used for side effects (data fetching, subscriptions).

In functional components:

· Component function body (render)
· useEffect(() => { ... }, []) – runs after mount.

4.5 Updating Phase

Triggered by changes in props or state.

Class components:

· render() again
· componentDidUpdate(prevProps, prevState) – called after update. Use for side effects based on changes.

Functional components:

· Re-run function body
· useEffect(() => { ... }, [dependencies]) – runs when dependencies change.
· If no dependency array, runs after every render.

4.6 Unmounting Phase

Class components:

· componentWillUnmount() – called before component is removed. Used for cleanup (clear timers, unsubscribe, cancel network requests).

Functional components:

· Cleanup function returned from useEffect runs on unmount: useEffect(() => { return () => cleanup(); }, []).

---

5. Lifecycle Methods in Class Components

5.1 componentDidMount()

Definition: Called once after the component is mounted to the DOM.

Use Cases:

· Initial data fetching
· Setting up subscriptions
· Adding event listeners
· Starting timers

Example:

```jsx
class UserList extends Component {
  state = { users: [] };

  componentDidMount() {
    fetch('/api/users')
      .then(res => res.json())
      .then(users => this.setState({ users }));
  }

  render() {
    // render users
  }
}
```

5.2 componentDidUpdate(prevProps, prevState)

Definition: Called after every update (re-render) except the initial mount.

Use Cases:

· Respond to prop/state changes
· Perform side effects based on changes
· Compare previous and current values

Example:

```jsx
class UserProfile extends Component {
  componentDidUpdate(prevProps) {
    if (prevProps.userId !== this.props.userId) {
      this.fetchUser(this.props.userId);
    }
  }
}
```

5.3 componentWillUnmount()

Definition: Called immediately before a component is unmounted and destroyed.

Use Cases:

· Clean up timers
· Cancel network requests
· Remove event listeners
· Unsubscribe from stores/websockets

Example:

```jsx
class Timer extends Component {
  componentDidMount() {
    this.timerId = setInterval(() => this.tick(), 1000);
  }

  componentWillUnmount() {
    clearInterval(this.timerId);
  }
}
```

---

6. useEffect

6.1 Definition

useEffect is a hook that allows you to perform side effects in functional components. It combines the functionality of componentDidMount, componentDidUpdate, and componentWillUnmount into a single API.

6.2 Why It Exists

Side effects (data fetching, subscriptions, DOM updates) are not allowed inside the render body because they can cause bugs and UI inconsistency. useEffect runs after render, ensuring the DOM is updated before side effects execute.

6.3 Syntax

```jsx
useEffect(() => {
  // side effect code
  return () => {
    // cleanup (optional)
  };
}, [dependencies]);
```

· Effect function: Runs after render (or dependency change).
· Cleanup function: Runs before the next effect execution and on unmount.
· Dependency array: Controls when the effect runs.

6.4 Dependency Array Behavior

Dependency Array Behavior
Omitted Runs after every render
[] Runs only once after initial mount
[dep1, dep2] Runs after mount and when any dependency changes

6.5 useEffect Cleanup

The cleanup function is used to avoid memory leaks and stale side effects. It runs:

· Before the component unmounts
· Before the effect runs again (if dependencies change)

Example: Event listener with cleanup

```jsx
useEffect(() => {
  const handleResize = () => console.log('resized');
  window.addEventListener('resize', handleResize);

  return () => {
    window.removeEventListener('resize', handleResize);
  };
}, []);
```

6.6 Common Use Cases

· Fetching data on mount
· Subscribing to services
· Setting up intervals/timers
· Manually changing the DOM
· Logging

6.7 Comparison with Class Lifecycle Methods

useEffect Pattern Class Equivalent
useEffect(fn, []) componentDidMount
useEffect(fn, [dep]) componentDidUpdate with condition
useEffect(() => { return cleanup; }, []) componentWillUnmount
useEffect(fn) (no deps) componentDidMount + componentDidUpdate

---

7. useLayoutEffect

7.1 Definition

useLayoutEffect is similar to useEffect, but it fires synchronously after all DOM mutations and before the browser paints. This makes it suitable for reading layout information and synchronously re-rendering.

7.2 Difference from useEffect

· useEffect runs asynchronously after paint.
· useLayoutEffect runs synchronously before paint.
· Use useLayoutEffect when you need to measure or mutate the DOM before the user sees the update.

7.3 Use Cases

· Measuring element dimensions
· Synchronously applying visual changes
· Avoiding flicker

7.4 Syntax

Same as useEffect but with useLayoutEffect.

Example: Measure an element

```jsx
useLayoutEffect(() => {
  const height = ref.current.offsetHeight;
  console.log(height);
}, []);
```

7.5 Caution

Prefer useEffect unless you specifically need to block paint. Overusing useLayoutEffect can hurt performance.

---

8. useMemo

8.1 Definition

useMemo is a hook that memoizes the result of a function. It recomputes the memoized value only when one of its dependencies changes. This avoids expensive calculations on every render.

8.2 Why It Exists

To optimize performance by preventing unnecessary recalculations of expensive computations during re-renders.

8.3 Syntax

```jsx
const memoizedValue = useMemo(() => computeExpensiveValue(a, b), [a, b]);
```

8.4 When to Use

· Expensive calculations (e.g., sorting large arrays, complex math)
· Referential equality needs (passing stable objects to child components wrapped in React.memo)
· Any situation where you want to avoid recalculating a value unless inputs change.

8.5 Basic Example

```jsx
const expensiveResult = useMemo(() => {
  return expensiveFunction(data);
}, [data]);
```

8.6 Do Not Overuse

useMemo itself has overhead. Only use it for genuinely expensive operations. Premature optimization can make code harder to read.

---

9. useCallback

9.1 Definition

useCallback is a hook that returns a memoized version of a callback function. The function reference remains stable between renders unless its dependencies change.

9.2 Why It Exists

To prevent unnecessary re-renders of child components that rely on referential equality of props (e.g., components wrapped in React.memo). Without useCallback, a new function is created every render, causing child components to re-render.

9.3 Syntax

```jsx
const memoizedCallback = useCallback(() => {
  doSomething(a, b);
}, [a, b]);
```

9.4 When to Use

· When passing callbacks to optimized child components (React.memo)
· When the callback is used in dependency arrays of other hooks (e.g., useEffect)
· To maintain stable identity across renders.

9.5 Example

```jsx
const handleClick = useCallback(() => {
  setCount(c => c + 1);
}, []);
```

9.6 Relation to useMemo

useCallback(fn, deps) is equivalent to useMemo(() => fn, deps). It memoizes the function itself, not the result.

---

10. React.memo

10.1 Definition

React.memo is a higher-order component that memoizes a functional component, preventing it from re-rendering if its props are shallowly equal to the previous props.

10.2 Why It Exists

To optimize functional components that render the same output given the same props, avoiding unnecessary renders.

10.3 Syntax

```jsx
const MemoizedComponent = React.memo(MyComponent);
```

You can also pass a custom comparison function:

```jsx
const MemoizedComponent = React.memo(MyComponent, (prevProps, nextProps) => {
  return prevProps.id === nextProps.id;
});
```

10.4 When to Use

· Components that receive complex props but often unchanged
· Pure functional components that render the same output for the same props
· List items that don't depend on frequently changing data

10.5 Example

```jsx
const ListItem = React.memo(({ item }) => {
  return <li>{item.name}</li>;
});
```

10.6 Important Notes

· Shallow comparison: only top-level props are compared.
· If props include objects/arrays, they should be memoized (with useMemo/useCallback) to benefit from React.memo.

---

11. Component Re-rendering

11.1 What Causes Re-rendering?

· State change (via setState or useState setter)
· Parent component re-renders (child re-renders unless React.memo or other optimizations)
· Context value changes (if component consumes context)
· Force update (rare)

11.2 How to Optimize Re-renders

· Use React.memo to skip re-render when props unchanged.
· Use useMemo for expensive calculations.
· Use useCallback to stabilize function props.
· Use useRef for values that shouldn't trigger re-render.
· Split components to isolate re-render boundaries.
· Lift state appropriately; avoid passing unnecessary props.

11.3 Re-render Flow Diagram

```mermaid
flowchart TD
    A[State/Prop Change] --> B[Re-render Component]
    B --> C[Calculate New JSX]
    C --> D[Compare Virtual DOM]
    D --> E[Update Real DOM if needed]
    E --> F[Run Effects if dependencies changed]
```

---

12. Module 04 – Quick Revision

· Class components use lifecycle methods; functional components use hooks.
· useEffect handles side effects; cleanup function runs on unmount or before next effect.
· Dependency array controls effect timing.
· useLayoutEffect runs synchronously before paint.
· useMemo memoizes values; useCallback memoizes functions.
· React.memo prevents re-renders of functional components with same props.
· Re-renders occur on state/prop changes; optimize with memoization.

---

13. Interview Questions – Module 04

Beginner

1. What are the lifecycle phases of a React component?
      Mounting, Updating, and Unmounting.
2. What is useEffect used for?
      To perform side effects in functional components, such as data fetching, subscriptions, or DOM manipulation, after render.
3. What is the difference between class components and functional components?
      Class components use this.state, lifecycle methods, and require a render method. Functional components are simpler functions that use hooks for state and effects.

Intermediate

1. Explain the dependency array in useEffect.
      The dependency array tells React when to run the effect. If omitted, it runs after every render; if [], it runs only once after mount; if it contains values, it runs when any of those values change between renders.
2. What is the cleanup function in useEffect?
      It's a function returned from the effect that runs before the component unmounts and before the effect runs again (if dependencies change). It is used to clean up subscriptions, timers, event listeners, etc.
3. How does React.memo work?
      It performs a shallow comparison of props. If props are the same as the previous render, it skips re-rendering the component, improving performance.

Advanced

1. When would you use useLayoutEffect over useEffect?
      Use useLayoutEffect when you need to read layout information (e.g., element dimensions) or synchronously apply visual changes before the browser paints to avoid flicker. In most cases, useEffect is sufficient.
2. How does useCallback help prevent unnecessary re-renders?
      useCallback returns a memoized function, so its reference doesn't change between renders unless dependencies change. When passed as a prop to a child component wrapped in React.memo, it prevents the child from re-rendering due to a new function reference.
3. Can you explain the difference between useMemo and useCallback?
      useMemo memoizes the return value of a function, preventing expensive recalculations. useCallback memoizes the function itself, preserving its identity. Both optimize performance by avoiding unnecessary work on re-renders.

Scenario-Based

Q: Your component fetches data on mount and displays it. The component sometimes receives a new prop userId and must refetch data. How would you implement this with hooks?
Answer: Use useEffect with [userId] as dependency. Inside the effect, perform the fetch. Also include a cleanup to ignore stale responses:

```jsx
useEffect(() => {
  let isActive = true;
  fetch(`/users/${userId}`)
    .then(res => res.json())
    .then(data => {
      if (isActive) setUser(data);
    });
  return () => { isActive = false; };
}, [userId]);
```

Coding Questions

1. Write a functional component that sets up an interval to increment a counter every second and clears it on unmount.

```jsx
function Timer() {
  const [count, setCount] = useState(0);

  useEffect(() => {
    const id = setInterval(() => setCount(c => c + 1), 1000);
    return () => clearInterval(id);
  }, []);

  return <div>{count}</div>;
}
```

2. Create a component that logs to console whenever a prop value changes, but not on mount.

```jsx
function LogValue({ value }) {
  const firstRender = useRef(true);

  useEffect(() => {
    if (firstRender.current) {
      firstRender.current = false;
      return;
    }
    console.log('Value changed:', value);
  }, [value]);

  return <div>{value}</div>;
}
```

---

14. Common Mistakes & Best Practices

Mistake Best Practice
Forgetting cleanup in useEffect causing memory leaks Always return cleanup when setting up subscriptions, timers, etc.
Not specifying dependency array correctly Include all values used in effect; use ESLint exhaustive-deps rule
Using useLayoutEffect unnecessarily Prefer useEffect; use useLayoutEffect only for pre-paint DOM reads/writes
Overusing useMemo/useCallback Only use for expensive calculations or referential stability needed by memoized children
Using class components in new code Use functional components with hooks
Mutating state directly Use setter functions and immutable updates

---

15. Real-World Scenario: Data Fetching with Loading and Error States

Problem: Build a user profile component that fetches user data from an API, shows a loading spinner while fetching, displays an error message if the request fails, and updates when a different user ID is selected.

Solution:

· Use useState for user, loading, error.
· Use useEffect with [userId] to fetch data.
· Clean up stale requests with a flag.
· Render conditionally based on state.

Architecture:

```mermaid
flowchart TD
    A[UserProfile Component] --> B[useState: user, loading, error]
    A --> C[useEffect fetch on userId change]
    C --> D[Set loading true]
    D --> E[Fetch API]
    E -->|Success| F[Set user, loading false]
    E -->|Error| G[Set error, loading false]
    F --> H[Render user data]
    G --> I[Render error message]
    H --> J[Cleanup on unmount/new effect]
```

Implementation (simplified):

```jsx
import { useState, useEffect } from 'react';

function UserProfile({ userId }) {
  const [user, setUser] = useState(null);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  useEffect(() => {
    let isActive = true;
    setLoading(true);
    setError(null);

    fetch(`/api/users/${userId}`)
      .then(res => {
        if (!res.ok) throw new Error('Failed to fetch');
        return res.json();
      })
      .then(data => {
        if (isActive) {
          setUser(data);
          setLoading(false);
        }
      })
      .catch(err => {
        if (isActive) {
          setError(err.message);
          setLoading(false);
        }
      });

    return () => {
      isActive = false;
    };
  }, [userId]);

  if (loading) return <div>Loading...</div>;
  if (error) return <div>Error: {error}</div>;
  return <div>{user?.name}</div>;
}
```

---

This concludes Module 04: Components & Lifecycle. The next module is Module 05: Hooks, covering all React built-in hooks in depth.




Module 05: Hooks

Hooks are functions that let you "hook into" React state and lifecycle features from functional components. Introduced in React 16.8, they eliminate the need for class components in most cases. This module covers all built-in hooks and the rules for using them, as well as custom hooks.

---

1. Rules of Hooks

1.1 Definition

The Rules of Hooks are two essential rules enforced by React to ensure hooks work correctly:

1. Only call hooks at the top level – not inside loops, conditions, or nested functions.
2. Only call hooks from React functions – either functional components or custom hooks.

1.2 Why They Exist

React relies on the order of hook calls to correctly associate state and effects between renders. Breaking the rules leads to bugs like incorrect state or effect execution.

1.3 Enforcement

The eslint-plugin-react-hooks provides linting rules to enforce these rules automatically.

1.4 Example of Violation

```jsx
// ❌ Bad: conditional hook
if (condition) {
  useState(0); // violates rules
}

// ✅ Good: hook at top level
const [value, setValue] = useState(0);
if (condition) {
  // use value
}
```

1.5 Interview Questions

Q: What are the Rules of Hooks and why are they important?
Answer: Hooks must be called at the top level and only from React functions. React relies on call order to preserve state; violating these rules leads to inconsistent state and bugs.

---

2. useState

2.1 Definition

useState is a hook that adds state to functional components. It returns an array with the current state value and a setter function to update it.

2.2 Why It Exists

To enable functional components to have local state without converting to class components.

2.3 Syntax

```jsx
const [state, setState] = useState(initialValue);
```

· initialValue can be a value or a lazy initializer function (evaluated only once).
· setState can accept a new value or a function that receives the previous state.

2.4 Basic Example

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

2.5 Functional Updates

When the new state depends on the previous state, use the functional form to avoid stale closures:

```jsx
setCount(prevCount => prevCount + 1);
```

2.6 Lazy Initialization

```jsx
const [data] = useState(() => expensiveComputation());
```

2.7 Important Notes

· State updates are asynchronous; React may batch multiple updates.
· Always treat state as immutable.
· The setter function identity is stable; no need to memoize.

2.8 Interview Questions

Q: How does useState work?
Answer: It returns a stateful value and a function to update it. React preserves the state between renders by order of hook calls.

Q: What is the difference between passing a value and a function to the setter?
Answer: Passing a value sets the state directly; passing a function receives the previous state and returns the new state, useful for updates based on the previous state.

---

3. useEffect

3.1 Definition

useEffect is a hook for performing side effects in functional components. It runs after the render is committed to the screen.

3.2 Why It Exists

To handle side effects (data fetching, subscriptions, manual DOM changes) that cannot be done during render.

3.3 Syntax

```jsx
useEffect(() => {
  // effect
  return () => {
    // cleanup (optional)
  };
}, [dependencies]);
```

· If dependencies omitted, runs after every render.
· If [], runs only after mount (and cleanup on unmount).
· If array, runs when any dependency changes.

3.4 Example

```jsx
useEffect(() => {
  document.title = `You clicked ${count} times`;
}, [count]);
```

3.5 Cleanup

Cleanup runs before the next effect and on unmount. Use it for clearing timers, unsubscribing, cancelling requests.

3.6 Common Mistakes

· Forgetting dependency array leads to infinite loops.
· Not including all dependencies causes stale values.
· Not cleaning up subscriptions leads to memory leaks.

3.7 Interview Questions

Q: What is the difference between useEffect and useLayoutEffect?
Answer: useEffect runs asynchronously after paint; useLayoutEffect runs synchronously before paint. Use useLayoutEffect for DOM measurements or visual updates to avoid flicker.

Q: How do you mimic componentDidMount with hooks?
Answer: Use useEffect with an empty dependency array: useEffect(() => { ... }, []).

---

4. useRef

4.1 Definition

useRef returns a mutable ref object whose .current property persists across renders without causing re-renders.

4.2 Why It Exists

To access DOM elements, store mutable values, or keep a reference to a value that doesn't require re-render when changed.

4.3 Syntax

```jsx
const ref = useRef(initialValue);
```

4.4 Example: DOM access

```jsx
const inputRef = useRef(null);
useEffect(() => {
  inputRef.current.focus();
}, []);
<input ref={inputRef} />;
```

4.5 Example: Mutable value without re-render

```jsx
const countRef = useRef(0);
countRef.current++;
```

4.6 Important Notes

· Changing ref.current does not trigger re-render.
· The same ref object is returned on every render.
· Avoid reading/writing refs during render (except lazy initialization).

4.7 Interview Questions

Q: What are the uses of useRef?
Answer: Accessing DOM elements, storing mutable values that don't need re-render, and keeping references for use in effects without triggering re-renders.

---

5. useMemo

5.1 Definition

useMemo memoizes the result of a computation, recomputing only when dependencies change.

5.2 Why It Exists

To optimize expensive calculations and preserve referential equality for objects/arrays passed to memoized children.

5.3 Syntax

```jsx
const memoizedValue = useMemo(() => computeValue(), [deps]);
```

5.4 Example

```jsx
const sortedList = useMemo(() => sortItems(items), [items]);
```

5.5 Important Notes

· Use only for genuinely expensive calculations.
· Overuse can hurt performance and readability.

5.6 Interview Questions

Q: When should you use useMemo?
Answer: When you have a computationally expensive function that should not run on every render unless its inputs change, or when you need to maintain referential equality of an object/array passed to a child wrapped in React.memo.

---

6. useCallback

6.1 Definition

useCallback returns a memoized version of a callback function, keeping its identity stable across renders unless dependencies change.

6.2 Why It Exists

To prevent unnecessary re-renders of child components that rely on referential equality of callback props (e.g., with React.memo).

6.3 Syntax

```jsx
const memoizedCallback = useCallback(() => {
  doSomething(a, b);
}, [a, b]);
```

6.4 Example

```jsx
const handleClick = useCallback(() => {
  setCount(c => c + 1);
}, []);
```

6.5 Relation to useMemo

useCallback(fn, deps) is equivalent to useMemo(() => fn, deps).

6.6 Important Notes

· Use only when necessary; avoid premature optimization.
· The callback itself is recreated if dependencies change.

6.7 Interview Questions

Q: What is the purpose of useCallback?
Answer: To memoize a function so that its reference remains the same between renders unless dependencies change, which helps prevent unnecessary re-renders in memoized child components.

---

7. useReducer

7.1 Definition

useReducer is a hook for managing complex state logic. It accepts a reducer function and initial state, and returns the current state and a dispatch function.

7.2 Why It Exists

To handle state transitions that involve multiple sub-values or when the next state depends on the previous state in a complex way. It's an alternative to useState with more predictable updates.

7.3 Syntax

```jsx
const [state, dispatch] = useReducer(reducer, initialState);
```

Reducer: (state, action) => newState.

7.4 Example

```jsx
const initialState = { count: 0 };

function reducer(state, action) {
  switch (action.type) {
    case 'increment':
      return { count: state.count + 1 };
    case 'decrement':
      return { count: state.count - 1 };
    default:
      return state;
  }
}

function Counter() {
  const [state, dispatch] = useReducer(reducer, initialState);
  return (
    <>
      Count: {state.count}
      <button onClick={() => dispatch({ type: 'increment' })}>+</button>
    </>
  );
}
```

7.5 Lazy Initialization

Third argument: init function to compute initial state.

```jsx
const [state, dispatch] = useReducer(reducer, initialArg, init);
```

7.6 When to Use

· State logic is complex (multiple actions, transitions).
· Next state depends on previous state in a predictable way.
· State updates are frequent and related.

7.7 Interview Questions

Q: When would you use useReducer instead of useState?
Answer: When state logic is complex, involves multiple sub-values, or when the next state depends on the previous state in a complex way. useReducer provides a more predictable state update pattern and makes state transitions easier to test.

---

8. useContext

8.1 Definition

useContext is a hook that subscribes a component to a React context, allowing it to read the current context value without prop drilling.

8.2 Why It Exists

To share global data (theme, user, language) across the component tree without manually passing props through every level.

8.3 Syntax

```jsx
const value = useContext(MyContext);
```

8.4 Example

```jsx
const ThemeContext = createContext('light');

function ThemedButton() {
  const theme = useContext(ThemeContext);
  return <button className={theme}>Button</button>;
}
```

8.5 Important Notes

· The component re-renders when the context value changes.
· Context should be used sparingly for global data; for frequent updates, other solutions (Redux) may be better.

8.6 Interview Questions

Q: What is useContext and when would you use it?
Answer: useContext lets you consume a React context value in a functional component. It's used for sharing global data (e.g., user authentication, theme) without prop drilling.

---

9. useId

9.1 Definition

useId is a hook for generating unique IDs that are stable across server and client, useful for accessibility attributes (like linking label to input).

9.2 Why It Exists

To generate unique IDs for form elements and accessibility, especially in server-rendered or concurrent React applications.

9.3 Syntax

```jsx
const id = useId();
```

9.4 Example

```jsx
function EmailField() {
  const id = useId();
  return (
    <>
      <label htmlFor={id}>Email</label>
      <input id={id} type="email" />
    </>
  );
}
```

9.5 Important Notes

· IDs are globally unique but not guaranteed to be deterministic.
· Do not use for keys in lists; use a stable identifier.

9.6 Interview Questions

Q: What is useId used for?
Answer: It generates unique IDs that are stable across server and client, primarily for accessibility attributes (like htmlFor and id).

---

10. useLayoutEffect

10.1 Definition

useLayoutEffect is similar to useEffect, but it fires synchronously after all DOM mutations and before the browser paints.

10.2 Why It Exists

To perform DOM measurements or synchronous visual updates that must happen before the user sees the UI, preventing flicker.

10.3 Syntax

```jsx
useLayoutEffect(() => {
  // effect
  return () => {
    // cleanup
  };
}, [deps]);
```

10.4 Example: Measure element

```jsx
const ref = useRef();
useLayoutEffect(() => {
  const rect = ref.current.getBoundingClientRect();
  console.log(rect);
}, []);
```

10.5 Differences from useEffect

 useEffect useLayoutEffect
Timing After paint Before paint
Use case Side effects, data fetching DOM measurements, visual updates

10.6 Interview Questions

Q: When would you use useLayoutEffect instead of useEffect?
Answer: Use useLayoutEffect when you need to read layout information (e.g., dimensions) or synchronously modify the DOM before the browser paints to avoid visual glitches.

---

11. useImperativeHandle

11.1 Definition

useImperativeHandle customizes the instance value that is exposed to parent components when using ref. It is used together with forwardRef.

11.2 Why It Exists

To control what a parent component can access via a ref to a child component, exposing only specific methods or properties instead of the entire DOM node or component instance.

11.3 Syntax

```jsx
useImperativeHandle(ref, () => ({
  // exposed methods/properties
  focus: () => { ... }
}), [dependencies]);
```

11.4 Example

```jsx
const Input = forwardRef((props, ref) => {
  const inputRef = useRef();
  useImperativeHandle(ref, () => ({
    focus: () => inputRef.current.focus(),
    clear: () => inputRef.current.value = ''
  }));
  return <input ref={inputRef} />;
});

// Parent
const parentRef = useRef();
<Input ref={parentRef} />;
parentRef.current.focus();
```

11.5 When to Use

When you need to expose imperative methods from a custom component, but not the entire DOM API.

11.6 Interview Questions

Q: What is the purpose of useImperativeHandle?
Answer: It allows a parent component to access only specific methods or properties of a child component via a ref, instead of exposing the entire underlying DOM node or component instance.

---

12. useDebugValue

12.1 Definition

useDebugValue displays a label for custom hooks in React DevTools, making debugging easier.

12.2 Why It Exists

To provide additional information about custom hook state or internal values when inspecting components in DevTools.

12.3 Syntax

```jsx
useDebugValue(value);
// or
useDebugValue(value, formatFunction);
```

12.4 Example

```jsx
function useFriendStatus(friendID) {
  const [isOnline, setIsOnline] = useState(null);
  useDebugValue(isOnline ? 'Online' : 'Offline');
  return isOnline;
}
```

12.5 Important Notes

· Only works inside custom hooks.
· Use sparingly; overuse can clutter DevTools.

12.6 Interview Questions

Q: What is useDebugValue used for?
Answer: It adds a label to custom hooks in React DevTools to help developers inspect internal hook state or values during debugging.

---

13. useTransition

13.1 Definition

useTransition is a hook that returns a stateful value for tracking the pending state of a transition and a function to start it. Transitions are non-blocking, allowing React to keep the UI responsive while rendering lower-priority updates.

13.2 Why It Exists

To improve user experience by marking certain updates as non-urgent, so React can prioritize more important updates (like typing) and avoid blocking the UI.

13.3 Syntax

```jsx
const [isPending, startTransition] = useTransition();
```

13.4 Example

```jsx
function App() {
  const [input, setInput] = useState('');
  const [list, setList] = useState([]);
  const [isPending, startTransition] = useTransition();

  const handleChange = (e) => {
    setInput(e.target.value);
    startTransition(() => {
      // expensive filtering
      setList(filterItems(e.target.value));
    });
  };

  return (
    <>
      <input value={input} onChange={handleChange} />
      {isPending ? 'Loading...' : <List items={list} />}
    </>
  );
}
```

13.5 Important Notes

· Only use for state updates that can be delayed without breaking UX.
· React can interrupt and restart transitions if new urgent updates occur.

13.6 Interview Questions

Q: What is a transition in React and when would you use it?
Answer: A transition is a non-urgent state update that React can interrupt to prioritize more urgent updates (e.g., typing). Use it to keep the UI responsive when performing expensive updates like filtering large lists.

---

14. useDeferredValue

14.1 Definition

useDeferredValue returns a deferred version of a value that lags behind the original. It is useful for keeping the UI responsive when the value is used in expensive rendering, allowing React to show stale content while computing new.

14.2 Why It Exists

To defer re-rendering of parts of the UI that depend on a frequently changing value (e.g., search input) without blocking the input itself.

14.3 Syntax

```jsx
const deferredValue = useDeferredValue(value);
```

14.4 Example

```jsx
function SearchResults({ query }) {
  const deferredQuery = useDeferredValue(query);
  // Expensive computation using deferredQuery
  return <Results query={deferredQuery} />;
}
```

14.5 Difference from useTransition

· useTransition wraps state updates in a callback.
· useDeferredValue works on a value that is already changing; it schedules a deferred version.

14.6 Interview Questions

Q: What is useDeferredValue and how does it improve performance?
Answer: It returns a deferred version of a value, allowing React to keep the UI responsive by rendering stale content temporarily while computing the new value. It's useful for expensive rendering that depends on rapidly changing input.

---

15. useSyncExternalStore

15.1 Definition

useSyncExternalStore is a hook for subscribing to an external store (e.g., Redux store, browser APIs) and reading the current snapshot. It ensures consistency during concurrent rendering.

15.2 Why It Exists

To safely read from external mutable sources in React, avoiding tearing (inconsistent UI) during concurrent rendering and server-side rendering.

15.3 Syntax

```jsx
const state = useSyncExternalStore(subscribe, getSnapshot, getServerSnapshot?);
```

· subscribe: function that registers a callback and returns an unsubscribe function.
· getSnapshot: returns the current snapshot of the store.
· getServerSnapshot: optional, for server rendering.

15.4 Example: Subscribing to a custom store

```jsx
const state = useSyncExternalStore(
  store.subscribe,
  () => store.getState()
);
```

15.5 Use Cases

· Integrating with Redux or other external state management.
· Subscribing to browser APIs (like online status).

15.6 Interview Questions

Q: What problem does useSyncExternalStore solve?
Answer: It provides a safe way to subscribe to external stores and read their current value, ensuring that the component doesn't tear during concurrent rendering by always reading the latest snapshot consistently.

---

16. Custom Hooks

16.1 Definition

Custom hooks are JavaScript functions that start with use and can call other hooks. They allow you to extract and reuse stateful logic across multiple components.

16.2 Why They Exist

To share logic between components without duplicating code or using complex patterns like render props or higher-order components.

16.3 Rules

· Name must start with use.
· Must follow the Rules of Hooks.
· Can accept arguments and return any value.

16.4 Example: useWindowSize

```jsx
function useWindowSize() {
  const [size, setSize] = useState({ width: window.innerWidth, height: window.innerHeight });

  useEffect(() => {
    const handleResize = () => setSize({ width: window.innerWidth, height: window.innerHeight });
    window.addEventListener('resize', handleResize);
    return () => window.removeEventListener('resize', handleResize);
  }, []);

  return size;
}

// Usage
function App() {
  const { width, height } = useWindowSize();
  return <div>{width} x {height}</div>;
}
```

16.5 Benefits

· Reusability of stateful logic.
· Encapsulation of complex behavior.
· Composition of hooks.

16.6 Interview Questions

Q: What is a custom hook and why would you create one?
Answer: A custom hook is a function that starts with use and encapsulates logic using built-in hooks. It enables sharing stateful logic across components, reducing duplication and improving maintainability.

Q: Give an example of when you would create a custom hook.
Answer: When multiple components need to fetch data and handle loading/error states, you could create a useFetch hook that encapsulates the fetching logic and returns { data, loading, error }.

---

17. Module 05 – Quick Revision

· Hooks must be called at top level and only in React functions.
· useState for local state; useReducer for complex state logic.
· useEffect for side effects; useLayoutEffect for pre-paint effects.
· useRef for DOM and mutable values.
· useMemo and useCallback for performance optimization.
· useContext for consuming context.
· useId for unique IDs; useDebugValue for debugging custom hooks.
· useTransition and useDeferredValue for concurrent rendering optimizations.
· useSyncExternalStore for external stores.
· Custom hooks extract and reuse logic.

---

18. Interview Questions – Module 05

Beginner

1. What are hooks?
      Hooks are functions that let you use state and lifecycle features in functional components.
2. Name three built-in hooks and their purpose.
      useState for state, useEffect for side effects, useRef for mutable references and DOM access.
3. What is the first rule of hooks?
      Only call hooks at the top level of your React function.

Intermediate

1. Explain the difference between useMemo and useCallback.
      useMemo memoizes the return value of a function; useCallback memoizes the function itself.
2. How does useReducer differ from useState?
      useReducer is preferable for complex state transitions; it uses a reducer function and dispatch actions. useState is simpler and good for independent state values.
3. What is the cleanup function in useEffect for?
      It runs before the component unmounts and before the next effect execution, used to clean up subscriptions, timers, etc.

Advanced

1. Describe a scenario where you would use useTransition.
      When you have an expensive search/filter operation on a large list, and you want to keep the input responsive while processing the filter in a non-blocking transition.
2. How does useSyncExternalStore prevent tearing?
      It ensures that React always reads a consistent snapshot of external state, even during concurrent rendering, by using the getSnapshot function and subscribing to changes.
3. Can you create a custom hook? Provide an example.
      Example: useLocalStorage that reads/writes a state value to localStorage and keeps it in sync.

Scenario-Based

Q: You need to debounce an input for API calls. How would you implement it with hooks?
Answer: Use useEffect with a timeout inside, clearing the timeout on each change. Or create a custom useDebounce hook.

Coding Questions

1. Write a custom hook useCounter that provides count and increment, decrement functions.

```jsx
function useCounter(initialValue = 0) {
  const [count, setCount] = useState(initialValue);
  const increment = () => setCount(c => c + 1);
  const decrement = () => setCount(c => c - 1);
  return { count, increment, decrement };
}
```

2. Implement a useLocalStorage hook that syncs state with localStorage.

```jsx
function useLocalStorage(key, initialValue) {
  const [storedValue, setStoredValue] = useState(() => {
    try {
      const item = localStorage.getItem(key);
      return item ? JSON.parse(item) : initialValue;
    } catch {
      return initialValue;
    }
  });

  useEffect(() => {
    localStorage.setItem(key, JSON.stringify(storedValue));
  }, [key, storedValue]);

  return [storedValue, setStoredValue];
}
```

---

19. Common Mistakes & Best Practices (Module 05)

Mistake Best Practice
Calling hooks conditionally Always call hooks at the top level
Not including dependencies in useEffect/useMemo/useCallback Use exhaustive-deps lint rule and include all used values
Using useEffect for synchronous DOM measurements Use useLayoutEffect
Overusing useMemo/useCallback Only optimize when necessary; premature optimization complicates code
Mutating state directly Use immutable updates and setter functions
Using index as key in lists Use stable unique IDs
Forgetting to clean up in useEffect Return cleanup function when needed

---

20. Real-World Scenario: Building a Debounced Search Hook

Problem: A search input triggers API calls on every keystroke, causing performance and rate-limiting issues. Need to debounce the input.

Solution: Create a custom hook useDebounce that delays the value.

Implementation:

```jsx
import { useState, useEffect } from 'react';

function useDebounce(value, delay) {
  const [debouncedValue, setDebouncedValue] = useState(value);

  useEffect(() => {
    const handler = setTimeout(() => setDebouncedValue(value), delay);
    return () => clearTimeout(handler);
  }, [value, delay]);

  return debouncedValue;
}

// Usage
function Search() {
  const [query, setQuery] = useState('');
  const debouncedQuery = useDebounce(query, 500);

  useEffect(() => {
    if (debouncedQuery) {
      fetchSearchResults(debouncedQuery);
    }
  }, [debouncedQuery]);

  return <input value={query} onChange={e => setQuery(e.target.value)} />;
}
```

This uses useState and useEffect inside a custom hook, demonstrating hook composition.

---

This concludes Module 05: Hooks. The next module is Module 06: Advanced State, covering Context API, useReducer, state management concepts, and Axios.


Module 06: Advanced State

This module explores advanced state management patterns in React. You will learn how to manage state across components using the Context API, understand concepts like lifting state up and colocation, leverage useReducer for complex state, and integrate Axios for data fetching that feeds into state. By the end, you will be equipped to handle state in medium-to-large applications without external libraries.

---

1. State Management Concepts

1.1 Definition

State management refers to the strategies and patterns used to handle application data that changes over time and influences the UI. In React, state can be local to a component, lifted to a common ancestor, or shared globally through context or external stores.

1.2 Why It Exists

As applications grow, managing state scattered across many components becomes difficult. Without a clear strategy, you encounter prop drilling, inconsistent updates, and hard-to-debug state changes. State management patterns provide structure and predictability.

1.3 Purpose

· Ensure data consistency
· Minimize unnecessary re-renders
· Make state flow predictable
· Facilitate code maintenance and testing

1.4 Types of State

· Local state: Used by a single component (e.g., form inputs)
· Shared state: Needed by multiple components (lifted up)
· Global state: App-wide data (e.g., user, theme)
· Server state: Data fetched from an API (caching, loading, etc.)
· URL state: State represented in the URL (e.g., query params)

1.5 Decision Factors

· Scope: How many components need access?
· Complexity: How many state transitions are involved?
· Frequency: How often does the state update?
· Lifespan: How long does the state persist?

---

2. Lifting State Up

2.1 Definition

Lifting state up is the practice of moving state to the closest common ancestor of components that need to share it. The ancestor owns the state and passes it down as props, along with callback functions to update it.

2.2 Why It Exists

React's unidirectional data flow means state is owned by a single component. When siblings need to share state, lifting it up provides a single source of truth.

2.3 When to Use

· Two or more child components need to read the same state.
· A child component needs to update state that another sibling consumes.

2.4 Example

```jsx
function TemperatureInput({ value, onChange }) {
  return <input value={value} onChange={(e) => onChange(e.target.value)} />;
}

function Calculator() {
  const [temperature, setTemperature] = useState('');

  return (
    <div>
      <TemperatureInput value={temperature} onChange={setTemperature} />
      <BoilingVerdict celsius={temperature} />
    </div>
  );
}
```

2.5 Benefits

· Single source of truth
· Predictable data flow
· Easier debugging

2.6 Downsides

· Can lead to prop drilling if the state must be passed through many levels.

2.7 Interview Question

Q: What does "lifting state up" mean and why is it useful?
Answer: It means moving state to the nearest common ancestor of components that need it, so that multiple components can share and update the same data. This creates a single source of truth and avoids duplication.

---

3. State Colocation

3.1 Definition

State colocation is the principle of placing state as close as possible to where it is used. If only one component uses a piece of state, it should live in that component, not in a global store or a distant parent.

3.2 Why It Exists

Overly centralized state can cause unnecessary re-renders and make components less reusable. Colocation reduces coupling and improves performance by limiting the scope of state changes.

3.3 Example

If a Navbar has a dropdown that toggles, its open/closed state should be inside the Navbar component, not in the root App component.

3.4 Best Practices

· Start with local state; lift only when needed.
· Avoid premature optimization or premature lifting.
· Keep state as local as possible.

3.5 Interview Question

Q: What is state colocation and why is it recommended?
Answer: State colocation means keeping state close to where it is used. It improves performance by reducing re-renders of unrelated components and makes code easier to understand and maintain.

---

4. Derived State

4.1 Definition

Derived state is data that can be computed from existing state or props. Instead of storing it separately, you calculate it during render (or memoize if expensive).

4.2 Why It Exists

Storing redundant state leads to bugs when one value changes but the other doesn't. Derived state ensures consistency and reduces the number of state variables to manage.

4.3 Example

If you have a list of items and a filter string, the filtered list is derived state. You should not store it separately; compute it from the list and filter.

```jsx
const [items, setItems] = useState([...]);
const [filter, setFilter] = useState('');

const filteredItems = items.filter(item => item.includes(filter));
```

4.4 When to Use useMemo for Derived State

If the computation is expensive, wrap it in useMemo to avoid recalculating on every render.

```jsx
const filteredItems = useMemo(() => expensiveFilter(items, filter), [items, filter]);
```

4.5 Common Mistake

Storing both items and filteredItems in state and updating both when filter changes. This can cause inconsistency if one update is forgotten.

4.6 Interview Question

Q: What is derived state and why should you avoid storing it?
Answer: Derived state is state that can be computed from other state/props. Storing it duplicates data and risks inconsistency; computing it keeps a single source of truth.

---

5. useReducer (Advanced Patterns)

5.1 Overview

useReducer is a hook that manages state using a reducer function. It is particularly useful for complex state logic with multiple actions and transitions.

5.2 When to Prefer useReducer over useState

· State involves multiple sub-values that must be updated together.
· Transitions depend on previous state in nontrivial ways.
· Many actions cause similar state changes.
· You want to separate state transition logic from component code.

5.3 Advanced Example: Shopping Cart

```jsx
const initialState = { items: [], total: 0 };

function cartReducer(state, action) {
  switch (action.type) {
    case 'ADD_ITEM': {
      const newItems = [...state.items, action.payload];
      return { items: newItems, total: state.total + action.payload.price };
    }
    case 'REMOVE_ITEM': {
      const removed = state.items.find(item => item.id === action.payload.id);
      const newItems = state.items.filter(item => item.id !== action.payload.id);
      return { items: newItems, total: state.total - removed.price };
    }
    case 'CLEAR':
      return initialState;
    default:
      return state;
  }
}

function Cart() {
  const [state, dispatch] = useReducer(cartReducer, initialState);
  // ...
}
```

5.4 Lazy Initialization with useReducer

```jsx
const [state, dispatch] = useReducer(reducer, initialArg, init);
```

init is a function that receives initialArg and returns the initial state. Useful when the initial state is expensive to compute.

5.5 Combining with Context

useReducer is often paired with Context to provide a global state management solution.

5.6 Interview Question

Q: How would you use useReducer for a complex form with many fields?
Answer: Use a reducer that handles actions for each field update, validation, and submission, keeping all form state in one object and dispatching actions to update it.

---

6. useContext (In-Depth)

6.1 Definition

useContext subscribes a functional component to a Context object. It reads the current context value from the nearest matching Provider above the component.

6.2 Why It Exists

To consume context without the render-prop pattern or Context.Consumer, making component code cleaner.

6.3 Syntax

```jsx
const value = useContext(MyContext);
```

6.4 Context Value Equality

React uses reference equality (Object.is) to determine if the context value changed. If the Provider's value prop is a new object each render, all consumers re-render. To avoid this, memoize the value with useMemo.

6.5 Example with Memoized Value

```jsx
const ThemeContext = createContext();

function ThemeProvider({ children }) {
  const [theme, setTheme] = useState('light');
  const value = useMemo(() => ({ theme, setTheme }), [theme]);
  return <ThemeContext.Provider value={value}>{children}</ThemeContext.Provider>;
}
```

6.6 Interview Question

Q: How does useContext find the current context value?
Answer: It traverses the component tree upwards to find the nearest <MyContext.Provider> and returns its value prop. If no Provider exists, it returns the default value.

---

7. Context API

7.1 Definition

The Context API is a built-in React feature that provides a way to pass data through the component tree without manually passing props at every level. It consists of:

· React.createContext() – creates a context object.
· Context.Provider – supplies a value to all consumers below.
· Context.Consumer (legacy) or useContext hook – reads the value.

7.2 Why It Exists

To solve prop drilling, where intermediate components must pass data they don't use.

7.3 When to Use Context

· Global data: theme, user authentication, locale
· Data that is needed by many components at different nesting levels
· When prop drilling becomes unwieldy

7.4 When Not to Use Context

· Frequently changing values (e.g., input state) – context updates cause all consumers to re-render.
· If data is only needed by a few nearby components, lifting state up may be simpler.
· For performance-critical high-frequency updates, external state managers like Redux with selectors may be better.

7.5 Creating a Context

```jsx
const UserContext = createContext({
  user: null,
  login: () => {},
  logout: () => {}
});
```

7.6 Interview Question

Q: What is the Context API and what problem does it solve?
Answer: It is a way to share values across the component tree without passing props manually at every level. It solves prop drilling by allowing components to subscribe to a context directly.

---

8. Context Provider

8.1 Definition

The Provider component is part of a context object and accepts a value prop. It supplies that value to all descendant consumers. There can be multiple providers for the same context (nested), and the nearest one wins.

8.2 Syntax

```jsx
<MyContext.Provider value={/* some value */}>
  {children}
</MyContext.Provider>
```

8.3 Role

· Defines the scope of the context.
· Updates to value trigger re-renders for consumers.

8.4 Best Practices

· Wrap a portion of the tree, not necessarily the whole app, to limit re-renders.
· Memoize the value object if it contains multiple values or functions.
· Create a custom provider component to encapsulate state and context logic.

8.5 Example: Custom Auth Provider

```jsx
const AuthContext = createContext();

function AuthProvider({ children }) {
  const [user, setUser] = useState(null);
  const login = (userData) => setUser(userData);
  const logout = () => setUser(null);
  const value = useMemo(() => ({ user, login, logout }), [user]);
  return <AuthContext.Provider value={value}>{children}</AuthContext.Provider>;
}
```

8.6 Interview Question

Q: Why should you memoize the value prop of a Provider?
Answer: If the value is a new object each render, all consumers will re-render on every provider render, even if the actual data didn't change. Memoizing prevents unnecessary re-renders.

---

9. Context Consumer

9.1 Definition

Context.Consumer is a legacy component that subscribes to context changes. It uses a render prop function to receive the current context value.

9.2 Syntax

```jsx
<MyContext.Consumer>
  {value => /* render something with value */}
</MyContext.Consumer>
```

9.3 Modern Alternative

Use useContext in functional components, which is simpler and more readable.

9.4 When You Might Still See Consumer

· In class components (can't use hooks).
· In certain render-prop patterns.

9.5 Interview Question

Q: What is the difference between Context.Consumer and useContext?
Answer: Context.Consumer is a component that uses a render prop to access context, suitable for class components. useContext is a hook for functional components, providing the same functionality more concisely.

---

10. Multiple Contexts

10.1 Definition

In a React application, you may have several independent pieces of global state (e.g., theme, auth, locale). You can create multiple contexts and nest providers.

10.2 Why Use Multiple Contexts

· Keeps concerns separated.
· Avoids one giant context causing unnecessary re-renders across unrelated consumers.
· Each context can be consumed independently.

10.3 Example Structure

```jsx
function AppProviders({ children }) {
  return (
    <ThemeProvider>
      <AuthProvider>
        <LanguageProvider>
          {children}
        </LanguageProvider>
      </AuthProvider>
    </ThemeProvider>
  );
}
```

10.4 Consuming Multiple Contexts in a Component

```jsx
function Header() {
  const theme = useContext(ThemeContext);
  const { user } = useContext(AuthContext);
  const lang = useContext(LanguageContext);
  // use them
}
```

10.5 Best Practices

· Keep each context focused.
· Consider composing providers into a single AppProviders component for cleanliness.
· Avoid deeply nested provider pyramids if possible; use a composition pattern.

10.6 Interview Question

Q: How do you handle multiple contexts without creating a provider pyramid?
Answer: You can compose providers into a single component that nests them internally, providing a clean API. Alternatively, you can use a custom hook that aggregates multiple contexts.

---

11. Axios (Integration with State)

11.1 Definition

Axios is a popular JavaScript library for making HTTP requests. It provides a promise-based API, request/response interceptors, automatic JSON transformation, and better error handling compared to the native Fetch API. In React, Axios is commonly used to fetch data that then updates component state.

11.2 Why It Exists

Fetch API has limitations: no timeout by default, manual JSON parsing, less convenient error handling, and no interceptors. Axios addresses these and offers a cleaner, more feature-rich experience.

11.3 Installation

```bash
npm install axios
```

11.4 Basic Usage

```jsx
import axios from 'axios';

axios.get('/api/users')
  .then(response => {
    console.log(response.data);
  })
  .catch(error => {
    console.error(error);
  });
```

11.5 Using Axios with React State

```jsx
function UserList() {
  const [users, setUsers] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  useEffect(() => {
    axios.get('/api/users')
      .then(res => {
        setUsers(res.data);
        setLoading(false);
      })
      .catch(err => {
        setError(err.message);
        setLoading(false);
      });
  }, []);

  if (loading) return <div>Loading...</div>;
  if (error) return <div>Error: {error}</div>;
  return <ul>{users.map(u => <li key={u.id}>{u.name}</li>)}</ul>;
}
```

11.6 Using Axios with useReducer

For more complex data fetching, you can combine Axios with useReducer to manage loading, data, and error states in one place.

11.7 Interview Question

Q: Why would you use Axios instead of Fetch?
Answer: Axios provides a simpler API, automatic JSON transformation, request/response interceptors, timeout support, and better error handling. Fetch requires more manual work but is built-in and has no extra dependency.

---

12. Real-World Scenario: Building a Theme and User Authentication Context

Problem: An application needs a global theme (light/dark) and user authentication state, accessible from many components without prop drilling.

Solution: Use two separate contexts with custom providers. Memoize context values to prevent unnecessary re-renders.

Architecture:

```mermaid
flowchart TD
    App --> AppProviders
    AppProviders --> ThemeProvider
    AppProviders --> AuthProvider
    ThemeProvider --> ThemeContext
    AuthProvider --> AuthContext
    ChildComponents --> useContext(ThemeContext)
    ChildComponents --> useContext(AuthContext)
```

Implementation (simplified):

```jsx
// ThemeContext.js
const ThemeContext = createContext();
export function ThemeProvider({ children }) {
  const [theme, setTheme] = useState('light');
  const toggleTheme = () => setTheme(t => t === 'light' ? 'dark' : 'light');
  const value = useMemo(() => ({ theme, toggleTheme }), [theme]);
  return <ThemeContext.Provider value={value}>{children}</ThemeContext.Provider>;
}
export const useTheme = () => useContext(ThemeContext);

// AuthContext.js
const AuthContext = createContext();
export function AuthProvider({ children }) {
  const [user, setUser] = useState(null);
  const login = (userData) => setUser(userData);
  const logout = () => setUser(null);
  const value = useMemo(() => ({ user, login, logout }), [user]);
  return <AuthContext.Provider value={value}>{children}</AuthContext.Provider>;
}
export const useAuth = () => useContext(AuthContext);
```

Usage in a component:

```jsx
function Header() {
  const { theme, toggleTheme } = useTheme();
  const { user, logout } = useAuth();
  return (
    <header className={theme}>
      <span>{user?.name}</span>
      <button onClick={toggleTheme}>Toggle Theme</button>
      <button onClick={logout}>Logout</button>
    </header>
  );
}
```

This demonstrates multiple contexts, custom providers, and memoized values.

---

13. Module 06 – Quick Revision

· Lifting state up: move shared state to nearest common ancestor.
· Colocation: keep state close to where it's used.
· Derived state: compute from existing state, don't store.
· useReducer is ideal for complex state transitions.
· Context API provides global state via Provider/Consumer or useContext.
· Memoize context value to prevent unnecessary re-renders.
· Use multiple contexts for separation of concerns.
· Axios is a popular HTTP client for data fetching that updates state.

---

14. Interview Questions – Module 06

Beginner

1. What is the Context API?
      A built-in React feature that allows sharing data across components without prop drilling.
2. What is the difference between useState and useReducer?
      useState is simpler for independent state; useReducer is better for complex state logic with multiple actions.
3. What is Axios?
      A promise-based HTTP client for making requests, offering features like interceptors and automatic JSON parsing.

Intermediate

1. Explain lifting state up with an example.
      When two sibling components need to share state, you move state to their parent and pass it down as props and callbacks.
2. Why is state colocation important?
      It reduces unnecessary re-renders and keeps components decoupled, improving maintainability.
3. How do you optimize a Context Provider?
      Memoize the value prop with useMemo so it only changes when actual data changes, preventing consumers from re-rendering unnecessarily.

Advanced

1. When would you choose a state management library like Redux over Context API?
      When you have a large application with high-frequency updates, need fine-grained re-render control, time-travel debugging, middleware, or when context value updates cause performance issues.
2. Explain how derived state can cause bugs if not handled correctly.
      Storing derived state separately can lead to inconsistencies if one part updates but not the other. Computing derived state at render time ensures consistency.
3. How would you design a global notification system using Context and useReducer?
      Create a NotificationContext with a reducer managing an array of notifications, dispatch actions to add/remove notifications, and a provider that renders notifications and a hook to use the context.

Scenario-Based

Q: Your app has a sidebar that needs user info from a parent, but it's nested 5 levels deep. How would you avoid prop drilling?
Answer: Use the Context API to provide user data at a high level, then consume it in the sidebar with useContext, or lift state to a context provider.

Coding Questions

1. Implement a context for managing a shopping cart with useReducer.

```jsx
const CartContext = createContext();

function cartReducer(state, action) {
  switch (action.type) {
    case 'ADD_ITEM': return [...state, action.payload];
    case 'REMOVE_ITEM': return state.filter(item => item.id !== action.payload.id);
    default: return state;
  }
}

function CartProvider({ children }) {
  const [cart, dispatch] = useReducer(cartReducer, []);
  const value = useMemo(() => ({ cart, dispatch }), [cart]);
  return <CartContext.Provider value={value}>{children}</CartContext.Provider>;
}
```

---

15. Common Mistakes & Best Practices

Mistake Best Practice
Storing derived state in state variables Compute derived state during render
Lifting state too high or too early Keep state local until multiple components need it
Not memoizing context value Use useMemo to keep value stable
Using context for high-frequency updates Prefer local state or external store with selectors
Overusing useReducer for simple state Use useState when state is simple
Not separating concerns in contexts Create focused contexts instead of one giant context

---

This concludes Module 06: Advanced State. The next module is Module 07: Forms, covering controlled/uncontrolled components, form validation, React Hook Form, and Zod.




Module 07: Forms

Forms are essential for gathering user input in web applications. React provides a controlled approach to form handling, where component state manages form data, enabling dynamic validation, conditional rendering, and seamless integration with other UI logic. This module covers form elements, controlled/uncontrolled components, validation strategies, and popular libraries like React Hook Form and Zod.

---

1. Form Handling

1.1 Definition

Form handling in React refers to the process of managing user input from HTML form elements (input, textarea, select, checkbox, radio) within React components. It involves capturing changes, storing values in state, validating input, and handling submission.

1.2 Why It Exists

Forms are the primary way users interact with web applications, from login and registration to search and data entry. React needs a consistent way to manage form data and update the UI based on user input.

1.3 Purpose

· Capture user input
· Validate and sanitize data
· Provide feedback (errors, success)
· Submit data to APIs or other services
· Maintain form state across interactions

1.4 Prerequisites

· Understanding of React state (useState)
· Basic HTML form elements
· Event handling (onChange, onSubmit)

1.5 Core Concepts

· Controlled Components: Form elements whose values are controlled by React state.
· Uncontrolled Components: Form elements that manage their own internal state; accessed via refs.
· Validation: Checking input against rules (required, pattern, custom).
· Error Handling: Displaying validation messages.
· Submission: Handling form submit, often with preventDefault.

---

2. Controlled Components

2.1 Definition

A controlled component is a form element whose value is driven by React state. The component's state is the "single source of truth"; the input value is set via the value prop, and changes are handled by an onChange handler that updates state.

2.2 Why It Exists

To keep React in control of form data, enabling immediate validation, conditional rendering, and synchronization with other UI. It follows React's declarative paradigm.

2.3 Syntax

```jsx
const [value, setValue] = useState('');
<input value={value} onChange={(e) => setValue(e.target.value)} />
```

2.4 Basic Example: Controlled Input

```jsx
function NameForm() {
  const [name, setName] = useState('');
  const handleChange = (e) => setName(e.target.value);
  const handleSubmit = (e) => {
    e.preventDefault();
    alert(`Hello, ${name}`);
  };

  return (
    <form onSubmit={handleSubmit}>
      <label>
        Name:
        <input type="text" value={name} onChange={handleChange} />
      </label>
      <button type="submit">Submit</button>
    </form>
  );
}
```

2.5 Advantages

· Single source of truth
· Easy to validate and manipulate input
· Supports dynamic UI updates
· Enables controlled submission

2.6 Disadvantages

· More code for each input
· Can cause performance issues if many inputs (each keystroke re-renders)
· Requires state for every form field

2.7 Interview Question

Q: What is a controlled component?
Answer: A controlled component is one where React state controls the value of a form element, and changes update the state via an onChange handler. React is the single source of truth.

---

3. Uncontrolled Components

3.1 Definition

An uncontrolled component is a form element that manages its own internal state. React does not control the value; instead, you access the value using a ref when needed (e.g., on submission). Default values can be set with the defaultValue prop.

3.2 Why It Exists

To reduce boilerplate for simple forms where you don't need to track every keystroke. It can also improve performance for large forms by avoiding re-renders on every change.

3.3 Syntax

```jsx
const inputRef = useRef(null);
<input ref={inputRef} defaultValue="initial" />

// Access value
inputRef.current.value
```

3.4 Example

```jsx
function UncontrolledForm() {
  const inputRef = useRef(null);

  const handleSubmit = (e) => {
    e.preventDefault();
    alert(`Hello, ${inputRef.current.value}`);
  };

  return (
    <form onSubmit={handleSubmit}>
      <label>
        Name:
        <input type="text" ref={inputRef} defaultValue="" />
      </label>
      <button type="submit">Submit</button>
    </form>
  );
}
```

3.5 Controlled vs Uncontrolled

Aspect Controlled Uncontrolled
State source React state DOM itself
Data access via state variable via ref
Re-renders On every change Only on submit (if not using onChange)
Use case Real-time validation, dynamic UI Simple forms, file inputs
Code complexity More boilerplate Less code

3.6 Interview Question

Q: When would you use an uncontrolled component?
Answer: For simple forms where you only need the value on submission, or when performance is a concern with many inputs. File inputs are inherently uncontrolled because the file object can't be set programmatically.

---

4. Input Fields

4.1 Definition

Input fields (<input>) are form elements for text, number, email, password, etc. In controlled components, they bind to state via value and onChange.

4.2 Handling Different Types

· type="text" – string value
· type="number" – string value (need parse)
· type="checkbox" – boolean via checked
· type="radio" – string via checked and value

4.3 Example: Controlled text input

```jsx
const [text, setText] = useState('');
<input type="text" value={text} onChange={e => setText(e.target.value)} />
```

4.4 Number Input

```jsx
const [age, setAge] = useState('');
<input type="number" value={age} onChange={e => setAge(e.target.value)} />
// age is string; convert if needed
```

---

5. Textarea

5.1 Definition

A <textarea> element for multi-line text. In React, it is controlled similarly to input, using value and onChange.

5.2 Example

```jsx
const [bio, setBio] = useState('');
<textarea value={bio} onChange={e => setBio(e.target.value)} />
```

5.3 Note

Unlike HTML, React does not use innerHTML for textarea; it uses the value attribute.

---

6. Select

6.1 Definition

A <select> dropdown element. In React, the selected value is controlled by the value prop on the <select> element, not by adding selected to individual <option> tags.

6.2 Example

```jsx
const [country, setCountry] = useState('usa');
<select value={country} onChange={e => setCountry(e.target.value)}>
  <option value="usa">USA</option>
  <option value="canada">Canada</option>
  <option value="india">India</option>
</select>
```

---

7. Checkbox

7.1 Definition

A checkbox is an input type used for boolean values. In controlled components, use the checked prop instead of value.

7.2 Example

```jsx
const [isChecked, setIsChecked] = useState(false);
<input
  type="checkbox"
  checked={isChecked}
  onChange={e => setIsChecked(e.target.checked)}
/>
```

7.3 Multiple Checkboxes

If multiple checkboxes share state, use an array or object in state.

---

8. Radio Buttons

8.1 Definition

Radio buttons allow selecting one option from a group. Each radio has a value; the controlled component's state holds the selected value.

8.2 Example

```jsx
const [gender, setGender] = useState('female');
<label>
  <input type="radio" value="male" checked={gender === 'male'} onChange={e => setGender(e.target.value)} />
  Male
</label>
<label>
  <input type="radio" value="female" checked={gender === 'female'} onChange={e => setGender(e.target.value)} />
  Female
</label>
```

---

9. Multiple Inputs

9.1 Definition

Handling multiple controlled inputs can be done by giving each input a name attribute and using a single state object. The onChange handler updates the specific field based on event.target.name.

9.2 Example: Using a single state object

```jsx
const [formData, setFormData] = useState({ name: '', email: '' });

const handleChange = (e) => {
  setFormData({ ...formData, [e.target.name]: e.target.value });
};

<input name="name" value={formData.name} onChange={handleChange} />
<input name="email" value={formData.email} onChange={handleChange} />
```

9.3 Benefits

· Less code duplication
· Easy to manage many inputs

---

10. Dynamic Forms

10.1 Definition

Dynamic forms are forms where fields can be added or removed at runtime. Common examples: adding multiple phone numbers, education entries, or list items.

10.2 Implementation Approach

· Store an array of objects in state.
· Render inputs by mapping over the array.
· Provide buttons to add/remove items.
· Ensure each input has a unique key.

10.3 Example: Dynamic phone numbers

```jsx
const [phones, setPhones] = useState(['']);

const addPhone = () => setPhones([...phones, '']);
const removePhone = (index) => setPhones(phones.filter((_, i) => i !== index));
const handlePhoneChange = (index, value) => {
  const newPhones = phones.map((phone, i) => i === index ? value : phone);
  setPhones(newPhones);
};

{phones.map((phone, index) => (
  <div key={index}>
    <input value={phone} onChange={e => handlePhoneChange(index, e.target.value)} />
    <button onClick={() => removePhone(index)}>Remove</button>
  </div>
))}
<button onClick={addPhone}>Add Phone</button>
```

10.4 Best Practices

· Use stable unique ids if possible (not array index) for keys, especially if reordering.
· Ensure input updates are immutable.

---

11. Form Validation

11.1 Definition

Form validation ensures that user input meets certain criteria before submission. It can be performed:

· On change (real-time feedback)
· On blur (when field loses focus)
· On submit (after user attempts to submit)

11.2 Why It Exists

To improve data quality, prevent invalid submissions, and guide users with clear feedback.

11.3 Types of Validation

· Required: field must not be empty
· Format: email, phone, regex patterns
· Length: min/max characters
· Custom: business rules (e.g., password confirmation)

11.4 Manual Validation Example

```jsx
const [email, setEmail] = useState('');
const [error, setError] = useState('');

const handleSubmit = (e) => {
  e.preventDefault();
  if (!email) {
    setError('Email is required');
    return;
  }
  if (!email.includes('@')) {
    setError('Invalid email');
    return;
  }
  setError('');
  // submit
};
```

11.5 Validation Best Practices

· Show errors close to the field.
· Use clear, concise messages.
· Validate on submit and optionally on blur/change.
· Disable submit button if form invalid (or show errors on attempt).

---

12. Error Handling

12.1 Definition

Error handling in forms involves detecting validation errors, storing them, and displaying them to the user. This can be done by keeping an errors object in state.

12.2 Example: Multiple errors object

```jsx
const [errors, setErrors] = useState({});

const validate = () => {
  const newErrors = {};
  if (!name) newErrors.name = 'Name required';
  if (!email) newErrors.email = 'Email required';
  setErrors(newErrors);
  return Object.keys(newErrors).length === 0;
};

const handleSubmit = (e) => {
  e.preventDefault();
  if (validate()) {
    // submit
  }
};
```

12.3 Displaying Errors

```jsx
{errors.name && <span className="error">{errors.name}</span>}
```

---

13. Form Submission

13.1 Definition

Form submission is the process of collecting form data and sending it to a server or processing it. In React, it is handled via onSubmit on the form element, typically with preventDefault to prevent page reload.

13.2 Example with API Call

```jsx
const handleSubmit = async (e) => {
  e.preventDefault();
  setLoading(true);
  try {
    const response = await axios.post('/api/submit', formData);
    // handle success
  } catch (error) {
    setError('Submission failed');
  } finally {
    setLoading(false);
  }
};
```

13.3 Best Practices

· Prevent default submission to maintain SPA behavior.
· Show loading state during submission.
· Handle errors gracefully.
· Reset form after successful submission if needed.

---

14. React Hook Form

14.1 Definition

React Hook Form is a library for managing forms in React with minimal re-renders and high performance. It uses uncontrolled components internally but provides a hook-based API, allowing easy validation and integration.

14.2 Why It Exists

To simplify form handling, reduce boilerplate, improve performance (fewer re-renders), and provide built-in validation and error management.

14.3 Installation

```bash
npm install react-hook-form
```

14.4 Basic Usage

```jsx
import { useForm } from 'react-hook-form';

function MyForm() {
  const { register, handleSubmit, formState: { errors } } = useForm();

  const onSubmit = (data) => {
    console.log(data);
  };

  return (
    <form onSubmit={handleSubmit(onSubmit)}>
      <input {...register('email', { required: 'Email is required' })} />
      {errors.email && <span>{errors.email.message}</span>}
      <input type="submit" />
    </form>
  );
}
```

14.5 Key Features

· register: registers an input and validation rules.
· handleSubmit: wraps your submit handler and performs validation.
· formState.errors: contains validation errors.
· watch, setValue, reset, etc.
· Integrates with external validation libraries (Zod, Yup).

14.6 Performance Benefits

By default, React Hook Form uses uncontrolled inputs and only re-renders on form state changes, not on every keystroke, leading to better performance in large forms.

14.7 Interview Question

Q: What are the advantages of React Hook Form over controlled components?
Answer: React Hook Form reduces boilerplate, improves performance by avoiding re-renders on every keystroke, supports built-in validation, and integrates easily with external schema validators. It is ideal for complex forms.

---

15. Zod Validation

15.1 Definition

Zod is a TypeScript-first schema declaration and validation library. It allows you to define data schemas and validate values against them. It integrates with React Hook Form via resolvers to validate form data.

15.2 Why It Exists

To provide a type-safe, declarative way to validate complex data structures. In forms, Zod schemas can replace manual validation logic and improve maintainability.

15.3 Installation

```bash
npm install zod @hookform/resolvers
```

15.4 Basic Usage with React Hook Form

```jsx
import { useForm } from 'react-hook-form';
import { zodResolver } from '@hookform/resolvers/zod';
import { z } from 'zod';

const schema = z.object({
  email: z.string().email('Invalid email'),
  age: z.number().min(18, 'Must be 18+'),
});

function MyForm() {
  const { register, handleSubmit, formState: { errors } } = useForm({
    resolver: zodResolver(schema)
  });

  const onSubmit = (data) => console.log(data);

  return (
    <form onSubmit={handleSubmit(onSubmit)}>
      <input {...register('email')} />
      {errors.email && <span>{errors.email.message}</span>}
      <input type="number" {...register('age', { valueAsNumber: true })} />
      {errors.age && <span>{errors.age.message}</span>}
      <button type="submit">Submit</button>
    </form>
  );
}
```

15.5 Benefits of Zod

· TypeScript integration (auto infer types)
· Expressive schema definition
· Rich validation methods (string, number, object, array, optional, etc.)
· Easy integration with other tools

15.6 Interview Question

Q: Why would you use Zod with React Hook Form?
Answer: Zod provides a declarative and type-safe way to define form validation schemas. It reduces manual validation code, ensures consistency, and works seamlessly with React Hook Form via resolvers, producing clearer error messages.

---

16. Real-World Scenario: Multi-Step Registration Form

Problem: Build a multi-step registration form with fields for personal info, address, and account details. Each step validates before moving to the next; final submission sends all data to an API.

Solution:

· Use React Hook Form with a single form context to manage all steps.
· Use Zod schemas for each step's fields.
· Use state to track current step.
· Validate step fields on "Next" button click.
· Collect data from all steps and submit at the end.

Architecture:

```mermaid
flowchart LR
    A[Step1 Personal] -->|Next| B[Step2 Address]
    B -->|Next| C[Step3 Account]
    C -->|Submit| D[API Call]
    D -->|Success| E[Success Message]
    D -->|Error| F[Show Error]
```

Implementation (simplified):

```jsx
import { useForm, FormProvider } from 'react-hook-form';
import { zodResolver } from '@hookform/resolvers/zod';
import { z } from 'zod';

const step1Schema = z.object({ firstName: z.string().min(1, 'Required') });
const step2Schema = z.object({ address: z.string().min(1, 'Required') });
const step3Schema = z.object({ email: z.string().email('Invalid email') });

function RegistrationForm() {
  const methods = useForm({ resolver: zodResolver(step1Schema) }); // update resolver per step
  const [step, setStep] = useState(1);
  // ... manage step-specific validation, submission
}
```

This is a high-level example; full implementation would involve dynamic resolver and step management.

---

17. Module 07 – Quick Revision

· Controlled components: state drives input values.
· Uncontrolled components: DOM manages values, accessed via refs.
· Use value for text, textarea, select; checked for checkbox/radio.
· Manage multiple inputs with a single state object and name attribute.
· Dynamic forms use arrays in state and map to render.
· Validation can be manual or using libraries like React Hook Form.
· React Hook Form reduces re-renders and simplifies validation.
· Zod provides type-safe schema validation; integrates with React Hook Form.

---

18. Interview Questions – Module 07

Beginner

1. What is a controlled component?
      A form element whose value is controlled by React state, with changes handled by onChange.
2. How do you handle form submission in React?
      Use onSubmit on the form, call preventDefault, then process the data.
3. What is the difference between value and defaultValue in React?
      value makes an input controlled; defaultValue sets initial value without controlling subsequent changes.

Intermediate

1. Explain how to handle multiple inputs with one state object.
      Give each input a name attribute and use a single state object. In onChange, update the field using [e.target.name]: e.target.value.
2. What are the benefits of React Hook Form over traditional controlled forms?
      React Hook Form uses uncontrolled inputs, leading to fewer re-renders, less boilerplate, built-in validation, and easy integration with schema validators.
3. How do you validate a form before submission?
      You can manually validate in handleSubmit, or use a library like React Hook Form with validation rules or Zod schemas.

Advanced

1. How would you implement a dynamic form where users can add/remove fields?
      Store an array in state, map over it to render inputs, and provide buttons to append or remove items. Ensure unique keys and immutable updates.
2. Explain the integration of Zod with React Hook Form.
      Use zodResolver from @hookform/resolvers/zod, passing a Zod schema. React Hook Form will validate form data against the schema and populate errors.
3. What are the performance implications of controlled components in large forms?
      Each keystroke causes a state update and re-render of the component (and possibly children). This can lead to performance degradation; libraries like React Hook Form avoid this by using uncontrolled components.

Scenario-Based

Q: A form has 50 inputs and lags when typing. How would you optimize?
Answer: Switch to uncontrolled components or use React Hook Form, which minimizes re-renders. Also, isolate each input as a separate memoized component to prevent parent re-renders on every keystroke.

Coding Questions

1. Write a controlled component for a textarea with a character count limit.

```jsx
function LimitedTextarea({ maxLength }) {
  const [text, setText] = useState('');
  const handleChange = (e) => {
    if (e.target.value.length <= maxLength) setText(e.target.value);
  };
  return (
    <div>
      <textarea value={text} onChange={handleChange} />
      <span>{text.length}/{maxLength}</span>
    </div>
  );
}
```

2. Implement a simple form with React Hook Form that validates an email field.

```jsx
import { useForm } from 'react-hook-form';

function EmailForm() {
  const { register, handleSubmit, formState: { errors } } = useForm();
  const onSubmit = (data) => console.log(data);
  return (
    <form onSubmit={handleSubmit(onSubmit)}>
      <input {...register('email', { required: 'Email required', pattern: { value: /^\S+@\S+$/, message: 'Invalid email' } })} />
      {errors.email && <p>{errors.email.message}</p>}
      <button type="submit">Submit</button>
    </form>
  );
}
```

---

19. Common Mistakes & Best Practices

Mistake Best Practice
Forgetting preventDefault on submit Always call e.preventDefault() unless intentionally submitting normally
Using value for checkbox/radio Use checked for boolean elements
Mutating state directly in dynamic forms Use immutable updates (map, filter, spread)
Using array index as key in dynamic fields Use stable IDs when possible; index only if static
Overcomplicating validation Use libraries like React Hook Form + Zod
Not providing error feedback Display clear errors near fields

---

20. Testing Forms

· Use React Testing Library to simulate user input and submission.
· Test validation messages appear when fields are empty/invalid.
· Test form submission calls API with correct data.
· Mock API calls and assert loading/error states.

---

This concludes Module 07: Forms. The next module is Module 08: API Integration, covering Fetch API, Axios, interceptors, token refresh, and service layers.




Module 08: API Integration

API integration is a crucial part of modern React applications, enabling them to communicate with backend services, fetch data, and submit user actions. This module covers the two primary tools for making HTTP requests—Fetch API and Axios—along with advanced patterns like interceptors, instance configuration, token management, and building a robust service layer. You'll learn how to handle loading, errors, and authentication flows in a React context.

---

1. Fetch API

1.1 Definition

The Fetch API is a built-in browser interface for making asynchronous HTTP requests. It is promise-based and returns a Response object that can be parsed as JSON, text, blob, etc. It replaces the older XMLHttpRequest and is supported in all modern browsers.

1.2 Why It Exists

To provide a modern, flexible, and promise-based way to interact with servers without external libraries. It simplifies asynchronous communication and integrates well with async/await.

1.3 Purpose

· Send HTTP requests (GET, POST, PUT, DELETE, etc.)
· Receive and parse server responses
· Handle network errors
· Support streaming responses

1.4 Basic Syntax

```javascript
fetch(url, options)
  .then(response => response.json())
  .then(data => console.log(data))
  .catch(error => console.error(error));
```

1.5 Example: GET Request

```javascript
fetch('https://api.example.com/users')
  .then(res => {
    if (!res.ok) throw new Error('Network error');
    return res.json();
  })
  .then(users => console.log(users))
  .catch(err => console.error(err));
```

1.6 Example: POST Request with JSON

```javascript
fetch('https://api.example.com/users', {
  method: 'POST',
  headers: { 'Content-Type': 'application/json' },
  body: JSON.stringify({ name: 'Alice' })
})
  .then(res => res.json())
  .then(data => console.log(data));
```

1.7 Important Notes

· Fetch only rejects on network failure, not on HTTP errors (like 404/500). You must manually check response.ok.
· Need to set headers manually for JSON.
· No timeout support by default; you can use AbortController to implement timeouts.
· No built-in interceptors or instance configuration.

1.8 When to Use Fetch

· For simple requests in small projects
· When you want to avoid external dependencies
· In service workers or non‑browser environments where Axios may not fit

---

2. Axios

2.1 Definition

Axios is a promise-based HTTP client for the browser and Node.js. It provides a rich API with features like automatic JSON transformation, request/response interceptors, timeout support, and better error handling.

2.2 Why It Exists

To overcome Fetch API's limitations: no automatic JSON parsing, no interceptors, no timeout by default, and inconsistent error handling across browsers. Axios simplifies complex HTTP scenarios.

2.3 Installation

```bash
npm install axios
```

2.4 Basic Usage

```javascript
import axios from 'axios';

axios.get('/api/users')
  .then(response => console.log(response.data))
  .catch(error => console.error(error));
```

2.5 Key Features

· Automatic JSON data transformation
· Request/response interceptors
· Timeout configuration
· Request cancellation (with AbortController)
· Default headers and base URL
· Works in Node.js (server-side)
· HTTP status error handling (throws on non‑2xx)

2.6 When to Use Axios

· Larger applications with many API calls
· When you need interceptors for authentication tokens
· When you want consistent error handling
· When building a service layer

---

3. GET Request

3.1 Definition

A GET request retrieves data from a server. It is the most common HTTP method for reading resources. It should not have a request body and is idempotent.

3.2 Fetch Example

```javascript
fetch('/api/users')
  .then(res => res.json())
  .then(data => setUsers(data));
```

3.3 Axios Example

```javascript
const response = await axios.get('/api/users');
setUsers(response.data);
```

3.4 Passing Query Parameters

Axios supports a params option:

```javascript
const response = await axios.get('/api/users', {
  params: { page: 1, limit: 10 }
});
```

Fetch requires manual URL building or URLSearchParams:

```javascript
const url = new URL('/api/users', base);
url.searchParams.append('page', 1);
fetch(url);
```

---

4. POST Request

4.1 Definition

A POST request sends data to the server to create a new resource. It includes a request body (usually JSON) and is not idempotent.

4.2 Axios Example

```javascript
const newUser = await axios.post('/api/users', { name: 'Alice', age: 25 });
```

4.3 Fetch Example

```javascript
fetch('/api/users', {
  method: 'POST',
  headers: { 'Content-Type': 'application/json' },
  body: JSON.stringify({ name: 'Alice', age: 25 })
})
```

---

5. PUT Request

5.1 Definition

A PUT request replaces an entire resource with new data. It is idempotent and requires the full resource representation.

5.2 Axios Example

```javascript
await axios.put(`/api/users/${id}`, { name: 'Alice', age: 26 });
```

5.3 Fetch Example

```javascript
fetch(`/api/users/${id}`, {
  method: 'PUT',
  headers: { 'Content-Type': 'application/json' },
  body: JSON.stringify({ name: 'Alice', age: 26 })
});
```

---

6. PATCH Request

6.1 Definition

A PATCH request partially updates a resource. Unlike PUT, it only sends the fields that need to be changed.

6.2 Axios Example

```javascript
await axios.patch(`/api/users/${id}`, { age: 27 });
```

6.3 Fetch Example

```javascript
fetch(`/api/users/${id}`, {
  method: 'PATCH',
  headers: { 'Content-Type': 'application/json' },
  body: JSON.stringify({ age: 27 })
});
```

---

7. DELETE Request

7.1 Definition

A DELETE request removes a resource from the server. It is idempotent.

7.2 Axios Example

```javascript
await axios.delete(`/api/users/${id}`);
```

7.3 Fetch Example

```javascript
fetch(`/api/users/${id}`, { method: 'DELETE' });
```

---

8. Axios Instance

8.1 Definition

An Axios instance is a custom configuration object created with axios.create(). It allows you to define default settings (base URL, headers, timeout) that apply to all requests made through that instance.

8.2 Why It Exists

To avoid repeating common configuration for every request and to create multiple clients for different APIs or environments.

8.3 Syntax

```javascript
const api = axios.create({
  baseURL: 'https://api.example.com',
  timeout: 10000,
  headers: { 'Content-Type': 'application/json' }
});
```

8.4 Usage

```javascript
const response = await api.get('/users');
```

8.5 Example with Environment Variable

```javascript
const api = axios.create({
  baseURL: import.meta.env.VITE_API_BASE_URL,
});
```

8.6 Benefits

· Centralized configuration
· Easier maintenance
· Can apply interceptors to the instance only
· Enables multiple clients (e.g., one for public API, one for authenticated API)

---

9. Axios Interceptors

9.1 Definition

Interceptors are functions that run before a request is sent or after a response is received. They allow you to modify requests, add headers, handle errors globally, or refresh tokens.

9.2 Why They Exist

To centralize cross-cutting concerns like authentication tokens, logging, error handling, and retry logic, without duplicating code in every call.

9.3 Request Interceptor

Runs before every request. Used to add authorization headers, set loading state, or modify request data.

```javascript
api.interceptors.request.use(
  (config) => {
    const token = localStorage.getItem('token');
    if (token) {
      config.headers.Authorization = `Bearer ${token}`;
    }
    return config;
  },
  (error) => Promise.reject(error)
);
```

9.4 Response Interceptor

Runs after a response is received. Used to handle global errors, refresh tokens on 401, or transform response data.

```javascript
api.interceptors.response.use(
  (response) => response,
  async (error) => {
    if (error.response.status === 401) {
      // handle token refresh or logout
    }
    return Promise.reject(error);
  }
);
```

9.5 Best Practices

· Keep interceptors simple and specific.
· Avoid heavy side effects in interceptors.
· Use interceptors on the instance, not global axios.
· Handle token refresh carefully to avoid infinite loops.

---

10. Request Interceptor (Detailed)

10.1 Purpose

Request interceptors modify the outgoing request. Common uses:

· Attach JWT token from storage.
· Set default headers (e.g., Accept: application/json).
· Log requests for debugging.
· Add a timestamp or request ID.
· Trigger loading state globally.

10.2 Implementation

```javascript
// api.js
const api = axios.create({ baseURL: import.meta.env.VITE_API_URL });

api.interceptors.request.use(
  (config) => {
    const token = getToken(); // from cookies or localStorage
    if (token) {
      config.headers.Authorization = `Bearer ${token}`;
    }
    config.headers['X-Request-ID'] = crypto.randomUUID();
    return config;
  },
  (error) => Promise.reject(error)
);
```

10.3 Interview Question

Q: What is a request interceptor and when would you use one?
Answer: A request interceptor is a function that runs before an HTTP request is sent. It is used to modify the request, such as adding authentication headers, logging, or setting global configurations. It centralizes cross-cutting concerns, avoiding repetitive code.

---

11. Response Interceptor (Detailed)

11.1 Purpose

Response interceptors process the response before it reaches the calling code. Common uses:

· Global error handling (e.g., redirect to login on 401)
· Automatic token refresh on 401
· Response data transformation (e.g., extract data field)
· Logging responses
· Error normalization

11.2 Implementation (Basic Error Handling)

```javascript
api.interceptors.response.use(
  (response) => response,
  (error) => {
    if (error.response) {
      const { status } = error.response;
      if (status === 401) {
        // redirect to login or refresh token
      } else if (status === 403) {
        // handle forbidden
      }
    }
    return Promise.reject(error);
  }
);
```

11.3 Interview Question

Q: How do you handle a 401 Unauthorized globally in Axios?
Answer: Use a response interceptor to check error.response.status === 401. Then you can attempt to refresh the token, and if refresh fails, redirect the user to the login page or dispatch a logout action.

---

12. Loading State

12.1 Definition

Loading state indicates that an API request is in progress. It is typically a boolean flag that controls the display of a spinner or skeleton UI.

12.2 Why It Exists

To provide feedback to users during asynchronous operations, improving perceived performance and user experience.

12.3 Managing Loading with useState

```jsx
const [loading, setLoading] = useState(false);

const fetchData = async () => {
  setLoading(true);
  try {
    const res = await api.get('/data');
    setData(res.data);
  } catch (err) {
    setError(err.message);
  } finally {
    setLoading(false);
  }
};
```

12.4 UI Conditional Rendering

```jsx
if (loading) return <Spinner />;
if (error) return <Error message={error} />;
return <DataView data={data} />;
```

12.5 Best Practices

· Always set loading to false in finally.
· Consider using a loading counter if multiple requests are in flight.
· For multiple loading states, use an object like { loading: boolean, submitting: boolean }.

---

13. Error Handling

13.1 Definition

Error handling in API integration involves catching request failures, extracting meaningful messages, and presenting them to the user or logging them for debugging.

13.2 Types of Errors

· Network errors: no internet, CORS, DNS failure.
· HTTP errors: 4xx, 5xx status codes.
· Parsing errors: invalid JSON.
· Application errors: validation errors from server.

13.3 Axios Error Object

Axios errors contain response, request, and message properties. You can extract error.response.data for server-provided error details.

13.4 Best Practices

· Normalize errors in a service layer or interceptor.
· Use try/catch with async/await or .catch().
· Provide user-friendly messages.
· Log detailed errors for debugging.

13.5 Example with Error Extraction

```javascript
try {
  await api.get('/users');
} catch (error) {
  const message = error.response?.data?.message || 'An error occurred';
  setError(message);
}
```

---

14. API Service Layer

14.1 Definition

An API service layer is an organized set of modules/functions that encapsulate all HTTP calls to a backend. Instead of calling Axios directly in components, you call service functions (e.g., getUsers, createUser).

14.2 Why It Exists

· Separates concerns: components don't know about HTTP details.
· Centralizes API endpoints and configurations.
· Easier to mock for testing.
· Enables reusability and consistency.
· Provides a single place to change when API evolves.

14.3 Structure Example

```
src/
└── services/
    ├── api.js           # Axios instance and interceptors
    ├── userService.js
    └── authService.js
```

14.4 Implementation

api.js:

```javascript
import axios from 'axios';

const api = axios.create({
  baseURL: import.meta.env.VITE_API_URL,
});

// interceptors...

export default api;
```

userService.js:

```javascript
import api from './api';

export const getUsers = () => api.get('/users');
export const createUser = (userData) => api.post('/users', userData);
export const updateUser = (id, userData) => api.put(`/users/${id}`, userData);
export const deleteUser = (id) => api.delete(`/users/${id}`);
```

Usage in component:

```javascript
import { getUsers } from '../services/userService';

useEffect(() => {
  getUsers()
    .then(res => setUsers(res.data))
    .catch(err => setError(err.message));
}, []);
```

14.5 Best Practices

· Keep service functions thin (only HTTP calls).
· Handle errors in components or via interceptors.
· Name functions clearly (getX, createX, updateX, deleteX).
· Use a single Axios instance for each API.

---

15. Authentication API

15.1 Definition

Authentication API endpoints handle user login, registration, logout, and token refresh. In React, you interact with these endpoints from a service layer and manage the resulting tokens securely.

15.2 Common Endpoints

· POST /auth/login – authenticate user, return tokens.
· POST /auth/register – create new user.
· POST /auth/logout – invalidate session/tokens.
· POST /auth/refresh – exchange refresh token for new access token.

15.3 Example Auth Service

```javascript
export const login = (credentials) => api.post('/auth/login', credentials);
export const register = (userData) => api.post('/auth/register', userData);
export const refreshToken = (refreshToken) => api.post('/auth/refresh', { refreshToken });
```

15.4 Storing Tokens

· Access token: short-lived; stored in memory or localStorage (less secure). For SPA, often in localStorage or a variable.
· Refresh token: longer-lived; ideally stored in HTTP-only cookie (more secure) or localStorage (less secure).
· Never store tokens in plain JS variable that resets on refresh unless you use a persistent store (e.g., Redux persist).

15.5 Interview Question

Q: How do you store JWT tokens in a React app?
Answer: Access tokens are often kept in memory or localStorage; refresh tokens should be stored in HTTP-only cookies to prevent XSS attacks. The most secure approach is to keep both tokens in HTTP-only cookies and let the backend handle token refresh via cookies.

---

16. Access Token

16.1 Definition

An access token is a short-lived credential that grants access to protected API resources. It is typically a JWT (JSON Web Token) that contains user information and expiry.

16.2 Why It Exists

To authenticate API requests without repeatedly sending username/password. Access tokens are short-lived to reduce the window of misuse if stolen.

16.3 Usage in Authorization Header

```javascript
Authorization: Bearer <access_token>
```

16.4 Adding Token via Request Interceptor

Already covered above.

16.5 Lifetime

Typically 15 minutes to 1 hour. When it expires, the client must obtain a new one via refresh token.

---

17. Refresh Token

17.1 Definition

A refresh token is a long-lived credential used to obtain a new access token without requiring the user to log in again. It should be stored securely (HTTP-only cookie recommended).

17.2 Why It Exists

To provide a balance between security and user experience: short-lived access tokens limit damage if leaked, while refresh tokens allow seamless renewal.

17.3 How It Works

1. User logs in → receives access token + refresh token.
2. Access token expires → API returns 401.
3. Client sends refresh token to /auth/refresh.
4. Server validates refresh token and issues new access token (and possibly a new refresh token).
5. Client retries the original request with the new access token.

17.4 Storing Refresh Token

· HTTP-only cookie (recommended): not accessible via JavaScript, mitigates XSS.
· localStorage: accessible, risk of XSS.
· Memory: lost on page refresh.

---

18. Token Refresh (Complete Flow)

18.1 Problem

Access token expires; user should not be forced to log in again.

18.2 Solution: Axios Response Interceptor + Refresh Queue

When a request fails with 401, the interceptor:

1. Checks if the failed request is not the refresh endpoint.
2. Attempts to refresh the token using the refresh token.
3. If successful, updates stored access token, retries the original request.
4. If refresh fails, logs out the user (or redirects to login).

18.3 Implementation Example

```javascript
let isRefreshing = false;
let failedQueue = [];

const processQueue = (error, token = null) => {
  failedQueue.forEach(prom => {
    if (error) prom.reject(error);
    else prom.resolve(token);
  });
  failedQueue = [];
};

api.interceptors.response.use(
  (response) => response,
  async (error) => {
    const originalRequest = error.config;
    if (error.response?.status === 401 && !originalRequest._retry) {
      if (isRefreshing) {
        return new Promise((resolve, reject) => {
          failedQueue.push({ resolve, reject });
        }).then(token => {
          originalRequest.headers.Authorization = `Bearer ${token}`;
          return api(originalRequest);
        }).catch(err => Promise.reject(err));
      }

      originalRequest._retry = true;
      isRefreshing = true;

      try {
        const refreshToken = localStorage.getItem('refreshToken');
        const response = await axios.post('/auth/refresh', { refreshToken });
        const newAccessToken = response.data.accessToken;
        localStorage.setItem('accessToken', newAccessToken);
        api.defaults.headers.common.Authorization = `Bearer ${newAccessToken}`;
        processQueue(null, newAccessToken);
        originalRequest.headers.Authorization = `Bearer ${newAccessToken}`;
        return api(originalRequest);
      } catch (refreshError) {
        processQueue(refreshError, null);
        // logout user
        return Promise.reject(refreshError);
      } finally {
        isRefreshing = false;
      }
    }
    return Promise.reject(error);
  }
);
```

18.4 Important Considerations

· Use a flag (isRefreshing) to prevent multiple simultaneous refresh requests.
· Queue failed requests while refreshing and replay them.
· Mark the original request with _retry to avoid infinite loop.
· After refresh, update stored token and default headers.

18.5 Interview Question

Q: Explain how you would implement automatic token refresh with Axios.
Answer: Use a response interceptor to detect 401 errors. Maintain a refresh in-progress flag and a queue of failed requests. On 401, attempt to refresh the token. If successful, update the token, retry the failed requests, and resolve the queue. If refresh fails, reject all and log out. This ensures seamless user experience.

---

19. Real-World Scenario: Building a Secure API Layer with Token Refresh

Problem: A React application uses JWT authentication with short-lived access tokens (15 min) and long-lived refresh tokens. The app must handle token expiration gracefully without user intervention.

Solution:

· Create an Axios instance with base URL and default headers.
· Add a request interceptor to attach access token from storage.
· Add a response interceptor to handle 401 errors by refreshing token.
· Implement a service layer for API calls.
· Use React context for authentication state.

Architecture Diagram:

```mermaid
sequenceDiagram
    participant C as React Component
    participant S as Service Layer
    participant A as Axios Instance
    participant API as Backend

    C->>S: call getUsers()
    S->>A: GET /users (with access token)
    A->>API: Request
    API-->>A: 401 Unauthorized
    A->>A: Trigger token refresh
    A->>API: POST /auth/refresh (refresh token)
    API-->>A: New access token
    A->>A: Retry original request
    A->>API: GET /users (with new token)
    API-->>A: 200 OK
    A-->>S: Response data
    S-->>C: Data
```

Implementation Highlights:

· api.js with interceptors.
· authService.js with login, refreshToken.
· userService.js with getUsers, createUser.
· AuthContext to store user info and provide login/logout.

---

20. Module 08 – Quick Revision

· Fetch API is built-in; Axios offers more features.
· Axios instance centralizes config and enables interceptors.
· Request interceptor: attach tokens, headers.
· Response interceptor: handle errors, refresh token.
· Loading state with useState and finally.
· Error handling: normalize errors, show user-friendly messages.
· Service layer: separate HTTP calls from components.
· Token refresh: use interceptor, queue, and retry logic.

---

21. Interview Questions – Module 08

Beginner

1. What is the difference between Fetch and Axios?
      Fetch is built-in, requires manual JSON parsing and error checking. Axios is a library with automatic JSON transformation, interceptors, timeout, and better error handling.
2. How do you make a GET request with Axios?
      axios.get(url) returns a promise. Use .then or await to handle response.
3. What is an Axios instance?
      A custom configured Axios client created with axios.create() that can have default base URL, headers, and interceptors.

Intermediate

1. Explain the purpose of request and response interceptors.
      Request interceptors modify outgoing requests (e.g., add authentication headers). Response interceptors process responses, handle global errors, and can automate token refresh.
2. How would you handle loading state in a React component that fetches data?
      Use a loading state variable, set it to true before fetch, and false in finally after the request completes. Conditionally render a spinner.
3. What is a service layer and why is it beneficial?
      A service layer encapsulates all API calls into functions, separating HTTP logic from UI components. It improves maintainability, testability, and reusability.

Advanced

1. Describe the token refresh flow using Axios interceptors.
      In a response interceptor, when a 401 occurs, check if already refreshing. If not, set a flag, call the refresh endpoint, update tokens, retry the original request, and process any queued requests. If refresh fails, logout.
2. How do you avoid multiple simultaneous refresh requests when many requests fail with 401?
      Use an isRefreshing flag and a queue of pending requests. While refreshing, other failed requests are added to the queue; once refresh completes, they are resolved with the new token or rejected.
3. What are the security considerations for storing tokens in a React app?
      Access tokens should be kept in memory or localStorage (with XSS risk). Refresh tokens are safer in HTTP-only cookies (not accessible from JS). Never store secrets in frontend code; use environment variables for public config only.

Scenario-Based

Q: Your app has multiple API endpoints. How would you organize API calls?
Answer: I would create a service layer with modules for each domain (e.g., userService, authService). All modules use a shared Axios instance configured with base URL and interceptors. Components import service functions and handle loading/error states.

Coding Questions

1. Write an Axios request interceptor that adds a JWT token from localStorage.

```javascript
axios.interceptors.request.use(config => {
  const token = localStorage.getItem('token');
  if (token) {
    config.headers.Authorization = `Bearer ${token}`;
  }
  return config;
});
```

2. Create a custom hook useFetch that uses Axios to fetch data and returns { data, loading, error }.

```jsx
import { useState, useEffect } from 'react';
import axios from 'axios';

function useFetch(url) {
  const [data, setData] = useState(null);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  useEffect(() => {
    let cancelled = false;
    const fetchData = async () => {
      try {
        setLoading(true);
        const res = await axios.get(url);
        if (!cancelled) setData(res.data);
      } catch (err) {
        if (!cancelled) setError(err.message);
      } finally {
        if (!cancelled) setLoading(false);
      }
    };
    fetchData();
    return () => { cancelled = true; };
  }, [url]);

  return { data, loading, error };
}
```

---

22. Common Mistakes & Best Practices

Mistake Best Practice
Not checking response.ok with Fetch Use Axios or manually check status
Hardcoding URLs in components Use Axios instance and environment variables
Storing refresh token in localStorage Prefer HTTP-only cookies
Not handling token refresh queue Implement proper queue to avoid multiple refreshes
Ignoring loading/error states Always provide feedback to users
Duplicating API logic Create service layer
Not normalizing errors Use interceptors or utility functions

---

23. Testing API Integration

· Mock Axios/Fetch in unit tests (using jest.mock or MSW).
· Test service functions return correct data.
· Test interceptors with mocked requests.
· Use Mock Service Worker (MSW) for integration testing.
· Simulate 401 and verify token refresh flow.

---

This concludes Module 08: API Integration. The next module is Module 09: React Router, covering routing concepts, nested routes, protected routes, and more.

Module 09: React Router

React Router is the standard library for routing in React applications. It enables navigation between different components, handling URL changes, and building single-page applications with multiple views. This module covers installation, core components, hooks, advanced routing patterns, and modern features like loaders and actions.

---

1. React Router Installation

1.1 Definition

React Router is a collection of navigational components and hooks that allow you to declare routes in a React app. It keeps the UI in sync with the URL, enabling bookmarking, sharing, and browser back/forward navigation.

1.2 Why It Exists

Single-page applications need client-side routing without full page reloads. React Router provides a declarative way to map URLs to components, manage history, and handle nested routes.

1.3 Installation

For web applications, use react-router-dom:

```bash
npm install react-router-dom
```

For React Native, use react-router-native.

1.4 Current Version

As of 2024, React Router v6 is the latest major version. It introduces significant changes from v5, including a new <Routes> component, useNavigate instead of useHistory, and route element composition.

1.5 Setting Up

Wrap your app with BrowserRouter at the root:

```jsx
import { BrowserRouter } from 'react-router-dom';

function App() {
  return (
    <BrowserRouter>
      <div>... routes ...</div>
    </BrowserRouter>
  );
}
```

---

2. BrowserRouter

2.1 Definition

BrowserRouter is a router implementation that uses the HTML5 History API (pushState, replaceState, popstate) to keep the UI in sync with the URL. It is the most common router for web apps.

2.2 Why It Exists

To provide clean URLs without hash symbols and enable server-side rendering. The History API allows programmatic navigation and URL manipulation.

2.3 Usage

Place it at the root of your application, usually in index.js or App.js.

```jsx
import { BrowserRouter } from 'react-router-dom';

ReactDOM.createRoot(document.getElementById('root')).render(
  <BrowserRouter>
    <App />
  </BrowserRouter>
);
```

2.4 Alternatives

· HashRouter: Uses URL hash (#), works without server configuration.
· MemoryRouter: Keeps history in memory, useful for testing.
· NativeRouter: For React Native.

2.5 Server Configuration

For production, ensure the server redirects all requests to index.html to avoid 404 on deep links (e.g., using Nginx try_files).

---

3. Routes

3.1 Definition

Routes is a component that wraps a set of Route components and renders the first one that matches the current URL. It replaces the older <Switch> from v5.

3.2 Why It Exists

To efficiently determine which route to render based on the current URL path.

3.3 Usage

```jsx
import { Routes, Route } from 'react-router-dom';

<Routes>
  <Route path="/" element={<Home />} />
  <Route path="/about" element={<About />} />
</Routes>
```

3.4 Matching Behavior

· Routes scans its children Route elements and picks the best match.
· Paths are matched by segment; no exact prop needed (but can use * for wildcard).
· Routes can be nested.

---

4. Route

4.1 Definition

Route is a component that maps a URL path to a React element (component). It can be nested to create hierarchical layouts.

4.2 Props

· path: URL pattern (string). Can include dynamic segments (:id) or wildcard (*).
· element: React element to render when path matches.
· index: Boolean to mark a default child route (replaces index prop in v5).
· loader, action, errorElement for data routing.

4.3 Example

```jsx
<Route path="/users/:userId" element={<UserProfile />} />
```

4.4 Index Route

An index route renders when the parent's path matches exactly. Example:

```jsx
<Route path="/dashboard" element={<DashboardLayout />}>
  <Route index element={<DashboardHome />} />
  <Route path="settings" element={<Settings />} />
</Route>
```

At /dashboard, DashboardHome renders inside DashboardLayout.

---

5. Link

5.1 Definition

Link is a component that renders an anchor tag (<a>) and enables navigation to another route without a full page reload.

5.2 Why It Exists

To provide accessible, SEO-friendly navigation that integrates with React Router's history.

5.3 Usage

```jsx
<Link to="/about">About</Link>
```

5.4 Props

· to: target path (string or object).
· replace: if true, replaces current entry in history.
· state: data to pass to the next route.
· reloadDocument: force full page reload (rare).

5.5 Example with state

```jsx
<Link to="/profile" state={{ from: 'home' }}>Profile</Link>
```

---

6. NavLink

6.1 Definition

NavLink is a special version of Link that adds styling attributes when it matches the current URL. It's used for navigation menus where the active link should be highlighted.

6.2 Usage

```jsx
<NavLink to="/" className={({ isActive }) => isActive ? 'active' : ''}>
  Home
</NavLink>
```

6.3 Additional Props

· className: can be a function receiving { isActive, isPending }.
· style: can be a function.
· end: if true, only match exactly (for index routes).

6.4 Example

```jsx
<NavLink to="/" end className={({ isActive }) => isActive ? 'active' : ''}>
  Home
</NavLink>
```

---

7. Navigate

7.1 Definition

Navigate is a component that redirects the user to another route when rendered. It is the declarative replacement for useNavigate in certain cases.

7.2 Usage

```jsx
<Navigate to="/login" replace />
```

7.3 When to Use

· Redirecting after a condition (e.g., user not authenticated).
· Replacing legacy Redirect component.

7.4 Props

· to: target path.
· replace: if true, replace history entry.
· state: data to pass.

---

8. useNavigate

8.1 Definition

useNavigate is a hook that returns a function to programmatically navigate to another route.

8.2 Why It Exists

To navigate in response to user actions, effects, or logic outside of Link.

8.3 Usage

```jsx
import { useNavigate } from 'react-router-dom';

function LoginButton() {
  const navigate = useNavigate();
  const handleClick = () => navigate('/login');
  return <button onClick={handleClick}>Login</button>;
}
```

8.4 Options

· navigate(to, { replace: true })
· navigate(-1) for back, navigate(1) for forward.

8.5 Difference from v5

useHistory is replaced by useNavigate.

---

9. useParams

9.1 Definition

useParams returns an object of key-value pairs of the dynamic parameters from the current URL, as defined in the route path.

9.2 Why It Exists

To access URL parameters in a component without prop drilling.

9.3 Usage

```jsx
// Route: /users/:userId
function UserProfile() {
  const { userId } = useParams();
  return <div>User ID: {userId}</div>;
}
```

9.4 Multiple Parameters

Path /products/:category/:id → useParams() returns { category, id }.

9.5 Important

Params are strings; convert to number if needed.

---

10. URL Parameters

10.1 Definition

URL parameters (path parameters) are dynamic segments in the URL path. They are defined in the route using :paramName and accessed via useParams.

10.2 Usage

· Define route: <Route path="/users/:userId" element={<User />} />
· Navigate: <Link to="/users/123">User 123</Link>
· Access: const { userId } = useParams();

10.3 When to Use

When the resource identity is part of the URL (e.g., user profile, product details).

10.4 Example with Data Fetching

```jsx
function User() {
  const { userId } = useParams();
  const [user, setUser] = useState(null);

  useEffect(() => {
    fetch(`/api/users/${userId}`)
      .then(res => res.json())
      .then(setUser);
  }, [userId]);

  return <div>{user?.name}</div>;
}
```

---

11. Query Parameters

11.1 Definition

Query parameters are key-value pairs appended to the URL after a ?, used for filtering, sorting, pagination, etc. They are not part of the path and are accessed via useSearchParams or useLocation.

11.2 Example URL

/products?category=electronics&page=2

11.3 Accessing with useSearchParams

```jsx
import { useSearchParams } from 'react-router-dom';

function Products() {
  const [searchParams, setSearchParams] = useSearchParams();
  const category = searchParams.get('category');
  const page = searchParams.get('page') || 1;
  // ...
}
```

11.4 Setting Query Parameters

```jsx
setSearchParams({ category: 'books', page: '1' });
// or
setSearchParams(prev => { ... });
```

11.5 Alternative: useLocation

```jsx
const location = useLocation();
const params = new URLSearchParams(location.search);
const category = params.get('category');
```

---

12. useSearchParams

12.1 Definition

useSearchParams is a hook that reads and updates the query string in the URL, similar to useState but synced with the URL.

12.2 Why It Exists

To manage query parameters declaratively and keep the URL in sync with component state.

12.3 Usage

```jsx
const [searchParams, setSearchParams] = useSearchParams();

// Read
const sort = searchParams.get('sort');

// Update
setSearchParams({ sort: 'asc' });
```

12.4 Functional Updates

```jsx
setSearchParams(prev => {
  const newParams = new URLSearchParams(prev);
  newParams.set('page', String(Number(newParams.get('page') || 1) + 1));
  return newParams;
});
```

12.5 Important

setSearchParams triggers a navigation, so it updates the URL and re-renders.

---

13. useLocation

13.1 Definition

useLocation returns the current location object, containing pathname, search, hash, state, and key.

13.2 Why It Exists

To access current URL information and state passed during navigation.

13.3 Usage

```jsx
const location = useLocation();
console.log(location.pathname); // "/products"
console.log(location.search);   // "?category=books"
console.log(location.state);    // state passed from Link
```

13.4 Passing State

```jsx
<Link to="/profile" state={{ from: 'home' }}>Profile</Link>
// In Profile:
const location = useLocation();
const from = location.state?.from;
```

13.5 Use Cases

· Highlight active link
· Preserve background location for modals
· Access route state

---

14. Nested Routes

14.1 Definition

Nested routes allow you to render child components inside a parent component's layout. The parent route element includes an <Outlet /> where child routes render.

14.2 Why It Exists

To create hierarchical UIs (e.g., dashboard with sidebar and content area) without duplicating layout.

14.3 Example

```jsx
<Routes>
  <Route path="/dashboard" element={<DashboardLayout />}>
    <Route index element={<DashboardHome />} />
    <Route path="users" element={<Users />} />
    <Route path="settings" element={<Settings />} />
  </Route>
</Routes>
```

DashboardLayout contains <Outlet />:

```jsx
function DashboardLayout() {
  return (
    <div>
      <nav>Sidebar</nav>
      <main><Outlet /></main>
    </div>
  );
}
```

---

15. Outlet

15.1 Definition

Outlet is a component used within a parent route element to indicate where child route elements should be rendered.

15.2 Why It Exists

To enable nested routes; without it, child routes would not appear.

15.3 Usage

Simply include <Outlet /> in the layout component. You can also use useOutlet hook for advanced cases.

15.4 Example with Context

You can pass context to outlet:

```jsx
function Layout() {
  const [user] = useState(...);
  return (
    <div>
      <Header />
      <Outlet context={{ user }} />
    </div>
  );
}
```

Child access via useOutletContext:

```jsx
const { user } = useOutletContext();
```

---

16. Index Routes

16.1 Definition

An index route is a child route that matches the parent's path exactly and renders inside the parent's outlet. It is declared with the index prop (or index attribute without a path).

16.2 Why It Exists

To provide a default child when the parent URL matches but no other child path does.

16.3 Example

```jsx
<Route path="/" element={<Layout />}>
  <Route index element={<Home />} />
  <Route path="about" element={<About />} />
</Route>
```

At /, Home renders inside Layout.

16.4 Difference from path=""

In v6, index replaces path="" from v5.

---

17. Dynamic Routes

17.1 Definition

Dynamic routes use path parameters to match varying URL segments. They are defined with a colon (:param) and can include multiple params and splats.

17.2 Example

```jsx
<Route path="/products/:productId" element={<ProductDetails />} />
```

17.3 Nested Dynamic Routes

```jsx
<Route path="/users/:userId" element={<UserLayout />}>
  <Route index element={<UserProfile />} />
  <Route path="posts" element={<UserPosts />} />
</Route>
```

17.4 Access Params with useParams

```jsx
const { userId } = useParams();
```

---

18. Protected Routes

18.1 Definition

Protected routes are routes that require authentication or authorization before access. If the user is not authenticated, they are redirected to a login page.

18.2 Why It Exists

To secure parts of the application and enforce access control.

18.3 Implementation Approaches

· Wrapper component: Check auth state; if not authenticated, render <Navigate to="/login" />.
· Route guard component: Use as parent route element.

18.4 Example: ProtectedRoute component

```jsx
import { Navigate, Outlet } from 'react-router-dom';
import { useAuth } from '../auth/AuthContext';

function ProtectedRoute() {
  const { isAuthenticated } = useAuth();

  if (!isAuthenticated) {
    return <Navigate to="/login" replace />;
  }

  return <Outlet />;
}
```

Usage:

```jsx
<Routes>
  <Route path="/dashboard" element={<ProtectedRoute />}>
    <Route index element={<Dashboard />} />
  </Route>
</Routes>
```

Alternatively, wrap individual elements:

```jsx
<Route path="/dashboard" element={isAuthenticated ? <Dashboard /> : <Navigate to="/login" />} />
```

---

19. Role-Based Routes

19.1 Definition

Role-based routes restrict access based on user roles (e.g., admin, user). They extend protected routes by checking if the user's role is allowed.

19.2 Why It Exists

To implement authorization and ensure only authorized users can access certain features.

19.3 Implementation

Create a component that checks user.role against allowed roles:

```jsx
function RoleBasedRoute({ allowedRoles, children }) {
  const { user } = useAuth();

  if (!user) {
    return <Navigate to="/login" replace />;
  }

  if (!allowedRoles.includes(user.role)) {
    return <Navigate to="/unauthorized" replace />;
  }

  return children;
}
```

Usage:

```jsx
<Route
  path="/admin"
  element={
    <RoleBasedRoute allowedRoles={['admin']}>
      <AdminDashboard />
    </RoleBasedRoute>
  }
/>
```

19.4 Best Practices

· Centralize role checks in a helper function.
· Use Outlet for nested role-based routes.

---

20. 404 / Not Found

20.1 Definition

A 404 (Not Found) route is displayed when no other route matches the current URL. It is defined with a catch-all path *.

20.2 Why It Exists

To provide a friendly error page instead of a blank screen or default browser error.

20.3 Implementation

```jsx
<Routes>
  <Route path="/" element={<Home />} />
  <Route path="/about" element={<About />} />
  <Route path="*" element={<NotFound />} />
</Routes>
```

NotFound component displays a 404 message.

20.4 Nested 404

For nested routes, you can add a * route inside the parent to handle unmatched child paths.

---

21. Route Redirect

21.1 Definition

Route redirect is the process of sending a user from one URL to another, either declaratively or programmatically.

21.2 Declarative

Use <Navigate> component:

```jsx
<Route path="/old-path" element={<Navigate to="/new-path" replace />} />
```

21.3 Programmatic

Use useNavigate:

```jsx
const navigate = useNavigate();
navigate('/new-path');
```

21.4 Redirect after login

```jsx
const location = useLocation();
const navigate = useNavigate();
const from = location.state?.from || '/dashboard';
navigate(from, { replace: true });
```

---

22. Lazy Routes

22.1 Definition

Lazy routes load route components only when they are needed (code splitting). This reduces the initial bundle size and improves performance.

22.2 Why It Exists

To split code by route and load on demand, especially for large applications.

22.3 Implementation with React.lazy and Suspense

```jsx
import { lazy, Suspense } from 'react';

const Home = lazy(() => import('./Home'));
const About = lazy(() => import('./About'));

function App() {
  return (
    <Suspense fallback={<div>Loading...</div>}>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/about" element={<About />} />
      </Routes>
    </Suspense>
  );
}
```

22.4 Best Practices

· Use Suspense with a meaningful fallback.
· Consider preloading routes on hover.
· Use route-level code splitting for large apps.

---

23. Route Loading

23.1 Definition

Route loading refers to showing a loading indicator while the lazy-loaded component is being fetched, or while route data is loading.

23.2 With Lazy Loading

Wrap <Routes> in <Suspense> and provide a fallback.

23.3 With Data Loaders (v6.4+)

Data loaders can return promises; the UI waits until data is ready before rendering. Use loader prop on Route.

```jsx
<Route path="/users" element={<Users />} loader={async () => {
  const users = await fetchUsers();
  return { users };
}} />
```

Then in component, use useLoaderData() to access data.

23.4 Showing Loading State

React Router v6.4+ integrates with useNavigation hook to show global loading indicator:

```jsx
const navigation = useNavigation();
if (navigation.state === 'loading') {
  return <Spinner />;
}
```

---

24. Forms with Routes

24.1 Definition

React Router v6.4+ introduces <Form> component and action functions to handle form submissions declaratively, without manual onSubmit and useNavigate.

24.2 Why It Exists

To simplify data mutations and integrate with routing, enabling progressive enhancement.

24.3 <Form> Component

```jsx
import { Form } from 'react-router-dom';

function Login() {
  return (
    <Form method="post" action="/login">
      <input type="text" name="username" />
      <input type="password" name="password" />
      <button type="submit">Login</button>
    </Form>
  );
}
```

24.4 Route with Action

```jsx
<Route path="/login" element={<Login />} action={async ({ request }) => {
  const formData = await request.formData();
  // process login
  return redirect('/dashboard');
}} />
```

On submit, the action runs, and the user is redirected accordingly.

24.5 Benefits

· Declarative form handling
· Automatic CSRF token handling (with useFetcher)
· Works without JavaScript (progressive enhancement)

---

25. Route Loaders

25.1 Definition

Loaders are functions that fetch data before a route renders. They are defined on a Route via the loader prop, and the component accesses data with useLoaderData.

25.2 Why It Exists

To move data fetching closer to routes, avoiding manual useEffect fetch and providing data before render (or with a loading state).

25.3 Example

```jsx
<Route
  path="/users/:id"
  element={<UserProfile />}
  loader={async ({ params }) => {
    const user = await fetchUser(params.id);
    return { user };
  }}
/>
```

In component:

```jsx
function UserProfile() {
  const { user } = useLoaderData();
  return <div>{user.name}</div>;
}
```

25.4 Error Handling

If loader throws, you can provide an errorElement on the route to show an error boundary.

```jsx
<Route path="/users/:id" element={<UserProfile />} loader={...} errorElement={<ErrorPage />} />
```

---

26. Route Actions

26.1 Definition

Actions are functions that handle data mutations triggered by <Form> submissions. They are defined on a Route via the action prop. After the action, you can redirect or return data.

26.2 Why It Exists

To handle form submissions in a declarative, route-centric way, enabling automatic revalidation of loaders.

26.3 Example

```jsx
<Route
  path="/login"
  element={<Login />}
  action={async ({ request }) => {
    const formData = await request.formData();
    const { username, password } = Object.fromEntries(formData);
    await loginApi(username, password);
    return redirect('/dashboard');
  }}
/>
```

26.4 Using useActionData

If action returns data (e.g., errors), the component can access it via useActionData:

```jsx
function Login() {
  const actionData = useActionData();
  return <div>{actionData?.error}</div>;
}
```

---

27. Advanced: Route Loaders and Actions with useFetcher

useFetcher is a hook for calling loaders/actions from components without navigation, useful for forms that shouldn't change the URL (e.g., adding an item to cart).

```jsx
const fetcher = useFetcher();
<fetcher.Form method="post" action="/cart/add">
  <input name="productId" />
</fetcher.Form>
```

---

28. Module 09 – Quick Revision

· BrowserRouter wraps the app; Routes and Route define mapping.
· Link and NavLink for navigation; useNavigate for programmatic.
· useParams for path params; useSearchParams for query strings; useLocation for current URL.
· Nested routes use Outlet; index routes provide default child.
· Protected routes via conditional rendering or wrapper with Navigate.
· Lazy routes with React.lazy and Suspense.
· v6.4+ introduces loaders and actions for data fetching and form handling.

---

29. Interview Questions – Module 09

Beginner

1. What is React Router?
      A library for handling routing in React applications, allowing navigation between components and URL management.
2. How do you define a route?
      Using <Routes> and <Route> with a path and element prop.
3. What is Link used for?
      To navigate between routes without a full page reload.

Intermediate

1. Explain nested routes and Outlet.
      Nested routes allow child components to render inside a parent layout. The parent includes <Outlet /> where child routes will appear.
2. How do you access URL parameters?
      Using the useParams hook.
3. What is the difference between useNavigate and Navigate?
      useNavigate is a hook for programmatic navigation; Navigate is a component for declarative redirects.

Advanced

1. How do you implement protected routes?
      Create a wrapper component that checks authentication; if not authenticated, render <Navigate to="/login" />. Or use route loaders/actions with auth checks.
2. Explain loaders and actions in React Router v6.4+.
      Loaders fetch data before rendering; actions handle form submissions. They are defined on routes and accessed via useLoaderData and useActionData. They enable data fetching without manual useEffect.
3. How would you implement role-based access control?
      Create a component that checks the user's role against allowed roles and redirects if unauthorized. Combine with authentication checks.

Scenario-Based

Q: You have a large app with many routes. How do you optimize performance?
Answer: Use route-level code splitting with React.lazy and Suspense, enabling lazy loading of route components. Also use loaders to fetch data in parallel with component loading.

Coding Questions

1. Write a route that dynamically renders a user profile based on userId parameter.

```jsx
<Route path="/users/:userId" element={<UserProfile />} />
// UserProfile:
const { userId } = useParams();
```

2. Implement a protected route that redirects unauthenticated users to login.

```jsx
function ProtectedRoute() {
  const { isAuthenticated } = useAuth();
  return isAuthenticated ? <Outlet /> : <Navigate to="/login" replace />;
}
```

---

30. Common Mistakes & Best Practices

Mistake Best Practice
Forgetting BrowserRouter wrapper Wrap root with BrowserRouter
Using exact prop (v5 legacy) Use index for exact child matches
Not providing key for dynamic routes React Router handles parameter changes, but ensure components update
Overusing nested routes Keep nesting level manageable
Not handling 404 Add catch-all * route
Using <a> for internal navigation Use Link to avoid full reload

---

31. Real-World Scenario: E-Commerce with Protected Checkout

Problem: An e-commerce app has public product pages and a protected checkout flow. The checkout has multiple steps. Need role-based access for admin dashboard.

Solution:

· Use BrowserRouter and nested routes.
· Public routes: /, /products/:id.
· Protected route: /checkout (requires login), with nested steps.
· Admin route: /admin (requires role admin).
· Use lazy loading for checkout and admin sections.

Architecture:

```mermaid
flowchart TD
    App --> BrowserRouter
    BrowserRouter --> PublicRoutes
    BrowserRouter --> ProtectedRoutes
    PublicRoutes --> Home
    PublicRoutes --> ProductDetails
    ProtectedRoutes --> CheckoutLayout
    CheckoutLayout --> Shipping
    CheckoutLayout --> Payment
    CheckoutLayout --> Review
    ProtectedRoutes --> AdminDashboard
```

Implementation Highlights:

· ProtectedRoute wrapper checks auth.
· RoleBasedRoute checks role.
· CheckoutLayout uses <Outlet /> and step navigation.
· Data loaders fetch product details.

---

This concludes Module 09: React Router. The next module is Module 10: Authentication & Authorization, covering JWT, token storage, role-based access, and more.


Module 10: Authentication & Authorization

Authentication and authorization are essential for securing React applications. This module covers the complete flow: user registration, login, logout, token-based authentication (JWT), secure token storage, and protecting routes based on roles and permissions. You'll learn how to build an authentication context, manage sessions, and implement automatic token refresh for a seamless user experience.

---

1. Introduction

Authentication verifies who the user is, while authorization determines what they can access. In modern React apps, these are typically implemented using JSON Web Tokens (JWT) and role-based access control (RBAC). This module provides a practical, production-oriented guide to implementing authentication and authorization in a React frontend.

---

2. Login

2.1 Definition

Login is the process of verifying user credentials (e.g., username/email and password) and establishing a session. The client sends credentials to a server, which validates them and returns tokens (access and refresh tokens) upon success.

2.2 Why It Exists

To authenticate users and provide secure access to protected resources.

2.3 Implementation Steps

1. Collect credentials from a form.
2. Send a POST request to /auth/login.
3. Store the returned tokens securely.
4. Update authentication state (e.g., set user, isAuthenticated).
5. Redirect to a protected page.

2.4 Basic Example with Axios

```javascript
const loginUser = async (credentials) => {
  const response = await axios.post('/auth/login', credentials);
  return response.data; // { accessToken, refreshToken, user }
};
```

2.5 In a React Component

```jsx
const { login } = useAuth();

const handleSubmit = async (e) => {
  e.preventDefault();
  try {
    await login({ email, password });
    navigate('/dashboard');
  } catch (error) {
    setError('Invalid credentials');
  }
};
```

2.6 Best Practices

· Use HTTPS to protect credentials in transit.
· Validate input before sending.
· Show clear error messages.
· Avoid storing passwords in state after submission.

---

3. Registration

3.1 Definition

Registration is the process of creating a new user account. The client sends user information (name, email, password) to a registration endpoint, which creates a user and often returns tokens or a success response.

3.2 Why It Exists

To allow new users to create accounts and gain access to the application.

3.3 Implementation Example

```javascript
const registerUser = (userData) => {
  return axios.post('/auth/register', userData);
};
```

3.4 Password Confirmation and Validation

Use forms with validation (e.g., React Hook Form + Zod) to ensure data quality before sending.

3.5 After Registration

· Automatically log in the user (if tokens returned).
· Redirect to a welcome or dashboard page.
· Or require email verification.

3.6 Best Practices

· Hash passwords on the server (never on client).
· Use CAPTCHA to prevent bots.
· Validate email format and password strength.

---

4. Logout

4.1 Definition

Logout ends the user's session by invalidating tokens on the client (and optionally on the server) and clearing authentication state.

4.2 Why It Exists

To allow users to securely terminate their session.

4.3 Implementation Steps

1. Call a logout endpoint if available (to revoke refresh token).
2. Remove tokens from storage (localStorage, cookies).
3. Reset authentication context.
4. Redirect to login or home page.

4.4 Example

```javascript
const logout = async () => {
  await axios.post('/auth/logout');
  localStorage.removeItem('accessToken');
  localStorage.removeItem('refreshToken');
  setUser(null);
  setIsAuthenticated(false);
  navigate('/login');
};
```

4.5 Best Practices

· Always clear client-side tokens.
· Consider revoking refresh token on server.
· Ensure no stale state remains after logout.

---

5. JWT Authentication

5.1 Definition

JWT (JSON Web Token) is a compact, URL-safe token format used for securely transmitting claims between parties. In authentication, it is commonly used as an access token to authorize API requests.

5.2 JWT Structure

A JWT consists of three parts separated by dots:

· Header: Contains token type and signing algorithm.
· Payload: Contains claims (user ID, role, expiration).
· Signature: Verifies the token's integrity.

Example: xxxxx.yyyyy.zzzzz

5.3 Why JWT?

· Stateless: server does not need to store session data.
· Scalable: works well with microservices and APIs.
· Self-contained: user information embedded.
· Can be used across domains (with CORS).

5.4 How JWT Authentication Works

1. User logs in → server validates credentials.
2. Server generates a signed JWT containing user info.
3. Client stores the JWT and includes it in subsequent requests via Authorization: Bearer <token>.
4. Server verifies signature and extracts user identity.

5.5 Security Considerations

· Always use HTTPS.
· Set short expiry for access tokens.
· Use strong signing algorithms (HS256, RS256).
· Never store sensitive data in JWT payload (it's only base64-encoded, not encrypted).

5.6 Interview Question

Q: What is JWT and how does it work in authentication?
Answer: JWT is a token format that encodes claims. In authentication, the server signs a JWT after login, the client stores it and sends it in Authorization header. The server verifies the signature to authenticate requests without server-side session storage.

---

6. Access Token

6.1 Definition

An access token is a short-lived credential that authorizes API requests. It contains user identity and permissions and is validated by the server on each request.

6.2 Properties

· Expires quickly (e.g., 15–60 minutes).
· Sent in Authorization header as Bearer token.
· Should be kept in memory or localStorage (with caution).

6.3 Usage

```javascript
axios.get('/api/data', {
  headers: { Authorization: `Bearer ${accessToken}` }
});
```

6.4 Security

· Do not store access token in localStorage if XSS is a concern; prefer memory or HTTP-only cookies.
· Access token is not meant to be read by client code; treat it as opaque.

---

7. Refresh Token

7.1 Definition

A refresh token is a long-lived credential used to obtain a new access token without user re-authentication. It is typically stored in an HTTP-only cookie.

7.2 Why It Exists

To maintain user sessions while keeping access tokens short-lived for security. If an access token is stolen, its short lifetime limits damage.

7.3 Refresh Flow

1. Access token expires → API returns 401.
2. Client sends refresh token to /auth/refresh.
3. Server validates refresh token and issues new access token (and possibly new refresh token).
4. Client retries the original request.

7.4 Storage

· HTTP-only cookie (recommended): Not accessible via JavaScript, mitigating XSS.
· localStorage: Vulnerable to XSS.
· Memory: Lost on page refresh.

7.5 Interview Question

Q: Why use a refresh token instead of just a long-lived access token?
Answer: Short access tokens limit the exposure window if stolen, while refresh tokens (stored securely) allow seamless renewal without frequent logins. This balances security and user experience.

---

8. Token Storage

8.1 Definition

Token storage refers to where authentication tokens are kept on the client side. Common options: memory, localStorage, sessionStorage, and cookies.

8.2 Comparison of Storage Options

Storage Pros Cons
Memory (JS variable) Not accessible via XSS, cleared on refresh Lost on page reload, not persistent
localStorage Persistent, simple Accessible to XSS, not auto-sent
sessionStorage Same tab, cleared on close Still XSS risk, not persistent across tabs
HTTP-only cookie Not XSS accessible, auto-sent, secure flag CSRF risk (mitigated with SameSite), requires server config

8.3 Best Practices

· Store refresh token in HTTP-only cookie with Secure and SameSite=Strict.
· Keep access token in memory (with silent refresh via cookie).
· If using localStorage for access token, ensure strong XSS defenses.
· Never store tokens in plain text files or version control.

8.4 Interview Question

Q: Where should you store JWTs in a React app?
Answer: Access token ideally in memory (or short-lived); refresh token in HTTP-only cookie. Avoid localStorage for high-security applications due to XSS risk.

---

9. HTTP-Only Cookies

9.1 Definition

HTTP-only cookies are cookies that cannot be accessed via JavaScript (document.cookie). They are sent automatically with HTTP requests, making them ideal for storing sensitive tokens like refresh tokens.

9.2 Why It Exists

To protect tokens from XSS attacks. Even if malicious script runs, it cannot read the cookie.

9.3 Setting HTTP-Only Cookie (Server-side)

```
Set-Cookie: refreshToken=...; HttpOnly; Secure; SameSite=Strict; Path=/; Max-Age=604800
```

9.4 Using HTTP-Only Cookies in React

· On login, the server sets the refresh token cookie.
· The client does not handle the refresh token directly; it's automatically sent with requests (same-origin).
· For cross-site APIs, need SameSite=None; Secure and CORS with credentials.

9.5 Security Considerations

· CSRF: Since cookies are auto-sent, protect with SameSite and CSRF tokens.
· Combine with access token in Authorization header for API calls; refresh endpoint uses cookie.

9.6 Best Practices

· Always set Secure flag in production.
· Use SameSite=Strict or Lax to mitigate CSRF.
· Set short expiration for access token, long for refresh cookie.

9.7 Interview Question

Q: Why are HTTP-only cookies considered more secure for refresh tokens?
Answer: They are inaccessible to JavaScript, preventing XSS attacks from stealing the token. Combined with Secure and SameSite flags, they reduce the attack surface.

---

10. Protected Routes

10.1 Definition

Protected routes are routes that require authentication before access. Unauthenticated users are redirected to a login page.

10.2 Implementation in React Router

Create a wrapper component that checks auth state and redirects if not authenticated.

```jsx
import { Navigate, Outlet } from 'react-router-dom';
import { useAuth } from '../auth/AuthContext';

function ProtectedRoute() {
  const { isAuthenticated } = useAuth();

  if (!isAuthenticated) {
    return <Navigate to="/login" replace />;
  }

  return <Outlet />;
}
```

Use it as a layout route:

```jsx
<Routes>
  <Route element={<ProtectedRoute />}>
    <Route path="/dashboard" element={<Dashboard />} />
    <Route path="/profile" element={<Profile />} />
  </Route>
</Routes>
```

10.3 Alternative Inline Check

```jsx
<Route path="/dashboard" element={isAuthenticated ? <Dashboard /> : <Navigate to="/login" />} />
```

10.4 Best Practices

· Centralize auth logic in context.
· Use Outlet for nested protected routes.
· Preserve the original location to redirect back after login.

---

11. Role-Based Access Control (RBAC)

11.1 Definition

Role-Based Access Control restricts access based on user roles (e.g., admin, editor, user). Each role has a set of permissions.

11.2 Why It Exists

To enforce authorization: different users have different levels of access.

11.3 Implementation

Create a component that checks the user's role against allowed roles:

```jsx
function RequireRole({ allowedRoles, children }) {
  const { user } = useAuth();

  if (!user) return <Navigate to="/login" replace />;

  if (!allowedRoles.includes(user.role)) {
    return <Navigate to="/unauthorized" replace />;
  }

  return children;
}
```

Usage:

```jsx
<Route path="/admin" element={
  <RequireRole allowedRoles={['admin']}>
    <AdminDashboard />
  </RequireRole>
} />
```

11.4 Best Practices

· Keep role definitions consistent with backend.
· Use a central config for roles and permissions.
· Avoid hardcoding role checks scattered across components.

11.5 Interview Question

Q: How do you implement role-based access control in React?
Answer: By checking the authenticated user's role against required roles for a route. Use a wrapper component or higher-order component to conditionally render or redirect. Combine with backend enforcement for security.

---

12. Permission-Based Access

12.1 Definition

Permission-based access is a more granular approach than roles. Instead of checking roles, you check specific permissions (e.g., canEditPosts, canDeleteUser). Roles can be mapped to permissions.

12.2 Why It Exists

To provide fine-grained control over what users can do, avoiding role explosion and enabling flexible access policies.

12.3 Implementation

Define a hasPermission function:

```javascript
const hasPermission = (user, permission) => {
  return user?.permissions?.includes(permission) || user?.role?.permissions?.includes(permission);
};
```

Use it in components or route guards:

```jsx
function Can({ permission, children }) {
  const { user } = useAuth();
  if (!hasPermission(user, permission)) {
    return null; // or redirect
  }
  return children;
}
```

12.4 Benefits

· More maintainable for complex systems.
· Aligns with backend authorization checks.

12.5 Best Practices

· Backend must also enforce permissions; frontend checks are for UI only.
· Use a permission matrix if needed.

---

13. Authentication Context

13.1 Definition

Authentication Context is a React Context that provides authentication state (user, tokens, isAuthenticated) and methods (login, logout, refresh) to all components.

13.2 Why It Exists

To avoid prop drilling and centralize authentication logic, making it accessible anywhere in the app.

13.3 Example Implementation

```jsx
import { createContext, useContext, useState, useMemo } from 'react';
import axios from 'axios';

const AuthContext = createContext(null);

export function AuthProvider({ children }) {
  const [user, setUser] = useState(null);

  const login = async (credentials) => {
    const response = await axios.post('/auth/login', credentials);
    const { accessToken, user: userData } = response.data;
    localStorage.setItem('accessToken', accessToken);
    setUser(userData);
  };

  const logout = async () => {
    await axios.post('/auth/logout');
    localStorage.removeItem('accessToken');
    setUser(null);
  };

  const value = useMemo(() => ({
    user,
    isAuthenticated: !!user,
    login,
    logout
  }), [user]);

  return <AuthContext.Provider value={value}>{children}</AuthContext.Provider>;
}

export const useAuth = () => useContext(AuthContext);
```

13.4 Using Axios Interceptors with Auth Context

You can combine the AuthContext with Axios instance to automatically handle token refresh.

---

14. Session Management

14.1 Definition

Session management is the process of maintaining user state across requests and page reloads. In token-based auth, it involves storing tokens, refreshing access tokens, and restoring user data.

14.2 Key Aspects

· Persistence: Keep user logged in after refresh.
· Restoration: On app load, check stored tokens and validate them.
· Refresh: Silently renew access tokens.
· Timeout: Handle session expiry gracefully.

14.3 Implementation Strategy

· On app mount, check for existing tokens (e.g., from localStorage or cookie) and attempt to validate/refresh.
· If valid, set user state; if not, clear tokens.
· Use axios interceptors to handle 401 and refresh automatically.

14.4 Example: Initial Auth Check

```jsx
useEffect(() => {
  const initializeAuth = async () => {
    const accessToken = localStorage.getItem('accessToken');
    if (accessToken) {
      try {
        const user = await fetchUserProfile();
        setUser(user);
      } catch {
        localStorage.removeItem('accessToken');
      }
    }
  };
  initializeAuth();
}, []);
```

14.5 Best Practices

· Use a central auth context to manage session state.
· Handle refresh token rotation (server issues new refresh token).
· Logout on refresh failure.

---

15. Automatic Token Refresh

15.1 Definition

Automatic token refresh is the process of obtaining a new access token when the current one expires, without user interaction. It is typically implemented via Axios response interceptors.

15.2 Flow Recap

1. Request fails with 401.
2. Interceptor checks if it's a token expiry (not login failure).
3. Uses refresh token (often from HTTP-only cookie) to request new access token.
4. Retries the original request with the new token.
5. If refresh fails, logout.

15.3 Implementation with Axios Interceptor

```javascript
let isRefreshing = false;
let pendingQueue = [];

const processQueue = (error, token = null) => {
  pendingQueue.forEach(prom => {
    if (error) prom.reject(error);
    else prom.resolve(token);
  });
  pendingQueue = [];
};

api.interceptors.response.use(
  (response) => response,
  async (error) => {
    const originalRequest = error.config;
    if (error.response?.status === 401 && !originalRequest._retry) {
      if (isRefreshing) {
        return new Promise((resolve, reject) => {
          pendingQueue.push({ resolve, reject });
        }).then(token => {
          originalRequest.headers.Authorization = `Bearer ${token}`;
          return api(originalRequest);
        }).catch(err => Promise.reject(err));
      }

      originalRequest._retry = true;
      isRefreshing = true;

      try {
        const { data } = await axios.post('/auth/refresh', {}, { withCredentials: true });
        const newAccessToken = data.accessToken;
        api.defaults.headers.common.Authorization = `Bearer ${newAccessToken}`;
        processQueue(null, newAccessToken);
        originalRequest.headers.Authorization = `Bearer ${newAccessToken}`;
        return api(originalRequest);
      } catch (refreshError) {
        processQueue(refreshError, null);
        // logout
        return Promise.reject(refreshError);
      } finally {
        isRefreshing = false;
      }
    }
    return Promise.reject(error);
  }
);
```

15.4 Important Considerations

· Avoid multiple simultaneous refresh calls.
· Queue pending requests while refreshing.
· Use a flag _retry to prevent infinite loops.
· On refresh failure, redirect to login.

15.5 Interview Question

Q: How do you implement automatic token refresh in Axios?
Answer: Use a response interceptor to detect 401 errors. Maintain an isRefreshing flag and a queue of pending requests. When a 401 occurs, attempt to refresh the token once. If successful, update the token, retry the original request, and resolve queued requests. If refresh fails, logout.

---

16. Real-World Scenario: Secure E-Commerce Authentication

Problem: An e-commerce site needs users to log in to view their orders and check out. Admins need access to a management dashboard. Tokens must be secure, and sessions should persist across page reloads with automatic refresh.

Solution:

· Use JWT authentication with short-lived access tokens (stored in memory) and refresh tokens in HTTP-only cookies.
· Auth context provides login/logout and user state.
· Axios interceptor handles 401 by refreshing token using cookie.
· Protected routes for user pages; role-based route for admin.
· On app load, attempt silent authentication by calling a /me endpoint that uses the refresh cookie to issue new tokens.

Architecture:

```mermaid
sequenceDiagram
    participant U as User
    participant R as React App
    participant S as Server

    U->>R: Login with credentials
    R->>S: POST /auth/login
    S-->>R: accessToken (short-lived), refreshToken cookie
    R->>R: Store accessToken in memory
    R->>S: GET /api/orders (with accessToken)
    S-->>R: 401 (expired)
    R->>S: POST /auth/refresh (cookie auto-sent)
    S-->>R: new accessToken
    R->>S: Retry GET /api/orders (with new token)
    S-->>R: 200 orders data
```

Implementation Highlights:

· AuthProvider with useState for user, useMemo for context.
· Axios instance with interceptors.
· Route guards ProtectedRoute and AdminRoute.
· useEffect on mount to call /auth/refresh or /me to restore session.

---

17. Module 10 – Quick Revision

· Login/Register: POST credentials, store tokens.
· Logout: clear tokens and state.
· JWT: stateless, signed token.
· Access token: short-lived, in Authorization header.
· Refresh token: long-lived, in HTTP-only cookie.
· Token storage: memory/HTTP-only cookie recommended.
· Protected routes: redirect if not authenticated.
· RBAC: check role; Permission-based: check specific permissions.
· Auth context: central state and methods.
· Automatic refresh: interceptor with queue.

---

18. Interview Questions – Module 10

Beginner

1. What is the difference between authentication and authorization?
      Authentication verifies identity; authorization determines access rights.
2. What is JWT?
      JSON Web Token, a compact token for securely transmitting claims; used for authentication.
3. How do you protect a route in React?
      By checking if user is authenticated and redirecting to login if not.

Intermediate

1. Explain the token refresh flow.
      When access token expires, client sends refresh token to get new access token, then retries the original request.
2. What is an HTTP-only cookie and why is it more secure?
      A cookie that cannot be accessed via JavaScript, reducing XSS risk; commonly used for refresh tokens.
3. How does an authentication context help?
      It provides global access to auth state and methods, avoiding prop drilling and centralizing logic.

Advanced

1. How would you implement automatic token refresh with Axios?
      Use a response interceptor to catch 401, maintain an isRefreshing flag and a queue, refresh token, retry requests, and handle logout if refresh fails.
2. What are the security implications of storing JWT in localStorage?
      localStorage is accessible to JavaScript; if XSS occurs, tokens can be stolen. HTTP-only cookies are safer for sensitive tokens.
3. Explain role-based vs permission-based access control.
      RBAC uses roles (admin, user) to determine access; permission-based uses specific permissions (canEdit, canDelete) for finer granularity. Permissions can be mapped to roles.

Scenario-Based

Q: Your app has a session that persists across page reloads. How do you restore the user session on refresh?
Answer: On app mount, check for existing refresh token (cookie) and call a refresh endpoint to obtain new access token and user data. Then set the auth context. If refresh fails, clear any tokens and treat user as logged out.

Coding Questions

1. Write a useAuth hook that provides user, login, logout, and isAuthenticated.

```jsx
function useAuth() {
  return useContext(AuthContext);
}
// AuthProvider implementation similar to above.
```

2. Implement a ProtectedRoute component using React Router v6.

```jsx
function ProtectedRoute() {
  const { isAuthenticated } = useAuth();
  return isAuthenticated ? <Outlet /> : <Navigate to="/login" replace />;
}
```

---

19. Common Mistakes & Best Practices

Mistake Best Practice
Storing both tokens in localStorage Store refresh token in HTTP-only cookie; access token in memory if possible
Not handling refresh token expiry Redirect to login on refresh failure
Checking roles only on frontend Enforce authorization on backend as well
Not centralizing auth logic Use AuthContext and Axios interceptors
Forgetting to clean up tokens on logout Clear all stored tokens and reset state
Using long-lived access tokens Keep access token short-lived (15-60 min)

---

20. Testing Authentication

· Mock API responses for login, refresh, logout.
· Test that protected routes redirect unauthenticated users.
· Test that role-based components hide/show based on role.
· Test token refresh flow with mocked interceptors.
· Use Mock Service Worker (MSW) for realistic API mocking.

---

This concludes Module 10: Authentication & Authorization. The next module is Module 11: State Management, covering Redux, Redux Toolkit, RTK Query, and more.



Module 11: State Management

State management in large React applications often requires a centralized store to handle shared, global, or complex state. Redux is the most popular state management library in the React ecosystem. This module covers Redux fundamentals, the modern Redux Toolkit approach, asynchronous operations, middleware, persistence, and RTK Query for server state. By the end, you will be able to architect state management for production applications.

---

1. State Management Concepts

1.1 Definition

State management refers to how application state is created, updated, and shared across components. In React, local state (useState, useReducer) works for isolated components, but for global state (user, theme, cart) or complex cross-cutting data, a centralized store becomes necessary.

1.2 Why It Exists

As applications grow, prop drilling and scattered state cause maintainability and performance issues. Centralized state management provides:

· Single source of truth
· Predictable updates
· Separation of concerns
· Easier debugging (time-travel, devtools)
· Scalability for large teams

1.3 Types of State

· Local state: within a component (useState)
· Global state: shared across components (Redux, Context)
· Server state: data from APIs, with caching (RTK Query, React Query)
· URL state: query params, route info

1.4 Choosing a State Management Solution

Factor Redux Context API React Query
Complexity Medium-high Low Medium
Performance Optimized with selectors Can cause re-renders if value changes Excellent for server state
Use case Large apps, complex updates Small-medium global data Data fetching, caching
Devtools Yes No Yes (React Query Devtools)

1.5 When to Use Redux

· Application has complex state that changes frequently.
· You need middleware for async operations, logging, etc.
· Many components need to access the same state.
· You want time-travel debugging and strict update patterns.

1.6 When Not to Use Redux

· Small apps with minimal shared state.
· State can be handled by Context API or lifting up.
· You are primarily dealing with server state (use RTK Query or React Query instead).

1.7 Interview Question

Q: When would you choose Redux over Context API?
Answer: Redux is preferable for large applications with frequent state updates, complex state transitions, and need for middleware/devtools. Context API is simpler and adequate for low-frequency global data like theme or auth status.

---

2. Redux (Core Library)

2.1 Definition

Redux is a predictable state container for JavaScript apps. It is based on three principles:

· Single source of truth: The entire application state is stored in one object (store).
· State is read-only: The only way to change state is by dispatching an action.
· Changes are made with pure functions: Reducers specify how actions transform state.

2.2 Why Redux Exists

To make state mutations predictable and traceable. It enforces unidirectional data flow and immutability, simplifying debugging and testing.

2.3 Data Flow in Redux

```mermaid
flowchart LR
    View[React Component] -->|dispatch action| Action
    Action --> Store
    Store --> Reducer
    Reducer -->|new state| Store
    Store -->|notify subscribers| View
```

2.4 Core Building Blocks

· Store: Holds the state tree.
· Actions: Plain objects describing what happened.
· Reducers: Pure functions that return new state based on action.
· Dispatch: Function to send actions to the store.
· Selectors: Functions to extract data from state.

2.5 Installation

```bash
npm install redux react-redux @reduxjs/toolkit
```

(React-Redux is the official binding; Redux Toolkit is the recommended way to write Redux.)

---

3. Redux Store

3.1 Definition

The store is the object that holds the application state. It provides methods:

· getState() – returns current state.
· dispatch(action) – updates state via reducer.
· subscribe(listener) – registers a callback on state changes.

3.2 Creating a Store (using Redux Toolkit)

```javascript
import { configureStore } from '@reduxjs/toolkit';
import rootReducer from './reducers';

const store = configureStore({
  reducer: rootReducer,
  // middleware automatically added
});

export default store;
```

Legacy way (without Toolkit):

```javascript
import { createStore, applyMiddleware } from 'redux';
import thunk from 'redux-thunk';
import rootReducer from './reducers';

const store = createStore(rootReducer, applyMiddleware(thunk));
```

3.3 Store Responsibilities

· Holds current state.
· Allows state updates via dispatch.
· Registers listeners.
· Unsubscribes listeners.

3.4 Interview Question

Q: What is the Redux store?
Answer: It is a single object that holds the whole application state and provides methods to access state, dispatch actions, and subscribe to changes.

---

4. Actions

4.1 Definition

Actions are plain JavaScript objects that describe an event. They must have a type property (string constant) and optionally a payload with data.

4.2 Why Actions Exist

They are the only way to send data from the application to the store. By describing what happened, they keep state updates traceable.

4.3 Action Example

```javascript
// Action object
{
  type: 'ADD_TODO',
  payload: { id: 1, text: 'Learn Redux' }
}
```

4.4 Action Creators

Functions that return action objects:

```javascript
const addTodo = (text) => ({
  type: 'ADD_TODO',
  payload: { id: Date.now(), text }
});
```

With Redux Toolkit, createSlice auto-generates action creators.

4.5 Best Practices

· Use constants for action types to avoid typos.
· Keep action payloads minimal.
· Use action creators instead of inline objects.

4.6 Interview Question

Q: What is an action in Redux?
Answer: An action is a plain object with a type field that describes an event. It is dispatched to the store to trigger a state change.

---

5. Reducers

5.1 Definition

A reducer is a pure function that takes the current state and an action, and returns a new state. It must not mutate the original state.

5.2 Signature

```javascript
(previousState, action) => newState
```

5.3 Example Reducer

```javascript
const initialState = { todos: [] };

function todoReducer(state = initialState, action) {
  switch (action.type) {
    case 'ADD_TODO':
      return { ...state, todos: [...state.todos, action.payload] };
    case 'REMOVE_TODO':
      return { ...state, todos: state.todos.filter(todo => todo.id !== action.payload.id) };
    default:
      return state;
  }
}
```

5.4 Combining Reducers

Multiple reducers can be combined using combineReducers or by using configureStore with an object.

```javascript
import { combineReducers } from 'redux';
const rootReducer = combineReducers({
  todos: todoReducer,
  user: userReducer,
});
```

5.5 Reducer Rules

· Must not mutate state.
· Must not perform side effects.
· Must return same state if no change.
· Must be pure.

5.6 Interview Question

Q: What is a reducer in Redux?
Answer: A pure function that takes the previous state and an action, and returns the next state. It describes how state changes in response to an action.

---

6. Dispatch

6.1 Definition

dispatch is a function provided by the store to send actions to the reducer. It triggers the state update and notifies subscribers.

6.2 Usage

```javascript
store.dispatch(addTodo('Learn Redux'));
```

In React components with react-redux, use useDispatch hook.

6.3 Why Dispatch Exists

It is the only way to update state. By dispatching actions, you maintain a single, predictable flow.

6.4 Synchronous vs Async Dispatch

Standard dispatch is synchronous. For async operations, middleware like thunk allows dispatching functions.

6.5 Interview Question

Q: What is dispatch in Redux?
Answer: Dispatch is a function that sends an action to the store, causing the reducer to compute new state and update subscribers.

---

7. Selectors

7.1 Definition

Selectors are functions that extract specific pieces of data from the Redux state. They encapsulate state shape knowledge and can be memoized for performance.

7.2 Why Selectors Exist

To avoid duplicating state access logic, improve readability, and optimize re-renders by returning stable references when possible.

7.3 Basic Selector

```javascript
const selectTodos = (state) => state.todos;
const selectDoneTodos = (state) => state.todos.filter(todo => todo.done);
```

7.4 Memoized Selectors with Reselect

```javascript
import { createSelector } from '@reduxjs/toolkit';

const selectTodos = state => state.todos;
const selectDoneTodos = createSelector(
  [selectTodos],
  (todos) => todos.filter(todo => todo.done)
);
```

7.5 Using Selectors in Components

```javascript
const todos = useSelector(selectTodos);
```

7.6 Interview Question

Q: What are selectors in Redux?
Answer: Functions that extract specific data from the store. They improve code organization and can be memoized to avoid unnecessary re-computations and re-renders.

---

8. React-Redux

8.1 Definition

React-Redux is the official binding library that connects Redux with React. It provides <Provider> to make the store available and hooks (useSelector, useDispatch) for components to interact with the store.

8.2 Why It Exists

Redux itself is framework-agnostic. React-Redux optimizes re-renders and provides a declarative way to access store data.

8.3 Provider

Wrap your app with <Provider store={store}> to allow any nested component to access the Redux store.

```jsx
import { Provider } from 'react-redux';
import store from './store';

ReactDOM.createRoot(document.getElementById('root')).render(
  <Provider store={store}>
    <App />
  </Provider>
);
```

8.4 useSelector

Allows a component to extract data from the Redux store state.

```javascript
const user = useSelector(state => state.user);
```

The component will re-render when the selected value changes (strict equality by default).

8.5 useDispatch

Returns the store's dispatch function.

```javascript
const dispatch = useDispatch();
dispatch(addTodo('New'));
```

8.6 Connect (Legacy)

Older pattern uses connect higher-order component. Still used in class components.

8.7 Interview Question

Q: How does React-Redux prevent unnecessary re-renders?
Answer: useSelector uses strict equality check on the selected value. If the selected value hasn't changed, the component does not re-render. Memoized selectors further improve performance.

---

9. Redux Toolkit

9.1 Definition

Redux Toolkit (RTK) is the official, recommended way to write Redux logic. It provides utilities to simplify store setup, reducer creation, and async handling, reducing boilerplate and avoiding common mistakes.

9.2 Why It Exists

Redux has a reputation for being verbose and error-prone (mutating state, boilerplate). RTK addresses these issues by providing:

· configureStore with sensible defaults.
· createSlice to auto-generate actions and reducers.
· createAsyncThunk for async logic.
· createEntityAdapter for normalized state.
· Immer integration for immutable updates.
· DevTools and middleware preconfigured.

9.3 Installation

```bash
npm install @reduxjs/toolkit react-redux
```

9.4 configureStore

Simplifies store creation, adds thunk middleware and Redux DevTools automatically.

```javascript
import { configureStore } from '@reduxjs/toolkit';
import counterReducer from './counterSlice';

const store = configureStore({
  reducer: {
    counter: counterReducer,
  },
});

export default store;
```

9.5 createSlice

Generates action creators and reducer from a single object. Uses Immer to allow "mutating" state (actually immutable behind the scenes).

```javascript
import { createSlice } from '@reduxjs/toolkit';

const counterSlice = createSlice({
  name: 'counter',
  initialState: { value: 0 },
  reducers: {
    increment(state) {
      state.value += 1; // Immer handles immutability
    },
    decrement(state) {
      state.value -= 1;
    },
    incrementByAmount(state, action) {
      state.value += action.payload;
    },
  },
});

export const { increment, decrement, incrementByAmount } = counterSlice.actions;
export default counterSlice.reducer;
```

9.6 createAction

Generates an action creator with a type and payload function.

```javascript
const addTodo = createAction('todos/addTodo');
// usage: addTodo({ id: 1, text: 'Learn RTK' })
```

But with createSlice, this is rarely needed separately.

9.7 createReducer

Creates a reducer function with a builder callback, allowing case reducers to be defined.

```javascript
const reducer = createReducer(initialState, (builder) => {
  builder
    .addCase(increment, (state) => { state.value++; })
    .addDefaultCase((state) => state);
});
```

9.8 createAsyncThunk

Handles asynchronous logic (e.g., API calls) and dispatches lifecycle actions (pending, fulfilled, rejected).

```javascript
export const fetchUser = createAsyncThunk('user/fetchUser', async (userId, thunkAPI) => {
  const response = await fetch(`/api/users/${userId}`);
  return response.json();
});
```

It automatically creates actions: fetchUser.pending, fetchUser.fulfilled, fetchUser.rejected.

9.9 Middleware in RTK

configureStore by default includes:

· redux-thunk
· Immer (not middleware but integration)
· Redux DevTools extension

You can add custom middleware via the middleware callback.

9.10 RTK Query

RTK Query is a powerful data fetching and caching solution built on top of Redux Toolkit. It eliminates the need to write thunks for API calls and provides automatic caching, invalidation, and loading states.

---

10. Redux Async Operations

10.1 Definition

Async operations in Redux are side effects like API calls, timers, or other asynchronous tasks. They cannot be performed directly in reducers (must be pure), so middleware (thunk, saga, etc.) or createAsyncThunk is used.

10.2 Redux Thunk

Thunk middleware allows action creators to return a function instead of an action object. That function receives dispatch and getState, enabling async flow.

```javascript
const fetchData = () => async (dispatch, getState) => {
  dispatch({ type: 'FETCH_START' });
  try {
    const data = await api.fetchData();
    dispatch({ type: 'FETCH_SUCCESS', payload: data });
  } catch (error) {
    dispatch({ type: 'FETCH_ERROR', payload: error.message });
  }
};
```

10.3 createAsyncThunk (recommended)

createAsyncThunk abstracts the standard pattern:

```javascript
const fetchUsers = createAsyncThunk(
  'users/fetchAll',
  async (_, thunkAPI) => {
    const response = await api.get('/users');
    return response.data;
  }
);
```

Then handle in slice using extraReducers:

```javascript
const usersSlice = createSlice({
  name: 'users',
  initialState: { items: [], status: 'idle', error: null },
  reducers: {},
  extraReducers: (builder) => {
    builder
      .addCase(fetchUsers.pending, (state) => { state.status = 'loading'; })
      .addCase(fetchUsers.fulfilled, (state, action) => {
        state.status = 'succeeded';
        state.items = action.payload;
      })
      .addCase(fetchUsers.rejected, (state, action) => {
        state.status = 'failed';
        state.error = action.error.message;
      });
  },
});
```

10.4 Redux Saga (Alternative)

Redux Saga uses generator functions to manage side effects. More powerful but steeper learning curve. Not covered in detail here.

10.5 Interview Question

Q: How do you handle asynchronous operations in Redux?
Answer: Use middleware like Redux Thunk or createAsyncThunk from Redux Toolkit. They allow dispatching functions that perform async work and dispatch sync actions on start/success/failure.

---

11. Redux Middleware

11.1 Definition

Middleware is a layer between dispatching an action and the moment it reaches the reducer. It can intercept, modify, delay, or log actions, and can dispatch additional actions.

11.2 Why Middleware Exists

To handle side effects, logging, error reporting, and async logic without putting that code in components or reducers.

11.3 How It Works

Middleware wraps the store's dispatch method. Each middleware can call next(action) to pass the action along, or can dispatch another action.

11.4 Built-in Middleware in RTK

· Thunk: handles function actions (async).
· Immutability check: warns on state mutation (development only).
· Serializability check: warns on non-serializable data (development only).

11.5 Custom Middleware Example

```javascript
const loggerMiddleware = (store) => (next) => (action) => {
  console.log('dispatching', action);
  const result = next(action);
  console.log('next state', store.getState());
  return result;
};

// Add to configureStore
const store = configureStore({
  reducer,
  middleware: (getDefaultMiddleware) => getDefaultMiddleware().concat(loggerMiddleware),
});
```

11.6 When to Use Custom Middleware

· Logging
· Analytics
· Error tracking
· WebSocket interactions
· Authentication token injection

11.7 Interview Question

Q: What is middleware in Redux?
Answer: Middleware is a function that sits between dispatching an action and the reducer. It can intercept, modify, log, or delay actions, and is commonly used for async operations and side effects.

---

12. Redux Persist

12.1 Definition

Redux Persist is a library that allows you to persist the Redux store state to storage (localStorage, sessionStorage, AsyncStorage) and rehydrate it on app load. This is useful for preserving state across page reloads.

12.2 Why It Exists

Redux store is memory-only. Without persistence, state is lost on refresh. Redux Persist solves this by automatically saving and restoring state.

12.3 Installation

```bash
npm install redux-persist
```

12.4 Basic Setup

```javascript
import { configureStore } from '@reduxjs/toolkit';
import { persistStore, persistReducer } from 'redux-persist';
import storage from 'redux-persist/lib/storage'; // localStorage

const persistConfig = {
  key: 'root',
  storage,
  whitelist: ['user'], // only persist user reducer
};

const persistedReducer = persistReducer(persistConfig, rootReducer);

export const store = configureStore({
  reducer: persistedReducer,
});

export const persistor = persistStore(store);
```

Wrap your app with PersistGate:

```jsx
import { PersistGate } from 'redux-persist/integration/react';

<Provider store={store}>
  <PersistGate loading={<div>Loading...</div>} persistor={persistor}>
    <App />
  </PersistGate>
</Provider>
```

12.5 Configuration Options

· whitelist: only persist specified reducers.
· blacklist: persist everything except these.
· storage: localStorage, sessionStorage, or custom.
· version: migration version.
· transform: to transform state before storage (e.g., encrypt).

12.6 Important Considerations

· Persisting large state can impact performance.
· Sensitive data should not be persisted unless encrypted.
· Combine with Redux Persist + Redux Toolkit carefully (ensure serializable check disabled for persist actions).

12.7 Interview Question

Q: How do you persist Redux state across page reloads?
Answer: Use Redux Persist. Configure a persist reducer with storage, wrap the app with PersistGate, and optionally whitelist/blacklist reducers to control what gets persisted.

---

13. RTK Query

13.1 Definition

RTK Query is a powerful data fetching and caching solution built into Redux Toolkit. It eliminates the need to write thunks, reducers, and loading/error state manually for API calls. It provides automatic caching, request deduplication, and cache invalidation.

13.2 Why It Exists

To simplify server state management. Traditional Redux async logic (thunks + reducers) involves a lot of boilerplate. RTK Query handles the entire data fetching lifecycle for you.

13.3 Key Features

· Auto-generated React hooks (useGetUsersQuery, useCreateUserMutation)
· Automatic caching and cache invalidation
· Request deduplication and retry
· Polling, optimistic updates
· Integration with Redux DevTools

13.4 Setting Up an API Slice

```javascript
import { createApi, fetchBaseQuery } from '@reduxjs/toolkit/query/react';

export const api = createApi({
  reducerPath: 'api',
  baseQuery: fetchBaseQuery({ baseUrl: '/api' }),
  tagTypes: ['User'],
  endpoints: (builder) => ({
    getUsers: builder.query({
      query: () => '/users',
      providesTags: ['User'],
    }),
    getUserById: builder.query({
      query: (id) => `/users/${id}`,
      providesTags: (result, error, id) => [{ type: 'User', id }],
    }),
    createUser: builder.mutation({
      query: (body) => ({
        url: '/users',
        method: 'POST',
        body,
      }),
      invalidatesTags: ['User'],
    }),
  }),
});

export const { useGetUsersQuery, useGetUserByIdQuery, useCreateUserMutation } = api;
```

Add the api reducer to store:

```javascript
const store = configureStore({
  reducer: {
    [api.reducerPath]: api.reducer,
  },
  middleware: (getDefaultMiddleware) => getDefaultMiddleware().concat(api.middleware),
});
```

13.5 Using Generated Hooks in Components

```jsx
function UsersList() {
  const { data: users, isLoading, error } = useGetUsersQuery();

  if (isLoading) return <div>Loading...</div>;
  if (error) return <div>Error: {error.message}</div>;

  return <ul>{users.map(u => <li key={u.id}>{u.name}</li>)}</ul>;
}
```

13.6 Cache Management

· Cache keys: Each query has a unique cache key based on endpoint and arguments.
· Cache lifetime: Default 60 seconds; can be configured.
· Invalidation: Use tags or manual refetch to update cache.
· Deduplication: Simultaneous identical requests are deduped.
· Polling: pollingInterval option.
· Optimistic updates: Use onQueryStarted or updateQueryData.

13.7 Server State vs Client State

· Server state: Data from backend, with caching/refetching (RTK Query, React Query).
· Client state: UI state, local component state, maybe global app state (Redux store).
· RTK Query manages server state; regular Redux slices manage client state. They can coexist.

13.8 When to Use RTK Query

· For any API data fetching in a Redux app.
· To avoid writing duplicate data fetching logic.
· When you need caching and invalidation.

13.9 Interview Question

Q: What is RTK Query and how does it simplify data fetching?
Answer: RTK Query is a built-in data fetching library in Redux Toolkit. It auto-generates hooks, handles caching, loading, error states, and invalidation, reducing boilerplate and ensuring consistent server state management.

---

14. Comparing Redux Toolkit vs Legacy Redux

Aspect Legacy Redux Redux Toolkit
Store setup manual createStore + middleware configureStore with defaults
Reducer creation switch statements createSlice with Immer
Action types string constants auto-generated
Async logic thunk functions manually createAsyncThunk
Boilerplate High Low
Immutability manual (spread, concat) Immer allows "mutating"
DevTools manual setup automatic
Recommended No Yes

---

15. Real-World Scenario: E-Commerce Cart with RTK Query and Redux

Problem: An e-commerce app needs a persistent shopping cart (client state) and product data fetched from API (server state). Cart items must be stored in Redux and persist across reloads; product catalog uses RTK Query for caching and search.

Solution:

· Use Redux Toolkit for cart slice (client state).
· Use Redux Persist to persist cart state.
· Use RTK Query for product API endpoints.
· Combine both in the same store.

Architecture:

```mermaid
flowchart TD
    ReactApp --> Provider
    Provider --> Store
    Store --> CartSlice[Cart Slice (client state)]
    Store --> ApiSlice[API Slice (server state)]
    ApiSlice --> GetProductsQuery[getProducts query]
    CartSlice --> AddItemAction[addItem action]
    CartSlice --> RemoveItemAction[removeItem action]
    Store --> PersistGate
    PersistGate --> LocalStorage[localStorage]
```

Implementation Highlights:

· cartSlice with addItem, removeItem, clearCart.
· persistConfig with whitelist ['cart'].
· productsApi with getProducts query.
· In components, use useGetProductsQuery for catalog and useSelector/useDispatch for cart.

---

16. Module 11 – Quick Revision

· Redux: single store, actions, reducers, dispatch, selectors.
· React-Redux: <Provider>, useSelector, useDispatch.
· Redux Toolkit: configureStore, createSlice, createAsyncThunk, createApi.
· Middleware handles async and side effects.
· Redux Persist saves state to storage.
· RTK Query handles server state with caching and hooks.
· Client state vs server state: use Redux slices for client, RTK Query for server.

---

17. Interview Questions – Module 11

Beginner

1. What is Redux?
      A predictable state container for JavaScript apps, based on single source of truth, read-only state, and pure reducer functions.
2. What are the core parts of Redux?
      Store, actions, reducers, dispatch, selectors.
3. What is Redux Toolkit?
      The official recommended way to write Redux, providing utilities to reduce boilerplate and improve developer experience.

Intermediate

1. Explain the Redux data flow.
      Component dispatches action → store passes action to reducer → reducer returns new state → store updates → component re-renders via selectors.
2. How does useSelector work?
      It subscribes to the Redux store and selects a value from state. It re-renders the component when the selected value changes (strict equality).
3. What problem does createAsyncThunk solve?
      It abstracts async logic, dispatching pending/fulfilled/rejected actions automatically, reducing boilerplate for data fetching.

Advanced

1. What is middleware in Redux? Provide an example use case.
      Middleware wraps dispatch to intercept actions. Used for logging, error reporting, async flows (thunk/saga), and side effects. Example: a logger middleware that logs every action.
2. Explain RTK Query cache invalidation.
      RTK Query uses tags to track data. When a mutation that invalidates a tag (e.g., "User") occurs, all queries that provide that tag are refetched automatically.
3. How does Redux Persist work?
      It wraps the reducer to save state to storage on each update, and rehydrates state on app load. It uses persistReducer and PersistGate.

Scenario-Based

Q: You need to add real-time notifications to your Redux app. How would you handle it?
Answer: Use Redux middleware to listen to WebSocket events and dispatch corresponding actions to update state. Or use a thunk that subscribes to the socket and dispatches actions when messages arrive.

Coding Questions

1. Create a Redux Toolkit slice for a todo list with add and remove actions.

```javascript
import { createSlice } from '@reduxjs/toolkit';

const todosSlice = createSlice({
  name: 'todos',
  initialState: [],
  reducers: {
    addTodo: (state, action) => {
      state.push({ id: Date.now(), text: action.payload, done: false });
    },
    removeTodo: (state, action) => {
      return state.filter(todo => todo.id !== action.payload);
    },
  },
});

export const { addTodo, removeTodo } = todosSlice.actions;
export default todosSlice.reducer;
```

2. Set up an RTK Query endpoint for fetching a list of products.

```javascript
export const productsApi = createApi({
  reducerPath: 'productsApi',
  baseQuery: fetchBaseQuery({ baseUrl: '/api' }),
  endpoints: (builder) => ({
    getProducts: builder.query({
      query: () => '/products',
    }),
  }),
});

export const { useGetProductsQuery } = productsApi;
```

---

18. Common Mistakes & Best Practices

Mistake Best Practice
Mutating state in reducers (without Immer) Use createSlice with Immer, or return new state
Too many action types as strings Use createSlice/action creators
Putting all state in Redux Use RTK Query for server state, local state for UI
Not memoizing selectors Use createSelector for expensive derivations
Overusing middleware Only use middleware for side effects/async
Forgetting to add api middleware Always add api.middleware when using RTK Query
Persisting entire store without need Use whitelist/blacklist
Not handling loading/error states Always handle isLoading, error from RTK Query hooks

---

19. Testing Redux

· Test reducers as pure functions.
· Test action creators return correct objects.
· Test async thunks with mocked API calls.
· Test components with react-redux and mocked store.
· Test RTK Query hooks with msw (Mock Service Worker).

---

This concludes Module 11: State Management. The next module is Module 12: Performance Optimization, covering React.memo, useMemo, useCallback, code splitting, lazy loading, and more.



Module 12: Performance Optimization

Performance optimization in React ensures that applications remain responsive and efficient, especially as they scale. This module covers the key techniques for reducing unnecessary re-renders, optimizing component rendering, code splitting, lazy loading, virtualization, and profiling. By the end, you will be able to diagnose and fix performance bottlenecks in React applications.

---

1. React Rendering

1.1 Definition

Rendering in React refers to the process of generating the UI from component functions or classes. Initially, React renders the entire component tree to the DOM. Subsequent renders occur when state or props change, and React updates only the parts of the DOM that changed (via the virtual DOM and reconciliation).

1.2 Why It Exists

Rendering is fundamental to React's declarative model: you describe what the UI should look like, and React handles the DOM updates. Understanding rendering helps identify performance issues.

1.3 Phases of Rendering

1. Render phase: React calls your component functions to compute the next UI (creates a virtual DOM tree). This phase can be interrupted and is pure (no side effects).
2. Commit phase: React applies the changes to the actual DOM and runs effects (useEffect, useLayoutEffect). This phase is synchronous.

1.4 What Triggers a Render?

· Initial mount
· State change (setState/useState)
· Parent component re-renders (child re-renders unless optimized)
· Context value changes (consumers re-render)
· Force update (rare)

1.5 Performance Considerations

Rendering itself is usually fast, but if a component renders frequently with expensive computations or many children, it can become a bottleneck. Optimization aims to reduce unnecessary renders.

---

2. Re-rendering

2.1 Definition

Re-rendering is when a component re-executes its render function due to changes in state, props, or context. It does not always mean the DOM is updated; React may compute the same output and skip DOM changes.

2.2 Why Re-renders Can Be Problematic

Excessive re-renders waste CPU, especially for large component trees or expensive calculations. They can cause laggy interfaces.

2.3 Common Causes of Unnecessary Re-renders

· Parent re-renders causing all children to re-render (even if their props didn't change).
· Inline function or object props creating new references each render.
· Context value changes causing all consumers to re-render.
· Global state updates that affect many components.

2.4 How to Identify Re-renders

· React DevTools: highlight updates.
· Profiler: record and inspect render timings.
· Console logs (temporary, not for production).

2.5 Basic Example of Unnecessary Re-render

```jsx
function Parent() {
  const [count, setCount] = useState(0);
  return (
    <div>
      <button onClick={() => setCount(c => c + 1)}>Increment</button>
      <Child /> {/* Child re-renders every time Parent re-renders, even if no props changed */}
    </div>
  );
}

function Child() {
  console.log('Child rendered');
  return <div>Child</div>;
}
```

To fix: wrap Child with React.memo.

---

3. React.memo

3.1 Definition

React.memo is a higher-order component that memoizes a functional component. It performs a shallow comparison of props and skips re-rendering if props are equal.

3.2 Why It Exists

To prevent unnecessary re-renders of child components when parent re-renders but the child's props have not changed.

3.3 Syntax

```jsx
const MemoizedChild = React.memo(Child);
```

3.4 Custom Comparison Function

By default, shallow comparison. You can provide a custom comparator:

```jsx
const MemoizedChild = React.memo(Child, (prevProps, nextProps) => {
  return prevProps.id === nextProps.id; // return true to skip re-render
});
```

3.5 When to Use

· Component renders often but props rarely change.
· Component is expensive to render (large lists, complex UI).
· Props are primitive or stable references.

3.6 When Not to Use

· If props are frequently new objects/functions (unless memoized with useMemo/useCallback).
· If component is cheap to render; overhead of memo may outweigh benefit.

3.7 Example

```jsx
const ListItem = React.memo(({ item }) => {
  return <li>{item.name}</li>;
});
```

3.8 Important Notes

· Shallow comparison only compares top-level props. Nested objects won't be deeply compared.
· If you pass a new object or function as prop every render, React.memo won't help. Use useMemo or useCallback to stabilize those props.

3.9 Interview Question

Q: How does React.memo work?
Answer: It memoizes the component by performing a shallow comparison of props. If props are the same, it skips re-rendering. A custom comparator can be provided for custom equality logic.

---

4. useMemo

4.1 Definition

useMemo is a hook that memoizes the result of a computation. It returns the cached value unless one of its dependencies changes.

4.2 Why It Exists

To avoid expensive recalculations on every render, and to preserve referential equality for objects/arrays passed to memoized children.

4.3 Syntax

```jsx
const memoizedValue = useMemo(() => computeExpensiveValue(a, b), [a, b]);
```

4.4 When to Use

· Expensive computations (sorting, filtering large arrays, complex math).
· Creating objects/arrays that are passed as props to memoized children.
· When referential stability matters.

4.5 When Not to Use

· For trivial calculations; useMemo adds overhead.
· If dependencies change frequently and the calculation is cheap.

4.6 Example: Expensive Computation

```jsx
const sortedList = useMemo(() => {
  return list.sort((a, b) => a.name.localeCompare(b.name));
}, [list]);
```

4.7 Example: Stabilizing Object Prop

```jsx
const config = useMemo(() => ({ theme, size }), [theme, size]);
<MemoizedChart config={config} />
```

4.8 Interview Question

Q: What is useMemo and when should it be used?
Answer: useMemo memoizes a value by caching the result of a function. It is used for expensive computations or to preserve referential equality of objects/arrays, preventing unnecessary re-renders of memoized children.

---

5. useCallback

5.1 Definition

useCallback returns a memoized version of a callback function. The function reference remains stable across renders unless dependencies change.

5.2 Why It Exists

To prevent child components wrapped in React.memo from re-rendering due to new function references passed as props.

5.3 Syntax

```jsx
const memoizedCallback = useCallback(() => {
  doSomething(a, b);
}, [a, b]);
```

5.4 When to Use

· Passing callbacks to optimized children (React.memo).
· When the callback is used in dependency arrays of other hooks (e.g., useEffect).
· For functions that are expensive to recreate? (No, function creation is cheap; the main reason is referential stability.)

5.5 Important Note

useCallback(fn, deps) is equivalent to useMemo(() => fn, deps). It memoizes the function itself.

5.6 Example

```jsx
const handleClick = useCallback(() => {
  setCount(c => c + 1);
}, []);
```

5.7 Interview Question

Q: What is the difference between useCallback and useMemo?
Answer: useCallback memoizes a function; useMemo memoizes the result of a function. useCallback(fn, deps) is the same as useMemo(() => fn, deps).

---

6. State Optimization

6.1 Definition

State optimization involves designing state to minimize re-renders and avoid unnecessary updates. It includes colocation, splitting state, using reducers, and avoiding derived state.

6.2 Strategies

· Colocate state: Keep state as close as possible to where it's used.
· Split state: Use multiple useState hooks for independent values, rather than one large object.
· Avoid redundant state: Derive values instead of storing them.
· Use functional updates: setCount(prev => prev + 1) to avoid stale closures and unnecessary dependencies.
· Use useReducer for complex state transitions to keep update logic centralized.

6.3 Example: Splitting State

Instead of:

```jsx
const [state, setState] = useState({ count: 0, name: '' });
```

Use:

```jsx
const [count, setCount] = useState(0);
const [name, setName] = useState('');
```

This reduces re-render scope.

6.4 Example: Avoiding Derived State

If fullName can be computed from firstName and lastName, don't store it in state; compute during render or with useMemo if expensive.

6.5 Interview Question

Q: How can you optimize state in React to reduce re-renders?
Answer: Keep state local, split independent values into separate states, avoid storing derived data, use functional updates, and use useReducer for complex transitions. This limits the scope of re-renders.

---

7. Component Optimization

7.1 Definition

Component optimization involves structuring components to reduce re-render frequency and rendering cost. Techniques include:

· Wrapping with React.memo
· Splitting large components into smaller ones to isolate re-renders.
· Using key correctly to preserve component identity.
· Avoiding inline functions/objects in props.
· Using children to avoid re-rendering when parent state changes but children are not affected.

7.2 Splitting Components

If a component has both expensive and frequently updating parts, separate them so that state updates only trigger re-render of the relevant sub-component.

```jsx
function ExpensiveComponent() {
  // expensive render
  return <div>...</div>;
}

const MemoizedExpensive = React.memo(ExpensiveComponent);

function Parent() {
  const [count, setCount] = useState(0);
  return (
    <div>
      <button onClick={() => setCount(c => c + 1)}>Increment</button>
      <MemoizedExpensive />
    </div>
  );
}
```

7.3 Using children Prop

When a parent re-renders, if the child is passed as children, it won't re-render if its own props/state haven't changed (because the child is the same element reference from the parent's perspective). However, if the parent re-renders and the child is rendered directly inside the parent, the child will re-render unless memoized.

This is subtle: If you pass a component as children from a parent that doesn't re-render, it won't re-render when the intermediate parent re-renders. This is known as "children as render optimization".

7.4 Best Practices

· Identify and memoize expensive components.
· Isolate stateful logic from presentational components.
· Use key correctly in lists.
· Avoid creating new object/function props in render.

7.5 Interview Question

Q: How would you optimize a component that re-renders frequently but its props rarely change?
Answer: Wrap it with React.memo to skip re-renders when props are shallowly equal. Also ensure that any object or function props are memoized with useMemo/useCallback.

---

8. Code Splitting

8.1 Definition

Code splitting is the process of splitting your JavaScript bundle into smaller chunks that can be loaded on demand. This reduces the initial bundle size and improves page load time.

8.2 Why It Exists

Large single-page applications often have large JavaScript bundles. Loading everything upfront slows initial page load. Code splitting allows loading only the code needed for the current view, then loading more as needed.

8.3 Approaches

· Route-based splitting: split by route.
· Component-based splitting: split large components.
· Vendor splitting: separate third-party libraries.
· Dynamic imports: import() syntax.

8.4 Implementation with React.lazy and Suspense

```jsx
import React, { lazy, Suspense } from 'react';

const Home = lazy(() => import('./Home'));
const About = lazy(() => import('./About'));

function App() {
  return (
    <Suspense fallback={<div>Loading...</div>}>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/about" element={<About />} />
      </Routes>
    </Suspense>
  );
}
```

8.5 Benefits

· Faster initial load.
· Lower memory usage.
· Better caching (separate chunks).

8.6 Challenges

· Need Suspense fallback.
· Increased complexity.
· Potential for layout shift if fallback not well-designed.

8.7 Interview Question

Q: What is code splitting and how does it improve performance?
Answer: Code splitting divides the application bundle into smaller chunks loaded on demand. It reduces initial download size, leading to faster page loads and better resource utilization.

---

9. Lazy Loading

9.1 Definition

Lazy loading is a technique where resources (components, routes, images) are loaded only when needed, instead of upfront. In React, React.lazy enables lazy loading of components.

9.2 Why It Exists

To defer loading of non-critical resources, improving initial load performance.

9.3 React.lazy

React.lazy accepts a function that returns a dynamic import() and returns a component that can be rendered inside Suspense.

```jsx
const MyComponent = React.lazy(() => import('./MyComponent'));
```

9.4 Suspense

Suspense is a component that displays a fallback while the lazy component is loading.

```jsx
<Suspense fallback={<Spinner />}>
  <MyComponent />
</Suspense>
```

9.5 Lazy Loading Images

For images, use loading="lazy" attribute or libraries like react-lazyload.

9.6 When to Use Lazy Loading

· Route components
· Heavy components below the fold
· Modal dialogs, charts, etc.

9.7 Interview Question

Q: How do you implement lazy loading in React?
Answer: Use React.lazy with dynamic import() for the component, and wrap it in Suspense with a fallback. This loads the component only when it is rendered.

---

10. React.lazy

10.1 Definition

React.lazy is a function that enables dynamic import of a component. It returns a new component that suspends rendering until the module is loaded.

10.2 Syntax

```jsx
const MyComponent = React.lazy(() => import('./MyComponent'));
```

10.3 Requirements

· Must be used inside a Suspense boundary.
· The imported module must have a default export (or use .then(module => ({ default: module.NamedComponent }))).
· Works only in client-side rendering (with React 18, also server components have different handling).

10.4 Example

```jsx
const AdminDashboard = React.lazy(() => import('./AdminDashboard'));

function App() {
  return (
    <Suspense fallback={<div>Loading admin...</div>}>
      <AdminDashboard />
    </Suspense>
  );
}
```

10.5 Advanced: Named Exports

```jsx
const MyComponent = React.lazy(() =>
  import('./MyComponent').then(module => ({ default: module.NamedExport }))
);
```

10.6 Interview Question

Q: What is React.lazy and how is it used?
Answer: React.lazy is a function that dynamically imports a component, enabling code splitting. It returns a component that suspends until the import resolves, and must be used inside Suspense.

---

11. Suspense

11.1 Definition

Suspense is a React component that manages the loading state of lazy components or asynchronous data. It displays a fallback UI while waiting for the suspended content to become available.

11.2 Why It Exists

To provide a declarative way to handle loading states for code splitting and data fetching (with React 18+ and concurrent features).

11.3 Syntax

```jsx
<Suspense fallback={<LoadingSpinner />}>
  <LazyComponent />
</Suspense>
```

11.4 Multiple Suspense Boundaries

You can nest Suspense to provide different fallbacks for different parts of the UI.

11.5 Data Fetching with Suspense (React 18+)

In React 18, Suspense can be used with data-fetching libraries (e.g., React Query, Relay) to show a fallback while data is loading. However, this is an advanced pattern.

11.6 Best Practices

· Use a lightweight fallback to avoid layout shift.
· Provide multiple boundaries for better UX.
· Do not put Suspense inside the lazy component; place it above.

11.7 Interview Question

Q: What is the purpose of Suspense in React?
Answer: Suspense handles loading states for lazy-loaded components or asynchronous data, showing a fallback UI until the content is ready. It enables code splitting and concurrent rendering.

---

12. Bundle Optimization

12.1 Definition

Bundle optimization refers to reducing the size of JavaScript/CSS bundles served to the client. It includes techniques like minification, tree shaking, code splitting, gzip compression, and dependency optimization.

12.2 Why It Exists

Smaller bundles download faster, parse faster, and execute faster, leading to better performance and user experience.

12.3 Techniques

· Minification: Remove whitespace, comments, shorten variable names (Terser).
· Tree shaking: Eliminate unused exports (ES modules).
· Code splitting: Split code into chunks (as above).
· Compression: gzip/Brotli at server level.
· Dependency analysis: Remove unused dependencies.
· Modern syntax: Use ES2017+ to reduce polyfills.

12.4 Vite/Rollup and Webpack Configuration

Vite/Rollup automatically performs minification and tree shaking. Webpack can be configured with optimization.splitChunks and minimize.

12.5 Analyzing Bundle Size

Use tools like webpack-bundle-analyzer, source-map-explorer, or Vite's built-in --analyze plugin.

12.6 Best Practices

· Regularly audit dependencies.
· Use dynamic imports for large libraries.
· Prefer smaller libraries (e.g., date-fns over moment).
· Ensure tree shaking works by using ES module imports.

12.7 Interview Question

Q: What is tree shaking and how does it reduce bundle size?
Answer: Tree shaking is a build optimization that removes unused code from the final bundle. It relies on ES module static imports/exports to determine which exports are used and which can be eliminated. It reduces bundle size by excluding dead code.

---

13. Tree Shaking

13.1 Definition

Tree shaking is a dead-code elimination technique that removes unused exports from modules during the build process. It works with ES module syntax (import/export) because static structure allows the bundler to determine which exports are used.

13.2 Why It Exists

To reduce bundle size by excluding code that is never imported or used, improving load times.

13.3 How It Works

1. Module is imported with ES import.
2. Bundler analyzes the import statements and marks used exports.
3. Unused exports are not included in the final bundle.

13.4 Requirements

· Use ES modules (not CommonJS).
· Avoid side-effectful modules (side effects can prevent tree shaking).
· Configure bundler with sideEffects: false in package.json (for library authors).

13.5 Example

If a library exports Button and Modal, but you only import Button, tree shaking will exclude Modal from the bundle.

13.6 Interview Question

Q: What is tree shaking and how does it improve performance?
Answer: Tree shaking removes unused code from the bundle, reducing file size and parsing time, leading to faster page loads. It works with ES modules' static analysis.

---

14. Virtualization

14.1 Definition

Virtualization is a technique for rendering only the visible portion of a large list or grid, instead of all items at once. This is also known as windowing or virtual scrolling. It dramatically reduces the number of DOM nodes, improving performance for large datasets.

14.2 Why It Exists

Rendering thousands of DOM elements can cause slow initial render, high memory usage, and laggy scrolling. Virtualization renders only a subset of items and recycles them as the user scrolls.

14.3 Libraries

· react-window – lightweight, simple.
· react-virtualized – more features, heavier.
· @tanstack/react-virtual – modern headless virtualization.

14.4 Example with react-window

```jsx
import { FixedSizeList as List } from 'react-window';

function VirtualizedList({ items }) {
  const Row = ({ index, style }) => (
    <div style={style}>Item {items[index]}</div>
  );

  return (
    <List
      height={500}
      itemCount={items.length}
      itemSize={35}
      width="100%"
    >
      {Row}
    </List>
  );
}
```

14.5 How It Works

· Calculate total container size based on item count and item size.
· On scroll, determine which items are visible.
· Render only those items, with absolute positioning or transforms.
· Recycle items as user scrolls.

14.6 When to Use

· Lists with hundreds or thousands of items.
· Grids with many cells.
· Infinite scroll scenarios.

14.7 When Not to Use

· Small lists (<100 items); overhead of virtualization may not be worth it.
· When items have variable height and you don't want to measure (though libraries support dynamic size).

14.8 Interview Question

Q: What is virtualization and how does it improve performance?
Answer: Virtualization renders only the visible subset of a large list, reducing DOM node count and improving scroll performance. It calculates visible items based on scroll position and container size, recycling DOM elements.

---

15. Large List Optimization

15.1 Definition

Optimizing large lists in React involves techniques beyond virtualization, such as memoizing list items, using stable keys, avoiding inline functions, and pagination or infinite scroll.

15.2 Strategies

· Virtualize (react-window, react-virtualized) for very large lists.
· Memoize each item with React.memo.
· Stable keys to allow React to reuse items.
· Pagination – load chunks on demand.
· Infinite scroll – load more as user scrolls (combine with virtualization).
· Use useMemo for filtered/sorted lists to avoid recalculations.

15.3 Example: Memoized List Item

```jsx
const ListItem = React.memo(({ item, onItemClick }) => {
  return <li onClick={() => onItemClick(item.id)}>{item.name}</li>;
});

function List({ items, onItemClick }) {
  return (
    <ul>
      {items.map(item => (
        <ListItem key={item.id} item={item} onItemClick={onItemClick} />
      ))}
    </ul>
  );
}
```

But if onItemClick is a new function every render, memoization of ListItem won't help. Use useCallback for the callback.

15.4 Best Practices

· Prefer stable IDs as keys.
· Avoid passing new object/function props to list items.
· Consider using useMemo for expensive filtering/sorting before rendering.
· For dynamic content, use shouldComponentUpdate or React.memo.

15.5 Interview Question

Q: How would you optimize a list with 10,000 items in React?
Answer: Use virtualization (e.g., react-window) to render only visible items. Memoize list items with React.memo and stable keys. Optimize callbacks with useCallback. If possible, use pagination or infinite scroll to avoid rendering all at once.

---

16. React Profiler

16.1 Definition

The React Profiler is a tool in React DevTools that records performance information about your application. It shows which components render, how often, and how long they take, helping identify bottlenecks.

16.2 Why It Exists

To provide insights into rendering performance, enabling developers to make informed optimization decisions.

16.3 Using the Profiler in React DevTools

1. Install React DevTools extension.
2. Open DevTools, go to "Profiler" tab.
3. Click record, interact with app, stop recording.
4. Review flamegraph and ranked chart.

16.4 Programmatic Profiler API (Advanced)

You can use the <Profiler> component to measure render times programmatically:

```jsx
import { Profiler } from 'react';

function onRenderCallback(id, phase, actualDuration, baseDuration, startTime, commitTime, interactions) {
  console.log(`${id} (${phase}) took ${actualDuration}ms`);
}

<Profiler id="App" onRender={onRenderCallback}>
  <App />
</Profiler>
```

16.5 Interpreting Results

· Flamegraph: shows component tree with render durations.
· Ranked: sorts components by render time.
· Look for components that render frequently and take long.

16.6 Best Practices

· Use Profiler in development.
· Focus on components that render often and are expensive.
· Combine Profiler with other optimization techniques.

16.7 Interview Question

Q: How do you identify performance bottlenecks in a React app?
Answer: Use React DevTools Profiler to record interactions and analyze render times. Identify components with high render durations or frequent renders, then apply optimizations like memoization, code splitting, or state colocation.

---

17. Module 12 – Quick Revision

· React rendering: create virtual DOM, commit to real DOM.
· Re-renders happen on state/props change; optimize with React.memo, useMemo, useCallback.
· State optimization: colocate, split, avoid derived state.
· Component optimization: split components, memoize, use children.
· Code splitting: dynamic imports with React.lazy and Suspense.
· Bundle optimization: minification, tree shaking, compression.
· Virtualization: render only visible items in large lists.
· React Profiler: identify performance issues.
· Always measure before optimizing; avoid premature optimization.

---

18. Interview Questions – Module 12

Beginner

1. What is React.memo?
      A higher-order component that memoizes a functional component, skipping re-render when props are shallowly equal.
2. What is code splitting?
      Splitting the application bundle into smaller chunks loaded on demand.
3. What is the purpose of Suspense?
      To handle loading states for lazy-loaded components or async data.

Intermediate

1. Explain the difference between useMemo and useCallback.
      useMemo memoizes a value; useCallback memoizes a function. Both prevent unnecessary re-renders when dependencies don't change.
2. How does tree shaking work?
      It uses ES module static analysis to remove unused exports from the final bundle, reducing size.
3. What is virtualization and when should you use it?
      Virtualization renders only visible items in a large list to improve performance. Use it when rendering hundreds or thousands of items.

Advanced

1. How would you optimize a component that re-renders every time its parent re-renders, but its props are unchanged?
      Wrap it with React.memo. If it receives object/function props, memoize those with useMemo/useCallback. Also consider if the parent state can be colocated or split.
2. Describe the React rendering phases and how optimization techniques affect them.
      Render phase creates virtual DOM; commit phase updates real DOM. Optimizations like React.memo and useMemo reduce work in the render phase by skipping component calls or recalculations. useLayoutEffect runs before paint, useEffect after.
3. What is the React Profiler and how do you use it to identify performance issues?
      The Profiler records render timings and component interactions. You use it in React DevTools to see which components render frequently or take long, then target those for optimization.

Scenario-Based

Q: Your app has a large table with 10,000 rows, and scrolling is laggy. How would you improve performance?
Answer: Implement virtualization using a library like react-window or @tanstack/react-virtual to render only visible rows. Memoize row components with React.memo and use stable keys. If applicable, apply pagination or server-side filtering to reduce data.

Coding Questions

1. Write a component that lazy loads a Chart component with a loading fallback.

```jsx
import React, { lazy, Suspense } from 'react';

const Chart = lazy(() => import('./Chart'));

function Dashboard() {
  return (
    <Suspense fallback={<div>Loading chart...</div>}>
      <Chart />
    </Suspense>
  );
}
```

2. Create a memoized list item component that doesn't re-render unless item prop changes.

```jsx
const ListItem = React.memo(({ item }) => {
  return <li>{item}</li>;
});
```

---

19. Common Mistakes & Best Practices

Mistake Best Practice
Overusing React.memo on cheap components Use only for expensive components; measure with Profiler
Not memoizing object/function props Use useMemo/useCallback to stabilize references
Creating new arrays/objects in render for lists Use useMemo for derived data
Not using stable keys in lists Use unique IDs, not index
Rendering all list items without virtualization Use virtualization for large lists
Ignoring code splitting Split routes and heavy components
Not analyzing bundle size Use bundle analyzer tools
Premature optimization without profiling Always measure first with Profiler
Using useLayoutEffect unnecessarily Prefer useEffect; useLayoutEffect only for DOM measurements

---

20. Real-World Scenario: Optimizing an E-Commerce Product Listing

Problem: A product listing page displays thousands of products with filters, sorting, and search. The page is slow to render and scroll.

Solution:

· Use React.memo for product cards.
· Memoize filtered/sorted list with useMemo.
· Use useCallback for handlers passed to cards.
· Implement virtualization with react-window to render only visible products.
· Lazy load product images with loading="lazy".
· Code split the page using React.lazy.
· Analyze with React Profiler to identify remaining bottlenecks.

Architecture:

```mermaid
flowchart TD
    ProductListPage --> SearchInput
    ProductListPage --> FilterSidebar
    ProductListPage --> VirtualizedGrid
    VirtualizedGrid --> ProductCard[memoized ProductCard]
    ProductCard --> LazyImage[loading=lazy]
    FilterSidebar --> useMemo[filtered products]
```

Implementation Highlights:

· const filteredProducts = useMemo(() => filterProducts(products, filters), [products, filters]);
· const handleAddToCart = useCallback((id) => addToCart(id), []);
· <List> from react-window to virtualize.
· React.memo(ProductCard).

---

This concludes Module 12: Performance Optimization. The next module is Module 13: Advanced React, covering higher-order components, render props, compound components, portals, error boundaries, and more.


Module 13: Advanced React

This module covers advanced React patterns and internals that are essential for building sophisticated, reusable, and maintainable applications. You will learn about component composition patterns (Higher-Order Components, Render Props, Compound Components), ref forwarding, portals, error boundaries, Suspense, lazy loading, controlled vs uncontrolled components, and the inner workings of React's reconciliation algorithm, Virtual DOM, and Fiber architecture.

---

1. Component Composition

1.1 Definition

Component composition is the practice of building complex UIs by combining simpler, reusable components. It leverages props, children, and the children prop to create flexible, nested component structures.

1.2 Why It Exists

Composition promotes reusability, separation of concerns, and maintainability. It allows developers to create new components by composing existing ones rather than relying on inheritance, which is discouraged in React.

1.3 Purpose

· Build complex UIs from simple parts.
· Pass data and behavior down via props.
· Use children to create wrapper components.
· Achieve code reuse without inheritance.

1.4 Core Concepts

· Props: pass data and callbacks.
· Children prop: allow nesting of arbitrary content.
· Specialization: a component renders a more specific component.
· Containment: components that don't know their children ahead of time (e.g., <Card>).

1.5 Example: Composition with children

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
      <p>Welcome!</p>
      <button>Get Started</button>
    </Card>
  );
}
```

1.6 Specialization Example

```jsx
function Dialog({ title, message, children }) {
  return (
    <div className="dialog">
      <h1>{title}</h1>
      <p>{message}</p>
      {children}
    </div>
  );
}

function WelcomeDialog() {
  return (
    <Dialog title="Welcome" message="Thank you for visiting!">
      <button>Close</button>
    </Dialog>
  );
}
```

1.7 Real-World Usage

Every React app uses composition. For example, a Layout component with header, sidebar, and content, where content is composed of multiple child components.

1.8 Common Mistakes

· Overusing inheritance-like patterns (should use composition).
· Prop drilling when composition with context may be better.
· Creating overly complex components that should be split.

1.9 Best Practices

· Prefer composition over inheritance.
· Use children for flexible wrappers.
· Keep components focused and small.
· Use composition with context for cross-cutting concerns.

1.10 Interview Questions

Q: What is component composition and why is it preferred over inheritance?
Answer: Component composition is the practice of combining components using props and children to build complex UIs. It is preferred because it leads to more reusable, decoupled, and flexible code, whereas inheritance creates tight coupling and rigid hierarchies.

---

2. Higher-Order Components (HOC)

2.1 Definition

A Higher-Order Component (HOC) is an advanced pattern where a function takes a component and returns a new enhanced component. It allows you to reuse component logic by wrapping the original component with additional functionality.

2.2 Why It Exists

HOCs solve the problem of sharing common logic across multiple components (e.g., authentication checks, logging, theming, data fetching) without repeating code.

2.3 Signature

```javascript
const EnhancedComponent = higherOrderComponent(WrappedComponent);
```

2.4 How It Works

· The HOC function receives a component and returns a new component.
· It renders the original component, usually passing through props and adding some extra props or behavior.
· It can also conditionally render based on certain conditions.

2.5 Example: withAuth HOC

```jsx
function withAuth(WrappedComponent) {
  return function EnhancedComponent(props) {
    const { isAuthenticated } = useAuth();
    if (!isAuthenticated) {
      return <Navigate to="/login" />;
    }
    return <WrappedComponent {...props} />;
  };
}

const ProtectedDashboard = withAuth(Dashboard);
```

2.6 Use Cases

· Authentication guards
· Logging/profiling
· Theming/injecting CSS classes
· Data fetching and loading states
· Context consumer (before hooks)

2.7 Common Mistakes

· Mutating the original component (should not modify the component, but wrap it).
· Not passing through props correctly.
· Creating HOCs that add too many props (naming conflicts).
· Using HOCs when hooks could be simpler (modern approach).

2.8 Best Practices

· Use hooks (useAuth, etc.) inside HOCs.
· Pass through unrelated props.
· Set displayName for debugging.
· Avoid HOC chaining that becomes hard to read; prefer hooks for new code.
· Use HOCs for cross-cutting concerns that are not easily done with hooks.

2.9 Interview Questions

Q: What is a Higher-Order Component?
Answer: A HOC is a function that takes a component and returns a new enhanced component, allowing reuse of component logic.

Q: What are the limitations of HOCs?
Answer: HOCs can cause prop name collisions, make the component tree more nested, and are less intuitive than hooks for sharing stateful logic. They also can obscure the source of props.

---

3. Render Props

3.1 Definition

Render props is a pattern where a component's prop is a function that returns React elements. This function is called by the component to render its UI, allowing sharing of logic and state.

3.2 Why It Exists

To share stateful logic between components without HOCs or inheritance. It provides a more explicit way to pass data and callbacks.

3.3 How It Works

· A component accepts a prop (commonly named render or children) that is a function.
· The component calls that function with its internal state or data.
· The function returns JSX, which becomes the output.

3.4 Example: MouseTracker with render prop

```jsx
function MouseTracker({ render }) {
  const [position, setPosition] = useState({ x: 0, y: 0 });

  const handleMouseMove = (e) => {
    setPosition({ x: e.clientX, y: e.clientY });
  };

  return <div onMouseMove={handleMouseMove}>{render(position)}</div>;
}

// Usage
<MouseTracker render={({ x, y }) => <p>Mouse at ({x}, {y})</p>} />
```

3.5 Alternative: children as function

```jsx
<MouseTracker>
  {({ x, y }) => <p>Mouse at ({x}, {y})</p>}
</MouseTracker>
```

3.6 Use Cases

· Shared logic for mouse/touch tracking, window size, data fetching.
· When you need multiple instances with different rendering.

3.7 Comparison with HOCs

Render Props HOCs
More explicit Implicit wrapper
Can cause nesting Also nesting
Easier to compose multiple Multiple HOCs create wrapper hell
Runtime composition Static composition

3.8 Common Mistakes

· Inline functions causing re-renders (usually fine in modern React).
· Not memoizing the render prop if used in optimized children.

3.9 Best Practices

· Use hooks for most use cases; render props are less common now.
· Use children as function pattern for cleaner JSX.
· Ensure the render function is pure.

3.10 Interview Questions

Q: What are render props?
Answer: Render props is a pattern where a component accepts a function prop that returns JSX, allowing it to share state and logic with the calling component.

Q: How do render props compare to HOCs?
Answer: Both share logic. Render props are more explicit and flexible at render time, while HOCs are applied at definition time. Hooks are now preferred over both for many cases.

---

4. Compound Components

4.1 Definition

Compound components is a pattern where multiple components work together as a unit, sharing implicit state, and allowing the consumer to compose them in a flexible way. The parent component manages state and provides it via context to child components.

4.2 Why It Exists

To create flexible, reusable component APIs where the consumer can control the arrangement and content, while the internal state is managed cooperatively.

4.3 Example: Tabs (compound)

```jsx
function Tabs({ children }) {
  const [activeIndex, setActiveIndex] = useState(0);
  return (
    <TabsContext.Provider value={{ activeIndex, setActiveIndex }}>
      <div>{children}</div>
    </TabsContext.Provider>
  );
}

Tabs.TabList = function TabList({ children }) {
  return <div>{children}</div>;
};

Tabs.Tab = function Tab({ index, children }) {
  const { activeIndex, setActiveIndex } = useContext(TabsContext);
  return (
    <button className={activeIndex === index ? 'active' : ''} onClick={() => setActiveIndex(index)}>
      {children}
    </button>
  );
};

Tabs.TabPanels = function TabPanels({ children }) {
  return <div>{children}</div>;
};

Tabs.TabPanel = function TabPanel({ index, children }) {
  const { activeIndex } = useContext(TabsContext);
  return activeIndex === index ? <div>{children}</div> : null;
};
```

Usage:

```jsx
<Tabs>
  <Tabs.TabList>
    <Tabs.Tab index={0}>Tab 1</Tabs.Tab>
    <Tabs.Tab index={1}>Tab 2</Tabs.Tab>
  </Tabs.TabList>
  <Tabs.TabPanels>
    <Tabs.TabPanel index={0}>Content 1</Tabs.TabPanel>
    <Tabs.TabPanel index={1}>Content 2</Tabs.TabPanel>
  </Tabs.TabPanels>
</Tabs>
```

4.4 Benefits

· High flexibility for consumers.
· Clear separation of concerns.
· Implicit state sharing via context.

4.5 When to Use

· Building reusable component libraries (e.g., UI kits).
· When you want consumers to have control over structure but not state.

4.6 Interview Questions

Q: What are compound components?
Answer: Compound components are a set of components that work together and share state via context, allowing consumers to compose them in a flexible way while the parent manages the state.

Q: How do compound components differ from normal composition?
Answer: In compound components, the child components are aware of the shared parent state via context, enabling them to coordinate without explicit prop drilling.

---

5. Forward Ref

5.1 Definition

forwardRef is a React API that allows a parent component to pass a ref down to a child component, giving direct access to a DOM element or component instance inside the child.

5.2 Why It Exists

Functional components do not have instances, and refs are not accessible through props. forwardRef solves this by letting you forward a ref from parent to an inner DOM element or class component.

5.3 Syntax

```jsx
const MyComponent = React.forwardRef((props, ref) => {
  return <input ref={ref} {...props} />;
});
```

5.4 Example: Custom Input

```jsx
const TextInput = forwardRef((props, ref) => {
  return <input type="text" ref={ref} {...props} />;
});

function Parent() {
  const inputRef = useRef(null);
  const focusInput = () => inputRef.current.focus();
  return (
    <>
      <TextInput ref={inputRef} />
      <button onClick={focusInput}>Focus</button>
    </>
  );
}
```

5.5 Use Cases

· Exposing DOM methods (focus, scroll) from a wrapper component.
· Integrating with third-party libraries that require a DOM node.
· Wrapping class components that expose imperative methods.

5.6 Important Notes

· forwardRef must be used with useImperativeHandle to customize the exposed instance value.
· Without forwardRef, refs cannot be passed to functional components.

5.7 Interview Questions

Q: What is forwardRef and why is it needed?
Answer: forwardRef allows a parent to pass a ref to a child component, enabling access to the child's DOM node or instance. It's needed because functional components don't have instances and refs aren't normal props.

---

6. Portals

6.1 Definition

Portals provide a way to render children into a DOM node that exists outside the parent component's DOM hierarchy. This is done using ReactDOM.createPortal(child, container).

6.2 Why It Exists

To break out of the component tree's DOM nesting when needed, such as for modals, tooltips, popovers, and notifications that should escape parent overflow or positioning contexts.

6.3 Syntax

```jsx
import ReactDOM from 'react-dom';

function Modal({ children }) {
  return ReactDOM.createPortal(
    <div className="modal">{children}</div>,
    document.body
  );
}
```

6.4 How It Works

· The portal renders the child into the specified DOM container (e.g., document.body).
· React still keeps the component's position in the React tree; events propagate according to the React tree, not the DOM tree.

6.5 Use Cases

· Modals, dialogs, tooltips
· Notifications/toasts
· Elements that need to escape overflow: hidden or z-index stacking contexts

6.6 Important: Event Bubbling

Events from a portal bubble according to the React component tree, not the DOM tree. This means a parent component in React can catch events from a portal-rendered child, even though the DOM parent is different.

6.7 Interview Questions

Q: What are portals in React and when would you use them?
Answer: Portals render children into a different DOM node outside the parent hierarchy. They are used for modals, tooltips, and other UI that needs to escape parent DOM constraints. Events still bubble through the React tree.

---

7. Error Boundaries

7.1 Definition

Error boundaries are React components that catch JavaScript errors in their child component tree, log those errors, and display a fallback UI instead of crashing the whole application. They are implemented using class components with componentDidCatch and static getDerivedStateFromError.

7.2 Why It Exists

To prevent errors in one part of the UI from crashing the entire app, and to provide graceful degradation and error reporting.

7.3 How to Create an Error Boundary

```jsx
class ErrorBoundary extends React.Component {
  constructor(props) {
    super(props);
    this.state = { hasError: false };
  }

  static getDerivedStateFromError(error) {
    return { hasError: true };
  }

  componentDidCatch(error, errorInfo) {
    console.error('Error caught:', error, errorInfo);
  }

  render() {
    if (this.state.hasError) {
      return <h1>Something went wrong.</h1>;
    }
    return this.props.children;
  }
}
```

7.4 Usage

```jsx
<ErrorBoundary>
  <MyComponent />
</ErrorBoundary>
```

7.5 Limitations

· Error boundaries only catch errors in rendering, lifecycle methods, and constructors.
· They do not catch errors in event handlers, async code, server-side rendering, or errors thrown in the error boundary itself.
· They require class components; there is no hook equivalent (yet).

7.6 Best Practices

· Use multiple error boundaries to isolate failures.
· Provide a user-friendly fallback and a way to recover.
· Log errors to an error tracking service.
· Consider using libraries like react-error-boundary for more features.

7.7 Interview Questions

Q: What is an error boundary and how does it work?
Answer: An error boundary is a class component that catches errors in its child tree and renders a fallback UI. It uses componentDidCatch and getDerivedStateFromError to handle errors.

Q: Which errors are not caught by error boundaries?
Answer: Event handlers, asynchronous code, server-side rendering, and errors thrown in the error boundary itself are not caught.

---

8. Suspense

8.1 Definition

Suspense is a React component that lets you display a fallback UI while waiting for some asynchronous operation (like lazy loading or data fetching) to complete.

8.2 Why It Exists

To provide a declarative way to handle loading states, especially with code splitting and concurrent rendering. It enables React to pause rendering and show a fallback, then resume when ready.

8.3 Syntax

```jsx
<Suspense fallback={<LoadingSpinner />}>
  <LazyComponent />
</Suspense>
```

8.4 Use Cases

· Lazy loading components (React.lazy).
· Data fetching with Suspense-enabled libraries (React Query, Relay, etc.).
· Coordinating loading states across multiple components.

8.5 Multiple Suspense Boundaries

You can nest Suspense to provide different fallbacks for different parts of the UI, improving perceived performance.

8.6 Suspense and Error Boundaries

Suspense handles loading; error boundaries handle errors. They can be used together to manage both loading and error states.

8.7 Interview Questions

Q: What is Suspense in React?
Answer: Suspense is a component that shows a fallback UI while waiting for an async operation to complete. It is used for lazy loading and data fetching.

---

9. Lazy Components

9.1 Definition

Lazy components are components that are loaded on demand using React.lazy and dynamic import(). They enable code splitting by deferring loading until the component is rendered.

9.2 Why It Exists

To reduce the initial bundle size by loading only the code needed for the current view, improving page load performance.

9.3 How to Create

```jsx
const MyLazyComponent = React.lazy(() => import('./MyLazyComponent'));
```

9.4 Rendering Lazy Components

Must be wrapped in <Suspense> to provide a fallback while loading.

```jsx
<Suspense fallback={<div>Loading...</div>}>
  <MyLazyComponent />
</Suspense>
```

9.5 Handling Errors

If the lazy component fails to load (e.g., network error), you can catch it with an error boundary.

9.6 Best Practices

· Use lazy loading for routes and heavy components.
· Provide a meaningful fallback to avoid layout shift.
· Consider preloading with import() on hover/focus.

9.7 Interview Questions

Q: What is React.lazy and how does it help with performance?
Answer: React.lazy enables dynamic import of a component, splitting the bundle. It loads the component only when rendered, reducing initial download size and improving load time. It must be used with Suspense.

---

10. Controlled vs Uncontrolled (Advanced)

10.1 Recap

· Controlled component: value is driven by React state; changes via onChange.
· Uncontrolled component: DOM manages its own state; accessed via refs.

10.2 When to Choose Which

· Controlled: When you need real-time validation, synchronization with other UI, or to manipulate input.
· Uncontrolled: For simple forms, file inputs, or when performance is critical and you don't need per-keystroke updates.

10.3 Hybrid Approach

Use defaultValue with ref and onChange for a balance: initially uncontrolled but can still observe changes.

10.4 Performance Considerations

Controlled components can cause re-renders on every keystroke, which can be a bottleneck. Libraries like React Hook Form use uncontrolled components internally to minimize re-renders while still providing a controlled-like API.

10.5 Advanced: Controlled by parent but with internal state

Sometimes you want a component to be controlled externally but also maintain internal state for UI. Use useEffect to sync props to state, but be aware of anti-patterns.

10.6 Interview Questions

Q: How do you decide between controlled and uncontrolled components?
Answer: Use controlled when you need to validate or transform input in real time or sync with other UI; use uncontrolled for simple cases where you only need the value on submit, or for file inputs. Performance can also influence the choice.

---

11. Reconciliation

11.1 Definition

Reconciliation is the process by which React updates the DOM to match the latest render output. It involves diffing the new virtual DOM tree with the previous one and computing the minimal set of DOM operations needed.

11.2 Why It Exists

To efficiently update the UI without re-rendering the entire DOM, which would be slow. React uses heuristics to make the diffing algorithm O(n) instead of O(n^3).

11.3 How It Works

· When state/props change, React creates a new element tree.
· It compares the new tree with the old tree.
· If elements have different types, React tears down the old subtree and builds a new one.
· If elements have same type, React updates attributes and recursively diffs children.
· For lists, React uses key to match children; without keys, it may re-render more than necessary.

11.4 Key Heuristics

· Elements of different types produce different trees.
· A key prop helps identify which items in a list have changed.

11.5 Implications for Performance

· Using stable, unique key props optimizes reconciliation.
· Avoiding changing element types unnecessarily.
· Splitting components to limit diff scope.

11.6 Interview Questions

Q: What is reconciliation in React?
Answer: Reconciliation is the algorithm React uses to update the DOM efficiently. It diffs the new virtual DOM with the previous one and applies minimal changes. The key prop helps optimize list diffs.

Q: Why are keys important?
Answer: Keys help React identify which items have changed, been added, or removed in a list, enabling it to reuse DOM nodes and improve performance.

---

12. Virtual DOM (Deep Dive)

12.1 Definition

The Virtual DOM is a lightweight JavaScript representation of the real DOM. React maintains a virtual DOM tree in memory and uses it to compute the most efficient way to update the actual DOM.

12.2 Why It Exists

Manipulating the real DOM is slow. By batching updates and diffing virtual trees, React minimizes direct DOM operations.

12.3 Internal Working

· React elements are immutable objects describing the UI.
· When state changes, React creates a new virtual DOM tree.
· It diffs the new tree with the old one (reconciliation).
· Computes a minimal set of DOM mutations.
· Applies those mutations to the real DOM in the commit phase.

12.4 Virtual DOM vs Real DOM

Virtual DOM Real DOM
JavaScript object Browser API
Fast manipulation Slow manipulation
Diffing in memory Direct layout/paint
Batch updates Individual updates

12.5 Advantages

· Performance optimization
· Cross-platform (React Native uses similar concept)
· Declarative programming model

12.6 Disadvantages

· Overhead of creating and diffing virtual trees.
· Not always faster than direct DOM manipulation for simple updates.
· Memory overhead.

12.7 Interview Questions

Q: How does the Virtual DOM improve performance?
Answer: By minimizing direct DOM manipulations through batching and diffing, reducing the number of expensive layout and paint operations. React computes the minimal set of changes and applies them all at once.

Q: Is the Virtual DOM faster than the real DOM?
Answer: The Virtual DOM itself is not faster; the strategy of batching updates and minimizing direct DOM touches often yields better performance for complex UIs, but for simple applications, direct DOM may be faster.

---

13. React Fiber

13.1 Definition

React Fiber is the reimplementation of React's core reconciliation algorithm, introduced in React 16. It is designed to be incremental, pauseable, and resumable, enabling concurrent rendering and better scheduling of work.

13.2 Why It Exists

The old stack reconciler was synchronous and could not interrupt rendering, causing jank for large updates. Fiber allows React to split rendering work into chunks, prioritize updates, and yield to the browser to keep the UI responsive.

13.3 Key Features

· Incremental rendering: work can be split and paused.
· Prioritization: urgent updates (like typing) can jump ahead of less urgent ones.
· Concurrency: multiple tasks can be worked on in parallel (in the sense of time-slicing).
· Error boundaries: better error handling.
· Suspense: enables data fetching and code splitting with fallbacks.

13.4 How Fiber Works

· React maintains a tree of Fiber nodes representing components.
· Work is organized into units (fiber nodes) and processed in a loop.
· The scheduler (now scheduler package) assigns priorities and time slices.
· React can interrupt and resume work, abort low-priority work if higher-priority updates come in.

13.5 Impact on Developers

· New features like Suspense, concurrent mode, transitions (useTransition), and useDeferredValue are built on Fiber.
· Improves perceived performance by keeping UI responsive.

13.6 Interview Questions

Q: What is React Fiber?
Answer: Fiber is the new reconciliation engine in React 16+ that enables incremental rendering, scheduling, and concurrency. It breaks rendering work into small units that can be paused and resumed, improving responsiveness.

Q: How does Fiber improve upon the old stack reconciler?
Answer: The old reconciler processed the entire tree synchronously, blocking the main thread. Fiber allows splitting work, prioritizing updates, and yielding to the browser, enabling features like Suspense and transitions.

---

14. Module 13 – Quick Revision

· Composition: combine components via props/children.
· HOCs: functions that enhance components.
· Render props: function prop to share logic.
· Compound components: share state via context.
· Forward ref: pass ref to child DOM.
· Portals: render outside parent DOM.
· Error boundaries: catch errors in children.
· Suspense: fallback for async loading.
· Lazy components: code splitting.
· Controlled vs uncontrolled: state ownership.
· Reconciliation: diffing algorithm.
· Virtual DOM: in-memory representation.
· Fiber: incremental, concurrent reconciler.

---

15. Interview Questions – Module 13

Beginner

1. What is a Higher-Order Component?
      A function that takes a component and returns a new enhanced component.
2. What is a portal?
      A way to render children into a different DOM node outside the parent hierarchy.
3. What is an error boundary?
      A class component that catches errors in its children and renders a fallback.

Intermediate

1. Compare render props and HOCs.
      Both share logic; render props are more explicit and runtime, HOCs are static wrappers. Hooks are now preferred.
2. How does forwardRef work?
      It allows a parent to pass a ref to a child component, which forwards it to a DOM element or instance.
3. What problem does Fiber solve?
      It enables incremental rendering and scheduling, avoiding blocking the main thread with large updates, and supports concurrent features.

Advanced

1. How would you design a reusable compound component?
      Use React context to share state among a parent and child components, allowing consumers to compose them flexibly. Example: Tabs with Tabs, Tabs.TabList, Tabs.Tab, etc.
2. Explain the difference between React's reconciliation and the Virtual DOM.
      The Virtual DOM is an in-memory representation; reconciliation is the algorithm that diffs two Virtual DOM trees to determine minimal DOM updates.
3. How does error boundary interact with Suspense?
      Suspense handles loading states, while error boundaries handle errors. You can wrap a Suspense in an error boundary to catch both loading failures and runtime errors in lazy components.

Scenario-Based

Q: You need to create a modal that is not affected by parent overflow hidden. How do you implement it?
Answer: Use a portal to render the modal into document.body, so it escapes any parent CSS constraints. Ensure event bubbling follows React tree semantics.

Coding Questions

1. Create an error boundary component.

```jsx
class ErrorBoundary extends React.Component {
  state = { hasError: false };
  static getDerivedStateFromError() { return { hasError: true }; }
  componentDidCatch(error, info) { console.error(error, info); }
  render() { return this.state.hasError ? <h1>Error</h1> : this.props.children; }
}
```

2. Write a HOC that adds loading state to a component.

```jsx
function withLoading(WrappedComponent) {
  return function({ isLoading, ...props }) {
    if (isLoading) return <div>Loading...</div>;
    return <WrappedComponent {...props} />;
  };
}
```

3. Implement a compound Tabs component using context.

```jsx
const TabsContext = createContext();
function Tabs({ children }) { ... } // as earlier
Tabs.Tab = function({ index, children }) { ... };
// etc.
```

---

16. Common Mistakes & Best Practices

Mistake Best Practice
Using HOCs when hooks are simpler Use hooks for logic reuse; HOCs for cross-cutting wrappers
Mutating props in HOCs Pass through props untouched
Not using error boundaries in critical sections Wrap feature areas with error boundaries
Overusing render props causing nested callbacks Prefer hooks or compound components
Forgetting Suspense boundary for lazy components Always provide Suspense fallback
Using portals without considering event propagation Remember events bubble through React tree, not DOM
Not memoizing context value in compound components Memoize the context value to prevent unnecessary re-renders

---

17. Real-World Scenario: Building a Modal System with Portals and Error Boundaries

Problem: A large app needs modals, tooltips, and error fallbacks. Modals should escape overflow issues, and errors in one feature should not crash the entire app.

Solution:

· Use ReactDOM.createPortal for modals and tooltips.
· Use error boundaries around feature sections.
· Use compound components for the modal (e.g., Modal, Modal.Header, Modal.Body, Modal.Footer) sharing state via context.
· Use forwardRef for focus management in modal.
· Use Suspense for lazy loading modal content.

Architecture:

```mermaid
flowchart TD
    App --> ErrorBoundary1[ErrorBoundary Feature A]
    App --> ErrorBoundary2[ErrorBoundary Feature B]
    ErrorBoundary1 --> ModalTrigger
    ModalTrigger --> ModalPortal[Portal to body]
    ModalPortal --> ModalCompound[Compound Modal]
    ModalCompound --> Header
    ModalCompound --> Body
    ModalCompound --> Footer
```

Implementation Highlights:

· createPortal(<div className="modal">...</div>, document.body)
· Modal compound component with context.
· Error boundaries around routes or feature areas.
· Lazy loaded modal content with <Suspense>.

---

This concludes Module 13: Advanced React. The next module is Module 14: React Testing, covering Jest, React Testing Library, unit/integration testing, and more.


Module 14: React Testing

Testing is a critical part of building reliable React applications. This module covers testing concepts, tools (Jest, React Testing Library), component testing, hook testing, asynchronous testing, API mocking, and integration testing. By the end, you will be able to write effective tests for React components and applications.

---

1. Testing Concepts

1.1 Definition

Testing in software development is the process of evaluating and verifying that a software product or application does what it is supposed to do. In React, testing focuses on ensuring components render correctly, handle user interactions, and manage state and side effects as expected.

1.2 Why It Exists

Testing provides confidence that code works correctly, helps prevent regressions when refactoring, documents expected behavior, and improves code quality. It is an essential practice for maintainable and scalable applications.

1.3 Purpose

· Catch bugs early in development.
· Ensure components behave as intended.
· Facilitate refactoring with safety.
· Serve as living documentation.
· Reduce manual testing effort.

1.4 Types of Tests

· Unit tests: Test isolated functions, components, or hooks.
· Integration tests: Test how multiple units work together.
· End-to-end (E2E) tests: Test the entire application flow in a browser-like environment.
· Snapshot tests: Capture rendered output and compare over time.

1.5 Testing Pyramid

```mermaid
flowchart TD
    E2E[E2E Tests - few] 
    Integration[Integration Tests - moderate]
    Unit[Unit Tests - many]
    E2E --> Integration --> Unit
```

Focus on many unit and integration tests, fewer E2E.

1.6 Best Practices

· Test behavior, not implementation details.
· Keep tests independent and deterministic.
· Use meaningful descriptions.
· Mock external dependencies.
· Run tests in CI.

1.7 Interview Question

Q: What are the different types of tests in React?
Answer: Unit tests for isolated functions/components, integration tests for multiple components working together, E2E tests for full user flows, and snapshot tests for UI structure. A balanced testing strategy uses mostly unit and integration tests.

---

2. Jest

2.1 Definition

Jest is a popular JavaScript testing framework developed by Facebook. It provides a test runner, assertion library, mocking, and snapshot testing capabilities out of the box. It is the default test runner for Create React App and widely used in React projects.

2.2 Why It Exists

To provide an all-in-one testing solution with minimal configuration. It simplifies writing and running tests, mocking modules, and generating coverage reports.

2.3 Key Features

· Zero config for many projects.
· Test runner and assertion library.
· Mocking functions and modules.
· Snapshot testing.
· Code coverage reports.
· Watch mode for development.

2.4 Installation

```bash
npm install --save-dev jest
```

For React with Babel, need @babel/preset-env and @babel/preset-react or use babel-jest.

2.5 Basic Test

```javascript
// sum.js
export const sum = (a, b) => a + b;

// sum.test.js
import { sum } from './sum';

test('adds 1 + 2 to equal 3', () => {
  expect(sum(1, 2)).toBe(3);
});
```

2.6 Common Matchers

· toBe – strict equality (primitives)
· toEqual – deep equality (objects)
· toBeTruthy / toBeFalsy
· toContain – array contains
· toHaveLength
· toThrow
· toHaveBeenCalled / toHaveBeenCalledWith

2.7 Running Tests

```bash
npm test
```

2.8 Configuring Jest

jest.config.js or jest field in package.json.

```javascript
module.exports = {
  testEnvironment: 'jsdom',
  setupFilesAfterEnv: ['@testing-library/jest-dom/extend-expect'],
};
```

2.9 Interview Question

Q: What is Jest and why is it commonly used with React?
Answer: Jest is a JavaScript testing framework that provides a test runner, assertions, mocking, and snapshots. It's commonly used with React because it is fast, works well with Babel/TypeScript, and integrates seamlessly with React Testing Library.

---

3. React Testing Library

3.1 Definition

React Testing Library (RTL) is a lightweight testing library for React components. It focuses on testing components the way users interact with them, rather than testing implementation details. It encourages querying by accessible roles, text, and labels.

3.2 Why It Exists

To promote tests that are resilient to refactoring and that verify actual user-visible behavior. Traditional testing libraries like Enzyme often test internal state and props, leading to brittle tests. RTL solves this by focusing on the DOM.

3.3 Key Principles

· Query by role, label, text (not by class or test ID unless necessary).
· Test behavior, not implementation.
· Interact via user events (fireEvent, userEvent).
· Assert on DOM output and side effects.

3.4 Installation

```bash
npm install --save-dev @testing-library/react @testing-library/jest-dom @testing-library/user-event
```

3.5 Setup

Add @testing-library/jest-dom to test setup file:

```javascript
// src/setupTests.js
import '@testing-library/jest-dom';
```

3.6 Basic Test

```jsx
import { render, screen } from '@testing-library/react';
import Greeting from './Greeting';

test('renders greeting message', () => {
  render(<Greeting name="Alice" />);
  expect(screen.getByText('Hello, Alice!')).toBeInTheDocument();
});
```

3.7 Query Types

· getBy...: throws if not found.
· queryBy...: returns null if not found.
· findBy...: returns promise for async queries.

Common queries: getByRole, getByText, getByLabelText, getByPlaceholderText, getByTestId.

3.8 Events

Use fireEvent or userEvent for more realistic interaction.

```jsx
import userEvent from '@testing-library/user-event';

test('button click triggers handler', async () => {
  const handleClick = jest.fn();
  render(<button onClick={handleClick}>Click</button>);
  await userEvent.click(screen.getByRole('button', { name: /click/i }));
  expect(handleClick).toHaveBeenCalledTimes(1);
});
```

3.9 Interview Question

Q: What is React Testing Library and how does it differ from Enzyme?
Answer: RTL focuses on testing components from the user's perspective by querying the DOM and simulating user interactions. It avoids testing internal state and implementation details. Enzyme allows shallow rendering and direct access to component internals, which can lead to brittle tests. RTL is now the recommended approach.

---

4. Component Testing

4.1 Definition

Component testing verifies that a React component renders correctly, responds to props, and handles interactions as expected. It typically uses RTL to render the component and assert on the output.

4.2 What to Test

· Renders without crashing.
· Displays correct content based on props.
· Handles user interactions (clicks, typing, form submission).
· Calls callbacks with correct arguments.
· Conditionally renders based on state/props.
· Handles loading/error states.

4.3 Example: Testing a Counter Component

```jsx
// Counter.jsx
import { useState } from 'react';

function Counter() {
  const [count, setCount] = useState(0);
  return (
    <div>
      <p>Count: {count}</p>
      <button onClick={() => setCount(count + 1)}>Increment</button>
    </div>
  );
}

// Counter.test.jsx
import { render, screen } from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import Counter from './Counter';

test('increments count when button clicked', async () => {
  render(<Counter />);
  const button = screen.getByRole('button', { name: /increment/i });
  await userEvent.click(button);
  expect(screen.getByText('Count: 1')).toBeInTheDocument();
});
```

4.4 Testing Props

```jsx
function Greeting({ name }) {
  return <h1>Hello, {name}!</h1>;
}

test('renders name prop', () => {
  render(<Greeting name="Alice" />);
  expect(screen.getByText('Hello, Alice!')).toBeInTheDocument();
});
```

4.5 Best Practices

· Test user-visible behavior.
· Use userEvent for interactions.
· Use screen for queries.
· Avoid testing CSS classes unless necessary.
· Test conditional rendering and edge cases.

4.6 Interview Question

Q: What do you typically test in a React component?
Answer: I test that it renders without crashing, displays correct content based on props, handles user interactions, calls callbacks, and shows appropriate loading/error states. I focus on user-visible behavior using React Testing Library.

---

5. Props Testing

5.1 Definition

Props testing verifies that a component correctly uses the props passed to it. It ensures that the component renders the expected output for given prop values.

5.2 Approach

· Render the component with different prop values.
· Assert that the output reflects those props.
· Test default props if applicable.

5.3 Example: Testing a UserBadge component

```jsx
function UserBadge({ user }) {
  return (
    <div>
      <span>{user.name}</span>
      {user.isAdmin && <span>Admin</span>}
    </div>
  );
}

test('renders admin badge when user is admin', () => {
  render(<UserBadge user={{ name: 'Alice', isAdmin: true }} />);
  expect(screen.getByText('Admin')).toBeInTheDocument();
});

test('does not render admin badge for non-admin', () => {
  render(<UserBadge user={{ name: 'Bob', isAdmin: false }} />);
  expect(screen.queryByText('Admin')).not.toBeInTheDocument();
});
```

5.4 Testing Default Props

If component has default props, test that they apply when prop not provided.

5.5 Interview Question

Q: How do you test that a component correctly handles different prop values?
Answer: Render the component with various prop values and assert that the output changes accordingly. Use screen queries to check visible content.

---

6. State Testing

6.1 Definition

State testing verifies that component state updates correctly in response to events and that the UI reflects those updates.

6.2 Approach

· Render the component.
· Simulate events that update state.
· Assert that the UI shows the new state.

6.3 Example: Toggle component

```jsx
function Toggle() {
  const [on, setOn] = useState(false);
  return (
    <button onClick={() => setOn(!on)}>
      {on ? 'ON' : 'OFF'}
    </button>
  );
}

test('toggles state on click', async () => {
  render(<Toggle />);
  const button = screen.getByRole('button');
  expect(button).toHaveTextContent('OFF');
  await userEvent.click(button);
  expect(button).toHaveTextContent('ON');
});
```

6.4 Testing State with Async Updates

Use findBy or waitFor when state updates asynchronously.

6.5 Interview Question

Q: How do you test component state changes?
Answer: Simulate user interactions, then assert that the UI reflects the new state. Use userEvent for events and screen queries to check updated content.

---

7. Event Testing

7.1 Definition

Event testing verifies that event handlers are called correctly and that UI responds to events. It includes clicks, typing, form submission, etc.

7.2 Tools

· fireEvent – basic event simulation.
· userEvent – more realistic, simulates real user behavior (recommended).

7.3 Example: Testing a form submission

```jsx
function LoginForm({ onSubmit }) {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    onSubmit({ email, password });
  };

  return (
    <form onSubmit={handleSubmit}>
      <input aria-label="Email" value={email} onChange={e => setEmail(e.target.value)} />
      <input aria-label="Password" type="password" value={password} onChange={e => setPassword(e.target.value)} />
      <button type="submit">Login</button>
    </form>
  );
}

test('calls onSubmit with form data', async () => {
  const handleSubmit = jest.fn();
  render(<LoginForm onSubmit={handleSubmit} />);

  await userEvent.type(screen.getByLabelText('Email'), 'alice@example.com');
  await userEvent.type(screen.getByLabelText('Password'), 'secret');
  await userEvent.click(screen.getByRole('button', { name: /login/i }));

  expect(handleSubmit).toHaveBeenCalledWith({ email: 'alice@example.com', password: 'secret' });
});
```

7.4 Best Practices

· Prefer userEvent over fireEvent.
· Use accessible labels to query inputs.
· Test form validation and error messages.

7.5 Interview Question

Q: How do you test user interactions in React?
Answer: I use React Testing Library's userEvent to simulate clicks, typing, and form submissions, then assert that event handlers are called and the UI updates appropriately.

---

8. Hook Testing

8.1 Definition

Hook testing verifies custom hooks by rendering a test component that uses the hook and then asserting on the hook's return values or effects.

8.2 Approach

· Create a test component that uses the hook.
· Render the test component.
· Assert on the output.
· For async hooks, use waitFor or findBy.

8.3 Libraries

· @testing-library/react with renderHook (from @testing-library/react v13+) or react-hooks-testing-library.
· renderHook is now part of RTL.

8.4 Example: Testing useCounter hook

```javascript
// useCounter.js
import { useState } from 'react';

export function useCounter(initialValue = 0) {
  const [count, setCount] = useState(initialValue);
  const increment = () => setCount(c => c + 1);
  const decrement = () => setCount(c => c - 1);
  return { count, increment, decrement };
}

// useCounter.test.js
import { renderHook, act } from '@testing-library/react';
import { useCounter } from './useCounter';

test('should increment counter', () => {
  const { result } = renderHook(() => useCounter());

  act(() => result.current.increment());

  expect(result.current.count).toBe(1);
});
```

8.5 Testing Async Hooks

Use waitFor or await act(async () => { ... }) for async updates.

8.6 Best Practices

· Test hooks in isolation using renderHook.
· Test both initial value and updates.
· Use act to wrap state updates.
· For hooks with side effects, test cleanup.

8.7 Interview Question

Q: How do you test custom hooks?
Answer: Use renderHook from React Testing Library to execute the hook in a test environment. Then call hook functions within act and assert on the returned values. For async hooks, use waitFor or async act.

---

9. Async Testing

9.1 Definition

Async testing deals with components or hooks that perform asynchronous operations (API calls, timers, promises). It ensures that the UI updates correctly after the async operation completes.

9.2 Tools

· findBy* queries (return promises, wait for element).
· waitFor – waits for a condition.
· act – wraps async state updates.
· Mock timers (jest.useFakeTimers).

9.3 Example: Testing a data fetching component

```jsx
function UserList({ fetchUsers }) {
  const [users, setUsers] = useState([]);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    fetchUsers()
      .then(data => {
        setUsers(data);
        setLoading(false);
      });
  }, [fetchUsers]);

  if (loading) return <div>Loading...</div>;
  return <ul>{users.map(u => <li key={u.id}>{u.name}</li>)}</ul>;
}

test('renders users after fetching', async () => {
  const fetchUsers = jest.fn().mockResolvedValue([{ id: 1, name: 'Alice' }]);
  render(<UserList fetchUsers={fetchUsers} />);

  expect(screen.getByText('Loading...')).toBeInTheDocument();

  expect(await screen.findByText('Alice')).toBeInTheDocument();
});
```

9.4 Testing Async State Updates with waitFor

```jsx
test('updates after async operation', async () => {
  render(<Component />);
  await waitFor(() => expect(screen.getByText('Loaded')).toBeInTheDocument());
});
```

9.5 Mocking Timers

Use jest.useFakeTimers() and jest.advanceTimersByTime().

9.6 Best Practices

· Use findBy* or waitFor for async assertions.
· Mock API calls with jest.fn() or MSW.
· Avoid real network requests in tests.
· Clean up timers with jest.useRealTimers().

9.7 Interview Question

Q: How do you test asynchronous behavior in React?
Answer: Use findBy queries or waitFor to wait for async updates. Mock API calls and use act when needed. For timers, use Jest's fake timers.

---

10. API Mocking

10.1 Definition

API mocking involves simulating server responses in tests without making real HTTP requests. It allows you to control the data and error scenarios, making tests reliable and fast.

10.2 Why It Exists

Real API calls in tests are slow, flaky, and depend on external services. Mocking ensures tests are isolated and deterministic.

10.3 Approaches

· Jest mock functions: jest.fn() with mockResolvedValue / mockRejectedValue.
· Manual mocks: Mock the module that makes API calls.
· Mock Service Worker (MSW): Intercept network requests at the network level, allowing more realistic testing.

10.4 Example: Mocking Axios

```javascript
import axios from 'axios';
jest.mock('axios');

test('fetches users', async () => {
  axios.get.mockResolvedValue({ data: [{ id: 1, name: 'Alice' }] });
  // render component and assert
});
```

10.5 Using MSW

MSW sets up a service worker in tests to intercept requests and return mock responses. It works for both unit and integration tests, and is recommended for realistic API mocking.

10.6 Basic MSW Setup

```javascript
// src/mocks/handlers.js
import { rest } from 'msw';
export const handlers = [
  rest.get('/api/users', (req, res, ctx) => {
    return res(ctx.json([{ id: 1, name: 'Alice' }]));
  }),
];

// src/mocks/server.js
import { setupServer } from 'msw/node';
import { handlers } from './handlers';
export const server = setupServer(...handlers);

// setupTests.js
beforeAll(() => server.listen());
afterEach(() => server.resetHandlers());
afterAll(() => server.close());
```

10.7 Interview Question

Q: What is Mock Service Worker (MSW) and why is it useful?
Answer: MSW intercepts network requests at the service worker level, allowing you to mock API responses in tests. It enables more realistic integration testing by simulating the actual network layer, and works in both browser and Node environments.

---

11. Mock Service Worker (MSW) – Detailed

11.1 Definition

MSW is a library that uses Service Worker API (or Node.js interceptors) to intercept HTTP requests and provide mock responses. It enables testing of components that make API calls without touching a real backend.

11.2 Why It Exists

To simplify API mocking, especially for integration tests. Unlike traditional mocking at the module level, MSW operates at the network level, making tests more realistic and independent of implementation details.

11.3 Setup

· Install msw.
· Define handlers.
· Create a server (for Node) or worker (for browser).
· Start server in test setup.

11.4 Example Handler

```javascript
import { rest } from 'msw';

export const handlers = [
  rest.get('/api/users', (req, res, ctx) => {
    return res(
      ctx.status(200),
      ctx.json([{ id: 1, name: 'Alice' }])
    );
  }),
  rest.post('/api/users', (req, res, ctx) => {
    return res(ctx.status(201));
  }),
];
```

11.5 Testing with MSW

```jsx
test('fetches and displays users', async () => {
  render(<App />);
  expect(await screen.findByText('Alice')).toBeInTheDocument();
});
```

11.6 Benefits

· Realistic network simulation.
· No need to mock modules.
· Can test error scenarios easily (e.g., 500 response).
· Works with both REST and GraphQL.

11.7 Interview Question

Q: How does MSW differ from simply mocking Axios with Jest?
Answer: Mocking Axios with Jest replaces the module in your code, while MSW intercepts actual network requests. MSW provides more realistic testing because it works at the network layer, allowing you to test the full request/response flow, including headers and status codes, without changing component code.

---

12. Integration Testing

12.1 Definition

Integration testing verifies that multiple components or units work together correctly. It goes beyond unit tests by testing interactions between components, state management, routing, and data fetching.

12.2 Why It Exists

To catch issues that arise from the integration of parts, such as prop mismatches, context issues, or API call integration.

12.3 Approach

· Render a tree of components (usually the app or a page).
· Interact with the UI as a user would.
· Assert that the combined behavior is correct.
· Mock external services (API, localStorage) with MSW or similar.

12.4 Example: Testing a login flow

```jsx
test('successful login redirects to dashboard', async () => {
  // MSW handler for POST /auth/login returns token
  renderWithProviders(<App />);
  await userEvent.type(screen.getByLabelText('Email'), 'user@example.com');
  await userEvent.type(screen.getByLabelText('Password'), 'password');
  await userEvent.click(screen.getByRole('button', { name: /login/i }));
  expect(await screen.findByText('Dashboard')).toBeInTheDocument();
});
```

12.5 Rendering with Providers

Create a custom render function that wraps component with Router, Redux, AuthContext, etc.

```jsx
import { render } from '@testing-library/react';
import { Provider } from 'react-redux';
import { BrowserRouter } from 'react-router-dom';
import store from '../store';

export function renderWithProviders(ui, { route = '/' } = {}) {
  window.history.pushState({}, 'Test page', route);
  return render(
    <Provider store={store}>
      <BrowserRouter>
        {ui}
      </BrowserRouter>
    </Provider>
  );
}
```

12.6 Best Practices

· Test critical user journeys.
· Use real stores and routers, not mocks.
· Mock only external APIs.
· Keep integration tests focused but realistic.

12.7 Interview Question

Q: What is integration testing in React and how do you implement it?
Answer: Integration testing verifies that multiple components work together correctly. You render a larger part of the app (e.g., a page or feature) with real providers (Redux, Router) and mock only external APIs using MSW. Then simulate user flows and assert on outcomes.

---

13. Test Coverage

13.1 Definition

Test coverage measures the percentage of code that is executed during tests. It can be measured for statements, branches, functions, and lines. High coverage indicates that most code is tested, but does not guarantee test quality.

13.2 Why It Exists

To identify untested parts of the codebase and ensure that critical paths are covered. It helps maintain code quality and confidence.

13.3 Generating Coverage

In Jest, run:

```bash
npm test -- --coverage
```

Or configure in package.json:

```json
"scripts": {
  "test": "jest --coverage"
}
```

13.4 Coverage Types

· Statement coverage: % of statements executed.
· Branch coverage: % of branches (if/else, switch) executed.
· Function coverage: % of functions called.
· Line coverage: % of lines executed.

13.5 Interpreting Coverage

Aim for meaningful coverage (e.g., 80%+), but focus on critical logic, not just numbers. 100% coverage may not be necessary and can lead to testing trivial code.

13.6 Best Practices

· Set a coverage threshold in CI.
· Don't chase 100% blindly; test important logic.
· Use coverage reports to find untested complex code.
· Combine coverage with other quality metrics.

13.7 Interview Question

Q: What is test coverage and why is it important?
Answer: Test coverage measures how much code is executed by tests. It helps identify untested areas and ensures critical functionality is verified. However, high coverage doesn't guarantee correct tests, so it should be used as a guide, not a sole metric.

---

14. Real-World Scenario: Testing a Feature with Auth, API, and Routing

Problem: An e-commerce app has a product listing page that requires authentication. The page fetches products from an API, displays them, and allows adding to cart. Need tests for the full feature.

Solution:

· Use React Testing Library with MSW to mock API endpoints.
· Use Redux store and React Router in test setup.
· Test that unauthenticated users are redirected to login.
· Test that authenticated users see product list.
· Test adding to cart updates Redux state.
· Test error handling when API fails.

Architecture:

```mermaid
flowchart TD
    Test --> RenderWithProviders
    RenderWithProviders --> MSW[MSW Handlers]
    RenderWithProviders --> ReduxStore
    RenderWithProviders --> Router
    Test --> SimulateUser
    SimulateUser --> Assert
```

Implementation Highlights:

· Custom renderWithProviders wrapping with Router and Redux.
· MSW handlers for /products and /cart endpoints.
· Test user flow from login to product list to add to cart.
· Use findBy for async product loading.
· Verify cart badge updates.

---

15. Module 14 – Quick Revision

· Testing concepts: unit, integration, E2E.
· Jest: test runner, assertions, mocking.
· React Testing Library: user-centric testing.
· Component testing: render, query, interact, assert.
· Hook testing with renderHook and act.
· Async testing with findBy, waitFor.
· API mocking: Jest mocks or MSW.
· Integration testing: test user flows with providers.
· Coverage: measure and aim for meaningful coverage.
· Focus on behavior, not implementation.

---

16. Interview Questions – Module 14

Beginner

1. What is Jest?
      A JavaScript testing framework for running tests, assertions, mocking, and snapshots.
2. What is React Testing Library?
      A library for testing React components by simulating user interactions and querying the DOM.
3. What is the difference between unit and integration testing?
      Unit tests isolate a single function/component; integration tests verify multiple units working together.

Intermediate

1. How do you test a component that makes an API call?
      Mock the API call using Jest mocks or MSW. Then render the component and use findBy to wait for the data to appear.
2. What is renderHook and when would you use it?
      renderHook is a utility to test custom hooks in isolation. Use it to call the hook and assert on its return values and side effects.
3. Why is userEvent preferred over fireEvent?
      userEvent simulates real user interactions more accurately (e.g., triggering focus/blur, input events), leading to more realistic and reliable tests.

Advanced

1. What is Mock Service Worker and how does it improve testing?
      MSW intercepts network requests at the service worker level, allowing realistic API mocking without changing component code. It enables integration testing of full request/response cycles.
2. How do you test error states in a component?
      Mock the API to reject or return an error status. Then assert that the error message appears in the UI. Use waitFor or findBy to wait for the error state.
3. How would you set up integration testing for a Redux-connected component?
      Create a custom render function that wraps the component with Redux Provider and real store, along with React Router. Use MSW to mock API endpoints. Then simulate user actions and assert on state and UI changes.

Scenario-Based

Q: Your test suite is slow because components make real API calls. How would you fix it?
Answer: Use MSW to mock API requests at the network level, or mock API modules with Jest. This eliminates real network calls, making tests fast and deterministic.

Coding Questions

1. Write a test for a Button component that calls onClick when clicked.

```jsx
test('calls onClick handler', async () => {
  const handleClick = jest.fn();
  render(<button onClick={handleClick}>Click</button>);
  await userEvent.click(screen.getByRole('button', { name: /click/i }));
  expect(handleClick).toHaveBeenCalledTimes(1);
});
```

2. Write a test for a custom hook useToggle using renderHook.

```jsx
import { renderHook, act } from '@testing-library/react';
import { useToggle } from './useToggle';

test('toggles value', () => {
  const { result } = renderHook(() => useToggle(false));
  act(() => result.current.toggle());
  expect(result.current.value).toBe(true);
});
```

---

17. Common Mistakes & Best Practices

Mistake Best Practice
Testing implementation details Test user-visible behavior
Using real API calls in tests Mock APIs with MSW
Not cleaning up after tests Use afterEach(cleanup) (automatic with RTL)
Overusing data-testid Prefer accessible roles/labels
Ignoring async warnings Use findBy or waitFor for async assertions
Not testing error/loading states Include tests for all UI states
Chasing 100% coverage Aim for meaningful coverage of critical logic

---

18. Testing Libraries and Tools Summary

Tool Purpose
Jest Test runner, assertions, mocking, coverage
React Testing Library Component testing from user perspective
MSW API mocking at network level
@testing-library/user-event Simulate realistic user interactions
@testing-library/jest-dom Additional DOM matchers
renderHook Test custom hooks
Cypress / Playwright End-to-end testing

---

This concludes Module 14: React Testing. The next module is Module 15: React + TypeScript, covering TypeScript basics, component types, hooks typing, Redux typing, and more.



Module 15: React + TypeScript

TypeScript is a superset of JavaScript that adds static typing. When combined with React, it improves code quality, developer experience, and maintainability by catching errors early and providing better tooling. This module covers the fundamentals of TypeScript, how to type React components, props, state, events, refs, and advanced patterns like generics, typed hooks, API responses, and Redux integration.

---

1. TypeScript Basics

1.1 Definition

TypeScript is a strongly typed programming language that builds on JavaScript. It adds optional static typing, interfaces, enums, generics, and other features, and compiles to plain JavaScript. It is developed and maintained by Microsoft.

1.2 Why It Exists

To bring type safety to JavaScript, catching errors during development rather than at runtime. It improves code navigation, autocompletion, refactoring, and documentation, making large codebases more maintainable.

1.3 Purpose

· Detect type errors early.
· Provide better IDE support.
· Document code structure and contracts.
· Enable safer refactoring.
· Scale to large teams and projects.

1.4 Prerequisites

· JavaScript (ES6+)
· Basic understanding of static types (if coming from C#/Java)

1.5 Core Types

· number, string, boolean
· Arrays: number[] or Array<number>
· Tuples: [string, number]
· any (avoid), unknown, void, never, null, undefined
· Object types: { name: string; age: number }
· Union types: string | number
· Intersection types: A & B
· Type aliases and interfaces
· Enums
· Generics

1.6 Basic Example

```typescript
let age: number = 30;
let name: string = "Alice";
let isActive: boolean = true;

function greet(person: string): string {
  return `Hello, ${person}`;
}
```

1.7 Interfaces vs Type Aliases

Interface:

```typescript
interface User {
  id: number;
  name: string;
  email: string;
}
```

Type alias:

```typescript
type User = {
  id: number;
  name: string;
  email: string;
};
```

Both are similar; interfaces are often preferred for object shapes and can be extended, while type aliases can represent unions and intersections.

1.8 Type Inference

TypeScript can infer types from initialization:

```typescript
let count = 0; // inferred as number
const user = { id: 1, name: "Alice" }; // inferred as { id: number, name: string }
```

1.9 Configuring TypeScript (tsconfig.json)

```json
{
  "compilerOptions": {
    "target": "ES2020",
    "lib": ["DOM", "ES2020"],
    "jsx": "react-jsx",
    "strict": true,
    "moduleResolution": "node",
    "esModuleInterop": true,
    "skipLibCheck": true,
    "forceConsistentCasingInFileNames": true
  },
  "include": ["src"]
}
```

strict: true enables a set of strict type-checking options, recommended for new projects.

1.10 When to Use TypeScript

· Large or growing codebases.
· Teams with multiple developers.
· Projects that require long-term maintenance.
· When you want better tooling and documentation.

1.11 When Not to Use

· Very small, quick prototypes where overhead may not be justified.
· If the team has no TypeScript experience and the learning curve is a concern (though it pays off).

1.12 Interview Questions

Q: What is TypeScript and why would you use it with React?
Answer: TypeScript is a typed superset of JavaScript. It adds static type checking, which helps catch errors early, improves IDE support, and makes code more maintainable. With React, it ensures props, state, and event handlers are correctly typed.

---

2. Component Types

2.1 Definition

Component types in TypeScript define the shape of a React component. They specify the props a component accepts and possibly other type information. TypeScript can infer component types or you can explicitly annotate them.

2.2 Why It Exists

To ensure components are used correctly throughout the codebase, providing compile-time checks for props and reducing runtime errors.

2.3 Functional Component with TypeScript

There are several ways to type a functional component:

```tsx
// 1. Inline type annotation for props
function Greeting({ name }: { name: string }) {
  return <h1>Hello, {name}</h1>;
}

// 2. Using an interface or type alias
interface GreetingProps {
  name: string;
}
function Greeting({ name }: GreetingProps) {
  return <h1>Hello, {name}</h1>;
}

// 3. Using React.FC (less recommended in modern code)
import { FC } from 'react';
interface GreetingProps { name: string; }
const Greeting: FC<GreetingProps> = ({ name }) => <h1>Hello, {name}</h1>;
```

2.4 React.FC vs plain function

React.FC is less recommended because it implicitly adds children and may cause issues with generics. Prefer plain function with explicit props type.

2.5 Class Component Typing

```tsx
import { Component } from 'react';

interface CounterProps { initialCount: number; }
interface CounterState { count: number; }

class Counter extends Component<CounterProps, CounterState> {
  state: CounterState = { count: this.props.initialCount };

  render() {
    return <div>{this.state.count}</div>;
  }
}
```

2.6 Best Practices

· Define props as an interface or type alias.
· Avoid using React.FC unless you need the implicit children and don't mind the extra type.
· Use destructuring in function parameters for clarity.

2.7 Interview Questions

Q: How do you type a functional component in React with TypeScript?
Answer: By defining an interface or type for the props and using it as the function parameter type. Example: function Greeting({ name }: GreetingProps) { ... }. Avoid React.FC for new code.

---

3. Props Types

3.1 Definition

Props types define the shape of the data passed to a component. They specify the required and optional properties, their types, and can include functions, React nodes, and complex objects.

3.2 Why It Exists

To enforce that components receive the correct data, making component contracts explicit and catching errors during development.

3.3 Common Prop Types

· Primitives: string, number, boolean
· React nodes: ReactNode (for children, JSX)
· Functions: (param: Type) => ReturnType
· Arrays: Array<T> or T[]
· Objects: { key: type }
· Optional props: prop?: Type
· Union props: variant: 'primary' | 'secondary'
· Default props: handled via destructuring default values

3.4 Example

```tsx
interface ButtonProps {
  label: string;
  onClick: () => void;
  variant?: 'primary' | 'secondary';
  disabled?: boolean;
  children?: React.ReactNode;
}

function Button({ label, onClick, variant = 'primary', disabled, children }: ButtonProps) {
  return (
    <button onClick={onClick} className={variant} disabled={disabled}>
      {children ?? label}
    </button>
  );
}
```

3.5 Optional vs Default Props

Optional props use ?. Default values can be set in destructuring.

3.6 Common Mistakes

· Forgetting to mark optional props with ?.
· Using any for props (loses type safety).
· Not documenting function prop signatures.

3.7 Interview Questions

Q: How do you define props types in TypeScript?
Answer: By creating an interface or type alias that describes the props object, then using it as the function parameter type. Optional props use ?.

---

4. State Types

4.1 Definition

State types define the type of state managed by a component, either via useState or class component state. They ensure that state updates and values are consistent.

4.2 Why It Exists

To prevent invalid state assignments and to provide type safety when updating state.

4.3 useState with TypeScript

TypeScript infers the type from the initial value, but you can explicitly annotate with a generic:

```tsx
// Inferred as number
const [count, setCount] = useState(0);

// Explicit type annotation
const [user, setUser] = useState<User | null>(null);
```

For complex state, define an interface.

4.4 Example: Managing an object state

```tsx
interface User {
  id: number;
  name: string;
  email: string;
}

const [user, setUser] = useState<User>({ id: 1, name: 'Alice', email: 'alice@example.com' });
```

4.5 Type for setState

The setter function type is Dispatch<SetStateAction<T>>. You don't usually need to annotate it, but useful for passing setter as prop.

4.6 State with useReducer

```tsx
interface State { count: number; }
type Action = { type: 'increment' } | { type: 'decrement' };

function reducer(state: State, action: Action): State {
  switch (action.type) {
    case 'increment': return { count: state.count + 1 };
    case 'decrement': return { count: state.count - 1 };
    default: return state;
  }
}

const [state, dispatch] = useReducer(reducer, { count: 0 });
```

4.7 Best Practices

· Let inference work for simple states.
· Explicitly type complex or initially null states.
· Use union types for actions with useReducer.
· Keep state interfaces clear.

4.8 Interview Questions

Q: How do you type state in React with TypeScript?
Answer: For useState, the type is inferred from the initial value, but you can provide a generic like useState<User | null>(null). For useReducer, define state and action types.

---

5. Event Types

5.1 Definition

Event types in TypeScript describe the shape of event objects passed to event handlers in React. They include specific types for different events: React.MouseEvent, React.ChangeEvent, React.FormEvent, React.KeyboardEvent, etc.

5.2 Why It Exists

To ensure event handlers receive the correct event object and to access event properties safely.

5.3 Common Event Types

· React.MouseEvent<HTMLButtonElement> – click, double click.
· React.ChangeEvent<HTMLInputElement> – input changes.
· React.FormEvent<HTMLFormElement> – form submit.
· React.KeyboardEvent<HTMLInputElement> – keydown, keyup.
· React.FocusEvent<HTMLElement> – focus, blur.

5.4 Example: Typing events

```tsx
const handleClick = (event: React.MouseEvent<HTMLButtonElement>) => {
  console.log(event.currentTarget);
};

const handleChange = (event: React.ChangeEvent<HTMLInputElement>) => {
  setValue(event.target.value);
};

const handleSubmit = (event: React.FormEvent<HTMLFormElement>) => {
  event.preventDefault();
};
```

5.5 Generic Parameter

The generic parameter specifies the element type the event is attached to. For a button, use HTMLButtonElement; for input, HTMLInputElement; for generic element, HTMLElement.

5.6 Inline Handlers

When defining inline, TypeScript often infers the event type, but explicit annotation is clearer.

5.7 Common Mistakes

· Using generic Event instead of React's synthetic event types.
· Forgetting to specify the element type in generics.

5.8 Interview Questions

Q: How do you type event handlers in React with TypeScript?
Answer: Use React's event types like React.MouseEvent<HTMLButtonElement>, React.ChangeEvent<HTMLInputElement>, etc., specifying the element as generic parameter.

---

6. Ref Types

6.1 Definition

Ref types define the type of a ref object in TypeScript. They specify what kind of element or value the ref points to, ensuring type safety when accessing ref.current.

6.2 Why It Exists

To prevent errors when using refs for DOM elements or mutable values, ensuring correct type and property access.

6.3 useRef with TypeScript

· For DOM elements: useRef<HTMLInputElement>(null)
· For mutable values: useRef<number>(0)

6.4 Example

```tsx
const inputRef = useRef<HTMLInputElement>(null);

useEffect(() => {
  inputRef.current?.focus(); // OK, current is HTMLInputElement | null
}, []);
```

If you want a ref that is never null (but initialized later), use useRef<HTMLInputElement>(null!) or provide an initial value.

6.5 Mutable Value Ref

```tsx
const countRef = useRef<number>(0);
countRef.current++;
```

6.6 Forwarding Refs with TypeScript

```tsx
import { forwardRef } from 'react';

interface InputProps { label: string; }
const TextInput = forwardRef<HTMLInputElement, InputProps>(({ label }, ref) => {
  return (
    <label>
      {label}
      <input ref={ref} />
    </label>
  );
});

// Usage
const ref = useRef<HTMLInputElement>(null);
<TextInput ref={ref} label="Name" />
```

The generic order for forwardRef is <RefType, PropsType>.

6.7 Common Mistakes

· Forgetting to initialize with null when using DOM refs.
· Not specifying the correct element type.
· Incorrect generic order in forwardRef.

6.8 Interview Questions

Q: How do you type a ref to an input element in React with TypeScript?
Answer: Use useRef<HTMLInputElement>(null). Access the element with ref.current. For forwardRef, use forwardRef<HTMLInputElement, Props>.

---

7. Children Types

7.1 Definition

Children types define the type of the children prop in a component. The most common type is React.ReactNode, which accepts any valid React content (elements, strings, numbers, fragments, arrays, etc.).

7.2 Why It Exists

To provide flexibility while ensuring that children is a valid React renderable.

7.3 Common Children Types

· React.ReactNode – any renderable content (most common).
· JSX.Element – a single JSX element (more restrictive).
· string – only text.
· React.ReactChild – legacy, avoid.
· React.ReactElement – a single element.

7.4 Example

```tsx
interface CardProps {
  title: string;
  children: React.ReactNode;
}

function Card({ title, children }: CardProps) {
  return (
    <div className="card">
      <h2>{title}</h2>
      <div>{children}</div>
    </div>
  );
}
```

7.5 Optional Children

If children are optional, use children?: React.ReactNode. Note that React.FC automatically includes optional children, but with explicit props you control it.

7.6 Restricting Children

You can restrict to a specific type:

```tsx
interface ListProps {
  children: React.ReactElement[];
}
```

But this is rarely needed; ReactNode is usually sufficient.

7.7 Interview Questions

Q: What type should you use for the children prop in TypeScript?
Answer: React.ReactNode is the most common and flexible type, accepting any renderable content.

---

8. Generic Components

8.1 Definition

Generic components in TypeScript are components that can work with a variety of types, using type parameters. They enable reusable components like lists, tables, or selectors that maintain type safety.

8.2 Why It Exists

To create flexible, type-safe components that can handle different data types without sacrificing type checking.

8.3 Defining a Generic Component

In functional components, generics can be used in the props interface:

```tsx
interface ListProps<T> {
  items: T[];
  renderItem: (item: T) => React.ReactNode;
}

function List<T>({ items, renderItem }: ListProps<T>) {
  return <ul>{items.map((item, i) => <li key={i}>{renderItem(item)}</li>)}</ul>;
}
```

Usage:

```tsx
<List items={[1, 2, 3]} renderItem={(num) => <span>{num}</span>} />
<List items={['a', 'b']} renderItem={(str) => <span>{str.toUpperCase()}</span>} />
```

TypeScript infers T from usage; you can also specify explicitly: <List<number> ... />.

8.4 Generic with forwardRef

If you need generic with forwardRef, it becomes more complex due to limitations. Often you may need to cast or use a wrapper function.

8.5 Use Cases

· Data tables
· Select components
· List components
· HOCs that preserve types

8.6 Common Mistakes

· Overusing generics when not needed.
· Incorrect generic syntax in TSX (angle brackets can conflict with JSX). Use trailing comma: <T,> to disambiguate.

8.7 Example: Generic Select

```tsx
interface SelectProps<T> {
  options: T[];
  value: T;
  onChange: (value: T) => void;
  getLabel: (option: T) => string;
}

function Select<T>({ options, value, onChange, getLabel }: SelectProps<T>) {
  return (
    <select value={String(value)} onChange={(e) => {
      const selected = options.find(opt => String(opt) === e.target.value);
      if (selected) onChange(selected);
    }}>
      {options.map(opt => <option key={String(opt)} value={String(opt)}>{getLabel(opt)}</option>)}
    </select>
  );
}
```

8.8 Interview Questions

Q: How do you create a generic component in React with TypeScript?
Answer: Define a props interface with a type parameter <T> and use it in the component function: function List<T>(props: ListProps<T>) { ... }. TypeScript infers the type from usage.

---

9. Custom Hook Types

9.1 Definition

Custom hook types define the return type and parameter types of custom hooks. This ensures that the hook's API is clear and that consumers use it correctly.

9.2 Why It Exists

To provide type safety and documentation for custom hooks, making them easier to use and less error-prone.

9.3 Defining Types for a Hook

```typescript
interface UseToggleReturn {
  value: boolean;
  toggle: () => void;
  setTrue: () => void;
  setFalse: () => void;
}

function useToggle(initialValue: boolean = false): UseToggleReturn {
  const [value, setValue] = useState(initialValue);
  const toggle = () => setValue(v => !v);
  const setTrue = () => setValue(true);
  const setFalse = () => setValue(false);
  return { value, toggle, setTrue, setFalse };
}
```

9.4 Using the Hook

```tsx
const { value, toggle } = useToggle();
```

9.5 Generic Hooks

Hooks can be generic, similar to components:

```typescript
function useLocalStorage<T>(key: string, initialValue: T): [T, (value: T) => void] {
  const [storedValue, setStoredValue] = useState<T>(() => {
    try {
      const item = window.localStorage.getItem(key);
      return item ? JSON.parse(item) as T : initialValue;
    } catch {
      return initialValue;
    }
  });

  const setValue = (value: T) => {
    setStoredValue(value);
    window.localStorage.setItem(key, JSON.stringify(value));
  };

  return [storedValue, setValue];
}
```

9.6 Best Practices

· Always annotate return type.
· Use generics when the hook can work with different data types.
· Keep hook API minimal and consistent.

9.7 Interview Questions

Q: How do you type a custom hook in TypeScript?
Answer: Define parameter types and a return type (usually an interface). For generic hooks, use type parameters to preserve type information. Example: function useFetch<T>(url: string): { data: T | null; loading: boolean; error: string | null } { ... }.

---

10. API Response Types

10.1 Definition

API response types define the shape of data returned from an API. They ensure that the frontend correctly handles server responses, reducing runtime errors due to unexpected data structures.

10.2 Why It Exists

To provide type safety when consuming APIs, making code more robust and self-documenting.

10.3 Defining API Types

Create interfaces or types for each response:

```typescript
interface User {
  id: number;
  name: string;
  email: string;
  createdAt: string;
}

interface PaginatedResponse<T> {
  items: T[];
  total: number;
  page: number;
  pageSize: number;
}

type UsersResponse = PaginatedResponse<User>;
```

10.4 Using with Axios

Axios is generic: axios.get<T>(url) returns AxiosPromise<T>, so you can type responses:

```typescript
const response = await axios.get<User[]>('/api/users');
const users: User[] = response.data;
```

10.5 Using with Fetch

Fetch is not generic, so you cast or manually type:

```typescript
const res = await fetch('/api/users');
const users = await res.json() as User[];
```

10.6 Error Types

Define error response shape as well:

```typescript
interface ApiError {
  message: string;
  code: string;
}
```

10.7 Best Practices

· Define types in a central location (e.g., types/api.ts).
· Use generics for paginated responses.
· Keep types in sync with backend; consider code generation (OpenAPI) for large APIs.
· Use discriminated unions for union responses.

10.8 Interview Questions

Q: How do you type API responses in a React + TypeScript app?
Answer: Define interfaces for the expected response shape. With Axios, use axios.get<T>() to get typed data. For Fetch, cast the result with as T or use a custom wrapper. Keep types centralized.

---

11. Redux + TypeScript

11.1 Definition

Redux + TypeScript integration involves typing the Redux store, state, actions, reducers, and hooks to ensure type safety across the state management layer. Redux Toolkit provides first-class TypeScript support.

11.2 Why It Exists

To catch errors in state management early, improve developer experience, and maintain consistency.

11.3 Typing with Redux Toolkit

Redux Toolkit simplifies typing:

Define state and actions with createSlice:

```typescript
import { createSlice, PayloadAction } from '@reduxjs/toolkit';

interface CounterState {
  value: number;
}

const initialState: CounterState = { value: 0 };

const counterSlice = createSlice({
  name: 'counter',
  initialState,
  reducers: {
    increment(state) {
      state.value++;
    },
    incrementByAmount(state, action: PayloadAction<number>) {
      state.value += action.payload;
    },
  },
});

export const { increment, incrementByAmount } = counterSlice.actions;
export default counterSlice.reducer;
```

Configure store with typed hooks:

```typescript
import { configureStore } from '@reduxjs/toolkit';
import counterReducer from './counterSlice';
import { useDispatch, useSelector, TypedUseSelectorHook } from 'react-redux';

export const store = configureStore({
  reducer: {
    counter: counterReducer,
  },
});

export type RootState = ReturnType<typeof store.getState>;
export type AppDispatch = typeof store.dispatch;

export const useAppDispatch = () => useDispatch<AppDispatch>();
export const useAppSelector: TypedUseSelectorHook<RootState> = useSelector;
```

Use the typed hooks in components:

```tsx
const count = useAppSelector(state => state.counter.value);
const dispatch = useAppDispatch();
```

11.4 Typing createAsyncThunk

```typescript
export const fetchUser = createAsyncThunk<User, string>(
  'user/fetch',
  async (userId) => {
    const response = await axios.get<User>(`/users/${userId}`);
    return response.data;
  }
);
```

Then in slice, handle with builder:

```typescript
builder.addCase(fetchUser.fulfilled, (state, action) => {
  state.user = action.payload;
});
```

11.5 Typing RTK Query

RTK Query is strongly typed: generated hooks infer types from endpoint definitions.

11.6 Best Practices

· Export RootState and AppDispatch types from store.
· Use typed hooks (useAppDispatch, useAppSelector).
· Type actions with PayloadAction<T>.
· Type thunk payloads.

11.7 Interview Questions

Q: How do you integrate TypeScript with Redux Toolkit?
Answer: Use createSlice with typed initial state and PayloadAction for actions. Export RootState and AppDispatch from the store, and create typed hooks. For async thunks, use createAsyncThunk with generic types.

---

12. Real-World Scenario: Typed E-Commerce App with Redux and API

Problem: Build a product listing page with TypeScript that fetches products from an API, stores them in Redux, and displays them with filtering. Need full type safety.

Solution:

· Define Product interface.
· Create an API function that returns typed data.
· Use Redux Toolkit with typed slices and async thunk.
· Use typed hooks in components.
· Implement filtering with derived state and typed selectors.

Architecture:

```mermaid
flowchart TD
    Component --> useAppSelector
    Component --> useAppDispatch
    useAppSelector --> RootState
    useAppDispatch --> AppDispatch
    AppDispatch --> fetchProducts[fetchProducts thunk]
    fetchProducts --> API[API Service typed]
    API --> Product[Product type]
    RootState --> productsSlice
```

Implementation Highlights:

· types/product.ts: interface Product { id: number; name: string; price: number; category: string; }
· services/productApi.ts: export async function fetchProducts(): Promise<Product[]> { const res = await axios.get<Product[]>('/api/products'); return res.data; }
· features/productsSlice.ts: uses createAsyncThunk<Product[], void> and handles states.
· Typed hooks in hooks.ts.
· Component uses useAppSelector for products, useMemo for filtered list, and useAppDispatch to trigger fetch.

---

13. Module 15 – Quick Revision

· TypeScript adds static types to JavaScript.
· Use interfaces/type aliases for props, state, API responses.
· Prefer plain function components with typed props; avoid React.FC.
· Type events with React.ChangeEvent<HTMLInputElement> etc.
· Use useRef<HTMLInputElement>(null) for DOM refs.
· Children type: React.ReactNode.
· Generics enable reusable components and hooks.
· Redux Toolkit integrates seamlessly with TypeScript; export RootState and AppDispatch, create typed hooks.
· API responses: type with interfaces; Axios generic get<T>.

---

14. Interview Questions – Module 15

Beginner

1. What is TypeScript?
      A typed superset of JavaScript that compiles to plain JavaScript, adding static type checking.
2. How do you type props in a React component?
      Define an interface or type and use it as the function parameter type: function Greeting({ name }: GreetingProps).
3. What is the type of children in React with TypeScript?
      React.ReactNode is the most common type.

Intermediate

1. How do you type useState when the initial value is null?
      Use a union type: useState<User | null>(null), or provide a generic: useState<User | null>(null).
2. Explain how to type event handlers in React.
      Use React's event types: React.MouseEvent<HTMLButtonElement>, React.ChangeEvent<HTMLInputElement>, etc., with the element as generic.
3. What are the benefits of using TypeScript with Redux Toolkit?
      Type safety for state, actions, and thunks; better autocompletion; catch errors early; typed hooks with useAppDispatch/useAppSelector.

Advanced

1. How would you create a generic component like a Select that works with any type?
      Use a generic type parameter <T> in the component and props interface. Example: function Select<T>({ options, value, onChange }: SelectProps<T>).
2. Describe how you would type a custom hook that fetches data from an API.
      Use a generic type T for the data. Return { data: T | null; loading: boolean; error: string | null }. Use useState<T | null>(null).
3. What are the challenges of typing forwardRef with TypeScript?
      forwardRef uses two generics: ref type and props type (forwardRef<RefType, PropsType>). If the component is also generic, TypeScript's support is limited; often you need workarounds like casting or using a non-generic wrapper.

Scenario-Based

Q: Your team is migrating a JavaScript React app to TypeScript. What steps would you take?
Answer: Start by adding TypeScript config and renaming files to .tsx. Gradually add types to props/state, then convert components one by one. Use any temporarily but replace with proper types. Set strict: false initially, then enable strict as you progress. Use type definitions for libraries (@types/react). Prioritize shared components and API calls.

Coding Questions

1. Write a typed Button component with optional variant and disabled props.

```tsx
interface ButtonProps {
  label: string;
  onClick: () => void;
  variant?: 'primary' | 'secondary';
  disabled?: boolean;
}

function Button({ label, onClick, variant = 'primary', disabled }: ButtonProps) {
  return <button className={variant} onClick={onClick} disabled={disabled}>{label}</button>;
}
```

2. Create a typed custom hook useToggle that returns [value, toggle].

```tsx
function useToggle(initialValue: boolean = false): [boolean, () => void] {
  const [value, setValue] = useState(initialValue);
  const toggle = () => setValue(v => !v);
  return [value, toggle];
}
```

3. Type an Axios GET request for a list of products.

```typescript
interface Product { id: number; name: string; price: number; }
const response = await axios.get<Product[]>('/api/products');
const products: Product[] = response.data;
```

---

15. Common Mistakes & Best Practices

Mistake Best Practice
Using any extensively Use specific types or unknown and narrow
Using React.FC with implicit children Prefer explicit function with typed props
Not typing event handlers Use React event types
Ignoring strict mode Enable strict: true in tsconfig
Not centralizing API types Define types in a shared types folder
Forgetting generics order in forwardRef Remember forwardRef<Ref, Props>
Not exporting RootState/AppDispatch in Redux Export and create typed hooks
Using string for children Use React.ReactNode
Not typing custom hooks return Always annotate return type

---

16. Quick Setup for React + TypeScript

Vite:

```bash
npm create vite@latest my-app -- --template react-ts
```

Create React App (deprecated):

```bash
npx create-react-app my-app --template typescript
```

Key dependencies:

· typescript
· @types/react, @types/react-dom (if not included)

---

This concludes Module 15: React + TypeScript. The next module is Module 16: Modern React, covering React 18/19 features, concurrent rendering, Suspense, transitions, Server Components, and more.



Module 16: Modern React

Modern React encompasses the latest features and architectural patterns introduced in React 18 and React 19. It focuses on concurrent rendering, improved Suspense, transitions, server components, and server actions. This module explores these cutting-edge concepts, their benefits, and how to use them to build high-performance, scalable applications.

---

1. React 18

1.1 Definition

React 18 is a major release of React, released in March 2022. It introduces concurrent rendering, automatic batching, transitions, Suspense improvements, and new hooks (useId, useTransition, useDeferredValue, useSyncExternalStore). It also lays the foundation for future features like Server Components.

1.2 Why It Exists

To address performance limitations of the synchronous rendering model, enabling React to be more responsive and to support advanced features like streaming server-side rendering and selective hydration.

1.3 Key Features in React 18

· Concurrent Rendering: ability to interrupt and prioritize renders.
· Automatic Batching: batches all state updates (including in promises, timeouts) for fewer re-renders.
· Transitions: mark updates as non-urgent using startTransition.
· Suspense with Data: framework support for data fetching with Suspense.
· New Hooks: useId, useTransition, useDeferredValue, useSyncExternalStore.
· Strict Mode behavior: simulates unmount/remount for effects (dev only).
· Root API: createRoot replaces ReactDOM.render.

1.4 Upgrading to React 18

```jsx
import { createRoot } from 'react-dom/client';

const root = createRoot(document.getElementById('root'));
root.render(<App />);
```

Automatic batching is now enabled by default; previously only batched in event handlers.

1.5 Advantages

· Better responsiveness and performance.
· More granular control over update priority.
· Improved SSR and streaming.
· Future-proofing for concurrent features.

1.6 Disadvantages

· New concurrent features require learning and careful use.
· Strict Mode double-invocation may surprise developers.
· Some libraries needed to update for compatibility.

1.7 Interview Questions

Q: What is React 18 and what are its major features?
Answer: React 18 introduces concurrent rendering, automatic batching, transitions, improved Suspense, and new hooks like useId, useTransition, useDeferredValue, useSyncExternalStore. It enables more responsive UIs by allowing React to prioritize updates.

Q: How does automatic batching improve performance?
Answer: Automatic batching groups multiple state updates into a single re-render, even outside event handlers (e.g., in promises). This reduces unnecessary renders and improves performance.

---

2. React 19

2.1 Definition

React 19 is the next major release (expected stable in 2024/2025). It focuses on server components, actions, improved form handling, optimistic updates, and simplifying common patterns. It builds upon React 18's concurrent foundation.

2.2 Why It Exists

To further improve developer experience and performance, especially for full-stack React with Server Components and Server Actions, and to simplify data mutations and form handling.

2.3 Key Features (Anticipated/Current in Canary)

· Server Components (RSC): run components on server, stream to client.
· Server Actions: functions that run on server and can be called from client, used for mutations.
· Form Actions: <form action={...}> to submit forms to Server Actions.
· useFormStatus: hook for pending state of form submissions.
· useOptimistic: hook for optimistic updates.
· Document Metadata: built-in support for <title>, <meta> in components.
· Improved ref handling: ref as a normal prop (no forwardRef needed).
· use() hook: to read context or promises.

2.4 Advantages

· Simplifies full-stack React.
· Reduces client-side JavaScript.
· Better SEO and initial load.
· Optimistic updates become easier.
· Cleaner form handling.

2.5 Disadvantages

· Requires framework support (Next.js, Remix) for Server Components/Actions.
· Ecosystem still maturing.
· Learning curve for new patterns.

2.6 Interview Questions

Q: What are the main features of React 19?
Answer: React 19 focuses on Server Components, Server Actions, improved forms with actions, useFormStatus, useOptimistic, built-in metadata, and ref as normal prop. It aims to simplify full-stack React and data mutations.

Q: How do Server Actions differ from traditional API calls?
Answer: Server Actions are functions that run on the server and can be invoked directly from the client, eliminating the need to manually write API endpoints. They are type-safe and integrate with forms and optimistic updates.

---

3. Concurrent Rendering

3.1 Definition

Concurrent rendering is a foundational capability in React 18 that allows React to prepare multiple versions of the UI simultaneously. It enables React to interrupt rendering, prioritize urgent updates, and resume or discard work as needed, keeping the UI responsive.

3.2 Why It Exists

Traditional React rendering is synchronous: once a render starts, it cannot be interrupted. For large updates, this can cause dropped frames and unresponsive UIs. Concurrent rendering solves this by time-slicing and prioritization.

3.3 How It Works

· React works on a tree of fiber nodes.
· Work can be split into units and processed in small time slices.
· A scheduler assigns priorities.
· High-priority updates (e.g., typing) can interrupt low-priority renders (e.g., filtering a large list).
· React can discard incomplete work if new updates arrive.

3.4 Key Concepts

· Time Slicing: rendering work is split and executed over multiple frames.
· Prioritization: updates have different priorities.
· Interruptible Rendering: React can pause and resume.
· Suspense Integration: components can suspend without blocking.

3.5 Using Concurrent Features

· startTransition / useTransition: mark updates as non-urgent.
· useDeferredValue: defer a value to allow urgent updates to proceed.
· Suspense: coordinate loading states.

3.6 Benefits

· Keeps UI responsive during expensive updates.
· Enables smooth transitions and better perceived performance.
· Foundation for server components and streaming SSR.

3.7 Interview Questions

Q: What is concurrent rendering in React?
Answer: Concurrent rendering allows React to prepare multiple UI versions and interrupt rendering to prioritize urgent updates. It enables features like transitions, suspense, and time-slicing, resulting in more responsive applications.

Q: How does concurrent rendering improve user experience?
Answer: It ensures that high-priority updates (like typing) are handled immediately, while lower-priority updates (like filtering a list) can be processed in the background without blocking the UI.

---

4. Suspense (In-Depth for Modern React)

4.1 Definition

Suspense is a React component that manages loading states for asynchronous operations, such as lazy loading components, data fetching, or server components. It displays a fallback until the content is ready.

4.2 Suspense in React 18+

In React 18, Suspense can be used with any asynchronous data source that integrates with React's concurrent features, not just lazy loading. Libraries like React Query, Relay, and frameworks like Next.js provide Suspense-enabled data fetching.

4.3 Syntax

```jsx
<Suspense fallback={<LoadingSpinner />}>
  <AsyncComponent />
</Suspense>
```

4.4 How It Works

· When a child component "suspends" (throws a promise or uses a Suspense-enabled hook), React looks for the nearest Suspense boundary.
· React renders the fallback instead.
· When the promise resolves, React re-renders the suspended component.

4.5 Nested Suspense Boundaries

You can have multiple Suspense boundaries to provide granular loading states, avoiding a single global spinner.

4.6 Suspense with Data Fetching (React 18+)

```jsx
import { Suspense } from 'react';

function Profile() {
  const user = useUser(); // Suspense-enabled hook
  return <div>{user.name}</div>;
}

function App() {
  return (
    <Suspense fallback={<div>Loading profile...</div>}>
      <Profile />
    </Suspense>
  );
}
```

(Requires a Suspense-compatible data library.)

4.7 Interview Questions

Q: How does Suspense work in React 18?
Answer: Suspense catches promises thrown by suspended components, shows a fallback, and re-renders when the promise resolves. It can be used for code splitting and data fetching, improving loading state management.

Q: What are the benefits of using multiple Suspense boundaries?
Answer: They allow different parts of the UI to load independently, showing spinners only where needed, and enabling the rest of the page to be interactive sooner.

---

5. Transitions

5.1 Definition

A transition is a non-urgent state update that React can interrupt and defer if a more urgent update (like user input) occurs. Transitions are marked using startTransition API or the useTransition hook.

5.2 Why It Exists

To distinguish between urgent updates (typing, clicks) and non-urgent updates (filtering a large list). This allows React to keep the UI responsive while processing expensive updates in the background.

5.3 Using startTransition

```jsx
import { startTransition } from 'react';

function handleChange(e) {
  setInput(e.target.value);
  startTransition(() => {
    setFilteredList(filterItems(e.target.value));
  });
}
```

5.4 Using useTransition

useTransition returns a boolean isPending and a startTransition function:

```jsx
const [isPending, startTransition] = useTransition();

{isPending && <span>Updating...</span>}
```

5.5 When to Use Transitions

· Expensive filtering/sorting of large lists.
· Switching between views that are heavy to render.
· Any non-urgent update that can be delayed.

5.6 Important

Transitions work only with React 18+ and concurrent rendering enabled (createRoot).

5.7 Interview Questions

Q: What is a transition in React?
Answer: A transition is a non-urgent state update that React can defer or interrupt. It helps keep the UI responsive by allowing urgent updates to take priority.

Q: When would you use useTransition over startTransition?
Answer: Use useTransition when you need to know the pending state (isPending) to show a loading indicator. Use startTransition when you just need to mark an update as non-urgent without needing the pending flag.

---

6. useTransition

6.1 Definition

useTransition is a hook that returns a isPending boolean and a startTransition function. It is used to mark state updates as transitions (non-urgent) and to track whether a transition is in progress.

6.2 Syntax

```jsx
const [isPending, startTransition] = useTransition();
```

6.3 Usage

```jsx
function SearchList() {
  const [query, setQuery] = useState('');
  const [items, setItems] = useState(allItems);
  const [isPending, startTransition] = useTransition();

  const handleChange = (e) => {
    setQuery(e.target.value);
    startTransition(() => {
      setItems(filterItems(e.target.value));
    });
  };

  return (
    <div>
      <input value={query} onChange={handleChange} />
      {isPending && <p>Updating results...</p>}
      <List items={items} />
    </div>
  );
}
```

6.4 Key Points

· startTransition callback should be synchronous; async work won't be tracked.
· The state update inside startTransition is marked as low-priority.
· React may interrupt and re-start the transition if the input changes quickly.

6.5 Benefits

· Keeps input responsive.
· Provides a pending flag for UI feedback.
· Improves perceived performance.

6.6 Interview Questions

Q: What does useTransition return and how is it used?
Answer: It returns [isPending, startTransition]. Use startTransition to wrap non-urgent updates and isPending to show a loading indicator.

---

7. useDeferredValue

7.1 Definition

useDeferredValue returns a deferred version of a value that lags behind the original. It allows React to keep the UI responsive by rendering the deferred value in the background, while urgent updates are processed immediately.

7.2 Why It Exists

Similar to transitions but for values rather than state updates. It is useful when a value from a parent is used in an expensive child component; the child can use the deferred value to avoid blocking the parent.

7.3 Syntax

```jsx
const deferredValue = useDeferredValue(value);
```

7.4 Example

```jsx
function SearchResults({ query }) {
  const deferredQuery = useDeferredValue(query);
  const results = useMemo(() => expensiveFilter(deferredQuery), [deferredQuery]);
  return <List results={results} />;
}
```

Here, query updates immediately (input), but deferredQuery and results update in background, keeping input fast.

7.5 Difference from useTransition

· useTransition wraps the state update.
· useDeferredValue wraps a value; the update is not marked, but the deferred value lags.
· Use useDeferredValue when you can't control the state update (e.g., value from parent).

7.6 Interview Questions

Q: What is useDeferredValue and when would you use it?
Answer: useDeferredValue returns a deferred version of a value, allowing expensive computations based on that value to be deferred. Use it when a child component receives a frequently changing value from a parent and you want to keep the parent responsive.

---

8. Server Components

8.1 Definition

React Server Components (RSC) are a new type of component that runs only on the server, and their output is streamed to the client. They can access server-side resources directly (databases, filesystem) and reduce the amount of client-side JavaScript. They are integrated with frameworks like Next.js and Remix.

8.2 Why It Exists

To improve performance and developer experience by:

· Reducing client bundle size.
· Enabling direct server-side data access without API layers.
· Improving initial page load and SEO.
· Enabling streaming SSR.

8.3 How Server Components Work

· Server components are rendered on the server to a special format (RSC payload).
· The payload is streamed to the client.
· Client components can be interleaved, receiving the server-rendered output as props.
· Server components cannot use client-side hooks or event handlers; they are not hydrated.

8.4 Client vs Server Components

Server Components Client Components
Run on server Run in browser
Can access backend directly Cannot access backend directly
No client-side interactivity Fully interactive
Reduce bundle size Included in bundle
Can be async Must be sync (except with use)

8.5 When to Use Server Components

· Data fetching from server.
· Large dependencies that are not needed on client.
· SEO-critical content.

8.6 When Not to Use

· Components that need interactivity (buttons, forms) must be client components.
· Components that use state/effects should be client components.

8.7 Example (Next.js App Router)

```jsx
// Server Component
export default async function ProductList() {
  const products = await fetchProductsFromDB();
  return (
    <ul>
      {products.map(p => <ProductCard key={p.id} product={p} />)}
    </ul>
  );
}
```

8.8 Interview Questions

Q: What are React Server Components?
Answer: Server Components run only on the server, allowing direct access to backend resources and reducing client-side JavaScript. They are streamed to the client and cannot have interactivity; they are used with Client Components.

Q: What are the benefits of Server Components?
Answer: Smaller client bundles, improved initial load, better SEO, direct server-side data fetching, and reduced need for API layers.

---

9. Server Actions

9.1 Definition

Server Actions are functions that run on the server and can be called directly from client components. They are used for mutations (create, update, delete) without manually writing API endpoints. They integrate with forms and optimistic updates.

9.2 Why It Exists

To simplify full-stack data mutations, reducing boilerplate and enabling type-safe communication between client and server. Server Actions handle serialization, authentication, and error handling automatically.

9.3 How They Work

· Define an async function with 'use server' directive (or in a separate file).
· In a client component, you can invoke the Server Action directly (e.g., as a form action).
· React sends a request to the server, executes the action, and returns the result.

9.4 Example: Form Action

```jsx
// Server Action in a file with 'use server'
export async function createUser(formData: FormData) {
  'use server';
  const name = formData.get('name');
  // save to DB
}

// Client component using the action
import { createUser } from './actions';

function CreateUserForm() {
  return (
    <form action={createUser}>
      <input name="name" />
      <button type="submit">Create</button>
    </form>
  );
}
```

9.5 Use with useFormStatus and useOptimistic

· useFormStatus: provides pending state for form submission.
· useOptimistic: allows optimistic updates before server response.

9.6 Benefits

· Type-safe end-to-end.
· Simplified form handling.
· No need for separate API endpoints.
· Automatic error serialization.

9.7 Challenges

· Requires framework support (Next.js).
· Server Actions are asynchronous and can have latency; optimistic updates help.
· Error handling patterns still evolving.

9.8 Interview Questions

Q: What are Server Actions in React?
Answer: Server Actions are functions that run on the server and can be invoked from client components, typically used for form submissions and mutations. They simplify full-stack data handling and are type-safe.

Q: How do Server Actions improve developer experience?
Answer: They eliminate the need to write separate API routes for mutations, provide type safety, and integrate with forms and optimistic updates, reducing boilerplate.

---

10. Modern React Patterns

10.1 Definition

Modern React patterns are best practices and architectures that leverage concurrent features, hooks, composition, and server components to build scalable and maintainable applications. They move away from older patterns like HOCs and render props in favor of hooks and composition.

10.2 Key Patterns

· Hooks for logic reuse: custom hooks encapsulate stateful logic.
· Compound components with context: for reusable component APIs.
· Renderless components: components that only provide behavior via render props or hooks.
· State reducers with useReducer for complex state.
· Context + useReducer for global state.
· Server Components + Client Components separation.
· Suspense for data fetching and loading states.
· Transitions for non-urgent updates.
· Optimistic updates with useOptimistic (React 19).
· Controlled components with libraries like React Hook Form.

10.3 Why These Patterns Matter

They enable better performance, maintainability, and developer experience. They align with React's direction and community best practices.

10.4 Example: Custom hook for data fetching with Suspense

```jsx
import { useQuery } from '@tanstack/react-query';

function useUser(id) {
  return useQuery({ queryKey: ['user', id], queryFn: () => fetchUser(id) });
}
```

Then use with Suspense (React Query supports suspense).

10.5 Example: Compound component with hooks

Already covered in Advanced React, but still modern and widely used.

10.6 Best Practices

· Prefer hooks over HOCs/render props.
· Use composition over inheritance.
· Keep client components lean; push logic to server when possible.
· Use transitions for expensive updates.
· Use Suspense and error boundaries for async and loading states.

10.7 Interview Questions

Q: What are some modern React patterns you use in your projects?
Answer: I use custom hooks for logic reuse, compound components with context for UI libraries, useReducer for complex state, and Suspense with data-fetching libraries for loading states. With React 19, I'm exploring Server Components and Server Actions for full-stack apps.

Q: How do modern patterns differ from older patterns like HOCs?
Answer: Modern patterns favor hooks for logic sharing, composition over inheritance, and server components for data fetching. HOCs and render props are less common due to hooks' simplicity and better composition.

---

11. Real-World Scenario: Building a Full-Stack App with Server Components and Actions

Problem: Build a product catalog that fetches data from a database and allows admin users to add new products. Need fast initial load and simplified mutations.

Solution:

· Use Next.js App Router with React Server Components for product listing.
· Use Server Actions for adding products.
· Use client components for interactive elements (search input, add form).
· Use Suspense for loading states.
· Use optimistic updates with useOptimistic when adding product.

Architecture:

```mermaid
flowchart TD
    Client --> ServerComponents[Server Components fetch data]
    Client --> ClientComponents[Client Components interactive]
    ClientComponents --> ServerActions[Server Actions mutate data]
    ServerActions --> Database[(Database)]
    ServerComponents --> Database
    ServerComponents --> Stream[Stream to client]
```

Implementation Highlights:

· ProductList as server component fetching from DB.
· AddProductForm as client component using useFormStatus and Server Action.
· useOptimistic to show new product immediately.
· Suspense boundary around product list with loading skeleton.

---

12. Module 16 – Quick Revision

· React 18: concurrent rendering, automatic batching, transitions, new hooks.
· React 19: Server Components, Server Actions, form actions, useOptimistic, useFormStatus.
· Concurrent rendering: interruptible, prioritized updates.
· Suspense: fallback for async operations.
· Transitions: non-urgent updates with startTransition/useTransition.
· useDeferredValue: deferred version of a value.
· Server Components: run on server, reduce client JS.
· Server Actions: server functions callable from client.
· Modern patterns: hooks, compound components, composition, server/client separation.

---

13. Interview Questions – Module 16

Beginner

1. What is React 18?
      React 18 is a major release that introduces concurrent rendering, automatic batching, transitions, and improved Suspense.
2. What is Suspense used for?
      To show a fallback while loading asynchronous content, like lazy components or data.
3. What is a transition?
      A non-urgent state update that React can defer to keep the UI responsive.

Intermediate

1. Explain the difference between useTransition and useDeferredValue.
      useTransition marks a state update as non-urgent and provides isPending. useDeferredValue defers a value, allowing expensive computations based on it to be deferred.
2. What are Server Components?
      Components that run only on the server, reducing client bundle and enabling direct server data access.
3. How do Server Actions work?
      They are server functions invoked from the client, used for mutations. They simplify data handling and are type-safe.

Advanced

1. How does concurrent rendering improve performance?
      It allows React to split rendering work and prioritize urgent updates, preventing blocking of the main thread and keeping the UI responsive.
2. What are the benefits of using Suspense with data fetching compared to traditional useEffect fetching?
      Suspense enables declarative loading states, better coordination of multiple requests, and integration with concurrent rendering. It can avoid race conditions and simplify loading/error handling.
3. How would you design a component that uses Server Components and Client Components effectively?
      Use Server Components for data-heavy, non-interactive parts to reduce client JS. Use Client Components for interactive parts. Pass data from server to client via props (serializable). Use Server Actions for mutations.

Scenario-Based

Q: Your app has a large table that filters on every keystroke and becomes laggy. How would you optimize using modern React?
Answer: Use useTransition to mark the filtering update as non-urgent, or useDeferredValue to defer the filtered list. This allows the input to remain responsive while filtering happens in the background. Also, consider using virtualization and memoization.

Coding Questions

1. Write a component using useTransition to filter a list without blocking input.

```jsx
function FilterList() {
  const [query, setQuery] = useState('');
  const [filtered, setFiltered] = useState(items);
  const [isPending, startTransition] = useTransition();

  const handleChange = (e) => {
    setQuery(e.target.value);
    startTransition(() => {
      setFiltered(filterItems(e.target.value));
    });
  };

  return (
    <div>
      <input value={query} onChange={handleChange} />
      {isPending && <p>Updating...</p>}
      <List items={filtered} />
    </div>
  );
}
```

2. Show how to use useDeferredValue in a search component.

```jsx
function Search({ query }) {
  const deferredQuery = useDeferredValue(query);
  const results = useMemo(() => search(deferredQuery), [deferredQuery]);
  return <Results results={results} />;
}
```

---

14. Common Mistakes & Best Practices

Mistake Best Practice
Not using createRoot in React 18 Use createRoot to enable concurrent features
Marking all updates as transitions Only mark non-urgent updates
Overusing useDeferredValue Use only for expensive derived values
Using Server Components for interactive parts Keep interactive components as Client Components
Forgetting Suspense boundaries Provide fallback for lazy/async components
Ignoring automatic batching implications Ensure state updates are batched correctly
Not using useOptimistic for mutations Use optimistic updates to improve UX

---

15. Quick Setup for Modern React

Vite + React 18:

```bash
npm create vite@latest my-app -- --template react
```

Next.js (for Server Components/Actions):

```bash
npx create-next-app@latest
```

Key React 18/19 APIs:

· createRoot
· startTransition, useTransition, useDeferredValue
· Suspense
· useId
· Server Components (framework-dependent)

---

This concludes Module 16: Modern React. The next module is Module 17: Styling, covering CSS, CSS Modules, Styled Components, Tailwind CSS, responsive design, dark mode, and component libraries.



Module 17: Styling

Styling is a critical aspect of React application development. It determines how the UI looks, feels, and responds to different devices and user preferences. This module covers the various styling approaches available in React: plain CSS, CSS Modules, inline styles, CSS-in-JS libraries (Styled Components), utility-first CSS (Tailwind CSS), responsive design, dark mode, theme management, and component libraries. By the end, you will understand how to choose and implement the right styling solution for your project.

---

1. CSS

1.1 Definition

CSS (Cascading Style Sheets) is the standard language for describing the presentation of a document written in HTML. In React, you can use plain CSS files and import them into components. Styles are global by default, meaning class names and rules can affect any element in the application.

1.2 Why It Exists

CSS exists to separate content from presentation, allowing consistent styling across a website and easier maintenance. It has been the foundation of web styling since the early days of the web.

1.3 Purpose

· Style HTML elements (colors, fonts, layout, spacing).
· Create responsive layouts via media queries.
· Apply animations and transitions.
· Provide design consistency across the application.

1.4 Using CSS in React

You can import a CSS file in a component or at the entry point:

```jsx
import './App.css';

function App() {
  return <div className="container">Hello</div>;
}
```

```css
/* App.css */
.container {
  max-width: 1200px;
  margin: 0 auto;
}
```

1.5 Global vs Scoped

Plain CSS in React is global; any class can affect any component, which can lead to naming collisions. To mitigate, use naming conventions like BEM (Block Element Modifier).

1.6 Advantages

· Simple and familiar.
· No additional dependencies.
· Full control over styles.
· Works with all CSS features.

1.7 Disadvantages

· Global scope leads to potential conflicts.
· No built-in dynamic styling based on props/state.
· Can be harder to maintain in large apps.

1.8 Common Mistakes

· Using overly generic class names.
· Not following a naming convention.
· Forgetting to import CSS files.
· Writing inline styles instead of external CSS for static rules.

1.9 Best Practices

· Use a naming convention like BEM.
· Organize CSS files close to components.
· Prefer CSS custom properties (variables) for theming.
· Use modern CSS (flexbox, grid, variables).
· Avoid !important; manage specificity.

1.10 Interview Questions

Q: How do you include CSS in a React app?
Answer: Import the CSS file in the component or at the entry point, and use className attributes. The styles are applied globally.

Q: What are the drawbacks of using plain CSS in large React applications?
Answer: Global scope can cause naming collisions, styles are not scoped to components, and dynamic styling based on props/state requires additional logic (e.g., inline styles or class toggling).

---

2. CSS Modules

2.1 Definition

CSS Modules are a way to locally scope CSS class names and animation names. In a CSS Module, each class name is scoped to the component that imports it, preventing global conflicts. The build tool (Vite, Webpack) generates unique class names.

2.2 Why It Exists

To solve the global namespace problem of plain CSS while still allowing you to write standard CSS. It enables modular, component-scoped styling without the runtime overhead of CSS-in-JS.

2.3 Purpose

· Scope styles to a component.
· Avoid naming collisions.
· Support local CSS variables.
· Provide a clean way to compose styles.

2.4 Using CSS Modules

Create a file with .module.css extension:

```css
/* Button.module.css */
.button {
  background: blue;
  color: white;
}
.primary {
  background: green;
}
```

Import it in a component:

```jsx
import styles from './Button.module.css';

function Button({ primary }) {
  return (
    <button className={primary ? `${styles.button} ${styles.primary}` : styles.button}>
      Click
    </button>
  );
}
```

The class names are automatically scoped.

2.5 Composition

CSS Modules support composition:

```css
.base {
  padding: 10px;
}
.primary {
  composes: base;
  background: blue;
}
```

2.6 Dynamic Class Names

Use multiple classes or template literals.

2.7 Advantages

· Scoped styles, no global conflicts.
· Standard CSS syntax.
· No runtime overhead.
· Works with all CSS features.

2.8 Disadvantages

· Requires build tool configuration (Vite/Webpack have built-in support).
· Slightly more verbose than plain CSS.
· Still not as dynamic as CSS-in-JS for prop-based styling.

2.9 Best Practices

· Use .module.css extension.
· Keep one CSS Module per component.
· Use camelCase or kebab-case for class names (imported as object).
· Avoid overly nested selectors.

2.10 Interview Questions

Q: What are CSS Modules and how do they help?
Answer: CSS Modules scope class names to the importing component, preventing global collisions. They allow writing standard CSS with local scope, improving maintainability in large apps.

Q: How do you apply dynamic styles with CSS Modules?
Answer: You can conditionally join multiple classes or use inline styles for truly dynamic values. For theme-based changes, you can toggle classes based on props/state.

---

3. Inline Styling

3.1 Definition

Inline styling in React uses the style attribute, which accepts a JavaScript object with camelCase CSS properties. It applies styles directly to an element.

3.2 Why It Exists

To provide a quick way to apply dynamic styles based on component state or props without external CSS.

3.3 Purpose

· Apply dynamic styles.
· Override default styles.
· Prototype quickly.

3.4 Syntax

```jsx
const style = {
  backgroundColor: 'blue',
  fontSize: '16px',
  padding: '10px',
};

<div style={style}>Hello</div>
```

Or inline:

```jsx
<div style={{ color: isActive ? 'red' : 'black' }}>Text</div>
```

3.5 Advantages

· Simple and straightforward.
· No build configuration needed.
· Easy dynamic styling.
· Styles are scoped to the element.

3.6 Disadvantages

· Cannot use pseudo-classes, media queries, or keyframes.
· Inline styles have higher specificity, hard to override.
· Not reusable.
· Poor separation of concerns.
· Performance overhead for many elements (though negligible in most cases).

3.7 When to Use

· For truly dynamic values (e.g., position based on mouse).
· For one-off overrides.
· When you need to set a style from a variable that can't be in CSS.

3.8 Best Practices

· Use sparingly; prefer CSS Modules or CSS-in-JS for most styling.
· Extract complex style objects to variables.
· Do not use inline styles for layout or responsive design.

3.9 Interview Questions

Q: What are the limitations of inline styles in React?
Answer: Inline styles cannot use pseudo-classes, media queries, or keyframes. They also have high specificity, making them hard to override. For these reasons, they are best for small dynamic adjustments, not as the primary styling method.

Q: When would you use inline styles?
Answer: For dynamic values that change frequently (e.g., left/top positions for drag-and-drop), or for simple one-off styles where creating a CSS class is overkill.

---

4. Styled Components

4.1 Definition

Styled Components is a CSS-in-JS library that allows you to write actual CSS syntax within JavaScript template literals to style React components. It generates unique class names and injects styles into the DOM, providing scoped and dynamic styling.

4.2 Why It Exists

To solve the limitations of CSS and CSS Modules by providing a component-based styling approach with full JavaScript power. It enables dynamic styling based on props, theme support, and automatic critical CSS extraction.

4.3 Installation

```bash
npm install styled-components
```

4.4 Syntax

```jsx
import styled from 'styled-components';

const Button = styled.button`
  background: blue;
  color: white;
  padding: 10px 20px;
  border: none;
  border-radius: 4px;

  &:hover {
    background: darkblue;
  }

  ${(props) => props.primary && `
    background: green;
  `}
`;

function App() {
  return <Button primary>Click</Button>;
}
```

4.5 Features

· Props-based styling: function interpolation.
· Theming: via ThemeProvider.
· Server-side rendering: automatic style extraction.
· Nesting: support nested selectors.
· Global styles: createGlobalStyle.

4.6 Theming with Styled Components

```jsx
import { ThemeProvider } from 'styled-components';

const theme = {
  primary: 'blue',
  secondary: 'gray',
};

<ThemeProvider theme={theme}>
  <App />
</ThemeProvider>
```

In styled component:

```jsx
const Button = styled.button`
  background: ${(props) => props.theme.primary};
`;
```

4.7 Advantages

· Component-scoped styles.
· Full CSS support (pseudo-classes, media queries, etc.).
· Dynamic styling via props.
· Theming built-in.
· No class name collisions.
· Encourages reusable styled components.

4.8 Disadvantages

· Runtime overhead (styles generated in JS).
· Slightly larger bundle due to library.
· CSS is defined in JS, which some developers find less clean.
· Learning curve for those used to CSS files.

4.9 Best Practices

· Use semantic names for styled components.
· Keep styled components close to the component that uses them.
· Use theme for common values.
· Avoid overly complex dynamic styles; extract to functions if needed.
· Use shouldForwardProp to prevent unknown props from being passed to DOM.

4.10 Interview Questions

Q: What is Styled Components and why would you use it?
Answer: Styled Components is a CSS-in-JS library that allows writing scoped styles inside JavaScript template literals. It supports dynamic styling via props, theming, and server-side rendering. It's used to create reusable, component-scoped styles in React.

Q: How does Styled Components handle theming?
Answer: It provides a ThemeProvider component that passes a theme object down via context. Styled components access the theme via props.theme, enabling consistent theming and easy dark mode.

---

5. Tailwind CSS

5.1 Definition

Tailwind CSS is a utility-first CSS framework that provides low-level utility classes (e.g., flex, pt-4, text-center) to build custom designs without writing custom CSS. It is highly configurable and promotes consistency.

5.2 Why It Exists

To speed up UI development by composing utilities directly in markup, eliminating the need to switch between HTML and CSS files. It enforces a design system and reduces CSS maintenance.

5.3 Installation

```bash
npm install -D tailwindcss postcss autoprefixer
npx tailwindcss init -p
```

Configure content in tailwind.config.js, then include directives in CSS:

```css
@tailwind base;
@tailwind components;
@tailwind utilities;
```

5.4 Usage

```jsx
function Button() {
  return (
    <button className="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded">
      Click
    </button>
  );
}
```

5.5 Features

· Utility classes for every CSS property.
· Responsive variants (sm:, md:, lg:).
· Dark mode variants (dark:).
· Customizable via config file.
· JIT (Just-in-Time) compiler for development.
· Component extraction via @apply or framework components.

5.6 Advantages

· Very fast development.
· Consistent design system.
· Small production CSS (purged).
· No naming collisions.
· Responsive design built-in.
· Can be combined with component libraries.

5.7 Disadvantages

· Markup can become cluttered with many classes.
· Learning curve for class names.
· Not ideal for very complex dynamic styling.
· Requires build tool configuration.
· Some developers dislike mixing styles and markup.

5.8 Best Practices

· Use @apply for reusable component classes (or extract components).
· Use consistent spacing/sizing scale from config.
· Use clsx or template literals for conditional classes.
· Avoid excessive inline utility duplication; create components.
· Configure theme to match brand.

5.9 Tailwind vs Styled Components vs CSS Modules

Feature Tailwind Styled Components CSS Modules
Approach Utility-first CSS-in-JS Scoped CSS
Class names Predefined utilities Generated Scoped local
Dynamic styling Conditional classes Props-based Class composition
Learning curve Moderate Moderate Low
Runtime overhead None (compiled) Yes None
Design consistency High Medium Depends
Component reuse Via component extraction Via styled components Via CSS classes

5.10 Interview Questions

Q: What is Tailwind CSS and why is it popular?
Answer: Tailwind is a utility-first CSS framework providing low-level classes to build UIs quickly. It is popular because it speeds up development, enforces consistency, and generates small CSS bundles with purging.

Q: How do you handle dynamic styles with Tailwind?
Answer: By using conditional classes with template literals or utilities like clsx. For truly dynamic values (e.g., arbitrary values), you can use inline styles or Tailwind's arbitrary value syntax: w-[200px].

---

6. Responsive Design

6.1 Definition

Responsive design is an approach to web design that makes web pages render well on a variety of devices and window or screen sizes. It uses flexible grids, fluid images, and CSS media queries to adapt layout.

6.2 Why It Exists

To provide a good user experience across desktops, tablets, and mobile devices. With the diversity of devices, responsive design is essential.

6.3 Techniques

· Fluid grids: use percentages or fr units.
· Flexible images: max-width: 100%.
· Media queries: apply styles based on viewport width.
· Mobile-first design: design for small screens first, then add breakpoints.

6.4 CSS Media Queries

```css
.container {
  width: 100%;
}

@media (min-width: 768px) {
  .container {
    max-width: 720px;
    margin: 0 auto;
  }
}
```

6.5 Responsive in React

· Use CSS Modules or Tailwind's responsive variants.
· Use libraries like react-responsive for JS-based queries (but CSS is preferred).
· Design components to be responsive by default (flex, grid).

6.6 Tailwind Responsive Utilities

```jsx
<div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3">
  {items.map(item => <Card key={item.id} />)}
</div>
```

6.7 Best Practices

· Start with mobile-first.
· Use relative units (rem, %, vw/vh).
· Test on various devices and with browser dev tools.
· Avoid fixed widths/heights.
· Use srcset for responsive images.

6.8 Interview Questions

Q: How do you implement responsive design in React?
Answer: Use CSS media queries (in CSS Modules, plain CSS, or Tailwind responsive variants), use flexible layouts (flexbox/grid), and design components mobile-first. Tailwind's sm:, md:, lg: prefixes are convenient.

Q: What is mobile-first design?
Answer: Mobile-first means designing for mobile devices first and then enhancing for larger screens using media queries. It ensures a good mobile experience and avoids unnecessary overrides.

---

7. Dark Mode

7.1 Definition

Dark mode is a color scheme that uses light text and dark backgrounds to reduce eye strain and save battery on OLED screens. Implementing dark mode involves toggling a theme and applying appropriate colors.

7.2 Why It Exists

To improve user comfort and accessibility, and to provide a preference that many users expect. It is often triggered by system preference or user toggle.

7.3 Implementation Approaches

· CSS custom properties (variables): define color variables in :root and [data-theme='dark'].
· CSS Modules: override variables per theme.
· Styled Components ThemeProvider: switch theme object.
· Tailwind dark variant: dark: prefix with class strategy or media strategy.
· Context API: manage theme state and apply classes/variables.

7.4 Example with CSS Variables

```css
:root {
  --bg: white;
  --text: black;
}
[data-theme='dark'] {
  --bg: #121212;
  --text: #e0e0e0;
}
body {
  background: var(--bg);
  color: var(--text);
}
```

Toggle by setting document.documentElement.setAttribute('data-theme', 'dark').

7.5 Styled Components Dark Mode

```jsx
const darkTheme = { background: '#121212', text: '#e0e0e0' };
const lightTheme = { background: '#ffffff', text: '#000000' };

<ThemeProvider theme={isDark ? darkTheme : lightTheme}>
  <App />
</ThemeProvider>
```

7.6 Tailwind Dark Mode

In config:

```javascript
module.exports = {
  darkMode: 'class',
  // ...
};
```

Then use dark: classes:

```jsx
<div className="bg-white dark:bg-gray-900 text-black dark:text-white">
  Content
</div>
```

Toggle by adding/removing dark class on <html>.

7.7 Best Practices

· Respect prefers-color-scheme by default.
· Provide a manual toggle.
· Persist user choice (localStorage).
· Use CSS variables for easy theming.
· Ensure sufficient contrast in both themes.

7.8 Interview Questions

Q: How do you implement dark mode in React?
Answer: Use CSS custom properties or a CSS-in-JS theme provider to define theme colors, and toggle a class or attribute on the root element. For Tailwind, enable the darkMode: 'class' strategy and use dark: prefixes. Manage the theme state with Context API and persist the preference.

Q: What are the benefits of using CSS variables for dark mode?
Answer: CSS variables allow you to define color values once and change them via a single override, making theme switching easy and performant without re-rendering components.

---

8. Theme Management

8.1 Definition

Theme management involves creating and applying consistent visual themes across the application. It goes beyond dark mode to include multiple themes (light, dark, high contrast, brand themes) and managing design tokens (colors, typography, spacing).

8.2 Why It Exists

To ensure visual consistency and enable customization. It centralizes design decisions, making it easier to update and maintain the look and feel of an app.

8.3 Approaches

· CSS variables: define design tokens in :root and override per theme.
· ThemeProvider from styled-components or emotion: pass theme object via context.
· Tailwind config: extend theme with custom colors, spacing, etc.
· Context API + CSS variables: manage current theme and set variables.

8.4 Example: CSS Variables Theme

```css
:root {
  --color-primary: #3490dc;
  --color-secondary: #ffed4a;
  --font-family: 'Inter', sans-serif;
}

[data-theme='dark'] {
  --color-primary: #1c3d5a;
  --color-secondary: #f2d024;
}
```

8.5 Example: Styled Components Theme

```jsx
const theme = {
  primary: 'blue',
  spacing: (factor) => `${factor * 8}px`,
};

<ThemeProvider theme={theme}>
  <Button />
</ThemeProvider>
```

8.6 Best Practices

· Define design tokens (colors, spacing, typography) centrally.
· Use a theme object or CSS variables.
· Avoid hardcoding colors in components.
· Support multiple themes with easy switching.
· Persist theme choice.

8.7 Interview Questions

Q: How do you manage themes in a large React application?
Answer: I use design tokens stored as CSS variables or a theme object. With CSS variables, I can switch themes by toggling a data attribute on the root. With CSS-in-JS, I use a ThemeProvider. I also use Context API to manage the current theme and persist it.

Q: What is the advantage of design tokens?
Answer: Design tokens are the single source of truth for visual properties like colors and spacing. They ensure consistency, make theme changes easy, and can be shared across platforms.

---

9. Component Libraries

9.1 Definition

Component libraries are collections of pre-built, reusable UI components (buttons, inputs, modals, etc.) that follow a design system. They can be used in React to speed up development and ensure consistency. Examples: Material-UI (MUI), Ant Design, Chakra UI, Radix UI, shadcn/ui.

9.2 Why It Exists

To avoid reinventing the wheel and to provide accessible, well-tested components. They often include theming, dark mode, and responsive design out of the box.

9.3 Popular Libraries

· MUI (Material-UI): Google Material Design components.
· Ant Design: enterprise-level design language.
· Chakra UI: simple, modular, accessible, with great theming.
· Radix UI: headless, unstyled components for maximum customization.
· shadcn/ui: built on Radix, copy-paste components, Tailwind-based.
· Tailwind UI: paid component library for Tailwind.

9.4 Choosing a Library

Consider:

· Design requirements and customization.
· Accessibility.
· Bundle size.
· Theming and dark mode support.
· Community and maintenance.
· Learning curve.

9.5 Example: Using Chakra UI

```jsx
import { ChakraProvider, Button } from '@chakra-ui/react';

function App() {
  return (
    <ChakraProvider>
      <Button colorScheme="blue">Click</Button>
    </ChakraProvider>
  );
}
```

9.6 Advantages

· Faster development.
· Consistent design.
· Accessibility built-in.
· Theming and dark mode support.
· Well-tested.

9.7 Disadvantages

· Less design flexibility.
· Bundle size increase.
· Dependency on library's API and updates.
· May require customization to match brand.

9.8 Best Practices

· Choose a library that fits your design system.
· Use theming to customize colors and styles.
· Don't fight the library; embrace its patterns.
· Consider headless libraries for full control.
· Bundle only the components you use.

9.9 Interview Questions

Q: What are the pros and cons of using a component library?
Answer: Pros: faster development, consistent design, accessibility, theming. Cons: less flexibility, bundle size, dependency on library, potential over-engineering. The choice depends on project needs.

Q: How do you customize a component library to match your brand?
Answer: Most libraries provide a theme customization mechanism (e.g., MUI theme, Chakra theme). You can override colors, typography, and spacing. For headless libraries, you style components yourself using Tailwind or CSS.

---

10. Real-World Scenario: Building a Design System with Tailwind and ThemeProvider

Problem: A startup wants a consistent design system with light/dark mode, reusable components, and fast development. They choose Tailwind CSS and a component library approach.

Solution:

· Use Tailwind for utility classes and design tokens (extend config).
· Configure dark mode with class strategy.
· Create a ThemeContext to manage theme state and persist to localStorage.
· Build a few custom components using Tailwind and clsx for conditional classes.
· Possibly use shadcn/ui for complex components (modals, dropdowns) built on Radix + Tailwind.
· Implement dark mode by toggling a class on <html>.

Architecture:

```mermaid
flowchart TD
    App --> ThemeProvider
    ThemeProvider --> ThemeContext
    ThemeContext --> useTheme
    useTheme --> toggleTheme
    toggleTheme --> document.documentElement.classList.toggle('dark')
    App --> Component[Custom Component]
    Component --> TailwindClasses
```

Implementation Highlights:

· tailwind.config.js extended with brand colors, darkMode: 'class'.
· ThemeProvider component with useState and useEffect to sync with localStorage and system preference.
· Button component:

```jsx
import clsx from 'clsx';

function Button({ variant = 'primary', className, ...props }) {
  return (
    <button
      className={clsx(
        'px-4 py-2 rounded-md font-medium',
        variant === 'primary' && 'bg-blue-600 text-white hover:bg-blue-700',
        variant === 'secondary' && 'bg-gray-200 text-gray-900 hover:bg-gray-300',
        'dark:bg-gray-800 dark:text-white dark:hover:bg-gray-700',
        className
      )}
      {...props}
    />
  );
}
```

· Use clsx to conditionally apply classes.

---

11. Module 17 – Quick Revision

· Plain CSS: global, simple, but can have conflicts.
· CSS Modules: scoped, standard CSS, no runtime overhead.
· Inline styles: dynamic but limited (no pseudo/media).
· Styled Components: CSS-in-JS, prop-based, theming, runtime overhead.
· Tailwind CSS: utility-first, fast, design system, purged CSS.
· Responsive design: media queries, mobile-first, flex/grid.
· Dark mode: CSS variables or class toggling; respect system preference.
· Theme management: design tokens, CSS variables or ThemeProvider.
· Component libraries: accelerate development, consistent, but less flexibility.
· Choose based on project needs: team familiarity, performance, design requirements.

---

12. Interview Questions – Module 17

Beginner

1. What are the different ways to style React components?
      Plain CSS, CSS Modules, inline styles, Styled Components, Tailwind CSS, component libraries.
2. What is a CSS Module?
      A CSS file where class names are scoped locally to the component, preventing global collisions.
3. What is Tailwind CSS?
      A utility-first CSS framework providing low-level utility classes to build custom designs quickly.

Intermediate

1. Compare CSS Modules and Styled Components.
      CSS Modules are standard CSS with local scope, no runtime overhead, but less dynamic. Styled Components allow prop-based styling and theming but have runtime overhead and are JS-in-CSS.
2. How do you implement dark mode in a React app?
      Use CSS variables or a ThemeProvider to define theme colors, toggle a class or attribute on root, and persist the preference.
3. What is the advantage of using Tailwind over writing custom CSS?
      Tailwind speeds up development with pre-built utilities, ensures consistency, and generates small production CSS via purging. It reduces the need to write and maintain custom CSS.

Advanced

1. How would you design a theme system that supports multiple themes and is easy to extend?
      Use design tokens (CSS variables) for colors, spacing, typography. Define them in :root and override per theme with data attributes. Provide a ThemeContext to manage current theme. For component libraries, use their theming APIs.
2. What are the performance implications of CSS-in-JS vs utility-first CSS?
      CSS-in-JS (Styled Components) injects styles at runtime, adding JS execution overhead and potentially larger bundle. Utility-first CSS (Tailwind) compiles to a static CSS file with purged unused styles, resulting in no runtime overhead and smaller CSS.
3. How do you handle responsive design in a component library like Tailwind?
      Use Tailwind's responsive variants (sm:, md:, lg:) directly on utility classes. Design components mobile-first, and use grid/flex with responsive column counts.

Scenario-Based

Q: You are building a new app and need to choose a styling approach. The team is familiar with CSS and wants fast development without too much overhead. What would you recommend?
Answer: I would recommend using CSS Modules or Tailwind CSS. CSS Modules are simple and scoped, leveraging existing CSS knowledge. Tailwind speeds up development with utilities and has a strong ecosystem. For a team comfortable with CSS, CSS Modules might be easier to adopt, but Tailwind offers more consistency and speed once learned. I'd also consider using a component library like shadcn/ui on top of Tailwind for complex components.

Coding Questions

1. Write a Button component using Styled Components that accepts a primary prop and changes background accordingly.

```jsx
import styled from 'styled-components';

const Button = styled.button`
  background: ${(props) => (props.primary ? 'blue' : 'gray')};
  color: white;
  padding: 10px 20px;
  border: none;
  border-radius: 4px;
`;

export default Button;
```

2. Create a simple toggle for dark mode using React Context and CSS variables.

```jsx
const ThemeContext = createContext();

function ThemeProvider({ children }) {
  const [theme, setTheme] = useState('light');
  useEffect(() => {
    document.documentElement.setAttribute('data-theme', theme);
    localStorage.setItem('theme', theme);
  }, [theme]);
  return <ThemeContext.Provider value={{ theme, setTheme }}>{children}</ThemeContext.Provider>;
}
```

3. Using Tailwind, conditionally apply classes to a div based on isActive prop.

```jsx
<div className={`p-4 ${isActive ? 'bg-blue-500 text-white' : 'bg-gray-200 text-gray-800'}`}>
  Content
</div>
```

---

13. Common Mistakes & Best Practices

Mistake Best Practice
Using inline styles for complex styling Use CSS Modules, Tailwind, or CSS-in-JS
Overlooking responsiveness Design mobile-first and test across devices
Not using CSS variables for themes Centralize design tokens with CSS variables
Hardcoding colors in components Use theme variables or Tailwind config
Ignoring dark mode Implement dark mode with CSS variables or Tailwind dark variants
Choosing a heavy component library without need Consider bundle size; use headless libraries if customization needed
Forgetting to purge Tailwind CSS in production Ensure content paths configured to purge unused styles
Using ambiguous class names Follow BEM or use CSS Modules for scoping

---

14. Styling Mini Project: Build a Themed Button with Multiple Variants

Requirements:

· Create a reusable Button component with variants: primary, secondary, danger.
· Support dark mode.
· Use either Styled Components or Tailwind (choose one).
· Provide a theme toggle.

Implementation with Tailwind:

· Configure dark mode.
· Button component using clsx.
· Theme context toggling dark class on <html>.

Implementation with Styled Components:

· Define a styled Button with variant logic.
· Use ThemeProvider with light/dark themes.
· Toggle theme object.

This project reinforces theming, conditional styling, and component reuse.

---

This concludes Module 17: Styling. The next module is Module 18: React Architecture, covering folder structure, component reusability, API/service layers, custom hooks layers, and more.



Module 18: React Architecture

React architecture refers to the high-level structure and organization of a React application. It encompasses how components are organized, how data flows, how state is managed, and how the codebase is divided into layers (API, services, hooks, utilities, etc.). A well-designed architecture ensures scalability, maintainability, testability, and team collaboration. This module explores component-based and feature-based architectures, folder structure, layer separation, and best practices for building production-grade React applications.

---

1. Component-Based Architecture

1.1 Definition

Component-Based Architecture is a design pattern where the UI is built from small, independent, reusable components. Each component encapsulates its own structure, styles, and behavior, and can be composed to form complex interfaces. This is the fundamental architecture of React.

1.2 Why It Exists

React is built on components. Component-based architecture promotes reusability, separation of concerns, and maintainability. It allows teams to work on isolated pieces, test them independently, and compose them flexibly.

1.3 Purpose

· Break down UI into manageable pieces.
· Promote code reuse.
· Isolate changes and reduce regressions.
· Enable parallel development.
· Improve readability and maintainability.

1.4 Key Principles

· Single Responsibility: each component should do one thing.
· Reusability: components should be generic and configurable via props.
· Composition: prefer composition over inheritance.
· Isolation: components should not depend on global state (unless via context/hooks).
· Declarative: describe what UI should look like, not how to mutate DOM.

1.5 Component Hierarchy

Typical hierarchy:

```
App
├── Layout
│   ├── Header
│   ├── Sidebar
│   └── Content
│       ├── Dashboard
│       └── Profile
└── Footer
```

1.6 Example

```jsx
function App() {
  return (
    <Layout>
      <Header />
      <Sidebar />
      <Content>
        <Dashboard />
      </Content>
      <Footer />
    </Layout>
  );
}
```

1.7 Advantages

· Reusability across app.
· Easier testing and debugging.
· Clear separation of concerns.
· Scalable for large teams.

1.8 Disadvantages

· Over-fragmentation can lead to many small components.
· Prop drilling if not using context/state management.
· Need clear conventions to avoid chaos.

1.9 Interview Question

Q: What is component-based architecture and why is it important?
Answer: It's a design approach where UIs are built from independent, reusable components. It promotes separation of concerns, reusability, and maintainability. In React, everything is a component, enabling declarative and composable UI development.

---

2. Feature-Based Architecture

2.1 Definition

Feature-based architecture organizes code around features or business domains rather than technical layers (components, hooks, services). Each feature folder contains all the components, hooks, services, and styles related to that feature. This is an extension of component-based architecture for larger applications.

2.2 Why It Exists

As applications grow, organizing purely by technical type (components/, hooks/, services/) makes it hard to find and modify related code. Feature-based architecture groups by domain, improving cohesion and discoverability.

2.3 Purpose

· Keep related code together.
· Simplify navigation and maintenance.
· Enable feature teams to work independently.
· Reduce cross-feature coupling.

2.4 Structure Example

```
src/
├── features/
│   ├── auth/
│   │   ├── components/
│   │   │   ├── LoginForm.jsx
│   │   │   └── RegisterForm.jsx
│   │   ├── hooks/
│   │   │   └── useAuth.js
│   │   ├── services/
│   │   │   └── authService.js
│   │   ├── authSlice.js
│   │   └── index.js
│   ├── products/
│   │   ├── components/
│   │   ├── hooks/
│   │   ├── services/
│   │   ├── productsSlice.js
│   │   └── index.js
│   └── cart/
│       └── ...
├── shared/           # shared components, hooks, utils
├── app/              # app-wide setup (store, router)
└── main.jsx
```

2.5 When to Use Feature-Based

· Medium to large applications.
· Multiple teams working on different features.
· When codebase is difficult to navigate with layer-based structure.

2.6 Best Practices

· Keep features self-contained.
· Provide an index.js per feature to export public API.
· Share common code via shared/ folder.
· Do not import from other feature's internal files; use public API only.

2.7 Interview Question

Q: What is feature-based architecture and when would you use it?
Answer: Feature-based architecture organizes code by business features rather than technical layers. Each feature folder contains its own components, hooks, services, and state. It's useful for large apps with multiple teams, as it improves cohesion and maintainability.

---

3. Folder Structure

3.1 Definition

Folder structure is the organization of directories and files in a project. It defines where components, hooks, services, utilities, assets, and configurations live. A clear structure is essential for maintainability and collaboration.

3.2 Why It Exists

To provide a consistent, logical place for every piece of code, making it easy to find, understand, and modify. It also helps new developers onboard quickly.

3.3 Common Patterns

· Layer-based: components/, hooks/, services/, utils/, store/, etc.
· Feature-based: features/, shared/, app/.
· Hybrid: feature folders inside, with shared components in a common folder.

3.4 Example of a Well-Organized Structure (Feature-Based)

```
src/
├── app/                # App-level setup: store, router, providers
│   ├── store.js
│   ├── router.jsx
│   └── App.jsx
├── features/
│   ├── auth/
│   ├── dashboard/
│   └── settings/
├── shared/
│   ├── components/
│   │   ├── Button/
│   │   ├── Input/
│   │   └── Modal/
│   ├── hooks/
│   │   ├── useLocalStorage.js
│   │   └── useDebounce.js
│   ├── utils/
│   │   ├── formatDate.js
│   │   └── constants.js
│   └── styles/
├── services/          # API client and service functions (if not feature-specific)
├── types/             # TypeScript types/interfaces
├── assets/            # images, fonts
└── main.jsx
```

3.5 Best Practices

· Keep structure consistent.
· Avoid too many nested levels (max 4-5).
· Group by feature for large apps; by layer for small apps.
· Use index files for exports.
· Separate configuration files at root.
· Keep components close to where they are used (feature-specific) or in shared/ if reusable.

3.6 Interview Question

Q: How do you structure a React project for scalability?
Answer: I use a feature-based structure, with each feature folder containing its own components, hooks, services, and state. Shared code goes into a shared/ folder. App-level setup (store, router) is in an app/ folder. This scales well and keeps related code together.

---

4. Component Reusability

4.1 Definition

Component reusability is the degree to which a component can be used in multiple contexts with minimal modification. Reusable components are generic, configurable via props, and isolated from specific business logic.

4.2 Why It Exists

To reduce duplication, speed up development, and maintain consistency. Reusable components are the building blocks of a design system.

4.3 Characteristics of Reusable Components

· Generic: not tied to a specific use case.
· Configurable: accept props for variations.
· Composable: can be combined with other components.
· Pure: no side effects; rendering depends only on props.
· Accessible: works with keyboard/screen readers.
· Documented: clear API.

4.4 Example: Button component

```jsx
function Button({ variant = 'primary', size = 'md', disabled, onClick, children, ...rest }) {
  return (
    <button
      className={`btn btn-${variant} btn-${size}`}
      disabled={disabled}
      onClick={onClick}
      {...rest}
    >
      {children}
    </button>
  );
}
```

4.5 Reusability vs Specificity

· Too generic: hard to use, many props.
· Too specific: not reusable.
· Aim for a balance: common variants and sensible defaults.

4.6 Best Practices

· Use clear prop names.
· Provide default values.
· Handle edge cases (disabled, loading).
· Keep component API small.
· Use composition (children, render props) when needed.
· Document with PropTypes or TypeScript.

4.7 Interview Question

Q: How do you make a component reusable?
Answer: By making it generic and configurable via props, keeping it isolated from business logic, providing sensible defaults, and ensuring it is composable. Also, document its API and ensure accessibility.

---

5. Shared Components

5.1 Definition

Shared components are reusable components that are used across multiple features or parts of the application. They are typically placed in a shared/ or components/ folder. Examples: buttons, inputs, cards, modals, navigation bars.

5.2 Why It Exists

To avoid duplication and ensure consistency across the app. Shared components form the basis of a design system.

5.3 Managing Shared Components

· Keep them in a dedicated folder.
· Use index files for exports.
· Version or document them.
· Consider using a UI library or design system.
· Test them thoroughly.

5.4 Example Structure

```
shared/
└── components/
    ├── Button/
    │   ├── Button.jsx
    │   ├── Button.test.jsx
    │   └── index.js
    ├── Input/
    │   ├── Input.jsx
    │   └── index.js
    └── Modal/
        ├── Modal.jsx
        └── index.js
```

5.5 Benefits

· Consistency in UI.
· Faster development (reuse).
· Easier maintenance (update once).

5.6 Challenges

· Keeping them generic enough.
· Avoiding breaking changes.
· Over-coupling to specific features.

5.7 Best Practices

· Use a design system or component library if possible.
· Keep shared components small and focused.
· Use TypeScript to define prop types.
· Write tests for shared components.

5.8 Interview Question

Q: How do you decide whether a component should be shared or feature-specific?
Answer: If a component is used in multiple features or is generic enough to be used elsewhere, put it in a shared folder. If it is specific to one feature and unlikely to be reused, keep it within that feature. The decision balances reusability and simplicity.

---

6. API Layer

6.1 Definition

The API layer is the part of the application responsible for all communication with backend services. It encapsulates HTTP requests, endpoint definitions, and data transformation. Typically implemented using Axios or Fetch, possibly with interceptors for authentication and error handling.

6.2 Why It Exists

To separate network concerns from UI logic. Components should not directly call APIs; they should use service functions from the API layer. This centralization simplifies maintenance, testing, and modification of endpoints.

6.3 Structure of an API Layer

· HTTP client instance: Axios instance with base URL, interceptors.
· Service functions: functions that perform specific API calls (e.g., getUser, createUser).
· Types/Interfaces: TypeScript types for request/response.
· Error handling: centralized error normalization.

6.4 Example: Axios instance with interceptors

```javascript
// services/api.js
import axios from 'axios';

const api = axios.create({
  baseURL: import.meta.env.VITE_API_URL,
  timeout: 10000,
});

api.interceptors.request.use((config) => {
  const token = localStorage.getItem('accessToken');
  if (token) config.headers.Authorization = `Bearer ${token}`;
  return config;
});

api.interceptors.response.use(
  (response) => response,
  async (error) => {
    // handle refresh, logout, etc.
    return Promise.reject(error);
  }
);

export default api;
```

6.5 Service Functions

```javascript
// services/userService.js
import api from './api';

export const getUsers = () => api.get('/users');
export const getUserById = (id) => api.get(`/users/${id}`);
export const createUser = (data) => api.post('/users', data);
export const updateUser = (id, data) => api.put(`/users/${id}`, data);
export const deleteUser = (id) => api.delete(`/users/${id}`);
```

6.6 Benefits

· Centralized base URL and headers.
· Easy to mock for testing.
· Consistent error handling.
· Components stay clean.

6.7 Best Practices

· Use a single API client instance.
· Organize services by domain.
· Use environment variables for base URL.
· Handle token refresh in interceptors.
· Keep service functions pure (only HTTP calls).

6.8 Interview Question

Q: What is an API layer and why is it beneficial?
Answer: The API layer is a centralized set of modules that handle HTTP communication with backend services. It abstracts away the details of making requests, manages authentication headers, and provides service functions. It improves maintainability, testability, and separation of concerns.

---

7. Service Layer

7.1 Definition

The service layer is a set of functions that encapsulate business logic and data operations, often calling the API layer. It may also handle data transformation, validation, and coordination between different API calls. In some architectures, the service layer is the same as the API layer; in others, it sits above it, containing more complex business logic.

7.2 Why It Exists

To separate business logic from components and API details. It provides a clear API for components to interact with, and centralizes complex operations (e.g., checkout process, user registration with multiple steps).

7.3 Difference from API Layer

· API layer: low-level HTTP calls.
· Service layer: higher-level business logic, may combine multiple API calls, transform data, apply rules.

7.4 Example: Authentication Service

```javascript
// services/authService.js
import api from './api';

export const login = async (credentials) => {
  const response = await api.post('/auth/login', credentials);
  const { accessToken, refreshToken, user } = response.data;
  localStorage.setItem('accessToken', accessToken);
  localStorage.setItem('refreshToken', refreshToken);
  return user;
};

export const register = async (userData) => {
  const response = await api.post('/auth/register', userData);
  return response.data;
};

export const logout = async () => {
  await api.post('/auth/logout');
  localStorage.removeItem('accessToken');
  localStorage.removeItem('refreshToken');
};
```

7.5 Benefits

· Components remain simple and declarative.
· Business logic is testable in isolation.
· Easier to modify logic without affecting UI.
· Can be reused across components.

7.6 Best Practices

· Keep service functions focused.
· Return data, not HTTP responses.
· Handle errors consistently.
· Use TypeScript for parameter/return types.
· Avoid side effects in service layer unless necessary (e.g., storing token).

7.7 Interview Question

Q: What is the difference between an API layer and a service layer?
Answer: The API layer handles low-level HTTP requests and responses. The service layer contains business logic, orchestrates multiple API calls, transforms data, and provides higher-level functions for components. The service layer often uses the API layer.

---

8. State Layer

8.1 Definition

The state layer manages application state, including global state (user, theme, cart), server state (cached API data), and derived state. It is typically implemented using Redux, Context API, Zustand, or similar libraries. The state layer provides a single source of truth and predictable state updates.

8.2 Why It Exists

To separate state management from UI components, making state changes predictable, testable, and maintainable. It prevents prop drilling and scattered state updates.

8.3 Components of State Layer

· Store: central state container.
· Reducers/Slices: state update logic.
· Actions: events that trigger updates.
· Selectors: functions to read state.
· Middleware: side effects (async, logging).

8.4 Redux Toolkit Example

```javascript
// store/cartSlice.js
import { createSlice } from '@reduxjs/toolkit';

const cartSlice = createSlice({
  name: 'cart',
  initialState: { items: [], total: 0 },
  reducers: {
    addItem: (state, action) => {
      state.items.push(action.payload);
      state.total += action.payload.price;
    },
    removeItem: (state, action) => {
      const item = state.items.find(i => i.id === action.payload);
      if (item) {
        state.items = state.items.filter(i => i.id !== action.payload);
        state.total -= item.price;
      }
    },
    clearCart: (state) => {
      state.items = [];
      state.total = 0;
    },
  },
});

export const { addItem, removeItem, clearCart } = cartSlice.actions;
export default cartSlice.reducer;
```

8.5 Server State with RTK Query

RTK Query handles server state with caching, invalidation, and hooks. It is part of the state layer for server data.

8.6 Best Practices

· Keep state normalized where possible.
· Avoid storing derived data; compute via selectors.
· Use middleware for side effects.
· Separate client state and server state.
· Use Redux DevTools for debugging.

8.7 Interview Question

Q: How do you organize the state layer in a React app?
Answer: I use Redux Toolkit for client state, with slices for each domain. For server state, I use RTK Query or React Query to manage API caching and data fetching. The state layer is isolated from components via hooks and selectors.

---

9. Custom Hooks Layer

9.1 Definition

The custom hooks layer is a collection of reusable hooks that encapsulate stateful logic and side effects. Custom hooks allow sharing logic across components without duplication. They are the modern replacement for HOCs and render props.

9.2 Why It Exists

To promote code reuse, reduce complexity, and keep components focused on rendering. Custom hooks abstract common patterns like data fetching, local storage, debouncing, and authentication.

9.3 Common Custom Hooks

· useLocalStorage
· useDebounce
· useFetch
· useAuth
· useTheme
· useWindowSize
· usePrevious
· useOnClickOutside

9.4 Example: useLocalStorage

```javascript
import { useState, useEffect } from 'react';

function useLocalStorage(key, initialValue) {
  const [storedValue, setStoredValue] = useState(() => {
    try {
      const item = window.localStorage.getItem(key);
      return item ? JSON.parse(item) : initialValue;
    } catch {
      return initialValue;
    }
  });

  useEffect(() => {
    window.localStorage.setItem(key, JSON.stringify(storedValue));
  }, [key, storedValue]);

  return [storedValue, setStoredValue];
}
```

9.5 Organizing Custom Hooks

· Place shared hooks in shared/hooks/.
· Feature-specific hooks inside features/featureName/hooks/.
· Export from an index file.

9.6 Best Practices

· Name hooks with use prefix.
· Follow rules of hooks.
· Keep hooks small and focused.
· Return a consistent API (e.g., object or tuple).
· Document parameters and return values.

9.7 Interview Question

Q: What is a custom hook and when would you create one?
Answer: A custom hook is a function that starts with use and encapsulates logic using built-in hooks. It allows sharing stateful logic between components, reducing duplication. I create custom hooks for repeated patterns like data fetching, localStorage, and debouncing.

---

10. Utility Layer

10.1 Definition

The utility layer consists of pure functions that perform common tasks not tied to React or components. Examples: date formatting, number formatting, validation, string manipulation, array helpers, and constants. Utilities are often placed in a utils/ folder.

10.2 Why It Exists

To avoid code duplication and keep components clean. Pure utility functions are easy to test and reuse across the app.

10.3 Examples

```javascript
// utils/formatDate.js
export function formatDate(date, format = 'YYYY-MM-DD') {
  // implementation
}

// utils/validateEmail.js
export function validateEmail(email) {
  const re = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  return re.test(email);
}

// utils/cn.js (class names)
import { clsx } from 'clsx';
import { twMerge } from 'tailwind-merge';

export function cn(...inputs) {
  return twMerge(clsx(inputs));
}
```

10.4 Best Practices

· Pure functions: no side effects.
· Small, focused, well-named.
· Export from index file.
· Write unit tests.
· Avoid React-specific code in utils.

10.5 Interview Question

Q: What goes into a utility layer?
Answer: Pure, reusable functions that perform common tasks like date formatting, validation, string manipulation, and array helpers. They are independent of React and easily testable, placed in a utils/ folder.

---

11. Constants

11.1 Definition

Constants are values that are fixed and used throughout the application, such as API endpoints, status codes, theme values, role names, or configuration. They are defined in a central file or module to avoid magic strings and numbers.

11.2 Why It Exists

To improve maintainability, reduce typos, and make changes easier. Constants provide a single source of truth for fixed values.

11.3 Example

```javascript
// constants/api.js
export const API_BASE_URL = import.meta.env.VITE_API_URL;
export const API_ENDPOINTS = {
  LOGIN: '/auth/login',
  REGISTER: '/auth/register',
  USERS: '/users',
};

// constants/roles.js
export const ROLES = {
  ADMIN: 'admin',
  USER: 'user',
  GUEST: 'guest',
};
```

11.4 Organizing Constants

· Group by domain (api, roles, theme, etc.).
· Use const with uppercase names.
· Export as objects or individual constants.
· Place in constants/ folder.

11.5 Best Practices

· Avoid magic strings/numbers in code.
· Use enums or string constants for statuses/roles.
· Document the meaning.
· Use Object.freeze if immutability is critical (though ES modules are already frozen).

11.6 Interview Question

Q: Why should constants be centralized?
Answer: To avoid duplication, ensure consistency, and simplify changes. If a value like an API endpoint changes, you only need to update it in one place. It also prevents typos and makes the code more readable.

---

12. Configuration

12.1 Definition

Configuration refers to application settings that can vary between environments (development, testing, production). These settings are typically stored in environment variables or configuration files. In React, configuration is usually handled via .env files and build-time environment variables.

12.2 Why It Exists

To separate environment-specific values from code, allowing the same codebase to run in different environments without changes. Examples: API base URL, feature flags, analytics keys.

12.3 Environment Variables in React

· Vite: import.meta.env.VITE_*
· CRA: process.env.REACT_APP_*

Create .env.development, .env.production, .env.local.

12.4 Accessing Configuration

```javascript
const apiUrl = import.meta.env.VITE_API_URL;
```

12.5 Configuration Files

Some apps use a config/ folder with JS objects that merge environment variables and defaults:

```javascript
// config/index.js
export const config = {
  apiBaseUrl: import.meta.env.VITE_API_URL || 'http://localhost:3000',
  enableAnalytics: import.meta.env.VITE_ENABLE_ANALYTICS === 'true',
  appName: 'My App',
};
```

12.6 Best Practices

· Never commit secrets.
· Use .env.example to document required variables.
· Prefix with VITE_ or REACT_APP_ as appropriate.
· Validate required environment variables at startup.
· Use a config module to centralize access.

12.7 Interview Question

Q: How do you manage configuration in a React app?
Answer: I use environment variables defined in .env files, accessed via import.meta.env (Vite) or process.env (CRA). I centralize access in a config module to provide defaults and validation. I never commit secrets.

---

13. Environment Management

13.1 Definition

Environment management involves setting up and using different environments (development, staging, production) with their own configurations, API endpoints, and feature flags. It ensures that the application behaves correctly in each environment without code changes.

13.2 Why It Exists

To isolate environments, prevent accidental data leaks, and enable testing in realistic conditions before production. It supports the deployment pipeline.

13.3 Implementation

· Use .env.development, .env.production, .env.staging.
· Build scripts in package.json to use appropriate env files.
· Use CI/CD to inject environment variables.

Example in Vite:

```json
"scripts": {
  "build:dev": "vite build --mode development",
  "build:prod": "vite build --mode production"
}
```

.env.development:

```
VITE_API_URL=http://localhost:3000/api
VITE_ENABLE_LOGS=true
```

.env.production:

```
VITE_API_URL=https://api.example.com
VITE_ENABLE_LOGS=false
```

13.4 Environment-Specific Settings

· API base URL
· Feature flags (e.g., enable new feature)
· Analytics IDs
· Debugging/logging level
· Authentication endpoints

13.5 Best Practices

· Use a consistent naming convention.
· Keep .env files out of version control (except .env.example).
· In CI/CD, inject production variables securely.
· Validate required variables.
· Avoid hardcoding environment-specific logic in code; use config.

13.6 Interview Question

Q: How do you handle different environments in React?
Answer: Use environment variables with different .env files for each environment (development, staging, production). Access them via import.meta.env or process.env, and centralize in a config module. In CI/CD, inject environment-specific variables during build.

---

14. Real-World Scenario: Designing a Scalable Architecture for an E-Commerce App

Problem: Build an e-commerce app with features: product listing, search, cart, checkout, user authentication, admin dashboard. The app will grow and be maintained by multiple teams.

Solution: Use a feature-based architecture with clear layer separation.

Folder Structure:

```
src/
├── app/
│   ├── store.js
│   ├── router.jsx
│   └── App.jsx
├── features/
│   ├── auth/
│   │   ├── components/
│   │   ├── hooks/
│   │   ├── services/
│   │   └── authSlice.js
│   ├── products/
│   │   ├── components/
│   │   ├── hooks/
│   │   ├── services/
│   │   └── productsSlice.js
│   ├── cart/
│   │   ├── components/
│   │   ├── hooks/
│   │   ├── services/
│   │   └── cartSlice.js
│   └── admin/
│       ├── components/
│       ├── hooks/
│       └── services/
├── shared/
│   ├── components/
│   ├── hooks/
│   ├── utils/
│   └── constants/
├── services/
│   ├── api.js
│   └── interceptors.js
├── types/
└── main.jsx
```

Layers:

· API Layer: Axios instance with interceptors for auth token and refresh.
· Service Layer: Feature-specific services using API instance.
· State Layer: Redux slices per feature; RTK Query for server state.
· Custom Hooks Layer: Encapsulate feature logic (e.g., useProducts, useCart).
· Utility Layer: Formatting, validation, helpers.
· Constants: API endpoints, roles, statuses.
· Configuration: Environment variables.

Data Flow:

```mermaid
flowchart LR
    Component --> CustomHook
    CustomHook --> ServiceLayer
    ServiceLayer --> APILayer
    APILayer --> Backend
    Component --> StateLayer
    StateLayer --> ServiceLayer
```

Benefits:

· Feature teams can work independently.
· Shared components ensure UI consistency.
· Clear separation of concerns.
· Easy to test and maintain.

---

15. Module 18 – Quick Revision

· Component-based architecture: build from reusable components.
· Feature-based architecture: organize by business feature for large apps.
· Folder structure: choose layer-based, feature-based, or hybrid.
· Reusability: keep components generic and configurable.
· Shared components: common UI elements in shared/.
· API layer: centralized HTTP client and endpoints.
· Service layer: business logic, orchestrates API calls.
· State layer: Redux/Context for client state, RTK Query for server.
· Custom hooks layer: reuse stateful logic.
· Utility layer: pure functions for common tasks.
· Constants: centralize fixed values.
· Configuration: environment variables and config module.
· Environment management: separate .env files per environment.

---

16. Interview Questions – Module 18

Beginner

1. What is component-based architecture?
      Building UIs from small, reusable components that encapsulate structure and behavior.
2. What is a feature-based folder structure?
      Organizing code by business features, with each feature containing its own components, hooks, services, and state.
3. Why should API calls be centralized?
      To avoid duplication, manage authentication consistently, and make it easier to change endpoints.

Intermediate

1. Explain the difference between API layer and service layer.
      API layer handles low-level HTTP; service layer contains business logic and orchestrates API calls.
2. How do you decide between a feature-based and layer-based structure?
      Feature-based for large apps with multiple teams; layer-based for small apps or when shared code dominates.
3. What is the role of custom hooks in architecture?
      They encapsulate reusable stateful logic, keeping components focused on rendering and promoting code reuse.

Advanced

1. How would you design a scalable state layer for a large app?
      Use Redux Toolkit for client state with slices per feature, RTK Query for server state, and selectors for derived data. Normalize state and use middleware for side effects.
2. What are the benefits of using environment variables for configuration?
      They separate environment-specific settings from code, enable different configurations for dev/staging/prod, and keep secrets out of the codebase.
3. How do you prevent cross-feature coupling in a feature-based architecture?
      Each feature exposes a public API (index.js), and other features should only import from that, not from internal files. Shared code goes into shared/. This reduces coupling.

Scenario-Based

Q: Your app has grown and the layer-based structure is becoming messy. How would you refactor?
Answer: I would gradually migrate to a feature-based structure by grouping related components, hooks, services, and state into feature folders. I'd start with one feature at a time, extracting shared code into a shared/ folder. I'd also set up clear import rules to avoid coupling.

Coding Questions

1. Write a custom hook useDebounce that debounces a value.

```jsx
import { useState, useEffect } from 'react';

function useDebounce(value, delay) {
  const [debouncedValue, setDebouncedValue] = useState(value);
  useEffect(() => {
    const handler = setTimeout(() => setDebouncedValue(value), delay);
    return () => clearTimeout(handler);
  }, [value, delay]);
  return debouncedValue;
}
```

2. Create an Axios instance with a request interceptor that adds a JWT token from localStorage.

```javascript
import axios from 'axios';

const api = axios.create({ baseURL: import.meta.env.VITE_API_URL });

api.interceptors.request.use(config => {
  const token = localStorage.getItem('accessToken');
  if (token) config.headers.Authorization = `Bearer ${token}`;
  return config;
});

export default api;
```

---

17. Common Mistakes & Best Practices

Mistake Best Practice
Mixing concerns in components Separate API, service, state, and UI layers
Scattering API calls in components Use service functions
Duplicating utility functions Centralize in utils/
Hardcoding environment-specific values Use environment variables
Overly nested folder structures Keep depth to 4-5 levels
Importing from other feature internals Use feature public API (index.js)
Not centralizing constants Use constants files
Ignoring reusability for shared components Design components to be generic
Neglecting code splitting by feature Use React.lazy for feature routes

---

18. Real-World Architecture Example (Visual)

Below is a typical feature-based architecture diagram:

```mermaid
flowchart TD
    App --> Router
    App --> AuthProvider
    App --> ThemeProvider
    Router --> FeatureA[Feature A]
    Router --> FeatureB[Feature B]
    FeatureA --> ComponentsA[Components]
    FeatureA --> HooksA[Custom Hooks]
    FeatureA --> ServiceA[Services]
    FeatureA --> StateA[State/Slice]
    FeatureB --> ComponentsB
    FeatureB --> HooksB
    FeatureB --> ServiceB
    FeatureB --> StateB
    ComponentsA --> SharedComponents[Shared Components]
    HooksA --> SharedHooks[Shared Hooks]
    ServiceA --> APILayer[API Layer]
    ServiceB --> APILayer
    APILayer --> Backend[Backend]
    StateA --> Store[Redux Store]
    StateB --> Store
```

This modular structure isolates features while sharing common infrastructure.

---

This concludes Module 18: React Architecture. The next module is Module 19: React Security, covering XSS, CSRF, JWT security, token storage, CORS, input validation, and more.



Module 19: React Security

Security is a critical aspect of frontend development. React applications are vulnerable to various attacks, including Cross-Site Scripting (XSS), Cross-Site Request Forgery (CSRF), token theft, and insecure data handling. This module covers the essential security considerations for React applications, how to mitigate common vulnerabilities, and best practices for secure API communication, token storage, and input validation.

---

1. XSS (Cross-Site Scripting)

1.1 Definition

Cross-Site Scripting (XSS) is a security vulnerability that allows attackers to inject malicious scripts into web pages viewed by other users. These scripts can steal cookies, session tokens, or perform actions on behalf of the user. In React, XSS can occur if user input is improperly rendered as HTML or if dangerouslySetInnerHTML is used without sanitization.

1.2 Why It Exists

XSS exploits the trust a user has for a particular site. It occurs when an application includes untrusted data in a web page without proper validation or escaping. React's default behavior escapes JSX, which mitigates many XSS risks, but developers can bypass this with dangerouslySetInnerHTML or by using unescaped HTML.

1.3 Purpose

The purpose of understanding XSS is to prevent attackers from executing arbitrary JavaScript in users' browsers, protecting user data and session integrity.

1.4 React's Built-in Protection

React automatically escapes all strings rendered in JSX. For example:

```jsx
const userInput = '<img src=x onerror=alert("XSS")>';
return <div>{userInput}</div>; // Renders as text, not HTML
```

This renders the literal string, not the HTML. The onerror event is not triggered.

1.5 Dangerous Patterns

· Using dangerouslySetInnerHTML: This prop allows rendering raw HTML.

```jsx
<div dangerouslySetInnerHTML={{ __html: userInput }} />
```

If userInput is untrusted, this is XSS-prone.

· Direct DOM manipulation: Using innerHTML via refs.
· URL schemes: Using javascript: URLs in href or src.

1.6 Mitigation

· Avoid dangerouslySetInnerHTML unless absolutely necessary.
· If you must use it, sanitize the HTML using a library like DOMPurify.
· Validate and sanitize input on both client and server.
· Use Content Security Policy (CSP) headers to restrict script sources.
· Escape user input when rendering.

1.7 Sanitization with DOMPurify

```jsx
import DOMPurify from 'dompurify';

const cleanHTML = DOMPurify.sanitize(userInput);
<div dangerouslySetInnerHTML={{ __html: cleanHTML }} />
```

1.8 Common Mistakes

· Assuming React escapes everything (it does for JSX text, but not for attributes like href that can contain javascript:).
· Using dangerouslySetInnerHTML without sanitization.
· Allowing untrusted data in href or src attributes.

1.9 Best Practices

· Avoid injecting raw HTML.
· If needed, sanitize with DOMPurify.
· Use a strict Content Security Policy.
· Never trust user input; validate and sanitize on server.
· Use rel="noopener noreferrer" for external links.

1.10 Interview Questions

Q: How does React prevent XSS?
Answer: React escapes all strings rendered in JSX by default, preventing injected HTML from being parsed as markup. However, developers must be cautious with dangerouslySetInnerHTML and untrusted URLs. Using sanitization libraries and CSP adds additional layers of defense.

Q: What is dangerouslySetInnerHTML and why is it dangerous?
Answer: It is a React prop that allows rendering raw HTML. It is dangerous because if the HTML contains untrusted data, it can lead to XSS. It should only be used with sanitized content.

---

2. CSRF (Cross-Site Request Forgery)

2.1 Definition

Cross-Site Request Forgery (CSRF) is an attack that tricks a user's browser into making an unwanted request to a trusted site where the user is authenticated. For example, if a user is logged into a banking site, an attacker could cause the browser to submit a transfer request without the user's knowledge.

2.2 Why It Exists

CSRF exploits the trust that a site has in the user's browser. Browsers automatically include cookies (including session cookies) with requests, so if a user is authenticated, the server may accept the forged request. This attack is particularly relevant for state-changing requests (POST, PUT, DELETE).

2.3 CSRF in React Applications

React SPAs often use token-based authentication (JWT) stored in headers or cookies. If the token is in a cookie that is automatically sent, CSRF is a risk. If the token is in an Authorization header (not auto-sent), CSRF risk is reduced but still possible if the token is also stored in a cookie.

2.4 Mitigation Strategies

· SameSite Cookies: Set SameSite=Strict or Lax on cookies to prevent them from being sent on cross-site requests.
· CSRF Tokens: The server generates a unique token that the client includes in requests (e.g., in a header). The server validates it. This can be used with X-CSRF-Token header.
· Custom Headers: Require a custom header (e.g., X-Requested-With) that can't be sent cross-site without CORS preflight.
· Double Submit Cookie: Send a random value in both a cookie and a request parameter/header; server validates they match.
· Use fetch with credentials and include token in header manually (avoid automatic cookie-based auth for APIs).

2.5 Example: CSRF Token with Axios

```javascript
// Set CSRF token from cookie or meta tag
const csrfToken = document.querySelector('meta[name="csrf-token"]').content;

api.interceptors.request.use(config => {
  if (csrfToken) {
    config.headers['X-CSRF-Token'] = csrfToken;
  }
  return config;
});
```

2.6 Best Practices

· Use SameSite=Lax or Strict for session cookies.
· Avoid using cookies for API authentication if possible; prefer Authorization header with Bearer token.
· Implement CSRF tokens for state-changing requests.
· Ensure CORS is configured correctly to allow only trusted origins.

2.7 Interview Questions

Q: What is CSRF and how can you prevent it in a React app?
Answer: CSRF is an attack where a malicious site causes a user's browser to make an unintended request to a trusted site. Prevention includes using SameSite cookies, CSRF tokens, custom headers, and avoiding automatic cookie-based authentication for APIs. For token-based auth, using Authorization header instead of cookies mitigates the risk.

Q: How does SameSite cookie attribute help prevent CSRF?
Answer: SameSite controls when cookies are sent with requests. SameSite=Strict means cookies are only sent for same-site requests, so a cross-site request from an attacker's site won't include the cookie, preventing CSRF.

---

3. JWT Security

3.1 Definition

JWT (JSON Web Token) security refers to the practices of securely generating, storing, transmitting, and validating JWTs to prevent token theft, tampering, and misuse. In React, JWTs are often used as access tokens for API authentication.

3.2 Why It Exists

JWTs are widely used for stateless authentication, but they are susceptible to various attacks if not handled correctly. Security measures are necessary to protect the integrity and confidentiality of tokens.

3.3 Key Security Practices

· Use strong signing algorithms: HS256 (HMAC) or RS256 (RSA). Ensure secret keys are strong and stored securely.
· Set appropriate expiration: Short-lived access tokens (e.g., 15 minutes) and longer-lived refresh tokens.
· Do not store sensitive data in JWT payload (it's only base64-encoded, not encrypted). Keep claims minimal.
· Validate token on server (signature, expiration, issuer, audience).
· Use HTTPS to encrypt tokens in transit.
· Store tokens securely (see Token Storage section).
· Implement token refresh to reduce access token lifetime.
· Consider using JWT with HTTP-only cookies for refresh tokens to mitigate XSS theft.

3.4 Common JWT Vulnerabilities

· None algorithm: Some libraries may accept "none" algorithm; ensure server rejects it.
· Weak secret: Use strong, random secret; rotate periodically.
· Token leakage: If token stolen via XSS, attacker can impersonate user. Mitigate with short expiry and secure storage.
· Client-side storage: Local storage is accessible to JS, increasing XSS risk.

3.5 Best Practices

· Use HTTPS everywhere.
· Keep access token in memory or short-lived.
· Store refresh token in HTTP-only cookie.
· Validate all claims on server.
· Use iss and aud claims.
· Implement token revocation if needed (e.g., blacklist).

3.6 Interview Questions

Q: What are the security considerations when using JWT in a React app?
Answer: Use short-lived tokens, store access tokens in memory (or localStorage with caution), keep refresh tokens in HTTP-only cookies, always use HTTPS, validate tokens on server, avoid storing sensitive data in the payload, and implement refresh flow to limit exposure.

Q: Why should JWT not be stored in localStorage?
Answer: localStorage is accessible to JavaScript, making it vulnerable to XSS. If an attacker exploits XSS, they can steal tokens from localStorage. HTTP-only cookies are safer for sensitive tokens because they cannot be read by JavaScript.

---

4. Token Storage

4.1 Definition

Token storage refers to where authentication tokens (access and refresh tokens) are kept on the client side. The choice of storage has significant security implications.

4.2 Storage Options

· Memory (JavaScript variable): Not persistent, lost on refresh, but immune to XSS (as long as the attacker cannot read the variable).
· LocalStorage: Persistent, accessible via JavaScript, vulnerable to XSS.
· SessionStorage: Similar to localStorage but per-tab; still XSS risk.
· HTTP-only cookie: Inaccessible to JavaScript, automatically sent with requests, vulnerable to CSRF but can be mitigated with SameSite.

4.3 Recommended Approach

· Access token: Keep in memory (or short-lived in localStorage if necessary). For better security, use a BFF (Backend for Frontend) pattern where the access token is never exposed to JS; it's stored in an HTTP-only cookie and the client uses session cookies.
· Refresh token: Always in HTTP-only cookie with Secure, SameSite=Strict, and possibly HttpOnly. This prevents XSS from stealing it.

4.4 Implementation Example

· On login, server sets refresh token in HTTP-only cookie and returns access token in response body (short-lived).
· Client stores access token in memory (e.g., in a variable or React state).
· On page refresh, client calls refresh endpoint using the cookie to get a new access token.
· Axios interceptors handle token refresh automatically.

4.5 Trade-offs

Storage Security Persistence Usage
Memory High (XSS-safe) Low (lost on refresh) Access token
LocalStorage Low (XSS-vulnerable) High Avoid for sensitive tokens
HTTP-only cookie High (XSS-safe) High Refresh token
SessionStorage Low Medium Similar to localStorage

4.6 Interview Questions

Q: How should you store JWT tokens in a React app?
Answer: Access tokens should be kept in memory (or short-lived) to reduce XSS risk, while refresh tokens should be stored in HTTP-only cookies. Avoid localStorage for sensitive tokens. Use a refresh flow to renew access tokens silently.

Q: Why are HTTP-only cookies considered more secure than localStorage?
Answer: HTTP-only cookies cannot be accessed via JavaScript, so XSS attacks cannot steal them. They are automatically sent with requests, but can be protected with SameSite and CSRF mitigations.

---

5. HTTP-Only Cookies (Security Perspective)

5.1 Definition

HTTP-only cookies are cookies that cannot be accessed through client-side JavaScript (document.cookie). They are sent automatically with HTTP requests and are commonly used to store sensitive tokens like refresh tokens or session IDs.

5.2 Why It Exists

To protect tokens from XSS attacks. Even if an attacker injects malicious script, they cannot read the cookie value, preventing token theft.

5.3 Attributes for Security

· HttpOnly: prevents JS access.
· Secure: only sent over HTTPS.
· SameSite: restricts cross-site sending (Strict/Lax/None).
· Path: restricts to specific path.
· Max-Age/Expires: sets lifetime.
· Domain: restricts to specific domain.

5.4 Setting HTTP-Only Cookie (Server-Side)

```
Set-Cookie: refreshToken=abc123; HttpOnly; Secure; SameSite=Strict; Path=/; Max-Age=604800
```

5.5 Using with React

· Client does not handle the refresh token directly; it's automatically sent with requests to the same origin.
· For cross-origin, need SameSite=None; Secure and CORS with withCredentials: true.
· Axios setup:

```javascript
const api = axios.create({ baseURL: 'https://api.example.com', withCredentials: true });
```

5.6 CSRF Mitigation

Since cookies are auto-sent, CSRF is a concern. Use SameSite=Strict or implement CSRF tokens.

5.7 Interview Questions

Q: What are HTTP-only cookies and why are they useful for security?
Answer: HTTP-only cookies cannot be accessed via JavaScript, preventing XSS from stealing them. They are used for sensitive data like refresh tokens. Combined with Secure and SameSite flags, they provide strong protection.

Q: How do you handle CSRF when using HTTP-only cookies?
Answer: Use SameSite=Strict/Lax to prevent cross-site sending, or implement CSRF tokens. Additionally, ensure CORS is restricted to trusted origins.

---

6. CORS (Cross-Origin Resource Sharing)

6.1 Definition

CORS is a security mechanism that allows or restricts web applications running at one origin (domain) to make requests to a different origin. It uses HTTP headers to define which origins are permitted to access resources.

6.2 Why It Exists

Browsers enforce the same-origin policy to prevent malicious sites from reading data from other origins. CORS provides a controlled way to relax this policy for legitimate cross-origin requests.

6.3 CORS in React Applications

React apps often call APIs on different domains (e.g., localhost:3000 to api.example.com). The server must include appropriate CORS headers:

· Access-Control-Allow-Origin: specifies allowed origin(s) (e.g., https://myapp.com). Can be * for public APIs but not with credentials.
· Access-Control-Allow-Methods: e.g., GET, POST, PUT, DELETE.
· Access-Control-Allow-Headers: e.g., Authorization, Content-Type.
· Access-Control-Allow-Credentials: if using cookies/credentials.

6.4 Common Misconfigurations

· Using * for Access-Control-Allow-Origin with credentials (not allowed).
· Allowing all origins without necessity.
· Not handling preflight requests for non-simple requests (e.g., custom headers, methods).
· Storing tokens in cookies and setting Access-Control-Allow-Origin: *.

6.5 Best Practices

· Restrict origins to trusted domains.
· Use Access-Control-Allow-Credentials: true only when needed (e.g., cookie auth).
· Configure server to allow only specific methods and headers.
· For public APIs without credentials, can use *.
· Validate the Origin header on server.

6.6 Example (Server with Express)

```javascript
app.use(cors({
  origin: 'https://myapp.com',
  credentials: true,
  methods: ['GET', 'POST'],
  allowedHeaders: ['Content-Type', 'Authorization']
}));
```

6.7 Interview Questions

Q: What is CORS and how does it affect React apps?
Answer: CORS is a browser security feature that restricts cross-origin HTTP requests. React apps calling APIs on different domains must ensure the server sends appropriate CORS headers to allow the request. Misconfiguration can lead to security vulnerabilities or blocked requests.

Q: How do you enable CORS for a React app?
Answer: Configure the server to include Access-Control-Allow-Origin with your React app's origin. If using credentials, set Access-Control-Allow-Credentials: true and specify the exact origin (not *). Handle preflight requests.

---

7. Input Validation

7.1 Definition

Input validation is the process of ensuring that user-supplied data meets specific criteria before processing. In React, client-side validation improves UX and helps prevent invalid submissions, but it must be complemented by server-side validation for security.

7.2 Why It Exists

To prevent injection attacks (XSS, SQL injection), data corruption, and application errors. Client-side validation is not sufficient for security, as it can be bypassed, but it reduces unnecessary server load and improves UX.

7.3 Validation Strategies

· Client-side: Use form libraries (React Hook Form, Formik) with validation rules (required, pattern, custom). Zod or Yup for schema validation.
· Server-side: Always validate on server; never trust client data.

7.4 Example: Using React Hook Form + Zod

```jsx
import { useForm } from 'react-hook-form';
import { zodResolver } from '@hookform/resolvers/zod';
import { z } from 'zod';

const schema = z.object({
  email: z.string().email('Invalid email'),
  age: z.number().min(18, 'Must be 18+'),
});

function MyForm() {
  const { register, handleSubmit, formState: { errors } } = useForm({
    resolver: zodResolver(schema)
  });

  const onSubmit = (data) => { /* send to server */ };

  return (
    <form onSubmit={handleSubmit(onSubmit)}>
      <input {...register('email')} />
      {errors.email && <span>{errors.email.message}</span>}
      <input type="number" {...register('age', { valueAsNumber: true })} />
      {errors.age && <span>{errors.age.message}</span>}
      <button type="submit">Submit</button>
    </form>
  );
}
```

7.5 Best Practices

· Validate on both client and server.
· Use a schema validation library (Zod, Yup) for consistency.
· Sanitize inputs before rendering (especially if using dangerouslySetInnerHTML).
· Escape special characters.
· Validate data types and ranges.

7.6 Interview Questions

Q: Why is client-side validation not enough for security?
Answer: Client-side validation can be bypassed by disabling JavaScript, using devtools, or sending requests directly. Server-side validation is essential to enforce security rules, as it is the final gatekeeper for incoming data.

Q: How do you implement input validation in React?
Answer: Use controlled components with validation logic, or a form library like React Hook Form combined with a schema validator like Zod. Show errors to the user and prevent submission if invalid.

---

8. Sanitization

8.1 Definition

Sanitization is the process of cleaning or filtering user input to remove or neutralize potentially dangerous content, such as HTML tags, JavaScript, or other executable code. It is crucial when rendering untrusted data as HTML.

8.2 Why It Exists

To prevent XSS attacks when you need to display user-generated content that may contain HTML. Sanitization ensures that only safe, whitelisted HTML is rendered, removing scripts and event handlers.

8.3 Libraries for Sanitization

· DOMPurify: Fast, tolerant, and widely used.
· sanitize-html: More configurable but heavier.
· Custom regex: Not recommended; parse HTML properly.

8.4 Example with DOMPurify

```jsx
import DOMPurify from 'dompurify';

function RichText({ html }) {
  const cleanHTML = DOMPurify.sanitize(html, {
    USE_PROFILES: { html: true },
    ALLOWED_TAGS: ['p', 'strong', 'em', 'a', 'ul', 'ol', 'li'],
    ALLOWED_ATTR: ['href', 'target', 'rel'],
  });
  return <div dangerouslySetInnerHTML={{ __html: cleanHTML }} />;
}
```

8.5 Best Practices

· Never use dangerouslySetInnerHTML without sanitization.
· Use DOMPurify or similar.
· Configure allowed tags and attributes strictly.
· Sanitize on server as well.
· Consider using a Markdown renderer that escapes HTML.

8.6 Interview Questions

Q: What is sanitization and when is it necessary in React?
Answer: Sanitization is the process of cleaning untrusted HTML to prevent XSS. It is necessary when rendering user-generated content that may contain HTML, using dangerouslySetInnerHTML. Use a library like DOMPurify to whitelist safe tags and remove scripts.

Q: What is the difference between validation and sanitization?
Answer: Validation checks if input meets rules (e.g., email format), while sanitization removes potentially harmful content from input (e.g., stripping <script> tags). Both are important for security: validation ensures data correctness, sanitization prevents injection attacks.

---

9. Secure API Calls

9.1 Definition

Secure API calls involve protecting the communication between the frontend and backend, ensuring that data is not intercepted, manipulated, or exposed to unauthorized parties. This includes using HTTPS, proper authentication headers, and avoiding leaking sensitive information.

9.2 Why It Exists

To protect sensitive data (credentials, tokens, personal information) from eavesdropping and man-in-the-middle attacks, and to ensure that only authorized users can access protected resources.

9.3 Best Practices for Secure API Calls

· Always use HTTPS in production.
· Send tokens in Authorization header (Bearer token) rather than query parameters.
· Use short-lived access tokens and refresh flow.
· Implement proper error handling without leaking internal details.
· Log API calls for monitoring but not sensitive data.
· Use CORS correctly to prevent unauthorized origins.
· Avoid sending passwords or secrets in URL (use POST body).
· Validate server SSL certificates (default behavior).
· Implement rate limiting on server to mitigate brute force.
· Use Content Security Policy (CSP) to restrict script sources.

9.4 Example: Secure Axios Setup

```javascript
const api = axios.create({
  baseURL: import.meta.env.VITE_API_URL,
  timeout: 10000,
  headers: {
    'Content-Type': 'application/json',
  },
});

api.interceptors.request.use(config => {
  const token = getAccessToken(); // from memory or secure storage
  if (token) {
    config.headers.Authorization = `Bearer ${token}`;
  }
  return config;
});

api.interceptors.response.use(
  (response) => response,
  (error) => {
    if (error.response?.status === 401) {
      // handle refresh
    }
    return Promise.reject(error);
  }
);
```

9.5 Avoiding Information Leakage

· Never log tokens, passwords, or sensitive data.
· Return generic error messages to client (e.g., "Invalid credentials") to avoid user enumeration.
· Use HTTPS to encrypt everything.

9.6 Interview Questions

Q: How do you secure API calls in a React application?
Answer: Use HTTPS, send authentication tokens in the Authorization header, use short-lived tokens with refresh, configure CORS properly, and handle errors without exposing sensitive information. Additionally, validate server responses and use interceptors for centralized token handling.

Q: Why should tokens not be sent in query parameters?
Answer: Query parameters are part of the URL, which may be logged in browser history, server logs, or referer headers. Sending tokens in headers is more secure as they are not exposed in these places.

---

10. Environment Variables (Security)

10.1 Definition

Environment variables are used to store configuration values and secrets outside of the codebase. In React, they are often used for API keys, base URLs, and feature flags. However, all environment variables prefixed with VITE_ (Vite) or REACT_APP_ (CRA) are embedded in the client bundle and are publicly visible. Therefore, they must never contain secrets.

10.2 Why It Exists

To separate configuration from code and allow different settings per environment. But due to the client-side nature of React, secrets stored in environment variables are not truly secret.

10.3 Security Implications

· Exposed secrets: Any variable included in the frontend bundle can be extracted by users. Do not put API keys, passwords, or private endpoints in .env files that are bundled.
· Use for non-sensitive config: API base URLs (non-sensitive), feature flags, public keys (e.g., Stripe publishable key) are acceptable.
· Server-side secrets: For truly secret values, use server-side environment variables or a backend API that the frontend calls.

10.4 Best Practices

· Only store non-sensitive values in client-side env variables.
· For secret keys, use a backend that mediates access, or use a BFF pattern.
· Add .env files to .gitignore (except .env.example).
· Do not commit secrets to version control.
· For server-side secrets, use proper secret management (e.g., Vault, cloud secrets).
· Use VITE_ prefix only for public config.

10.5 Example

.env (public):

```
VITE_API_URL=https://api.example.com
VITE_STRIPE_PUBLISHABLE_KEY=pk_test_xxx
```

Do NOT put:

```
VITE_SECRET_API_KEY=should-not-be-here
```

10.6 Interview Questions

Q: Can you store API secrets in React environment variables?
Answer: No, environment variables in React are embedded in the client bundle and can be accessed by anyone. They should only be used for non-sensitive configuration like public API URLs or publishable keys. True secrets must reside on the server.

Q: How do you manage secrets in a React app?
Answer: For public keys, use client-side env vars. For sensitive secrets, use a backend server that holds the secrets and exposes only necessary endpoints. The frontend calls the backend, never directly accessing the secret. Use a BFF pattern or server-side session management.

---

11. Real-World Scenario: Securing a React Application

Problem: A React app handles user authentication, displays user-generated content (comments), and calls a REST API on a different domain. How do you secure it?

Solution:

· Use JWT authentication with access token in memory (or short-lived) and refresh token in HTTP-only cookie with Secure and SameSite=Strict.
· Use HTTPS for all API calls.
· Implement CSRF protection using SameSite cookies and/or CSRF tokens.
· Sanitize user-generated content with DOMPurify before rendering with dangerouslySetInnerHTML.
· Validate all inputs client-side and server-side.
· Configure CORS on backend to only allow the React app's origin.
· Use environment variables for public config only; keep secrets on server.
· Implement CSP headers to restrict script sources and mitigate XSS.
· Use axios interceptors for token refresh and error handling.

Architecture:

```mermaid
flowchart TD
    ReactApp --> HTTPS
    ReactApp --> AuthContext
    AuthContext --> AccessToken[Access Token in Memory]
    AuthContext --> RefreshCookie[Refresh Token HTTP-only Cookie]
    ReactApp --> APILayer
    APILayer --> AxiosInstance
    AxiosInstance --> Interceptors
    Interceptors --> RefreshFlow
    APILayer --> Backend
    Backend --> CORS[CORS configured]
    Backend --> CSP[CSP headers]
```

Implementation Highlights:

· AuthContext stores user and access token; refresh token in cookie.
· Axios instance with withCredentials: true, request interceptor adds access token, response interceptor refreshes on 401.
· Comments rendered using DOMPurify.
· Form validation with React Hook Form + Zod.
· Backend sets CORS and CSP headers.

---

12. Module 19 – Quick Revision

· XSS: React escapes by default; avoid dangerouslySetInnerHTML unless sanitized with DOMPurify.
· CSRF: Use SameSite cookies, CSRF tokens, and avoid cookie-based API auth if possible.
· JWT Security: Short-lived tokens, secure storage, HTTPS, validate on server.
· Token Storage: Access token in memory, refresh token in HTTP-only cookie.
· HTTP-Only Cookies: Protect tokens from XSS; use Secure, SameSite, HttpOnly.
· CORS: Restrict origins, handle preflight, don't use * with credentials.
· Input Validation: Client + server; use Zod/Yup.
· Sanitization: Clean untrusted HTML with DOMPurify.
· Secure API Calls: HTTPS, Authorization header, error handling.
· Environment Variables: Public config only, no secrets.

---

13. Interview Questions – Module 19

Beginner

1. What is XSS?
      Cross-Site Scripting, where attackers inject malicious scripts into web pages.
2. What is CSRF?
      Cross-Site Request Forgery, an attack that forces a user's browser to make unwanted requests to a trusted site.
3. Why should you avoid storing JWT in localStorage?
      Because localStorage is accessible to JavaScript, making it vulnerable to XSS attacks.

Intermediate

1. How does React prevent XSS?
      React escapes JSX by default. The danger arises with dangerouslySetInnerHTML. Use DOMPurify for sanitization.
2. Explain how to implement CSRF protection in a React app.
      Use SameSite cookies, CSRF tokens in headers, and custom headers. If using JWT in Authorization header (not cookie), CSRF risk is minimal.
3. What are HTTP-only cookies and why are they safer?
      HTTP-only cookies cannot be read by JavaScript, so XSS cannot steal them. Use for refresh tokens.

Advanced

1. How would you design a secure authentication flow for a React SPA?
      Use short-lived access tokens in memory, refresh tokens in HTTP-only cookies, HTTPS, token refresh via interceptors, and logout on refresh failure. Implement CORS and CSP.
2. What are the security risks of using dangerouslySetInnerHTML?
      It can lead to XSS if the HTML is not sanitized. Attackers can inject scripts to steal tokens or perform actions. Sanitize with DOMPurify or avoid raw HTML.
3. How do you handle secrets in a React app?
      Client-side env vars are public; only store non-sensitive config. For secrets, use a backend or BFF to mediate access.

Scenario-Based

Q: Your app displays user comments. A malicious user posts a comment containing <script>alert('xss')</script>. How do you prevent this?
Answer: Sanitize the comment with DOMPurify before rendering. Also, React's default escaping would prevent script execution if rendered as text. Never use dangerouslySetInnerHTML without sanitization.

Coding Questions

1. Write a function that sanitizes a string with DOMPurify before rendering as HTML.

```jsx
import DOMPurify from 'dompurify';

function SafeHTML({ html }) {
  const clean = DOMPurify.sanitize(html);
  return <div dangerouslySetInnerHTML={{ __html: clean }} />;
}
```

2. Create an Axios interceptor that adds a CSRF token from a meta tag.

```javascript
api.interceptors.request.use(config => {
  const token = document.querySelector('meta[name="csrf-token"]')?.content;
  if (token) config.headers['X-CSRF-Token'] = token;
  return config;
});
```

---

14. Common Mistakes & Best Practices

Mistake Best Practice
Storing tokens in localStorage Use memory for access token, HTTP-only cookie for refresh
Using dangerouslySetInnerHTML without sanitization Sanitize with DOMPurify
Not using HTTPS in production Enforce HTTPS
Allowing all origins in CORS Restrict to trusted origins
Storing secrets in client env vars Keep secrets server-side
Not validating input on server Always validate server-side
Using long-lived access tokens Use short expiration and refresh
Ignoring CSRF for cookie-based auth Use SameSite and CSRF tokens

---

This concludes Module 19: React Security. The next module is Module 20: Deployment, covering production builds, Docker, Nginx, static hosting, CI/CD, and more.




Module 20: Deployment

Deployment is the process of making a React application available to users on a web server or hosting platform. It involves building the application for production, optimizing assets, configuring environment-specific settings, and setting up infrastructure to serve the built files. This module covers the complete deployment lifecycle: production builds, npm scripts, environment configuration, Docker, Nginx, static hosting, VPS deployment, and CI/CD with GitHub Actions.

---

1. Production Build

1.1 Definition

A production build is the process of compiling and optimizing a React application for deployment. It creates a set of static files (HTML, CSS, JavaScript, images) that are minified, compressed, and ready to be served to users. Tools like Vite, Webpack, or Create React App perform this build.

1.2 Why It Exists

Development builds include extra code for debugging, hot reloading, and verbose warnings. Production builds strip these out, minify the code, and apply tree shaking to reduce bundle size, improving load times and performance.

1.3 Purpose

· Generate optimized static assets.
· Reduce bundle size.
· Enable caching and compression.
· Prepare for deployment to any static server or CDN.
· Improve application performance and security.

1.4 How It Works

· Minification: removes whitespace, comments, and shortens variable names.
· Tree shaking: eliminates unused exports (ES modules).
· Code splitting: creates separate chunks that can be lazy-loaded.
· Asset optimization: images, fonts, and other assets may be hashed and compressed.
· Environment injection: environment variables are baked in at build time.

1.5 Build Tools

· Vite: uses Rollup for production build. Command: vite build.
· Create React App: uses Webpack. Command: react-scripts build.
· Next.js: uses Webpack or Turbopack. Command: next build.

1.6 Example: Vite Production Build

```bash
npm run build
```

Output typically in dist/ folder containing:

```
dist/
├── assets/
│   ├── index-[hash].js
│   ├── index-[hash].css
│   └── ...
├── index.html
└── favicon.ico
```

1.7 Benefits

· Faster load times due to smaller, optimized assets.
· Better performance and user experience.
· Suitable for static hosting.

1.8 Interview Questions

Q: What is a production build in React?
Answer: It's the process of compiling and optimizing the React app for deployment. It minifies code, tree-shakes unused modules, splits bundles, and produces static files that can be served by a web server or CDN.

Q: How does a production build differ from a development build?
Answer: Development builds include hot reload, detailed warnings, and source maps for debugging. Production builds are minified, optimized, and stripped of development-only code, resulting in much smaller bundles and better performance.

---

2. npm Build

2.1 Definition

npm build refers to the script defined in package.json that runs the build tool to generate a production build. It is usually executed as npm run build. The actual command varies depending on the tooling (Vite, CRA, etc.).

2.2 Why It Exists

To provide a standardized way to trigger the production build process. npm scripts allow you to define custom commands and run them consistently across environments.

2.3 Common Build Scripts

Vite:

```json
"scripts": {
  "build": "vite build"
}
```

Create React App:

```json
"scripts": {
  "build": "react-scripts build"
}
```

Next.js:

```json
"scripts": {
  "build": "next build"
}
```

2.4 Running the Build

```bash
npm run build
```

The command reads configuration from vite.config.js, craco.config.js, or next.config.js, and outputs the production assets.

2.5 What Happens During npm run build

· Environment variables are loaded.
· Bundler runs (Rollup for Vite, Webpack for CRA/Next).
· Assets are minified and hashed.
· Output is written to a folder (usually dist/ or build/).
· The build exits with a success or error code.

2.6 Common Issues

· Missing environment variables causing build failures.
· Out of memory for large projects (set NODE_OPTIONS=--max-old-space-size=4096).
· Incompatible dependencies.
· TypeScript errors (if strict).

2.7 Best Practices

· Always run npm run build before deploying.
· Use --mode flag to specify environment (Vite).
· Clean output directory before build.
· Fail the build on errors in CI.

2.8 Interview Questions

Q: What is the purpose of npm run build in React?
Answer: It runs the build script defined in package.json, which compiles and optimizes the React application for production. It generates static files that can be served by a web server.

Q: How do you customize the build process?
Answer: By modifying the build tool configuration (e.g., vite.config.js, webpack.config.js) or using environment-specific .env files. You can also add prebuild/postbuild scripts in package.json to run additional tasks.

---

3. Environment Configuration

3.1 Definition

Environment configuration involves setting up environment-specific variables and settings for the build and runtime. This includes API base URLs, feature flags, analytics keys, and other configuration that differs between development, staging, and production.

3.2 Why It Exists

To keep the same codebase adaptable to different environments without hardcoding values. It allows you to build once and deploy to multiple environments with different configurations (though often you build per environment).

3.3 How It Works in React

· Create .env files for each environment.
· Use VITE_ prefix (Vite) or REACT_APP_ prefix (CRA) for variables that will be exposed to the client.
· At build time, these variables are inlined into the bundle.

Example .env.production:

```
VITE_API_URL=https://api.example.com
VITE_ENABLE_ANALYTICS=true
```

Example .env.development:

```
VITE_API_URL=http://localhost:3000/api
VITE_ENABLE_ANALYTICS=false
```

3.4 Using Environment Variables in Code

Vite:

```javascript
const apiUrl = import.meta.env.VITE_API_URL;
```

CRA:

```javascript
const apiUrl = process.env.REACT_APP_API_URL;
```

3.5 Important Notes

· Only variables with the correct prefix are exposed to the client.
· Values are embedded at build time; they cannot be changed without rebuilding.
· Never store secrets in client-side environment variables.

3.6 Best Practices

· Use .env.example to document required variables.
· Add .env files to .gitignore.
· In CI/CD, inject environment variables via secrets.
· For runtime configuration, consider using a JSON config file fetched at startup (though this has trade-offs).

3.7 Interview Questions

Q: How do you configure environment variables in a React app?
Answer: Use .env files with the appropriate prefix (VITE_ for Vite, REACT_APP_ for CRA). Access them via import.meta.env or process.env. Different .env files can be used for different modes.

Q: Why can't you change environment variables after building?
Answer: Environment variables are embedded into the JavaScript bundle during build time. Changing them requires a rebuild. For runtime configuration, you need to fetch a config file or use server-side rendering.

---

4. Docker

4.1 Definition

Docker is a platform for developing, shipping, and running applications in containers. A container packages the application with all its dependencies (Node.js, build tools, static files) into a single portable unit. For React, Docker can be used to build the app and serve it with a web server (like Nginx) inside a container.

4.2 Why It Exists

Docker provides consistency across environments (development, testing, production), isolates dependencies, and simplifies deployment by using a standard container format that can run on any system with Docker.

4.3 Purpose

· Consistent runtime environment.
· Easy scaling and orchestration (Kubernetes).
· Portable across cloud providers.
· Efficient resource utilization compared to VMs.
· Reproducible builds.

4.4 Dockerfile for a React App (Multi-stage build)

A common pattern is to use Node to build the app, then copy the static files to an Nginx container to serve.

```dockerfile
# Stage 1: Build the React app
FROM node:20-alpine AS builder

WORKDIR /app
COPY package*.json ./
RUN npm ci

COPY . .
RUN npm run build

# Stage 2: Serve with Nginx
FROM nginx:alpine

COPY --from=builder /app/dist /usr/share/nginx/html

# Copy custom nginx config if needed
COPY nginx.conf /etc/nginx/conf.d/default.conf

EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
```

4.5 Building and Running the Docker Image

```bash
docker build -t my-react-app .
docker run -p 8080:80 my-react-app
```

Access at http://localhost:8080.

4.6 Using Docker Compose

For more complex setups (e.g., frontend + backend + database), use docker-compose.yml:

```yaml
version: '3'
services:
  frontend:
    build: .
    ports:
      - "8080:80"
    depends_on:
      - backend
  backend:
    build: ./backend
    ports:
      - "3000:3000"
```

4.7 Advantages

· Consistent environment.
· Easy to rollback versions.
· Works with orchestration tools.
· Isolates applications.

4.8 Disadvantages

· Slight overhead vs running directly on a server.
· Learning curve for Docker concepts.
· Need to manage images and containers.

4.9 Best Practices

· Use multi-stage builds to keep image size small.
· Use a specific base image tag (avoid latest).
· Run as non-root user if possible.
· Avoid storing secrets in Docker images; use environment variables or secrets management.
· Use .dockerignore to exclude unnecessary files (node_modules, .git).

4.10 Interview Questions

Q: How would you deploy a React app with Docker?
Answer: Create a Dockerfile with multi-stage build: use Node to build the app, then copy the static files to an Nginx container. Build the image with docker build, then run it with docker run. The container serves the app on port 80.

Q: What are the benefits of using Docker for deployment?
Answer: Consistent environments, portability, easy scaling, and isolation. Docker ensures the app runs the same way in development and production, simplifying deployment and reducing environment-related issues.

---

5. Nginx

5.1 Definition

Nginx is a high-performance web server, reverse proxy, and load balancer. It is commonly used to serve static files (like React build output) and to proxy API requests to a backend server. It is known for its low resource usage and ability to handle many concurrent connections.

5.2 Why It Exists

To efficiently serve static assets and act as a reverse proxy. For React SPAs, Nginx can serve the built files and handle client-side routing by redirecting all requests to index.html.

5.3 Purpose

· Serve static files (HTML, CSS, JS).
· Reverse proxy to backend APIs.
· Load balancing.
· SSL termination.
· Caching and compression.

5.4 Basic Nginx Configuration for a React SPA

```nginx
server {
    listen 80;
    server_name example.com;

    root /usr/share/nginx/html;
    index index.html;

    # Handle React Router: serve index.html for any non-file route
    location / {
        try_files $uri $uri/ /index.html;
    }

    # Proxy API requests to backend
    location /api/ {
        proxy_pass http://backend:3000;
        proxy_set_header Host $host;
        proxy_set_header X-Real-IP $remote_addr;
        proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
        proxy_set_header X-Forwarded-Proto $scheme;
    }

    # Enable gzip compression
    gzip on;
    gzip_types text/plain text/css application/json application/javascript text/xml application/xml application/xml+rss text/javascript;
}
```

5.5 Important Directives

· try_files $uri $uri/ /index.html; – essential for client-side routing.
· proxy_pass – forward requests to backend.
· gzip – compress responses to reduce bandwidth.
· location / – serve static assets.
· location /api/ – proxy API calls.

5.6 Using Nginx with Docker

In the Dockerfile, copy a custom nginx.conf to /etc/nginx/conf.d/default.conf.

5.7 Security Considerations

· Use HTTPS with SSL certificates (Let's Encrypt).
· Restrict allowed methods if needed.
· Set security headers (X-Content-Type-Options, X-Frame-Options, CSP).
· Hide Nginx version.

5.8 Performance Tips

· Enable gzip compression.
· Set cache headers for static assets with far-future expiration (for hashed files).
· Use HTTP/2.
· Limit buffer sizes.

5.9 Interview Questions

Q: Why is Nginx commonly used with React apps?
Answer: Nginx is fast at serving static files, supports reverse proxying to backend APIs, and can handle client-side routing by redirecting all routes to index.html. It also provides compression, caching, and SSL termination.

Q: How does Nginx handle React Router routes?
Answer: Using try_files $uri $uri/ /index.html; inside a location / block, Nginx serves the requested file if it exists, otherwise it falls back to index.html. This allows React Router to handle routing on the client side.

---

6. Static Hosting

6.1 Definition

Static hosting refers to serving the built React application (static HTML, CSS, JS files) from a web server or CDN without any server-side processing. It is the simplest and most cost-effective way to deploy React SPAs.

6.2 Why It Exists

React apps are static after build; they do not require a Node.js server to run. Static hosting platforms can serve them globally with low latency, automatic scaling, and HTTPS.

6.3 Popular Static Hosting Platforms

· Vercel (optimized for Next.js but supports any static site)
· Netlify
· GitHub Pages
· AWS S3 + CloudFront
· Cloudflare Pages
· Firebase Hosting

6.4 Deploying to Static Hosting

Typical steps:

1. Build the app (npm run build).
2. Upload the dist/ or build/ folder to the platform.
3. Configure the platform to serve index.html for all routes (client-side routing).
4. Set up custom domain and HTTPS.

6.5 Example: Deploying to Netlify

· Connect your Git repository.
· Set build command: npm run build.
· Set publish directory: dist/ (Vite) or build/ (CRA).
· Netlify automatically detects and deploys.
· Add a _redirects file for SPA routing (or use netlify.toml):

```
/*    /index.html   200
```

6.6 Benefits

· Simple and fast.
· Low cost (often free tier).
· Global CDN and automatic scaling.
· Built-in HTTPS.
· No server maintenance.

6.7 Limitations

· Cannot run server-side code (unless using serverless functions).
· Limited control over server configuration (compared to VPS).
· May have limitations for complex applications.

6.8 Best Practices

· Ensure client-side routing is configured.
· Set cache headers for static assets.
· Use a custom domain with HTTPS.
· Configure redirects if needed.
· Monitor analytics and performance.

6.9 Interview Questions

Q: What is static hosting and when is it suitable for a React app?
Answer: Static hosting serves pre-built static files (HTML, CSS, JS) from a CDN or web server. It's suitable for React SPAs because they are static after build and don't require server-side rendering. Platforms like Netlify and Vercel make it easy with automatic deployments and routing configuration.

Q: How do you handle routing on a static hosting platform?
Answer: You need to configure the platform to redirect all requests to index.html. For Netlify, use a _redirects file with /* /index.html 200. For others, similar rewrites are configured. This allows React Router to handle client-side routing.

---

7. VPS Deployment

7.1 Definition

VPS (Virtual Private Server) deployment involves running your React app on a virtual server instance (e.g., DigitalOcean, AWS EC2, Linode). You have full control over the server, including installing Nginx, Node.js, and other software. It is suitable for apps that require server-side features or more control than static hosting.

7.2 Why It Exists

To gain full control over the hosting environment, run server-side code (e.g., Express backend), and support complex applications. VPS offers more flexibility than static hosting but requires more management.

7.3 Deployment Steps on a VPS

1. Provision a VPS with a Linux distribution (Ubuntu, CentOS).
2. Install Node.js and npm (if needed for backend or build).
3. Clone the repository or upload the built files.
4. Build the React app on the server or locally.
5. Install and configure Nginx to serve static files and proxy API.
6. Set up SSL with Let's Encrypt (Certbot).
7. Start the backend (if any) with PM2 or systemd.
8. Configure firewall and security.

7.4 Example: Nginx Configuration for VPS

Same as earlier Nginx config.

7.5 Process Managers for Backend

If you run a Node.js backend, use PM2 to keep it running:

```bash
npm install -g pm2
pm2 start server.js --name backend
pm2 save
pm2 startup
```

7.6 Advantages

· Full control.
· Run server-side code.
· Custom domain and SSL.
· Can host multiple apps.
· Predictable performance.

7.7 Disadvantages

· More setup and maintenance.
· Security responsibilities (firewall, updates).
· Not as easy as static hosting.
· Requires knowledge of Linux and web servers.

7.8 Best Practices

· Use a non-root user for deployment.
· Enable firewall (ufw) and allow only necessary ports.
· Use SSH keys for authentication.
· Keep server updated.
· Use PM2 or systemd to manage services.
· Set up monitoring and logging.
· Backup important data.

7.9 Interview Questions

Q: How would you deploy a React app with a Node.js backend on a VPS?
Answer: Build the React app locally, upload the static files, install Nginx to serve them and proxy /api to the backend running on a local port. Use PM2 to keep the backend alive, set up SSL with Let's Encrypt, and configure firewall.

Q: What are the differences between static hosting and VPS deployment?
Answer: Static hosting is simpler, managed, and usually cheaper, suitable for static SPAs. VPS gives full control, supports server-side code, and is more flexible but requires manual server management and security.

---

8. CI/CD

8.1 Definition

CI/CD (Continuous Integration and Continuous Deployment/Delivery) is a set of practices that automate the building, testing, and deployment of applications. CI ensures code changes are automatically tested and integrated; CD automates the deployment to staging or production environments.

8.2 Why It Exists

To increase development speed, catch bugs early, and reduce manual deployment errors. CI/CD pipelines ensure that every change is tested and deployable, leading to reliable releases.

8.3 CI/CD Pipeline Stages

· Source: code pushed to repository.
· Build: install dependencies, build the app.
· Test: run unit/integration tests.
· Deploy: deploy to staging/production.

```mermaid
flowchart LR
    A[Code Commit] --> B[CI Pipeline]
    B --> C[Build]
    C --> D[Test]
    D --> E[Deploy Staging]
    E --> F[Deploy Production]
    F --> G[Monitoring]
```

8.4 Tools for CI/CD

· GitHub Actions
· GitLab CI
· Jenkins
· CircleCI
· Travis CI

8.5 Benefits

· Automated testing and deployment.
· Faster release cycles.
· Consistent builds.
· Reduced human error.
· Immediate feedback on code changes.

8.6 Best Practices

· Keep pipelines fast.
· Use caching for dependencies.
· Run tests in parallel.
· Deploy to staging before production.
· Use environment variables for secrets.
· Notify team on failures.

8.7 Interview Questions

Q: What is CI/CD and why is it important?
Answer: CI/CD automates the building, testing, and deployment of software. It ensures code changes are reliably tested and deployed, reducing manual effort and errors, and enabling frequent releases.

Q: How do you set up CI/CD for a React app?
Answer: Use a platform like GitHub Actions. Create a workflow file that triggers on push or pull request. The workflow installs dependencies, runs tests, builds the app, and deploys to a hosting service (e.g., Netlify, Vercel, or S3) using credentials stored as secrets.

---

9. GitHub Actions

9.1 Definition

GitHub Actions is a CI/CD platform integrated with GitHub repositories. It uses YAML workflow files to define automated pipelines triggered by events (push, pull request, schedule). It can build, test, and deploy applications.

9.2 Why It Exists

To provide an easy, integrated way to automate software workflows directly in GitHub, without external services. It is free for public repositories and includes many pre-built actions.

9.3 Key Concepts

· Workflow: defined in .github/workflows/*.yml.
· Event: triggers workflow (push, pull_request, workflow_dispatch).
· Job: a set of steps executed on a runner.
· Step: individual task (run command, use action).
· Runner: virtual machine (Ubuntu, Windows, macOS).

9.4 Example GitHub Actions Workflow for React

```yaml
# .github/workflows/deploy.yml
name: Build and Deploy

on:
  push:
    branches: [ main ]

jobs:
  build:
    runs-on: ubuntu-latest

    steps:
      - uses: actions/checkout@v3

      - name: Setup Node.js
        uses: actions/setup-node@v3
        with:
          node-version: '20'

      - name: Install dependencies
        run: npm ci

      - name: Run tests
        run: npm test -- --watch=false

      - name: Build
        run: npm run build

      - name: Deploy to Netlify
        uses: nwtgck/actions-netlify@v2
        with:
          publish-dir: './dist'
          production-deploy: true
          netlify-auth-token: ${{ secrets.NETLIFY_AUTH_TOKEN }}
          netlify-site-id: ${{ secrets.NETLIFY_SITE_ID }}
```

9.5 Environment Variables and Secrets

· Store secrets in GitHub repository settings.
· Access in workflow via ${{ secrets.SECRET_NAME }}.
· Use environment variables for non-sensitive config.

9.6 Caching Dependencies

Use actions/cache to speed up installs:

```yaml
- name: Cache node modules
  uses: actions/cache@v3
  with:
    path: ~/.npm
    key: ${{ runner.os }}-node-${{ hashFiles('**/package-lock.json') }}
    restore-keys: |
      ${{ runner.os }}-node-
```

9.7 Best Practices

· Use npm ci instead of npm install for deterministic builds.
· Run tests before building.
· Use separate workflows for CI (build/test) and CD (deploy).
· Set timeouts to avoid hanging.
· Notify on failure (Slack, email).
· Use matrix testing for different Node versions.

9.8 Interview Questions

Q: How do you set up GitHub Actions for a React project?
Answer: Create a YAML file in .github/workflows/. Define triggers, jobs, and steps. Use actions/checkout to get code, actions/setup-node to set Node version, run npm ci, npm test, npm run build, then deploy using a deployment action or CLI with secrets.

Q: What are the benefits of using GitHub Actions over other CI/CD tools?
Answer: It's integrated with GitHub, free for public repos, has a large marketplace of actions, supports matrix builds, and is easy to configure with YAML. It eliminates the need for external CI services.

---

10. Real-World Scenario: Deploying a React App with CI/CD to Netlify

Problem: A team wants to automatically deploy their React app to production whenever code is pushed to the main branch. They need automated testing and building.

Solution:

· Use GitHub Actions as CI/CD.
· Workflow triggers on push to main.
· Steps: checkout, setup Node, install deps, run tests, build, deploy to Netlify.
· Store Netlify credentials as GitHub secrets.
· Netlify serves static files and handles SPA routing.

Architecture:

```mermaid
flowchart LR
    Developer --> Push[Push to main]
    Push --> GitHubActions[GitHub Actions]
    GitHubActions --> Checkout[Checkout Code]
    Checkout --> Install[Install Dependencies]
    Install --> Test[Run Tests]
    Test --> Build[Build App]
    Build --> Deploy[Deploy to Netlify]
    Deploy --> Netlify[Netlify CDN]
    Netlify --> Users[Users]
```

Implementation Highlights:

· Workflow file .github/workflows/main.yml.
· Use npm ci for deterministic install.
· Run npm test -- --watch=false to ensure tests pass.
· Build with npm run build.
· Use nwtgck/actions-netlify to deploy.
· Secrets: NETLIFY_AUTH_TOKEN, NETLIFY_SITE_ID.

---

11. Module 20 – Quick Revision

· Production build: optimize and minify code for deployment.
· npm run build executes build tool (Vite, CRA, Next).
· Environment configuration via .env files and prefixes.
· Docker: containerize the app for consistency and portability; multi-stage builds.
· Nginx: serve static files, proxy API, handle SPA routing with try_files.
· Static hosting: simple, fast, managed platforms (Netlify, Vercel, GitHub Pages).
· VPS deployment: full control, requires server management.
· CI/CD: automate build, test, deploy.
· GitHub Actions: integrated CI/CD with YAML workflows.
· Best practices: use npm ci, test before deploy, cache dependencies, keep secrets safe.

---

12. Interview Questions – Module 20

Beginner

1. What is a production build in React?
      It's a minified, optimized version of the app for deployment, generated by npm run build.
2. What is static hosting?
      Hosting the built static files on a CDN or web server without server-side processing.
3. What does Nginx do for a React app?
      It serves the static files and redirects all routes to index.html for client-side routing.

Intermediate

1. Explain the purpose of environment variables in deployment.
      Environment variables allow different configurations for different environments (API URLs, feature flags) without changing code. They are baked in at build time.
2. How do you deploy a React app using Docker?
      Create a multi-stage Dockerfile: build with Node, then serve with Nginx. Build the image and run the container.
3. What is CI/CD and why is it important?
      CI/CD automates building, testing, and deployment. It ensures code changes are reliable and deployable, enabling frequent releases.

Advanced

1. How would you set up a deployment pipeline for a React app that includes Docker and Nginx?
      Use CI/CD (e.g., GitHub Actions) to build a Docker image, push to a container registry, and then deploy to a server or Kubernetes. The Docker image contains Nginx serving the static files. Alternatively, build locally and deploy static files to Nginx on VPS.
2. What are the benefits of using a multi-stage Docker build for React?
      It keeps the final image small by only including the production build and Nginx, not the Node.js build environment. This improves security and reduces deployment size.
3. How do you handle client-side routing when deploying to a static host or Nginx?
      Configure the server to rewrite all requests to index.html. In Nginx: try_files $uri $uri/ /index.html;. For Netlify: _redirects file with /* /index.html 200. This ensures React Router handles routing.

Scenario-Based

Q: Your React app has a backend API. How would you deploy both frontend and backend?
Answer: Build the React app and serve it with Nginx. Configure Nginx to proxy /api requests to the backend server (e.g., Express on port 3000). Deploy backend with PM2 on a VPS or as a separate container. Use environment variables for API URLs. Alternatively, use a platform like Render or Heroku that supports both.

Coding Questions

1. Write a basic Nginx configuration for a React SPA.

```nginx
server {
    listen 80;
    server_name example.com;
    root /usr/share/nginx/html;
    index index.html;
    location / {
        try_files $uri $uri/ /index.html;
    }
}
```

2. Create a GitHub Actions workflow that builds and tests a React app on push to main.

```yaml
name: CI
on:
  push:
    branches: [ main ]
jobs:
  build:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v3
      - uses: actions/setup-node@v3
        with:
          node-version: '20'
      - run: npm ci
      - run: npm test -- --watch=false
      - run: npm run build
```

---

13. Common Mistakes & Best Practices

Mistake Best Practice
Not minifying/optimizing for production Always run npm run build before deploy
Forgetting to configure SPA routing on server Use try_files or platform rewrites
Storing secrets in client env vars Keep secrets server-side; use CI/CD secrets
Not using npm ci in CI Use npm ci for deterministic install
Deploying without testing Run tests in pipeline
Using latest tag in Docker Pin specific versions
Not enabling gzip/compression Enable gzip in Nginx or platform
Skipping HTTPS Always use SSL (Let's Encrypt, platform HTTPS)
Not cleaning output directory Clean dist/ before build
Hardcoding environment-specific values Use env variables

---

14. Deployment Tools Summary

Tool Purpose
Vite/Webpack Build tool for production
Nginx Web server, reverse proxy
Docker Containerization
Netlify/Vercel Static hosting with CI/CD
GitHub Actions CI/CD automation
PM2 Node.js process manager
Let's Encrypt SSL certificates
AWS S3 + CloudFront Static hosting on AWS

---

This concludes Module 20: Deployment. The next module is Module 21: Projects, which will guide you through building real-world projects to consolidate your learning.



Module 21: Projects

Projects are the culmination of all React knowledge. They provide practical experience, reinforce concepts, and demonstrate your ability to build real-world applications. This module outlines a progression of projects from beginner to advanced, with detailed guidance on key full-stack projects. Each project type focuses on specific skills and technologies, preparing you for professional development and technical interviews.

---

1. Introduction to Projects

1.1 Definition

In the context of learning React, projects are hands-on applications that you build to apply and consolidate your knowledge. They range from simple counter apps to complex full-stack platforms with authentication, state management, and real-time features.

1.2 Why Projects Exist

Projects bridge the gap between theory and practice. They force you to solve real problems, integrate multiple concepts, and understand how different parts of an application work together. They also serve as portfolio pieces to showcase your skills to employers.

1.3 Purpose

· Apply React concepts in real scenarios.
· Gain experience with development workflow (git, testing, deployment).
· Build a portfolio.
· Prepare for technical interviews and job requirements.
· Learn to debug and optimize.
· Understand full-stack integration.

1.4 Prerequisites

· Modules 00-20 of this roadmap, or equivalent knowledge.
· Basic Git and command-line skills.
· Familiarity with APIs and databases (for full-stack projects).

1.5 Project Progression

· Beginner: Focus on component creation, state, props, and basic interactions.
· Intermediate: Introduce routing, forms, API integration, and state management.
· Advanced: Complex architecture, performance optimization, testing, and real-time features.

---

2. Beginner Projects

2.1 Definition

Beginner projects are simple applications that teach the fundamentals of React: JSX, components, props, state, and event handling. They typically do not require external libraries beyond React itself.

2.2 Why They Exist

To build confidence and muscle memory for basic React patterns. They help you understand component composition and data flow before moving to more complex topics.

2.3 Purpose

· Master useState and props.
· Understand component hierarchy.
· Practice conditional rendering and lists.
· Learn event handling.

2.4 Examples of Beginner Projects

· Counter App: Increment/decrement buttons, reset.
· Todo List: Add, delete, mark complete; use local state.
· Digital Clock: Display current time, update every second.
· Profile Card: Static component with props for user data.
· Color Picker: Buttons that change background color.

2.5 What You Learn

· Creating functional components.
· Using useState for local state.
· Passing props and callbacks.
· Conditional rendering with ternary and &&.
· Rendering lists with map and keys.
· Handling events (onClick, onChange).

2.6 Implementation Example: Simple Counter

```jsx
import { useState } from 'react';

function Counter() {
  const [count, setCount] = useState(0);

  return (
    <div>
      <h1>Count: {count}</h1>
      <button onClick={() => setCount(count + 1)}>+</button>
      <button onClick={() => setCount(count - 1)}>-</button>
      <button onClick={() => setCount(0)}>Reset</button>
    </div>
  );
}

export default Counter;
```

2.7 Project Checklist

· Component renders without errors.
· State updates correctly.
· UI reflects state changes.
· No console warnings.
· Code is clean and readable.

2.8 Interview Questions

Q: What is the simplest React project you have built? What did you learn from it?
Answer: I built a counter app using useState. It taught me the basics of state management, event handling, and how React re-renders components when state changes. It also helped me understand the component's lifecycle and the importance of keeping state minimal.

---

3. Intermediate Projects

3.1 Definition

Intermediate projects involve multiple components, routing, forms, API integration, and often a state management solution like Context API or Redux. They simulate more realistic applications.

3.2 Why They Exist

To practice integrating different React concepts into a cohesive app, and to introduce you to tools like React Router, Axios, and form validation.

3.3 Purpose

· Use React Router for navigation.
· Handle forms with validation.
· Fetch and display data from APIs.
· Manage global state with Context or Redux.
· Implement authentication (basic).

3.4 Examples of Intermediate Projects

· Expense Tracker: CRUD operations, chart display, localStorage persistence.
· Notes App: Create/edit/delete notes, search, tags.
· Movie Search App: Search movies using an external API (OMDb), display details.
· Quiz App: Multiple-choice questions, score tracking, timer.
· E-Commerce Product Listing: Product cards, filtering, sorting, cart (local state).

3.5 What You Learn

· Client-side routing.
· API integration with Axios/Fetch.
· Form handling and validation (React Hook Form, Zod).
· State lifting and Context API.
· Loading and error states.
· Responsive design with CSS/Tailwind.

3.6 Implementation Example: Movie Search with API

```jsx
import { useState, useEffect } from 'react';
import axios from 'axios';

function MovieSearch() {
  const [query, setQuery] = useState('');
  const [movies, setMovies] = useState([]);
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState(null);

  const searchMovies = async () => {
    setLoading(true);
    setError(null);
    try {
      const res = await axios.get(`https://www.omdbapi.com/?s=${query}&apikey=YOUR_KEY`);
      setMovies(res.data.Search || []);
    } catch (err) {
      setError(err.message);
    } finally {
      setLoading(false);
    }
  };

  return (
    <div>
      <input value={query} onChange={e => setQuery(e.target.value)} placeholder="Search movies..." />
      <button onClick={searchMovies}>Search</button>
      {loading && <p>Loading...</p>}
      {error && <p>Error: {error}</p>}
      <ul>
        {movies.map(movie => (
          <li key={movie.imdbID}>{movie.Title} ({movie.Year})</li>
        ))}
      </ul>
    </div>
  );
}
```

3.7 Project Checklist

· Routes work correctly.
· Forms validate and submit.
· API calls handle loading/error.
· State is shared where needed.
· App is responsive.

3.8 Interview Questions

Q: What intermediate project did you build and what challenges did you face?
Answer: I built a movie search app using the OMDb API. A challenge was handling race conditions when the user typed quickly. I solved it by using a cancellation flag in useEffect or by using AbortController. This taught me about async cleanup and handling API responses.

---

4. Advanced Projects

4.1 Definition

Advanced projects are complex applications that require advanced state management, performance optimization, testing, authentication/authorization, and possibly real-time features or server-side rendering. They often mirror production apps.

4.2 Why They Exist

To demonstrate mastery of React and its ecosystem, and to prepare you for building scalable, maintainable applications in a professional environment.

4.3 Purpose

· Implement complex state with Redux Toolkit or Zustand.
· Use code splitting and lazy loading for performance.
· Write unit and integration tests.
· Implement authentication with JWT and refresh tokens.
· Use TypeScript for type safety.
· Integrate with backend services (Express, MongoDB).
· Deploy with CI/CD.

4.4 Examples of Advanced Projects

· Full Authentication System: Login, registration, protected routes, role-based access.
· Admin Dashboard: Data tables, charts, user management, permissions.
· Real-Time Chat: WebSockets, presence, message history.
· E-Commerce Platform: Cart, checkout, payment gateway, order history.
· Social Media Feed: Infinite scroll, likes, comments, notifications.

4.5 What You Learn

· Production-grade architecture.
· Performance optimizations (memoization, virtualization).
· Testing with Jest and React Testing Library.
· TypeScript integration.
· Security best practices.
· Deployment strategies.

4.6 Implementation Example: Redux Toolkit slice for Cart

```javascript
import { createSlice, createAsyncThunk } from '@reduxjs/toolkit';
import api from '../../services/api';

export const fetchCart = createAsyncThunk('cart/fetchCart', async () => {
  const response = await api.get('/cart');
  return response.data;
});

const cartSlice = createSlice({
  name: 'cart',
  initialState: { items: [], status: 'idle', error: null },
  reducers: {
    addItem: (state, action) => {
      state.items.push(action.payload);
    },
    removeItem: (state, action) => {
      state.items = state.items.filter(item => item.id !== action.payload);
    },
  },
  extraReducers: (builder) => {
    builder
      .addCase(fetchCart.pending, (state) => { state.status = 'loading'; })
      .addCase(fetchCart.fulfilled, (state, action) => {
        state.status = 'succeeded';
        state.items = action.payload;
      })
      .addCase(fetchCart.rejected, (state, action) => {
        state.status = 'failed';
        state.error = action.error.message;
      });
  },
});

export const { addItem, removeItem } = cartSlice.actions;
export default cartSlice.reducer;
```

4.7 Project Checklist

· Uses TypeScript.
· Has authentication and authorization.
· Uses Redux Toolkit or similar.
· Implements code splitting.
· Has tests for critical components.
· Deployed to a hosting platform.

4.8 Interview Questions

Q: Describe an advanced React project you have built. What technologies did you use and why?
Answer: I built a real-time chat application using React, Redux Toolkit, Socket.io, and Express. Redux managed the global state of messages and users; Socket.io handled real-time communication; Express served the API. I used React Router for navigation and React Testing Library for component tests. This project taught me about WebSockets, state synchronization, and handling real-time data.

---

5. Authentication Project (Detailed)

5.1 Definition

An authentication project focuses on implementing user registration, login, logout, protected routes, and token management (JWT). It typically includes a frontend built with React and a backend (Express, Node.js) with a database (MongoDB, PostgreSQL).

5.2 Why It Exists

Authentication is a fundamental requirement for most applications. Building a dedicated project helps you understand security best practices, token flow, and protected route implementation.

5.3 Purpose

· Implement JWT authentication.
· Store tokens securely (HTTP-only cookie for refresh token).
· Create protected routes.
· Manage user state with Context or Redux.
· Handle token refresh automatically.

5.4 Core Features

· User registration with email/password.
· Login/logout.
· Password hashing (server-side).
· Access token and refresh token.
· Protected dashboard page.
· Automatic token refresh.
· Role-based access (admin vs user).
· Loading and error states.

5.5 Architecture

```
Frontend (React)
├── AuthContext (user state, login, logout)
├── ProtectedRoute component
├── Axios instance with interceptors
├── Pages: Login, Register, Dashboard, Admin
Backend (Express)
├── /auth/register
├── /auth/login
├── /auth/refresh
├── /auth/logout
├── /users (protected)
Database (MongoDB)
├── users collection
```

5.6 Technologies

· React, React Router, Axios
· Redux Toolkit or Context API
· Express, jsonwebtoken, bcrypt
· MongoDB, Mongoose

5.7 Implementation Steps

1. Set up backend with Express and MongoDB.
2. Create user model with password hashing (bcrypt).
3. Implement register and login endpoints that return access token (short-lived) and set refresh token in HTTP-only cookie.
4. Create refresh endpoint to issue new access token using refresh cookie.
5. Set up React app with React Router.
6. Create AuthContext to manage user state and tokens.
7. Build login and registration forms with validation.
8. Implement Axios instance with request interceptor to add access token, and response interceptor to refresh on 401.
9. Create ProtectedRoute component.
10. Build dashboard and admin pages with role checks.
11. Test all flows.

5.8 Code Snippets

Backend: Login endpoint (simplified)

```javascript
app.post('/auth/login', async (req, res) => {
  const { email, password } = req.body;
  const user = await User.findOne({ email });
  if (!user || !(await bcrypt.compare(password, user.password))) {
    return res.status(401).json({ message: 'Invalid credentials' });
  }
  const accessToken = jwt.sign({ userId: user._id, role: user.role }, process.env.ACCESS_TOKEN_SECRET, { expiresIn: '15m' });
  const refreshToken = jwt.sign({ userId: user._id }, process.env.REFRESH_TOKEN_SECRET, { expiresIn: '7d' });
  res.cookie('refreshToken', refreshToken, { httpOnly: true, secure: true, sameSite: 'strict', maxAge: 7*24*60*60*1000 });
  res.json({ accessToken, user: { id: user._id, email: user.email, role: user.role } });
});
```

Frontend: Axios interceptor for refresh

```javascript
api.interceptors.response.use(
  (response) => response,
  async (error) => {
    const originalRequest = error.config;
    if (error.response?.status === 401 && !originalRequest._retry) {
      originalRequest._retry = true;
      try {
        const res = await axios.post('/auth/refresh', {}, { withCredentials: true });
        const newAccessToken = res.data.accessToken;
        originalRequest.headers.Authorization = `Bearer ${newAccessToken}`;
        return api(originalRequest);
      } catch (refreshError) {
        // redirect to login
        return Promise.reject(refreshError);
      }
    }
    return Promise.reject(error);
  }
);
```

5.9 What You Learn

· JWT auth flow.
· Secure token storage.
· Axios interceptors.
· Protected routes.
· Role-based access control.
· Full-stack integration.

5.10 Interview Questions

Q: How did you implement token refresh in your authentication project?
Answer: I used Axios response interceptor. When a request returned 401, the interceptor called the refresh endpoint with the HTTP-only cookie, received a new access token, and retried the original request. If refresh failed, the user was redirected to login.

Q: Why did you store the refresh token in an HTTP-only cookie instead of localStorage?
Answer: HTTP-only cookies are not accessible via JavaScript, so they are protected from XSS attacks. This makes them safer for storing long-lived refresh tokens. The access token was kept in memory to further reduce XSS risk.

---

6. CRUD Project (Detailed)

6.1 Definition

A CRUD (Create, Read, Update, Delete) project focuses on building a simple application that performs all four basic database operations. It typically involves a list of items (e.g., products, contacts, posts) and forms to create/edit items, with delete functionality. It can be built with a REST API or using a mock backend.

6.2 Why It Exists

CRUD is the foundation of most data-driven applications. Building a dedicated CRUD project solidifies your understanding of API integration, form handling, state management, and UI updates.

6.3 Purpose

· Implement all CRUD operations.
· Connect to a REST API.
· Manage list state and optimistic updates.
· Handle loading, error, and success states.
· Use routing for edit pages.

6.4 Core Features

· List items with pagination/filtering.
· Create new item via form.
· Read item details.
· Update item via edit form.
· Delete item with confirmation.
· API integration with Axios.
· State management with Redux or React Query.

6.5 Architecture

```
Frontend (React)
├── Pages: List, Create, Edit, Details
├── Components: Form, Table, Modal
├── Services: itemsService.js
├── State: Redux slice or React Query
Backend (Express + MongoDB)
├── GET /items
├── GET /items/:id
├── POST /items
├── PUT /items/:id
├── DELETE /items/:id
```

6.6 Implementation Steps

1. Set up backend with REST endpoints for items.
2. Create frontend service functions for each operation.
3. Implement list page with useEffect to fetch items.
4. Create form components with React Hook Form and validation.
5. Handle create and edit submissions, updating state or refetching.
6. Implement delete with confirmation modal.
7. Add routing for create/edit pages.
8. Use React Query or Redux for server state and caching.

6.7 Code Snippet: React Query Mutation

```jsx
import { useMutation, useQuery, useQueryClient } from '@tanstack/react-query';
import { createItem } from '../services/itemsService';

function CreateItem() {
  const queryClient = useQueryClient();
  const mutation = useMutation(createItem, {
    onSuccess: () => {
      queryClient.invalidateQueries('items');
    },
  });

  const handleSubmit = (data) => {
    mutation.mutate(data);
  };

  return <ItemForm onSubmit={handleSubmit} loading={mutation.isLoading} />;
}
```

6.8 What You Learn

· REST API integration.
· Form handling.
· State management for server data.
· Optimistic updates and cache invalidation.
· CRUD operations in a real app.

6.9 Interview Questions

Q: How did you handle optimistic updates in your CRUD project?
Answer: I used React Query's onMutate to optimistically update the cache before the server response. If the mutation failed, I rolled back using the context provided by onMutate. This provided a smooth user experience.

Q: How did you manage forms for create and edit?
Answer: I used React Hook Form with Zod validation. For edit, I prefilled the form with the existing data fetched from the API. On submit, I called the update service function and invalidated the list query.

---

7. E-Commerce Project (Detailed)

7.1 Definition

An e-commerce project is a full-featured online store with product listing, product details, shopping cart, checkout, payment integration, and order history. It is a complex application that combines many React concepts and often requires a backend with database and payment gateway (e.g., Stripe).

7.2 Why It Exists

E-commerce is a common real-world application. Building one demonstrates your ability to handle complex state, user interactions, security, and performance.

7.3 Purpose

· Build a complete shopping experience.
· Implement product catalog with filters/search.
· Manage cart state (add, remove, update quantity).
· Implement checkout flow with payment.
· Protect routes with authentication.
· Handle order history.

7.4 Core Features

· Product listing with categories, filters, search, sorting.
· Product detail page.
· Shopping cart (add, remove, update quantity) with persistence.
· Checkout process (shipping address, payment).
· Order summary and confirmation.
· User authentication and order history.
· Admin dashboard for managing products/orders (optional).

7.5 Architecture

```
Frontend (React)
├── Features: products, cart, checkout, orders, auth
├── State: Redux Toolkit (cart, auth) + RTK Query (products, orders)
├── Routing: React Router with protected routes
├── Payment: Stripe Elements or Checkout
Backend (Express + MongoDB)
├── Products API
├── Cart API (or client-only)
├── Orders API
├── Payment API (Stripe)
├── Auth API
```

7.6 Technologies

· React, Redux Toolkit, RTK Query
· React Router
· Stripe for payments
· Express, MongoDB, Mongoose
· Tailwind CSS or Styled Components

7.7 Implementation Steps

1. Design database schema (products, orders, users).
2. Set up backend with product and order endpoints.
3. Build frontend product listing with filters.
4. Implement cart slice in Redux with localStorage persistence (Redux Persist).
5. Create product detail page with add to cart.
6. Build cart page with quantity update and remove.
7. Implement checkout flow with address form and payment (Stripe).
8. Create orders API and save order after successful payment.
9. Add authentication and protect checkout route.
10. Build order history page.
11. Implement admin dashboard for product CRUD (optional).

7.8 Code Snippet: Cart slice with Redux Toolkit

```javascript
import { createSlice } from '@reduxjs/toolkit';

const cartSlice = createSlice({
  name: 'cart',
  initialState: { items: [], totalAmount: 0 },
  reducers: {
    addItem: (state, action) => {
      const existing = state.items.find(item => item.id === action.payload.id);
      if (existing) {
        existing.quantity += 1;
      } else {
        state.items.push({ ...action.payload, quantity: 1 });
      }
      state.totalAmount += action.payload.price;
    },
    removeItem: (state, action) => {
      const existing = state.items.find(item => item.id === action.payload);
      if (existing.quantity === 1) {
        state.items = state.items.filter(item => item.id !== action.payload);
      } else {
        existing.quantity -= 1;
      }
      state.totalAmount -= existing.price;
    },
    clearCart: (state) => {
      state.items = [];
      state.totalAmount = 0;
    },
  },
});

export const { addItem, removeItem, clearCart } = cartSlice.actions;
export default cartSlice.reducer;
```

7.9 What You Learn

· Complex state management.
· Payment integration.
· Secure checkout flow.
· Performance optimization (memoization, lazy loading).
· Full-stack architecture.

7.10 Interview Questions

Q: How did you handle payment in your e-commerce project?
Answer: I used Stripe. On the frontend, I used Stripe Elements to collect payment details securely. The backend created a payment intent and returned the client secret. After confirmation, the order was saved to the database. This kept sensitive payment data off my server.

Q: How did you persist the cart across page reloads?
Answer: I used Redux Persist to save the cart slice to localStorage. This ensured that the cart items were restored when the user refreshed the page. I configured whitelist to only persist the cart slice.

---

8. Admin Dashboard (Detailed)

8.1 Definition

An admin dashboard is a backend interface for managing application data, users, and analytics. It typically includes data tables, charts, forms for CRUD operations, and role-based access control. It is commonly used to manage an application's content and monitor key metrics.

8.2 Why It Exists

Admin dashboards are essential for managing web applications. Building one demonstrates your ability to create complex UIs with data visualization, table management, and fine-grained permissions.

8.3 Purpose

· Build a responsive admin interface.
· Implement data tables with sorting, pagination, filtering.
· Use charts to visualize analytics.
· Manage users and roles.
· Perform CRUD operations on various resources.
· Protect routes with admin role.

8.4 Core Features

· Dashboard with key metrics (total users, orders, revenue).
· Data tables for users, products, orders.
· Add/edit/delete forms for resources.
· Role-based access (admin only).
· Charts using Recharts or Chart.js.
· Responsive layout with sidebar navigation.

8.5 Architecture

```
Frontend (React)
├── Features: dashboard, users, products, orders
├── Components: Sidebar, DataTable, Modal, Form
├── State: Redux Toolkit + RTK Query
├── Routing: Protected admin routes
├── Charts: Recharts
Backend (Express + MongoDB)
├── Admin API (restricted to admin role)
├── Analytics endpoints
```

8.6 Implementation Steps

1. Set up backend with admin-only routes (middleware to check role).
2. Design dashboard layout with sidebar and main content area.
3. Create data tables with pagination and sorting.
4. Implement CRUD forms for each resource.
5. Integrate charts for analytics.
6. Add authentication and role-based route protection.
7. Implement search and filters.
8. Test all functionalities.

8.7 Code Snippet: Admin route protection

```jsx
function AdminRoute({ children }) {
  const { user, isAuthenticated } = useAuth();
  if (!isAuthenticated) return <Navigate to="/login" replace />;
  if (user.role !== 'admin') return <Navigate to="/unauthorized" replace />;
  return children;
}
```

8.8 What You Learn

· Complex UI with tables and charts.
· Role-based access control.
· Advanced CRUD operations.
· Responsive design.
· Data visualization.

8.9 Interview Questions

Q: How did you implement role-based access in your admin dashboard?
Answer: I created an AdminRoute component that checks if the user is authenticated and has the admin role. If not, it redirects to login or unauthorized page. This was enforced on both frontend routes and backend middleware.

Q: What library did you use for charts and why?
Answer: I used Recharts because it is built for React, easy to integrate, and provides a variety of chart types (line, bar, pie) with good documentation. It allowed me to create interactive charts with minimal configuration.

---

9. Real-Time Chat (Detailed)

9.1 Definition

A real-time chat application allows users to send and receive messages instantly, without page refresh. It typically uses WebSockets (Socket.io) for real-time communication and a backend to handle rooms, presence, and message persistence. It demonstrates advanced asynchronous data handling and state synchronization.

9.2 Why It Exists

Real-time features are increasingly common in modern web apps (chat, notifications, live updates). Building a chat app teaches you WebSockets, handling concurrent data, and managing real-time state.

9.3 Purpose

· Implement WebSocket communication with Socket.io.
· Manage chat rooms and user presence.
· Persist message history.
· Handle real-time message updates in state.
· Implement typing indicators and read receipts (optional).

9.4 Core Features

· User authentication.
· Chat rooms or direct messages.
· Real-time message sending/receiving.
· Display online users / presence.
· Message history (loaded on join).
· Typing indicator.
· Notifications for new messages.

9.5 Architecture

```
Frontend (React)
├── Chat components: ChatRoom, MessageList, MessageInput
├── State: Redux (messages, onlineUsers) + Socket.io client
├── AuthContext
Backend (Express + Socket.io + MongoDB)
├── Socket.io server handling connections
├── REST API for auth and message history
├── MongoDB for users, messages
```

9.6 Implementation Steps

1. Set up Express server with Socket.io.
2. Authenticate socket connections using JWT.
3. Create chat room and message models.
4. On client, connect to Socket.io and join room.
5. Send messages via socket events.
6. Listen for new messages and update Redux state.
7. Load message history when entering a room.
8. Implement presence (online/offline) via socket events.
9. Add typing indicators (debounced).
10. Persist messages to MongoDB.

9.7 Code Snippet: Socket.io client setup

```javascript
import io from 'socket.io-client';

const socket = io(process.env.REACT_APP_SOCKET_URL, {
  auth: {
    token: accessToken,
  },
});

socket.on('connect', () => {
  socket.emit('join-room', roomId);
});

socket.on('new-message', (message) => {
  dispatch(addMessage(message));
});
```

9.8 What You Learn

· WebSockets and real-time communication.
· Managing real-time state with Redux.
· Authentication for sockets.
· Handling concurrent updates.
· Scaling considerations (pub/sub, message queues).

9.9 Interview Questions

Q: How did you handle real-time message updates in your chat application?
Answer: I used Socket.io on both server and client. The client dispatched Redux actions when new messages arrived via socket events. This updated the message list in real time. I also implemented optimistic sending: the message is added to the local state immediately, then confirmed by the server, with error handling if it failed.

Q: How did you ensure message order in a real-time chat?
Answer: Messages were sorted by timestamp or by a monotonically increasing ID on the server. When receiving a message, I inserted it into the correct position in the Redux store to maintain order. Additionally, I used a sequence number from the server to handle any out-of-order delivery.

---

10. Full-Stack React Project (Detailed)

10.1 Definition

A full-stack React project combines a React frontend with a backend (Express, Node.js) and database (MongoDB, PostgreSQL). It integrates all layers: frontend, backend API, database, authentication, and deployment. This type of project demonstrates your ability to build a complete application from scratch.

10.2 Why It Exists

To show end-to-end development skills. It proves you can design an architecture, implement features, handle security, and deploy the application. It is the most comprehensive type of project for a portfolio.

10.3 Purpose

· Build a complete application with frontend and backend.
· Implement REST API and database models.
· Handle authentication and authorization.
· Deploy to a hosting platform or VPS.
· Document and test the application.

10.4 Core Features

· User authentication (JWT, refresh tokens).
· CRUD operations for main resources.
· State management (Redux Toolkit).
· API service layer.
· Routing with protected routes.
· Responsive design.
· Testing (unit/integration).
· Deployment with CI/CD.

10.5 Architecture

```
Client (React)
├── src/
│   ├── app/ (store, router)
│   ├── features/ (auth, products, orders)
│   ├── shared/ (components, hooks, utils)
│   ├── services/ (api client)
│   └── types/
Server (Express)
├── routes/
├── controllers/
├── models/
├── middleware/
└── config/
Database (MongoDB)
├── collections
```

10.6 Implementation Steps

1. Plan the application: features, data models.
2. Set up backend with Express and MongoDB, define schemas.
3. Create API endpoints with validation and error handling.
4. Implement authentication with JWT and refresh tokens.
5. Set up React frontend with Vite, TypeScript, and Redux Toolkit.
6. Configure Axios instance with interceptors.
7. Build feature modules, connecting to API.
8. Implement protected routes and role-based access.
9. Write tests for critical components and APIs.
10. Set up CI/CD pipeline (GitHub Actions) and deploy to Vercel/Netlify (frontend) and Render/Heroku (backend).

10.7 Code Snippet: Backend route with controller

```javascript
// routes/users.js
const router = require('express').Router();
const usersController = require('../controllers/usersController');
const authMiddleware = require('../middleware/auth');

router.get('/', authMiddleware.authenticate, usersController.getUsers);
router.post('/', authMiddleware.authenticate, authMiddleware.authorize('admin'), usersController.createUser);

module.exports = router;
```

10.8 What You Learn

· Complete full-stack development.
· Architecture design.
· Security best practices.
· Testing and deployment.
· Project management and documentation.

10.9 Interview Questions

Q: Describe your full-stack React project. What was your role and what technologies did you use?
Answer: I built a task management application with React, TypeScript, Redux Toolkit, Express, and MongoDB. I designed the API, implemented authentication with JWT and refresh tokens, built the frontend with protected routes, and wrote tests. I deployed the frontend to Netlify and the backend to Render. The project taught me how to integrate all layers of a web application.

Q: How did you structure your full-stack project for maintainability?
Answer: I used a feature-based structure on the frontend, separating features into folders with their own components, hooks, and slices. On the backend, I used MVC pattern with routes, controllers, and models. I also used environment variables for configuration and a service layer for API calls.

---

11. Project Best Practices and Common Mistakes

11.1 Best Practices

· Plan before coding: define requirements, data models, and architecture.
· Use version control: commit regularly with meaningful messages.
· Write tests: start with critical paths, aim for good coverage.
· Document: write README with setup instructions.
· Follow coding standards: consistent naming, folder structure.
· Handle errors gracefully: loading, error, empty states.
· Optimize performance: code splitting, memoization where needed.
· Secure: validate input, use HTTPS, keep secrets server-side.
· Deploy early: catch integration issues.

11.2 Common Mistakes

· Overcomplicating: adding unnecessary features or libraries.
· Ignoring security: storing secrets in frontend, no validation.
· Not handling loading/error states: UI hangs or crashes.
· Poor state management: prop drilling, scattered state.
· Skipping tests: leads to regressions.
· Not using environment variables: hardcoding endpoints.
· Neglecting responsive design: app looks bad on mobile.
· Not documenting: difficult for others to understand.

---

12. Interview Questions – Module 21

Beginner

1. What project are you most proud of and why?
      Answer: I'm proud of my e-commerce project because it integrated many concepts: authentication, cart state, payment, and deployment. It challenged me to think about architecture and user experience.
2. What was the most difficult part of your project and how did you overcome it?
      Answer: The token refresh flow was tricky. I solved it by using Axios interceptors with a queue to handle concurrent 401s without multiple refresh calls.

Intermediate

1. How do you decide on the state management solution for a project?
      Answer: I consider the complexity and scale. For simple global state, Context API is enough. For complex state with frequent updates and middleware, I use Redux Toolkit. For server state, I use RTK Query or React Query. I also consider team familiarity.
2. Describe your approach to testing a full-stack project.
      Answer: I write unit tests for critical components and hooks using React Testing Library, and integration tests for API calls with MSW. For backend, I test endpoints with Jest and Supertest. I also include E2E tests with Cypress for main flows.

Advanced

1. How would you scale a React application as the team and codebase grow?
      Answer: Use a feature-based architecture, enforce coding standards with ESLint/Prettier, use TypeScript, implement code splitting for performance, and set up CI/CD for automated testing and deployment. Also consider micro-frontends for very large teams.
2. What are the key considerations when deploying a full-stack React app?
      Answer: Environment configuration, HTTPS, CORS, security headers, token storage, server scaling, database connection pooling, and monitoring. I would use a containerized setup with Docker and orchestration if needed.

Scenario-Based

Q: You are asked to build a project that requires real-time updates. What technologies would you choose and how would you implement it?
Answer: I would use Socket.io for WebSocket communication, React with Redux for state, and a backend like Node.js. I'd set up socket events for real-time messages and dispatch Redux actions to update the UI. I'd also consider using a pub/sub system for scaling.

Coding Questions

1. Write a simple counter component with increment and decrement buttons (for beginner project).

```jsx
import { useState } from 'react';
function Counter() {
  const [count, setCount] = useState(0);
  return (
    <div>
      <button onClick={() => setCount(count - 1)}>-</button>
      {count}
      <button onClick={() => setCount(count + 1)}>+</button>
    </div>
  );
}
```

2. Show how you would set up a protected route in a project.

```jsx
function ProtectedRoute() {
  const { isAuthenticated } = useAuth();
  return isAuthenticated ? <Outlet /> : <Navigate to="/login" replace />;
}
```

---

13. Quick Revision – Module 21

· Beginner projects build foundational skills.
· Intermediate projects introduce routing, forms, APIs.
· Advanced projects cover performance, testing, real-time.
· Authentication project teaches JWT, token refresh, protected routes.
· CRUD project teaches REST API integration and state management.
· E-commerce project combines many concepts with payment.
· Admin dashboard teaches tables, charts, role-based access.
· Real-time chat teaches WebSockets and real-time state.
· Full-stack project demonstrates end-to-end development.
· Always plan, test, secure, and deploy.

---

14. Project Ideas Repository

· Beginner: Counter, Todo, Clock, Profile Card.
· Intermediate: Expense Tracker, Movie Search, Quiz App, Notes.
· Advanced: Full Authentication, Admin Dashboard, Real-time Chat, E-Commerce.

---

This concludes Module 21: Projects and the core curriculum. The next section will provide a Full-Stack Add-On: Express & MongoDB to complement the full-stack aspects, followed by a consolidated Final Cheat Sheet and Final Interview Revision.


Module 22: Node.js

Node.js is a JavaScript runtime built on Chrome's V8 JavaScript engine. It allows developers to run JavaScript on the server side, enabling the development of scalable network applications. This module covers the fundamentals of Node.js, its architecture, core modules, event loop, and how it integrates with backend development. Understanding Node.js is essential for building full-stack applications with Express and databases like MongoDB/PostgreSQL.

---

1. Definition

1.1 What is Node.js?

Node.js is an open-source, cross-platform JavaScript runtime environment that executes JavaScript code outside a web browser. It uses an event-driven, non-blocking I/O model, making it lightweight and efficient for building scalable network applications, especially APIs and real-time services.

1.2 What Problem It Solves

Before Node.js, JavaScript was primarily a client-side language. Node.js enables developers to use JavaScript for server-side programming, unifying the language across the full stack. It solves the problem of handling many concurrent connections efficiently by using asynchronous, non-blocking I/O, which is ideal for I/O-heavy applications.

1.3 Why It Was Introduced

Node.js was created in 2009 by Ryan Dahl to build web servers that could handle many simultaneous connections with minimal overhead. Traditional server models (thread-per-connection) were inefficient for I/O-bound tasks. Node.js introduced an event loop and non-blocking I/O, allowing a single thread to handle many connections.

1.4 Where It Is Used

· REST APIs and microservices
· Real-time applications (chat, gaming)
· Command-line tools
· Backend for single-page applications (SPA)
· Serverless functions
· Data streaming

1.5 When It Should Be Used

· When building I/O-intensive applications.
· When you want a single language for frontend and backend.
· When you need high concurrency with low resource usage.
· For prototyping and building fast, scalable APIs.

1.6 When It Should Not Be Used

· CPU-intensive tasks (heavy computation, video encoding) – better with languages like Go or Rust, or use worker threads.
· When you need strong multi-threaded processing (Node.js is single-threaded for user code, though worker threads exist).
· When the ecosystem's asynchronous nature might be confusing for teams not familiar with it.

1.7 Relationship with Surrounding Concepts

· NPM: Node Package Manager, used to install libraries.
· Express: Web framework built on top of Node.js.
· MongoDB/PostgreSQL: Databases commonly used with Node.js.
· JavaScript: Node.js executes JavaScript, sharing syntax and features (ES6+).

---

2. Why Node.js Exists

2.1 The Problem Before Node.js

Before Node.js, building server-side applications required learning a different language (e.g., PHP, Python, Ruby) than the frontend. This created a language barrier and made full-stack development more complex. Additionally, traditional server models struggled with many concurrent connections due to blocking I/O and thread overhead.

2.2 The Solution Node.js Provides

Node.js uses an event-driven, non-blocking I/O model, which allows handling thousands of concurrent connections with a single process. It also brings JavaScript to the server, enabling full-stack JavaScript development, code reuse, and a vast npm ecosystem.

2.3 What Happens If We Don't Use It?

Without Node.js, you would need to use another backend technology. While that is perfectly valid, you would miss the benefits of:

· Shared language and tooling.
· High performance for I/O-heavy workloads.
· Rich ecosystem of JavaScript libraries.
· Rapid development and prototyping.

2.4 Alternatives

· Python (Django, Flask)
· Ruby (Rails)
· Go
· PHP (Laravel)
· Java (Spring Boot)
· C# (.NET)

2.5 Why Choose Node.js?

· Performance: Non-blocking I/O handles many requests efficiently.
· Developer productivity: One language for frontend and backend.
· Ecosystem: npm provides a huge library of packages.
· Community: Large and active.
· Scalability: Easy to scale horizontally.

---

3. Core Concepts

3.1 Event Loop

The event loop is the heart of Node.js. It allows Node.js to perform non-blocking I/O operations despite JavaScript being single-threaded. The event loop continuously checks the call stack and the callback queue. When the call stack is empty, it picks callbacks from the queue and executes them.

Phases of the event loop:

1. Timers: executes callbacks scheduled by setTimeout() and setInterval().
2. Pending callbacks: executes I/O callbacks deferred to the next loop iteration.
3. Idle, prepare: internal.
4. Poll: retrieve new I/O events; execute I/O-related callbacks.
5. Check: setImmediate() callbacks.
6. Close callbacks: socket.on('close', ...).

3.2 Non-Blocking I/O

Node.js uses asynchronous operations. For example, reading a file does not block the execution of other code. Instead, a callback is invoked when the operation completes. This is achieved through libuv, a multi-platform support library.

3.3 Modules

Node.js has a module system based on CommonJS. Modules encapsulate code and allow exporting/importing functionality.

· Core modules: built-in (e.g., fs, http, path, os).
· Local modules: files in the project.
· Third-party modules: installed via npm.

3.4 Package.json

Defines project metadata, dependencies, and scripts. Already covered earlier, but essential in Node.js.

3.5 Asynchronous Patterns

· Callbacks: traditional but prone to "callback hell".
· Promises: modern, chainable.
· Async/await: syntactic sugar over promises, making asynchronous code look synchronous.

---

4. Prerequisites

Before learning Node.js, you should understand:

· JavaScript fundamentals (variables, functions, ES6+)
· Basic command-line usage
· HTML/CSS (for full-stack context)
· Basic understanding of HTTP and web servers

---

5. Internal Working

5.1 Architecture Overview

```mermaid
flowchart LR
    JS[JavaScript Code] --> V8[V8 Engine]
    V8 --> libuv[libuv Library]
    libuv --> ThreadPool[Thread Pool]
    libuv --> EventLoop[Event Loop]
    EventLoop --> Callbacks[Callback Queue]
    Callbacks --> V8
```

· V8: compiles and executes JavaScript.
· libuv: handles asynchronous I/O, event loop, thread pool.
· Event loop: orchestrates callbacks.
· Thread pool: for some operations (file system, DNS) that are not inherently async.

5.2 Request Flow in a Node.js HTTP Server

```mermaid
sequenceDiagram
    Client->>Server: HTTP Request
    Server->>EventLoop: Request queued
    EventLoop->>Handler: Execute handler
    Handler->>Database: Async query
    Database-->>Handler: Result (callback)
    Handler->>Client: Response
```

Node.js handles requests without spawning a new thread per request. Instead, it uses callbacks and the event loop to manage concurrency.

5.3 Memory and Threading

· Node.js runs JavaScript in a single thread, but I/O operations are offloaded to libuv's thread pool or the OS.
· User code should avoid blocking the event loop (e.g., heavy loops) because it prevents processing other requests.

---

6. Syntax and Structure

6.1 Basic HTTP Server

```javascript
const http = require('http');

const server = http.createServer((req, res) => {
  res.writeHead(200, { 'Content-Type': 'text/plain' });
  res.end('Hello, World!\n');
});

server.listen(3000, () => {
  console.log('Server running at http://localhost:3000/');
});
```

6.2 Using ES Modules

Node.js supports ES modules (import/export) with .mjs extension or by setting "type": "module" in package.json.

```javascript
// ES module syntax
import http from 'http';
```

6.3 CommonJS vs ES Modules

· CommonJS: require(), module.exports.
· ES Modules: import, export.

Modern projects often use ES modules, but CommonJS is still widely used in existing codebases.

6.4 File System Module

```javascript
const fs = require('fs');

// Asynchronous read
fs.readFile('example.txt', 'utf8', (err, data) => {
  if (err) throw err;
  console.log(data);
});

// Synchronous read (blocking)
const data = fs.readFileSync('example.txt', 'utf8');

// Promises version
const fsPromises = require('fs').promises;
const data = await fsPromises.readFile('example.txt', 'utf8');
```

6.5 Path Module

```javascript
const path = require('path');

const fullPath = path.join(__dirname, 'folder', 'file.txt');
console.log(fullPath);
```

6.6 Environment Variables

```javascript
const port = process.env.PORT || 3000;
```

Use .env files with dotenv package.

---

7. Basic Example

7.1 Hello World HTTP Server

```javascript
const http = require('http');

const server = http.createServer((req, res) => {
  res.statusCode = 200;
  res.setHeader('Content-Type', 'text/plain');
  res.end('Hello World');
});

server.listen(3000, '127.0.0.1', () => {
  console.log('Server running at http://127.0.0.1:3000/');
});
```

7.2 Using Express (simplified)

```javascript
const express = require('express');
const app = express();

app.get('/', (req, res) => {
  res.send('Hello World');
});

app.listen(3000, () => {
  console.log('Server started on port 3000');
});
```

---

8. Practical Example

8.1 Building a Simple REST API with Node.js (no framework)

```javascript
const http = require('http');
const url = require('url');

const data = [
  { id: 1, name: 'Alice' },
  { id: 2, name: 'Bob' },
];

const server = http.createServer((req, res) => {
  const parsedUrl = url.parse(req.url, true);
  const method = req.method;

  if (method === 'GET' && parsedUrl.pathname === '/users') {
    res.writeHead(200, { 'Content-Type': 'application/json' });
    res.end(JSON.stringify(data));
  } else if (method === 'GET' && parsedUrl.pathname.startsWith('/users/')) {
    const id = parseInt(parsedUrl.pathname.split('/')[2]);
    const user = data.find(u => u.id === id);
    if (user) {
      res.writeHead(200, { 'Content-Type': 'application/json' });
      res.end(JSON.stringify(user));
    } else {
      res.writeHead(404);
      res.end('User not found');
    }
  } else {
    res.writeHead(404);
    res.end('Not found');
  }
});

server.listen(3000, () => console.log('API running'));
```

8.2 File-based CRUD with FS

Using fs/promises to read/write JSON file as a simple database.

---

9. Advanced Example

9.1 Using Streams for Large Files

```javascript
const fs = require('fs');
const http = require('http');

http.createServer((req, res) => {
  const stream = fs.createReadStream('large-file.txt');
  stream.pipe(res);
}).listen(3000);
```

Streams allow handling large files without loading them entirely into memory.

9.2 Cluster Module for Multi-Core

```javascript
const cluster = require('cluster');
const http = require('http');
const numCPUs = require('os').cpus().length;

if (cluster.isMaster) {
  console.log(`Master ${process.pid} is running`);
  for (let i = 0; i < numCPUs; i++) {
    cluster.fork();
  }
  cluster.on('exit', (worker) => {
    console.log(`Worker ${worker.process.pid} died`);
  });
} else {
  http.createServer((req, res) => {
    res.writeHead(200);
    res.end('Hello from worker ' + process.pid);
  }).listen(8000);
  console.log(`Worker ${process.pid} started`);
}
```

This uses multiple processes to utilize multiple CPU cores.

---

10. Real-World Scenario

10.1 Problem: Building a Backend for a React SPA

A React frontend needs a backend API to handle user authentication, data persistence, and real-time updates. Node.js with Express and MongoDB provides a scalable solution.

10.2 Solution

· Use Node.js as the runtime.
· Use Express for routing and middleware.
· Use MongoDB (via Mongoose) for data storage.
· Implement JWT authentication.
· Deploy backend to a cloud platform.

10.3 Architecture

```mermaid
flowchart LR
    React[React Frontend] --> API[Express API]
    API --> Auth[Authentication Middleware]
    API --> DB[(MongoDB)]
    API --> Realtime[WebSocket]
```

10.4 Implementation Highlights

· REST endpoints for users, products.
· JWT authentication with access/refresh tokens.
· MongoDB schemas and models.
· Error handling middleware.
· Environment variables for configuration.

---

11. Common Mistakes

1. Blocking the event loop with heavy synchronous operations (e.g., large JSON parsing, long loops).
2. Callback hell due to deeply nested callbacks; use Promises/async-await.
3. Not handling errors in callbacks or promises.
4. Ignoring environment variables for production configuration.
5. Using fs.readFileSync in request handlers, which blocks.
6. Memory leaks due to unclosed connections or timers.
7. Not using package-lock.json with npm install (use npm ci in production).
8. Exposing sensitive data in logs or API responses.

---

12. Best Practices

· Use asynchronous non-blocking I/O.
· Use async/await for readability.
· Centralize error handling.
· Use environment variables and a config module.
· Use a process manager like PM2 in production.
· Implement logging and monitoring.
· Write unit and integration tests.
· Use npm ci in CI/CD.
· Keep modules small and focused.
· Use dotenv for environment variables, but never commit .env.

---

13. Security

· Validate and sanitize all user inputs.
· Use helmet to set secure HTTP headers.
· Use cors carefully; restrict origins.
· Hash passwords with bcrypt.
· Use JWT with short expiry and refresh tokens.
· Prevent SQL/NoSQL injection (use ORM/ODM with parameterized queries).
· Implement rate limiting (express-rate-limit).
· Use HTTPS.
· Keep dependencies updated; run npm audit.

---

14. Performance and Scalability

· Use the cluster module to utilize multi-core CPUs.
· Use caching (Redis) for frequently accessed data.
· Use compression middleware.
· Use connection pooling for databases.
· Load balance across multiple instances.
· Use CDN for static assets (if serving frontend).
· Avoid blocking I/O.
· Profile and monitor with tools like clinic, pm2 monit.

---

15. Testing

· Use jest or mocha with chai for unit testing.
· Use supertest for testing HTTP endpoints.
· Mock external services.
· Test asynchronous code with async/await.
· Write integration tests with a test database.

Example using Jest + Supertest:

```javascript
const request = require('supertest');
const app = require('../app');

describe('GET /users', () => {
  it('responds with json', async () => {
    const res = await request(app).get('/users');
    expect(res.statusCode).toBe(200);
    expect(res.body).toHaveLength(2);
  });
});
```

---

16. Comparison: Node.js vs Other Backend Technologies

Feature Node.js Python (Django) Go Java (Spring)
Language JavaScript Python Go Java
Model Single-threaded event loop Multi-threaded Concurrency via goroutines Multi-threaded
Performance High for I/O Moderate High for CPU/IO High
Learning Curve Low (if JS known) Low Moderate High
Ecosystem npm (huge) PyPI Go modules Maven
Use Case APIs, real-time Web apps, data Microservices, high performance Enterprise

---

17. Quick Revision

· Node.js is a JavaScript runtime for server-side development.
· Non-blocking, event-driven I/O.
· Event loop handles concurrency.
· Core modules: fs, http, path, os, etc.
· Use require() (CommonJS) or import (ES modules).
· Use Promises and async/await.
· Deploy with PM2, cluster.
· Security: helmet, cors, bcrypt, JWT.
· Test with Jest/Supertest.

---

18. Interview Questions – Module 22

Beginner

1. What is Node.js?
      Node.js is a JavaScript runtime built on Chrome's V8 engine that allows running JavaScript on the server side, using an event-driven, non-blocking I/O model.
2. What is the event loop?
      The event loop is the mechanism that allows Node.js to perform non-blocking I/O operations by offloading operations to the system kernel whenever possible and then picking up callbacks when the operation completes.
3. What is npm?
      npm is the Node Package Manager, used to install and manage JavaScript packages.

Intermediate

1. Explain the difference between blocking and non-blocking I/O.
      Blocking I/O stops the execution of further code until the operation completes. Non-blocking I/O allows other code to execute while the operation is in progress, with a callback handling the result.
2. How does Node.js handle concurrency if it's single-threaded?
      Node.js uses an event loop and asynchronous I/O. User code runs on a single thread, but I/O operations are delegated to the system or a thread pool, and callbacks are executed when the event loop is free.
3. What are the core modules in Node.js?
      fs, http, path, os, events, util, crypto, etc.

Advanced

1. How would you scale a Node.js application to multiple cores?
      Use the cluster module to fork worker processes, one per CPU core, sharing the same port. Alternatively, run multiple instances behind a load balancer.
2. What are streams in Node.js and why are they useful?
      Streams are objects that allow reading/writing data in chunks, reducing memory usage and enabling processing of large data sets. They can be used for file operations, HTTP, etc.
3. How do you avoid callback hell?
      Use Promises and async/await, modularize code, and use named functions.

Scenario-Based

Q: Your Node.js server is experiencing high CPU usage. How would you diagnose and fix it?
Answer: I would use profiling tools (Node.js built-in profiler, clinic, pm2) to identify blocking operations. Then I would move CPU-intensive tasks to worker threads or separate services, optimize algorithms, and use caching. I'd also ensure the event loop is not blocked.

---

19. Common Mistakes & Best Practices Summary

Mistake Best Practice
Blocking event loop Use async operations; offload CPU tasks
Callback hell Use async/await
Not handling errors Use try/catch and centralized error handling
Ignoring security Use helmet, validation, JWT, bcrypt
Not using environment variables Centralize config
Not using npm ci in CI Use npm ci for deterministic builds
Not logging Use a logging library (winston, morgan)
Not monitoring Use APM tools

---

This concludes Module 22: Node.js. The next module will be Module 23: Express.js, covering the Express framework in depth.


Module 23: Express.js

Express.js is a minimal, flexible, and widely adopted web application framework for Node.js. It provides a robust set of features for building web and mobile applications, including routing, middleware, and template engines. Express simplifies server-side development by abstracting the repetitive parts of creating HTTP servers and handling requests/responses. This module covers Express in depth, from basic routing to advanced middleware, error handling, and integration with databases.

---

1. Definition

1.1 What is Express.js?

Express.js is a fast, unopinionated, minimalist web framework for Node.js. It provides a thin layer of fundamental web application features, allowing developers to build single-page, multi-page, and hybrid web applications as well as robust APIs. It is built on top of Node.js's http module and enhances it with a powerful routing system, middleware support, and template engine integration.

1.2 What Problem It Solves

Node.js's built-in http module is low-level and requires manual handling of routing, URL parsing, and response management. Express abstracts these details, providing:

· Simple and expressive route definitions.
· Middleware for processing requests and responses.
· Support for various HTTP methods.
· Integration with template engines (Pug, EJS, etc.).
· Centralized error handling.
· Easier management of query parameters, body parsing, etc.

1.3 Why It Was Introduced

Express was created by TJ Holowaychuk in 2010 to provide a minimal, flexible framework for building web applications and APIs on Node.js. It became the de facto standard for Node.js web development due to its simplicity and extensibility.

1.4 Where It Is Used

· REST APIs and microservices
· Full-stack applications (with React, Angular, Vue frontends)
· Single-page application backends
· Real-time applications (combined with Socket.io)
· Server-side rendered applications (with template engines)

1.5 When It Should Be Used

· When building any HTTP server or API in Node.js.
· When you need a lightweight, unopinionated framework that can be customized with middleware.
· When you want a large ecosystem of middleware and community support.

1.6 When It Should Not Be Used

· If you need a highly opinionated framework with built-in ORM, authentication, etc., consider NestJS or AdonisJS.
· For very simple static file serving, a simpler solution might suffice, though Express can do that too.
· If you prefer a different paradigm, like Koa (by the same team) or Fastify (faster, lower overhead).

1.7 Relationship with Surrounding Concepts

· Node.js: Express runs on Node.js and uses its http module.
· Middleware: Functions that have access to request and response objects.
· MongoDB/PostgreSQL: Common databases used with Express via ODMs/ORMs.
· React/Angular/Vue: Frontend frameworks that consume Express APIs.

---

2. Why Express.js Exists

2.1 The Problem Before Express

Before Express, developers had to use Node.js's raw http module to handle every request, parse URLs, manage different HTTP methods, and manually set response headers. This was repetitive, error-prone, and lacked structure. Middleware concepts were not built-in, making it difficult to add logging, authentication, or body parsing in a reusable way.

2.2 The Solution Express Provides

Express introduces a simple routing system and middleware stack, making server-side development faster and more organized. It allows developers to:

· Define routes based on HTTP method and URL pattern.
· Chain multiple middleware functions.
· Parse request bodies automatically (with express.json()).
· Serve static files.
· Use template engines.
· Centralize error handling.

This reduces boilerplate and enforces good patterns, enabling rapid development and maintainability.

2.3 What Happens If We Don't Use It?

Without Express, you would need to implement your own routing, middleware, and helper functions, which is time-consuming and error-prone. While possible, it defeats the purpose of rapid development and reusability. Alternatives like Fastify or Koa offer similar benefits but with different trade-offs.

2.4 Alternatives

· Fastify: Faster, lower overhead, schema-based validation.
· Koa: Created by Express team, uses async/await natively, more minimal.
· NestJS: Opinionated, built with TypeScript, inspired by Angular.
· Hapi: Configuration-centric, plugin-based.

2.5 Why Choose Express?

· Massive community and ecosystem.
· Well-documented, stable, and battle-tested.
· Flexible and unopinionated.
· Easy to learn for Node.js developers.
· Huge number of middleware and extensions.

---

3. Core Concepts

3.1 Routing

Routing defines how an application responds to client requests to a particular endpoint (URI) and HTTP method (GET, POST, etc.). In Express, routes can be defined at the application level or using express.Router().

3.2 Middleware

Middleware functions are functions that have access to the request object (req), the response object (res), and the next middleware function in the application's request-response cycle. They can execute code, modify request/response objects, end the request, or call next().

3.3 Request and Response Objects

· req: contains information about the HTTP request (params, query, body, headers).
· res: methods to send response (send, json, status, redirect, etc.).

3.4 Template Engines

Express supports various template engines like Pug, EJS, Handlebars, enabling server-side rendering of dynamic HTML.

3.5 Error Handling

Express has a default error handler. You can define custom error-handling middleware with four arguments (err, req, res, next).

3.6 Static Files

Use express.static to serve static files (images, CSS, JS).

3.7 Body Parsing

Use express.json() and express.urlencoded() middleware to parse request bodies.

---

4. Prerequisites

· Node.js and npm installed.
· Understanding of JavaScript (ES6+).
· Basic knowledge of HTTP methods and status codes.
· Command-line basics.

---

5. Internal Working

5.1 How Express Works Under the Hood

Express is built on top of Node.js's http module. When you call app.listen(port), it creates an HTTP server. Incoming requests are processed through a stack of middleware functions and route handlers. Each middleware/handler can either end the response or pass control to the next.

```mermaid
sequenceDiagram
    Client->>Server: HTTP Request
    Server->>Middleware1: Process request
    Middleware1->>Middleware2: next()
    Middleware2->>RouteHandler: match route
    RouteHandler->>Response: send response
    Response-->>Client: HTTP Response
```

5.2 Middleware Execution Flow

Middleware functions are executed in the order they are added. If a middleware doesn't call next(), the request stops there. Route handlers are also middleware, but they typically end the response.

5.3 Routing Matching

Express matches routes based on the request method and URL path. It supports route parameters (:id), query strings, and wildcards. The first matching route handler is executed; if it calls next(), the next matching handler can run.

5.4 Error Handling Flow

When an error is thrown or passed to next(err), Express skips regular middleware and goes to the nearest error-handling middleware (with four parameters). If no error handler exists, Express uses the default error handler.

---

6. Syntax and Structure

6.1 Basic Express Application

```javascript
const express = require('express');
const app = express();
const port = 3000;

app.get('/', (req, res) => {
  res.send('Hello World!');
});

app.listen(port, () => {
  console.log(`Example app listening at http://localhost:${port}`);
});
```

6.2 Routing Methods

· app.get(path, callback)
· app.post(path, callback)
· app.put(path, callback)
· app.delete(path, callback)
· app.patch(path, callback)
· app.all(path, callback) (all methods)
· app.use([path,] callback) (middleware)

6.3 Route Parameters

```javascript
app.get('/users/:userId/books/:bookId', (req, res) => {
  res.send(req.params);
});
```

6.4 Query Parameters

```javascript
app.get('/search', (req, res) => {
  res.send(req.query.q);
});
```

6.5 Request Body Parsing

```javascript
app.use(express.json());
app.use(express.urlencoded({ extended: true }));
```

6.6 Response Methods

· res.send() – send various types.
· res.json() – send JSON.
· res.status(code) – set status.
· res.redirect(url) – redirect.
· res.render(view, data) – render a view.
· res.sendFile(path) – send a file.

6.7 Application Settings

· app.set('view engine', 'ejs')
· app.set('views', './views')

---

7. Basic Example

7.1 Hello World

```javascript
const express = require('express');
const app = express();

app.get('/', (req, res) => {
  res.send('Hello World');
});

app.listen(3000, () => {
  console.log('Server running on port 3000');
});
```

7.2 Handling Multiple Routes

```javascript
app.get('/', (req, res) => res.send('Home'));
app.get('/about', (req, res) => res.send('About'));
app.post('/submit', (req, res) => res.send('Submitted'));
```

---

8. Practical Example

8.1 Building a Simple REST API

```javascript
const express = require('express');
const app = express();
app.use(express.json());

let users = [
  { id: 1, name: 'Alice' },
  { id: 2, name: 'Bob' },
];

// GET all users
app.get('/api/users', (req, res) => {
  res.json(users);
});

// GET single user
app.get('/api/users/:id', (req, res) => {
  const user = users.find(u => u.id === parseInt(req.params.id));
  if (!user) return res.status(404).json({ message: 'User not found' });
  res.json(user);
});

// POST create user
app.post('/api/users', (req, res) => {
  const newUser = { id: users.length + 1, ...req.body };
  users.push(newUser);
  res.status(201).json(newUser);
});

// PUT update user
app.put('/api/users/:id', (req, res) => {
  const user = users.find(u => u.id === parseInt(req.params.id));
  if (!user) return res.status(404).json({ message: 'User not found' });
  Object.assign(user, req.body);
  res.json(user);
});

// DELETE user
app.delete('/api/users/:id', (req, res) => {
  users = users.filter(u => u.id !== parseInt(req.params.id));
  res.status(204).send();
});

app.listen(3000, () => console.log('API running'));
```

8.2 Serving Static Files

```javascript
app.use(express.static('public'));
```

Now files in public/ are accessible (e.g., http://localhost:3000/image.png).

---

9. Advanced Example

9.1 Using Routers and Controllers (MVC)

Create modular structure:

```
project/
├── routes/
│   ├── users.js
│   └── index.js
├── controllers/
│   └── usersController.js
├── models/
│   └── User.js
├── app.js
└── server.js
```

routes/users.js:

```javascript
const express = require('express');
const router = express.Router();
const usersController = require('../controllers/usersController');

router.get('/', usersController.getAllUsers);
router.get('/:id', usersController.getUser);
router.post('/', usersController.createUser);
router.put('/:id', usersController.updateUser);
router.delete('/:id', usersController.deleteUser);

module.exports = router;
```

controllers/usersController.js:

```javascript
exports.getAllUsers = async (req, res, next) => {
  try {
    const users = await User.find();
    res.json(users);
  } catch (err) {
    next(err);
  }
};

exports.createUser = async (req, res, next) => {
  try {
    const newUser = await User.create(req.body);
    res.status(201).json(newUser);
  } catch (err) {
    next(err);
  }
};
// ...
```

app.js:

```javascript
const express = require('express');
const app = express();
app.use(express.json());

app.use('/users', require('./routes/users'));

app.use((err, req, res, next) => {
  console.error(err.stack);
  res.status(500).send('Something broke!');
});

module.exports = app;
```

server.js:

```javascript
const app = require('./app');
app.listen(3000, () => console.log('Server started'));
```

This separation improves maintainability and testability.

9.2 Error Handling Middleware

```javascript
app.use((err, req, res, next) => {
  const status = err.status || 500;
  res.status(status).json({ message: err.message });
});
```

9.3 Using Async Handlers with try-catch or wrapper

To avoid repeating try-catch, use a wrapper:

```javascript
const asyncHandler = (fn) => (req, res, next) =>
  Promise.resolve(fn(req, res, next)).catch(next);

// Usage
exports.getUser = asyncHandler(async (req, res) => {
  const user = await User.findById(req.params.id);
  if (!user) return res.status(404).json({ message: 'Not found' });
  res.json(user);
});
```

---

10. Real-World Scenario

10.1 Problem: Building a Backend for an E-Commerce Application

The application needs:

· Product listing with search/filter.
· User authentication (JWT).
· Shopping cart and orders.
· Role-based access (admin can manage products).

10.2 Solution

· Use Express for API.
· Use MongoDB/Mongoose for data.
· Use bcrypt and jsonwebtoken for authentication.
· Use cors and helmet for security.
· Use express-rate-limit to prevent abuse.
· Structure with routers, controllers, models, and middleware.
· Use environment variables.

10.3 Architecture

```mermaid
flowchart LR
    Client[React Frontend] --> API[Express API]
    API --> Middleware[Middleware Stack]
    Middleware --> Auth[Auth Middleware]
    Middleware --> Validation[Validation Middleware]
    API --> Routes[Routes]
    Routes --> Controllers[Controllers]
    Controllers --> Models[Models]
    Models --> DB[(MongoDB)]
```

10.4 Implementation Highlights

· authMiddleware verifies JWT and attaches user to req.
· roleMiddleware checks role for admin routes.
· validate middleware using Joi or Zod.
· Routes for /products, /auth, /cart, /orders.
· Error handling middleware at the end.

---

11. Common Mistakes

1. Not calling next() in middleware, causing requests to hang.
2. Not parsing request body (express.json() missing) leading to req.body undefined.
3. Blocking the event loop with synchronous operations.
4. Not handling errors properly, leading to unhandled promise rejections.
5. Exposing sensitive information in error responses.
6. Not using return before res.send/res.json leading to multiple responses.
7. Ignoring route order (e.g., placing a catch-all before specific routes).
8. Not using express.Router() for modularity.
9. Hardcoding URLs or secrets instead of environment variables.
10. Not setting up CORS correctly, causing frontend issues.

---

12. Best Practices

· Use express.Router() to organize routes.
· Use controller functions, avoid inline complex logic.
· Centralize error handling with middleware.
· Use asyncHandler to catch errors in async routes.
· Use environment variables and a config module.
· Use helmet for security headers.
· Use cors properly.
· Use validation middleware (Joi, Zod).
· Keep middleware small and composable.
· Use npm ci in production.
· Write tests with Jest/Supertest.
· Use a process manager like PM2.
· Set app.disable('x-powered-by') to hide framework info.

---

13. Security

· Helmet: set secure HTTP headers (app.use(helmet())).
· CORS: restrict origins (cors({ origin: 'https://example.com' })).
· Rate limiting: express-rate-limit.
· Input validation: validate all incoming data.
· JWT security: short-lived tokens, refresh tokens, secure storage.
· Password hashing: bcrypt.
· Prevent NoSQL injection: use parameterized queries with Mongoose; sanitize input.
· Prevent XSS: sanitize output; use template engine escaping.
· Use HTTPS.
· Hide stack traces in production.
· Use csurf for CSRF protection if using cookies.
· Regular dependency updates: npm audit.

---

14. Performance and Scalability

· Use compression middleware.
· Cache responses with Redis.
· Use database connection pooling.
· Use cluster to utilize multiple cores.
· Use a reverse proxy (Nginx) for static files and load balancing.
· Use streaming for large files.
· Avoid synchronous operations.
· Use async/await efficiently.
· Profile with tools like clinic, 0x.
· Consider using Fastify if performance is critical (Express is not the fastest).

---

15. Testing

· Use jest + supertest for API testing.
· Mock models/services.
· Test routes, middleware, and error handling.
· Use a test database.
· Write integration tests.

Example test:

```javascript
const request = require('supertest');
const app = require('../app');

describe('GET /api/users', () => {
  it('returns array of users', async () => {
    const res = await request(app).get('/api/users');
    expect(res.statusCode).toBe(200);
    expect(Array.isArray(res.body)).toBe(true);
  });
});
```

---

16. Comparison: Express vs Fastify vs Koa

Feature Express Fastify Koa
Performance Good Excellent Good
Middleware Classic callback Similar Async/await
Built-in features Rich Rich, schema validation Minimal
Ecosystem Huge Growing Moderate
Learning curve Low Moderate Moderate
TypeScript support Via @types Excellent Via @types
Recommended for General use, large community High performance, schema validation Modern async patterns

---

17. Quick Revision

· Express is a minimal web framework for Node.js.
· Core: routing, middleware, request/response.
· Use express.json() for body parsing.
· Use express.Router() for modular routes.
· Middleware executes in order; call next() to continue.
· Error-handling middleware with 4 args.
· Serve static files with express.static.
· Use controllers for logic.
· Security: helmet, cors, rate limiting, validation.
· Performance: compression, caching, cluster.
· Test with Supertest.

---

18. Interview Questions – Module 23

Beginner

1. What is Express.js?
      Express is a minimal and flexible Node.js web application framework that provides routing, middleware, and other features for building web apps and APIs.
2. How do you create a basic Express server?
   ```javascript
   const express = require('express');
   const app = express();
   app.get('/', (req, res) => res.send('Hello'));
   app.listen(3000, () => console.log('Server started'));
   ```
3. What is middleware in Express?
      Middleware functions have access to req, res, and next. They can execute code, modify request/response, end the request, or call next().

Intermediate

1. Explain routing in Express.
      Routing defines how an app responds to different HTTP methods and URLs. Routes can have parameters (:id) and query strings (?key=value). You can use express.Router() for modular routing.
2. How do you handle errors in Express?
      Define error-handling middleware with (err, req, res, next). It catches errors passed to next(err). Use try/catch or async wrapper to forward errors.
3. What is express.json()?
      It is built-in middleware that parses incoming requests with JSON payloads, making the data available in req.body.

Advanced

1. How would you implement authentication middleware in Express?
      Create a middleware that verifies JWT from Authorization header, extracts user, and attaches to req.user. If invalid, return 401. Then use it on protected routes.
2. How does Express handle asynchronous errors?
      Express doesn't catch async errors automatically. You need to use try/catch and call next(err) or use an async wrapper. In Express 5 (not yet stable), async errors are forwarded automatically.
3. What are the benefits of using express.Router()?
      It allows creating modular, mountable route handlers. It keeps code organized and enables reusability. It can also have its own middleware.

Scenario-Based

Q: You need to add rate limiting to prevent abuse. How would you do it with Express?
Answer: Use express-rate-limit middleware. Configure a limit (e.g., 100 requests per 15 minutes) and apply it globally or to specific routes like login. It returns 429 when limit exceeded.

Coding Questions

1. Write a middleware that logs the method and URL of each request.

```javascript
app.use((req, res, next) => {
  console.log(`${req.method} ${req.url}`);
  next();
});
```

2. Create a route that accepts a POST request with JSON body and returns it.

```javascript
app.post('/echo', (req, res) => {
  res.json(req.body);
});
```

---

19. Common Mistakes & Best Practices Summary

Mistake Best Practice
Not calling next() Always call next unless ending response
Forgetting body parser Use express.json() and urlencoded
Blocking event loop Use async/await, avoid sync operations
Not handling errors Use error middleware and async wrapper
Exposing stack traces Hide in production; log server-side
Not using router Use express.Router() for modularity
Ignoring CORS Configure properly with trusted origins
Not setting security headers Use helmet
Hardcoding configuration Use environment variables

---

This concludes Module 23: Express.js. The next module will be Module 24: MongoDB, covering MongoDB fundamentals, integration with Node/Express, Mongoose, CRUD operations, and more.

Module 24: MongoDB

MongoDB is a popular NoSQL document-oriented database that stores data in flexible, JSON-like documents. It is designed for scalability, high availability, and ease of development, making it a common choice for modern web applications, especially those built with JavaScript/Node.js. This module covers MongoDB fundamentals, integration with Node.js using the native driver and Mongoose ODM, CRUD operations, schema design, indexing, aggregation, and security/performance best practices.

---

1. Definition

1.1 What is MongoDB?

MongoDB is a cross-platform, document-oriented NoSQL database that stores data in BSON (Binary JSON) format. Unlike relational databases that use tables and rows, MongoDB uses collections and documents. Each document is a set of key-value pairs with a dynamic schema, allowing different documents in the same collection to have different fields.

1.2 What Problem It Solves

Traditional relational databases require a fixed schema and enforce relationships through foreign keys, which can be rigid for rapidly evolving applications. MongoDB's flexible schema allows developers to store data in a way that maps naturally to objects in programming languages, enabling faster development and easier scaling. It is particularly suited for:

· Applications with evolving data models.
· Storing semi-structured or unstructured data (logs, JSON, catalogs).
· Horizontal scaling across many servers (sharding).
· High write loads and real-time analytics.

1.3 Why It Was Introduced

MongoDB was developed by MongoDB Inc. (formerly 10gen) and first released in 2009. It was created to address the limitations of relational databases in handling large volumes of rapidly changing, semi-structured data, and to provide a database that could scale out easily across clusters.

1.4 Where It Is Used

· Content management systems
· E-commerce product catalogs
· Mobile applications
· Internet of Things (IoT) data
· Real-time analytics
· Catalogs and user profiles

1.5 When It Should Be Used

· When you need flexible schema and rapid iteration.
· When your data is document-centric (nested structures, arrays).
· When horizontal scalability is a priority.
· When you have high write throughput.
· When you are building a JavaScript/Node.js application (natural fit with JSON).

1.6 When It Should Not Be Used

· When you need complex joins and transactions across multiple documents (though MongoDB supports multi-document ACID transactions since v4.0, they are less efficient than relational joins).
· When data has many relationships and requires strong referential integrity.
· When your application is heavily transactional with many operations that must be atomic across many entities.
· When you need strict schema enforcement (though you can define schemas in Mongoose).

1.7 Relationship with Surrounding Concepts

· Node.js/Express: MongoDB is commonly accessed from Node.js using the native mongodb driver or Mongoose ODM.
· Mongoose: An ODM (Object Data Modeling) library that provides schema validation, middleware, and query building.
· JSON/BSON: MongoDB stores data in BSON, a binary representation of JSON-like documents.
· MongoDB Atlas: Fully managed cloud database service.

---

2. Why MongoDB Exists

2.1 The Problem Before MongoDB

Before MongoDB, most applications used relational databases (MySQL, PostgreSQL). While reliable, they required schemas to be defined upfront, making changes difficult. They also used SQL joins, which can be expensive for deeply nested data. Scaling relational databases horizontally (across many servers) is complex. MongoDB addressed these pain points by offering a flexible, scalable, document-oriented database.

2.2 The Solution MongoDB Provides

· Flexible schema: documents can have varying fields.
· Horizontal scalability: sharding distributes data across clusters.
· Rich query language: supports CRUD, filtering, sorting, aggregation.
· Indexing: supports secondary indexes, text indexes, geospatial indexes.
· Replication: replica sets provide high availability and data redundancy.
· JavaScript friendliness: uses JSON-like documents, easy for JS developers.

2.3 What Happens If We Don't Use It?

You would use a relational database (PostgreSQL, MySQL) or another NoSQL (Cassandra, CouchDB). That is perfectly valid; the choice depends on the application's needs. MongoDB's advantages are its flexibility and scalability, but relational databases offer stronger consistency and SQL joins.

2.4 Alternatives

· PostgreSQL: relational, ACID, supports JSON.
· MySQL: relational, widely used.
· CouchDB: document-oriented, RESTful.
· Cassandra: wide-column, highly scalable.
· DynamoDB: Amazon's managed NoSQL.

2.5 Why Choose MongoDB?

· Great for JavaScript/Node.js stack.
· Flexible data model.
· Scalable and performant for many workloads.
· Strong ecosystem (Atlas, Mongoose, Compass GUI).
· Good documentation and community.

---

3. Core Concepts

3.1 Database

A container for collections. Each database has its own set of files on disk. A single MongoDB server can host multiple databases.

3.2 Collection

A group of MongoDB documents, analogous to a table in relational databases. Collections do not enforce a schema.

3.3 Document

A record in a MongoDB collection, analogous to a row. It is a set of key-value pairs, stored in BSON. Documents have a unique _id field (ObjectId by default).

Example document:

```json
{
  "_id": ObjectId("64f..."),
  "name": "Alice",
  "age": 30,
  "email": "alice@example.com",
  "hobbies": ["reading", "gaming"],
  "address": {
    "city": "New York",
    "zip": "10001"
  }
}
```

3.4 BSON

Binary JSON, the binary-encoded serialization of JSON-like documents. It extends JSON with additional data types (Date, ObjectId, etc.).

3.5 ObjectId

A 12-byte unique identifier for documents, generated by MongoDB. It consists of timestamp, machine ID, process ID, and counter.

3.6 Indexes

Indexes improve query performance by allowing MongoDB to find documents without scanning the whole collection. Common types: single field, compound, text, geospatial, unique.

3.7 Replication and Sharding

· Replica Set: a group of MongoDB servers that maintain the same data set, providing redundancy and failover.
· Sharding: distributing data across multiple machines to support large datasets and high throughput.

3.8 Aggregation Pipeline

A framework for data processing, transforming documents through multiple stages ($match, $group, $project, $sort, etc.).

---

4. Prerequisites

· Basic understanding of databases (tables vs collections, rows vs documents).
· JavaScript/Node.js knowledge (for integration).
· Familiarity with JSON.

---

5. Internal Working

5.1 Storage Engine

MongoDB uses a pluggable storage engine, default is WiredTiger. It provides document-level concurrency, compression, and in-memory caching. WiredTiger stores data in B-tree structures.

5.2 Query Flow

```mermaid
flowchart LR
    Client[Application] --> Driver[MongoDB Driver]
    Driver --> Server[MongoDB Server]
    Server --> QueryOptimizer[Query Optimizer]
    QueryOptimizer --> Index[Index]
    QueryOptimizer --> Collection[Collection Data]
    Collection --> Return[Return Results]
```

The server parses the query, determines whether an index can be used, fetches matching documents, and returns results.

5.3 Indexing Internals

Indexes are stored as B-trees. Each index entry contains the indexed field value and a pointer to the document. Compound indexes store multiple fields in order.

5.4 Data Storage in BSON

Documents are serialized to BSON for storage. BSON supports more data types than JSON (Date, ObjectId, binary). The driver converts between BSON and native language objects.

5.5 ACID Transactions

MongoDB supports multi-document transactions in replica sets and sharded clusters since v4.0. Transactions use snapshot isolation and are similar to relational transactions but with performance considerations.

---

6. Syntax and Structure

6.1 Basic Commands (Mongo Shell)

```javascript
// Show databases
show dbs

// Use or create database
use mydb

// Insert a document
db.users.insertOne({ name: "Alice", age: 30 })

// Insert many
db.users.insertMany([{ name: "Bob" }, { name: "Charlie" }])

// Query
db.users.find({ age: { $gt: 25 } })

// Update
db.users.updateOne({ name: "Alice" }, { $set: { age: 31 } })

// Delete
db.users.deleteOne({ name: "Bob" })

// Count
db.users.countDocuments({})

// Create index
db.users.createIndex({ email: 1 }, { unique: true })

// Aggregation
db.users.aggregate([
  { $match: { age: { $gte: 18 } } },
  { $group: { _id: "$city", count: { $sum: 1 } } }
])
```

6.2 Using MongoDB with Node.js (Native Driver)

Install: npm install mongodb

```javascript
const { MongoClient } = require('mongodb');

const uri = 'mongodb://localhost:27017';
const client = new MongoClient(uri);

async function run() {
  try {
    await client.connect();
    const db = client.db('mydb');
    const users = db.collection('users');

    // Insert
    await users.insertOne({ name: 'Alice', age: 30 });

    // Query
    const result = await users.findOne({ name: 'Alice' });
    console.log(result);
  } finally {
    await client.close();
  }
}

run().catch(console.dir);
```

---

7. Basic Example

7.1 Inserting and Querying Documents (Shell)

```javascript
use testdb

db.products.insertMany([
  { name: "Laptop", price: 1200, category: "Electronics" },
  { name: "Shirt", price: 25, category: "Clothing" },
  { name: "Headphones", price: 150, category: "Electronics" }
])

// Find all products
db.products.find()

// Find products under $100
db.products.find({ price: { $lt: 100 } })

// Find electronics sorted by price desc
db.products.find({ category: "Electronics" }).sort({ price: -1 })
```

7.2 Node.js Basic CRUD

```javascript
const { MongoClient } = require('mongodb');

const uri = 'mongodb://localhost:27017';
const client = new MongoClient(uri);

async function main() {
  await client.connect();
  const db = client.db('store');
  const products = db.collection('products');

  // Create
  await products.insertOne({ name: 'Phone', price: 699, category: 'Electronics' });

  // Read
  const product = await products.findOne({ name: 'Phone' });
  console.log(product);

  // Update
  await products.updateOne({ name: 'Phone' }, { $set: { price: 649 } });

  // Delete
  await products.deleteOne({ name: 'Phone' });

  await client.close();
}
main();
```

---

8. Practical Example

8.1 Using Mongoose ODM

Mongoose provides a schema-based solution to model MongoDB data in Node.js. Install: npm install mongoose

```javascript
const mongoose = require('mongoose');

// Connect
mongoose.connect('mongodb://localhost:27017/myapp');

// Define schema
const userSchema = new mongoose.Schema({
  name: { type: String, required: true },
  email: { type: String, required: true, unique: true },
  age: { type: Number, min: 0 },
  createdAt: { type: Date, default: Date.now },
  hobbies: [String],
  address: {
    city: String,
    zip: String
  }
});

// Create model
const User = mongoose.model('User', userSchema);

// CRUD operations
async function run() {
  // Create
  const newUser = await User.create({ name: 'Alice', email: 'alice@example.com', age: 30 });
  console.log(newUser);

  // Read
  const user = await User.findOne({ email: 'alice@example.com' });
  console.log(user);

  // Update
  await User.updateOne({ email: 'alice@example.com' }, { $set: { age: 31 } });

  // Delete
  await User.deleteOne({ email: 'alice@example.com' });

  await mongoose.disconnect();
}
run();
```

8.2 Query with filters and sorting

```javascript
const users = await User.find({ age: { $gte: 18 } })
  .sort({ name: 1 })
  .limit(10)
  .select('name email');
```

---

9. Advanced Example

9.1 Aggregation Pipeline

```javascript
const results = await Order.aggregate([
  { $match: { status: 'completed' } },
  { $unwind: '$items' },
  { $group: {
      _id: '$items.productId',
      totalQuantity: { $sum: '$items.quantity' },
      totalRevenue: { $sum: { $multiply: ['$items.quantity', '$items.price'] } }
  }},
  { $sort: { totalRevenue: -1 } },
  { $lookup: {
      from: 'products',
      localField: '_id',
      foreignField: '_id',
      as: 'product'
  }},
  { $unwind: '$product' },
  { $project: { productName: '$product.name', totalQuantity: 1, totalRevenue: 1 } }
]);
```

9.2 Indexing for Performance

```javascript
userSchema.index({ email: 1 }, { unique: true });
userSchema.index({ name: 'text' }); // text index for search
```

9.3 Transactions (Multi-document)

```javascript
const session = await mongoose.startSession();
session.startTransaction();
try {
  await Account.updateOne({ _id: fromId }, { $inc: { balance: -100 } }, { session });
  await Account.updateOne({ _id: toId }, { $inc: { balance: 100 } }, { session });
  await session.commitTransaction();
} catch (err) {
  await session.abortTransaction();
  throw err;
} finally {
  session.endSession();
}
```

---

10. Real-World Scenario

10.1 Problem: Building a Product Catalog for E-Commerce

The catalog needs:

· Products with nested attributes (variants, images).
· Search and filtering by category, price, brand.
· High read throughput.
· Evolving product attributes (e.g., different categories have different fields).

10.2 Solution with MongoDB

· Store products as documents with nested arrays for variants, images.
· Use dynamic fields for category-specific attributes.
· Create indexes on category, price, brand, and text index for search.
· Use aggregation for advanced filtering and faceted navigation.

10.3 Architecture

```mermaid
flowchart LR
    React[React Frontend] --> API[Express API]
    API --> Mongoose[Mongoose ODM]
    Mongoose --> MongoDB[(MongoDB)]
    MongoDB --> Indexes[Indexes]
```

10.4 Implementation Highlights

· Mongoose schema with strict: false or using Schema.Types.Mixed for dynamic attributes.
· Queries with $and, $or, $regex for filters.
· Aggregation pipeline for faceted search.
· Indexing strategy based on query patterns.

---

11. Common Mistakes

1. Not designing indexes – queries become slow as data grows.
2. Using $where or JavaScript expressions – slow and insecure.
3. Overusing nested arrays – can cause large documents and poor performance.
4. Not using lean() in Mongoose for read-only queries (returns plain JS objects, faster).
5. Ignoring write concerns – may risk data loss.
6. Not handling duplicate key errors for unique indexes.
7. Using skip and limit for deep pagination – better to use range-based pagination.
8. Not setting timeouts for database operations.
9. Storing large files in documents – use GridFS.
10. Not closing connections in standalone scripts.

---

12. Best Practices

· Use indexes for frequent queries; monitor with explain().
· Use Mongoose for schema validation and middleware.
· Use lean() for read-heavy operations.
· Limit document size (16 MB max); use GridFS for large files.
· Use $set for partial updates to avoid overwriting.
· Use replica sets for high availability.
· Use sharding for very large datasets.
· Use transactions only when necessary; they have overhead.
· Sanitize inputs to prevent NoSQL injection.
· Use environment variables for connection strings.
· Use connection pooling (built-in driver).

---

13. Security

· Authentication: enable authentication, use strong credentials.
· Authorization: role-based access control (RBAC).
· Network security: use TLS/SSL, restrict access with firewall/VPC.
· Encryption: encrypt data at rest (WiredTiger encryption) and in transit.
· Injection: use parameterized queries in MongoDB driver (e.g., { name: query } not { name: { $eq: query } } with string concatenation). Avoid passing user input directly into query operators.
· Exposure: never expose _id or internal fields unnecessarily; sanitize outputs.
· Update security patches and use MongoDB Atlas managed service for built-in security.

---

14. Performance and Scalability

· Use proper indexes; analyze with explain().
· Use $project to return only needed fields.
· Use limit and skip carefully; prefer range queries for pagination.
· Use bulkWrite for batch operations.
· Use hint() to force index if optimizer is wrong.
· Use readPreference to read from secondaries for read scaling.
· Use sharding to distribute data and load.
· Use connection pooling.
· Monitor performance with MongoDB Profiler or Atlas metrics.
· Use explain('executionStats') to diagnose slow queries.

---

15. Testing

· Use an in-memory MongoDB (mongodb-memory-server) for tests.
· Use Mongoose with mongoose.connect to test DB operations.
· Mock MongoDB for unit tests (using sinon or jest.mock).
· Test with supertest and a test database.
· Ensure cleanup after tests.

Example with mongodb-memory-server:

```javascript
const { MongoMemoryServer } = require('mongodb-memory-server');
const mongoose = require('mongoose');

let mongoServer;

beforeAll(async () => {
  mongoServer = await MongoMemoryServer.create();
  await mongoose.connect(mongoServer.getUri());
});

afterAll(async () => {
  await mongoose.disconnect();
  await mongoServer.stop();
});
```

---

16. Comparison: MongoDB vs PostgreSQL

Feature MongoDB PostgreSQL
Data model Document-oriented (BSON) Relational (tables)
Schema Flexible (optional with Mongoose) Strict, enforced
Joins Limited, via aggregation $lookup SQL JOINs
Transactions Multi-document ACID (v4+) Full ACID
Scalability Horizontal sharding built-in Replication, sharding via extensions
Query language MongoDB Query Language SQL
Use case Flexible, scalable, rapid iteration Strong consistency, complex queries
Indexes Yes, many types Yes, many types
Ecosystem Mongoose, Atlas Sequelize, Prisma, pg

Choose MongoDB when flexibility and horizontal scaling are priorities; choose PostgreSQL when relational integrity and complex SQL queries are needed.

---

17. Quick Revision

· MongoDB is a NoSQL document database.
· Data stored in collections as BSON documents.
· _id default ObjectId.
· Use indexes for query performance.
· Use Mongoose ODM in Node.js for schema validation and models.
· CRUD: insertOne/insertMany, find/findOne, updateOne/updateMany, deleteOne/deleteMany.
· Aggregation pipeline for complex data processing.
· Use replica sets and sharding for scalability.
· Security: authentication, TLS, parameterized queries.
· Test with mongodb-memory-server.

---

18. Interview Questions – Module 24

Beginner

1. What is MongoDB?
      MongoDB is a NoSQL document-oriented database that stores data in flexible, JSON-like documents (BSON) in collections.
2. What is a collection?
      A collection is a group of MongoDB documents, similar to a table in relational databases.
3. What is Mongoose?
      Mongoose is an ODM (Object Data Modeling) library for MongoDB and Node.js that provides schema validation, middleware, and query building.

Intermediate

1. How do you perform CRUD operations in MongoDB?
      Use insertOne/insertMany, find/findOne, updateOne/updateMany with $set, and deleteOne/deleteMany.
2. Explain indexes in MongoDB.
      Indexes are special data structures that store a small portion of the collection's data in an easy-to-traverse form. They improve query performance. Common types: single field, compound, text, geospatial.
3. What is an aggregation pipeline?
      It's a framework for data processing where documents pass through multiple stages ($match, $group, $project, $sort, $lookup) to transform and combine data.

Advanced

1. How do you handle relationships in MongoDB?
      You can embed related data (denormalization) for one-to-one/one-to-many that are always accessed together, or use references (ObjectId) for many-to-many or when data is large. You can also use $lookup in aggregation for joins.
2. Explain replica sets and sharding.
      A replica set is a group of MongoDB servers that maintain the same data, providing redundancy and failover. Sharding distributes data across multiple machines (shards) to handle large datasets and high throughput.
3. How do you prevent NoSQL injection in MongoDB?
      Sanitize user input; never pass untrusted data directly into query operators like $where. Use parameterized queries (e.g., { field: value } not building query objects from strings). Mongoose's query builder helps by not allowing raw object injection in most cases.

Scenario-Based

Q: Your MongoDB queries are slow. What steps would you take to diagnose and fix?
Answer: Use explain('executionStats') to analyze the query plan. Check if an index is used; if not, create appropriate indexes based on query fields. Use $project to reduce data transfer. Consider restructuring queries to avoid $where or large scans. If needed, use hint() to force index.

Coding Questions

1. Write a Mongoose schema for a Blog Post with title, content, author (reference to User), tags (array), and timestamps.

```javascript
const postSchema = new mongoose.Schema({
  title: { type: String, required: true },
  content: { type: String, required: true },
  author: { type: mongoose.Schema.Types.ObjectId, ref: 'User', required: true },
  tags: [String],
}, { timestamps: true });

const Post = mongoose.model('Post', postSchema);
```

2. Write an aggregation to find the total number of posts per tag.

```javascript
Post.aggregate([
  { $unwind: '$tags' },
  { $group: { _id: '$tags', count: { $sum: 1 } } },
  { $sort: { count: -1 } }
]);
```

---

19. Common Mistakes & Best Practices Summary

Mistake Best Practice
No indexes Create indexes for frequent queries
Using $where Avoid; use native operators
Not using lean() Use lean() for read-only
Skipping validation Use Mongoose validation
Not handling duplicate key errors Catch and handle
Deep pagination with skip/limit Use range-based pagination
Storing large files Use GridFS
Not closing connections Ensure connections are closed
Ignoring security Enable auth, TLS, use parameterized queries

---

This concludes Module 24: MongoDB. The next module will be Module 25: PostgreSQL, covering relational database fundamentals, SQL, integration with Node.js using pg and ORMs (Sequelize, Prisma), and best practices.



Module 25: PostgreSQL

PostgreSQL is a powerful, open-source, object-relational database system with over 30 years of active development. It is known for its reliability, feature robustness, and performance. It uses and extends the SQL language and supports both relational (SQL) and non-relational (JSON) queries. This module covers PostgreSQL fundamentals, SQL, integration with Node.js using the native pg driver and ORMs (Sequelize, Prisma), and best practices for building robust backend systems with PostgreSQL.

---

1. Definition

1.1 What is PostgreSQL?

PostgreSQL, often simply called "Postgres", is a free and open-source relational database management system (RDBMS). It is designed to handle a range of workloads, from single machines to data warehouses or web services with many concurrent users. It is ACID-compliant, supports advanced data types, indexing, full-text search, and extensibility.

1.2 What Problem It Solves

PostgreSQL provides a robust, transactional, and standards-compliant database for applications that require strict data integrity, complex queries, and relational data modeling. It solves the need for a reliable, scalable SQL database with advanced features not found in simpler databases.

1.3 Why It Was Introduced

PostgreSQL evolved from the Ingres project at UC Berkeley (1986) and was later named PostgreSQL to reflect its SQL support. It was created to address the need for an extensible, open-source database system that could handle complex queries and large datasets while maintaining ACID properties.

1.4 Where It Is Used

· Enterprise applications (ERP, CRM)
· Web applications and APIs
· Financial systems requiring transactions
· Geospatial applications (PostGIS)
· Data warehousing and analytics
· Content management systems

1.5 When It Should Be Used

· When you need relational integrity and complex joins.
· When transactions and consistency are critical.
· When you need advanced SQL features (window functions, CTEs, full-text search).
· When your data has many relationships and benefits from normalization.
· When you need a mature, feature-rich open-source database.

1.6 When It Should Not Be Used

· When your data model is unstructured or highly dynamic (MongoDB may be better).
· When you need very high horizontal scalability out-of-the-box (though PostgreSQL can scale with extensions like Citus).
· When your application is primarily document-oriented with little need for joins.
· When you require extremely low latency for simple key-value lookups (Redis may be better).

1.7 Relationship with Surrounding Concepts

· SQL: the query language used by PostgreSQL.
· Node.js/Express: PostgreSQL is commonly accessed from Node.js using the pg driver, Sequelize, Prisma, or TypeORM.
· MongoDB: NoSQL alternative; PostgreSQL supports JSON columns but is relational at core.
· ACID: Atomicity, Consistency, Isolation, Durability – properties PostgreSQL enforces.

---

2. Why PostgreSQL Exists

2.1 The Problem Before PostgreSQL

Early relational databases were often proprietary and expensive, lacking advanced features. MySQL, while popular, had limitations in concurrency, full-text search, and data integrity. PostgreSQL was created to be a feature-rich, open-source alternative that supports advanced SQL standards, extensibility, and data integrity.

2.2 The Solution PostgreSQL Provides

· ACID compliance – ensures transaction reliability.
· Advanced indexing – B-tree, Hash, GiST, GIN, BRIN.
· Full-text search – built-in, supports ranking and highlighting.
· JSON support – can store and query JSON data.
· Geospatial support – via PostGIS extension.
· Extensibility – custom data types, functions, languages.
· Concurrency – MVCC (Multi-Version Concurrency Control) for high concurrency without locking.
· Replication and partitioning – built-in for scaling and high availability.

2.3 What Happens If We Don't Use It?

You would use another database (MySQL, SQL Server, Oracle, or NoSQL). That is perfectly fine; the choice depends on requirements. PostgreSQL's strengths are its feature richness, standards compliance, and advanced capabilities, making it a top choice for complex, transactional systems.

2.4 Alternatives

· MySQL – simpler, widely used, good for web apps.
· SQLite – embedded, zero-config, for small applications.
· SQL Server – Microsoft's enterprise database.
· Oracle – enterprise, expensive.
· NoSQL (MongoDB, Cassandra) – for non-relational data.

2.5 Why Choose PostgreSQL?

· Free and open-source.
· Advanced features comparable to commercial databases.
· Strong community and ecosystem.
· Excellent performance and scalability.
· Supports JSON for flexibility.
· Can be used as a relational database with NoSQL capabilities.

---

3. Core Concepts

3.1 Database

A database is a container for schemas, tables, indexes, etc. A single PostgreSQL server can host multiple databases.

3.2 Table

A table is a collection of rows, each with a fixed set of columns defined by a schema. Tables are the primary storage unit.

3.3 Row / Record

A row is a single entry in a table, consisting of values for each column.

3.4 Column

A column defines a specific attribute of the table with a data type (e.g., integer, text, timestamp).

3.5 Primary Key

A column or set of columns that uniquely identifies each row. Typically an auto-incrementing integer (SERIAL or IDENTITY) or UUID.

3.6 Foreign Key

A column that references a primary key in another table, establishing a relationship and enforcing referential integrity.

3.7 Indexes

Indexes speed up data retrieval. Types: B-tree (default), Hash, GiST, GIN, BRIN. They can be unique, partial, expression, etc.

3.8 Transactions

A transaction is a sequence of operations performed as a single logical unit. It must be atomic, consistent, isolated, and durable (ACID).

3.9 Views

A view is a virtual table based on a query. It simplifies complex queries and provides security by hiding underlying tables.

3.10 Schema

A namespace that contains database objects (tables, views, functions). Helps organize and manage permissions.

3.11 SQL (Structured Query Language)

Standard language for querying and manipulating relational databases. PostgreSQL implements SQL with extensions.

---

4. Prerequisites

· Basic understanding of databases and SQL.
· JavaScript/Node.js knowledge (for integration).
· Familiarity with relational concepts (tables, rows, joins).

---

5. Internal Working

5.1 Architecture Overview

PostgreSQL uses a client-server model. The server process manages database files, accepts connections, and executes queries. Each client connection is handled by a separate backend process (or thread in some configurations). Key components:

· Postmaster: main process that listens for connections and spawns backend processes.
· Backend process: handles individual client queries.
· Shared memory: used for caching (shared_buffers) and inter-process communication.
· WAL (Write-Ahead Log): ensures durability by recording changes before they are applied.
· MVCC: Multi-Version Concurrency Control allows concurrent transactions to see consistent snapshots without locking.

5.2 Query Execution Flow

```mermaid
flowchart LR
    Client[Client Application] --> Parser[Parser]
    Parser --> Analyzer[Analyzer]
    Analyzer --> Planner[Planner/Optimizer]
    Planner --> Executor[Executor]
    Executor --> Storage[Storage Engine]
    Storage --> DataFiles[(Data Files + Indexes)]
```

· Parser: checks syntax, creates parse tree.
· Analyzer: resolves table/column names, checks permissions, adds semantic info.
· Planner: chooses optimal execution plan based on statistics and indexes.
· Executor: runs the plan, fetching and processing rows.
· Storage: reads/writes data from disk, using shared buffers for caching.

5.3 MVCC and Concurrency

PostgreSQL uses MVCC: each transaction sees a snapshot of the database at the start. Writes create new versions of rows, leaving old versions for concurrent readers. This avoids read locks and allows high concurrency.

5.4 Indexes Internals

Indexes are stored separately from table data. A B-tree index is a balanced tree structure with key-value pairs pointing to rows. The query planner uses indexes to quickly locate matching rows.

---

6. Syntax and Structure

6.1 Basic SQL Commands

```sql
-- Create table
CREATE TABLE users (
  id SERIAL PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  email VARCHAR(255) UNIQUE NOT NULL,
  age INTEGER,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Insert
INSERT INTO users (name, email, age) VALUES ('Alice', 'alice@example.com', 30);

-- Select
SELECT * FROM users WHERE age > 18;

-- Update
UPDATE users SET age = 31 WHERE email = 'alice@example.com';

-- Delete
DELETE FROM users WHERE id = 1;

-- Create index
CREATE INDEX idx_users_email ON users(email);

-- Join
SELECT u.name, o.order_date FROM users u
JOIN orders o ON u.id = o.user_id;
```

6.2 Data Types

· INTEGER, BIGINT, SMALLINT
· NUMERIC(precision, scale) / DECIMAL
· VARCHAR(n) / TEXT
· DATE, TIME, TIMESTAMP, TIMESTAMPTZ
· BOOLEAN
· JSON, JSONB
· UUID
· SERIAL / IDENTITY (auto-increment)
· Arrays (TEXT[]), etc.

6.3 Advanced SQL Features

· JOINs: INNER, LEFT, RIGHT, FULL.
· Subqueries and CTEs: WITH ... AS.
· Window functions: ROW_NUMBER(), RANK(), SUM() OVER.
· Aggregation: GROUP BY, HAVING.
· Transactions: BEGIN; COMMIT; ROLLBACK;
· Constraints: PRIMARY KEY, FOREIGN KEY, UNIQUE, CHECK, NOT NULL.
· Triggers and functions: procedural SQL (PL/pgSQL).

6.4 Using PostgreSQL from Node.js

Native pg driver:

```javascript
const { Pool } = require('pg');

const pool = new Pool({
  host: 'localhost',
  port: 5432,
  user: 'postgres',
  password: 'secret',
  database: 'myapp',
});

pool.query('SELECT * FROM users WHERE age > $1', [18], (err, result) => {
  if (err) throw err;
  console.log(result.rows);
});
```

With async/await:

```javascript
const result = await pool.query('SELECT * FROM users WHERE age > $1', [18]);
console.log(result.rows);
```

Using environment variables:

```javascript
const pool = new Pool({
  connectionString: process.env.DATABASE_URL,
});
```

---

7. Basic Example

7.1 Creating a Table and Inserting Data

```sql
CREATE TABLE products (
  id SERIAL PRIMARY KEY,
  name VARCHAR(200) NOT NULL,
  price NUMERIC(10,2) CHECK (price >= 0),
  category VARCHAR(50),
  created_at TIMESTAMP DEFAULT NOW()
);

INSERT INTO products (name, price, category) VALUES
('Laptop', 999.99, 'Electronics'),
('Shirt', 19.99, 'Clothing'),
('Headphones', 149.99, 'Electronics');
```

7.2 Simple Queries

```sql
-- Select all products
SELECT * FROM products;

-- Filter and sort
SELECT name, price FROM products WHERE category = 'Electronics' ORDER BY price DESC;

-- Count by category
SELECT category, COUNT(*) FROM products GROUP BY category;
```

7.3 Node.js Basic CRUD with pg

```javascript
const { Pool } = require('pg');
const pool = new Pool({ connectionString: process.env.DATABASE_URL });

async function main() {
  // Create
  await pool.query('INSERT INTO products (name, price, category) VALUES ($1, $2, $3)', ['Phone', 599.99, 'Electronics']);

  // Read
  const { rows } = await pool.query('SELECT * FROM products');
  console.log(rows);

  // Update
  await pool.query('UPDATE products SET price = $1 WHERE name = $2', [549.99, 'Phone']);

  // Delete
  await pool.query('DELETE FROM products WHERE name = $1', ['Phone']);

  await pool.end();
}
main();
```

---

8. Practical Example

8.1 Building a User Management API with Express and pg

This example connects to PostgreSQL and exposes REST endpoints.

Setup:

```javascript
// db.js
const { Pool } = require('pg');
const pool = new Pool({ connectionString: process.env.DATABASE_URL });
module.exports = pool;
```

Route handler:

```javascript
// routes/users.js
const express = require('express');
const router = express.Router();
const pool = require('../db');

// GET all users
router.get('/', async (req, res, next) => {
  try {
    const result = await pool.query('SELECT id, name, email, age FROM users');
    res.json(result.rows);
  } catch (err) {
    next(err);
  }
});

// GET single user
router.get('/:id', async (req, res, next) => {
  try {
    const result = await pool.query('SELECT * FROM users WHERE id = $1', [req.params.id]);
    if (result.rows.length === 0) return res.status(404).json({ message: 'User not found' });
    res.json(result.rows[0]);
  } catch (err) {
    next(err);
  }
});

// POST create user
router.post('/', async (req, res, next) => {
  try {
    const { name, email, age } = req.body;
    const result = await pool.query(
      'INSERT INTO users (name, email, age) VALUES ($1, $2, $3) RETURNING *',
      [name, email, age]
    );
    res.status(201).json(result.rows[0]);
  } catch (err) {
    next(err);
  }
});

// PUT update user
router.put('/:id', async (req, res, next) => {
  try {
    const { name, email, age } = req.body;
    const result = await pool.query(
      'UPDATE users SET name=$1, email=$2, age=$3 WHERE id=$4 RETURNING *',
      [name, email, age, req.params.id]
    );
    if (result.rows.length === 0) return res.status(404).json({ message: 'User not found' });
    res.json(result.rows[0]);
  } catch (err) {
    next(err);
  }
});

// DELETE user
router.delete('/:id', async (req, res, next) => {
  try {
    const result = await pool.query('DELETE FROM users WHERE id=$1 RETURNING *', [req.params.id]);
    if (result.rows.length === 0) return res.status(404).json({ message: 'User not found' });
    res.status(204).send();
  } catch (err) {
    next(err);
  }
});

module.exports = router;
```

App setup:

```javascript
const express = require('express');
const app = express();
app.use(express.json());
app.use('/users', require('./routes/users'));
app.use((err, req, res, next) => {
  console.error(err);
  res.status(500).json({ message: 'Internal server error' });
});
app.listen(3000);
```

---

9. Advanced Example

9.1 Using an ORM: Sequelize

Sequelize provides an object-oriented interface to PostgreSQL, handling SQL generation, migrations, and associations.

Install: npm install sequelize pg pg-hstore

Define model:

```javascript
const { Sequelize, DataTypes } = require('sequelize');
const sequelize = new Sequelize(process.env.DATABASE_URL);

const User = sequelize.define('User', {
  name: { type: DataTypes.STRING, allowNull: false },
  email: { type: DataTypes.STRING, allowNull: false, unique: true },
  age: DataTypes.INTEGER,
});

const Order = sequelize.define('Order', {
  total: { type: DataTypes.DECIMAL(10,2), allowNull: false },
  orderDate: { type: DataTypes.DATE, defaultValue: Sequelize.NOW },
});

User.hasMany(Order);
Order.belongsTo(User);

(async () => {
  await sequelize.sync({ force: true }); // creates tables
  // create user with orders
  const user = await User.create({ name: 'Alice', email: 'alice@example.com' });
  const order = await Order.create({ total: 99.99, userId: user.id });
  console.log(await user.getOrders());
})();
```

9.2 Using Prisma

Prisma is a modern ORM with a type-safe client and declarative schema.

Schema (schema.prisma):

```prisma
datasource db {
  provider = "postgresql"
  url      = env("DATABASE_URL")
}

generator client {
  provider = "prisma-client-js"
}

model User {
  id    Int     @id @default(autoincrement())
  name  String
  email String  @unique
  age   Int?
  orders Order[]
}

model Order {
  id      Int      @id @default(autoincrement())
  total   Decimal
  userId  Int
  user    User     @relation(fields: [userId], references: [id])
}
```

Usage:

```javascript
import { PrismaClient } from '@prisma/client';
const prisma = new PrismaClient();

async function main() {
  const user = await prisma.user.create({
    data: {
      name: 'Alice',
      email: 'alice@example.com',
      orders: { create: { total: 99.99 } }
    },
  });
  console.log(user);
}
```

9.3 Advanced Queries with Window Functions

```sql
SELECT
  name,
  category,
  price,
  RANK() OVER (PARTITION BY category ORDER BY price DESC) AS rank_in_category
FROM products;
```

9.4 Transactions with pg

```javascript
const client = await pool.connect();
try {
  await client.query('BEGIN');
  await client.query('UPDATE accounts SET balance = balance - 100 WHERE id = $1', [1]);
  await client.query('UPDATE accounts SET balance = balance + 100 WHERE id = $1', [2]);
  await client.query('COMMIT');
} catch (e) {
  await client.query('ROLLBACK');
  throw e;
} finally {
  client.release();
}
```

---

10. Real-World Scenario

10.1 Problem: Building a Banking System with Transaction Integrity

A banking application needs to manage accounts, handle transfers between accounts atomically, and ensure data consistency even under concurrent operations. SQL injections and data anomalies must be prevented.

10.2 Solution

· Use PostgreSQL as the database with ACID transactions.
· Use pg driver with parameterized queries to prevent SQL injection.
· Implement transfer logic in a transaction: debit one account, credit another, ensure balance never negative using CHECK constraint.
· Use SELECT ... FOR UPDATE to lock rows and prevent race conditions.
· Use foreign keys and indexes for referential integrity and performance.
· Use connection pooling.

10.3 Architecture

```mermaid
flowchart LR
    Express[Express API] --> Pool[pg Pool]
    Pool --> PostgreSQL[(PostgreSQL)]
    PostgreSQL --> Transactions[Transactions]
    PostgreSQL --> Locking[Row Locking]
    PostgreSQL --> Indexes[Indexes]
    PostgreSQL --> Constraints[Constraints]
```

10.4 Implementation Highlights

· BEGIN / COMMIT / ROLLBACK for atomic transfers.
· SELECT ... FOR UPDATE to lock rows.
· UPDATE ... WHERE balance >= amount or CHECK constraint to prevent negative balances.
· Parameterized queries with $1, $2 placeholders.
· Use pg.Pool for connection reuse.
· Error handling and rollback on failure.

---

11. Common Mistakes

1. Not using parameterized queries – leads to SQL injection.
2. Forgetting to close transactions – open transactions can lock resources and cause deadlocks.
3. Ignoring indexes – slow queries as data grows.
4. Using SELECT * unnecessarily – fetches more data than needed, wastes bandwidth and memory.
5. Not handling NULL values correctly, causing unexpected results.
6. Overlooking connection pooling – creating a new connection per request is inefficient; use Pool.
7. Not using RETURNING clause when you need the inserted/updated row in one query.
8. Not setting proper constraints (foreign keys, check) leading to invalid data.
9. Using synchronous fs or blocking code in Node.js with pg (though pg is async).
10. Not managing migrations – schema changes applied manually; use migration tools.

---

12. Best Practices

· Always use parameterized queries to prevent SQL injection.
· Use Pool for connection pooling.
· Use transactions for multi-step operations that must be atomic.
· Use RETURNING to get affected rows.
· Design indexes based on query patterns; use EXPLAIN ANALYZE to verify.
· Use COALESCE and NULLIF to handle NULLs.
· Normalize data but consider denormalization for read-heavy reports.
· Use TIMESTAMPTZ for timezone-aware timestamps.
· Implement pagination with LIMIT/OFFSET or keyset pagination.
· Use pgcrypto for encryption and UUID generation if needed.
· Use pgbouncer or similar for connection pooling in production if using many connections.
· Use dotenv for configuration; never hardcode credentials.
· Use pg or an ORM (Sequelize/Prisma) consistently.
· Write migrations for schema changes.
· Monitor and log slow queries.

---

13. Security

· SQL injection: Always use parameterized queries or ORM methods. Never concatenate user input into SQL strings.
· Authentication: Use strong passwords, limit access with roles and privileges. Use pg_hba.conf to control host-based authentication.
· Network: Use SSL/TLS for connections (ssl: true in pg config). Restrict access using firewall/VPC.
· Encryption: Use SSL for data in transit; consider disk encryption for data at rest.
· Permissions: Grant least privilege; separate roles for read/write.
· Row-level security: For multi-tenant applications, use RLS policies.
· Prevent SQL injection in dynamic table/column names: Validate identifiers against whitelist.
· Use SECURITY DEFINER functions carefully.
· Do not expose stack traces or database errors to clients.

13.1 Example: Parameterized Query

```javascript
// Safe: parameterized
await pool.query('SELECT * FROM users WHERE email = $1', [email]);

// Unsafe: string concatenation (never do this)
await pool.query(`SELECT * FROM users WHERE email = '${email}'`);
```

---

14. Performance and Scalability

· Indexing: Create indexes on frequently queried columns; use composite indexes for multi-column filters.
· Query optimization: Use EXPLAIN ANALYZE to identify slow queries.
· Connection pooling: Use Pool and consider pgbouncer for high concurrency.
· Caching: Use Redis for frequently accessed data.
· Partitioning: Partition large tables by date or key.
· Replication: Use streaming replication for read scaling and high availability.
· Sharding: For very large datasets, consider sharding with extensions like Citus.
· Vertical scaling: Increase memory, CPU, and use fast storage (SSD).
· Tune PostgreSQL config: shared_buffers, work_mem, effective_cache_size.
· Avoid N+1 queries: Use JOINs or batch queries.
· Use LIMIT to paginate results.
· Use VACUUM and ANALYZE to maintain statistics and reclaim storage.

---

15. Testing

· Use an in-memory or dedicated test database.
· Use pg-mem for unit tests without a real database (or use a real test database in CI).
· Use Jest with supertest for API integration tests.
· Mock the pg module if you want to isolate logic.
· Test transactions and rollback scenarios.
· Use factory_bot style for seeding test data.
· Clean up test data after each test.

Example: Testing with Jest and a test database

```javascript
// setup.js
process.env.DATABASE_URL = 'postgresql://test:test@localhost:5432/testdb';

// In tests, use the real pool and run queries.
// Clean tables before each test:
beforeEach(async () => {
  await pool.query('TRUNCATE users RESTART IDENTITY CASCADE');
});
```

---

16. Comparison: PostgreSQL vs MongoDB

Feature PostgreSQL MongoDB
Data model Relational (tables) Document-oriented (BSON)
Schema Strict, enforced Flexible, dynamic
Query language SQL MongoDB Query Language
Joins Native SQL JOINs Aggregation $lookup
Transactions Full ACID, long history Multi-document ACID (v4+)
Scalability Vertical + replication, sharding via extensions Horizontal sharding built-in
JSON support Excellent (JSONB) Native
Indexes B-tree, GIN, GiST, etc. Many types
Use case Complex queries, relational integrity, transactions Flexible schema, rapid iteration, high write load
Ecosystem Sequelize, Prisma, pg Mongoose, native driver
Strengths Reliability, features, SQL Flexibility, ease of use

Choose PostgreSQL when you need strong consistency, complex queries, and relational integrity; choose MongoDB when you need schema flexibility and horizontal scalability.

---

17. Quick Revision

· PostgreSQL is a powerful open-source relational database.
· Core concepts: tables, rows, columns, primary/foreign keys, indexes, transactions, views.
· Use SQL for querying; use parameterized queries to prevent SQL injection.
· Node.js integration: pg driver, Sequelize, Prisma.
· Transactions ensure ACID; use BEGIN/COMMIT/ROLLBACK.
· Performance: indexes, connection pooling, EXPLAIN ANALYZE, tuning.
· Security: parameterized queries, SSL, least privilege, row-level security.
· Test with a test database or pg-mem.
· Choose PostgreSQL for relational data, complex joins, and transactional consistency.

---

18. Interview Questions – Module 25

Beginner

1. What is PostgreSQL?
      PostgreSQL is a powerful, open-source, object-relational database system known for reliability, feature robustness, and performance. It uses SQL and supports ACID transactions.
2. What is a primary key?
      A column or set of columns that uniquely identifies each row in a table. It cannot contain NULL values.
3. How do you connect to PostgreSQL from Node.js?
      Use the pg library and create a Pool with connection string or config, then run queries with pool.query().

Intermediate

1. Explain foreign keys and referential integrity.
      A foreign key is a column that references a primary key in another table, establishing a relationship. Referential integrity ensures that the foreign key value must exist in the referenced table, preventing orphaned records.
2. What is a transaction? Why is it important?
      A transaction is a sequence of database operations that are executed as a single unit, ensuring atomicity, consistency, isolation, and durability (ACID). It's important for data integrity, especially when multiple operations must either all succeed or all fail.
3. How do you prevent SQL injection in Node.js with PostgreSQL?
      Use parameterized queries (e.g., pool.query('SELECT * FROM users WHERE id = $1', [id])). Never concatenate user input into SQL strings. ORMs like Sequelize/Prisma also provide safe query builders.

Advanced

1. What is MVCC and how does it benefit PostgreSQL?
      MVCC (Multi-Version Concurrency Control) allows multiple transactions to access the same data concurrently without blocking each other. It provides each transaction a snapshot of the database, enabling consistent reads while writes create new versions, reducing lock contention.
2. How do you optimize a slow query in PostgreSQL?
      Use EXPLAIN ANALYZE to see the query plan. Identify if indexes are missing; create appropriate indexes. Rewrite the query to avoid unnecessary joins or full scans. Consider using LIMIT, WHERE filters, and proper JOIN ordering. Update statistics with ANALYZE.
3. Explain connection pooling and why it's important.
      Connection pooling reuses existing database connections instead of opening a new one for each request. This reduces overhead, improves performance, and prevents resource exhaustion. In Node.js, use pg.Pool; in high-traffic scenarios, consider pgbouncer.

Scenario-Based

Q: You need to implement a money transfer between two accounts. How would you ensure data consistency?
Answer: Use a transaction. Begin a transaction, lock the two account rows using SELECT ... FOR UPDATE, debit one account and credit the other, and commit. If any step fails, rollback. Use CHECK constraints to prevent negative balances and parameterized queries to avoid injection.

Coding Questions

1. Write a parameterized query to insert a user into a users table.

```javascript
const name = 'Alice';
const email = 'alice@example.com';
const age = 30;
await pool.query(
  'INSERT INTO users (name, email, age) VALUES ($1, $2, $3)',
  [name, email, age]
);
```

2. Write a SQL query to get all orders for a user with id 1, joining users and orders tables.

```sql
SELECT o.* FROM orders o
JOIN users u ON o.user_id = u.id
WHERE u.id = 1;
```

---

19. Common Mistakes & Best Practices Summary

Mistake Best Practice
String concatenation in SQL Use parameterized queries
Not using transactions Use transactions for multi-step operations
Missing indexes Create indexes based on query patterns
Ignoring connection pooling Use Pool
Not handling NULLs Use COALESCE, NULLIF
Returning too much data Select only needed columns
Not using RETURNING Use RETURNING * for insert/update/delete
Hardcoding credentials Use environment variables
Not managing schema changes Use migrations (e.g., node-pg-migrate, Sequelize migrations)
Blocking event loop Use async/await with pg

---

This concludes Module 25: PostgreSQL. The next module will be Module 26: REST API Design, covering principles of designing RESTful APIs, best practices, versioning, authentication, pagination, and error handling.


Module 26: REST API Design

REST (Representational State Transfer) is an architectural style for designing networked applications. It relies on stateless, client-server communication, typically over HTTP. Designing a well-structured REST API is crucial for building scalable, maintainable, and easily consumable backend services. This module covers REST principles, resource naming, HTTP methods, status codes, versioning, authentication, pagination, error handling, and best practices. It also addresses how to design APIs that integrate seamlessly with React frontends.

---

1. Definition

1.1 What is REST API Design?

REST API design refers to the practice of structuring application programming interfaces (APIs) according to the principles of Representational State Transfer (REST). A REST API exposes resources (e.g., users, products) via HTTP endpoints, using standard HTTP methods (GET, POST, PUT, PATCH, DELETE) to perform operations on those resources. Data is typically exchanged in JSON or XML format.

1.2 What Problem It Solves

Without a standardized API design, APIs can be inconsistent, difficult to understand, and hard to maintain. REST provides a set of conventions that make APIs predictable, scalable, and easy to consume by clients. It leverages HTTP semantics, which are widely understood and supported.

1.3 Why It Was Introduced

REST was introduced by Roy Fielding in his 2000 doctoral dissertation as an architectural style for distributed hypermedia systems. It aimed to provide a simpler, more scalable alternative to complex RPC and SOAP protocols by using the existing HTTP protocol and its methods.

1.4 Where It Is Used

· Web and mobile applications
· Microservices communication
· Public APIs (e.g., GitHub, Twitter, Stripe)
· Backend for single-page applications (SPA)
· Internet of Things (IoT) device APIs

1.5 When It Should Be Used

· When you need a simple, stateless, and cacheable API.
· When you want to leverage HTTP methods and status codes.
· When the API is resource-oriented.
· When building web services consumed by various clients.

1.6 When It Should Not Be Used

· When you need real-time bidirectional communication (use WebSockets).
· When operations are procedure-oriented rather than resource-oriented (could use RPC/gRPC).
· When you need extremely low latency and binary serialization (gRPC/MessagePack may be better).
· When you need built-in stateful sessions (though REST can use tokens).

1.7 Relationship with Surrounding Concepts

· HTTP: REST is built on top of HTTP and its methods/status codes.
· JSON: The most common data format for REST APIs.
· Express: A popular Node.js framework for building REST APIs.
· MongoDB/PostgreSQL: Databases used to store resources.
· Authentication: REST APIs often use token-based authentication (JWT).

---

2. Why REST API Design Exists

2.1 The Problem Before REST

Before REST, APIs were often designed ad hoc, with inconsistent naming, methods, and error responses. SOAP was a heavyweight alternative using XML and complex specifications. RPC-style APIs were also used. These approaches led to:

· Steep learning curves.
· Poor interoperability.
· Difficulty in caching and scaling.
· Lack of standardization.

2.2 The Solution REST Provides

REST provides a set of architectural constraints that, when followed, produce APIs that are:

· Stateless: each request contains all necessary information.
· Client-server: separation of concerns.
· Cacheable: responses can be cached.
· Uniform interface: consistent resource identification and manipulation.
· Layered system: intermediate servers can be added.

These constraints promote scalability, simplicity, and evolvability.

2.3 What Happens If We Don't Use It?

You may end up with an API that is inconsistent, difficult to maintain, and hard for clients to use. It may not scale well or leverage HTTP caching. While you can design a successful API without strictly adhering to REST, understanding its principles helps make better decisions.

2.4 Alternatives

· GraphQL: flexible query language, allows clients to request specific fields.
· gRPC: high-performance, binary, based on Protocol Buffers, ideal for microservices.
· SOAP: legacy XML-based protocol, still used in enterprise.
· WebSockets: for real-time, bidirectional communication.

2.5 Why Choose REST?

· Simplicity and ease of use.
· Wide support across tools and languages.
· Leverages HTTP caching and semantics.
· Ideal for resource-oriented APIs.
· Human-readable (JSON).
· Easier to debug with browser/curl.

---

3. Core Concepts

3.1 Resources

A resource is any identifiable entity that can be manipulated via the API. Examples: users, products, orders. Each resource should have a unique identifier (URI). Resources are typically represented as JSON objects.

3.2 URIs (Endpoints)

URIs should be nouns, not verbs, and reflect the resource hierarchy. Use plural nouns for collections.

Examples:

· /users – collection of users
· /users/123 – a specific user
· /users/123/orders – sub-collection of orders for user 123

3.3 HTTP Methods

· GET: retrieve a resource or collection.
· POST: create a new resource.
· PUT: replace a resource entirely.
· PATCH: partially update a resource.
· DELETE: remove a resource.

3.4 HTTP Status Codes

· 200 OK: successful GET/PUT/PATCH.
· 201 Created: successful POST.
· 204 No Content: successful DELETE or empty response.
· 400 Bad Request: client error (validation failure).
· 401 Unauthorized: authentication required.
· 403 Forbidden: authenticated but not allowed.
· 404 Not Found: resource doesn't exist.
· 500 Internal Server Error: server error.

3.5 Statelessness

Each request from client must contain all information needed to process it. The server does not store client session state between requests. Authentication tokens are sent with each request.

3.6 Versioning

APIs should be versioned to allow changes without breaking existing clients. Common approaches: URI versioning (/v1/users), query parameter (?version=1), header (Accept: application/vnd.api+json;version=1). URI versioning is most popular.

3.7 Pagination, Filtering, Sorting

For collections, provide query parameters to control result sets:

· ?page=2&limit=20 – pagination.
· ?sort=created_at&order=desc – sorting.
· ?category=electronics – filtering.
· ?q=keyword – search.

3.8 Content Negotiation

The server should support different representations (JSON, XML) based on Accept header. JSON is most common.

3.9 HATEOAS (Hypermedia as the Engine of Application State)

A REST principle where responses include hyperlinks to related resources, enabling discoverability. While often not fully implemented, it can improve API usability.

---

4. Prerequisites

· Understanding of HTTP protocol (methods, status codes, headers).
· Basic knowledge of JSON.
· Familiarity with a backend framework (Express, Django, etc.).
· Understanding of databases.

---

5. Internal Working / Architecture

5.1 Request Processing Flow

```mermaid
flowchart LR
    Client[Client] -->|HTTP Request| Server[API Server]
    Server --> Middleware[Middleware Stack]
    Middleware --> Router[Router]
    Router --> Controller[Controller]
    Controller --> Service[Service Layer]
    Service --> Database[(Database)]
    Database --> Service
    Service --> Controller
    Controller --> Response[Response]
    Response --> Client
```

5.2 Typical API Architecture

· Routes: define endpoints and map to controllers.
· Controllers: handle request/response, validation, and call services.
· Services: contain business logic and interact with models/repositories.
· Models/Repositories: interact with database.
· Middleware: cross-cutting concerns (auth, logging, error handling, CORS).

5.3 Statelessness and Scaling

Because REST APIs are stateless, any server instance can handle any request (if backed by shared database). This enables horizontal scaling by adding more servers behind a load balancer.

5.4 Caching

REST responses can be cached at various levels (client, CDN, server) if the appropriate cache headers are set (Cache-Control, ETag). GET requests are cacheable; POST/PUT/DELETE generally not.

---

6. Syntax and Structure (Best Practices)

6.1 Naming Conventions

· Use lowercase letters and hyphens or underscores for multi-word resources (e.g., /blog-posts or /blog_posts). Hyphens are more common in URLs.
· Use plural nouns for collections (/users not /user).
· Keep URLs short and meaningful.
· Avoid deep nesting (max 2-3 levels). Use query parameters for filtering.

6.2 Request and Response Formats

· JSON is standard.
· Use consistent response envelopes for errors (e.g., { "error": { "code": 400, "message": "Invalid email" } }).
· Use consistent date/time formats (ISO 8601, UTC).

6.3 Example Endpoints

```
GET    /api/v1/products          # list products
POST   /api/v1/products          # create product
GET    /api/v1/products/:id      # get product
PUT    /api/v1/products/:id      # replace product
PATCH  /api/v1/products/:id      # partial update
DELETE /api/v1/products/:id      # delete product
```

6.4 Query Parameters

```
GET /api/v1/products?category=electronics&page=2&limit=20&sort=price&order=desc
```

---

7. Basic Example

7.1 Simple REST API with Express

```javascript
const express = require('express');
const app = express();
app.use(express.json());

let products = [
  { id: 1, name: 'Laptop', price: 999.99 },
  { id: 2, name: 'Shirt', price: 19.99 },
];

// GET all
app.get('/api/products', (req, res) => {
  res.json(products);
});

// GET one
app.get('/api/products/:id', (req, res) => {
  const product = products.find(p => p.id === parseInt(req.params.id));
  if (!product) return res.status(404).json({ message: 'Product not found' });
  res.json(product);
});

// POST create
app.post('/api/products', (req, res) => {
  const newProduct = { id: products.length + 1, ...req.body };
  products.push(newProduct);
  res.status(201).json(newProduct);
});

// PUT update
app.put('/api/products/:id', (req, res) => {
  const index = products.findIndex(p => p.id === parseInt(req.params.id));
  if (index === -1) return res.status(404).json({ message: 'Product not found' });
  products[index] = { id: parseInt(req.params.id), ...req.body };
  res.json(products[index]);
});

// DELETE
app.delete('/api/products/:id', (req, res) => {
  const index = products.findIndex(p => p.id === parseInt(req.params.id));
  if (index === -1) return res.status(404).json({ message: 'Product not found' });
  products.splice(index, 1);
  res.status(204).send();
});

app.listen(3000);
```

7.2 Using Proper Status Codes

· 201 Created for POST.
· 204 No Content for DELETE.
· 404 Not Found for missing resource.

---

8. Practical Example

8.1 Designing a User API with Validation and Pagination

Endpoint: /api/v1/users

· GET /api/v1/users?page=1&limit=10 – list users with pagination.
· POST /api/v1/users – create user with validation.
· GET /api/v1/users/:id – get user.
· PUT /api/v1/users/:id – full update.
· PATCH /api/v1/users/:id – partial update.
· DELETE /api/v1/users/:id – delete.

Validation rules:

· name required, string, length 2-100.
· email required, valid email, unique.
· age optional, integer, 0-120.

Controller example with validation:

```javascript
// controllers/usersController.js
const usersService = require('../services/usersService');

exports.getUsers = async (req, res, next) => {
  try {
    const page = parseInt(req.query.page) || 1;
    const limit = parseInt(req.query.limit) || 10;
    const users = await usersService.getUsers({ page, limit });
    res.json({
      data: users,
      pagination: { page, limit, total: users.length },
    });
  } catch (err) {
    next(err);
  }
};

exports.createUser = async (req, res, next) => {
  try {
    const { name, email, age } = req.body;
    // basic validation (could use Joi/Zod)
    if (!name || name.length < 2) {
      return res.status(400).json({ error: { message: 'Name must be at least 2 characters' } });
    }
    const newUser = await usersService.createUser({ name, email, age });
    res.status(201).json(newUser);
  } catch (err) {
    if (err.code === '23505') { // unique violation in PostgreSQL
      return res.status(409).json({ error: { message: 'Email already exists' } });
    }
    next(err);
  }
};
```

8.2 Response Envelope

Consistency in response format:

```json
{
  "data": [ ... ],
  "pagination": { "page": 1, "limit": 10, "total": 25 }
}
```

Error envelope:

```json
{
  "error": {
    "code": 400,
    "message": "Validation failed",
    "details": ["Name is required"]
  }
}
```

---

9. Advanced Example

9.1 Implementing HATEOAS Links

Add links to related resources in responses:

```json
{
  "id": 123,
  "name": "Alice",
  "links": {
    "self": "/api/v1/users/123",
    "orders": "/api/v1/users/123/orders",
    "update": "/api/v1/users/123",
    "delete": "/api/v1/users/123"
  }
}
```

This can be generated dynamically in the controller.

9.2 Versioning via URI and Header

URI versioning:

```
/api/v1/users
/api/v2/users
```

Header versioning:

Client sends Accept: application/vnd.myapi.v2+json.

9.3 Rate Limiting

Use express-rate-limit to limit requests:

```javascript
const rateLimit = require('express-rate-limit');
const limiter = rateLimit({
  windowMs: 15 * 60 * 1000, // 15 minutes
  max: 100,
  message: 'Too many requests from this IP',
});
app.use('/api/', limiter);
```

9.4 Pagination with Keyset

For large datasets, use keyset pagination (also called cursor-based):

```
GET /api/v1/users?limit=20&after=12345
```

Where after is the last ID seen. More efficient than offset for deep pages.

9.5 API Documentation

Use OpenAPI/Swagger to document endpoints, parameters, and responses. Tools like swagger-jsdoc and swagger-ui-express can generate interactive documentation.

---

10. Real-World Scenario

10.1 Problem: Designing a REST API for an E-Commerce Platform

The platform needs APIs for:

· Products: list, details, search, filter.
· Cart: add/remove items, view cart.
· Orders: create order from cart, view order history.
· Users: register, login, profile.

10.2 Solution

· Use REST principles with versioned endpoints (/api/v1).
· Use plural nouns for resources.
· Implement authentication via JWT; protected endpoints require Authorization: Bearer <token>.
· Use query parameters for filtering, sorting, pagination.
· Use consistent error responses.
· Document with OpenAPI.

Endpoint examples:

```
POST   /api/v1/auth/register
POST   /api/v1/auth/login
GET    /api/v1/products?category=electronics&page=2
POST   /api/v1/cart/items
GET    /api/v1/cart
POST   /api/v1/orders
GET    /api/v1/orders/:id
GET    /api/v1/users/profile
```

10.3 Architecture

```mermaid
flowchart LR
    Client[React Frontend] -->|JSON over HTTP| API[REST API]
    API --> AuthMiddleware[Auth Middleware]
    API --> Routes[Resource Routes]
    Routes --> Controllers[Controllers]
    Controllers --> Services[Services]
    Services --> DB[(Database)]
```

10.4 Implementation Highlights

· Routes are separated by resource.
· Controllers parse request and call services.
· Services handle business logic.
· Error middleware returns consistent JSON.
· Validation using Zod/Joi.

---

11. Common Mistakes

1. Using verbs in URIs – use nouns (/getUsers vs /users).
2. Not using proper HTTP methods – e.g., using POST for updates.
3. Returning wrong status codes – e.g., 200 for errors, or 500 for client errors.
4. Inconsistent error responses – some endpoints return string, others object.
5. Not versioning API – breaking changes break clients.
6. Ignoring pagination – returning entire dataset can cause performance issues.
7. Not validating input – leads to data corruption and security issues.
8. Leaking internal implementation details – stack traces, database errors.
9. Not using HTTPS – exposes sensitive data.
10. No rate limiting – vulnerable to abuse.
11. Deep nesting of resources – e.g., /users/1/orders/2/items/3. Keep shallow.
12. Using GET for state-changing operations – should be idempotent and safe.

---

12. Best Practices

· Use nouns for resources; plural for collections.
· Use HTTP methods correctly: GET (read), POST (create), PUT (replace), PATCH (partial update), DELETE (delete).
· Return appropriate status codes.
· Use consistent error format.
· Version your API (URI versioning is common).
· Implement pagination, filtering, sorting, and search.
· Use JSON for request/response.
· Use HTTPS everywhere.
· Use authentication and authorization (JWT, OAuth).
· Rate limit your API.
· Validate input on server side.
· Document your API (OpenAPI/Swagger).
· Use HATEOAS where helpful (links).
· Use consistent naming conventions (hyphens or underscores).
· Use Content-Type: application/json in responses.
· Log API requests for monitoring.
· Use ETag or Last-Modified for caching.

---

13. Security

· Authentication: Use JWT or OAuth2. Protect sensitive endpoints.
· Authorization: Enforce role-based access (admin, user).
· Input validation: Validate all incoming data to prevent injection attacks (SQL, NoSQL, XSS). Use libraries like Zod/Joi.
· Rate limiting: Prevent brute force and DoS.
· CORS: Restrict origins to trusted domains.
· Helmet: Set secure HTTP headers.
· HTTPS: Encrypt data in transit.
· Parameterized queries: Prevent SQL injection.
· Avoid exposing internal errors: Return generic error messages.
· Use short-lived tokens and refresh tokens.
· Use SameSite cookies if cookies are used.

---

14. Performance and Scalability

· Caching: Use HTTP caching headers, CDN, or Redis for frequent reads.
· Pagination: Always paginate large collections.
· Indexes: Ensure database indexes for query fields.
· Compression: Use compression middleware.
· Connection pooling: Use DB connection pools.
· Horizontal scaling: Stateless APIs can scale behind load balancer.
· Asynchronous processing: For long-running tasks, use queues (e.g., Bull).
· Use ETag and Last-Modified to reduce bandwidth.
· Profile endpoints; identify and optimize slow queries.

---

15. Testing

· Unit tests: test controllers, services, validation.
· Integration tests: test API endpoints with supertest and a test database.
· Mock external services if needed.
· Test all CRUD operations, validation, authentication, error handling.
· Use tools like Jest, Mocha, Chai.
· Consider Postman/Newman for API smoke tests.

Example test with Supertest:

```javascript
const request = require('supertest');
const app = require('../app');

describe('GET /api/v1/products', () => {
  it('returns list of products', async () => {
    const res = await request(app).get('/api/v1/products');
    expect(res.statusCode).toBe(200);
    expect(Array.isArray(res.body.data)).toBe(true);
  });
});
```

---

16. Comparison: REST vs GraphQL vs gRPC

Feature REST GraphQL gRPC
Data format JSON/XML JSON Protocol Buffers
Schema No built-in schema (documented via OpenAPI) Strong schema (SDL) Strong schema (.proto)
Flexibility Client receives fixed shape Client specifies fields Fixed by proto
Performance Good with HTTP/2 Can suffer N+1 but optimized Very high
Caching Built-in with HTTP More complex Limited
Learning curve Low Moderate Moderate
Use case CRUD APIs, web/mobile APIs with varying client needs Microservices, low latency

---

17. Quick Revision

· REST APIs are resource-oriented, stateless, and use HTTP methods.
· Use plural nouns for collections; use correct HTTP methods.
· Return proper status codes (200, 201, 204, 400, 401, 403, 404, 500).
· Version your API (/v1).
· Implement pagination, filtering, sorting.
· Use consistent JSON and error formats.
· Secure with JWT, validation, rate limiting, HTTPS.
· Document with OpenAPI.
· Test thoroughly with Supertest.

---

18. Interview Questions – Module 26

Beginner

1. What is REST?
      REST (Representational State Transfer) is an architectural style for designing networked applications, using HTTP methods and stateless communication.
2. What are the common HTTP methods used in REST APIs?
      GET (read), POST (create), PUT (replace), PATCH (partial update), DELETE (delete).
3. What is a resource in REST?
      A resource is an entity or object that can be accessed and manipulated via the API, identified by a URI.

Intermediate

1. Why should API endpoints use nouns instead of verbs?
      Because REST is resource-oriented; the HTTP method already conveys the action. Using nouns keeps the API intuitive and consistent.
2. How do you handle pagination in a REST API?
      Use query parameters like ?page=2&limit=20. Return pagination metadata in the response (total, page, limit). For large datasets, consider keyset pagination.
3. What is the difference between PUT and PATCH?
      PUT replaces the entire resource with the provided representation, while PATCH applies a partial update, modifying only the provided fields.

Advanced

1. How would you version a REST API?
      Use URI versioning (/v1/users), query parameter (?version=1), or custom header (Accept: application/vnd.api+json;version=1). URI versioning is the most common and explicit.
2. Explain HATEOAS and its benefits.
      HATEOAS (Hypermedia as the Engine of Application State) means that API responses include hyperlinks to related resources, allowing clients to navigate the API dynamically. It improves discoverability and reduces coupling, but adds complexity.
3. How do you handle authentication and authorization in a REST API?
      Use JWT (Bearer token) in the Authorization header. The server verifies the token on each request, extracts user info, and checks permissions. For finer control, use OAuth2 scopes or role-based access control.

Scenario-Based

Q: Your API is returning a 500 error for a validation issue. How do you fix the design?
Answer: The validation issue is a client error, so it should return 400 Bad Request with details about the invalid fields. I would add input validation middleware (e.g., Joi/Zod) that checks the request body and returns 400 with specific error messages before reaching the controller.

Coding Questions

1. Write an Express route that handles GET /api/users with pagination query parameters.

```javascript
app.get('/api/users', async (req, res) => {
  const page = parseInt(req.query.page) || 1;
  const limit = parseInt(req.query.limit) || 10;
  const offset = (page - 1) * limit;
  const users = await User.find().skip(offset).limit(limit);
  res.json({ data: users, page, limit });
});
```

2. Create a simple error-handling middleware for a REST API that returns JSON errors.

```javascript
app.use((err, req, res, next) => {
  const status = err.status || 500;
  res.status(status).json({
    error: {
      message: err.message || 'Internal Server Error',
      status,
    },
  });
});
```

---

19. Common Mistakes & Best Practices Summary

Mistake Best Practice
Using verbs in URLs Use nouns, let HTTP methods define action
Not using proper status codes Return 201 for creation, 204 for delete, 404 for missing
Inconsistent error format Use a uniform error object
Not versioning API Version from the start
Returning entire datasets Implement pagination
Skipping validation Validate all input server-side
Not using HTTPS Always use HTTPS
No rate limiting Add rate limiting to prevent abuse
Exposing internal errors Return generic errors, log details server-side
Deep resource nesting Keep nesting shallow (max 2-3)

---

This concludes Module 26: REST API Design. The next module will be Module 27: Authentication API, covering the backend implementation of authentication endpoints (register, login, refresh, logout) with JWT, bcrypt, and secure token management.


Module 27: Authentication API

Authentication API is a critical backend component that handles user registration, login, token issuance, token refresh, and logout. It enables secure access to protected resources and is the foundation of user identity management in web applications. This module covers the complete implementation of authentication endpoints using Node.js, Express, JWT, bcrypt, and secure token storage. You will learn how to build a production-ready authentication API that integrates seamlessly with React frontends.

---

1. Definition

1.1 What is an Authentication API?

An Authentication API is a set of backend endpoints that manage user identity and access. It typically includes:

· Registration: create a new user account.
· Login: verify credentials and issue tokens.
· Token refresh: obtain a new access token using a refresh token.
· Logout: invalidate tokens or clear session.

These endpoints use token-based authentication (usually JWT) to grant stateless, secure access to protected resources.

1.2 What Problem It Solves

It solves the problem of verifying user identity and managing sessions in a stateless, scalable manner. Without a proper authentication API, each protected endpoint would need to handle credential verification, leading to duplication, inconsistency, and security risks. Authentication API centralizes these concerns and provides a standardized way to authenticate users.

1.3 Why It Was Introduced

As web applications moved to single-page applications and mobile apps, traditional server-side sessions (cookies) became less suitable for cross-domain APIs. Token-based authentication, especially JWT, emerged as a solution that is stateless, scalable, and works well with REST APIs. Authentication APIs were designed to handle token generation, validation, and refresh.

1.4 Where It Is Used

· Web and mobile applications requiring user accounts.
· Single-page applications (SPA) with a backend API.
· Microservices where each service needs to authenticate requests.
· Third-party integrations and public APIs.

1.5 When It Should Be Used

· When your application has protected resources that require user authentication.
· When you need to manage user sessions in a stateless manner.
· When you want to support multiple client types (web, mobile) with the same backend.

1.6 When It Should Not Be Used

· For simple internal tools with no user accounts (though basic auth could be used).
· If you require server-side sessions with server-side logout (JWT doesn't support invalidation unless you keep a blacklist).
· If you need fine-grained real-time session revocation (consider OAuth2 with introspection).

1.7 Relationship with Surrounding Concepts

· JWT (JSON Web Token): compact, signed token for transmitting claims.
· bcrypt: library for hashing passwords.
· Express: framework to build the API routes.
· MongoDB/PostgreSQL: database to store user credentials and tokens.
· HTTP-only cookies: secure storage for refresh tokens.
· Authorization: determining what an authenticated user can access.

---

2. Why Authentication API Exists

2.1 The Problem Before Authentication API

Before standardized authentication APIs, each application implemented its own user management, often storing passwords insecurely and using custom session logic. This led to security vulnerabilities (e.g., plaintext passwords, SQL injection), poor user experience, and duplication across services.

2.2 The Solution Authentication API Provides

A dedicated Authentication API provides:

· Centralized user registration and login.
· Secure password hashing.
· Stateless token issuance.
· Token refresh for extended sessions.
· Consistent error handling.
· Easy integration with frontends and other services.

2.3 What Happens If We Don't Use It?

You would need to implement authentication logic in every endpoint or service, leading to security risks and maintainability issues. Passwords might be stored without proper hashing, tokens might be mishandled, and session management would be inconsistent.

2.4 Alternatives

· OAuth2/OpenID Connect: for delegated authorization and third-party login.
· Session-based authentication: server-side sessions with cookies (traditional).
· Passport.js: a middleware for Node.js that supports multiple strategies.
· Auth services: Auth0, Firebase Auth, AWS Cognito.

2.5 Why Choose JWT-based Authentication API?

· Stateless: no server session store needed.
· Scalable: any server can validate token if it has the secret.
· Cross-platform: works well with mobile and web.
· Self-contained: user info in token.
· Easy to integrate with REST APIs.

---

3. Core Concepts

3.1 User Registration

The process of creating a new user account. It involves:

· Validating input (email format, password strength).
· Checking if email already exists.
· Hashing the password (bcrypt, argon2).
· Storing user in database.
· Optionally issuing tokens immediately.

3.2 User Login

The process of verifying credentials. It involves:

· Finding user by email/username.
· Comparing provided password with stored hash (bcrypt.compare).
· Generating access token and refresh token.
· Returning tokens to client.

3.3 Access Token

A short-lived JWT that grants access to protected endpoints. It is sent in the Authorization header as a Bearer token. It contains user ID, role, and expiration.

3.4 Refresh Token

A long-lived token used to obtain a new access token without re-authentication. It is usually stored in an HTTP-only cookie (or sometimes in the database). It should be rotated on each refresh for security.

3.5 Password Hashing

Passwords are never stored in plaintext. They are hashed using a computationally expensive algorithm (bcrypt, argon2) with a salt. On login, the provided password is hashed and compared to the stored hash.

3.6 Token Refresh Flow

1. Client sends request with access token.
2. Server returns 401 if token expired.
3. Client sends refresh token (via cookie or body) to /auth/refresh.
4. Server validates refresh token and issues new access token (and possibly new refresh token).
5. Client retries the original request with new token.

3.7 Logout

Logout involves clearing tokens on the client and optionally invalidating the refresh token on the server (e.g., by removing it from database or blacklisting). For JWT, server-side invalidation is not built-in, so a blacklist or short expiry is used.

3.8 Token Storage

· Access token: kept in memory (e.g., React state) or localStorage (with caution). Short-lived.
· Refresh token: in HTTP-only cookie with Secure, SameSite=Strict, HttpOnly. This protects from XSS.

3.9 Rate Limiting

To prevent brute-force attacks on login/register endpoints, implement rate limiting (e.g., 5 attempts per 15 minutes per IP).

3.10 CSRF Protection

If refresh token is in cookie, CSRF is a concern. Use SameSite cookies and/or CSRF tokens. The refresh endpoint should validate origin.

---

4. Prerequisites

· Node.js and Express.js knowledge.
· Understanding of JWT and bcrypt.
· Database setup (MongoDB/PostgreSQL).
· Basic security knowledge.

---

5. Internal Working

5.1 Registration Flow

```mermaid
sequenceDiagram
    Client->>Server: POST /auth/register { email, password }
    Server->>Database: Check if email exists
    Database-->>Server: Not found
    Server->>Server: Hash password with bcrypt
    Server->>Database: Insert new user
    Server-->>Client: 201 Created, user info
```

5.2 Login Flow

```mermaid
sequenceDiagram
    Client->>Server: POST /auth/login { email, password }
    Server->>Database: Find user by email
    Database-->>Server: User record
    Server->>Server: bcrypt.compare(password, hash)
    Server->>Server: Generate access token + refresh token
    Server-->>Client: 200 OK, access token, refresh token (cookie)
```

5.3 Refresh Flow

```mermaid
sequenceDiagram
    Client->>Server: GET /protected (with access token)
    Server-->>Client: 401 Unauthorized
    Client->>Server: POST /auth/refresh (with refresh cookie)
    Server->>Server: Validate refresh token
    Server->>Server: Issue new access token
    Server-->>Client: New access token
    Client->>Server: Retry original request (with new token)
    Server-->>Client: 200 OK
```

5.4 Token Validation

When a protected route is hit, middleware:

1. Extracts Authorization header.
2. Verifies JWT signature and expiration.
3. Extracts user info (id, role) and attaches to req.user.
4. Calls next() or returns 401.

---

6. Syntax and Structure

6.1 Project Structure

```
backend/
├── controllers/
│   └── authController.js
├── middleware/
│   ├── authMiddleware.js
│   └── errorHandler.js
├── models/
│   └── User.js
├── routes/
│   └── authRoutes.js
├── utils/
│   ├── generateTokens.js
│   └── validate.js
├── config/
│   └── index.js
├── .env
├── app.js
└── server.js
```

6.2 Environment Variables

```
PORT=5000
DATABASE_URL=postgres://...
ACCESS_TOKEN_SECRET=...
REFRESH_TOKEN_SECRET=...
ACCESS_TOKEN_EXPIRY=15m
REFRESH_TOKEN_EXPIRY=7d
```

6.3 User Model (Mongoose example)

```javascript
const mongoose = require('mongoose');
const bcrypt = require('bcrypt');

const userSchema = new mongoose.Schema({
  email: { type: String, required: true, unique: true },
  password: { type: String, required: true },
  role: { type: String, enum: ['user', 'admin'], default: 'user' },
  createdAt: { type: Date, default: Date.now },
});

userSchema.pre('save', async function (next) {
  if (!this.isModified('password')) return next();
  const salt = await bcrypt.genSalt(10);
  this.password = await bcrypt.hash(this.password, salt);
  next();
});

userSchema.methods.comparePassword = function (candidatePassword) {
  return bcrypt.compare(candidatePassword, this.password);
};

module.exports = mongoose.model('User', userSchema);
```

6.4 Generate Tokens

```javascript
const jwt = require('jsonwebtoken');

function generateAccessToken(user) {
  return jwt.sign(
    { userId: user._id, role: user.role },
    process.env.ACCESS_TOKEN_SECRET,
    { expiresIn: process.env.ACCESS_TOKEN_EXPIRY }
  );
}

function generateRefreshToken(user) {
  return jwt.sign(
    { userId: user._id },
    process.env.REFRESH_TOKEN_SECRET,
    { expiresIn: process.env.REFRESH_TOKEN_EXPIRY }
  );
}
```

6.5 Auth Controller

```javascript
exports.register = async (req, res, next) => {
  try {
    const { email, password } = req.body;
    const existingUser = await User.findOne({ email });
    if (existingUser) {
      return res.status(409).json({ message: 'Email already exists' });
    }
    const user = await User.create({ email, password });
    res.status(201).json({ id: user._id, email: user.email });
  } catch (err) {
    next(err);
  }
};

exports.login = async (req, res, next) => {
  try {
    const { email, password } = req.body;
    const user = await User.findOne({ email });
    if (!user || !(await user.comparePassword(password))) {
      return res.status(401).json({ message: 'Invalid credentials' });
    }
    const accessToken = generateAccessToken(user);
    const refreshToken = generateRefreshToken(user);
    res.cookie('refreshToken', refreshToken, {
      httpOnly: true,
      secure: process.env.NODE_ENV === 'production',
      sameSite: 'strict',
      maxAge: 7 * 24 * 60 * 60 * 1000, // 7 days
    });
    res.json({ accessToken });
  } catch (err) {
    next(err);
  }
};

exports.refresh = (req, res) => {
  const refreshToken = req.cookies.refreshToken;
  if (!refreshToken) return res.status(401).json({ message: 'No refresh token' });
  try {
    const payload = jwt.verify(refreshToken, process.env.REFRESH_TOKEN_SECRET);
    const newAccessToken = generateAccessToken({ _id: payload.userId, role: payload.role });
    res.json({ accessToken: newAccessToken });
  } catch (err) {
    return res.status(403).json({ message: 'Invalid refresh token' });
  }
};

exports.logout = (req, res) => {
  res.clearCookie('refreshToken');
  res.status(204).send();
};
```

---

7. Basic Example

7.1 Express App with Auth Routes

```javascript
const express = require('express');
const cookieParser = require('cookie-parser');
const authRoutes = require('./routes/authRoutes');
require('dotenv').config();

const app = express();
app.use(express.json());
app.use(cookieParser());

app.use('/auth', authRoutes);

app.listen(5000, () => console.log('Server running'));
```

7.2 Simple Register/Login with JWT

```javascript
// routes/authRoutes.js
const router = require('express').Router();
const { register, login, refresh, logout } = require('../controllers/authController');

router.post('/register', register);
router.post('/login', login);
router.post('/refresh', refresh);
router.post('/logout', logout);

module.exports = router;
```

---

8. Practical Example

8.1 Protecting Routes with Middleware

```javascript
// middleware/authMiddleware.js
const jwt = require('jsonwebtoken');

function authenticate(req, res, next) {
  const authHeader = req.headers.authorization;
  if (!authHeader || !authHeader.startsWith('Bearer ')) {
    return res.status(401).json({ message: 'Authentication required' });
  }
  const token = authHeader.split(' ')[1];
  try {
    const payload = jwt.verify(token, process.env.ACCESS_TOKEN_SECRET);
    req.user = { id: payload.userId, role: payload.role };
    next();
  } catch (err) {
    return res.status(403).json({ message: 'Invalid or expired token' });
  }
}

function authorize(...roles) {
  return (req, res, next) => {
    if (!roles.includes(req.user.role)) {
      return res.status(403).json({ message: 'Forbidden' });
    }
    next();
  };
}

module.exports = { authenticate, authorize };
```

8.2 Using Protected Route

```javascript
router.get('/profile', authenticate, (req, res) => {
  res.json({ user: req.user });
});

router.get('/admin', authenticate, authorize('admin'), (req, res) => {
  res.json({ message: 'Admin data' });
});
```

8.3 Rate Limiting on Login

```javascript
const rateLimit = require('express-rate-limit');
const loginLimiter = rateLimit({
  windowMs: 15 * 60 * 1000,
  max: 5,
  message: 'Too many login attempts, please try again later',
});
router.post('/login', loginLimiter, login);
```

---

9. Advanced Example

9.1 Refresh Token Rotation and Storage in Database

For enhanced security, store refresh tokens in database, rotate them on each refresh, and revoke on logout.

User model (add refreshToken field):

```javascript
refreshToken: { type: String, default: null },
```

Login:

```javascript
const refreshToken = generateRefreshToken(user);
user.refreshToken = refreshToken;
await user.save();
res.cookie('refreshToken', refreshToken, { httpOnly: true, secure: true, sameSite: 'strict' });
```

Refresh:

```javascript
exports.refresh = async (req, res, next) => {
  try {
    const refreshToken = req.cookies.refreshToken;
    if (!refreshToken) return res.status(401).json({ message: 'No refresh token' });
    const payload = jwt.verify(refreshToken, process.env.REFRESH_TOKEN_SECRET);
    const user = await User.findById(payload.userId);
    if (!user || user.refreshToken !== refreshToken) {
      return res.status(403).json({ message: 'Invalid refresh token' });
    }
    const newAccessToken = generateAccessToken(user);
    const newRefreshToken = generateRefreshToken(user);
    user.refreshToken = newRefreshToken;
    await user.save();
    res.cookie('refreshToken', newRefreshToken, { httpOnly: true, secure: true, sameSite: 'strict' });
    res.json({ accessToken: newAccessToken });
  } catch (err) {
    next(err);
  }
};
```

Logout:

```javascript
exports.logout = async (req, res) => {
  const refreshToken = req.cookies.refreshToken;
  if (refreshToken) {
    const user = await User.findOne({ refreshToken });
    if (user) {
      user.refreshToken = null;
      await user.save();
    }
  }
  res.clearCookie('refreshToken');
  res.status(204).send();
};
```

9.2 Using Argon2 instead of bcrypt

Argon2 is recommended for password hashing due to stronger security properties.

Install: npm install argon2

```javascript
const argon2 = require('argon2');

userSchema.pre('save', async function (next) {
  if (!this.isModified('password')) return next();
  this.password = await argon2.hash(this.password);
  next();
});

userSchema.methods.comparePassword = function (candidate) {
  return argon2.verify(this.password, candidate);
};
```

9.3 Handling CSRF for Refresh Cookie

Add a CSRF token in a non-HttpOnly cookie and require it in header on refresh requests.

Login:

```javascript
const csrfToken = crypto.randomBytes(32).toString('hex');
res.cookie('csrfToken', csrfToken, { httpOnly: false, sameSite: 'strict', secure: true });
```

Refresh endpoint:

```javascript
const csrfToken = req.cookies.csrfToken;
const headerCsrf = req.headers['x-csrf-token'];
if (csrfToken !== headerCsrf) {
  return res.status(403).json({ message: 'CSRF token mismatch' });
}
```

---

10. Real-World Scenario

10.1 Problem: Build a Secure Authentication API for a Full-Stack App

The app needs:

· User registration and login.
· Password hashing.
· Short-lived access token (15 min) and long-lived refresh token (7 days).
· Refresh token stored in HTTP-only cookie with rotation.
· Rate limiting to prevent brute force.
· Role-based access (admin/user).
· Logout that invalidates refresh token.

10.2 Solution

· Use Express, MongoDB, JWT, and bcrypt/argon2.
· Implement auth routes: register, login, refresh, logout.
· Use middleware for authentication and authorization.
· Store refresh token in database for rotation and revocation.
· Use rate limiting on login and register.
· Use HTTP-only cookies for refresh token.

10.3 Architecture

```mermaid
flowchart LR
    Client[React Frontend] --> Register[POST /auth/register]
    Client --> Login[POST /auth/login]
    Client --> Refresh[POST /auth/refresh]
    Client --> Logout[POST /auth/logout]
    Register --> DB[(MongoDB)]
    Login --> JWT[Generate Tokens]
    JWT --> Cookie[Set Refresh Cookie]
    Refresh --> Validate[Validate Refresh Token]
    Validate --> Rotate[Rotate Refresh Token]
    Logout --> Revoke[Revoke Refresh Token]
```

10.4 Implementation Highlights

· User model with refreshToken field.
· authMiddleware for protected routes.
· authorize middleware for role checks.
· Rate limiting with express-rate-limit.
· Password hashing with argon2.
· Token generation with short expiry.
· Refresh token rotation and revocation.
· Secure cookies with HttpOnly, Secure, SameSite.

---

11. Common Mistakes

1. Storing passwords in plaintext – always hash with bcrypt/argon2.
2. Using long-lived access tokens – keep access token short (15-60 min).
3. Not rotating refresh tokens – vulnerable to token theft; rotate on each refresh.
4. Not storing refresh token securely – use HTTP-only cookies.
5. Not validating input – email format, password strength.
6. Not using HTTPS – tokens exposed in transit.
7. Not implementing rate limiting – brute force risk.
8. Not handling CSRF for cookie-based refresh – use SameSite and CSRF tokens.
9. Inconsistent error messages – can lead to user enumeration.
10. Not logging out properly – clear cookies and revoke tokens server-side.
11. Using Math.random() for secrets – use crypto.randomBytes or strong secret generator.
12. Not checking for duplicate email – leads to unique constraint errors.

---

12. Best Practices

· Hash passwords with bcrypt (cost 10+) or argon2.
· Use short-lived access tokens (15 min) and rotate refresh tokens.
· Store refresh token in HTTP-only cookie with Secure, SameSite=Strict.
· Keep access token in memory on client; don't store in localStorage if possible.
· Implement rate limiting on auth endpoints.
· Validate and sanitize all inputs.
· Use generic error messages to avoid user enumeration.
· Log authentication events (login, logout, refresh) for security monitoring.
· Use environment variables for secrets.
· Rotate refresh tokens on every refresh; revoke on logout.
· Use HTTPS in production.
· Implement CSRF protection for refresh endpoint.
· Use a dedicated auth controller and service layer.

---

13. Security

· Password hashing: bcrypt/argon2 with salt.
· JWT security: use strong secrets, short expiry, include iss and aud claims if needed.
· Token storage: access token in memory, refresh token in HTTP-only cookie.
· CSRF: use SameSite cookies; optionally CSRF tokens for refresh.
· Rate limiting: prevent brute force.
· Input validation: prevent injection and malformed data.
· HTTPS: always.
· Secure headers: helmet.
· CORS: restrict origins.
· User enumeration: return generic "Invalid credentials" for both wrong email and wrong password.
· Session fixation: generate new tokens on login/refresh.
· Revocation: store refresh token in DB and revoke on logout/rotation.

---

14. Performance and Scalability

· Token verification is stateless and fast.
· Database queries for refresh token rotation; index refreshToken field.
· Use connection pooling.
· Rate limiting in memory or with Redis for distributed.
· Consider using a shared secret or JWKS for multi-service validation.
· Use bcrypt asynchronously to avoid blocking event loop.
· Cache user data if needed.

---

15. Testing

· Test registration with valid/invalid data.
· Test login with correct/wrong credentials.
· Test refresh flow with valid/expired/invalid tokens.
· Test logout.
· Test protected routes with and without token.
· Test rate limiting.
· Use Jest, Supertest, and a test database.

Example test:

```javascript
const request = require('supertest');
const app = require('../app');

describe('POST /auth/register', () => {
  it('creates a new user', async () => {
    const res = await request(app)
      .post('/auth/register')
      .send({ email: 'test@example.com', password: 'password123' });
    expect(res.statusCode).toBe(201);
  });

  it('returns 409 for duplicate email', async () => {
    await request(app).post('/auth/register').send({ email: 'test@example.com', password: 'password123' });
    const res = await request(app).post('/auth/register').send({ email: 'test@example.com', password: 'password123' });
    expect(res.statusCode).toBe(409);
  });
});
```

---

16. Comparison: JWT vs Session-based Authentication

Feature JWT Session-based
State Stateless (client holds token) Stateful (server stores session)
Scalability High (no server session store) Requires shared session store
Storage Client-side (header/cookie) Server-side (memory/DB)
Invalidation Harder (expiry, blacklist) Easy (destroy session)
Security Vulnerable if stolen; use short expiry Protected by cookie flags
Use case APIs, microservices, mobile Traditional web apps

JWT is often preferred for APIs, but session-based can be more secure for server-rendered apps if implemented properly.

---

17. Quick Revision

· Authentication API handles register, login, refresh, logout.
· Hash passwords with bcrypt/argon2.
· Use JWT for access tokens (short-lived) and refresh tokens (long-lived).
· Store refresh token in HTTP-only cookie.
· Implement rate limiting, validation, and CSRF protection.
· Use middleware to protect routes.
· Rotate and revoke refresh tokens.
· Test all endpoints.

---

18. Interview Questions – Module 27

Beginner

1. What is an Authentication API?
      A backend service that handles user registration, login, token issuance/refresh, and logout.
2. What is JWT?
      JSON Web Token, a compact signed token used for authentication and information exchange.
3. Why do we hash passwords?
      To protect user credentials; even if database is compromised, attackers cannot easily recover passwords.

Intermediate

1. Explain the difference between access token and refresh token.
      Access token is short-lived and used to access protected resources. Refresh token is long-lived and used to obtain new access tokens without re-authentication.
2. How do you store tokens securely?
      Access token in memory (or short-lived in localStorage with caution). Refresh token in HTTP-only cookie with Secure and SameSite flags.
3. What is token rotation?
      Issuing a new refresh token each time one is used, and invalidating the old one. This reduces the window of misuse if a token is stolen.

Advanced

1. How do you implement refresh token rotation?
      Store the refresh token in the database. On refresh, validate the provided token, generate a new one, update the database, and set the new cookie. This invalidates the old token.
2. How do you prevent CSRF on the refresh endpoint?
      Use SameSite=Strict cookies and/or a CSRF token (e.g., in a non-HttpOnly cookie and required in a custom header). Validate the origin of the request.
3. Why is it important to use generic error messages on login?
      To prevent user enumeration. If the API says "email not found" vs "incorrect password", attackers can determine which emails exist. A generic "Invalid credentials" prevents this.

Scenario-Based

Q: Your access token expires every 15 minutes. How do you keep the user logged in without prompting them to log in again?
Answer: Use a refresh token stored in an HTTP-only cookie. When the access token expires, the frontend automatically calls the refresh endpoint to get a new access token, then retries the original request. This is done in an Axios interceptor.

Coding Questions

1. Write an Express route for user registration with password hashing.

```javascript
router.post('/register', async (req, res) => {
  const { email, password } = req.body;
  const hashedPassword = await bcrypt.hash(password, 10);
  const user = await User.create({ email, password: hashedPassword });
  res.status(201).json({ id: user.id, email: user.email });
});
```

2. Create an authentication middleware that verifies a JWT.

```javascript
function authenticate(req, res, next) {
  const token = req.headers.authorization?.split(' ')[1];
  if (!token) return res.status(401).json({ message: 'Token required' });
  try {
    const payload = jwt.verify(token, process.env.ACCESS_TOKEN_SECRET);
    req.user = payload;
    next();
  } catch {
    res.status(403).json({ message: 'Invalid token' });
  }
}
```

---

19. Common Mistakes & Best Practices Summary

Mistake Best Practice
Storing plaintext passwords Hash with bcrypt/argon2
Using long-lived access tokens Keep access token short (15 min)
Not rotating refresh tokens Rotate on every refresh
Storing refresh token in localStorage Use HTTP-only cookie
Not implementing rate limiting Add rate limiter to login/register
Returning specific error messages Use generic error messages
Not using HTTPS Always use HTTPS
Not revoking tokens on logout Store refresh token in DB and revoke
Not validating input Validate email/password

---

This concludes Module 27: Authentication API. The next module will be Module 28: Connecting React Frontend to Backend, covering integration of React with the authentication API and other backend services, including CORS, Axios setup, token handling, and deployment considerations.

Module 28: Connecting React Frontend to Backend

Connecting a React frontend to a backend involves setting up communication between the client-side application and server-side APIs. This module covers the essential steps: configuring CORS, setting up an Axios instance with interceptors, handling authentication tokens, managing environment variables, integrating with React context, and ensuring smooth error and loading states. By the end, you will be able to connect a React SPA to a Node.js/Express backend securely and efficiently.

---

1. Definition

1.1 What is Connecting React Frontend to Backend?

Connecting React frontend to backend refers to the process of enabling a React single-page application (SPA) to communicate with a server-side application (typically a REST API built with Express, Django, etc.). This involves making HTTP requests from the frontend to backend endpoints, handling responses, and managing cross-cutting concerns like authentication, error handling, and data fetching.

1.2 What Problem It Solves

React apps are static frontends; they need data and services from a backend to be fully functional. Without a proper connection strategy, the frontend may suffer from CORS issues, inconsistent API calls, repeated authentication logic, and poor error handling. A structured approach centralizes API communication, handles tokens, and ensures a smooth user experience.

1.3 Why It Was Introduced

As single-page applications became popular, the separation between frontend and backend became standard. This required standardized ways to handle cross-origin requests, manage authentication tokens, and abstract API calls. Tools like Axios and patterns like interceptors emerged to simplify this integration.

1.4 Where It Is Used

· Web applications with separate frontend and backend.
· Mobile apps consuming REST APIs.
· Microservices with a BFF (Backend for Frontend).
· Full-stack JavaScript applications (React + Node.js).

1.5 When It Should Be Used

· When building any React app that needs server-side data or authentication.
· When you have multiple frontend clients (web, mobile) consuming the same backend.
· When you want to centralize API logic and token management.

1.6 When It Should Not Be Used

· For purely static sites with no backend.
· If you are using a framework like Next.js where backend and frontend are integrated (though you still connect to external APIs).
· For very simple applications where direct fetch calls might suffice without abstraction.

1.7 Relationship with Surrounding Concepts

· CORS: security mechanism that allows cross-origin requests.
· Axios: popular HTTP client for making requests.
· JWT: token used for authentication.
· React Context: for managing authentication state.
· Environment variables: for API base URLs and configuration.
· Express: backend framework often used.

---

2. Why Connecting React Frontend to Backend Exists

2.1 The Problem Before

Before the rise of SPAs, frontend and backend were often served together (server-rendered). As React SPAs became common, frontend was served separately from backend APIs, leading to cross-origin issues and the need for token-based authentication. Developers needed a way to reliably and securely communicate between the two.

2.2 The Solution It Provides

· CORS configuration: allows the frontend to make requests to a different origin.
· Axios instance: provides a centralized HTTP client with interceptors for tokens and errors.
· Token refresh: automatically handles expired access tokens.
· Auth context: shares authentication state across the app.
· Environment variables: manage API URLs per environment.

2.3 What Happens If We Don't Use It?

You would have to:

· Manually set CORS headers (or face CORS errors).
· Repeat fetch/axios logic in every component.
· Manually attach tokens.
· Handle refresh logic in multiple places.
· Duplicate loading/error state management.

This leads to bugs, security vulnerabilities, and maintainability issues.

2.4 Alternatives

· Use Fetch API directly with wrapper functions.
· Use libraries like React Query or SWR for data fetching (they handle caching and loading).
· Use GraphQL with Apollo Client (different approach).
· Use a full-stack framework like Next.js that handles backend integration.

2.5 Why Choose Axios + Interceptors?

Axios provides a simple, promise-based API with interceptors that make it easy to handle authentication headers and token refresh globally. It works in both browser and Node.js, supports request cancellation, and has a large ecosystem. This pattern is widely adopted and understood.

---

3. Core Concepts

3.1 CORS (Cross-Origin Resource Sharing)

CORS is a browser security mechanism that allows a server to indicate which origins are permitted to load its resources. When the frontend and backend are on different origins (e.g., localhost:3000 and localhost:5000), the browser blocks requests unless the server includes appropriate CORS headers.

Key headers:

· Access-Control-Allow-Origin: specifies allowed origins (e.g., http://localhost:3000).
· Access-Control-Allow-Methods: allowed HTTP methods.
· Access-Control-Allow-Headers: allowed request headers.
· Access-Control-Allow-Credentials: whether credentials (cookies) are allowed.

3.2 API Base URL Configuration

The frontend needs to know the backend's base URL. This is typically set in environment variables (VITE_API_URL for Vite, REACT_APP_API_URL for CRA). It allows different URLs for development, staging, and production.

Example:

```javascript
const apiBaseUrl = import.meta.env.VITE_API_URL || 'http://localhost:5000';
```

3.3 Axios Instance

Creating a dedicated Axios instance with a base URL, default headers, and interceptors centralizes API configuration. It avoids repeating base URL and header setup in every request.

```javascript
import axios from 'axios';

const api = axios.create({
  baseURL: import.meta.env.VITE_API_URL,
  timeout: 10000,
  headers: { 'Content-Type': 'application/json' },
});
```

3.4 Request Interceptor

A request interceptor runs before each request is sent. It is used to attach authentication tokens (JWT) to the Authorization header.

```javascript
api.interceptors.request.use(
  (config) => {
    const accessToken = getAccessToken(); // from memory or storage
    if (accessToken) {
      config.headers.Authorization = `Bearer ${accessToken}`;
    }
    return config;
  },
  (error) => Promise.reject(error)
);
```

3.5 Response Interceptor and Token Refresh

A response interceptor runs after a response is received. It is used to handle global errors, especially 401 Unauthorized, by attempting to refresh the access token and retrying the request.

```javascript
api.interceptors.response.use(
  (response) => response,
  async (error) => {
    const originalRequest = error.config;
    if (error.response?.status === 401 && !originalRequest._retry) {
      originalRequest._retry = true;
      try {
        const newAccessToken = await refreshAccessToken(); // calls /auth/refresh
        originalRequest.headers.Authorization = `Bearer ${newAccessToken}`;
        return api(originalRequest);
      } catch (refreshError) {
        // logout or redirect
        return Promise.reject(refreshError);
      }
    }
    return Promise.reject(error);
  }
);
```

3.6 Authentication Context

React Context is used to manage the authentication state (user, access token) and provide login/logout functions to components. It centralizes auth logic and makes it accessible anywhere.

3.7 Environment Variables

Environment variables store configuration like API base URL, which changes between environments. In Vite, variables prefixed with VITE_ are exposed to the client.

3.8 Loading and Error States

Proper handling of loading and error states ensures a good user experience. This involves setting state variables (loading, error) before and after API calls, and displaying appropriate UI.

3.9 Same-Origin vs Cross-Origin

If frontend and backend are served from the same origin (e.g., via Nginx proxy or Next.js), CORS is not needed. For separate origins, CORS must be configured.

---

4. Prerequisites

· React and Express fundamentals.
· Understanding of HTTP requests and responses.
· Knowledge of JWT authentication (from Module 10 and 27).
· Basic familiarity with Axios or Fetch API.

---

5. Internal Working / Architecture

5.1 Typical Connection Flow

```mermaid
flowchart LR
    React[React Component] --> API[Axios Instance]
    API --> RequestInterceptor[Request Interceptor: add token]
    RequestInterceptor --> Backend[Backend API]
    Backend --> ResponseInterceptor[Response Interceptor: handle 401]
    ResponseInterceptor -->|Retry with new token| Backend
    ResponseInterceptor --> React
```

5.2 Token Refresh Flow

1. Client makes a request with access token.
2. Server responds 401 (expired).
3. Response interceptor catches 401, calls refresh endpoint with refresh token (in HTTP-only cookie).
4. Server issues new access token.
5. Interceptor updates token and retries original request.
6. Original request succeeds.

5.3 Auth Context Flow

· On login, AuthProvider calls login service, stores access token in memory and user in state.
· On app load, attempt to restore session by calling refresh endpoint (using cookie).
· Provide login, logout, user to components via context.

5.4 CORS Preflight

For requests with custom headers (e.g., Authorization), the browser sends an OPTIONS preflight request to check CORS headers. The backend must handle OPTIONS and return appropriate headers.

---

6. Syntax and Setup

6.1 Backend CORS Configuration (Express)

Install cors package:

```bash
npm install cors
```

Basic usage:

```javascript
const express = require('express');
const cors = require('cors');
const app = express();

app.use(cors({
  origin: process.env.FRONTEND_ORIGIN || 'http://localhost:3000',
  credentials: true, // allow cookies
  methods: ['GET', 'POST', 'PUT', 'PATCH', 'DELETE'],
  allowedHeaders: ['Content-Type', 'Authorization'],
}));
```

If using credentials (cookies), do not set origin to *; specify exact origin.

6.2 Frontend Axios Instance

Create src/services/api.js:

```javascript
import axios from 'axios';

const api = axios.create({
  baseURL: import.meta.env.VITE_API_URL,
  withCredentials: true, // send cookies for refresh
});

// Request interceptor
api.interceptors.request.use((config) => {
  const token = localStorage.getItem('accessToken'); // or from memory
  if (token) {
    config.headers.Authorization = `Bearer ${token}`;
  }
  return config;
});

// Response interceptor for refresh
let isRefreshing = false;
let failedQueue = [];

const processQueue = (error, token = null) => {
  failedQueue.forEach(prom => {
    if (error) prom.reject(error);
    else prom.resolve(token);
  });
  failedQueue = [];
};

api.interceptors.response.use(
  (response) => response,
  async (error) => {
    const originalRequest = error.config;
    if (error.response?.status === 401 && !originalRequest._retry) {
      if (isRefreshing) {
        return new Promise((resolve, reject) => {
          failedQueue.push({ resolve, reject });
        }).then(token => {
          originalRequest.headers.Authorization = `Bearer ${token}`;
          return api(originalRequest);
        }).catch(err => Promise.reject(err));
      }

      originalRequest._retry = true;
      isRefreshing = true;

      try {
        const { data } = await axios.post(`${import.meta.env.VITE_API_URL}/auth/refresh`, {}, { withCredentials: true });
        const newAccessToken = data.accessToken;
        localStorage.setItem('accessToken', newAccessToken);
        api.defaults.headers.common.Authorization = `Bearer ${newAccessToken}`;
        processQueue(null, newAccessToken);
        originalRequest.headers.Authorization = `Bearer ${newAccessToken}`;
        return api(originalRequest);
      } catch (refreshError) {
        processQueue(refreshError, null);
        localStorage.removeItem('accessToken');
        window.location.href = '/login';
        return Promise.reject(refreshError);
      } finally {
        isRefreshing = false;
      }
    }
    return Promise.reject(error);
  }
);

export default api;
```

6.3 Auth Context Example

Create src/context/AuthContext.jsx:

```jsx
import { createContext, useContext, useState, useEffect } from 'react';
import api from '../services/api';

const AuthContext = createContext(null);

export function AuthProvider({ children }) {
  const [user, setUser] = useState(null);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    const initAuth = async () => {
      try {
        const res = await api.post('/auth/refresh', {});
        const { accessToken, user } = res.data;
        localStorage.setItem('accessToken', accessToken);
        setUser(user);
      } catch {
        // not authenticated
      } finally {
        setLoading(false);
      }
    };
    initAuth();
  }, []);

  const login = async (credentials) => {
    const res = await api.post('/auth/login', credentials);
    const { accessToken, user } = res.data;
    localStorage.setItem('accessToken', accessToken);
    setUser(user);
  };

  const logout = async () => {
    await api.post('/auth/logout');
    localStorage.removeItem('accessToken');
    setUser(null);
  };

  return (
    <AuthContext.Provider value={{ user, loading, login, logout }}>
      {children}
    </AuthContext.Provider>
  );
}

export const useAuth = () => useContext(AuthContext);
```

6.4 Service Layer Functions

Create src/services/userService.js:

```javascript
import api from './api';

export const getUsers = () => api.get('/users');
export const getUser = (id) => api.get(`/users/${id}`);
export const createUser = (data) => api.post('/users', data);
export const updateUser = (id, data) => api.put(`/users/${id}`, data);
export const deleteUser = (id) => api.delete(`/users/${id}`);
```

6.5 Using in Components

```jsx
import { useState, useEffect } from 'react';
import { getUsers } from '../services/userService';

function UserList() {
  const [users, setUsers] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  useEffect(() => {
    getUsers()
      .then(res => setUsers(res.data))
      .catch(err => setError(err.message))
      .finally(() => setLoading(false));
  }, []);

  if (loading) return <div>Loading...</div>;
  if (error) return <div>Error: {error}</div>;
  return <ul>{users.map(u => <li key={u.id}>{u.name}</li>)}</ul>;
}
```

---

7. Basic Example

7.1 Simple Fetch from Backend

Backend (Express):

```javascript
app.get('/api/message', (req, res) => {
  res.json({ message: 'Hello from backend' });
});
```

Frontend (React):

```jsx
import { useState, useEffect } from 'react';
import axios from 'axios';

function App() {
  const [message, setMessage] = useState('');

  useEffect(() => {
    axios.get('http://localhost:5000/api/message')
      .then(res => setMessage(res.data.message))
      .catch(err => console.error(err));
  }, []);

  return <div>{message}</div>;
}
```

This works if CORS is configured on backend.

---

8. Practical Example

8.1 Login Form with Axios and Auth Context

Login component:

```jsx
import { useState } from 'react';
import { useAuth } from '../context/AuthContext';
import { useNavigate } from 'react-router-dom';

function Login() {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [error, setError] = useState('');
  const { login } = useAuth();
  const navigate = useNavigate();

  const handleSubmit = async (e) => {
    e.preventDefault();
    setError('');
    try {
      await login({ email, password });
      navigate('/dashboard');
    } catch (err) {
      setError(err.response?.data?.message || 'Login failed');
    }
  };

  return (
    <form onSubmit={handleSubmit}>
      <input type="email" value={email} onChange={e => setEmail(e.target.value)} placeholder="Email" required />
      <input type="password" value={password} onChange={e => setPassword(e.target.value)} placeholder="Password" required />
      <button type="submit">Login</button>
      {error && <p>{error}</p>}
    </form>
  );
}
```

8.2 Protected Route with Auth Context

```jsx
import { Navigate, Outlet } from 'react-router-dom';
import { useAuth } from '../context/AuthContext';

function ProtectedRoute() {
  const { user, loading } = useAuth();

  if (loading) return <div>Loading...</div>;
  if (!user) return <Navigate to="/login" replace />;
  return <Outlet />;
}
```

---

9. Advanced Example

9.1 Complete Integration with Token Refresh and Queue

The Axios instance shown earlier with isRefreshing and failedQueue is the advanced pattern. It handles multiple simultaneous 401s by queuing requests and retrying them after refresh.

9.2 Using Refresh Token Rotation

Backend rotates refresh tokens (as in Module 27). The frontend must update cookies and possibly the stored refresh token if it's also kept in memory. The interceptor should handle the new refresh token automatically (cookies handled by browser).

9.3 Environment-Specific Configuration

Using .env.development and .env.production:

.env.development:

```
VITE_API_URL=http://localhost:5000
```

.env.production:

```
VITE_API_URL=https://api.example.com
```

9.4 Handling Network Errors and Timeouts

Add timeout and retry logic for network errors. Axios has timeout option. For retries, use a library like axios-retry or implement manually.

```javascript
import axiosRetry from 'axios-retry';

axiosRetry(api, { retries: 3, retryDelay: axiosRetry.exponentialDelay });
```

---

10. Real-World Scenario

10.1 Problem: Building a Full-Stack Task Management App

The frontend (React) needs to:

· Authenticate users (login/register).
· Fetch and manipulate tasks via REST API.
· Handle token expiration gracefully.
· Show loading and error states.

The backend (Express + PostgreSQL) provides auth and task endpoints.

10.2 Solution

· Use Axios instance with interceptors for token management.
· Use AuthContext for user state.
· Use environment variables for API URL.
· Configure CORS on backend.
· Use service layer functions for API calls.
· Implement loading/error states in components.

10.3 Architecture

```mermaid
flowchart TD
    React[React Frontend] --> AuthContext[AuthContext]
    AuthContext --> Axios[Axios Instance]
    Axios -->|Request| RequestInterceptor[Add Token]
    Axios -->|Response| ResponseInterceptor[Handle 401]
    ResponseInterceptor -->|Refresh| RefreshEndpoint
    Axios -->|API Calls| Backend[Express API]
    Backend --> DB[(PostgreSQL)]
```

10.4 Implementation Highlights

· Backend CORS config.
· Axios instance with refresh queue.
· AuthProvider that restores session on load.
· Protected routes.
· Service functions for tasks.
· Error handling and user feedback.

---

11. Common Mistakes

1. Not configuring CORS properly – especially with credentials; using * with credentials fails.
2. Storing access token in localStorage – vulnerable to XSS; prefer memory (but then how to persist? Use refresh cookie).
3. Not handling token refresh – user gets logged out when token expires.
4. Creating new Axios instance in components – loses interceptors and config.
5. Not using environment variables – hardcoding API URLs.
6. Not handling loading/error states – poor UX.
7. Ignoring network errors – need to catch and show message.
8. Not setting withCredentials: true when using cookies for refresh.
9. Not implementing CSRF protection for cookie-based refresh.
10. Overfetching/underfetching – no pagination, too many fields.
11. Not centralizing API calls – scattering axios calls.
12. Not handling concurrent refresh – may cause multiple refresh calls.
13. Using fetch without checking response.ok – errors not caught properly.
14. Not testing integration – regressions.

---

12. Best Practices

· Use a single Axios instance with interceptors.
· Store access token in memory (or short-lived in localStorage if necessary) and refresh token in HTTP-only cookie.
· Implement token refresh with queue to handle concurrency.
· Use AuthContext for user state.
· Use environment variables for API base URL.
· Use service layer for API functions.
· Handle loading and error states consistently.
· Validate responses and handle errors gracefully.
· Use withCredentials: true if using cookies.
· Configure CORS with specific origin and credentials.
· Implement CSRF protection for refresh.
· Use HTTPS in production.
· Test with MSW or mock server.
· Document API integration.

---

13. Security

· CORS: restrict origins; don't use * with credentials.
· Token storage: access token in memory, refresh token in HTTP-only cookie.
· JWT security: short expiry, strong secrets.
· CSRF: SameSite cookies, CSRF tokens.
· Input validation: validate on server (and client).
· Error handling: don't expose stack traces; generic messages.
· HTTPS: always.
· Rate limiting: on backend.
· Content Security Policy (CSP): restrict script sources.
· Avoid storing secrets in frontend env variables.

---

14. Performance and Scalability

· Caching: use HTTP caching, React Query/SWR for data caching.
· Pagination: paginate API responses.
· Compression: enable gzip on server.
· Code splitting: lazy load components.
· Connection pooling: backend DB pooling.
· Horizontal scaling: stateless backend; frontend served via CDN.
· Use AbortController for request cancellation to avoid memory leaks.
· Debounce/throttle user input for search.

---

15. Testing

· Unit tests: service functions with mocked Axios.
· Component tests: using React Testing Library and MSW.
· Integration tests: simulate API calls and auth flow.
· Test token refresh: mock 401 and refresh response.
· Use jest.mock('axios') or MSW.
· Test loading and error states.

Example: MSW handler for auth refresh

```javascript
import { rest } from 'msw';
import { server } from './mocks/server';

server.use(
  rest.post('/auth/refresh', (req, res, ctx) => {
    return res(ctx.json({ accessToken: 'new-token', user: { id: 1, email: 'test@example.com' } }));
  })
);
```

---

16. Comparison: Fetch vs Axios for Backend Connection

Feature Fetch Axios
JSON parsing Manual (res.json()) Automatic
Error handling Rejects only on network error; HTTP errors need manual check Rejects on non-2xx
Interceptors No Yes (request/response)
Timeout Manual via AbortController Built-in
Cancellation AbortController AbortController / CancelToken (deprecated)
Progress events No Yes (download/upload)
Node.js support Node 18+ (experimental) Native
Browser support Modern browsers All
Community Native Popular library

For complex applications with auth and interceptors, Axios is often preferred. Fetch can be used for simple requests.

---

17. Quick Revision

· Configure CORS on backend; use specific origin if credentials needed.
· Create Axios instance with base URL from environment variable.
· Add request interceptor to attach access token.
· Add response interceptor to refresh token on 401.
· Use AuthContext to manage user state and login/logout.
· Use service layer for API calls.
· Handle loading/error states.
· Use withCredentials: true for cookie refresh.
· Implement queue for concurrent refresh.
· Test with MSW.

---

18. Interview Questions – Module 28

Beginner

1. How do you connect a React frontend to a backend API?
      Use an HTTP client like Axios, make requests to backend endpoints, handle responses, and manage CORS.
2. What is CORS and why is it needed?
      CORS is a browser security feature that allows servers to specify which origins can access resources. It's needed when frontend and backend are on different origins.
3. What is an Axios interceptor?
      A function that runs before a request is sent or after a response is received, used to attach headers or handle errors.

Intermediate

1. Explain how you handle token refresh in a React app.
      Use a response interceptor to detect 401 errors. Attempt to refresh the token via a refresh endpoint, then retry the original request. Implement a queue to handle multiple simultaneous 401s.
2. How do you centralize API calls in React?
      Create a service layer with functions for each API endpoint, using a shared Axios instance. This avoids repetition and makes it easy to manage configuration and interceptors.
3. What is the purpose of an AuthContext?
      It provides authentication state (user, login, logout) to all components via React Context, avoiding prop drilling and centralizing auth logic.

Advanced

1. How do you handle concurrent 401 responses during token refresh?
      Use an isRefreshing flag and a queue of pending requests. While refreshing, other 401 requests are added to the queue. After refresh, the queue is resolved with the new token, and all requests are retried.
2. What are the security implications of storing tokens in localStorage vs memory?
      localStorage is accessible to JavaScript, so XSS can steal tokens. Memory is safe from XSS but lost on refresh. The recommended approach is access token in memory and refresh token in HTTP-only cookie.
3. How would you set up CORS for a React frontend and Express backend?
      Use the cors middleware with origin set to the frontend URL, credentials: true if using cookies, and appropriate methods/allowedHeaders. Avoid * when using credentials.

Scenario-Based

Q: Your API requests fail due to CORS. How do you fix it?
Answer: On the backend, add CORS headers. In Express, use the cors middleware with origin set to the frontend origin. If using cookies, set credentials: true and specify the exact origin, not *. Also handle preflight OPTIONS requests.

Coding Questions

1. Write an Axios instance with a request interceptor that adds an access token from localStorage.

```javascript
const api = axios.create({ baseURL: import.meta.env.VITE_API_URL });
api.interceptors.request.use(config => {
  const token = localStorage.getItem('accessToken');
  if (token) config.headers.Authorization = `Bearer ${token}`;
  return config;
});
```

2. Show a simple component that fetches and displays a list of users using a service function.

```jsx
import { useState, useEffect } from 'react';
import { getUsers } from '../services/userService';

function Users() {
  const [users, setUsers] = useState([]);
  useEffect(() => {
    getUsers().then(res => setUsers(res.data));
  }, []);
  return <ul>{users.map(u => <li key={u.id}>{u.name}</li>)}</ul>;
}
```

---

19. Common Mistakes & Best Practices Summary

Mistake Best Practice
CORS misconfiguration Use cors with specific origin, credentials
Storing access token in localStorage Keep in memory, use refresh cookie
Not handling token refresh Implement interceptor with queue
Scattering axios calls Use service layer
Hardcoding API URLs Use environment variables
Ignoring loading/error states Always handle
Not using withCredentials Set when using cookies
Not handling concurrent refresh Use queue
Not testing integration Use MSW/mocks

---

This concludes Module 28: Connecting React Frontend to Backend. The next module will be Module 29: Deployment of Full-Stack Applications, covering deploying both frontend and backend, server configuration, environment variables in production, and CI/CD.## Module 29: Deployment of Full-Stack Applications

Deploying a full-stack application involves making both the frontend (React) and backend (Node.js/Express) available to users in a production environment. This module covers strategies for deploying full-stack apps, including serving frontend and backend separately or together, environment configuration, process management, database deployment, and CI/CD pipelines. You will learn how to deploy a React frontend and an Express backend to popular platforms (Vercel/Netlify for frontend, Render/Heroku/VPS for backend) and how to configure production settings.

---

1. Definition

1.1 What is Deployment of Full-Stack Applications?

Deployment of full-stack applications refers to the process of building, configuring, and hosting both the frontend and backend components of a web application in a production environment. This includes serving static files (React build), running the backend server (Node.js/Express), connecting to a production database, and configuring environment variables, security, and scaling.

1.2 What Problem It Solves

Development environments are not suitable for end users. Deployment ensures the application is optimized, secure, and accessible over the internet. It handles concerns like HTTPS, domain configuration, process management, and environment-specific settings, enabling reliable access for users.

1.3 Why It Was Introduced

As applications moved from monolithic server-rendered to separate frontend/backend architectures, deployment strategies evolved to handle two independent components. Tools and platforms emerged to simplify hosting static frontends and scalable backend services.

1.4 Where It Is Used

· Web applications with React frontend and Node.js backend.
· Microservices architectures with multiple backend services.
· Serverless deployments for frontend and backend functions.
· Containerized applications using Docker and Kubernetes.

1.5 When It Should Be Used

· When the application is ready for production.
· When you need to make the app accessible to end users.
· When you need to automate deployment with CI/CD.
· When scaling and high availability are required.

1.6 When It Should Not Be Used

· During local development (use development server).
· If the application is only for internal testing and not public.
· If you are just prototyping and don't need production deployment.

1.7 Relationship with Surrounding Concepts

· Environment variables: production configuration.
· Nginx: reverse proxy and static file serving.
· PM2: process manager for Node.js.
· Docker: containerization for consistent deployment.
· CI/CD: automated build, test, and deploy.
· Database hosting: MongoDB Atlas, PostgreSQL (Render, AWS RDS).

---

2. Why Deployment of Full-Stack Applications Exists

2.1 The Problem Before

Before modern deployment platforms, developers had to manually configure servers, set up reverse proxies, manage SSL certificates, and ensure processes stayed running. This was time-consuming, error-prone, and required deep system administration knowledge. Full-stack applications with separate frontend and backend added complexity.

2.2 The Solution It Provides

Modern deployment platforms and tools abstract away much of the complexity:

· Static hosting (Netlify, Vercel) for React frontend.
· Backend PaaS (Render, Heroku, Railway) for Node.js/Express.
· Managed databases (MongoDB Atlas, AWS RDS).
· Containerization (Docker) for consistency.
· CI/CD to automate the entire pipeline.

These allow developers to focus on code, while infrastructure is managed.

2.3 What Happens If We Don't Use It?

Users cannot access the application. Without proper deployment, the app remains local. Inefficient deployment can lead to security vulnerabilities, downtime, and poor performance.

2.4 Alternatives

· Traditional VPS with manual setup.
· On-premises servers.
· Serverless functions (AWS Lambda, Vercel Functions).
· Kubernetes for large-scale orchestration.

2.5 Why Choose Modern PaaS?

· Simplicity and speed.
· Automatic scaling.
· Built-in SSL.
· Integrated CI/CD.
· Cost-effective for small to medium apps.

---

3. Core Concepts

3.1 Frontend Deployment

React build output (dist/ or build/) is static. It can be deployed to:

· Static hosting: Netlify, Vercel, GitHub Pages, AWS S3 + CloudFront.
· VPS with Nginx: serve static files.
· Docker container: with Nginx.

Key configuration: SPA routing (redirect all to index.html), environment variables (API URL), caching.

3.2 Backend Deployment

Express backend needs a Node.js environment. Options:

· PaaS: Render, Heroku, Railway, Fly.io.
· VPS: install Node.js, use PM2.
· Docker: containerize and run in any environment.

Key configuration: environment variables (database URL, secrets), process management, health checks.

3.3 Database Deployment

· MongoDB Atlas: managed MongoDB.
· PostgreSQL: Render, AWS RDS, Supabase.
· Ensure connection string is stored in backend environment variables.

3.4 Environment Variables in Production

· Use platform-specific environment variable settings.
· Keep secrets secure; never commit.
· Configure frontend environment variables at build time (for static hosting) or use runtime config (if needed).

3.5 CORS in Production

Set FRONTEND_ORIGIN to the production frontend URL. Backend should only allow that origin.

3.6 HTTPS

· Static hosting platforms provide automatic HTTPS.
· For VPS, use Let's Encrypt (Certbot) with Nginx.
· Backend API should also be HTTPS (via reverse proxy or platform).

3.7 Process Management

· Use PM2 for VPS to keep backend alive.
· PaaS handles process management automatically.

3.8 CI/CD

Automate build, test, and deploy using GitHub Actions or platform-integrated pipelines.

---

4. Prerequisites

· Completed frontend and backend code.
· Accounts on deployment platforms (Netlify, Render, etc.).
· Basic understanding of environment variables and build processes.
· Git repository for CI/CD.

---

5. Internal Working / Architecture

5.1 Deployment Architecture Options

Option 1: Separate hosting

```mermaid
flowchart LR
    Frontend[Frontend on Netlify/Vercel] -->|API Calls| Backend[Backend on Render/VPS]
    Backend --> Database[(Database)]
```

Option 2: Same server with reverse proxy

```mermaid
flowchart LR
    Client[Browser] --> Nginx[Nginx on VPS]
    Nginx -->|/| Frontend[React Static Files]
    Nginx -->|/api| Backend[Express on localhost:3000]
    Backend --> Database[(Database)]
```

Option 3: Docker Compose

```mermaid
flowchart LR
    Client --> NginxContainer[Nginx Container]
    NginxContainer --> FrontendContainer[Frontend Container]
    NginxContainer --> BackendContainer[Backend Container]
    BackendContainer --> DBContainer[Database Container]
```

5.2 Request Flow in Separate Hosting

1. User requests frontend URL.
2. Static hosting serves React app.
3. React app makes API calls to backend URL.
4. Backend processes request, queries database, returns response.

5.3 Environment Configuration Flow

· Frontend build uses VITE_API_URL pointing to backend URL.
· Backend uses DATABASE_URL, ACCESS_TOKEN_SECRET, etc.
· These are set in platform environment settings.

---

6. Syntax and Setup

6.1 Backend Deployment to Render (Example)

· Push code to GitHub.
· Create a new Web Service on Render.
· Connect repository, set build command: npm install && npm run build (if build needed), start command: npm start.
· Add environment variables: DATABASE_URL, ACCESS_TOKEN_SECRET, REFRESH_TOKEN_SECRET, FRONTEND_ORIGIN, NODE_ENV=production.
· Render provides HTTPS and process management.

6.2 Frontend Deployment to Netlify

· Build command: npm run build.
· Publish directory: dist (Vite) or build (CRA).
· Add environment variable: VITE_API_URL set to backend URL.
· Configure redirects for SPA: create _redirects file with /* /index.html 200 or use netlify.toml.

netlify.toml:

```toml
[build]
  command = "npm run build"
  publish = "dist"

[[redirects]]
  from = "/*"
  to = "/index.html"
  status = 200
```

6.3 CORS Configuration for Production

Backend cors options:

```javascript
app.use(cors({
  origin: process.env.FRONTEND_ORIGIN || 'http://localhost:3000',
  credentials: true,
}));
```

Set FRONTEND_ORIGIN=https://your-app.netlify.app in production.

6.4 VPS Deployment with Nginx and PM2

· Build frontend locally or on server, copy to /var/www/html.
· Configure Nginx:

```nginx
server {
    listen 80;
    server_name example.com;

    root /var/www/html;
    index index.html;

    location / {
        try_files $uri $uri/ /index.html;
    }

    location /api/ {
        proxy_pass http://localhost:5000;
        proxy_set_header Host $host;
        proxy_set_header X-Real-IP $remote_addr;
    }
}
```

· Start backend with PM2:

```bash
pm2 start server.js --name backend
pm2 save
pm2 startup
```

6.5 Environment Variables with .env files

Create .env.production for frontend and .env for backend (or use platform env settings).

Backend .env (production):

```
DATABASE_URL=postgres://...
ACCESS_TOKEN_SECRET=...
REFRESH_TOKEN_SECRET=...
FRONTEND_ORIGIN=https://frontend.example.com
PORT=5000
```

Frontend .env.production:

```
VITE_API_URL=https://backend.example.com
```

---

7. Basic Example

7.1 Deploying Frontend to Vercel

1. Push React app to GitHub.
2. Import repository to Vercel.
3. Set build command npm run build, output directory dist.
4. Add environment variable VITE_API_URL.
5. Deploy.

7.2 Deploying Backend to Heroku (legacy but still used)

1. Create Procfile with web: npm start.
2. Set environment variables in Heroku dashboard.
3. Push to Heroku.

---

8. Practical Example

8.1 Full-Stack Deployment with GitHub Actions

Workflow: Deploy frontend to Netlify and backend to Render on push to main

```yaml
name: Deploy Full Stack

on:
  push:
    branches: [ main ]

jobs:
  frontend:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v3
      - name: Setup Node
        uses: actions/setup-node@v3
        with:
          node-version: '20'
      - name: Install frontend deps
        working-directory: ./frontend
        run: npm ci
      - name: Build frontend
        working-directory: ./frontend
        run: npm run build
      - name: Deploy to Netlify
        uses: nwtgck/actions-netlify@v2
        with:
          publish-dir: './frontend/dist'
          production-deploy: true
          netlify-auth-token: ${{ secrets.NETLIFY_AUTH_TOKEN }}
          netlify-site-id: ${{ secrets.NETLIFY_SITE_ID }}

  backend:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v3
      - name: Deploy to Render
        uses: johnbeynon/render-deploy-action@v0.0.8
        with:
          service-id: ${{ secrets.RENDER_SERVICE_ID }}
          api-key: ${{ secrets.RENDER_API_KEY }}
```

---

9. Advanced Example

9.1 Docker Compose for Full-Stack Deployment

Create docker-compose.yml to run frontend (Nginx), backend, and database together.

Dockerfile for backend:

```dockerfile
FROM node:20-alpine
WORKDIR /app
COPY package*.json ./
RUN npm ci --only=production
COPY . .
EXPOSE 5000
CMD ["node", "server.js"]
```

Dockerfile for frontend (multi-stage):

```dockerfile
FROM node:20-alpine AS builder
WORKDIR /app
COPY package*.json ./
RUN npm ci
COPY . .
RUN npm run build

FROM nginx:alpine
COPY --from=builder /app/dist /usr/share/nginx/html
COPY nginx.conf /etc/nginx/conf.d/default.conf
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
```

docker-compose.yml:

```yaml
version: '3'
services:
  frontend:
    build: ./frontend
    ports:
      - "80:80"
    depends_on:
      - backend
  backend:
    build: ./backend
    environment:
      - DATABASE_URL=mongodb://db:27017/myapp
      - ACCESS_TOKEN_SECRET=...
    ports:
      - "5000:5000"
    depends_on:
      - db
  db:
    image: mongo:6
    volumes:
      - mongo-data:/data/db
volumes:
  mongo-data:
```

This runs the entire stack in containers, easy to deploy to any Docker host or Kubernetes.

9.2 Using Kubernetes for Scaling

For large-scale, use Kubernetes with deployments and services for frontend, backend, and database. Helm charts or Kustomize manage configurations. This is beyond the scope but worth knowing.

---

10. Real-World Scenario

10.1 Problem: Deploying a Production-Ready E-Commerce App

The app has:

· React frontend with product listing, cart, checkout.
· Express backend with authentication, product, order APIs.
· MongoDB database.
· Need HTTPS, scaling, and automated deployments.

10.2 Solution

· Deploy frontend to Vercel (static) with environment variable VITE_API_URL.
· Deploy backend to Render (Node.js) with environment variables for database and secrets.
· Use MongoDB Atlas for database.
· Configure CORS with FRONTEND_ORIGIN set to Vercel URL.
· Use GitHub Actions to build and deploy both on push to main.
· Configure custom domain and HTTPS automatically.

10.3 Architecture

```mermaid
flowchart LR
    User[User] -->|HTTPS| Frontend[Vercel - React]
    Frontend -->|API Calls| Backend[Render - Express]
    Backend -->|Mongoose| Database[(MongoDB Atlas)]
    Backend -->|CORS| Frontend
```

10.4 Implementation Highlights

· Frontend .env.production has VITE_API_URL=https://backend.onrender.com.
· Backend cors origin set to https://frontend.vercel.app.
· Backend uses dotenv and production env vars.
· Render runs npm start with PM2 internally.
· CI/CD pipeline builds frontend, deploys to Vercel; deploys backend to Render via API.
· Database connection string stored in Render env.

---

11. Common Mistakes

1. Not setting environment variables correctly – frontend build uses wrong API URL.
2. CORS misconfiguration – origin not set or * with credentials.
3. Forgetting SPA routing redirects – 404 on deep links.
4. Hardcoding secrets in code – should use environment variables.
5. Not using HTTPS – mixed content or security warnings.
6. Not setting NODE_ENV=production – affects performance and security.
7. Not handling process management – backend goes down if not using PM2/Paas.
8. Ignoring database backups – data loss risk.
9. Not monitoring logs – can't diagnose issues.
10. Using development server (Vite dev) in production – not optimized.

---

12. Best Practices

· Use environment variables for all configuration.
· Set CORS to specific frontend origin.
· Always use HTTPS (platforms provide).
· Use SPA redirects on static hosting.
· Use process manager (PM2) for VPS, or PaaS.
· Use managed databases with backups.
· Implement CI/CD for automated deployment.
· Use Docker for consistent environments.
· Monitor and log errors (Sentry, LogRocket, etc.).
· Use npm ci in CI/CD for deterministic installs.
· Keep secrets out of repository; use platform secrets.
· Test before deploy; run integration tests.
· Use health checks for backend.
· Set cache headers for static assets.

---

13. Security

· HTTPS: always.
· CORS: restrict origins.
· Environment variables: keep secrets out of code; use platform secret management.
· Helmet: secure HTTP headers on backend.
· Rate limiting: protect against abuse.
· Input validation: on both frontend and backend.
· Database security: use strong passwords, network restrictions, encryption.
· Token storage: same as earlier modules.
· Regular updates: keep dependencies patched.
· Audit logs: monitor authentication events.

---

14. Performance and Scalability

· CDN for frontend: static hosting platforms provide CDN.
· Compression: enable gzip/brotli.
· Caching: set cache headers for static assets; use Redis for API caching.
· Database indexing: ensure indexes for frequent queries.
· Connection pooling: for databases.
· Horizontal scaling: backend can scale by adding instances (PaaS autoscaling, Docker replicas).
· Load balancing: via platform or Nginx.
· Use HTTP/2: platform default.

---

15. Testing

· CI/CD tests: run unit and integration tests before deploy.
· Smoke tests after deploy: check critical endpoints and frontend loading.
· Environment testing: verify API URL and CORS in staging.
· Use Postman/Newman for API smoke tests.
· Use Cypress for E2E tests in CI.
· Test SPA routing on static host (no 404).

---

16. Comparison: Deployment Platforms

Platform Frontend Backend Database Notes
Vercel Excellent Serverless functions Managed (Postgres) Best for Next.js but works for React
Netlify Excellent Serverless functions Managed (Fauna) Popular static host
Render Static Web services PostgreSQL Free tier, easy
Railway Static Web services PostgreSQL/MySQL Simple pricing
Heroku Not primary Web services Add-ons Legacy, still used
AWS S3+CloudFront EC2/ECS/Lambda RDS More control, complex

---

17. Quick Revision

· Deploy frontend to static hosting; backend to PaaS/VPS.
· Configure environment variables per environment.
· Set CORS with frontend origin.
· Use SPA redirects on frontend host.
· Use process manager (PM2) or PaaS.
· Use managed database.
· Automate with CI/CD (GitHub Actions).
· Use HTTPS.
· Test after deploy.

---

18. Interview Questions – Module 29

Beginner

1. How do you deploy a React app?
      Build it with npm run build, then deploy the static files to a hosting service like Netlify or Vercel, or serve with Nginx.
2. What is CORS and how do you configure it for production?
      CORS allows cross-origin requests. Configure the backend to allow the frontend origin, e.g., cors({ origin: 'https://frontend.com' }).
3. What is PM2?
      PM2 is a process manager for Node.js that keeps applications running, handles restarts, and provides monitoring.

Intermediate

1. Explain how you would deploy a full-stack React/Express app.
      Deploy frontend static files to Netlify/Vercel, backend to Render/VPS, connect to a managed database, configure environment variables, set CORS, and use CI/CD for automation.
2. How do you handle SPA routing on a static host?
      Configure the host to redirect all requests to index.html. For Netlify, use _redirects; for Nginx, try_files $uri $uri/ /index.html;.
3. What are the benefits of using Docker for deployment?
      Docker ensures consistent environments, simplifies dependencies, and enables easy scaling with orchestration. It packages the app and its dependencies into a portable container.

Advanced

1. How would you set up a CI/CD pipeline for a full-stack app?
      Use GitHub Actions. On push to main, run tests, build frontend and backend, deploy frontend to Netlify and backend to Render, and run smoke tests. Store secrets in GitHub secrets.
2. What is the difference between deploying frontend and backend separately vs together?
      Separately allows independent scaling and deployment, uses static hosting for frontend, and is simpler. Together (same server) reduces cross-origin issues but couples them. Modern approach is separate with proper CORS.
3. How do you manage environment variables in production?
      Use platform settings (Render, Netlify) or .env files on server. Never commit secrets. For frontend, variables are baked at build time; for backend, loaded at runtime.

Scenario-Based

Q: Your app works locally but fails after deployment due to CORS. How do you fix?
Answer: Check the backend CORS configuration; ensure the production frontend origin is allowed. Set FRONTEND_ORIGIN env var and update cors to use it. Also verify that requests are sent to the correct backend URL and not mixed content (HTTP vs HTTPS).

Coding Questions

1. Write a basic Nginx config to serve React and proxy API to Express.

```nginx
server {
    listen 80;
    server_name example.com;
    root /var/www/html;
    index index.html;
    location / {
        try_files $uri $uri/ /index.html;
    }
    location /api/ {
        proxy_pass http://localhost:5000;
        proxy_set_header Host $host;
    }
}
```

2. Show a GitHub Actions workflow that deploys a React frontend to Netlify.

```yaml
name: Deploy Frontend
on:
  push:
    branches: [ main ]
jobs:
  deploy:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v3
      - uses: actions/setup-node@v3
        with:
          node-version: '20'
      - run: npm ci
      - run: npm run build
      - uses: nwtgck/actions-netlify@v2
        with:
          publish-dir: './dist'
          production-deploy: true
          netlify-auth-token: ${{ secrets.NETLIFY_AUTH_TOKEN }}
          netlify-site-id: ${{ secrets.NETLIFY_SITE_ID }}
```

---

19. Common Mistakes & Best Practices Summary

Mistake Best Practice
Hardcoding secrets Use environment variables and platform secrets
Not setting CORS origin Configure specific frontend origin
Forgetting SPA redirects Add redirect rule for client-side routing
Using dev server in production Always build and serve static files
Not using process manager Use PM2 or PaaS
Not configuring database backup Enable managed backups
Ignoring HTTPS Always use HTTPS
Not using CI/CD Automate deploy pipeline
Not testing after deploy Run smoke tests
Not monitoring Add logging and error tracking

---

This concludes Module 29: Deployment of Full-Stack Applications. The next module will be Module 30: Final Project – Full-Stack Task Management Application, which will guide you through building a complete project integrating all concepts from this handbook, with detailed steps and code examples.

Module 30: Final Project – Full-Stack Task Management Application

This capstone module integrates all concepts from the entire handbook. You will build a complete full-stack task management application with React (frontend) and Node.js/Express/MongoDB (backend). The project includes authentication (JWT with refresh tokens), CRUD operations for tasks, user-specific data, protected routes, state management (Redux Toolkit), API integration (Axios with interceptors), responsive design (Tailwind CSS), testing, and deployment. By completing this project, you will demonstrate mastery of full-stack development.

---

1. Project Overview

1.1 Definition

A task management application (like a simplified Trello or Todoist) allows users to create, read, update, delete, and organize tasks. Users can register, log in, and manage their own tasks. It includes filtering, sorting, and status updates. The app demonstrates the end-to-end flow from frontend to backend to database.

1.2 Why This Project

It is a common real-world application that covers all essential full-stack concepts: authentication, CRUD, routing, state management, API integration, security, and deployment. It is an ideal portfolio piece.

1.3 Purpose

· Solidify full-stack development skills.
· Practice architecture design.
· Implement secure authentication.
· Integrate React with Express and MongoDB.
· Deploy a production-ready application.

1.4 Prerequisites

· Modules 00-29 of this handbook.
· Familiarity with Git, GitHub, and deployment platforms.

---

2. Requirements

2.1 Functional Requirements

· User Authentication:
  · Register with email, password, name.
  · Login with email/password.
  · Logout.
  · Protected routes (dashboard).
  · Refresh token for persistent session.
· Task Management:
  · Create task (title, description, due date, priority, status).
  · Read tasks (list, filter by status, sort).
  · Update task (edit fields, mark complete/incomplete).
  · Delete task.
  · User can only access their own tasks.
· UI/UX:
  · Responsive design.
  · Loading and error states.
  · Forms with validation.
  · Navigation bar.

2.2 Technical Requirements

· Frontend: React, Redux Toolkit, React Router, Axios, Tailwind CSS.
· Backend: Node.js, Express, MongoDB, Mongoose, JWT, bcrypt.
· Database: MongoDB (local or Atlas).
· Deployment: Frontend on Netlify/Vercel, backend on Render, database on MongoDB Atlas.
· Testing: Jest, React Testing Library, Supertest (at least basic tests).

---

3. Architecture

3.1 High-Level Architecture

```mermaid
flowchart LR
    Client[React Frontend] -->|REST API| Backend[Express API]
    Backend -->|JWT Auth| AuthService[Auth Service]
    Backend -->|Task CRUD| TaskService[Task Service]
    Backend -->|Mongoose| Database[(MongoDB)]
    Client -->|Redux| Store[Redux Store]
    Store -->|Axios| Backend
```

3.2 Folder Structure (Frontend)

```
frontend/
├── src/
│   ├── app/
│   │   ├── store.js
│   │   └── router.jsx
│   ├── features/
│   │   ├── auth/
│   │   │   ├── authSlice.js
│   │   │   ├── authAPI.js
│   │   │   └── components/
│   │   └── tasks/
│   │       ├── tasksSlice.js
│   │       ├── tasksAPI.js
│   │       └── components/
│   ├── shared/
│   │   ├── components/
│   │   ├── hooks/
│   │   └── utils/
│   ├── services/
│   │   └── api.js
│   ├── App.jsx
│   └── main.jsx
├── .env.development
├── .env.production
└── package.json
```

3.3 Folder Structure (Backend)

```
backend/
├── controllers/
│   ├── authController.js
│   └── tasksController.js
├── middleware/
│   ├── authMiddleware.js
│   └── errorHandler.js
├── models/
│   ├── User.js
│   └── Task.js
├── routes/
│   ├── authRoutes.js
│   └── taskRoutes.js
├── services/
│   ├── authService.js
│   └── taskService.js
├── config/
│   └── db.js
├── .env
├── app.js
├── server.js
└── package.json
```

---

4. Database Design

4.1 User Model

```javascript
const userSchema = new mongoose.Schema({
  name: { type: String, required: true },
  email: { type: String, required: true, unique: true },
  password: { type: String, required: true },
  refreshToken: { type: String, default: null },
  createdAt: { type: Date, default: Date.now },
});
```

4.2 Task Model

```javascript
const taskSchema = new mongoose.Schema({
  title: { type: String, required: true },
  description: { type: String, default: '' },
  status: { type: String, enum: ['pending', 'in-progress', 'completed'], default: 'pending' },
  priority: { type: String, enum: ['low', 'medium', 'high'], default: 'medium' },
  dueDate: { type: Date },
  user: { type: mongoose.Schema.Types.ObjectId, ref: 'User', required: true },
  createdAt: { type: Date, default: Date.now },
  updatedAt: { type: Date, default: Date.now },
});
```

---

5. Backend Implementation

5.1 Environment Variables (.env)

```
PORT=5000
MONGODB_URI=mongodb://localhost:27017/taskapp
ACCESS_TOKEN_SECRET=your_access_secret
REFRESH_TOKEN_SECRET=your_refresh_secret
FRONTEND_ORIGIN=http://localhost:3000
```

5.2 Database Connection (config/db.js)

```javascript
const mongoose = require('mongoose');

const connectDB = async () => {
  try {
    await mongoose.connect(process.env.MONGODB_URI);
    console.log('MongoDB connected');
  } catch (err) {
    console.error(err.message);
    process.exit(1);
  }
};

module.exports = connectDB;
```

5.3 Auth Controller (controllers/authController.js)

```javascript
const User = require('../models/User');
const jwt = require('jsonwebtoken');
const bcrypt = require('bcrypt');

const generateAccessToken = (user) => {
  return jwt.sign({ userId: user._id, email: user.email }, process.env.ACCESS_TOKEN_SECRET, { expiresIn: '15m' });
};

const generateRefreshToken = (user) => {
  return jwt.sign({ userId: user._id }, process.env.REFRESH_TOKEN_SECRET, { expiresIn: '7d' });
};

exports.register = async (req, res, next) => {
  try {
    const { name, email, password } = req.body;
    const existing = await User.findOne({ email });
    if (existing) return res.status(409).json({ message: 'Email already exists' });

    const hashedPassword = await bcrypt.hash(password, 10);
    const user = await User.create({ name, email, password: hashedPassword });

    const accessToken = generateAccessToken(user);
    const refreshToken = generateRefreshToken(user);
    user.refreshToken = refreshToken;
    await user.save();

    res.cookie('refreshToken', refreshToken, {
      httpOnly: true,
      secure: process.env.NODE_ENV === 'production',
      sameSite: 'strict',
      maxAge: 7 * 24 * 60 * 60 * 1000,
    });
    res.status(201).json({ accessToken, user: { id: user._id, name: user.name, email: user.email } });
  } catch (err) {
    next(err);
  }
};

exports.login = async (req, res, next) => {
  try {
    const { email, password } = req.body;
    const user = await User.findOne({ email });
    if (!user || !(await bcrypt.compare(password, user.password))) {
      return res.status(401).json({ message: 'Invalid credentials' });
    }

    const accessToken = generateAccessToken(user);
    const refreshToken = generateRefreshToken(user);
    user.refreshToken = refreshToken;
    await user.save();

    res.cookie('refreshToken', refreshToken, {
      httpOnly: true,
      secure: process.env.NODE_ENV === 'production',
      sameSite: 'strict',
      maxAge: 7 * 24 * 60 * 60 * 1000,
    });
    res.json({ accessToken, user: { id: user._id, name: user.name, email: user.email } });
  } catch (err) {
    next(err);
  }
};

exports.refresh = async (req, res, next) => {
  try {
    const refreshToken = req.cookies.refreshToken;
    if (!refreshToken) return res.status(401).json({ message: 'No refresh token' });

    const payload = jwt.verify(refreshToken, process.env.REFRESH_TOKEN_SECRET);
    const user = await User.findById(payload.userId);
    if (!user || user.refreshToken !== refreshToken) {
      return res.status(403).json({ message: 'Invalid refresh token' });
    }

    const accessToken = generateAccessToken(user);
    const newRefreshToken = generateRefreshToken(user);
    user.refreshToken = newRefreshToken;
    await user.save();

    res.cookie('refreshToken', newRefreshToken, {
      httpOnly: true,
      secure: process.env.NODE_ENV === 'production',
      sameSite: 'strict',
      maxAge: 7 * 24 * 60 * 60 * 1000,
    });
    res.json({ accessToken });
  } catch (err) {
    return res.status(403).json({ message: 'Invalid refresh token' });
  }
};

exports.logout = async (req, res, next) => {
  try {
    const refreshToken = req.cookies.refreshToken;
    if (refreshToken) {
      const user = await User.findOne({ refreshToken });
      if (user) {
        user.refreshToken = null;
        await user.save();
      }
    }
    res.clearCookie('refreshToken');
    res.status(204).send();
  } catch (err) {
    next(err);
  }
};
```

5.4 Auth Middleware (middleware/authMiddleware.js)

```javascript
const jwt = require('jsonwebtoken');

exports.authenticate = (req, res, next) => {
  const authHeader = req.headers.authorization;
  if (!authHeader || !authHeader.startsWith('Bearer ')) {
    return res.status(401).json({ message: 'Authentication required' });
  }
  const token = authHeader.split(' ')[1];
  try {
    const payload = jwt.verify(token, process.env.ACCESS_TOKEN_SECRET);
    req.userId = payload.userId;
    next();
  } catch (err) {
    return res.status(403).json({ message: 'Invalid or expired token' });
  }
};
```

5.5 Task Controller (controllers/tasksController.js)

```javascript
const Task = require('../models/Task');

exports.getTasks = async (req, res, next) => {
  try {
    const tasks = await Task.find({ user: req.userId }).sort({ createdAt: -1 });
    res.json(tasks);
  } catch (err) {
    next(err);
  }
};

exports.createTask = async (req, res, next) => {
  try {
    const { title, description, status, priority, dueDate } = req.body;
    const task = await Task.create({ title, description, status, priority, dueDate, user: req.userId });
    res.status(201).json(task);
  } catch (err) {
    next(err);
  }
};

exports.updateTask = async (req, res, next) => {
  try {
    const task = await Task.findOneAndUpdate(
      { _id: req.params.id, user: req.userId },
      req.body,
      { new: true, runValidators: true }
    );
    if (!task) return res.status(404).json({ message: 'Task not found' });
    res.json(task);
  } catch (err) {
    next(err);
  }
};

exports.deleteTask = async (req, res, next) => {
  try {
    const task = await Task.findOneAndDelete({ _id: req.params.id, user: req.userId });
    if (!task) return res.status(404).json({ message: 'Task not found' });
    res.status(204).send();
  } catch (err) {
    next(err);
  }
};
```

5.6 Routes

```javascript
// routes/taskRoutes.js
const router = require('express').Router();
const { authenticate } = require('../middleware/authMiddleware');
const tasksController = require('../controllers/tasksController');

router.use(authenticate);
router.get('/', tasksController.getTasks);
router.post('/', tasksController.createTask);
router.put('/:id', tasksController.updateTask);
router.delete('/:id', tasksController.deleteTask);

module.exports = router;
```

5.7 App Setup (app.js)

```javascript
const express = require('express');
const cors = require('cors');
const cookieParser = require('cookie-parser');
require('dotenv').config();

const app = express();

app.use(cors({ origin: process.env.FRONTEND_ORIGIN, credentials: true }));
app.use(express.json());
app.use(cookieParser());

app.use('/auth', require('./routes/authRoutes'));
app.use('/tasks', require('./routes/taskRoutes'));

app.use((err, req, res, next) => {
  console.error(err);
  res.status(err.status || 500).json({ message: err.message || 'Internal server error' });
});

module.exports = app;
```

---

6. Frontend Implementation

6.1 Environment Variables (.env.development)

```
VITE_API_URL=http://localhost:5000
```

6.2 Axios Instance with Interceptors (services/api.js)

```javascript
import axios from 'axios';

const api = axios.create({
  baseURL: import.meta.env.VITE_API_URL,
  withCredentials: true,
});

let isRefreshing = false;
let failedQueue = [];

const processQueue = (error, token = null) => {
  failedQueue.forEach(prom => {
    if (error) prom.reject(error);
    else prom.resolve(token);
  });
  failedQueue = [];
};

api.interceptors.request.use(config => {
  const token = localStorage.getItem('accessToken');
  if (token) config.headers.Authorization = `Bearer ${token}`;
  return config;
});

api.interceptors.response.use(
  response => response,
  async error => {
    const originalRequest = error.config;
    if (error.response?.status === 401 && !originalRequest._retry) {
      if (isRefreshing) {
        return new Promise((resolve, reject) => {
          failedQueue.push({ resolve, reject });
        }).then(token => {
          originalRequest.headers.Authorization = `Bearer ${token}`;
          return api(originalRequest);
        }).catch(err => Promise.reject(err));
      }

      originalRequest._retry = true;
      isRefreshing = true;

      try {
        const { data } = await axios.post(`${import.meta.env.VITE_API_URL}/auth/refresh`, {}, { withCredentials: true });
        const newAccessToken = data.accessToken;
        localStorage.setItem('accessToken', newAccessToken);
        api.defaults.headers.common.Authorization = `Bearer ${newAccessToken}`;
        processQueue(null, newAccessToken);
        originalRequest.headers.Authorization = `Bearer ${newAccessToken}`;
        return api(originalRequest);
      } catch (refreshError) {
        processQueue(refreshError, null);
        localStorage.removeItem('accessToken');
        window.location.href = '/login';
        return Promise.reject(refreshError);
      } finally {
        isRefreshing = false;
      }
    }
    return Promise.reject(error);
  }
);

export default api;
```

6.3 Auth Context (context/AuthContext.jsx)

```jsx
import { createContext, useContext, useState, useEffect } from 'react';
import api from '../services/api';

const AuthContext = createContext(null);

export function AuthProvider({ children }) {
  const [user, setUser] = useState(null);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    const initAuth = async () => {
      try {
        const res = await api.post('/auth/refresh');
        localStorage.setItem('accessToken', res.data.accessToken);
        const userRes = await api.get('/auth/me');
        setUser(userRes.data.user);
      } catch {
        // not logged in
      } finally {
        setLoading(false);
      }
    };
    initAuth();
  }, []);

  const login = async (credentials) => {
    const res = await api.post('/auth/login', credentials);
    localStorage.setItem('accessToken', res.data.accessToken);
    setUser(res.data.user);
  };

  const register = async (userData) => {
    const res = await api.post('/auth/register', userData);
    localStorage.setItem('accessToken', res.data.accessToken);
    setUser(res.data.user);
  };

  const logout = async () => {
    await api.post('/auth/logout');
    localStorage.removeItem('accessToken');
    setUser(null);
  };

  return (
    <AuthContext.Provider value={{ user, loading, login, register, logout }}>
      {children}
    </AuthContext.Provider>
  );
}

export const useAuth = () => useContext(AuthContext);
```

6.4 Task Slice (features/tasks/tasksSlice.js)

```javascript
import { createSlice, createAsyncThunk } from '@reduxjs/toolkit';
import api from '../../services/api';

export const fetchTasks = createAsyncThunk('tasks/fetchTasks', async () => {
  const response = await api.get('/tasks');
  return response.data;
});

export const createTask = createAsyncThunk('tasks/createTask', async (taskData) => {
  const response = await api.post('/tasks', taskData);
  return response.data;
});

export const updateTask = createAsyncThunk('tasks/updateTask', async ({ id, updates }) => {
  const response = await api.put(`/tasks/${id}`, updates);
  return response.data;
});

export const deleteTask = createAsyncThunk('tasks/deleteTask', async (id) => {
  await api.delete(`/tasks/${id}`);
  return id;
});

const tasksSlice = createSlice({
  name: 'tasks',
  initialState: { items: [], status: 'idle', error: null },
  reducers: {},
  extraReducers: (builder) => {
    builder
      .addCase(fetchTasks.pending, (state) => { state.status = 'loading'; })
      .addCase(fetchTasks.fulfilled, (state, action) => {
        state.status = 'succeeded';
        state.items = action.payload;
      })
      .addCase(fetchTasks.rejected, (state, action) => {
        state.status = 'failed';
        state.error = action.error.message;
      })
      .addCase(createTask.fulfilled, (state, action) => {
        state.items.unshift(action.payload);
      })
      .addCase(updateTask.fulfilled, (state, action) => {
        const index = state.items.findIndex(t => t._id === action.payload._id);
        if (index !== -1) state.items[index] = action.payload;
      })
      .addCase(deleteTask.fulfilled, (state, action) => {
        state.items = state.items.filter(t => t._id !== action.payload);
      });
  },
});

export default tasksSlice.reducer;
```

6.5 Store (app/store.js)

```javascript
import { configureStore } from '@reduxjs/toolkit';
import tasksReducer from '../features/tasks/tasksSlice';

export const store = configureStore({
  reducer: {
    tasks: tasksReducer,
  },
});
```

6.6 App Router (app/router.jsx)

```jsx
import { BrowserRouter, Routes, Route, Navigate } from 'react-router-dom';
import ProtectedRoute from './ProtectedRoute';
import LoginPage from '../features/auth/components/LoginPage';
import RegisterPage from '../features/auth/components/RegisterPage';
import DashboardPage from '../features/tasks/components/DashboardPage';

export function AppRouter() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/login" element={<LoginPage />} />
        <Route path="/register" element={<RegisterPage />} />
        <Route element={<ProtectedRoute />}>
          <Route path="/" element={<DashboardPage />} />
          <Route path="/dashboard" element={<DashboardPage />} />
        </Route>
        <Route path="*" element={<Navigate to="/" />} />
      </Routes>
    </BrowserRouter>
  );
}
```

6.7 ProtectedRoute (components/ProtectedRoute.jsx)

```jsx
import { Navigate, Outlet } from 'react-router-dom';
import { useAuth } from '../../context/AuthContext';

function ProtectedRoute() {
  const { user, loading } = useAuth();
  if (loading) return <div>Loading...</div>;
  if (!user) return <Navigate to="/login" replace />;
  return <Outlet />;
}
export default ProtectedRoute;
```

6.8 Main App (App.jsx)

```jsx
import { Provider } from 'react-redux';
import { AuthProvider } from './context/AuthContext';
import { store } from './app/store';
import { AppRouter } from './app/router';

function App() {
  return (
    <Provider store={store}>
      <AuthProvider>
        <AppRouter />
      </AuthProvider>
    </Provider>
  );
}
export default App;
```

6.9 Task Dashboard Component

```jsx
import { useEffect, useState } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { fetchTasks, createTask, updateTask, deleteTask } from '../tasksSlice';

function DashboardPage() {
  const dispatch = useDispatch();
  const { items: tasks, status, error } = useSelector(state => state.tasks);
  const [newTask, setNewTask] = useState({ title: '', description: '', priority: 'medium' });

  useEffect(() => {
    if (status === 'idle') dispatch(fetchTasks());
  }, [status, dispatch]);

  const handleAdd = (e) => {
    e.preventDefault();
    dispatch(createTask(newTask));
    setNewTask({ title: '', description: '', priority: 'medium' });
  };

  const handleStatusChange = (id, status) => {
    dispatch(updateTask({ id, updates: { status } }));
  };

  const handleDelete = (id) => {
    dispatch(deleteTask(id));
  };

  if (status === 'loading') return <div>Loading tasks...</div>;
  if (status === 'failed') return <div>Error: {error}</div>;

  return (
    <div className="container mx-auto p-4">
      <h1 className="text-2xl font-bold mb-4">My Tasks</h1>
      <form onSubmit={handleAdd} className="mb-4">
        <input
          value={newTask.title}
          onChange={e => setNewTask({ ...newTask, title: e.target.value })}
          placeholder="Task title"
          className="border p-2 mr-2"
          required
        />
        <input
          value={newTask.description}
          onChange={e => setNewTask({ ...newTask, description: e.target.value })}
          placeholder="Description"
          className="border p-2 mr-2"
        />
        <select value={newTask.priority} onChange={e => setNewTask({ ...newTask, priority: e.target.value })} className="border p-2 mr-2">
          <option value="low">Low</option>
          <option value="medium">Medium</option>
          <option value="high">High</option>
        </select>
        <button type="submit" className="bg-blue-500 text-white p-2 rounded">Add Task</button>
      </form>
      <ul>
        {tasks.map(task => (
          <li key={task._id} className="flex items-center justify-between border-b py-2">
            <div>
              <h3 className={`font-medium ${task.status === 'completed' ? 'line-through' : ''}`}>{task.title}</h3>
              <p className="text-sm text-gray-500">{task.description}</p>
              <span className="text-xs bg-gray-200 rounded px-2 py-1">{task.priority}</span>
            </div>
            <div className="flex items-center gap-2">
              <select
                value={task.status}
                onChange={e => handleStatusChange(task._id, e.target.value)}
                className="border p-1"
              >
                <option value="pending">Pending</option>
                <option value="in-progress">In Progress</option>
                <option value="completed">Completed</option>
              </select>
              <button onClick={() => handleDelete(task._id)} className="bg-red-500 text-white p-1 rounded">Delete</button>
            </div>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default DashboardPage;
```

---

7. Testing

7.1 Backend Tests (Jest + Supertest)

· Test auth endpoints: register, login, refresh, logout.
· Test task CRUD with authenticated token.
· Use a test database (MongoDB memory server or dedicated).

Example test for tasks:

```javascript
const request = require('supertest');
const app = require('../app');
const mongoose = require('mongoose');
const Task = require('../models/Task');
const User = require('../models/User');
const bcrypt = require('bcrypt');
const jwt = require('jsonwebtoken');

beforeAll(async () => {
  await mongoose.connect(process.env.MONGODB_URI_TEST || 'mongodb://localhost:27017/taskapp_test');
});

afterAll(async () => {
  await mongoose.connection.close();
});

beforeEach(async () => {
  await Task.deleteMany({});
  await User.deleteMany({});
});

describe('Task API', () => {
  let token;
  let user;
  beforeEach(async () => {
    user = await User.create({ name: 'Test', email: 'test@example.com', password: await bcrypt.hash('password', 10) });
    token = jwt.sign({ userId: user._id }, process.env.ACCESS_TOKEN_SECRET, { expiresIn: '15m' });
  });

  it('should create a task', async () => {
    const res = await request(app)
      .post('/tasks')
      .set('Authorization', `Bearer ${token}`)
      .send({ title: 'Test task' });
    expect(res.statusCode).toBe(201);
    expect(res.body.title).toBe('Test task');
  });

  it('should get tasks for user', async () => {
    await Task.create({ title: 'Task 1', user: user._id });
    const res = await request(app).get('/tasks').set('Authorization', `Bearer ${token}`);
    expect(res.statusCode).toBe(200);
    expect(res.body).toHaveLength(1);
  });
});
```

7.2 Frontend Tests

· Test AuthContext with mocked API.
· Test Dashboard component with Redux store and mocked API.
· Use React Testing Library and MSW.

Example test for Dashboard:

```jsx
import { render, screen, waitFor } from '@testing-library/react';
import { Provider } from 'react-redux';
import { AuthProvider } from '../context/AuthContext';
import { store } from '../app/store';
import DashboardPage from '../features/tasks/components/DashboardPage';
import { server } from '../mocks/server';
import { rest } from 'msw';

beforeAll(() => server.listen());
afterEach(() => server.resetHandlers());
afterAll(() => server.close());

test('renders tasks', async () => {
  server.use(
    rest.get('/tasks', (req, res, ctx) => {
      return res(ctx.json([{ _id: '1', title: 'Test Task', status: 'pending', priority: 'high' }]));
    })
  );

  render(
    <Provider store={store}>
      <AuthProvider>
        <DashboardPage />
      </AuthProvider>
    </Provider>
  );

  await waitFor(() => expect(screen.getByText('Test Task')).toBeInTheDocument());
});
```

---

8. Security

· Passwords hashed with bcrypt.
· JWT with short-lived access token; refresh token in HTTP-only cookie.
· Refresh token rotation and revocation.
· CORS restricted to frontend origin.
· Input validation on both client and server.
· Rate limiting on auth endpoints.
· HTTPS in production.
· No secrets in frontend code.
· Use helmet for secure headers.
· Use express-rate-limit for auth.
· Use sameSite: strict cookies.

---

9. Deployment

9.1 Backend to Render

· Push code to GitHub.
· Create a Web Service on Render.
· Build command: npm install; start command: npm start.
· Add environment variables: MONGODB_URI, ACCESS_TOKEN_SECRET, REFRESH_TOKEN_SECRET, FRONTEND_ORIGIN, NODE_ENV=production.
· Render provides HTTPS and process management.

9.2 Frontend to Vercel/Netlify

· Build command: npm run build.
· Publish directory: dist.
· Add environment variable: VITE_API_URL set to Render backend URL.
· Add SPA redirects.

9.3 Database to MongoDB Atlas

· Create a free cluster.
· Create database user and whitelist IPs.
· Get connection string.
· Set MONGODB_URI in Render env.

9.4 CI/CD with GitHub Actions

Create a workflow to deploy frontend and backend on push to main, similar to Module 29.

---

10. What You Learn

· Full-stack architecture.
· Secure authentication implementation.
· CRUD operations with authorization.
· State management with Redux Toolkit.
· Axios interceptors for token refresh.
· Responsive UI with Tailwind.
· Testing backend and frontend.
· Deployment to production platforms.

---

11. Possible Extensions

· Add task categories/tags.
· Implement pagination and search.
· Add due date reminders.
· Real-time updates with WebSockets.
· Implement task sharing between users.
· Add file attachments.
· Use TypeScript for both frontend and backend.
· Add Docker for containerization.

---

12. Common Mistakes to Avoid

· Not hashing passwords.
· Using long-lived access tokens.
· Storing tokens in localStorage only.
· Not handling refresh token rotation.
· Not validating input on server.
· Ignoring CORS.
· Not using environment variables for secrets.
· Not implementing loading/error states.
· Not testing critical flows.
· Overcomplicating the initial version.

---

13. Best Practices

· Keep frontend and backend separate for scalability.
· Use a service layer for API calls.
· Centralize error handling.
· Use environment variables.
· Write tests for critical components.
· Use consistent naming conventions.
· Implement security best practices.
· Document the project with README.
· Use Git for version control, commit often.
· Deploy early and often.

---

14. Conclusion

This final project brings together all the concepts from the handbook. By building it, you have demonstrated proficiency in React, Node.js, Express, MongoDB, authentication, state management, API integration, testing, and deployment. This project can be used as a portfolio piece to showcase your full-stack development skills to potential employers.

---

Final Cheat Sheet

Frontend (React)

· State: useState, useReducer for local; Redux Toolkit for global.
· Side Effects: useEffect, useLayoutEffect.
· Performance: React.memo, useMemo, useCallback, code splitting with React.lazy and Suspense.
· Routing: React Router v6 (BrowserRouter, Routes, Route, Link, useNavigate, useParams, Outlet).
· Forms: React Hook Form + Zod.
· Styling: Tailwind CSS, CSS Modules, Styled Components.
· API: Axios with interceptors.
· Auth: JWT access token in memory, refresh token in HTTP-only cookie.
· Testing: React Testing Library + Jest.

Backend (Node.js/Express)

· Express: app.use, app.get/post/put/delete, express.Router, express.json, express.static.
· Middleware: cors, helmet, cookie-parser, custom auth.
· Auth: JWT (jsonwebtoken), bcrypt/argon2 for hashing, refresh token rotation.
· Database: Mongoose for MongoDB; pg for PostgreSQL.
· Environment: dotenv.
· Testing: Supertest + Jest.
· Process manager: PM2.
· Deployment: Render/VPS, Nginx reverse proxy.

MongoDB

· Documents: JSON-like, in collections.
· CRUD: insertOne/insertMany, find/findOne, updateOne/updateMany, deleteOne/deleteMany.
· Query operators: $gt, $lt, $in, $set, $unset, $push, $pull.
· Indexes: createIndex, explain().
· Aggregation: $match, $group, $project, $sort, $lookup.
· Mongoose: schemas, models, middleware.

PostgreSQL

· SQL: SELECT, INSERT, UPDATE, DELETE, JOIN, GROUP BY, ORDER BY.
· Data types: INTEGER, VARCHAR, TEXT, TIMESTAMP, JSONB, UUID.
· Transactions: BEGIN, COMMIT, ROLLBACK.
· Node.js: pg Pool, parameterized queries.
· ORMs: Sequelize, Prisma.

Security

· XSS: escape output, sanitize with DOMPurify.
· CSRF: SameSite cookies, CSRF tokens.
· JWT: short-lived, strong secrets, HTTPS.
· Token storage: access token in memory, refresh in HTTP-only cookie.
· CORS: restrict origins.
· Rate limiting: express-rate-limit.
· Input validation: Zod/Joi.
· Password hashing: bcrypt (cost 10+) or argon2.

Deployment

· Frontend: Netlify/Vercel/static hosting; SPA redirects.
· Backend: Render/Heroku/VPS; PM2 or PaaS.
· Database: MongoDB Atlas, PostgreSQL (Render/AWS).
· CI/CD: GitHub Actions.
· Environment: .env files, platform secrets.

---

Final Interview Revision

Most Important Questions

1. Explain the difference between state and props.
   · State is internal and mutable; props are read-only inputs from parent.
2. How does React's virtual DOM work?
   · Creates in-memory representation, diffs with previous, applies minimal changes to real DOM.
3. What are hooks and why were they introduced?
   · Functions that allow state/lifecycle in functional components; introduced to avoid class complexity.
4. What is the purpose of useEffect?
   · Handle side effects after render; cleanup on unmount/dependency change.
5. How do you manage global state?
   · Context API for simple, Redux Toolkit for complex, RTK Query for server state.
6. Explain JWT authentication flow.
   · Login returns access token (short) and refresh token (long, cookie); access token sent in header; refresh used to get new access token.
7. What is CORS and how do you fix it?
   · Browser security; server must include Access-Control-Allow-Origin headers.
8. How do you optimize a React app?
   · Code splitting, memoization, virtualization, lazy loading, bundle optimization.
9. What is the difference between controlled and uncontrolled components?
   · Controlled: React state drives value; uncontrolled: DOM manages, refs access.
10. How do you test a React component?
    · React Testing Library; render, query, simulate events, assert.

Most Important Concepts

· Component lifecycle and hooks.
· Unidirectional data flow.
· Virtual DOM and reconciliation.
· State management patterns.
· REST API design.
· Authentication and security.
· Database indexing and queries.
· Deployment and CI/CD.

Common Traps

· Mutating state directly.
· Not using keys in lists.
· Forgetting cleanup in useEffect.
· Overusing useMemo/useCallback.
· Not handling loading/error states.
· Storing secrets in frontend.
· Ignoring CORS.
· Not using parameterized SQL (SQL injection).
· Not hashing passwords.

One-Line Definitions

Concept Definition
JSX Syntax extension for writing HTML in JavaScript
Virtual DOM In-memory representation of real DOM
Props Read-only inputs passed to components
State Internal mutable data in component
useState Hook for local state
useEffect Hook for side effects
Context API Share data without prop drilling
Redux Toolkit Official Redux library for state management
React Router Library for client-side routing
Axios HTTP client with interceptors
JWT Token format for authentication
CORS Cross-Origin Resource Sharing
MongoDB NoSQL document database
PostgreSQL Relational SQL database
Express Node.js web framework
Docker Containerization platform
CI/CD Continuous Integration/Deployment
Nginx Web server, reverse proxy

---

Conclusion

Congratulations! You have completed the comprehensive full-stack development handbook. You now possess the knowledge and skills to build production-ready React applications with Node.js, Express, and databases (MongoDB/PostgreSQL). This handbook serves as a reference for learning, interview preparation, and daily development. Continue building projects, contributing to open source, and staying updated with the latest trends. Good luck on your journey as a full-stack developer!

-- Designed by
```
Brijesh Nishad (Full Stack Engineer)
```

