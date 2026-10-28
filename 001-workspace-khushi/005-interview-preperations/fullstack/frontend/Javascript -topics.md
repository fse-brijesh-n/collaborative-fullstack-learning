JavaScript Interview Preparation Guide

This guide covers JavaScript from fundamentals to advanced concepts, with detailed explanations and code snippets. It is designed to help you prepare for technical interviews, covering both theory and practical coding challenges.

---

1. Introduction to JavaScript

JavaScript is a high-level, interpreted programming language that conforms to the ECMAScript specification. It is:

· Multi-paradigm: supports object-oriented, imperative, and functional programming styles.
· Dynamically typed: variable types are determined at runtime.
· Single-threaded: uses an event loop to handle concurrency.
· Prototype-based (not classical OOP).

Runs in browsers (with Web APIs) and on servers via Node.js.

---

2. Data Types

Primitive Types (immutable)

· string
· number (including Infinity, NaN)
· bigint (for large integers, 123n)
· boolean
· undefined
· null
· symbol (unique and immutable)

```js
typeof "hello"   // "string"
typeof 42        // "number"
typeof 10n       // "bigint"
typeof true      // "boolean"
typeof undefined // "undefined"
typeof null      // "object" (historical bug)
typeof Symbol()  // "symbol"
```

Reference Types

· Object (including arrays, functions, dates, etc.)

Objects are mutable and stored as references.

Type Coercion

JavaScript automatically converts types when needed.

```js
1 + "2"       // "12" (number to string)
1 - "2"       // -1   (string to number)
"5" == 5      // true (loose equality)
"5" === 5     // false (strict equality)
```

Always prefer === and !== to avoid surprises.

Falsy Values

false, 0, "", null, undefined, NaN are falsy. All other values are truthy.

---

3. Variables & Scoping

var, let, const

Keyword Scope Hoisting Reassignable Redeclarable
var Function scope Yes (initialized to undefined) Yes Yes (in same scope)
let Block scope Yes (Temporal Dead Zone) Yes No
const Block scope Yes (TDZ) No No

Temporal Dead Zone (TDZ): let and const exist in the scope but cannot be accessed before declaration.

```js
console.log(a); // undefined
var a = 10;

console.log(b); // ReferenceError: Cannot access 'b' before initialization
let b = 20;
```

Scope Chain

Inner functions can access variables of outer functions; JavaScript looks up the chain to find variables.

---

4. Hoisting

Hoisting is JavaScript’s default behavior of moving declarations to the top of their containing scope during compilation.

· var declarations are hoisted and initialized with undefined.
· function declarations are hoisted with their definition.
· let and const are hoisted but not initialized (TDZ).

```js
console.log(foo()); // "bar"
function foo() { return "bar"; }

console.log(x); // undefined
var x = 5;
```

---

5. Functions

Function Declarations vs Expressions

```js
// Declaration (hoisted)
function greet() { return "Hello"; }

// Expression (not hoisted)
const greet = function() { return "Hello"; };
```

Arrow Functions

Shorter syntax, do not have their own this, arguments, super, or new.target. Cannot be used as constructors.

```js
const add = (a, b) => a + b;
const double = n => n * 2;
const greet = () => { return "Hi"; };

// `this` is lexically bound
const obj = {
  name: 'Alice',
  greet: function() {
    setTimeout(() => {
      console.log(this.name); // 'Alice' (arrow inherits this)
    }, 100);
  }
};
```

Parameters & Arguments

· Default parameters: function multiply(a, b = 1) { return a * b; }
· Rest parameters: function sum(...nums) { return nums.reduce((a,b)=>a+b,0); }
· The arguments object (available in non-arrow functions).

IIFE (Immediately Invoked Function Expression)

```js
(function() {
  var privateVar = "secret";
})();
```

Used to create a private scope before ES6 modules.

Callbacks

A function passed as an argument to another function.

```js
function fetchData(callback) {
  setTimeout(() => callback("data"), 1000);
}
```

Higher-Order Functions

Functions that take other functions as arguments or return functions.

```js
const multiplyBy = factor => num => num * factor;
const double = multiplyBy(2);
double(5); // 10
```

---

6. Closures

A closure is the combination of a function and the lexical environment within which that function was declared. It allows a function to access variables from an outer scope even after the outer function has returned.

```js
function outer() {
  let count = 0;
  return function inner() {
    count++;
    return count;
  };
}
const counter = outer();
console.log(counter()); // 1
console.log(counter()); // 2
```

Uses: data privacy, factory functions, module pattern, currying, event handlers.

---

7. The this Keyword

The value of this depends on how a function is called:

· Global scope: this is window (browser) or global (Node) in non-strict; undefined in strict mode.
· Method call: obj.method() → this is obj.
· Constructor call: new Func() → this is the new instance.
· Arrow functions: this is lexically inherited from the surrounding scope (does not have its own this).
· Explicit binding: call, apply, bind.

```js
const obj = {
  name: 'Alice',
  regularFn: function() { console.log(this.name); },
  arrowFn: () => console.log(this.name)
};
obj.regularFn(); // 'Alice'
obj.arrowFn();   // undefined (inherits global this)
```

call, apply, bind

```js
function greet(greeting) {
  console.log(`${greeting}, ${this.name}`);
}
const person = { name: 'Bob' };
greet.call(person, 'Hello');   // Hello, Bob
greet.apply(person, ['Hi']);  // Hi, Bob
const boundGreet = greet.bind(person, 'Hey');
boundGreet(); // Hey, Bob
```

---

8. Objects & Prototypes

Object Creation

· Object literals: { key: value }
· new Object()
· Object.create(proto)
· Constructor functions + new
· ES6 classes (syntactic sugar over prototypes)

Prototypes

Every JavaScript object has an internal [[Prototype]] (accessible via __proto__ or Object.getPrototypeOf()). When accessing a property, JS looks up the prototype chain until found or null.

```js
function Person(name) {
  this.name = name;
}
Person.prototype.greet = function() {
  return `Hello, I'm ${this.name}`;
};
const alice = new Person('Alice');
console.log(alice.greet()); // Hello, I'm Alice
console.log(alice.__proto__ === Person.prototype); // true
```

Inheritance (Prototypal)

```js
function Student(name, grade) {
  Person.call(this, name);
  this.grade = grade;
}
Student.prototype = Object.create(Person.prototype);
Student.prototype.constructor = Student;
Student.prototype.study = function() { return 'Studying...'; };
```

ES6 Classes

```js
class Animal {
  constructor(name) { this.name = name; }
  speak() { console.log(`${this.name} makes a sound`); }
}
class Dog extends Animal {
  constructor(name, breed) {
    super(name);
    this.breed = breed;
  }
  speak() { console.log(`${this.name} barks`); }
}
const dog = new Dog('Rex', 'Labrador');
dog.speak();
```

Classes support static methods, getters/setters, private fields (#field).

---

9. Arrays

Creation

```js
const arr = [1,2,3];
const arr2 = new Array(5); // empty slots
```

Important Methods

Iteration:

· forEach – executes a function for each element (no return value)
· map – returns a new array with transformed elements
· filter – returns a new array with elements that pass a test
· reduce / reduceRight – reduces to a single value
· some / every – test condition
· find / findIndex – find element or index

Mutation:

· push, pop, shift, unshift, splice, sort, reverse, fill, copyWithin

Non-mutating:

· slice, concat, join, indexOf, lastIndexOf, includes

```js
const numbers = [1,2,3,4,5];
const doubled = numbers.map(n => n*2);       // [2,4,6,8,10]
const evens = numbers.filter(n => n%2===0);  // [2,4]
const sum = numbers.reduce((acc,n)=>acc+n,0); // 15
```

Flattening:

· arr.flat(depth) (default depth 1)
· flatMap (map then flat depth 1)

---

10. Destructuring

Array Destructuring

```js
const [a, b, ...rest] = [1,2,3,4]; // a=1, b=2, rest=[3,4]
```

Object Destructuring

```js
const { name, age: userAge } = { name: 'Alice', age: 30 };
// name='Alice', userAge=30
```

Default values, nested destructuring, and renaming are supported.

---

11. Spread & Rest Operators

Spread (...)

Expands an iterable into individual elements.

```js
const arr1 = [1,2];
const arr2 = [...arr1, 3,4]; // [1,2,3,4]
const obj1 = { a:1, b:2 };
const obj2 = { ...obj1, c:3 }; // {a:1,b:2,c:3}
```

Useful for copying arrays/objects, merging, and function arguments.

Rest Parameters (...)

Collects remaining arguments into an array.

```js
function sum(...nums) { return nums.reduce((a,b)=>a+b); }
```

Rest must be the last parameter.

---

12. Template Literals

Enclosed in backticks ( ` ), support multi-line strings and interpolation.

```js
const name = 'Alice';
console.log(`Hello, ${name}!
Your age is ${25 + 5}.`); // multi-line, embedded expression
```

Tagged templates: myTag\some string``.

---

13. Modules

ES6 Modules (ESM)

```js
// module.js
export const x = 10;
export function fn() {}
export default class MyClass {}

// main.js
import MyClass, { x, fn } from './module.js';
```

ES Modules are static (analyzed at parse time), live bindings. In Node.js, use .mjs or "type":"module".

CommonJS (CJS)

```js
// module.js
const x = 10;
module.exports = { x };

// main.js
const { x } = require('./module');
```

Dynamic, synchronous.

---

14. Asynchronous JavaScript

Event Loop

JavaScript is single-threaded. The event loop orchestrates execution:

1. Call stack executes synchronous code.
2. Async operations (timers, I/O, etc.) are sent to Web APIs.
3. When done, callbacks are placed in the task queue (macrotasks) or microtask queue (promises, mutation observers).
4. Event loop picks from microtask queue first (until empty), then one macrotask, repeat.

Macrotasks: setTimeout, setInterval, I/O, UI rendering.
Microtasks: Promise.then/catch/finally, process.nextTick (Node), queueMicrotask.

```js
console.log('1');
setTimeout(() => console.log('2'), 0);
Promise.resolve().then(() => console.log('3'));
console.log('4');
// Output: 1,4,3,2
```

Callbacks

Oldest pattern, leads to "callback hell". Handled by error-first convention in Node.

Promises

Represent a future value. States: pending, fulfilled, rejected.

```js
const promise = new Promise((resolve, reject) => {
  setTimeout(() => resolve('done'), 1000);
});
promise.then(value => console.log(value))
       .catch(err => console.error(err))
       .finally(() => console.log('cleanup'));
```

Promise combinators:

· Promise.all(iterable) – fulfills when all fulfill; rejects immediately upon first rejection.
· Promise.allSettled(iterable) – waits for all to settle (fulfilled or rejected).
· Promise.race(iterable) – settles with the first settled promise.
· Promise.any(iterable) – fulfills with the first fulfilled promise; rejects if all reject.

Async / Await

Syntactic sugar for promises, makes async code look synchronous.

```js
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

async functions return a Promise. await pauses execution until promise settles.

---

15. Error Handling

try...catch...finally

```js
try {
  throw new Error('Something went wrong');
} catch (err) {
  console.error(err.message);
} finally {
  // always runs
}
```

Custom Errors

```js
class ValidationError extends Error {
  constructor(message) {
    super(message);
    this.name = 'ValidationError';
  }
}
```

Promise Error Handling

Promises should always have a .catch() at the end; unhandled rejections can crash Node.js processes.

---

16. Closures & Lexical Scoping (Deep Dive)

A closure gives access to outer function's scope from an inner function, even after the outer function has returned. This is due to the lexical environment being preserved.

Practical examples:

· Creating private variables.
· Function factories.
· Currying and partial application.

```js
function createIncrementer(step) {
  let count = 0;
  return function() {
    count += step;
    return count;
  };
}
const inc = createIncrementer(2);
inc(); // 2
inc(); // 4
```

Be careful with closures inside loops using var (use let or closure wrappers).

---

17. Currying & Partial Application

Currying: Transforming a function with multiple arguments into a sequence of functions each taking a single argument.

```js
const curry = (fn) => (...args) =>
  args.length >= fn.length ? fn(...args) : (...next) => curry(fn)(...args, ...next);

const sum = (a, b, c) => a + b + c;
const curriedSum = curry(sum);
curriedSum(1)(2)(3); // 6
curriedSum(1, 2)(3); // 6
```

Partial Application: Fixing a few arguments, returning a function that takes the rest.

```js
const partial = (fn, ...preset) => (...args) => fn(...preset, ...args);
const greet = (greeting, name) => `${greeting}, ${name}`;
const sayHello = partial(greet, 'Hello');
sayHello('Alice'); // 'Hello, Alice'
```

---

18. Debouncing & Throttling

Debounce

Limits the rate at which a function can fire. Delays execution until after a pause.

```js
function debounce(func, delay) {
  let timeoutId;
  return function(...args) {
    clearTimeout(timeoutId);
    timeoutId = setTimeout(() => func.apply(this, args), delay);
  };
}
// Use: search input
```

Throttle

Ensures a function is called at most once in a specified time period.

```js
function throttle(func, limit) {
  let inThrottle;
  return function(...args) {
    if (!inThrottle) {
      func.apply(this, args);
      inThrottle = true;
      setTimeout(() => inThrottle = false, limit);
    }
  };
}
// Use: scroll events
```

---

19. Generators & Iterators

Iterators

An object that implements the next() method returning { value, done }.

```js
function makeRangeIterator(start = 0, end = Infinity, step = 1) {
  let nextIndex = start;
  return {
    next() {
      if (nextIndex < end) {
        const result = { value: nextIndex, done: false };
        nextIndex += step;
        return result;
      }
      return { done: true };
    }
  };
}
```

Generators

Functions that can be paused and resumed, using function* and yield.

```js
function* generateSequence() {
  yield 1;
  yield 2;
  yield 3;
}
const gen = generateSequence();
console.log(gen.next().value); // 1
```

Generators return an iterator. Can be used for infinite sequences, async flow control (with co or async generators for await...of).

---

20. Proxies & Reflect

Proxy

Allows custom behavior for fundamental operations (e.g., property lookup, assignment, enumeration).

```js
const target = { message: 'hello' };
const handler = {
  get(obj, prop) {
    if (prop in obj) return obj[prop];
    return `Property ${prop} not found`;
  }
};
const proxy = new Proxy(target, handler);
console.log(proxy.message); // hello
console.log(proxy.name);    // Property name not found
```

Common use: validation, logging, access control.

Reflect

Provides methods for interceptable JavaScript operations. Often used with Proxy.

---

21. Map, Set, WeakMap, WeakSet

· Map: key-value pairs; keys can be any type, maintains insertion order.

```js
const map = new Map();
map.set('name', 'Alice');
map.get('name');
map.has('name');
map.forEach((value, key) => {});
```

· Set: collection of unique values.

```js
const set = new Set([1,2,2,3]); // Set {1,2,3}
```

· WeakMap: keys must be objects; weakly held (garbage collected if no other references). Not iterable.
· WeakSet: only objects, weakly held.

---

22. Web APIs (Browser-Specific)

In interviews, you may be asked about browser features:

DOM Manipulation

```js
const el = document.querySelector('.class');
el.addEventListener('click', handler);
el.innerHTML = '<span>new</span>';
document.createElement('div');
// etc.
```

Events

· addEventListener, removeEventListener
· Event object (e.target, e.preventDefault(), e.stopPropagation())
· Event delegation (attach listener to parent for dynamically added children)

Storage

· localStorage (persistent), sessionStorage (per tab)
· cookies (document.cookie; small, sent with requests)

Fetch API

```js
fetch(url)
  .then(response => response.json())
  .then(data => console.log(data));
```

Others

· setTimeout, setInterval, requestAnimationFrame
· console methods
· navigator, location, history

---

23. Memory Management & Garbage Collection

JavaScript automatically frees memory via garbage collection (mark-and-sweep). Objects become eligible for GC when no references point to them. Closures can inadvertently retain references. Use WeakMap/WeakSet to avoid memory leaks.

---

24. Common Design Patterns in JavaScript

· Module Pattern (IIFE, ES modules)
· Singleton: single instance (e.g., module exports)
· Factory: function returning objects
· Observer / Pub-Sub: event emitters, addEventListener
· Decorator: higher-order functions/classes
· Strategy: choose algorithm at runtime
· Facade: simplified interface to complex subsystem

---

25. Polyfills & Common Interview Implementations

Polyfill for bind

```js
Function.prototype.myBind = function(context, ...args) {
  const fn = this;
  return function(...newArgs) {
    return fn.apply(context, args.concat(newArgs));
  };
};
```

Polyfill for Promise.all

```js
function promiseAll(promises) {
  return new Promise((resolve, reject) => {
    if (!Array.isArray(promises)) return reject(new TypeError('...'));
    const results = [];
    let completed = 0;
    promises.forEach((promise, index) => {
      Promise.resolve(promise)
        .then(value => {
          results[index] = value;
          completed++;
          if (completed === promises.length) resolve(results);
        })
        .catch(reject);
    });
    if (promises.length === 0) resolve([]);
  });
}
```

Deep Clone

```js
function deepClone(obj) {
  if (obj === null || typeof obj !== 'object') return obj;
  if (Array.isArray(obj)) return obj.map(deepClone);
  const cloned = {};
  for (let key in obj) {
    if (obj.hasOwnProperty(key)) cloned[key] = deepClone(obj[key]);
  }
  return cloned;
}
// Better: use structuredClone() in modern environments.
```

Flatten Array

```js
function flatten(arr, depth = 1) {
  return arr.reduce((acc, val) => {
    if (Array.isArray(val) && depth > 0) {
      acc.push(...flatten(val, depth - 1));
    } else {
      acc.push(val);
    }
    return acc;
  }, []);
}
```

Memoization

```js
function memoize(fn) {
  const cache = {};
  return function(...args) {
    const key = JSON.stringify(args);
    if (cache[key] !== undefined) return cache[key];
    const result = fn.apply(this, args);
    cache[key] = result;
    return result;
  };
}
```

Debounce & Throttle (implemented above)

---

26. ES2020+ Features

· Optional chaining: obj?.prop?.subProp
· Nullish coalescing: value ?? defaultValue (only if null or undefined)
· Dynamic import(): import('./module.js')
· BigInt: 123n
· Promise.allSettled, Promise.any
· String.prototype.matchAll
· globalThis
· Private class fields: #privateField

---

27. Best Practices

· Use const by default, let if reassignment needed; avoid var.
· Prefer === over ==.
· Always handle promises rejections (.catch or try/catch with await).
· Write pure functions where possible (no side effects).
· Keep functions small and single-purpose.
· Use meaningful names.
· Avoid global variables.
· Use ESLint and Prettier.
· Optimize loops, cache DOM queries, debounce/throttle events.
· Test your code.

---

28. Sample Interview Questions (Conceptual)

· Explain event loop, micro vs macro tasks.
· What is closure? Provide an example.
· How does prototypal inheritance work?
· Difference between call, apply, bind.
· What is hoisting?
· Explain this keyword in different contexts.
· Difference between var, let, const.
· What are promises? How do they solve callback hell?
· What are arrow functions? How do they differ from regular functions?
· Explain the concept of currying.
· How does memoization improve performance? Write a memoize function.
· What is event delegation?
· Difference between == and ===.
· What is the purpose of Object.create()?
· How to deep clone an object?
· What are generators and when to use them?
· Describe the module pattern and ES6 modules.
· What is a proxy and how is it useful?

---

This comprehensive guide covers JavaScript from basics to advanced, equipping you with the knowledge and code examples needed for most interviews. Good luck!
