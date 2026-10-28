Python In-Depth Interview Preparation Guide (Beginner to Advanced)

This guide covers Python programming from the ground up. It includes language fundamentals, object‑oriented and functional programming, advanced features, standard library highlights, concurrency, and best practices. Every concept is explained with Python code examples. It is designed for learning and interview readiness—no DSA content, just the language.

---

1. What is Python?

Python is a high‑level, interpreted, general‑purpose programming language created by Guido van Rossum in 1991. It emphasizes readability, simplicity, and developer productivity. Python supports multiple programming paradigms: procedural, object‑oriented, and functional.

Key features:

· Interpreted – runs code line‑by‑line (via CPython, the reference implementation).
· Dynamically typed – variables have no fixed type; type is inferred at runtime.
· Garbage collected – automatic memory management.
· Extensive standard library – “batteries included”.
· Huge ecosystem – frameworks for web development, data science, automation, etc.

---

2. Installation & Setup

Download from python.org or use a package manager (e.g., apt, brew). Check version:

```bash
python --version   # or python3
```

Interactive shell (REPL):

```bash
python
>>> print("Hello, World!")
```

Running a script:

```bash
python script.py
```

Virtual environments isolate project dependencies:

```bash
python -m venv myenv
source myenv/bin/activate   # Linux/macOS
myenv\Scripts\activate      # Windows
```

---

3. Syntax Basics

3.1 Comments

```python
# single-line comment
"""
Multi-line
docstring or comment
"""
```

3.2 Variables and Data Types

Python is dynamically typed; you do not declare types. Variables are references.

```python
age = 25            # int
price = 19.99       # float
name = "Alice"      # str
is_active = True    # bool
nothing = None      # NoneType (null equivalent)
```

Type checking and conversion:

```python
type(age)         # <class 'int'>
isinstance(age, int) # True
float("3.14")     # 3.14
int("42")         # 42
str(100)          # '100'
```

3.3 Basic Data Types

Type Description Example
int integer (unlimited precision) 42, -7, 0x2A
float floating point (IEEE 754) 3.14, 1e-5
complex complex numbers 3+4j
str immutable text sequence 'hello', "world"
bool boolean (subclass of int) True, False
NoneType singleton null value None

3.4 Strings

Strings are immutable sequences of Unicode characters.

```python
s = "Hello, World!"
len(s)              # 13
s[0]                # 'H'  (indexing)
s[7:12]             # 'World' (slicing)
s.lower()           # 'hello, world!'
s.upper()
s.strip()           # remove leading/trailing whitespace
s.split(", ")       # ['Hello', 'World!']
", ".join(['a','b'])# 'a, b'
"Hello" + " World"  # concatenation
f"Name: {name}, Age: {age}"  # f-string (Python 3.6+)
"Age: {}".format(age)        # format method
```

String methods don't modify original (immutability).

3.5 Input and Output

```python
name = input("Enter your name: ")   # always returns str
print("Hello", name, sep=", ", end="!\n")
```

3.6 Operators

Arithmetic: +, -, *, / (true division), // (floor division), %, ** (exponentiation).
Comparison: ==, !=, <, >, <=, >=.
Logical: and, or, not.
Bitwise: &, |, ^, ~, <<, >>.
Assignment: =, +=, -=, etc.
Identity: is, is not (memory identity).
Membership: in, not in.

```python
a = 10
b = 3
print(a / b)     # 3.333...
print(a // b)    # 3
print(a ** b)    # 1000
print("a" in "apple")  # True
```

3.7 Control Flow

if-elif-else:

```python
x = 10
if x > 20:
    print("big")
elif x > 5:
    print("medium")
else:
    print("small")
```

Loops:

```python
# for loop over iterable
for i in range(5):    # 0..4
    print(i)

# while loop
count = 0
while count < 5:
    print(count)
    count += 1

# loop control: break, continue, pass
for i in range(10):
    if i == 3:
        continue
    if i == 8:
        break
```

3.8 Functions

```python
def greet(name, greeting="Hello"):
    """Return a greeting string."""   # docstring
    return f"{greeting}, {name}!"

result = greet("Alice")      # "Hello, Alice!"
result = greet("Bob", "Hi")  # "Hi, Bob!"
```

· Default arguments must come after non-default.
· Functions are first‑class objects: can be assigned, passed as arguments.
· *args and **kwargs for variable arguments:

```python
def print_all(*args, **kwargs):
    for arg in args: print(arg)
    for key, val in kwargs.items(): print(key, val)
print_all(1,2,3, name="Alice", age=30)
```

· Lambda functions (anonymous):

```python
square = lambda x: x * x
list(map(lambda x: x*2, [1,2,3]))   # [2,4,6]
```

· pass statement: placeholder for empty blocks.

---

4. Data Structures (Built‑in)

Python provides powerful built‑in collection types.

4.1 Lists

Ordered, mutable, allow duplicates.

```python
fruits = ["apple", "banana", "cherry"]
fruits.append("orange")
fruits.insert(1, "mango")
fruits.remove("banana")
last = fruits.pop()       # removes and returns last
fruits[1] = "kiwi"        # modify
len(fruits)
"apple" in fruits         # True
```

· Slicing: nums[start:stop:step]
· List comprehensions:

```python
squares = [x**2 for x in range(10)]
evens = [x for x in range(20) if x%2==0]
matrix = [[0]*3 for _ in range(3)]  # avoid [[0]*3]*3 (shallow copies)
```

· Sorting: fruits.sort() (in‑place) or sorted(fruits) (returns new). Custom key: sort(key=len).
· list(map(func, iterable)), filter, zip, enumerate.

4.2 Tuples

Ordered, immutable, allow duplicates.

```python
point = (10, 20)
x, y = point           # unpacking
single_item = (42,)    # comma needed
```

Tuples are often used for fixed collections, dictionary keys (if all items hashable).

4.3 Sets

Unordered, mutable, unique elements. No duplicates.

```python
s = {1, 2, 3, 2}
s.add(4)
s.remove(1)    # KeyError if missing
s.discard(5)   # no error
```

· Set operations: a | b, a & b, a - b, a ^ b.
· set() for empty set (not {} which is a dict).

4.4 Dictionaries (dict)

Key‑value pairs, unordered (ordered since Python 3.7+), mutable.

```python
person = {"name": "Alice", "age": 30}
person["age"] = 31
person["city"] = "New York"
for key, val in person.items():
    print(key, val)
```

· Access: person["name"] (KeyError if missing) or person.get("name", default).
· Dictionary comprehensions: {x: x**2 for x in range(5)}.
· dict(iterable), dict(a=1, b=2).

4.5 collections module

· namedtuple – lightweight immutable object with named fields.

```python
from collections import namedtuple
Point = namedtuple("Point", "x y")
p = Point(10, 20)
p.x, p.y
```

· deque – double‑ended queue, O(1) pop/append both sides.
· Counter – count hashable objects.
· OrderedDict, defaultdict (dict with default factory), ChainMap.

---

5. Object‑Oriented Programming (OOP)

5.1 Classes and Objects

```python
class Dog:
    # class attribute (shared by all instances)
    species = "Canis familiaris"

    # instance initializer (constructor)
    def __init__(self, name, age):
        self.name = name      # instance attribute
        self.age = age

    # instance method
    def bark(self):
        return f"{self.name} says Woof!"

    # __str__ for string representation (print, str)
    def __str__(self):
        return f"{self.name} ({self.age})"

    # __repr__ for developer representation (repr, debug)
    def __repr__(self):
        return f"Dog('{self.name}', {self.age})"

# Creating objects
dog1 = Dog("Rex", 3)
print(dog1.bark())
print(dog1)           # calls __str__
```

5.2 Inheritance

```python
class Animal:
    def __init__(self, name):
        self.name = name

    def speak(self):
        raise NotImplementedError("Subclass must implement")

class Cat(Animal):
    def speak(self):
        return f"{self.name} says Meow!"

cat = Cat("Whiskers")
print(cat.speak())
```

· super().__init__(...) to call parent constructor.
· Multiple inheritance supported (MRO – Method Resolution Order via C3 linearization).
· isinstance(obj, Class), issubclass(Sub, Super).

5.3 Magic (Dunder) Methods

Special methods that enable operator overloading and custom behavior.

```python
class Vector:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __add__(self, other):
        return Vector(self.x + other.x, self.y + other.y)

    def __eq__(self, other):
        return self.x == other.x and self.y == other.y

    def __len__(self):
        return int((self.x**2 + self.y**2)**0.5)

    # context manager support
    def __enter__(self):
        print("Entering")
        return self

    def __exit__(self, exc_type, exc_val, exc_tb):
        print("Exiting")
```

Other common dunders: __getitem__, __setitem__, __iter__, __next__, __call__.

5.4 Properties and Descriptors

Properties control attribute access.

```python
class Circle:
    def __init__(self, radius):
        self._radius = radius

    @property
    def radius(self):
        """Get radius"""
        return self._radius

    @radius.setter
    def radius(self, value):
        if value < 0:
            raise ValueError("Radius cannot be negative")
        self._radius = value

    @property
    def area(self):
        return 3.14 * self._radius**2

c = Circle(5)
print(c.radius)
c.radius = 10    # uses setter
```

5.5 Static and Class Methods

```python
class Math:
    @staticmethod
    def add(a, b):
        return a + b

    @classmethod
    def info(cls):
        print(f"Class: {cls.__name__}")
```

· @staticmethod – no self or cls; like a plain function in a class.
· @classmethod – first argument is the class (cls), can be used for factory methods.

5.6 Abstract Base Classes (ABC)

Enforce interface using abc module.

```python
from abc import ABC, abstractmethod

class Animal(ABC):
    @abstractmethod
    def make_sound(self):
        pass

class Dog(Animal):
    def make_sound(self):
        return "Woof"
# Animal()  # TypeError: Can't instantiate abstract class
```

---

6. Advanced Language Features

6.1 Decorators

Decorators modify or enhance functions/classes without changing their code.

```python
def timer(func):
    import time
    def wrapper(*args, **kwargs):
        start = time.time()
        result = func(*args, **kwargs)
        print(f"Time: {time.time() - start:.4f}s")
        return result
    return wrapper

@timer
def slow_function():
    total = sum(range(1000000))
    return total
```

Multiple decorators can be stacked. functools.wraps preserves metadata.

Decorator with arguments:

```python
def repeat(n):
    def decorator(func):
        def wrapper(*args, **kwargs):
            for _ in range(n):
                result = func(*args, **kwargs)
            return result
        return wrapper
    return decorator

@repeat(3)
def greet(name):
    print(f"Hi {name}")
```

6.2 Generators and Iterators

· Iterator: object with __iter__() and __next__().
· Generator: a function that uses yield to produce a sequence lazily.

```python
def countdown(n):
    while n > 0:
        yield n
        n -= 1

gen = countdown(5)
for num in gen:
    print(num)

# generator expression (like list comprehension but lazy)
squares = (x*x for x in range(10))
```

Generators are memory‑efficient for large data streams.

6.3 Context Managers (with statement)

Ensures resources are properly acquired and released.

```python
with open("file.txt", "r") as f:
    content = f.read()
# file automatically closed
```

Custom context manager using a class with __enter__/__exit__, or using contextlib:

```python
from contextlib import contextmanager

@contextmanager
def my_context():
    print("Enter")
    yield
    print("Exit")

with my_context():
    print("Inside")
```

6.4 Type Hinting (Python 3.5+)

Adds static type information for tooling (mypy, IDE). Does not enforce at runtime.

```python
def add(a: int, b: int) -> int:
    return a + b

from typing import List, Dict, Optional, Union, Any, Tuple, Callable
def process(items: List[int]) -> Dict[str, int]:
    ...
```

6.5 Metaclasses

A metaclass is the class of a class; it defines how a class behaves. Default metaclass is type. Custom metaclasses allow you to hook into class creation.

```python
class Meta(type):
    def __new__(cls, name, bases, dct):
        dct['greet'] = lambda self: f"Hello from {name}"
        return super().__new__(cls, name, bases, dct)

class MyClass(metaclass=Meta):
    pass

obj = MyClass()
print(obj.greet())  # Hello from MyClass
```

Usually, class decorators or __init_subclass__ are simpler alternatives.

6.6 *args and **kwargs (review)

· *args collects extra positional arguments into a tuple.
· **kwargs collects extra keyword arguments into a dict.

6.7 dataclasses (Python 3.7+)

Automatically generate __init__, __repr__, __eq__, etc.

```python
from dataclasses import dataclass

@dataclass
class Point:
    x: float
    y: float
    # optional default
    z: float = 0.0

p1 = Point(1.0, 2.0)
p2 = Point(1.0, 2.0)
print(p1 == p2)   # True
```

---

7. Modules and Packages

7.1 Modules

A .py file is a module. Import it:

```python
# mymodule.py
def greet(name):
    return f"Hello, {name}"

# main.py
import mymodule
print(mymodule.greet("Alice"))

from mymodule import greet
print(greet("Bob"))
```

import X runs the module code. Use if __name__ == "__main__": to guard executable code in module.

7.2 Packages

A directory containing __init__.py is a package. Subpackages are nested.

```
mypackage/
    __init__.py
    submodule.py
```

Import: from mypackage.submodule import func.

Namespace packages (Python 3.3+) don't require __init__.py.

7.3 Virtual Environments and pip

Isolate project dependencies:

```bash
python -m venv myenv
source myenv/bin/activate
pip install requests
pip freeze > requirements.txt
pip install -r requirements.txt
```

---

8. File I/O

```python
# Reading
with open("data.txt", "r") as f:
    content = f.read()        # whole file
    # f.readline(), f.readlines(), or iterate over f

# Writing
with open("output.txt", "w") as f:
    f.write("Hello\n")
    f.writelines(["line1\n", "line2\n"])

# Binary mode
with open("image.png", "rb") as f:
    data = f.read()
```

Modes: "r", "w", "a", "r+", "b" for binary, "t" for text (default).

json, csv, pickle for structured data.

JSON

```python
import json
data = {"name": "Alice", "age": 30}
json_str = json.dumps(data, indent=2)
parsed = json.loads(json_str)

with open("data.json", "w") as f:
    json.dump(data, f)
with open("data.json", "r") as f:
    data = json.load(f)
```

---

9. Exception Handling

```python
try:
    result = 10 / 0
except ZeroDivisionError as e:
    print("Error:", e)
except (TypeError, ValueError) as e:
    print("Other error")
else:
    print("No exception")
finally:
    print("Always runs")
```

Raising exceptions:

```python
if x < 0:
    raise ValueError("x must be non-negative")
```

Custom exceptions:

```python
class MyError(Exception):
    def __init__(self, message, code):
        super().__init__(message)
        self.code = code
```

---

10. Concurrency & Parallelism

10.1 Threading

Python threads are limited by the Global Interpreter Lock (GIL) – only one thread executes Python bytecode at a time. Useful for I/O‑bound tasks.

```python
import threading
import time

def worker(n):
    time.sleep(n)
    print(f"Worker {n} done")

t1 = threading.Thread(target=worker, args=(2,))
t1.start()
t2 = threading.Thread(target=worker, args=(1,))
t2.start()
t1.join()
t2.join()
```

For CPU‑bound tasks, use multiprocessing or concurrent.futures.

10.2 concurrent.futures

High‑level interface for thread/process pools.

```python
from concurrent.futures import ThreadPoolExecutor, ProcessPoolExecutor

def square(n):
    return n * n

with ThreadPoolExecutor(max_workers=5) as executor:
    results = executor.map(square, range(10))
# or executor.submit() + Future
```

10.3 Async/Await (Asyncio)

For asynchronous I/O, cooperative multitasking.

```python
import asyncio

async def fetch_data(url):
    print(f"Fetching {url}")
    await asyncio.sleep(1)   # simulate I/O
    return f"Data from {url}"

async def main():
    tasks = [fetch_data("http://example.com"), fetch_data("http://python.org")]
    results = await asyncio.gather(*tasks)
    print(results)

asyncio.run(main())
```

Use async/await for network, file, or database operations to avoid blocking.

---

11. Standard Library Highlights

Python’s “batteries included” library is vast. Key modules:

· os, sys, shutil – OS interactions, command‑line arguments.
· datetime, time, calendar – date/time.
· re – regular expressions.
· math, statistics, decimal, fractions – math.
· random – random numbers.
· collections, itertools, functools – advanced containers and functional tools.
· logging – logging framework.
· argparse – command‑line argument parsing.
· pathlib – object‑oriented file system paths.
· subprocess – run external commands.
· email, http, urllib, requests (3rd party) – networking.
· unittest, pytest (3rd party) – testing.
· sqlite3 – lightweight SQL database.

Example: pathlib

```python
from pathlib import Path
cwd = Path.cwd()
new_file = cwd / "data" / "config.yaml"
if new_file.exists():
    content = new_file.read_text()
```

Example: argparse

```python
import argparse
parser = argparse.ArgumentParser()
parser.add_argument("--name", required=True, help="Your name")
args = parser.parse_args()
print(f"Hello, {args.name}")
```

---

12. Testing

· unittest – built‑in framework inspired by JUnit.
· pytest – modern, concise, extremely popular (3rd party).

```python
# test with pytest (run: pytest test_math.py)
def add(a, b):
    return a + b

def test_add():
    assert add(2,3) == 5
```

Mocking with unittest.mock:

```python
from unittest.mock import MagicMock, patch

@patch("module.function")
def test_func(mock_func):
    mock_func.return_value = 42
    # test code
```

---

13. Best Practices

· Follow PEP 8 style guide.
· Use meaningful variable/function names.
· Keep functions small and single‑purpose.
· Use if __name__ == "__main__" guard.
· Prefer with statements for resource management.
· Use list comprehensions where appropriate for readability.
· Use type hints for clarity and tooling support.
· Write docstrings for public modules/functions/classes.
· Keep imports at the top, grouped (standard library, third party, local).
· Use virtual environments for project isolation.
· Use logging instead of print for production code.
· Write tests.
· Use constants for repeated immutable values.
· Avoid global mutable state; prefer function arguments and returns.

---

14. Common Interview Questions (Language‑Specific)

· What is the difference between a list and a tuple?
· How are arguments passed in Python (pass by object reference)?
· Explain *args and **kwargs.
· What is a decorator? Write one that logs function calls.
· What is the difference between @staticmethod and @classmethod?
· How does garbage collection work in Python? (reference counting + cycle detector)
· What is the Global Interpreter Lock (GIL)? How to work around it?
· Explain the difference between deepcopy and shallow copy.
· What is the purpose of __init__.py?
· How do you manage memory? (automatic, del, gc module)
· Explain context managers and the with statement.
· What are generators and why use them?
· What is the difference between is and ==?
· How to make an object iterable? (__iter__ and __next__)
· What are dataclasses and how do they simplify OOP?
· Describe Python’s method resolution order (MRO).
· How do you handle exceptions? Can you have multiple except blocks?
· What is lambda? When would you use it?
· Explain the map, filter, reduce functions.

---

This guide systematically covers the Python programming language from basic syntax to advanced features. With this knowledge, you’ll be well‑prepared for Python‑specific interview questions and real‑world development.
