C++ In‑Depth Guide – From Absolute Beginner to Advanced

This guide is designed to take you from the very basics of C++ to advanced modern features. Every concept is explained in detail, with practical code examples. The goal is to provide a complete reference for learning, interview preparation, and mastering C++.

---

1. What is C++?

C++ is a general‑purpose programming language created by Bjarne Stroustrup at Bell Labs in 1979. It is an extension of the C language, adding object‑oriented, generic, and functional programming features while maintaining C’s low‑level control and efficiency.

· Compiled language – source code is translated directly into machine code.
· Statically typed – variable types are checked at compile time.
· Multi‑paradigm – supports procedural, object‑oriented, generic, and (since C++11) functional styles.
· Performance‑oriented – “you only pay for what you use”; no hidden overhead.
· Standard library – provides containers, algorithms, input/output, and much more.

---

2. Evolution of C++ Standards

Understanding the history helps you know which features are available and how the language has evolved.

Standard Year Major Additions
C++98 1998 First official ISO standard; STL, templates, exceptions, namespaces
C++11 2011 auto, decltype, lambdas, smart pointers, std::thread, constexpr, rvalue references, range‑based for, nullptr, std::array, std::unordered_map, std::tuple
C++14 2014 Generic lambdas, decltype(auto), relaxed constexpr, std::make_unique, binary literals
C++17 2017 Structured bindings, if constexpr, std::optional, std::variant, std::any, std::string_view, std::filesystem, parallel algorithms, fold expressions, [[nodiscard]], inline variables
C++20 2020 Concepts, Ranges, Coroutines, Modules, std::format, std::span, consteval, constinit, spaceship operator <=>, jthread, std::stop_token
C++23 2023 std::expected, std::generator, import std, if consteval, deducing this, std::print, std::stacktrace, flat_map/flat_set, range improvements

We will cover features up to C++20 in depth, with a few C++23 notes.

---

3. Setting Up a C++ Environment

· Compiler: GCC (Linux/macOS/Windows), Clang, or MSVC (Windows).
· IDE: Visual Studio Code, CLion, Visual Studio, or a simple text editor + terminal.
· Build systems: CMake is the de‑facto standard.

Compile a single file:

```bash
g++ -std=c++20 -Wall -Wextra -o myprogram main.cpp
./myprogram
```

Minimal CMakeLists.txt:

```cmake
cmake_minimum_required(VERSION 3.15)
project(MyApp CXX)
set(CMAKE_CXX_STANDARD 20)
add_executable(myapp main.cpp)
```

---

4. C++ Fundamentals (Beginner)

4.1 The Basic Program Structure

Every C++ program must have a main function – it is the entry point.

```cpp
#include <iostream>   // includes the input/output stream library

int main() {
    std::cout << "Hello, World!" << std::endl;   // prints to console
    return 0;   // indicates successful execution
}
```

· #include inserts the contents of a header file.
· std::cout is the standard output stream.
· std::endl inserts a newline and flushes the output.
· return 0; is optional in main (C++ assumes return 0 if omitted), but it’s good practice to include it.

4.2 Comments

```cpp
// single‑line comment

/*
   multi‑line comment
*/
```

4.3 Data Types and Variables

C++ is statically typed – every variable must have a known type at compile time.

Built‑in fundamental types:

Type Description Example
bool boolean true, false
char character (1 byte) 'A', '\n'
int integer (typically 4 bytes) 42, -10
short short integer (2 bytes) 100
long long integer (4 or 8 bytes) 100L
long long very long integer (8 bytes) 100LL
float single‑precision floating point 3.14f
double double‑precision floating point 3.14159
long double extended precision 3.14159L
void absence of type –

The exact sizes can vary; use <cstdint> for fixed‑width integers like int32_t.

Variable declaration and initialization:

```cpp
int age = 25;
double pi {3.14159};           // brace initialization (preferred modern style)
bool isStudent = false;
char letter {'A'};
```

Always initialize variables – uninitialized variables contain garbage and cause undefined behavior.

Using auto for type deduction (C++11):

```cpp
auto x = 10;        // x is int
auto y = 3.14;      // y is double
auto z = "hello";   // z is const char*
```

4.4 Input / Output

· std::cin – standard input (keyboard).
· std::cout – standard output (console).
· std::cerr – standard error (unbuffered).
· std::clog – standard log.

```cpp
#include <iostream>
#include <string>    // for std::string

int main() {
    std::string name;
    int age;

    std::cout << "Enter your name: ";
    std::cin >> name;               // reads a single word (stops at whitespace)
    std::cout << "Enter your age: ";
    std::cin >> age;

    std::cout << "Hello, " << name << "! You are " << age << " years old.\n";

    // Reading a whole line (including spaces)
    std::cin.ignore();              // discard the newline left by previous input
    std::getline(std::cin, name);
    std::cout << "Your full name: " << name << std::endl;
    return 0;
}
```

4.5 Operators

Arithmetic: +, -, *, /, % (modulo)
Relational: ==, !=, <, >, <=, >=
Logical: && (and), || (or), ! (not)
Assignment: =, +=, -=, *=, /=, %=
Increment/Decrement: ++ (pre/post), --
Ternary: condition ? expr1 : expr2
Bitwise (for integers): &, |, ^, ~, <<, >>
Other: sizeof(type) gives size in bytes, , comma operator.

Operator precedence: as in C. Use parentheses to make intention clear.

4.6 Control Flow

if‑else:

```cpp
if (age >= 18) {
    std::cout << "Adult\n";
} else if (age >= 13) {
    std::cout << "Teen\n";
} else {
    std::cout << "Child\n";
}
```

switch:

```cpp
switch (day) {
    case 1: std::cout << "Monday\n"; break;
    case 2: std::cout << "Tuesday\n"; break;
    default: std::cout << "Other\n";
}
```

Break is necessary unless you want fall‑through.

Loops:

```cpp
// for loop
for (int i = 0; i < 5; ++i) {
    std::cout << i << ' ';
}

// range‑based for (C++11)
std::vector<int> vec = {1,2,3,4};
for (int v : vec) {
    std::cout << v << ' ';
}

// while loop
while (condition) { ... }

// do‑while
do { ... } while (condition);
```

break exits the loop; continue skips to the next iteration.

4.7 Functions

Functions are reusable blocks of code.

```cpp
// Function declaration (prototype)
int add(int a, int b);

// Function definition
int add(int a, int b) {
    return a + b;
}
```

· Default arguments: void print(int a, int b = 10); – b defaults to 10.
· Function overloading: multiple functions with the same name but different parameters.
· Inline functions: inline int square(int x) { return x * x; } – request compiler to insert code directly (often defined in headers).
· constexpr functions – may be evaluated at compile time if arguments are constant.

Return type deduction (C++14):

```cpp
auto multiply(int a, int b) { return a * b; }   // return type deduced as int
```

[[nodiscard]] (C++17): warns if return value is discarded.

```cpp
[[nodiscard]] int getValue() { return 42; }
```

4.8 Arrays

C‑style arrays are fixed‑size sequences stored contiguously.

```cpp
int arr[5] = {1, 2, 3, 4, 5};   // size must be known at compile time
arr[0] = 10;                     // access by index
```

When passed to a function, an array decays to a pointer (loses size information).
In modern C++, prefer std::array or std::vector.

4.9 C‑Strings (Character Arrays)

A string in C is a null‑terminated array of char.

```cpp
char str[] = "Hello";      // str has size 6 (including '\0')
```

Functions from <cstring>: strlen, strcpy, strcat, strcmp.
Again, prefer std::string in C++.

4.10 Pointers

A pointer stores the memory address of another variable.

```cpp
int x = 42;
int* p = &x;       // p holds the address of x
std::cout << *p;   // dereference: prints 42
*p = 100;          // changes x to 100

int* nullPtr = nullptr;   // C++11 null pointer
```

Pointer arithmetic:

```cpp
int arr[3] = {10, 20, 30};
int* p = arr;       // points to arr[0]
p++;                // now points to arr[1] (address + sizeof(int) bytes)
std::cout << *(p+1); // prints arr[2]
```

4.11 References

A reference is an alias for an existing variable. It must be initialized when created and cannot be rebound.

```cpp
int a = 10;
int& ref = a;   // ref and a are the same variable
ref = 20;       // a becomes 20
```

References are often used for function parameters to avoid copying large objects:

```cpp
void swap(int& a, int& b) {
    int temp = a;
    a = b;
    b = temp;
}
```

4.12 Dynamic Memory Allocation (C‑style)

In C++ you can allocate memory on the heap (free store) using new and deallocate with delete.

```cpp
int* p = new int(5);        // allocate and initialize
delete p;                   // free memory

int* arr = new int[100];    // array of 100 ints
delete[] arr;               // free array (note [])

p = nullptr;                // avoid dangling pointer
```

Important: Never mix new/delete with malloc/free. Always pair new with delete (or new[] with delete[]).
Modern C++ strongly advises using smart pointers and containers instead of raw new/delete.

---

5. Object‑Oriented Programming (Intermediate)

OOP allows you to model real‑world entities using classes, which encapsulate data and functions.

5.1 Classes and Objects

```cpp
class Rectangle {
private:                     // accessible only inside the class
    double width;
    double height;

public:                      // accessible from outside
    // Constructor
    Rectangle(double w, double h) : width(w), height(h) {
        // constructor body (usually empty)
    }

    // Member function (method)
    double area() const {     // 'const' means it doesn't modify the object
        return width * height;
    }

    // Getters / setters
    double getWidth() const { return width; }
    void setWidth(double w) { width = w; }
};

int main() {
    Rectangle rect(5.0, 3.0);
    std::cout << "Area: " << rect.area() << std::endl;
}
```

· private and public are access specifiers (also protected).
· Member functions can be defined inside or outside the class (outside: Rectangle::area() ...).
· The const qualifier on a member function promises it won’t modify the object.

5.2 Constructors and Destructors

· Default constructor: Rectangle() : width(0), height(0) {} – takes no arguments.
· Parameterized constructor: as above.
· Copy constructor: Rectangle(const Rectangle& other) : width(other.width), height(other.height) {} – creates a copy.
· Move constructor (C++11): Rectangle(Rectangle&& other) noexcept – transfers resources from a temporary.
· Destructor: ~Rectangle() {} – called when the object is destroyed. If your class manages dynamic memory or other resources, you must write a proper destructor (and follow the Rule of Five, see later).

Initializer list is used to initialize members before the constructor body runs. It is more efficient, especially for const and reference members.

5.3 Inheritance

Inheritance allows a class to derive properties and behaviors from a base class.

```cpp
class Shape {
protected:
    double area_val = 0;
public:
    virtual double area() const = 0;  // pure virtual
    virtual ~Shape() {}               // virtual destructor
};

class Circle : public Shape {
    double radius;
public:
    Circle(double r) : radius(r) {}
    double area() const override {
        return 3.14159 * radius * radius;
    }
};
```

· : public Shape – public inheritance (most common). Models “is‑a” relationship.
· virtual keyword enables dynamic polymorphism.
· override ensures you are actually overriding a base class method (recommended).
· A virtual destructor is essential when deleting derived objects through a base pointer.

Multiple inheritance is supported but can cause ambiguities. Use virtual inheritance to solve the diamond problem.

5.4 Polymorphism (Virtual Functions)

When a virtual function is called through a base class pointer/reference, the actual derived version is executed (dynamic dispatch). This is implemented via vtable – a table of function pointers.

```cpp
Shape* s = new Circle(10.0);
std::cout << s->area();   // calls Circle::area
delete s;
```

Without virtual, you get static binding (call based on pointer type), which leads to wrong behavior.

5.5 Abstract Classes / Interfaces

A class with at least one pure virtual function (= 0) cannot be instantiated. It defines an interface that derived classes must implement.

5.6 Operator Overloading

You can define how operators work with your custom types.

```cpp
class Vector2D {
    double x, y;
public:
    Vector2D(double x, double y) : x(x), y(y) {}
    Vector2D operator+(const Vector2D& other) const {
        return Vector2D(x + other.x, y + other.y);
    }
    friend std::ostream& operator<<(std::ostream& os, const Vector2D& v) {
        os << "(" << v.x << ", " << v.y << ")";
        return os;
    }
};
```

Most operators can be overloaded, except ., .*, ::, ?:, and sizeof.

5.7 Static Members

Static members belong to the class itself, not to any instance.

```cpp
class Counter {
    static inline int count = 0;   // C++17 inline static member
public:
    Counter() { ++count; }
    static int getCount() { return count; }  // static method
};
// Before C++17, you had to define 'int Counter::count = 0;' outside the class.
```

Static member functions cannot access non‑static members.

5.8 Friend

A friend function or class can access private and protected members of the class in which it is declared.

```cpp
class MyClass {
    friend void accessPrivate(MyClass& obj);
    int secret = 42;
};
void accessPrivate(MyClass& obj) {
    std::cout << obj.secret;   // allowed
}
```

Use friends sparingly – they break encapsulation.

5.9 Copy and Move Semantics (Rule of Five/Zero)

When a class manages a resource (e.g., raw pointer), you must control what happens when objects are copied or moved.

· Rule of Three: If you define a custom destructor, copy constructor, or copy assignment operator, you likely need all three.
· Rule of Five (C++11): add move constructor and move assignment.
· Rule of Zero: If your class does not manage any raw resources (i.e., it uses std::string, std::vector, std::unique_ptr), the compiler‑generated special member functions are correct, and you should not define them.

Example of Rule of Five:

```cpp
class Buffer {
    size_t size;
    char* data;
public:
    Buffer(size_t s) : size(s), data(new char[s]) {}
    ~Buffer() { delete[] data; }
    // Copy
    Buffer(const Buffer& other) : size(other.size), data(new char[size]) {
        std::copy(other.data, other.data + size, data);
    }
    Buffer& operator=(const Buffer& other) {
        if (this != &other) {
            delete[] data;
            size = other.size;
            data = new char[size];
            std::copy(other.data, other.data + size, data);
        }
        return *this;
    }
    // Move
    Buffer(Buffer&& other) noexcept : size(0), data(nullptr) {
        swap(*this, other);
    }
    Buffer& operator=(Buffer&& other) noexcept {
        swap(*this, other);
        return *this;
    }
    friend void swap(Buffer& a, Buffer& b) noexcept {
        using std::swap;
        swap(a.size, b.size);
        swap(a.data, b.data);
    }
};
```

In modern C++, prefer std::vector or std::unique_ptr<char[]> and follow the Rule of Zero.

---

6. Advanced Language Features

6.1 Templates

Templates enable generic programming – writing code that works with any type.

Function template:

```cpp
template <typename T>
T max(T a, T b) {
    return (a > b) ? a : b;
}
// Usage: max(3, 5), max(3.14, 2.72)
```

Class template:

```cpp
template <typename T, int Size>
class Array {
    T data[Size];
public:
    T& operator[](int i) { return data[i]; }
    int size() const { return Size; }
};
```

Templates are instantiated at compile time – the compiler generates specific code for each type used.

Template Specialization: provide a special version for a particular type.

```cpp
template <>
const char* max<const char*>(const char* a, const char* b) {
    return (strcmp(a,b) > 0) ? a : b;
}
```

Variadic Templates (C++11): accept any number of template arguments.

```cpp
template <typename... Args>
void print(Args... args) {
    (std::cout << ... << args) << '\n';  // fold expression (C++17)
}
```

Concepts (C++20) – constraints on template parameters for better error messages.

```cpp
template <typename T>
concept Addable = requires(T a, T b) { a + b; };

template <Addable T>
T add(T a, T b) { return a + b; }
```

6.2 Exception Handling

C++ provides a structured way to handle errors.

```cpp
try {
    throw std::runtime_error("An error occurred");
} catch (const std::exception& e) {
    std::cerr << e.what() << '\n';
} catch (...) {   // catch any other exception
    std::cerr << "Unknown exception\n";
}
```

Standard exceptions are defined in <stdexcept>. It is good practice to derive your exceptions from std::exception.
Functions can be declared noexcept if they promise not to throw, allowing compiler optimizations.

RAII (Resource Acquisition Is Initialization) is the key to exception safety: resources are released automatically when objects go out of scope.

6.3 Lambda Expressions (C++11)

Anonymous function objects.

```cpp
auto add = [](int a, int b) -> int { return a + b; };  // return type optional
int sum = add(3, 4);

// Capture external variables
int factor = 2;
auto multiply = [factor](int x) { return x * factor; };  // by value

// Mutable lambda: can modify captured copy
auto counter = [count = 0]() mutable { return ++count; };

// Generic lambda (C++14): auto parameters
auto print = [](auto value) { std::cout << value << '\n'; };
```

Lambda captures:

· [&] – capture all by reference
· [=] – capture all by value
· [this] – capture the current object
· Mixed: [=, &x] – all by value, except x by reference.

Lambdas can be stored in std::function.

6.4 Type Deduction – auto, decltype

· auto deduces the type of a variable from its initializer, stripping references and top‑level const.
  ```cpp
  auto i = 5;       // int
  auto& r = i;      // int&
  ```
· decltype(expr) gives the exact type of an expression.
  ```cpp
  int x = 0;
  decltype(x) y = 5;       // int
  decltype((x)) z = y;     // int&  (double parentheses yield lvalue ref)
  ```
· decltype(auto) (C++14) – type deduction like decltype.
  ```cpp
  decltype(auto) f() {
      static int x = 0;
      return x;  // returns int&
  }
  ```

6.5 Smart Pointers (C++11)

Smart pointers automatically manage memory, preventing leaks.

· std::unique_ptr – exclusive ownership, cannot be copied, only moved.
  ```cpp
  auto p = std::make_unique<int>(10);   // C++14
  auto p2 = std::move(p);   // p becomes nullptr, p2 owns the int
  ```
· std::shared_ptr – shared ownership with reference counting.
  ```cpp
  auto sp1 = std::make_shared<int>(20);
  auto sp2 = sp1;           // reference count = 2
  ```
· std::weak_ptr – non‑owning observer, can be locked to get a temporary shared_ptr.

Never use new/delete manually when you can use smart pointers.

6.6 Move Semantics and Rvalue References (C++11)

An lvalue has a name and can be addressed (e.g., a variable). An rvalue is a temporary object (e.g., result of x + y).

Rvalue references (T&&) bind to rvalues, enabling move semantics – transferring resources rather than copying them.

```cpp
std::string s1 = "Hello";
std::string s2 = std::move(s1);   // s1 is now empty, s2 owns the data
```

In templates, use std::forward<T>(arg) for perfect forwarding of arguments.

Move semantics are crucial for performance in containers, as they avoid expensive deep copies.

6.7 constexpr and consteval

· constexpr indicates that a function or variable may be evaluated at compile time if possible.
  ```cpp
  constexpr int factorial(int n) {
      return n <= 1 ? 1 : n * factorial(n - 1);
  }
  constexpr int fact5 = factorial(5);  // computed at compile time
  ```
· consteval (C++20) forces a function to be evaluated only at compile time (immediate function).
  ```cpp
  consteval int square(int n) { return n * n; }
  constexpr int s = square(10);   // ok
  // int x; square(x); // error: x is not a constant expression
  ```
· constinit (C++20) ensures a variable is initialized at compile time (but can still be modified later).

6.8 Structured Bindings (C++17)

Decompose a pair, tuple, or struct into separate variables.

```cpp
std::pair<int, std::string> p = {1, "one"};
auto [num, str] = p;   // num = 1, str = "one"

struct Point { int x, y; };
Point pt{10, 20};
auto [a, b] = pt;      // a=10, b=20
```

Works with arrays, std::tuple, std::map, etc.

6.9 if constexpr (C++17)

Compile‑time conditional branching in templates, avoids generating invalid code.

```cpp
template<typename T>
void print(T value) {
    if constexpr (std::is_integral_v<T>) {
        std::cout << "Integer: " << value;
    } else if constexpr (std::is_floating_point_v<T>) {
        std::cout << "Float: " << value;
    }
}
```

6.10 Namespaces

Namespaces prevent name collisions.

```cpp
namespace Math {
    constexpr double pi = 3.14159;
    double area(double r) { return pi * r * r; }
}
// usage: Math::area(5.0)
using Math::pi;   // bring pi into current scope
```

Avoid using namespace std; in headers (to prevent pollution).

6.11 Casting Operators

Prefer C++ casts over C‑style casts:

· static_cast<Type>(expr) – well‑defined conversions (e.g., int to double, base* to derived* without runtime check).
· dynamic_cast<Type>(expr) – safe downcast for polymorphic types; returns nullptr (pointer) or throws std::bad_cast (reference) on failure.
· const_cast<Type>(expr) – adds or removes const (use with extreme care).
· reinterpret_cast<Type>(expr) – low‑level reinterpretation of bit pattern (non‑portable, dangerous).

6.12 Scoped Enumerations (C++11)

```cpp
enum class Color { Red, Green, Blue };
Color c = Color::Red;
// No implicit conversion to int; explicit cast needed: static_cast<int>(c)
```

Old unscoped enum pollutes the enclosing namespace and implicitly converts to int.

6.13 Union and std::variant

A union holds one of its members at a time; you must know which one is active.

```cpp
union Value { int i; double d; };
Value v; v.i = 10;  // now v.d is invalid
```

std::variant (C++17) is a type‑safe union that tracks the currently active type.

```cpp
std::variant<int, double, std::string> v;
v = 42;
int i = std::get<int>(v);          // may throw std::bad_variant_access
int* p = std::get_if<int>(&v);     // returns pointer or nullptr
```

6.14 Inline Variables (C++17)

Non‑const global variables defined in headers cause linker errors (multiple definitions). inline solves this.

```cpp
// In header
inline int counter = 0;
```

constexpr variables are implicitly inline. Also static constexpr class members are inline.

6.15 C++20 Modules

Modules replace #include with faster, more reliable compilation.

```cpp
// mymodule.ixx
export module MyModule;
export int add(int a, int b) { return a + b; }

// main.cpp
import MyModule;
int main() { return add(2,3); }
```

Support is growing; build systems need to be updated. Not yet universal in all codebases.

---

7. The Standard Template Library (STL)

The STL provides generic containers, algorithms, and iterators. Mastering it is essential.

7.1 Containers

Sequence containers (elements in linear order):

Container Description
std::vector dynamic array; fast random access, efficient push_back (amortized O(1))
std::deque double‑ended queue; efficient insertion/removal at both ends
std::list doubly linked list; fast insertion/removal anywhere (no random access)
std::forward_list singly linked list; minimal overhead
std::array fixed‑size array (size known at compile time)

Associative containers (sorted by key, typically red‑black trees):

· std::set / std::multiset
· std::map / std::multimap

Unordered associative containers (hash tables):

· std::unordered_set / std::unordered_multiset
· std::unordered_map / std::unordered_multimap

Container adaptors (provide specific interface using underlying container):

· std::stack (default underlying: deque)
· std::queue (default underlying: deque)
· std::priority_queue

C++23 adds std::flat_map, std::flat_set (sorted vector‑based).

Common operations for most containers:

· push_back, pop_back (sequence containers)
· insert, erase (everywhere)
· find (members of sets/maps; for sequences use std::find)
· size(), empty()
· clear()

std::vector in detail:

```cpp
#include <vector>
std::vector<int> v = {1, 2, 3};
v.push_back(4);            // add to end
v.emplace_back(5);         // construct in place (avoids copy)
v.insert(v.begin(), 0);    // insert at position
v.erase(v.begin() + 2);    // erase element at index 2
for (int x : v) std::cout << x << ' ';
```

7.2 Iterators

Iterators abstract the notion of a pointer, allowing algorithms to work with any container.

Categories:

· Input – read‑only, single pass (std::istream_iterator)
· Output – write‑only, single pass (std::ostream_iterator)
· Forward – can read/write and move forward multiple passes (std::forward_list::iterator)
· Bidirectional – can also move backward (std::list::iterator)
· Random‑access – can jump arbitrarily (std::vector::iterator, behaves like a raw pointer)

All containers provide begin() and end(). Constant versions: cbegin(), cend().

Range‑based for loop uses iterators internally.

7.3 Algorithms

Defined in <algorithm> and <numeric>. They operate on iterator ranges.

Non‑modifying:

· std::find(begin, end, value) – returns iterator to first match or end.
· std::find_if(begin, end, predicate) – first element for which predicate is true.
· std::count, std::count_if
· std::all_of, std::any_of, std::none_of
· std::equal
· std::search

Modifying:

· std::copy, std::copy_if
· std::transform – applies a function to each element, storing result.
· std::fill, std::fill_n
· std::replace, std::replace_if
· std::remove, std::remove_if (note: doesn’t actually erase – use erase‑remove idiom)
· std::unique – removes consecutive duplicates
· std::reverse, std::rotate

Sorting and searching:

· std::sort(begin, end) – O(N log N), usually intro‑sort (hybrid quicksort/heapsort).
· std::stable_sort – preserves order of equivalent elements.
· std::partial_sort, std::nth_element
· std::binary_search, std::lower_bound, std::upper_bound, std::equal_range (require sorted range)

Heap algorithms:

· std::make_heap, std::push_heap, std::pop_heap, std::is_heap

Set operations (on sorted ranges):

· std::set_union, std::set_intersection, std::set_difference, std::set_symmetric_difference

Numeric algorithms (<numeric>):

· std::accumulate – sum, etc.
· std::inner_product
· std::iota – fill with sequentially increasing values
· std::reduce (C++17) – parallel‑friendly reduction
· std::transform_reduce

Parallel execution (C++17): add std::execution::par or par_unseq as first argument.

Erase‑remove idiom:

```cpp
// Remove all 0s from vector
v.erase(std::remove(v.begin(), v.end(), 0), v.end());
```

7.4 Function Objects and Lambdas

Many algorithms accept callable objects. A functor is a class with an operator().

```cpp
struct Square {
    int operator()(int x) const { return x * x; }
};
Square sq;
int y = sq(5);   // 25

// Usage with algorithm:
std::transform(v.begin(), v.end(), v.begin(), Square());
```

Lambdas are the most convenient way to create function objects on the fly.

std::function can store any callable with a given signature:

```cpp
std::function<int(int,int)> f = [](int a, int b) { return a + b; };
```

std::bind and std::placeholders create partial function applications, but lambdas are generally preferred.

7.5 Allocators

Containers use allocators to handle memory. The default is std::allocator<T>. You can write custom allocators for special memory (e.g., shared memory, memory pools).

Polymorphic Memory Resources (PMR, C++17): std::pmr::vector, std::pmr::string etc. use std::pmr::polymorphic_allocator. You can supply a memory resource like std::pmr::monotonic_buffer_resource for fast, arena‑based allocation.

7.6 String and String View

· std::string – dynamic character string.
· std::wstring – wide character string.
· std::string_view (C++17) – non‑owning reference to a contiguous sequence of characters. Lightweight, can be constructed from const char*, std::string, etc. Does not own the data, so the underlying string must outlive the view.

```cpp
std::string name = "John";
std::string_view sv = name;      // no copy
std::cout << sv.substr(1,2);     // also O(1) slicing
```

Regular expressions (<regex>): std::regex, std::smatch, std::regex_match, std::regex_search. Performance is not always great; consider alternatives for heavy parsing.

7.7 I/O Streams and File I/O

Stream classes:

· std::ifstream – input file stream.
· std::ofstream – output file stream.
· std::fstream – bidirectional file stream.

```cpp
#include <fstream>
// Writing
std::ofstream out("data.txt");
out << "Hello, file!" << std::endl;
out.close();

// Reading
std::ifstream in("data.txt");
std::string line;
while (std::getline(in, line)) {
    std::cout << line << '\n';
}
```

String streams (<sstream>): std::istringstream, std::ostringstream for in‑memory formatting.

Manipulators: std::setw, std::setprecision, std::fixed, std::hex, etc.

7.8 Chrono – Date and Time (C++11)

```cpp
#include <chrono>
using namespace std::chrono;

auto start = steady_clock::now();
// ... work ...
auto end = steady_clock::now();
auto elapsed = duration_cast<milliseconds>(end - start).count();
```

C++20 introduced calendar and time‑zone types: year_month_day, zoned_time, etc. Requires compiler support.

7.9 Random Numbers

<random> provides:

· Engines: std::mt19937 (Mersenne Twister), std::default_random_engine.
· Distributions: std::uniform_int_distribution, std::normal_distribution, etc.

```cpp
std::mt19937 gen(42);  // seed
std::uniform_int_distribution<int> dist(1, 6);
int dice = dist(gen);
```

7.10 Filesystem Library (C++17)

std::filesystem allows portable file system operations.

```cpp
#include <filesystem>
namespace fs = std::filesystem;

fs::path p = "/home/user/file.txt";
if (fs::exists(p)) { ... }
fs::create_directory("newfolder");
for (auto& entry : fs::directory_iterator("."))
    std::cout << entry.path() << '\n';
```

7.11 Optional, Variant, Any

· std::optional<T>: maybe holds a value. has_value(), value(), *.
· std::variant<Ts...>: type‑safe union. std::get, std::holds_alternative, std::visit.
· std::any: holds any copy‑constructible type. any_cast<T>.

7.12 Tuple and Pair

· std::pair – two values (.first, .second).
· std::tuple – heterogeneous collection. Access with std::get<index>(tup) or std::get<Type>(tup).

```cpp
auto t = std::make_tuple(1, "hello", 3.14);
int i = std::get<0>(t);
std::string s = std::get<1>(t);
```

7.13 Smart Pointers (as STL components)

<memory>:

· std::unique_ptr<T, Deleter>: includes a custom deleter.
· std::shared_ptr<T>: thread‑safe reference count.
· std::enable_shared_from_this: safely obtain shared_ptr from this.

7.14 std::function and std::bind

std::function<Signature> erases the callable type, allowing storage of any compatible callable.
std::bind partially applies arguments, but lambdas are often clearer.

7.15 Ranges (C++20)

Ranges provide a more functional, composable interface.

```cpp
#include <ranges>
std::vector<int> v = {1,2,3,4,5,6};
auto evens = v | std::views::filter([](int i){ return i%2==0; })
               | std::views::transform([](int i){ return i * 10; });
for (int x : evens) std::cout << x << ' ';
```

Range‑based algorithms exist in std::ranges (e.g., std::ranges::sort(v)).

7.16 Coroutines (C++20)

Coroutines allow suspending and resuming functions. They are a framework; you write your own promise type or use library ones (like cppcoro). co_await, co_return, co_yield are the keywords.

C++23 introduces std::generator for simple generators:

```cpp
std::generator<int> seq() {
    for (int i = 0; i < 5; ++i)
        co_yield i;
}
```

---

8. Memory Model and Low‑Level Details

8.1 Storage Duration

· Automatic – local variables, destroyed when scope ends.
· Static – global, static local, constexpr; lifetime = program duration.
· Dynamic – allocated with new/delete.
· Thread‑local – thread_local keyword; one instance per thread.

8.2 Object Lifetime

An object’s lifetime starts after construction and ends when the destructor is called. Using an object before construction or after destruction is undefined behavior.

8.3 Memory Alignment

alignof(T) returns the alignment requirement. alignas(n) can enforce a larger alignment. Misaligned access may cause CPU faults or performance degradation.

8.4 Placement new

Construct an object in a pre‑allocated memory buffer without allocating new memory:

```cpp
char buffer[sizeof(MyClass)];
MyClass* obj = new (buffer) MyClass();
obj->~MyClass();  // manual destructor call, no free
```

Used in custom allocators and object pools.

8.5 Undefined Behavior (UB)

Many operations in C++ result in undefined behavior – the standard imposes no requirements, and anything can happen (crash, silent corruption, or seemingly work).

Common UB:

· Dereferencing a null pointer.
· Accessing an array out of bounds.
· Signed integer overflow.
· Using a variable before initialization.
· Deleting a pointer twice.
· Data race (two threads access same data without synchronization).
· Modifying a string literal.

Sanitizers (-fsanitize=address, -fsanitize=undefined) can detect many UB instances.

---

9. Concurrency and Multithreading

9.1 Threads

```cpp
#include <thread>
void work() { /*...*/ }
std::thread t(work);   // starts a new thread
t.join();              // wait for completion
// or t.detach();      // run independently (dangerous if outliving resources)
```

Pass arguments by copying; if you need references, use std::ref().

std::jthread (C++20) – automatically joins on destruction and supports stop tokens for cooperative cancellation.

9.2 Mutexes and Locks

```cpp
#include <mutex>
std::mutex mtx;
int shared_data = 0;

void safe_increment() {
    std::lock_guard<std::mutex> lock(mtx);   // RAII lock
    ++shared_data;
}
```

· std::unique_lock – more flexible (can lock/unlock, used with condition variables).
· std::shared_lock – for std::shared_mutex (multiple readers, single writer).
· std::scoped_lock (C++17) – locks multiple mutexes avoiding deadlock.

9.3 Condition Variables

Used for signaling between threads.

```cpp
std::condition_variable cv;
std::mutex mtx;
bool ready = false;

void producer() {
    // produce data
    std::lock_guard lk(mtx);
    ready = true;
    cv.notify_one();
}

void consumer() {
    std::unique_lock lk(mtx);
    cv.wait(lk, []{ return ready; }); // releases mutex while waiting
    // consume
}
```

9.4 Atomics

std::atomic<T> provides lock‑free operations for small types.

```cpp
std::atomic<int> counter{0};
counter.fetch_add(1);
int val = counter.load();
```

Memory orders (std::memory_order_relaxed, acquire, release, seq_cst) control visibility of operations across threads. Default is seq_cst (strongest, easiest).

9.5 Futures, Promises, async

· std::async launches a task asynchronously and returns a std::future.
· std::promise/std::future – one‑time communication channel.

```cpp
auto future = std::async(std::launch::async, []() { return 42; });
int result = future.get();
```

9.6 Parallel Algorithms (C++17)

Pass std::execution::par to algorithms for parallel execution:

```cpp
std::sort(std::execution::par, v.begin(), v.end());
```

---

10. Exception Safety and RAII

RAII – Resource Acquisition Is Initialization – ties resources to object lifetime. For example, a std::fstream automatically closes the file in its destructor; std::lock_guard releases the mutex.

Exception safety guarantees:

· Basic – no resource leak, invariants preserved.
· Strong – on failure, state is rolled back to before the operation.
· Nothrow – operation never throws.

Using RAII and smart pointers gives strong exception safety for free.

---

11. C++ Tools and Ecosystem

· Build systems: CMake (cross‑platform), Make, Ninja.
· Package managers: vcpkg (Microsoft), Conan.
· Testing: Google Test, Catch2, doctest.
· Code quality: clang‑format, clang‑tidy, cppcheck.
· Debugging: GDB, LLDB, Visual Studio debugger.
· Profilers: perf, Valgrind, Instruments (macOS).
· Compilers: GCC, Clang, MSVC.

---

12. REST API Client in C++ (GET, POST, PUT, DELETE)

We use libcurl for raw HTTP operations. (CPR is a modern, header‑only wrapper, but we’ll show libcurl for understanding.)

12.1 Setup

Install libcurl development files.

· Linux: sudo apt install libcurl4-openssl-dev
· macOS: brew install curl
· Link: -lcurl

12.2 CRUD Client Class

```cpp
#include <curl/curl.h>
#include <string>
#include <stdexcept>
#include <iostream>

size_t WriteCallback(void* contents, size_t size, size_t nmemb, std::string* s) {
    size_t total = size * nmemb;
    s->append(static_cast<char*>(contents), total);
    return total;
}

class RestClient {
    CURL* curl;
public:
    RestClient() {
        curl = curl_easy_init();
        if (!curl) throw std::runtime_error("Failed to init curl");
    }
    ~RestClient() { if (curl) curl_easy_cleanup(curl); }

    std::string get(const std::string& url) {
        std::string response;
        curl_easy_setopt(curl, CURLOPT_URL, url.c_str());
        curl_easy_setopt(curl, CURLOPT_WRITEFUNCTION, WriteCallback);
        curl_easy_setopt(curl, CURLOPT_WRITEDATA, &response);
        perform();
        return response;
    }

    std::string post(const std::string& url, const std::string& json) {
        std::string response;
        curl_easy_setopt(curl, CURLOPT_URL, url.c_str());
        curl_easy_setopt(curl, CURLOPT_POST, 1L);
        curl_easy_setopt(curl, CURLOPT_POSTFIELDS, json.c_str());
        curl_easy_setopt(curl, CURLOPT_WRITEFUNCTION, WriteCallback);
        curl_easy_setopt(curl, CURLOPT_WRITEDATA, &response);
        struct curl_slist* headers = nullptr;
        headers = curl_slist_append(headers, "Content-Type: application/json");
        curl_easy_setopt(curl, CURLOPT_HTTPHEADER, headers);
        perform();
        curl_slist_free_all(headers);
        return response;
    }

    std::string put(const std::string& url, const std::string& json) {
        std::string response;
        curl_easy_setopt(curl, CURLOPT_URL, url.c_str());
        curl_easy_setopt(curl, CURLOPT_CUSTOMREQUEST, "PUT");
        curl_easy_setopt(curl, CURLOPT_POSTFIELDS, json.c_str());
        curl_easy_setopt(curl, CURLOPT_WRITEFUNCTION, WriteCallback);
        curl_easy_setopt(curl, CURLOPT_WRITEDATA, &response);
        struct curl_slist* headers = nullptr;
        headers = curl_slist_append(headers, "Content-Type: application/json");
        curl_easy_setopt(curl, CURLOPT_HTTPHEADER, headers);
        perform();
        curl_slist_free_all(headers);
        return response;
    }

    std::string del(const std::string& url) {
        std::string response;
        curl_easy_setopt(curl, CURLOPT_URL, url.c_str());
        curl_easy_setopt(curl, CURLOPT_CUSTOMREQUEST, "DELETE");
        curl_easy_setopt(curl, CURLOPT_WRITEFUNCTION, WriteCallback);
        curl_easy_setopt(curl, CURLOPT_WRITEDATA, &response);
        perform();
        return response;
    }

private:
    void perform() {
        CURLcode res = curl_easy_perform(curl);
        if (res != CURLE_OK)
            throw std::runtime_error(curl_easy_strerror(res));
    }
};

// Example usage
int main() {
    RestClient api;
    std::string json = api.get("https://jsonplaceholder.typicode.com/posts/1");
    std::cout << json << std::endl;

    std::string newPost = R"({"title":"foo","body":"bar","userId":1})";
    std::string res = api.post("https://jsonplaceholder.typicode.com/posts", newPost);
    std::cout << res << std::endl;
}
```

---

13. WebSocket Server for IoT and Web Clients

We build a WebSocket server that can handle IoT devices and browser clients, using websocketpp (header‑only, requires Boost).

13.1 Dependencies

· Boost libraries (system, thread)
· websocketpp (download from https://github.com/zaphoyd/websocketpp, just copy the websocketpp folder)

Compile: g++ -std=c++11 -o ws_server ws_server.cpp -I. -lboost_system -lpthread

13.2 Server Code

```cpp
#include <websocketpp/config/asio_no_tls.hpp>
#include <websocketpp/server.hpp>
#include <iostream>
#include <set>

using websocketpp::connection_hdl;
using server_t = websocketpp::server<websocketpp::config::asio>;

class BroadcastServer {
public:
    BroadcastServer() {
        m_server.init_asio();
        m_server.set_open_handler([this](connection_hdl hdl) {
            m_connections.insert(hdl);
            std::cout << "Client connected. Total: " << m_connections.size() << "\n";
        });
        m_server.set_close_handler([this](connection_hdl hdl) {
            m_connections.erase(hdl);
            std::cout << "Client disconnected. Total: " << m_connections.size() << "\n";
        });
        m_server.set_message_handler([this](connection_hdl hdl, server_t::message_ptr msg) {
            std::string payload = msg->get_payload();
            std::cout << "Message: " << payload << "\n";
            // Broadcast to all connected clients
            for (const auto& h : m_connections) {
                m_server.send(h, payload, msg->get_opcode());
            }
        });
    }

    void run(uint16_t port) {
        m_server.listen(port);
        m_server.start_accept();
        std::cout << "WebSocket server listening on port " << port << "\n";
        m_server.run();
    }

private:
    server_t m_server;
    std::set<connection_hdl, std::owner_less<connection_hdl>> m_connections;
};

int main() {
    BroadcastServer srv;
    srv.run(9002);
    return 0;
}
```

13.3 Web Client (HTML/JavaScript)

```html
<!DOCTYPE html>
<html>
<head><title>WebSocket Client</title></head>
<body>
    <h2>IoT Control Panel</h2>
    <input id="msg" type="text" placeholder="Enter command" />
    <button onclick="send()">Send</button>
    <div id="output"></div>
    <script>
        const ws = new WebSocket('ws://localhost:9002');
        ws.onopen = () => output('Connected');
        ws.onmessage = (e) => output('Received: ' + e.data);
        ws.onclose = () => output('Disconnected');

        function send() {
            const input = document.getElementById('msg');
            ws.send(input.value);
            input.value = '';
        }
        function output(text) {
            document.getElementById('output').innerHTML += '<p>' + text + '</p>';
        }
    </script>
</body>
</html>
```

Open the HTML file in a browser; connect an IoT device (any WebSocket client) to ws://localhost:9002. Messages are broadcast to all clients.

---

14. Common Design Patterns in C++

While not exhaustive, these patterns are frequently implemented.

· Singleton – ensure a single instance, often using static local variable.
· Factory Method / Abstract Factory – create objects without specifying concrete class.
· Observer – via callbacks, std::function, or custom event systems.
· Strategy – interchangeable algorithms using polymorphism or templates.
· Adapter – wrap a class to provide a different interface.
· RAII – wrapper objects that manage resources (not exactly a GoF pattern, but fundamental).

C++ allows compile‑time alternatives to many runtime patterns via templates (e.g., policy‑based design).

---

15. Best Practices and Coding Guidelines

· Follow C++ Core Guidelines.
· Use RAII for all resource management.
· Prefer stack allocation over heap when possible.
· Use const everywhere (const variables, const member functions).
· Pass large objects by const reference, small objects by value.
· Use auto to avoid repetition, but don’t obscure meaning.
· Avoid macros; use constexpr, inline functions, templates.
· Keep functions short and single‑purpose.
· Use standard library algorithms instead of raw loops.
· Enable compiler warnings (-Wall -Wextra -Wpedantic) and treat them as errors.
· Use smart pointers, never delete manually.
· Prefer std::string over char*, std::vector over C arrays.
· Don’t use using namespace std; in headers.
· Write tests for your code.

---

16. Common Interview Questions

· Explain the difference between new and malloc.
· What are virtual functions and how do they work?
· What is the Rule of Three/Five/Zero?
· Explain RAII and give an example.
· What is a smart pointer? Differences between unique_ptr, shared_ptr, weak_ptr.
· How do templates work? What is template specialization?
· What is the difference between overloading and overriding?
· Explain constexpr vs const.
· What is move semantics and when is it used?
· What are lambda expressions? How do you capture variables?
· Explain the STL containers and when to use each.
· What is undefined behavior? Give examples.
· What is a virtual destructor and why do you need it?
· How do you achieve polymorphism in C++?
· Difference between struct and class.
· What is decltype and auto?
· How does exception handling work? What is noexcept?
· Explain std::map vs std::unordered_map.
· What are rvalue references? How do you implement a move constructor?
· How do you prevent an object from being copied?

---

This guide has walked you through the entire spectrum of C++, from the simplest "Hello, World!" to advanced concurrency, modern STL features, and practical applications like REST clients and WebSocket servers. With consistent practice and a deep understanding of these concepts, you’ll be well‑prepared for any C++ interview or project.
