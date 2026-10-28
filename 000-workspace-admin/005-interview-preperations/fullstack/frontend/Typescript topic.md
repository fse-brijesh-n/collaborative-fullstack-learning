TypeScript Interview Preparation Guide

This guide covers TypeScript from fundamental to advanced concepts, with practical examples and explanations to help you ace technical interviews.

---

1. What is TypeScript?

TypeScript is a typed superset of JavaScript that compiles to plain JavaScript. It adds optional static typing, classes, interfaces, and other features to improve developer productivity and code quality. TypeScript is developed and maintained by Microsoft.

Key benefits:

· Catch type‑related bugs at compile time.
· Better IDE support (IntelliSense, refactoring).
· Self‑documenting code.
· Large codebase maintainability.
· Incremental adoption (valid JS is valid TS).

```bash
# Install globally
npm install -g typescript
# Compile a .ts file
tsc index.ts
```

---

2. Setting Up a TypeScript Project

```bash
npm init -y
npm install typescript --save-dev
npx tsc --init   # creates tsconfig.json
```

Configure tsconfig.json to set compiler options (see Section 23).

---

3. Basic Types

TypeScript types are erased at compile time, so they do not affect runtime behavior.

```ts
let isDone: boolean = false;
let age: number = 42;
let name: string = "Alice";
let list: number[] = [1, 2, 3];          // array
let tuple: [string, number] = ["hello", 10]; // tuple
enum Color { Red, Green, Blue }          // enum
let notSure: any = 4;                    // opt-out
let u: undefined = undefined;
let n: null = null;
let obj: object = { key: "value" };
```

any

Disables type checking. Use sparingly.

```ts
let x: any = 5;
x = "hello"; // OK
x.foo();     // no error at compile time
```

unknown

Safer counterpart to any: must narrow before use.

```ts
let value: unknown = "hello";
value.toUpperCase(); // Error!
if (typeof value === "string") {
  value.toUpperCase(); // OK
}
```

never

Represents values that never occur (function that throws or infinite loop).

```ts
function error(message: string): never {
  throw new Error(message);
}
```

void

Absence of any type; usually for functions that return nothing.

```ts
function log(msg: string): void {
  console.log(msg);
}
```

---

4. Type Inference

TypeScript infers types when you don’t explicitly annotate them.

```ts
let counter = 0;           // counter: number
let message = "hello";     // message: string
const arr = [1, "a"];      // arr: (string | number)[]
```

Best practice: let TS infer where possible, annotate when necessary (function parameters, complex objects).

---

5. Functions

Parameter & Return Type Annotations

```ts
function add(a: number, b: number): number {
  return a + b;
}
```

Optional Parameters

```ts
function greet(name: string, greeting?: string): string {
  return `${greeting || "Hello"}, ${name}`;
}
```

Default Parameters

```ts
function pow(base: number, exponent = 2): number {
  return base ** exponent;
}
```

Rest Parameters

```ts
function sum(...nums: number[]): number {
  return nums.reduce((a, b) => a + b, 0);
}
```

Function Overloads

Multiple signatures for a single implementation.

```ts
function makeDate(timestamp: number): Date;
function makeDate(year: number, month: number, day: number): Date;
function makeDate(a: number, b?: number, c?: number): Date {
  // implementation
  return new Date(a, b ?? 0, c ?? 1);
}
```

this Parameter

Declare this type in function signature (fake first parameter).

```ts
interface Card {
  suit: string;
  card: number;
}
function pickCard(this: Card): number {
  return this.card;
}
```

---

6. Interfaces

Interfaces define contracts for objects (shapes) or classes. They are only used at compile time.

```ts
interface User {
  name: string;
  age: number;
  email?: string;       // optional property
  readonly id: number;  // can't be reassigned
}

const alice: User = { name: "Alice", age: 30, id: 1 };
alice.id = 2; // Error
```

Index Signatures

Allow dynamic keys.

```ts
interface StringMap {
  [key: string]: string;
}
const dict: StringMap = { foo: "bar" };
```

Extending Interfaces

```ts
interface Shape { color: string; }
interface Square extends Shape { sideLength: number; }
const sq: Square = { color: "red", sideLength: 10 };
```

Interface vs Type Alias

Both can describe object shapes, but interfaces are open (can be merged), types are closed. Prefer interface for objects unless you need union/intersection, mapped types, etc.

---

7. Type Aliases

Define a name for any type (primitive, union, tuple, object, etc.).

```ts
type Point = {
  x: number;
  y: number;
};
type ID = string | number;
type UserCallback = (user: User) => void;
```

Unlike interfaces, you cannot add new properties to a type alias after creation; they are not mergeable.

---

8. Union & Intersection Types

Union (|)

A value can be one of several types.

```ts
function printId(id: number | string) {
  // must narrow before using methods specific to a type
  if (typeof id === "string") console.log(id.toUpperCase());
}
```

Intersection (&)

Combine multiple types into one (must satisfy all).

```ts
type Admin = { admin: true } & User;
const admin: Admin = { name: "Bob", age: 25, admin: true };
```

---

9. Enums

Numeric enums (default) and string enums.

```ts
enum Direction {
  Up,       // 0
  Down,     // 1
  Left = 2,
  Right
}
console.log(Direction.Up);   // 0
console.log(Direction[0]);   // "Up"

enum Status {
  Active = "ACTIVE",
  Inactive = "INACTIVE"
}
```

Const enums are compiled inline for performance.

```ts
const enum Color { Red, Green, Blue }
let c = Color.Red; // compiles to let c = 0;
```

---

10. Type Assertions

Tell the compiler “trust me, I know what I’m doing.”

```ts
let someValue: unknown = "hello";
let strLength: number = (someValue as string).length;
// or angle-bracket syntax (JSX incompatible)
let strLength2: number = (<string>someValue).length;
```

No runtime impact; used for narrowing when you know more than the compiler.

---

11. Type Guards & Narrowing

TypeScript can narrow types using:

· typeof (primitives)
· instanceof (class instances)
· in operator
· Custom type predicates

Custom Type Predicate

```ts
function isFish(pet: Fish | Bird): pet is Fish {
  return (pet as Fish).swim !== undefined;
}
if (isFish(pet)) pet.swim();
```

in Operator

```ts
if ("swim" in pet) pet.swim();
```

Discriminated Unions

Adding a common literal property to each union member.

```ts
type Square = { kind: "square"; size: number };
type Circle = { kind: "circle"; radius: number };
type Shape = Square | Circle;

function area(s: Shape) {
  switch (s.kind) {
    case "square": return s.size ** 2;
    case "circle": return Math.PI * s.radius ** 2;
  }
}
```

---

12. Classes

TypeScript classes are similar to ES6 classes with added type annotations and access modifiers.

```ts
class Animal {
  // public by default, private/protected available
  private name: string;
  protected age: number;
  readonly species: string;

  constructor(name: string, age: number, species: string) {
    this.name = name;
    this.age = age;
    this.species = species;
  }

  public move(distance: number): void {
    console.log(`${this.name} moved ${distance}m.`);
  }

  // Parameter properties (concise syntax)
  // constructor(private name: string, public age: number) {}
}
```

Inheritance & super

```ts
class Dog extends Animal {
  constructor(name: string, age: number) {
    super(name, age, "Canine");
  }
  bark() { console.log("Woof!"); }
}
```

Abstract Classes

Cannot be instantiated directly, may have abstract methods.

```ts
abstract class Person {
  abstract getSalary(): number;
}
```

Access Modifiers

· public – accessible anywhere (default)
· private – only within the class
· protected – within class and subclasses
· readonly – assigned only once (declaration/constructor)

Static Members

```ts
class MathHelper {
  static PI = 3.14;
  static calculateArea(radius: number) { ... }
}
```

---

13. Generics

Generics enable writing reusable, type-safe components.

```ts
function identity<T>(arg: T): T {
  return arg;
}
const result = identity<string>("hello"); // type inferred

// Constraints
function loggingIdentity<T extends { length: number }>(arg: T): T {
  console.log(arg.length);
  return arg;
}
```

Generic Interfaces & Types

```ts
interface GenericRepository<T> {
  getById(id: string): T;
  getAll(): T[];
}
type Pair<K, V> = { key: K; value: V };
```

Generic Classes

```ts
class DataStore<T> {
  private items: T[] = [];
  add(item: T) { this.items.push(item); }
  getAll(): T[] { return [...this.items]; }
}
```

Default Generic Type

```ts
function createArray<T = string>(length: number, value: T): T[] {
  return Array(length).fill(value);
}
```

---

14. Utility Types (Built-in)

TypeScript provides many built-in utility types.

· Partial<T> – all properties optional.
· Required<T> – all properties required.
· Readonly<T> – all properties readonly.
· Pick<T, K> – subset of properties.
· Omit<T, K> – remove specified properties.
· Record<K, T> – object type with keys K and values T.
· Exclude<T, U> – remove from union T those assignable to U.
· Extract<T, U> – extract from union T those assignable to U.
· NonNullable<T> – exclude null/undefined.
· ReturnType<T> – return type of function.
· Parameters<T> – tuple of parameter types.
· InstanceType<T> – instance type of a class.
· Awaited<T> – unwrap promise.

```ts
type UserPartial = Partial<User>;
type UserEmail = Pick<User, "email">;
type WithoutId = Omit<User, "id">;
type MyFuncReturn = ReturnType<() => string>; // string
```

---

15. Mapped Types

Transform properties of a type based on a pattern.

```ts
type Readonly<T> = {
  readonly [P in keyof T]: T[P];
};

type Nullable<T> = {
  [P in keyof T]: T[P] | null;
};
```

Use as clause for key remapping (TS 4.1+).

```ts
type Getters<T> = {
  [P in keyof T as `get${Capitalize<string & P>}`]: () => T[P];
};
```

---

16. Conditional Types

Select a type based on a condition (extends).

```ts
type IsString<T> = T extends string ? "yes" : "no";
type A = IsString<string>; // "yes"
type B = IsString<number>; // "no"
```

infer Keyword

Extract a type within a conditional.

```ts
type UnwrapPromise<T> = T extends Promise<infer U> ? U : T;
type X = UnwrapPromise<Promise<string>>; // string
```

Distributive Conditional Types

When a conditional is applied to a union, it distributes.

```ts
type ToArray<T> = T extends any ? T[] : never;
type StrOrNum = ToArray<string | number>; // string[] | number[]
```

---

17. Template Literal Types (TS 4.1+)

Manipulate strings at the type level.

```ts
type EventName = "click" | "focus" | "blur";
type Handler = `on${Capitalize<EventName>}`;
// "onClick" | "onFocus" | "onBlur"

type Greeting = `Hello, ${string}!`;
let msg: Greeting = "Hello, Alice!";
```

---

18. Declaration Files & Ambient Declarations

Use .d.ts files to provide type information for external JavaScript libraries.

```ts
// global.d.ts
declare module "my-module" {
  export function doSomething(value: string): number;
}
```

Ambient Variables

```ts
declare const API_URL: string;
```

Extending Global Scope

```ts
declare global {
  interface Window {
    myCustomProp: number;
  }
}
```

Module Augmentation

Extend existing module types.

```ts
// augmentations.d.ts
import "express";
declare module "express" {
  interface Request {
    userId?: string;
  }
}
```

---

19. TypeScript Configuration (tsconfig.json)

Key compiler options:

```json
{
  "compilerOptions": {
    "target": "ES2020",           // JS version output
    "module": "commonjs",        // module system
    "lib": ["ES2020", "DOM"],    // built‑in APIs included
    "outDir": "./dist",
    "rootDir": "./src",
    "strict": true,               // enables all strict type checks
    "esModuleInterop": true,
    "skipLibCheck": true,
    "forceConsistentCasingInFileNames": true,
    "declaration": true,          // generate .d.ts files
    "sourceMap": true
  },
  "include": ["src/**/*"],
  "exclude": ["node_modules", "dist"]
}
```

strict enables:

· noImplicitAny
· strictNullChecks
· strictFunctionTypes
· strictBindCallApply
· strictPropertyInitialization
· noImplicitThis
· alwaysStrict

---

20. Modules and Namespaces

TypeScript supports both ES modules and the older internal modules (namespaces).

ES Modules (recommended)

```ts
// file1.ts
export interface User { ... }
export function getUser() { ... }

// file2.ts
import { User, getUser } from "./file1";
```

Namespaces

Legacy code organization; avoid in new projects.

```ts
namespace MyApp {
  export class User { ... }
}
// usage: MyApp.User
```

Dynamic imports: import("./myModule").then(...)

---

21. Advanced Types & Patterns

keyof Operator

Produces a union of property names.

```ts
type UserKeys = keyof User; // "name" | "age" | "email" | "id"
```

typeof Operator

Obtain the type of a variable (in a type context).

```ts
let s = "hello";
let n: typeof s; // string
```

Indexed Access Types

```ts
type Age = User["age"]; // number
```

Branded Types (Nominal Typing Hack)

Simulate nominal typing for stronger type safety.

```ts
type UserId = string & { __brand: "UserId" };
function createUserId(id: string): UserId { return id as UserId; }
```

Recursive Types

Allowed since TS 3.7.

```ts
type Json = string | number | boolean | null | Json[] | { [key: string]: Json };
```

---

22. Decorators (Experimental)

A decorator is a special declaration that can modify classes, methods, etc. Enable experimentalDecorators in tsconfig.

```ts
function sealed(constructor: Function) {
  Object.seal(constructor);
  Object.seal(constructor.prototype);
}

@sealed
class BugReport {
  type = "report";
}

// Method decorator
function log(target: any, key: string, descriptor: PropertyDescriptor) {
  const original = descriptor.value;
  descriptor.value = function (...args: any[]) {
    console.log(`Calling ${key}`);
    return original.apply(this, args);
  };
}
```

---

23. Mixins

Compose classes from multiple reusable components.

```ts
type Constructor<T = {}> = new (...args: any[]) => T;

function Timestamped<TBase extends Constructor>(Base: TBase) {
  return class extends Base {
    timestamp = Date.now();
  };
}

class User {
  name = "";
}

const TimestampedUser = Timestamped(User);
const user = new TimestampedUser();
console.log(user.timestamp);
```

---

24. Error Handling with TypeScript

· Catch clauses default to unknown since TS 4.0 (or any before). Narrow to handle.
· Use discriminated unions for error results.

```ts
try {
  // ...
} catch (err: unknown) {
  if (err instanceof Error) console.error(err.message);
}
```

---

25. Testing TypeScript

· Use Jest with ts-jest or babel.
· Supertest for integration (typings available).
· Type‑checking tests: tsd or expect-type.

---

26. Migration from JavaScript

· Rename .js to .ts.
· Set strict: false initially, then enable gradually.
· Use any for unknowns, then replace with proper types.
· Add d.ts for external libraries.
· Use @types packages for DefinitelyTyped types.

---

27. Best Practices

· Enable strict mode.
· Avoid any; prefer unknown.
· Use interface for object shapes, type for unions/intersections.
· Use readonly for immutability.
· Leverage utility types to reduce boilerplate.
· Document with JSDoc for better IntelliSense.
· Organize types in separate files.
· Use const assertions (as const) for literal inference.
· Prefer as for type assertions (not <> for JSX compatibility).

---

28. Sample Interview Questions

· What is TypeScript and how is it different from JavaScript?
· Explain type inference.
· Differences between interface and type.
· What are generics? Provide an example.
· How do union and intersection types work?
· What is a discriminated union? How does it help with narrowing?
· Explain unknown vs any.
· What are utility types? Name a few and their purpose.
· How do you extend an existing module’s type (module augmentation)?
· What is the keyof operator?
· How do you make all properties of a type optional or readonly?
· Explain conditional types and infer.
· What are decorators? How to enable them?
· How does strictNullChecks improve code safety?
· Can you explain the as const assertion?
· What is declaration merging?
· How to handle third-party JavaScript libraries that lack types?

---

This guide equips you with the key TypeScript concepts for interviews, from basics to advanced types. Practice writing and explaining code snippets to solidify your understanding.
