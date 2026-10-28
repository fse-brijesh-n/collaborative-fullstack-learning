Java Ultimate In-Depth Guide: Every Topic Broken Down Exhaustively

This guide dismantles each Java concept to its smallest components, providing exhaustive explanations, code snippets, and internal details. Ideal for interview preparation and deep mastery.

---

1. Java Basics – Complete Dissection

1.1 The main Method – Deep Analysis

```java
public static void main(String[] args)
```

· public – required so the JVM can invoke main from outside the class.
· static – the method belongs to the class, not an instance; the JVM calls it without creating an object.
· void – main cannot return a value to the JVM; use System.exit(int) for status.
· main – exact name mandated by the JVM specification.
· String[] args – command‑line arguments. If no arguments, args is an empty array (length 0), never null.
· Varargs alternative: public static void main(String... args) – internally still an array.
· The main method can be overloaded (e.g., main(int x)), but the JVM only recognizes the standard signature.
· The main method can throw exceptions; uncaught exceptions cause the JVM to print stack trace and terminate.

1.2 Primitive Data Types – Internals

Type Size Range Default Wrapper Class
byte 8 bits -128 to 127 0 Byte
short 16 bits -32,768 to 32,767 0 Short
int 32 bits -2³¹ to 2³¹-1 0 Integer
long 64 bits -2⁶³ to 2⁶³-1 0L Long
float 32 bits ±3.4e-38 to ±3.4e+38 0.0f Float
double 64 bits ±1.7e-308 to ±1.7e+308 0.0d Double
char 16 bits '\u0000' (0) to '\uffff' (65,535) '\u0000' Character
boolean virtual machine dependent true/false false Boolean

· byte and short are promoted to int when used in arithmetic. No unsigned versions in Java (except char which is unsigned).
· float and double follow IEEE 754. Special values: Float.NaN, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY.
· char stores a Unicode character (UTF‑16). Supplementary characters (> U+FFFF) are represented as surrogate pairs (two char values).
· boolean can only be true or false; cannot be cast to int.
· Default values apply only to fields (instance/static). Local variables must be explicitly initialized before use.

1.3 Variables – Deep Dive

· Declaration: int a;
· Initialization: a = 10;
· Combined: int b = 20;
· Final variable: final int MAX = 100; cannot be reassigned after initialization. A blank final (declared without initializer) can be assigned exactly once in constructor.
· Static final variable: conventionally named in uppercase with underscores (MAX_VALUE).
· Transient modifier: transient fields are skipped during serialization.
· Volatile modifier: guarantees visibility across threads; every read sees the most recent write.

1.4 Type Casting – Granular

· Implicit widening (automatic): byte → short → int → long → float → double. Also char → int → long → float → double. No loss of information.
· Explicit narrowing (manual cast): double d = 9.78; int i = (int) d; // i = 9 (truncates decimal).
· Conversion between char and numeric types: allowed only via explicit cast. char c = (char) 65; // 'A'
· Reference type casting: upcasting (implicit) e.g., String to Object; downcasting (explicit) requires instanceof check.
· Pattern matching for instanceof (Java 16): if (obj instanceof String s) { // use s directly }

1.5 Operators – Complete Enumeration

· Arithmetic: +, -, *, /, %. Division by integer zero throws ArithmeticException; by floating‑point zero yields infinity or NaN.
· Relational: ==, !=, <, >, <=, >=. For reference types, == compares references, not content. equals() for logical equality.
· Logical: && (short‑circuit), || (short‑circuit), !. Short‑circuit means the right operand is not evaluated if the result is determined by the left (e.g., false && anything is false).
· Bitwise: & (AND), | (OR), ^ (XOR), ~ (complement). Also non‑short‑circuit logical when applied to booleans.
· Shift: << (left shift, fills with 0), >> (signed right shift, fills with sign bit), >>> (unsigned right shift, fills with 0).
· Assignment: =, +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=, >>>=.
· Increment/Decrement: ++i (pre‑increment), i++ (post‑increment). Same for --.
· Ternary: condition ? expr1 : expr2. Both expressions must be compatible; the result type is determined by the common supertype.
· instanceof: ref instanceof Type. Can check interface implementations. null instanceof Type is always false.
· Lambda ->: not an operator but a token.

1.6 Control Flow – All Constructs

· if / if‑else / if‑else if ladder.
· switch:
  · Traditional switch with case, break, default. Falls through without break.
  · Enhanced switch (Java 14): uses -> (arrow), no fall‑through.
  · Switch expression (Java 14+): returns a value, must be exhaustive (or have default). Can use yield to return from a block.
  ```java
  String result = switch (day) {
      case MON, FRI -> "Weekend soon";
      case TUE -> "Midweek";
      default -> "Other";
  };
  ```
· for loop: for (initialization; condition; update) { } – all parts optional; for(;;) is infinite.
· Enhanced for‑each: for (Type var : iterable) { } works with arrays and Iterable objects.
· while: while (condition) { } zero or more iterations.
· do‑while: do { } while (condition); at least one iteration.
· break: exits the innermost loop or switch; labelled break exits outer block.
· continue: skips current iteration.
· return: exits method, may return a value.
· Labelled statements: label: { ... break label; } – can break out of nested blocks.

1.7 Arrays – Exhaustive

· Declaration:
  ```java
  int[] arr;   // preferred
  int arr2[];  // C‑style, allowed but discouraged
  ```
· Instantiation: arr = new int[5]; – allocates memory, elements initialized to default values.
· Initialization block: int[] arr = {1,2,3,4,5}; – can only be used in the same statement as declaration.
· Anonymous array: new int[] {1,2,3}.
· Length: arr.length (property, not method).
· Indexing: 0‑based; ArrayIndexOutOfBoundsException if invalid.
· Arrays of objects: elements are null initially.
· Multidimensional arrays: array of arrays. int[][] matrix = new int[3][4];. Jagged arrays possible: int[][] jagged = new int[3][]; jagged[0] = new int[2];
· Utility methods in java.util.Arrays: sort(), binarySearch(), fill(), copyOf(), copyOfRange(), equals(), deepEquals(), hashCode(), deepHashCode(), toString(), deepToString(), stream().
· Array to List bridge: List<String> list = Arrays.asList("a","b"); returns a fixed‑size list backed by the array; list.add() throws UnsupportedOperationException.

1.8 Strings – Internals

· Immutability: once created, a String cannot change. All methods return new String objects. This enables string pooling and security.
· String Pool: JVM maintains a pool of unique string literals. Strings created with "literal" are automatically interned. new String("hello") creates a new object (not in pool) unless intern() is called.
· Constructors: String(), String(byte[]), String(char[]), String(String), etc.
· Common methods (each explained):
  · int length()
  · char charAt(int index)
  · int indexOf(int ch) / indexOf(String str) / lastIndexOf
  · String substring(int beginIndex, int endIndex) – begin inclusive, end exclusive.
  · boolean contains(CharSequence s)
  · boolean startsWith(String prefix), endsWith
  · String replace(char oldChar, char newChar), replace(CharSequence, CharSequence), replaceAll(regex, replacement), replaceFirst
  · String[] split(String regex), split(String regex, int limit)
  · String trim() – removes leading/trailing spaces ≤ \u0020. strip() (Java 11) handles Unicode whitespace.
  · String toLowerCase() / toUpperCase()
  · static String valueOf(primitive/object)
  · byte[] getBytes() / getBytes(Charset)
  · char[] toCharArray()
  · String intern()
  · boolean isEmpty() / isBlank() (Java 11, true if empty or only whitespace)
  · Stream<String> lines() (Java 11) – returns a stream of lines.
  · String repeat(int count) (Java 11)
  · String indent(int n) (Java 12) – adjust indentation.
  · String transform(Function<String, R> f) (Java 12)
· StringBuilder (mutable, not thread‑safe, faster):
  ```java
  StringBuilder sb = new StringBuilder();
  sb.append("Hello").append(" ");
  sb.insert(0, "Prefix ");
  sb.delete(0, 5);
  sb.reverse();
  int len = sb.length();
  String result = sb.toString();
  ```
· StringBuffer – same API as StringBuilder but synchronized (thread‑safe). Slower.

1.9 Wrapper Classes – Deep

Each primitive type has a wrapper: Byte, Short, Integer, Long, Float, Double, Character, Boolean.

· Immutability: wrapper objects are immutable once created.
· Autoboxing/Unboxing: automatic conversion between primitive and wrapper by compiler. Integer i = 5; // Integer.valueOf(5); int j = i; // i.intValue(). Performance overhead.
· Caching: Integer caches values -128 to 127 by default (configurable via -XX:AutoBoxCacheMax). Same for Short, Byte, Long, Character (0–127). Boolean has TRUE/FALSE constants.
· Parsing: Integer.parseInt("123") throws NumberFormatException.
· Utility methods: Integer.compare(x,y), Integer.max(x,y), Integer.min(x,y), Integer.sum(x,y).
· Number superclass for numeric wrappers; provides intValue(), longValue(), etc.

1.10 I/O Fundamentals

· java.io package (legacy):
  · Streams: InputStream/OutputStream (byte), Reader/Writer (char).
  · File handling: File class (deprecated in favor of Path).
· java.nio.file (since Java 7):
  · Path interface (immutable, platform‑independent).
  · Files class: readAllLines(), write(), copy(), move(), delete(), createDirectory(), walk().
  · try-with-resources used for BufferedReader, BufferedWriter.
  · Files.newBufferedReader(path), Files.newBufferedWriter(path, options).
  · Files.list(dir), Files.walk(root) returns Stream<Path>.
· Console I/O: System.console().readLine() (for secure password reading), System.in with Scanner.

---

2. Object‑Oriented Programming – Subatomic Breakdown

2.1 Classes and Objects – All Rules

· Class: blueprint. Contains fields, methods, constructors, initializers, nested classes.
· Object: instance of a class created with new.
· Field types:
  · Instance variable: unique to each object.
  · Static (class) variable: shared across all instances.
· Access modifiers: private, default (package‑private), protected, public.
· Method signature: name + parameter types (order matters). Return type not part of signature for overloading.
· Method overloading: same name, different parameter list. Compile‑time polymorphism.
· Method overriding: same signature, covariant return types allowed. Runtime polymorphism. @Override annotation ensures correct override.

2.2 Constructors – Exhaustive

· Default constructor: provided by compiler only if no constructor is written. Takes no arguments, calls super().
· Parameterized constructor: must be explicitly called.
· Constructor overloading: multiple constructors with different parameters.
· this(): calls another constructor of the same class. Must be first statement.
· super(): calls parent constructor. If not explicitly written, compiler inserts super() (no‑arg) automatically. If parent doesn't have a no‑arg constructor, subclass must explicitly call super(args).
· Constructor chaining: ensures parent's constructor runs before subclass.
· Initialization blocks:
  · Instance initializer: { /* code */ } runs each time an object is created, after super() but before constructor body.
  · Static initializer: static { /* code */ } runs once when class is loaded.
· Record constructors (Java 14): canonical constructor auto‑generated; compact constructor for validation.
  ```java
  record Point(int x, int y) {
      Point { // compact constructor
          if (x < 0) throw new IllegalArgumentException();
      }
  }
  ```

2.3 Inheritance – Granular Mechanics

· Single inheritance for classes (extends). A class can implement multiple interfaces.
· super keyword:
  · super.member – access parent's hidden member.
  · super.method() – call overridden method.
  · super(args) – call parent constructor.
· Method overriding rules:
  · Access modifier can be same or wider (e.g., protected → public).
  · Checked exceptions: cannot throw broader checked exceptions than overridden method.
  · Return type: must be same or covariant.
· Hiding: static methods are not overridden; they are hidden. final methods cannot be overridden.
· final class: cannot be extended.
· Upcasting: Parent p = new Child(); – always safe.
· Downcasting: Child c = (Child) p; – requires instanceof check.
· Multiple inheritance of type: via interfaces.
· Virtual method invocation: JVM uses vtable for dynamic dispatch.

2.4 Polymorphism – Every Detail

· Compile‑time (overloading): resolved at compile time based on reference type and parameter list. Return type not considered.
· Runtime (overriding): resolved at runtime based on actual object type.
· Binding: static for private, static, final methods; dynamic for all others.
· Example:
  ```java
  class Animal { void sound() { ... } }
  class Dog extends Animal { @Override void sound() { ... } }
  Animal a = new Dog();
  a.sound(); // Dog's sound called
  ```
· Polymorphic parameters: methods accept parent types.

2.5 Abstraction – Complete

· Abstract class: declared with abstract keyword. Can have abstract methods (no body) and concrete methods. Cannot be instantiated. Can have constructors, fields.
· Abstract method: abstract void draw(); – no body, ends with semicolon.
· Interface: pure abstraction before Java 8. After Java 8, can have default and static methods. Java 9+ allows private methods.
· Marker interface: no methods, e.g., Serializable, Cloneable.
· Functional interface: exactly one abstract method; can be annotated @FunctionalInterface.
· Multiple inheritance via interfaces: resolves diamond problem by requiring class to provide implementation or inheriting default method from most specific interface.

2.6 Encapsulation – Design

· Data hiding: fields private, exposed via public getters/setters.
· Benefits: control validation, loose coupling, maintainability.
· JavaBeans convention: getter getProperty(), setter setProperty(), boolean isProperty().

2.7 Nested Classes – Full Classification

· Static nested class: declared static class Inner. Behaves like a top‑level class nested for packaging. Can access static members of outer class.
· Inner class (non‑static): has implicit reference to an instance of outer class. Cannot have static declarations (except compile‑time constants).
  · To instantiate: Outer.Inner inner = outerObj.new Inner();
· Local class: defined within a method. Can access local variables of method if they are effectively final.
· Anonymous class: expression that defines a class and instantiates it in a single statement.
  ```java
  Runnable r = new Runnable() {
      public void run() { ... }
  };
  ```
· Shadowing: if inner and outer have same variable name, use Outer.this.var.

2.8 Enums – All Capabilities

· Declaration: enum Day { MON, TUE, WED }
· Implicitly extends java.lang.Enum.
· Can have fields, methods, constructors (always private).
· Abstract methods in enum constants (constant‑specific class body):
  ```java
  enum Operation {
      PLUS { double apply(double x, double y) { return x + y; } },
      MINUS { double apply(double x, double y) { return x - y; } };
      abstract double apply(double x, double y);
  }
  ```
· Compiler generates values() (returns array of all constants) and valueOf(String).
· Switch over enum: all cases must be qualified enum constant names.
· EnumMap, EnumSet – optimized collections.

2.9 Records (Java 14+) – Anatomy

· record Point(int x, int y) {}
· Automatically provides:
  · private final fields for each component.
  · Canonical constructor.
  · Getter methods named x(), y() (without get prefix).
  · equals(), hashCode(), toString() implementations.
· Can define compact constructor for validation:
  ```java
  record Range(int lo, int hi) {
      Range {
          if (lo > hi) throw new IllegalArgumentException();
      }
  }
  ```
· Can add instance methods, static fields, static methods.
· Cannot extend other classes (already extends Record), can implement interfaces.

2.10 Sealed Classes (Java 17) – Exhaustive Control

· sealed class Shape permits Circle, Rectangle, Triangle { }
· Subclasses must be final, sealed, or non-sealed.
· Sealed interfaces work similarly.
· Useful for exhaustive pattern matching in switch.

2.11 this and super Detailed

· this can be used to return the current instance (return this;) for method chaining.
· this in constructor to call another constructor.
· super can be used to access parent methods hidden by overriding.
· super cannot be used in a static context.

2.12 final, finally, finalize – Distinction

· final: class (no subclass), method (no override), variable (constant).
· finally: block in exception handling.
· finalize(): method called by GC (deprecated in Java 9, removed in Java 18).

---

3. Collections Framework – Deep Internal Mechanics

3.1 Collection Interface Hierarchy

```
Iterable
  └── Collection
       ├── List
       ├── Set (no duplicates)
       └── Queue
Map (separate)
```

3.2 List Implementations – Inside Out

ArrayList

· Backed by a dynamic array (Object[] elementData).
· Default initial capacity: 10 (or specify).
· Grow: when full, new capacity = oldCapacity + (oldCapacity >> 1) (~1.5x). Array copy.
· add(E) amortized O(1); worst‑case O(n) due to resize.
· get(int) O(1); set(int, E) O(1); remove(int) O(n) (shift elements).
· Implements RandomAccess marker.
· Not thread‑safe; use Collections.synchronizedList() or CopyOnWriteArrayList.

LinkedList

· Doubly‑linked list.
· Each node has prev, next, item.
· add(E) O(1); get(int) O(n); remove(int) O(n).
· Implements Deque, so can be used as queue or stack.
· Memory overhead per element due to node objects.

Vector and Stack

· Vector is synchronized (legacy). Uses synchronized methods.
· Stack extends Vector (LIFO). Use ArrayDeque instead.

3.3 Set Implementations – Under the Hood

HashSet

· Backed by a HashMap: elements are keys, value is a dummy PRESENT object.
· add(E) → map.put(e, PRESENT) == null (returns null if new).
· Constant time O(1) average; worst‑case O(n) if many collisions.
· Allows null (one null element).
· Not ordered; LinkedHashSet preserves insertion order via a doubly‑linked list running through entries.
· TreeSet uses TreeMap (Red‑Black tree), O(log n), sorted by natural order or comparator.

3.4 Map Implementations – Deep

HashMap

· Array of Node<K,V> (linked list) buckets.
· Hash of key determines bucket index: index = (n - 1) & hash (n = table length, power of two).
· Collision resolution: chaining (linked list). When bucket size >= TREEIFY_THRESHOLD (8) and overall capacity >= MIN_TREEIFY_CAPACITY (64), bucket converted to balanced tree (Red‑Black).
· Load factor: default 0.75. When size > capacity * load factor, rehashing doubles table size.
· Java 8+ introduced tree bins to improve worst‑case O(log n) for collisions.
· null key allowed (stored at bucket 0).
· Not thread‑safe.

LinkedHashMap

· Extends HashMap; maintains a doubly‑linked list through entries for predictable iteration order (insertion‑order by default, or access‑order if accessOrder=true).
· Useful for LRU caches: override removeEldestEntry to evict oldest.

TreeMap

· Red‑Black tree; entries sorted by key's natural order or comparator.
· O(log n) for get, put, remove.
· Implements NavigableMap, provides firstKey(), lastKey(), subMap(), etc.

WeakHashMap

· Entries are weakly referenced; key collected by GC if no strong reference → entry removed.
· Useful for canonicalizing mappings (e.g., string interning).

IdentityHashMap

· Uses reference equality (==) instead of .equals() for keys. Uses linear probing, not chaining.

ConcurrentHashMap

· Thread‑safe without synchronizing whole map.
· Uses lock‑striping: divides map into segments, each locked independently.
· In Java 8+, uses CAS and synchronized blocks on bucket head only if necessary.
· putIfAbsent, computeIfAbsent, etc.
· Does not allow null keys or values.
· Iterators are weakly consistent (fail‑safe).

3.5 Queue and Deque

· Queue: offer(e), poll(), peek() – return special value on failure (null/false). add(e), remove(), element() throw exceptions.
· Deque: addFirst(e), addLast(e), pollFirst(), pollLast(), etc.
· ArrayDeque: circular array, no capacity restrictions (except memory). Faster than LinkedList for stack/queue.
· PriorityQueue: unbounded, based on priority heap (min‑heap by default). Elements ordered by natural order or comparator. poll() removes the smallest. O(log n) insertion/removal.

3.6 Iterators and Enumerations

· Iterator<E>: hasNext(), next(), remove() (optional). forEachRemaining(Consumer).
· ListIterator<E>: extends Iterator, adds hasPrevious(), previous(), nextIndex(), previousIndex(), set(E), add(E).
· Fail‑fast: throws ConcurrentModificationException if collection structurally modified after iterator creation (except through iterator’s own methods). Achieved by a modCount field; iterator records expected count, checks on each access.
· Enumeration (legacy) replaced by Iterator.

3.7 Comparable and Comparator

· Comparable: defines natural ordering. compareTo(T o) returns negative, zero, positive.
· Comparator: compare(T o1, T o2). Additional static methods: comparing(), thenComparing(), nullsFirst(), nullsLast(), reverseOrder().
· Consistency with equals: natural ordering should be consistent with equals if possible (e.g., BigDecimal is inconsistent).

3.8 Collections Utility Class

· sort(List) / sort(List, Comparator)
· binarySearch(List, key) – list must be sorted.
· reverse(List), shuffle(List), fill(List, elem), copy(dest, src)
· min(Collection), max(Collection)
· synchronizedCollection(Collection), synchronizedList, etc. – returns thread‑safe wrapper.
· unmodifiableCollection(Collection) – returns read‑only view.
· frequency(Collection, Object), disjoint(Collection, Collection)

3.9 Concurrent Collections Details

· CopyOnWriteArrayList: snapshot‑based; every mutative operation (add, set, remove) creates a new copy of the underlying array. Efficient for iteration (read‑heavy) but expensive writes. Iterator never throws ConcurrentModificationException.
· BlockingQueue: ArrayBlockingQueue (bounded, FIFO), LinkedBlockingQueue (optionally bounded), PriorityBlockingQueue (unbounded, min‑heap). put() blocks if full; take() blocks if empty; offer() and poll() with timeout.

---

4. Stream API – Microscopic Details

4.1 Stream Creation

· From collections: collection.stream(), collection.parallelStream()
· From arrays: Arrays.stream(array)
· From values: Stream.of(T... values)
· Infinite streams: Stream.iterate(seed, UnaryOperator), Stream.generate(Supplier)
· From I/O: Files.lines(path) returns Stream<String>
· Primitive streams: IntStream, LongStream, DoubleStream with analogous methods.
· Builder pattern: Stream.builder(). add() items then build().

4.2 Intermediate Operations – Each in Detail

· filter(Predicate): returns stream of elements satisfying predicate.
· map(Function): transforms each element.
· flatMap(Function): each element replaced by a stream of elements, then flattened.
· distinct(): uses .equals() and .hashCode() (stateful intermediate).
· sorted() / sorted(Comparator): stateful, requires full pass.
· peek(Consumer): mainly for debugging; allows performing action on each element without consuming.
· limit(long maxSize): truncates stream.
· skip(long n): discards first n elements.
· takeWhile(Predicate) (Java 9): takes elements as long as predicate true, then stops.
· dropWhile(Predicate) (Java 9): drops elements while predicate true, then returns remaining.
· ofNullable(T) (Java 9): returns a stream of one element if non‑null, else empty stream.

4.3 Terminal Operations – Each Explained

· forEach(Consumer): not order‑guaranteed for parallel streams. Use forEachOrdered for order.
· toArray(IntFunction): String[] arr = stream.toArray(String[]::new);
· reduce(identity, BinaryOperator) or reduce(BinaryOperator): fold operation.
  ```java
  int sum = stream.reduce(0, Integer::sum);
  Optional<Integer> optSum = stream.reduce(Integer::sum);
  ```
· collect(Collector): most versatile.
· min(Comparator), max(Comparator): returns Optional.
· count(): returns long.
· anyMatch(Predicate), allMatch, noneMatch: short‑circuiting.
· findFirst(), findAny(): returns Optional.

4.4 Collectors – All Transformations

· toList(), toSet(), toCollection(Supplier)
· joining(), joining(CharSequence delimiter)
· toMap(keyMapper, valueMapper) / with merge function.
· groupingBy(classifier): returns Map<K, List<V>>. Can specify downstream collector: groupingBy(classifier, toSet()), counting(), summingInt(), etc.
· partitioningBy(Predicate): returns Map<Boolean, List<V>>.
· summarizingInt/ToLong/Double: returns summary statistics.
· reducing(identity, op)
· collectingAndThen(Collector, Function): apply a finishing transformation.
· teeing(Collector, Collector, BiFunction) (Java 12): combines results of two collectors.

4.5 Parallel Streams – Mechanics

· Obtain via parallelStream() or stream().parallel().
· Uses Fork‑Join common pool (ForkJoinPool.commonPool()). Custom pool possible but not trivial.
· Performance considerations: overhead of splitting, thread coordination. Only beneficial for large data sets and CPU‑intensive operations.
· Stateful intermediate operations (like distinct, sorted, limit) may degrade parallelism.

4.6 Primitive Streams Specializations

· IntStream, LongStream, DoubleStream provide sum(), average(), range(), rangeClosed().
· Mapping to primitives: mapToInt(ToIntFunction), etc.
· Boxing: boxed() returns Stream<Integer>.

4.7 Optional – Methods

· get() – throws NoSuchElementException if empty.
· isPresent(), ifPresent(Consumer), ifPresentOrElse(Consumer, Runnable) (Java 9)
· or(Supplier<Optional>) (Java 9): returns another Optional if empty.
· orElse(T other), orElseGet(Supplier), orElseThrow(Supplier) (Java 10).
· filter(Predicate), map(Function), flatMap(Function) return Optional.

---

5. Exception Handling – Complete Anatomy

5.1 Exception Class Hierarchy

```
Throwable
├── Error (VirtualMachineError, OutOfMemoryError, StackOverflowError)
│       └── not meant to be caught, indicates fatal problems.
└── Exception
    ├── RuntimeException (NullPointerException, IndexOutOfBoundsException, IllegalArgumentException)
    │       └── unchecked – compiler does not force handling.
    └── Checked Exception (IOException, SQLException)
            └── must be caught or declared with `throws`.
```

5.2 Try-Catch-Finally Mechanics

· try block must be followed by at least one catch or finally.
· Multiple catch blocks: order from most specific to general.
· Multi‑catch (Java 7): catch (IOException | SQLException e) – variables must be effectively final.
· finally always executes unless System.exit() or JVM crash. If finally also throws an exception, original exception suppressed (added as suppressed exception in Java 7).

5.3 Try-with-Resources (Java 7)

· Resources implement AutoCloseable (or Closeable).
· Declare and initialize resources in try parentheses.
· Closing order: reverse of initialization.
· Suppressed exceptions: if both main and close throw, the close exception is suppressed and attached to the main exception.
· Java 9+: effectively final variables can be used.

```java
BufferedReader br = new BufferedReader(...);
try (br) { ... }
```

5.4 Throw and Throws

· throw new ExceptionType("message") – instantiate and throw.
· throws in method signature declares checked exceptions.
· When overriding, the overriding method can throw fewer or narrower checked exceptions, or none.

5.5 Custom Exceptions

· Extend Exception (checked) or RuntimeException (unchecked).
· Add constructors, serial version UID (optional but recommended).

```java
class MyException extends Exception {
    public MyException(String msg) { super(msg); }
    public MyException(String msg, Throwable cause) { super(msg, cause); }
}
```

5.6 Stack Traces and Chaining

· printStackTrace() prints to System.err.
· getStackTrace() returns array of StackTraceElement.
· Exception chaining: pass cause to constructor new Exception("msg", cause). Retrieve with getCause().

5.7 Best Practices

· Catch specific exceptions.
· Never catch Throwable/Error unless for logging and rethrow.
· Don’t swallow exceptions with empty catch.
· Log and rethrow or wrap with context.

---

6. Multithreading & Concurrency – Granular

6.1 Thread Creation and Lifecycle

· Thread class: extend Thread, override run(). Call start().
· Runnable interface: pass to Thread constructor. More flexible.
· Lifecycle states: NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, TERMINATED.
· join(): wait for thread to die.
· sleep(long millis) – static, puts current thread to sleep.
· yield() – hint to scheduler.
· interrupt() – sets interrupt flag; isInterrupted() and Thread.interrupted() (clears flag).

6.2 Synchronization and Intrinsic Locks

· Every object has an intrinsic monitor.
· synchronized method locks this (for static methods, locks Class object).
· synchronized(lock) block. Lock release even if exception.
· Reentrancy: a thread can acquire the same lock multiple times.
· wait(), notify(), notifyAll() – must be called inside synchronized. Releases lock and waits.
· Spurious wakeup: always wait inside loop with condition.

6.3 java.util.concurrent.locks

· ReentrantLock: explicit lock with lock(), unlock(); supports fairness (new ReentrantLock(true)), tryLock(), lockInterruptibly(), newCondition() for Condition objects.
· ReentrantReadWriteLock: separate read/write locks. Multiple readers, exclusive writer.
· StampedLock: optimistic read; higher throughput.

6.4 Executors Framework – All Details

· Executor: interface with execute(Runnable).
· ExecutorService: adds submit(), invokeAll(), invokeAny(), shutdown(), shutdownNow().
· ThreadPoolExecutor: core pool size, maximum pool size, keep‑alive time, work queue (ArrayBlockingQueue, LinkedBlockingQueue, SynchronousQueue).
· ScheduledThreadPoolExecutor: schedule tasks with delay or period.
· ForkJoinPool: for recursive tasks, work‑stealing algorithm.
· Executors factory: newFixedThreadPool, newCachedThreadPool, newSingleThreadExecutor, newScheduledThreadPool.

6.5 Callable and Future – Contract

· Callable<V>: V call() throws Exception.
· Future<V>: get() blocks until result available; get(timeout, unit); cancel(boolean mayInterruptIfRunning); isDone(), isCancelled().

6.6 CompletableFuture – Asynchronous Programming

· Implements Future and CompletionStage.
· supplyAsync(Supplier), runAsync(Runnable).
· thenApply, thenAccept, thenRun – synchronous continuation.
· thenCompose (flat map), thenCombine, thenAcceptBoth, allOf, anyOf.
· Exception handling: exceptionally, handle, whenComplete.
· complete(value) to manually complete.

6.7 Fork/Join Framework – Work‑Stealing

· ForkJoinPool creates worker threads with deques.
· Tasks: RecursiveTask<V> (return value), RecursiveAction (void).
· fork() schedules asynchronously, join() waits and gets result.
· The compute() method implements divide‑and‑conquer.

6.8 Atomic Variables and CAS

· Classes: AtomicInteger, AtomicLong, AtomicBoolean, AtomicReference, and array versions.
· Methods: get(), set(), compareAndSet(expected, update), getAndAdd(int), incrementAndGet().
· Uses optimistic locking (CAS instructions).

6.9 ThreadLocal – Per‑Thread Data

· ThreadLocal<T> provides each thread its own variable.
· initialValue() overridden to provide initial value; or ThreadLocal.withInitial(Supplier).
· get(), set(T), remove().
· Use cases: user sessions, transactions, date formatters.
· Memory leak risk: use remove() after use, especially when using thread pools.

6.10 Virtual Threads (Java 21)

· Lightweight threads managed by JVM; not tied 1‑to‑1 with OS threads.
· Created via Thread.ofVirtual().start(task) or Executors.newVirtualThreadPerTaskExecutor().
· Blocking operations (I/O, sleep) do not occupy carrier threads; they are mounted/unmounted.
· Enables high‑throughput concurrent applications without reactive programming.
· Limitations: not suitable for CPU‑bound tasks that never block.

6.11 Structured Concurrency (Preview)

· StructuredTaskScope to manage a group of related concurrent tasks as a unit.
· Subtypes: ShutdownOnFailure, ShutdownOnSuccess.
· Ensures all subtasks complete (or fail) before parent scope exits.
· Cleaner error propagation and resource management.

6.12 Wait/Notify/NotifyAll – Classic Inter‑thread Communication

· Must hold object’s monitor (synchronized).
· wait() causes thread to wait until notified; releases lock.
· notify() wakes one waiting thread; notifyAll() wakes all.
· Always use while loop to re‑check condition (spurious wakeup).

6.13 Deadlock, Livelock, Starvation

· Deadlock: two or more threads waiting for each other’s locks indefinitely.
· Livelock: threads are active but unable to make progress because they constantly respond to each other.
· Starvation: thread unable to gain regular access to shared resources.

---

7. Servlets – Exhaustive

7.1 Servlet API Overview

· javax.servlet package (now jakarta.servlet after Jakarta EE 9).
· Interfaces: Servlet, ServletRequest, ServletResponse, Filter, ServletConfig, ServletContext.

7.2 HttpServlet Lifecycle

· init(): called once; ServletConfig passed. Override init(ServletConfig) or better init().
· service(ServletRequest, ServletResponse): dispatches to doGet, doPost, etc. based on request method.
· destroy(): called before servlet is unloaded.

7.3 Request Handling Details

· HttpServletRequest:
  · getParameter("name") – returns query string or form data.
  · getParameterValues("name") – for multiple values.
  · getParameterMap() – returns Map<String, String[]>.
  · getHeader("User-Agent"), getHeaders(), getHeaderNames().
  · getCookies() returns Cookie[].
  · getSession(boolean create) – obtains HttpSession.
  · setAttribute() / getAttribute() – request‑scoped attributes.
  · getRequestDispatcher(path).forward(req, res) or include.
  · getInputStream() / getReader() for body.

7.4 Response Handling

· HttpServletResponse:
  · setContentType("text/html;charset=UTF-8")
  · setStatus(int) e.g., SC_NOT_FOUND.
  · sendRedirect(String location) – 302 redirect.
  · addCookie(Cookie)
  · getWriter() returns PrintWriter for character output.
  · getOutputStream() returns ServletOutputStream for binary.

7.5 Session Tracking

· Cookies: new Cookie("key", "value"). Set maxAge in seconds (setMaxAge(3600)). response.addCookie(cookie).
· URL Rewriting: response.encodeURL(url) / encodeRedirectURL appends ;jsessionid=... if cookies disabled.
· HttpSession:
  · session.setAttribute("user", user);
  · session.getAttribute("user")
  · session.removeAttribute("user")
  · session.invalidate() – destroys session.
  · session.setMaxInactiveInterval(seconds) – inactivity timeout.
  · Session tracking ID sent as cookie (JSESSIONID).

7.6 Filters

· Interface Filter with init(FilterConfig), doFilter(ServletRequest, ServletResponse, FilterChain), destroy().
· Can modify request/response headers, log, compress, authenticate.
· FilterChain.doFilter() passes to next filter or target servlet.
· Configured with annotations @WebFilter(urlPatterns = "/*") or in web.xml.

7.7 Listeners

· ServletContextListener: contextInitialized / contextDestroyed.
· HttpSessionListener: sessionCreated / sessionDestroyed.
· ServletRequestListener: requestInitialized / requestDestroyed.
· Configure with @WebListener or in web.xml.

7.8 Annotations vs Deployment Descriptor

· Annotations (since Servlet 3.0): @WebServlet, @WebFilter, @WebListener.
· web.xml still usable; metadata‑completion if metadata-complete="true" disables annotation scanning.

7.9 Asynchronous Processing (Servlet 3.0+)

· startAsync() returns AsyncContext. asyncContext.dispatch() or complete().
· @WebServlet(asyncSupported = true).
· Enables long‑lived connections without blocking server threads.

---

8. JSP (Java Server Pages) – In Depth

8.1 JSP Lifecycle Phases

1. Translation: JSP file → servlet source code.
2. Compilation: servlet class compiled.
3. Loading: class loaded.
4. Instantiation: object created.
5. Initialization (jspInit())
6. Request processing (_jspService())
7. Destroy (jspDestroy())

8.2 JSP Elements

· Directives: <%@ page ... %>, <%@ include file="..." %>, <%@ taglib ... %>.
· Declarations: <%! int count = 0; %> – instance variable/method.
· Expressions: <%= new java.util.Date() %> – output.
· Scriptlets: <% code %> – discouraged in modern code.
· Comments: <%-- hidden --%> (not sent to client); HTML <!-- visible -->.

8.3 Implicit Objects

· request (HttpServletRequest), response (HttpServletResponse)
· out (JspWriter), session (HttpSession), application (ServletContext)
· config (ServletConfig), pageContext (PageContext), page (this servlet)
· exception (only in error pages)

8.4 Expression Language (EL)

· Syntax: ${expression}
· Access scoped attributes: ${sessionScope.user.name}
· Implicit objects: param, paramValues, header, headerValues, cookie, initParam, pageScope, requestScope, sessionScope, applicationScope.
· Operators: arithmetic, relational, logical, empty, [] and . for property access.
· Functions: custom EL functions via TLD.

8.5 JSTL (JSP Standard Tag Library)

· Core: c:out, c:set, c:remove, c:if, c:choose/c:when/c:otherwise, c:forEach, c:forTokens, c:import, c:redirect, c:url, c:catch.
· Formatting: fmt:formatDate, fmt:formatNumber.
· SQL, XML tags (rarely used directly).

8.6 MVC Implementation

· Controller (Servlet) extracts parameters, invokes business logic (model), sets attributes, forwards to JSP (view).
· RequestDispatcher.forward() vs sendRedirect(): forward server‑side, URL unchanged; redirect client‑side, new request.

---

9. WebSockets in Java – Complete

9.1 JSR 356 (Java API for WebSocket)

· Server endpoint: @ServerEndpoint("/path")
· Client endpoint: @ClientEndpoint
· Lifecycle methods: @OnOpen, @OnClose, @OnError, @OnMessage.
· Session object to communicate: session.getBasicRemote().sendText(msg) (synchronous), getAsyncRemote().sendText(msg) (async).

9.2 Message Types

· Text messages: String, Reader.
· Binary messages: byte[], ByteBuffer, InputStream.
· Pong messages: handled automatically.
· Custom decoders/encoders: implement Decoder.Text, Encoder.Binary, etc.

9.3 Server Endpoint Example with Multiple Clients

```java
@ServerEndpoint("/chat")
public class ChatEndpoint {
    private static Set<Session> clients = Collections.synchronizedSet(new HashSet<>());
    @OnOpen public void onOpen(Session session) { clients.add(session); }
    @OnMessage public void onMessage(String message, Session sender) {
        clients.stream().filter(s -> s.isOpen() && !s.equals(sender))
                .forEach(s -> s.getAsyncRemote().sendText(message));
    }
    @OnClose public void onClose(Session session) { clients.remove(session); }
}
```

9.4 Client API

```java
WebSocketContainer container = ContainerProvider.getWebSocketContainer();
Session session = container.connectToServer(MyClientEndpoint.class, URI.create("ws://example.com/chat"));
session.getBasicRemote().sendText("Hello");
```

9.5 Spring WebSocket Support

· @EnableWebSocket in configuration.
· WebSocketHandler interface or TextWebSocketHandler/BinaryWebSocketHandler.
· STOMP sub‑protocol with SimpMessagingTemplate for publish‑subscribe.

---

10. Java Version Features – Complete Chronological Breakdown

Java 8 (LTS) – March 2014

Lambda Expressions
(parameters) -> expression or { statements; }
Functional interfaces: Predicate, Consumer, Function, Supplier.
Stream API – as covered.
Default Methods – default keyword in interfaces to provide method body.
Static Methods in Interfaces
java.time – LocalDate, LocalTime, LocalDateTime, ZonedDateTime, Instant, Duration, Period.
Optional
CompletableFuture
Method References – Class::method
Repeating Annotations – allow same annotation multiple times with @Repeatable.
Type Annotations – annotations on any type use (@NonNull).
Nashorn JavaScript Engine (deprecated later).
Base64 encoding/decoding – java.util.Base64.
Parallel array sorting Arrays.parallelSort().

Java 9 – September 2017

Java Platform Module System (Project Jigsaw)

· module-info.java – exports, requires, provides, uses.
  JShell – interactive REPL.
  Private methods in interfaces – for sharing code between default methods.
  Immutable collection factory methods – List.of(), Set.of(), Map.of(), Map.ofEntries().
  Stream improvements – takeWhile(), dropWhile(), iterate(), ofNullable().
  Optional improvements – ifPresentOrElse(), or(), stream().
  Reactive Streams API – java.util.concurrent.Flow with Publisher, Subscriber, Subscription, Processor.
  Multi‑release JARs – Multi-Release: true in MANIFEST.MF.
  Process API updates – ProcessHandle.
  Enhanced @Deprecated – since, forRemoval.
  HTTP/2 Client (incubator) – later standardized in Java 11.
  GC improvements – G1 default, compact strings.

Java 10 – March 2018

Local‑variable type inference – var for local variables only.
Optional.orElseThrow() (no‑arg).
Collectors.toUnmodifiableList/Set/Map() – truly unmodifiable collections.
G1 parallel full GC.
Application Class‑Data Sharing – improves startup.
Time‑based release versioning (new scheme: $FEATURE.$INTERIM.$UPDATE.$PATCH).

Java 11 (LTS) – September 2018

New HTTP Client – java.net.http.HttpClient, HttpRequest, HttpResponse with async and HTTP/2 support.
String methods – isBlank(), lines(), strip(), stripLeading(), stripTrailing(), repeat().
Files.readString(Path) / writeString() – convenient file I/O.
Launch single‑file source – java MyScript.java.
Epsilon GC (no‑op).
ZGC (experimental).
Removed Java EE and CORBA modules – java.xml.ws, java.xml.bind, etc.
Collection.toArray(IntFunction) added.
Predicate.not().
Optional.isEmpty().

Java 12 – March 2019

Switch expressions (preview) – arrow syntax, multiple labels per case.
Collectors.teeing() – merge results from two collectors.
String.indent(n) – adjust indentation.
String.transform(Function) – apply function to string.
JVM Constants API – java.lang.constant.
Shenandoah GC (experimental).
Microbenchmark Suite (JMH) updates.

Java 13 – September 2019

Text blocks (preview) – multi‑line strings with """.
Switch expressions (second preview) – yield keyword.
Dynamic CDS Archives – improve application startup.
FileSystems.newFileSystem(Path, Map) enhancements.
ZGC: uncommit unused memory.

Java 14 – March 2020

Switch expressions (standard) – arrow syntax and yield.
Pattern matching for instanceof (preview) – if (obj instanceof String s) { ... }.
Records (preview) – record Point(int x, int y) {}.
Text blocks (standard) – final, \ line continuation, \s space.
Helpful NullPointerException messages – JVM pinpoints null variable.
Foreign‑Memory Access API (incubator).
Packaging Tool (incubator) – jpackage.

Java 15 – September 2020

Sealed classes (preview) – sealed, permits, non‑sealed.
Hidden classes – dynamic runtime class generation.
ZGC: production ready.
Text blocks (final).
Edwards‑Curve Digital Signature Algorithm (EdDSA).
CharSequence.isEmpty() ? (no – it existed before).
Reimplementation of Legacy DatagramSocket API.

Java 16 – March 2021

Records (standard).
Pattern matching for instanceof (standard).
Sealed classes (second preview).
Foreign Linker API (incubator) – C linking.
Vector API (incubator).
Elastic Metaspace – faster return of unused class metadata memory.
Unix‑domain socket channels.
Stream.toList() – convenient terminal operation.

Java 17 (LTS) – September 2021

Sealed classes (standard).
Pattern matching for switch (preview).
Enhanced pseudo‑random number generators – new RandomGenerator interface, RandomGeneratorFactory.
Foreign Function & Memory API (incubator).
Deprecate Security Manager for removal.
Removal of AOT and RMI activation.
InstantSource interface.
HexFormat class.

Java 18 – March 2022

UTF‑8 by default – Charset.defaultCharset().
Simple web server – jwebserver command.
@snippet tag for JavaDoc – inline code snippets.
Vector API (third incubator).
Internet‑Address resolution SPI.
Foreign Function & Memory API (second incubator).

Java 19 – September 2022

Virtual threads (preview) – Thread.ofVirtual().
Pattern matching for switch (third preview).
Record patterns (preview) – deconstruct records in pattern matching.
Foreign Function & Memory API (preview).
Vector API (fourth incubator).
Structured concurrency (incubator) – StructuredTaskScope.

Java 20 – March 2023

Virtual threads (second preview).
Scoped values (incubator) – sharing data across threads.
Record patterns (second preview).
Pattern matching for switch (fourth preview).
Foreign Function & Memory API (second preview).

Java 21 (LTS) – September 2023

Virtual threads (final).
Pattern matching for switch (final).
Record patterns (final).
Sequenced collections – SequencedCollection, SequencedSet, SequencedMap; methods addFirst(), addLast(), getFirst(), getLast(), reversed().
String templates (preview) – STR."Hello \{name}".
Scoped values (final).
Structured concurrency (preview).
Foreign Function & Memory API (third preview).
Unnamed patterns and variables (preview) – _ to ignore.
Unnamed classes and instance main methods (preview) – simplify beginner programs.

---

This exhaustive document covers every major Java topic broken down to its most granular elements. Use it as your ultimate reference and interview preparation tool.
