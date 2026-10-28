# C# Language In‑Depth Guide  
**Every Topic Broken Down from Beginner to Advanced**

This guide provides an **exhaustive** exploration of the C# programming language. It starts with the absolute fundamentals, progresses through object‑oriented and advanced language features, and covers modern patterns and best practices.  
Every concept is explained with clear examples, and the content is designed for complete mastery and interview preparation.  
*No .NET platform internals (CLR, assemblies, etc.) are covered – this is purely the C# language.*

---

## Table of Contents

1. [Introduction to C#](#introduction-to-c)
2. [Language Fundamentals](#language-fundamentals)
   - 2.1 Basic Syntax, Variables, and Data Types
   - 2.2 Operators
   - 2.3 Control Flow
   - 2.4 Strings and String Manipulation
   - 2.5 Arrays and Collections
   - 2.6 Nullable Value Types and Nullable Reference Types
3. [Object‑Oriented Programming](#object‑oriented-programming)
   - 3.1 Classes and Objects
   - 3.2 Constructors and Destructors
   - 3.3 Properties, Indexers, and Auto‑Implemented Properties
   - 3.4 Inheritance
   - 3.5 Polymorphism (Virtual, Override, Abstract)
   - 3.6 Interfaces
   - 3.7 Abstract Classes vs Interfaces
   - 3.8 Static Members, Constants, and Readonly
   - 3.9 Access Modifiers and Encapsulation
   - 3.10 Records (C# 9+), Structs, and Value Types
   - 3.11 Enums
4. [Advanced Language Features](#advanced-language-features)
   - 4.1 Generics
   - 4.2 Delegates, Func, Action, and Predicate
   - 4.3 Events
   - 4.4 Lambda Expressions and Anonymous Methods
   - 4.5 Extension Methods
   - 4.6 Anonymous Types and Tuples
   - 4.7 Pattern Matching (C# 7–11)
   - 4.8 Local Functions, Ref Locals, and Ref Returns
   - 4.9 Operator Overloading
   - 4.10 Indexers
   - 4.11 `nameof`, `sizeof`, `typeof`
   - 4.12 Dynamic Binding
   - 4.13 Unsafe Code and Pointers
   - 4.14 Attributes
   - 4.15 Preprocessor Directives
5. [LINQ – Language Integrated Query](#linq--language-integrated-query)
   - 5.1 Query Syntax vs Method Syntax
   - 5.2 Standard Query Operators
   - 5.3 Deferred Execution and Immediate Execution
   - 5.4 LINQ to Objects and Beyond
6. [Exception Handling](#exception-handling)
   - 6.1 try‑catch‑finally
   - 6.2 Exception Filters and throw vs throw ex
   - 6.3 Custom Exceptions
   - 6.4 Using and IDisposable
7. [Asynchronous Programming](#asynchronous-programming)
   - 7.1 Task, Task<T>, and async/await
   - 7.2 Task.Run, Task.Delay, WhenAll, WhenAny
   - 7.3 CancellationToken
   - 7.4 Async Main and Best Practices
   - 7.5 IAsyncEnumerable (C# 8)
8. [File I/O and Serialization](#file-io-and-serialization)
9. [Memory Management and IDisposable](#memory-management-and-idisposable)
10. [Reflection and Dynamic Programming](#reflection-and-dynamic-programming)
11. [Interview Questions and Answers](#interview-questions-and-answers)

---

## Introduction to C#

C# (pronounced "C sharp") is a modern, object‑oriented, type‑safe programming language developed by Microsoft. It is used to build a wide variety of applications—desktop, web, mobile, cloud, games, and IoT. C# runs on the .NET platform, but this guide focuses **exclusively on the language itself**.

**Key characteristics:**
- **Type‑safe** – the compiler ensures that code accesses only valid memory locations.
- **Object‑oriented** – supports encapsulation, inheritance, and polymorphism.
- **Component‑oriented** – designed for building reusable components.
- **Functional features** – lambda expressions, pattern matching, LINQ.
- **Asynchronous programming** – built‑in `async` and `await`.
- **Unified type system** – all types derive from `System.Object`.

---

## Language Fundamentals

### Basic Syntax, Variables, and Data Types

C# is statically typed. Every variable has a type.

**Value types** (hold data directly):
- Integral: `byte`, `sbyte`, `short`, `ushort`, `int`, `uint`, `long`, `ulong`
- Floating point: `float`, `double`, `decimal`
- Others: `bool`, `char`, `enum`, `struct`

**Reference types** (store reference to data):
- `string`, `class`, `interface`, `delegate`, `object`, `dynamic`, arrays

**Declaration and initialization:**
```csharp
int age = 30;
double price = 19.99;
decimal amount = 100.50M;
string name = "Alice";
bool isActive = true;
char letter = 'A';
var inferred = 42; // type is int
```

**Constants:**
```csharp
const double PI = 3.14159;
const string AppName = "MyApp";
```

**Literals:**
- Integer: `42`, `0x2A` (hex), `0b101010` (binary, C# 7)
- Floating: `3.14f`, `3.14d`, `3.14m`
- Digit separators: `1_000_000`
- String: `"Hello"`, verbatim `@"C:\path"`, raw string literals `"""..."""` (C# 11)

### Operators

C# provides a rich set of operators.

**Arithmetic:** `+`, `-`, `*`, `/`, `%`.  
**Relational:** `==`, `!=`, `<`, `>`, `<=`, `>=`.  
**Logical:** `&&`, `||`, `!`.  
**Bitwise:** `&`, `|`, `^`, `~`, `<<`, `>>`.  
**Assignment:** `=`, `+=`, `-=`, `*=`, `/=`, `%=`, etc.  
**Increment/decrement:** `++i`, `i++`, `--i`, `i--`.  
**Ternary:** `condition ? trueExpr : falseExpr`.  
**Null‑coalescing:** `??` (returns left if not null, else right), `??=` (assigns if null).  
**Null‑conditional:** `?.` and `?[]` – safe access.

```csharp
string result = name ?? "Unknown";
int? length = text?.Length;
```

**Operator overloading** allows custom types to define behavior for operators.

### Control Flow

**Conditional:**
```csharp
if (x > 0) { } else if (x == 0) { } else { }

switch (value) {
    case 1: ... break;
    default: ... break;
}
```

**Switch expression (C# 8+):**
```csharp
string message = x switch {
    > 0 => "positive",
    0   => "zero",
    < 0 => "negative"
};
```

**Loops:**
```csharp
for (int i = 0; i < 10; i++) { }
foreach (var item in collection) { }
while (condition) { }
do { } while (condition);
```

**Jump statements:** `break`, `continue`, `return`, `goto` (rarely used).

### Strings and String Manipulation

`string` is an immutable reference type. Operations return new strings.

```csharp
string s = "Hello";
s += " World";               // creates new string
string combined = s + "!";    // concatenation
int length = s.Length;
string upper = s.ToUpper();
string sub = s.Substring(1, 3);
bool contains = s.Contains("ell");
string replaced = s.Replace('H', 'J');
string[] parts = "a,b,c".Split(',');
string joined = string.Join(", ", new[] { "a", "b" });
```

**String interpolation (C# 6+):**
```csharp
string greeting = $"Name: {name}, Age: {age}";
```

**Verbatim and raw strings:**
```csharp
string path = @"C:\Users\Name";
string raw = """This is a multi‑line "raw" string""";
```

**StringBuilder** for efficient concatenation:
```csharp
var sb = new System.Text.StringBuilder();
sb.Append("Hello").AppendLine();
sb.Append("World");
string result = sb.ToString();
```

### Arrays and Collections

**Arrays** (fixed size, zero‑indexed):
```csharp
int[] arr = new int[5];
int[] arr2 = { 1, 2, 3, 4, 5 };
int[,] matrix = new int[3, 2];        // multidimensional
int[][] jagged = new int[3][];        // jagged
foreach (int x in arr) { }
Array.Sort(arr);
```

**Generic collections** (`System.Collections.Generic`):

| Collection | Description |
|------------|-------------|
| `List<T>` | Dynamic array, O(1) indexed, O(n) insert |
| `Dictionary<TKey,TValue>` | Hash table, O(1) average lookup |
| `HashSet<T>` | Unique elements, set operations |
| `Queue<T>` | FIFO |
| `Stack<T>` | LIFO |
| `LinkedList<T>` | Doubly‑linked list |

```csharp
var list = new List<int> { 1, 2, 3 };
list.Add(4);
list.RemoveAt(2);
var dict = new Dictionary<string, int>();
dict["Alice"] = 30;
if (dict.TryGetValue("Alice", out int age)) { }
```

**Concurrent collections** (`System.Collections.Concurrent`): `ConcurrentDictionary`, `BlockingCollection`, `ConcurrentBag`, etc.

### Nullable Value Types and Nullable Reference Types

**Nullable value types** (`T?`):
```csharp
int? nullableInt = null;
Nullable<double> temp = 36.6;
if (nullableInt.HasValue) Console.WriteLine(nullableInt.Value);
int value = nullableInt ?? 0;
```

**Nullable reference types** (C# 8+, enabled by `<Nullable>enable</Nullable>`):
```csharp
#nullable enable
string? name = null;
if (name != null) Console.WriteLine(name.Length);
string notNull = name!;
```

---

## Object‑Oriented Programming

### Classes and Objects

```csharp
public class Person {
    private string name;
    private int age;

    public Person(string name, int age) {
        this.name = name;
        this.age = age;
    }

    public void Introduce() => Console.WriteLine($"I'm {name}, {age} years old.");
}

var p = new Person("Alice", 30);
p.Introduce();
```

### Constructors and Destructors

- **Instance constructor** – initializes new objects.
- **Static constructor** – runs once before any static member is accessed.
- **Destructor (finalizer)** – `~ClassName()` called by GC; rarely needed, prefer `IDisposable`.

```csharp
public class MyClass {
    static MyClass() { Console.WriteLine("Static ctor"); }
    public MyClass() { Console.WriteLine("Instance ctor"); }
    public MyClass(int x) : this() { } // constructor chaining
}
```

### Properties and Indexers

**Auto‑implemented property:**
```csharp
public string Name { get; set; }
public int Age { get; private set; } = 18;
```

**Full property with backing field:**
```csharp
private string name;
public string Name {
    get => name;
    set { if (!string.IsNullOrEmpty(value)) name = value; }
}
```

**Expression‑bodied members:**
```csharp
public string FullName => $"{FirstName} {LastName}";
```

**Indexer:**
```csharp
public class StringCollection {
    private List<string> items = new();
    public string this[int index] {
        get => items[index];
        set => items[index] = value;
    }
}
```

### Inheritance

C# supports single class inheritance, multiple interface implementation.

```csharp
public class Animal {
    public virtual void Speak() => Console.WriteLine("Animal sound");
}

public class Dog : Animal {
    public override void Speak() => Console.WriteLine("Woof");
}
```

- `sealed` prevents inheritance or overriding.
- `base` keyword accesses parent members.

### Polymorphism

**Compile‑time** (overloading): same method name, different parameters.  
**Runtime** (overriding): virtual methods, dynamic dispatch.

```csharp
Animal a = new Dog();
a.Speak(); // calls Dog.Speak
```

### Abstract Classes and Interfaces

**Abstract class** – can contain implementation, cannot be instantiated.
```csharp
public abstract class Shape {
    public abstract double Area { get; }
    public virtual void Draw() => Console.WriteLine("Drawing shape");
}
```

**Interface** – contract, can be implemented by any class/struct. C# 8+ allows default method implementations.
```csharp
public interface IFlyable {
    void Fly();
    void Land() => Console.WriteLine("Landing"); // default implementation
}
```

**Explicit interface implementation** avoids name conflicts:
```csharp
class Bird : IFlyable {
    void IFlyable.Fly() { } // only accessible via IFlyable reference
}
```

### Records (C# 9+)

Records are immutable reference types with value‑based equality.

```csharp
public record Person(string FirstName, string LastName);
var p1 = new Person("John", "Doe");
var p2 = p1 with { LastName = "Smith" }; // non‑destructive mutation
```

**Record structs** (C# 10) – value type records.

### Structs

Lightweight value types, cannot inherit (except interfaces), typically used for small data.

```csharp
public struct Point {
    public int X { get; set; }
    public int Y { get; set; }
}
Point p = new Point { X = 5, Y = 10 };
```

### Enums

```csharp
enum Day { Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday }
Day today = Day.Monday;
```

Can specify underlying type (`enum Day : byte`) and assign values.

### Access Modifiers and Encapsulation

- `public` – everywhere.
- `private` – same class.
- `protected` – derived classes.
- `internal` – same assembly.
- `protected internal` – derived classes OR same assembly.
- `private protected` – derived classes AND same assembly.

### Static Members and Static Classes

```csharp
public static class MathHelper {
    public static double Pi = 3.14;
    public static double Square(double x) => x * x;
}
```

Static constructors, static fields, and static methods belong to the type itself.

---

## Advanced Language Features

### Generics

Enables type‑safe code reuse.

```csharp
public class GenericList<T> {
    private T[] items = new T[10];
    public void Add(T item) { }
}

// Generic method with constraints
public T Max<T>(T a, T b) where T : IComparable<T> {
    return a.CompareTo(b) > 0 ? a : b;
}
```

Constraints: `where T : class`, `new()`, `struct`, `BaseClass`, `ISomeInterface`.

### Delegates, Func, Action, Predicate

A delegate is a type‑safe function pointer.

```csharp
public delegate int Transformer(int x);
Transformer t = x => x * x;
int result = t(5);

// Built‑in generic delegates
Action<string> log = Console.WriteLine;       // void
Func<int, int, int> add = (a, b) => a + b;   // returns int
Predicate<int> isPositive = x => x > 0;       // returns bool
```

Multicast delegates: combine multiple methods with `+`/`+=`.

### Events

Based on delegates, provide publisher‑subscriber pattern.

```csharp
public class Button {
    public event EventHandler Click;
    protected virtual void OnClick() => Click?.Invoke(this, EventArgs.Empty);
}

Button btn = new Button();
btn.Click += (sender, e) => Console.WriteLine("Clicked");
```

Standard pattern: `EventHandler<TEventArgs>`.

### Lambda Expressions and Anonymous Methods

```csharp
Func<int, int> square = x => x * x;
// Expression lambda with block
Func<int, int> factorial = x => {
    int result = 1;
    for (int i = 1; i <= x; i++) result *= i;
    return result;
};
```

### Extension Methods

Add methods to existing types without inheritance.

```csharp
public static class StringExtensions {
    public static bool IsValidEmail(this string str) => str.Contains('@');
}
string email = "test@example.com";
bool valid = email.IsValidEmail();
```

### Anonymous Types and Tuples

**Anonymous type:**
```csharp
var person = new { Name = "Alice", Age = 30 };
Console.WriteLine(person.Name);
```

**Tuples:**
```csharp
(string, int) person = ("Alice", 30);
Console.WriteLine(person.Item1);
// Named tuple
var person2 = (Name: "Bob", Age: 25);
Console.WriteLine(person2.Name);
// Deconstruction
var (name, age) = person2;
```

### Pattern Matching (C# 7–11)

- **Type pattern:** `if (obj is string s) { ... }`
- **Constant pattern:** `if (x is 42)`
- **Property pattern:** `if (person is { Name: "Alice", Age: > 18 })`
- **Positional pattern:** `if (point is (0, 0))`
- **List pattern (C# 11):** `if (list is [1, 2, .., 10])`
- **Switch expression** with patterns.

```csharp
string grade = score switch {
    >= 90 => "A",
    >= 80 => "B",
    _ => "F"
};
```

### Local Functions, Ref Locals, Ref Returns

**Local function** – method inside another method.
```csharp
int Add(int a, int b) => a + b;
```

**Ref returns and locals** (advanced performance):
```csharp
ref int Find(int[] arr, int target) {
    for (int i = 0; i < arr.Length; i++)
        if (arr[i] == target) return ref arr[i];
    throw new IndexOutOfRangeException();
}
ref int found = ref Find(numbers, 42);
found = 100; // modifies the array element
```

### Operator Overloading

```csharp
public static Vector operator +(Vector a, Vector b) => new Vector(a.X + b.X, a.Y + b.Y);
public static implicit operator double(Vector v) => v.Length;
```

### `nameof`, `sizeof`, `typeof`

- `nameof(expression)` returns string of identifier (refactoring‑safe).
- `sizeof(type)` returns size in bytes (only for unmanaged types, unsafe).
- `typeof(type)` returns `System.Type` object.

### Dynamic Binding

The `dynamic` type defers binding to runtime.

```csharp
dynamic d = 10;
d = "Hello"; // type changes
Console.WriteLine(d.Length); // resolved at runtime
```

### Unsafe Code and Pointers

Allow direct memory manipulation within `unsafe` blocks. Requires `/unsafe` compiler flag.

```csharp
unsafe {
    int x = 10;
    int* p = &x;
    *p = 20;
}
```

### Attributes

Add metadata to code elements. Can be queried via reflection.

```csharp
[Obsolete("Use NewMethod instead")]
public void OldMethod() { }

[Serializable]
public class MyClass { }
```

Custom attributes derive from `System.Attribute`.

### Preprocessor Directives

Used for conditional compilation: `#if`, `#else`, `#elif`, `#endif`, `#define`, `#undef`, `#region`, `#pragma`.

---

## LINQ – Language Integrated Query

LINQ enables querying data from various sources (collections, databases, XML) using a consistent syntax.

### Query Syntax vs Method Syntax

**Query syntax (declarative):**
```csharp
var result = from p in persons
             where p.Age > 18
             orderby p.Name
             select p.Name;
```

**Method syntax (fluent):**
```csharp
var result = persons.Where(p => p.Age > 18)
                    .OrderBy(p => p.Name)
                    .Select(p => p.Name);
```

### Standard Query Operators

| Category | Methods |
|----------|---------|
| Filtering | `Where`, `OfType<T>` |
| Projection | `Select`, `SelectMany` |
| Ordering | `OrderBy`, `ThenBy`, `Reverse` |
| Grouping | `GroupBy`, `ToLookup` |
| Joining | `Join`, `GroupJoin` |
| Set | `Distinct`, `Union`, `Intersect`, `Except` |
| Quantifiers | `All`, `Any`, `Contains` |
| Element | `First`, `FirstOrDefault`, `Single`, `Last`, `ElementAt` |
| Aggregation | `Count`, `Sum`, `Min`, `Max`, `Average`, `Aggregate` |
| Partitioning | `Skip`, `Take`, `SkipWhile`, `TakeWhile` |
| Conversion | `ToList`, `ToArray`, `ToDictionary`, `Cast`, `OfType` |

### Deferred vs Immediate Execution

LINQ queries are **deferred** – execution happens when iterated. Use `ToList()`/`ToArray()` for immediate execution.

### LINQ to Objects

LINQ works with any `IEnumerable<T>`. Example with in‑memory collections:

```csharp
var numbers = new List<int> { 1, 2, 3, 4, 5, 6 };
var even = numbers.Where(n => n % 2 == 0);
```

---

## Exception Handling

### try‑catch‑finally

```csharp
try {
    int result = 10 / divisor;
} catch (DivideByZeroException ex) {
    Console.WriteLine(ex.Message);
} finally {
    // cleanup
}
```

### Exception Filters and throw

```csharp
catch (HttpRequestException ex) when (ex.StatusCode == HttpStatusCode.NotFound) { }
```

`throw;` preserves stack trace; `throw ex;` resets it.

### Custom Exceptions

```csharp
public class MyAppException : Exception {
    public MyAppException(string message) : base(message) { }
}
```

### Using and IDisposable

Ensures disposal of unmanaged resources.

```csharp
using (var file = new StreamReader("file.txt")) {
    string content = file.ReadToEnd();
}
// Using declaration (C# 8+)
using var reader = new StreamReader("file.txt");
```

---

## Asynchronous Programming

### Task, Task<T>, and async/await

```csharp
public async Task<string> DownloadAsync(string url) {
    using var client = new HttpClient();
    string result = await client.GetStringAsync(url);
    return result;
}
```

`async` methods return `Task`, `Task<T>`, or `void` (only for event handlers). `await` yields control until the task completes.

### Task Combinators

```csharp
await Task.WhenAll(task1, task2);
await Task.WhenAny(task1, task2);
await Task.Delay(1000);
```

### CancellationToken

```csharp
var cts = new CancellationTokenSource();
var task = LongRunningAsync(cts.Token);
cts.Cancel(); // signal cancellation
```

Inside the method: `token.ThrowIfCancellationRequested();` or check `IsCancellationRequested`.

### IAsyncEnumerable (C# 8)

Asynchronously stream data:

```csharp
public async IAsyncEnumerable<int> GenerateSequence() {
    for (int i = 0; i < 10; i++) {
        await Task.Delay(100);
        yield return i;
    }
}
await foreach (var item in GenerateSequence()) { }
```

### Async Main and Best Practices

```csharp
static async Task Main(string[] args) { ... }
```

- Return `Task`/`Task<T>` instead of `void`.
- Use `ConfigureAwait(false)` in library code.
- Avoid blocking calls (`.Result`, `.Wait()`).

---

## File I/O and Serialization

**Text files:**
```csharp
string text = File.ReadAllText("input.txt");
File.WriteAllText("output.txt", "Hello");
```

**Streams:**
```csharp
using var writer = new StreamWriter("file.txt");
writer.WriteLine("Hello");
```

**System.Text.Json (modern):**
```csharp
string json = JsonSerializer.Serialize(obj);
MyClass obj = JsonSerializer.Deserialize<MyClass>(json);
```

**Other serializers:** Newtonsoft.Json, protobuf‑net, XML serialization.

---

## Memory Management and IDisposable

C# uses automatic memory management via a Garbage Collector (GC). However, for **unmanaged resources** (file handles, database connections), you must release them deterministically using `IDisposable`.

**Dispose pattern:**
```csharp
public class Resource : IDisposable {
    private bool disposed = false;
    public void Dispose() { Dispose(true); GC.SuppressFinalize(this); }
    protected virtual void Dispose(bool disposing) {
        if (!disposed) {
            if (disposing) { /* managed cleanup */ }
            /* unmanaged cleanup */
            disposed = true;
        }
    }
    ~Resource() { Dispose(false); }
}
```

Use `using` statements to call `Dispose` automatically.

---

## Reflection and Dynamic Programming

**Reflection** allows inspecting and interacting with types at runtime.

```csharp
Type type = typeof(Person);
MethodInfo[] methods = type.GetMethods();
object instance = Activator.CreateInstance(type);
```

**Dynamic** – the `dynamic` keyword defers type resolution to runtime; the DLR (Dynamic Language Runtime) handles member binding.

```csharp
dynamic obj = "Hello";
Console.WriteLine(obj.Length); // resolved at runtime
```

Custom dynamic objects can be created by inheriting from `DynamicObject`.

---

## Interview Questions and Answers

1. **Value type vs reference type?** – Value types hold data directly; reference types store a reference to data on the heap.
2. **What is boxing/unboxing?** – Converting a value type to `object` (boxing) and back (unboxing). Performance penalty.
3. **Explain `async` and `await`.** – They enable asynchronous programming; methods return `Task`/`Task<T>`, `await` yields until completion without blocking.
4. **What is a delegate?** – A type‑safe function pointer.
5. **Difference between `IEnumerable` and `IQueryable`?** – `IQueryable` builds expression trees for remote queries (e.g., database), whereas `IEnumerable` works in‑memory.
6. **Purpose of `using` statement?** – Ensures `IDisposable.Dispose()` is called even on exceptions.
7. **What is a record?** – Immutable reference type with value equality, primarily used for data.
8. **`throw` vs `throw ex`?** – `throw` preserves original stack trace; `throw ex` resets it.
9. **What is an extension method?** – A static method that adds functionality to an existing type without modifying it.
10. **Explain `lock` statement.** – Mutual exclusion using `Monitor`; equivalent to `Monitor.Enter`/`Exit` in a `try`/`finally`.
11. **What is `ConfigureAwait(false)`?** – Avoids capturing the synchronization context, preventing deadlocks in library code.
12. **How does `string` differ from `StringBuilder`?** – `string` is immutable; `StringBuilder` is mutable, efficient for concatenation.
13. **What is a sealed class?** – A class that cannot be inherited.
14. **Difference between abstract class and interface?** – Abstract class can have implementation and state; interface defines a contract (C# 8+ allows default methods).
15. **What is reflection?** – Inspecting and interacting with metadata at runtime.
16. **What are generics?** – Type parameters that allow code reuse without sacrificing type safety.
17. **What is a `Task`?** – Represents an asynchronous operation.
18. **What is pattern matching?** – Tests whether a value has a certain shape and extracts information.
19. **What are nullable reference types?** – Compiler‑enforced annotations to reduce null‑reference exceptions.
20. **What is LINQ?** – Language Integrated Query; allows querying over collections, databases, XML, etc.

---

This exhaustive guide covers every major C# language feature, from basics to advanced concepts, providing a complete reference for interviews and mastery.