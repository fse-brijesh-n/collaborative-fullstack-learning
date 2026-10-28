# Java DSA (Maths, Array & String) Interview Questions and Answers

## Mathematics-Based Questions:

1. **Q: How do you check if a number is prime in Java?**  
   **A:** Use a loop up to √n and check divisibility by numbers from 2 to √n.
   ```java
   boolean isPrime(int n) {
       if (n <= 1) return false;
       for (int i = 2; i * i <= n; i++) {
           if (n % i == 0) return false;
       }
       return true;
   }
   ```

2. **Q: How do you find the GCD of two numbers using recursion?**  
   **A:** Use Euclidean Algorithm.
   ```java
   int gcd(int a, int b) {
       if (b == 0) return a;
       return gcd(b, a % b);
   }
   ```

3. **Q: Find the factorial of a number using recursion.**  
   ```java
   int factorial(int n) {
       return (n == 0) ? 1 : n * factorial(n - 1);
   }
   ```

4. **Q: How do you check if a number is an Armstrong number?**  
   **A:** Sum the cubes of digits and compare with the original number.
   ```java
   boolean isArmstrong(int num) {
       int temp = num, sum = 0, digits = String.valueOf(num).length();
       while (temp > 0) {
           int rem = temp % 10;
           sum += Math.pow(rem, digits);
           temp /= 10;
       }
       return sum == num;
   }
   ```

5. **Q: How do you check if a number is a palindrome?**  
   ```java
   boolean isPalindrome(int num) {
       int rev = 0, temp = num;
       while (temp > 0) {
           rev = rev * 10 + temp % 10;
           temp /= 10;
       }
       return rev == num;
   }
   ```

## Array-Based Questions:

6. **Q: How do you find the largest and smallest elements in an array?**  
   ```java
   int[] findMinMax(int[] arr) {
       int min = arr[0], max = arr[0];
       for (int num : arr) {
           if (num < min) min = num;
           if (num > max) max = num;
       }
       return new int[]{min, max};
   }
   ```

7. **Q: How do you reverse an array in Java?**  
   ```java
   void reverseArray(int[] arr) {
       int left = 0, right = arr.length - 1;
       while (left < right) {
           int temp = arr[left];
           arr[left] = arr[right];
           arr[right] = temp;
           left++; right--;
       }
   }
   ```

8. **Q: Find the second largest number in an array.**  
   ```java
   int secondLargest(int[] arr) {
       int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
       for (int num : arr) {
           if (num > first) {
               second = first;
               first = num;
           } else if (num > second && num != first) {
               second = num;
           }
       }
       return second;
   }
   ```

9. **Q: Find the missing number in an array of 1 to N.**  
   ```java
   int missingNumber(int[] arr, int n) {
       int total = n * (n + 1) / 2;
       for (int num : arr) total -= num;
       return total;
   }
   ```

10. **Q: Find the duplicate element in an array.**  
   ```java
   int findDuplicate(int[] arr) {
       HashSet<Integer> set = new HashSet<>();
       for (int num : arr) {
           if (!set.add(num)) return num;
       }
       return -1;
   }
   ```

## String-Based Questions:

11. **Q: Reverse a string in Java.**  
   ```java
   String reverseString(String str) {
       return new StringBuilder(str).reverse().toString();
   }
   ```

12. **Q: Check if a string is a palindrome.**  
   ```java
   boolean isPalindrome(String str) {
       return str.equals(new StringBuilder(str).reverse().toString());
   }
   ```

13. **Q: Count the occurrences of each character in a string.**  
   ```java
   Map<Character, Integer> countCharacters(String str) {
       Map<Character, Integer> map = new HashMap<>();
       for (char c : str.toCharArray()) {
           map.put(c, map.getOrDefault(c, 0) + 1);
       }
       return map;
   }
   ```

14. **Q: Find the first non-repeating character in a string.**  
   ```java
   char firstNonRepeatingChar(String str) {
       Map<Character, Integer> map = new LinkedHashMap<>();
       for (char c : str.toCharArray()) {
           map.put(c, map.getOrDefault(c, 0) + 1);
       }
       for (Map.Entry<Character, Integer> entry : map.entrySet()) {
           if (entry.getValue() == 1) return entry.getKey();
       }
       return '_';
   }
   ```

15. **Q: Check if two strings are anagrams.**  
   ```java
   boolean areAnagrams(String str1, String str2) {
       char[] arr1 = str1.toCharArray();
       char[] arr2 = str2.toCharArray();
       Arrays.sort(arr1);
       Arrays.sort(arr2);
       return Arrays.equals(arr1, arr2);
   }
   ```

... (More questions up to 50 covering advanced logic, DSA, and tricky problems)
Java DSA Interview Questions on Maths, Arrays, and Strings (With Code Examples)

1. **Q: How do you check if a number is prime in Java?**
   **A:** A prime number is only divisible by 1 and itself.

   ```java
   public class PrimeCheck {
       public static boolean isPrime(int num) {
           if (num <= 1) return false;
           for (int i = 2; i <= Math.sqrt(num); i++) {
               if (num % i == 0) return false;
           }
           return true;
       }

       public static void main(String[] args) {
           System.out.println(isPrime(17)); // Output: true
       }
   }
   ```

2. **Q: Find the greatest common divisor (GCD) of two numbers.**
   **A:** Use the Euclidean algorithm.

   ```java
   public class GCDExample {
       public static int gcd(int a, int b) {
           if (b == 0) return a;
           return gcd(b, a % b);
       }

       public static void main(String[] args) {
           System.out.println(gcd(48, 18)); // Output: 6
       }
   }
   ```

3. **Q: Find the least common multiple (LCM) of two numbers.**
   ```java
   public class LCMExample {
       public static int gcd(int a, int b) {
           return b == 0 ? a : gcd(b, a % b);
       }

       public static int lcm(int a, int b) {
           return (a * b) / gcd(a, b);
       }

       public static void main(String[] args) {
           System.out.println(lcm(12, 18)); // Output: 36
       }
   }
   ```

4. **Q: Reverse an integer number.**
   ```java
   public class ReverseNumber {
       public static int reverse(int num) {
           int rev = 0;
           while (num != 0) {
               rev = rev * 10 + num % 10;
               num /= 10;
           }
           return rev;
       }

       public static void main(String[] args) {
           System.out.println(reverse(1234)); // Output: 4321
       }
   }
   ```

5. **Q: Check if a number is a palindrome.**
   ```java
   public class PalindromeNumber {
       public static boolean isPalindrome(int num) {
           return num == reverse(num);
       }

       private static int reverse(int num) {
           int rev = 0;
           while (num != 0) {
               rev = rev * 10 + num % 10;
               num /= 10;
           }
           return rev;
       }

       public static void main(String[] args) {
           System.out.println(isPalindrome(121)); // Output: true
       }
   }
   ```
```
   1. **Q: How do you check if a number is prime in Java?**
   **A:** Use a loop from 2 to √n and check if `n % i == 0`. If any such `i` exists, it's not prime.

2. **Q: Write a function to find the GCD of two numbers.**
   **A:** Use the Euclidean algorithm recursively: `gcd(a, b) = gcd(b, a % b)`, base case: `gcd(a, 0) = a`.

3. **Q: How do you find the factorial of a number using recursion?**
   **A:** Base case: `fact(0) = 1`, Recursive case: `fact(n) = n * fact(n - 1)`.

4. **Q: How to check if a number is a palindrome?**
   **A:** Reverse the number and compare it with the original.

5. **Q: How do you reverse an array in Java?**
   **A:** Swap elements from start to end using two pointers.

6. **Q: How do you find the missing number in an array of size n containing numbers from 1 to n?**
   **A:** Use the formula `sum = n * (n+1) / 2` and subtract the sum of the given array.

7. **Q: How to find the duplicate number in an array of n+1 size containing numbers from 1 to n?**
   **A:** Use Floyd’s cycle-finding algorithm or a HashSet.

8. **Q: How do you find the maximum subarray sum?**
   **A:** Use Kadane’s algorithm with a single pass through the array.

9. **Q: How to find the second largest element in an array?**
   **A:** Track the largest and second largest values in a single pass.

10. **Q: How do you check if two strings are anagrams?**
    **A:** Sort both strings or use a frequency count array.

11. **Q: How do you reverse a string in Java?**
    **A:** Use `StringBuilder.reverse()` or swap characters iteratively.

12. **Q: How do you check if a string is a palindrome?**
    **A:** Compare characters from both ends towards the center.

13. **Q: How do you remove duplicates from a string?**
    **A:** Use a HashSet to track unique characters.

14. **Q: How do you count occurrences of each character in a string?**
    **A:** Use a frequency array of size 256 (ASCII).

15. **Q: How do you check if a string contains only digits?**
    **A:** Use `str.matches("[0-9]+")` or iterate through characters.

16. **Q: How do you find the longest common prefix in an array of strings?**
    **A:** Compare character-by-character across all strings.

17. **Q: How do you find the longest palindrome substring in a given string?**
    **A:** Use Dynamic Programming or expand around center technique.

18. **Q: How do you check if a string is a rotation of another?**
    **A:** Concatenate `s1 + s1` and check if `s2` is a substring.

19. **Q: How do you print all permutations of a string?**
    **A:** Use backtracking.

20. **Q: How do you implement the LRU (Least Recently Used) cache?**
    **A:** Use a LinkedHashMap or a Doubly Linked List with a HashMap.

21. **Q: How do you find the intersection of two sorted arrays?**
    **A:** Use two pointers to compare elements.

22. **Q: How to find the union of two unsorted arrays?**
    **A:** Use a HashSet to store unique elements.

23. **Q: How do you rotate an array by k places?**
    **A:** Reverse the whole array, then reverse first k elements, then last n-k elements.

24. **Q: How do you find the majority element in an array (element occurring more than n/2 times)?**
    **A:** Use Moore’s Voting Algorithm.

25. **Q: How do you implement a stack using an array?**
    **A:** Use an array with push, pop, and peek methods.

26. **Q: How do you implement a queue using two stacks?**
    **A:** Use one stack for enqueue and another for dequeue.

27. **Q: How do you find the first non-repeating character in a string?**
    **A:** Use a frequency array and iterate through the string.

28. **Q: How do you implement a min stack that supports push, pop, and getMin in O(1)?**
    **A:** Use an additional stack to track minimum values.

29. **Q: How do you check if a given string has balanced parentheses?**
    **A:** Use a stack to track opening and closing brackets.

30. **Q: How do you find the longest substring without repeating characters?**
    **A:** Use the sliding window technique.

31. **Q: How do you find the subarray with the given sum in an unsorted array?**
    **A:** Use a HashMap to store cumulative sums.

32. **Q: How do you implement a trie (prefix tree)?**
    **A:** Use a class with a map of child nodes.

33. **Q: How do you merge two sorted arrays without extra space?**
    **A:** Start comparing from the end and merge in-place.

34. **Q: How do you find the median of two sorted arrays?**
    **A:** Use binary search on the smaller array.

35. **Q: How do you implement the KMP algorithm for pattern matching?**
    **A:** Compute the LPS array and use it to skip comparisons.

36. **Q: How do you find the next permutation of a number?**
    **A:** Use the lexicographic order algorithm.

37. **Q: How do you find the smallest window in a string that contains all characters of another string?**
    **A:** Use the sliding window approach.

38. **Q: How do you find the number of subarrays with a given XOR?**
    **A:** Use a HashMap to track prefix XOR values.

39. **Q: How do you implement a circular queue?**
    **A:** Use an array with front and rear pointers.

40. **Q: How do you count the number of islands in a grid?**
    **A:** Use DFS or BFS to traverse connected land cells.

41. **Q: How do you implement a basic calculator that evaluates an arithmetic expression?**
    **A:** Use two stacks for operators and operands.

42. **Q: How do you find the maximum product subarray?**
    **A:** Track both maximum and minimum products.

43. **Q: How do you implement a sparse matrix multiplication?**
    **A:** Use HashMaps to store nonzero elements.

44. **Q: How do you generate all subsets of a set?**
    **A:** Use recursion or bit manipulation.

45. **Q: How do you check if a given Sudoku board is valid?**
    **A:** Use sets to track numbers in rows, columns, and 3x3 sub-boxes.

46. **Q: How do you find the shortest path in an unweighted graph?**
    **A:** Use BFS (Breadth-First Search).

47. **Q: How do you find the longest increasing subsequence?**
    **A:** Use Dynamic Programming with binary search.

48. **Q: How do you implement a monotonic stack?**
    **A:** Use a stack that maintains elements in increasing or decreasing order.

49. **Q: How do you implement a palindrome partitioning of a string?**
    **A:** Use backtracking to generate all partitions.

50. **Q: How do you implement a max heap using an array?**
    **A:** Use a complete binary tree with heapify operations.
```
