Data Structures & Algorithms – Complete Guide (C++ & Java) with All 27 Patterns

This guide covers everything from fundamental data structures and algorithms to all 27 coding interview patterns. Each topic includes explanations, complexities, and implementations in both C++ and Java.

---

1. Introduction & Complexity Analysis

Data Structure – a way of organizing data to enable efficient operations.
Algorithm – a step-by-step procedure to solve a problem.

Complexity

· Time Complexity: how runtime grows with input size n.
· Space Complexity: extra memory used.

Big-O Notation (worst-case):

Complexity Examples
O(1) array access
O(log n) binary search
O(n) linear search
O(n log n) merge sort
O(n²) bubble sort
O(2ⁿ) subsets
O(n!) permutations

Aim for the lowest possible time and space.

---

2. Arrays & Strings

Arrays

Contiguous memory. Access O(1), search O(n), insert/delete at end O(1) (amortized), in middle O(n).

C++

```cpp
vector<int> v = {1,2,3};
v.push_back(4);
int x = v[0];
for (int i : v) { ... }
```

Java

```java
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
list.add(4);
int x = list.get(0);
for (int i : list) { ... }
```

2D arrays:

```cpp
vector<vector<int>> mat(rows, vector<int>(cols, 0));
```

```java
int[][] mat = new int[rows][cols];
```

Strings

C++

```cpp
string s = "hello";
s += " world";
int len = s.length();
string sub = s.substr(1,3);
if (s.find("lo") != string::npos) { ... }
```

Java

```java
String s = "hello";
StringBuilder sb = new StringBuilder("hello");
sb.append(" world");
int len = sb.length();
String sub = sb.substring(1,4);
if (sb.indexOf("lo") != -1) { ... }
```

---

3. Linked Lists

Singly Linked List

Node:

```cpp
struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(nullptr) {}
};
```

```java
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
```

Operations:

· Insert/Delete at head O(1)
· Search O(n)
· Reverse (iterative)

Reverse a linked list:

```cpp
ListNode* reverse(ListNode* head) {
    ListNode *prev = nullptr, *curr = head, *next;
    while (curr) {
        next = curr->next;
        curr->next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
}
```

```java
ListNode reverse(ListNode head) {
    ListNode prev = null, curr = head, next;
    while (curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
}
```

Doubly Linked List

Node with prev and next.

Circular Linked List

Tail points to head.

---

4. Stacks & Queues

Stack (LIFO)

C++

```cpp
stack<int> stk;
stk.push(5);
int top = stk.top(); stk.pop();
```

Java

```java
Stack<Integer> stk = new Stack<>();
stk.push(5);
int top = stk.peek(); stk.pop();
// or Deque<Integer> stk = new ArrayDeque<>();
```

Queue (FIFO)

C++

```cpp
queue<int> q;
q.push(1);
int f = q.front(); q.pop();
```

Java

```java
Queue<Integer> q = new LinkedList<>();
q.add(1);
int f = q.peek(); q.poll();
```

Deque (double-ended):

```cpp
deque<int> dq;
dq.push_back(1); dq.push_front(2);
```

```java
Deque<Integer> dq = new ArrayDeque<>();
dq.addFirst(1); dq.addLast(2);
```

---

5. Hash Tables & Maps

Average O(1) for insert/search/delete. Unordered with hashing.

C++

```cpp
unordered_map<string, int> ages;
ages["Alice"] = 30;
if (ages.find("Bob") != ages.end()) { ... }
for (auto& [k,v] : ages) { ... }

unordered_set<int> s;
s.insert(1);
if (s.count(2)) { ... }
```

Java

```java
HashMap<String, Integer> ages = new HashMap<>();
ages.put("Alice", 30);
if (ages.containsKey("Bob")) { ... }
for (Map.Entry<String,Integer> e : ages.entrySet()) { ... }

HashSet<Integer> s = new HashSet<>();
s.add(1);
if (s.contains(2)) { ... }
```

Ordered maps (red-black tree): map (C++), TreeMap (Java) – O(log n).

---

6. Trees

Binary Tree & Traversals

Node:

```cpp
struct TreeNode {
    int val;
    TreeNode *left, *right;
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
};
```

```java
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}
```

DFS traversals:

· Inorder (LNR), Preorder (NLR), Postorder (LRN).

Recursive preorder:

```cpp
void preorder(TreeNode* root) {
    if (!root) return;
    visit(root);
    preorder(root->left);
    preorder(root->right);
}
```

Iterative inorder (stack):

```cpp
stack<TreeNode*> stk;
TreeNode* cur = root;
while (cur || !stk.empty()) {
    while (cur) { stk.push(cur); cur = cur->left; }
    cur = stk.top(); stk.pop();
    visit(cur);
    cur = cur->right;
}
```

Java similar.

Binary Search Tree (BST)

Left < root < right. Search/insert/delete O(h) – h is height. Balanced → O(log n).

Insert:

```cpp
TreeNode* insert(TreeNode* root, int key) {
    if (!root) return new TreeNode(key);
    if (key < root->val) root->left = insert(root->left, key);
    else if (key > root->val) root->right = insert(root->right, key);
    return root;
}
```

Java equivalent.

Balanced BSTs

AVL (balance factor), Red-Black (used in STL map/Java TreeMap) → O(log n) operations with rotations.

Segment Tree & Fenwick Tree

Range queries and point updates.

Fenwick Tree (1-indexed):

```cpp
struct Fenwick {
    vector<int> bit; int n;
    Fenwick(int n) : n(n), bit(n+1,0) {}
    void add(int i, int delta) {
        for (; i <= n; i += i & -i) bit[i] += delta;
    }
    int sum(int i) {
        int s = 0;
        for (; i > 0; i -= i & -i) s += bit[i];
        return s;
    }
};
```

Java:

```java
class Fenwick {
    int[] bit; int n;
    Fenwick(int n) { this.n = n; bit = new int[n+1]; }
    void add(int i, int delta) {
        for (; i <= n; i += i & -i) bit[i] += delta;
    }
    int sum(int i) {
        int s = 0;
        for (; i > 0; i -= i & -i) s += bit[i];
        return s;
    }
}
```

Trie (Prefix Tree)

Insert/search prefix O(L). Use array of children (26 for lowercase).

```cpp
class Trie {
    struct Node { bool isEnd; Node* next[26]; Node() { isEnd=false; memset(next,0,sizeof(next)); } };
    Node* root;
public:
    Trie() { root = new Node(); }
    void insert(string w) {
        Node* cur = root;
        for (char c : w) {
            int i = c-'a';
            if (!cur->next[i]) cur->next[i] = new Node();
            cur = cur->next[i];
        }
        cur->isEnd = true;
    }
    bool search(string w) { /* similar */ }
    bool startsWith(string p) { /* similar */ }
};
```

Java:

```java
class Trie {
    class Node { boolean isEnd; Node[] next = new Node[26]; }
    Node root = new Node();
    void insert(String w) { ... }
    boolean search(String w) { ... }
}
```

Heap / Priority Queue

C++

```cpp
priority_queue<int> maxHeap;
priority_queue<int, vector<int>, greater<int>> minHeap;
maxHeap.push(5); int t = maxHeap.top(); maxHeap.pop();
```

Java

```java
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
minHeap.add(5); int t = minHeap.peek(); minHeap.poll();
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
```

---

7. Graphs

Representations

· Adjacency Matrix O(V²)
· Adjacency List O(V+E) (preferred)

C++

```cpp
vector<vector<int>> adj(V);
adj[u].push_back(v);
// weighted
vector<vector<pair<int,int>>> adjW(V);
adjW[u].emplace_back(v, w);
```

Java

```java
List<List<Integer>> adj = new ArrayList<>();
for (int i=0; i<V; i++) adj.add(new ArrayList<>());
adj.get(u).add(v);
// weighted using class Edge { int to, w; }
```

BFS & DFS

BFS uses queue, DFS uses recursion/stack. O(V+E).

BFS:

```cpp
void BFS(int start) {
    vector<bool> vis(V,false);
    queue<int> q;
    vis[start]=true; q.push(start);
    while (!q.empty()) {
        int u = q.front(); q.pop();
        for (int v : adj[u]) if (!vis[v]) { vis[v]=true; q.push(v); }
    }
}
```

Java: Queue<Integer> q = new LinkedList<>();

DFS:

```cpp
void DFS(int u, vector<bool>& vis) {
    vis[u] = true;
    for (int v : adj[u]) if (!vis[v]) DFS(v, vis);
}
```

Topological Sort (Kahn's algorithm)

```cpp
vector<int> indegree(V,0);
for (auto& e : edges) indegree[e[1]]++;
queue<int> q;
for (int i=0; i<V; i++) if (indegree[i]==0) q.push(i);
vector<int> order;
while (!q.empty()) {
    int u = q.front(); q.pop(); order.push_back(u);
    for (int v : adj[u]) if (--indegree[v]==0) q.push(v);
}
```

Shortest Path

· Dijkstra (non-negative weights) O((V+E) log V)

```cpp
vector<int> dist(V, INT_MAX); dist[src]=0;
priority_queue<pair<int,int>, vector<pair<int,int>>, greater<>> pq;
pq.push({0,src});
while (!pq.empty()) {
    auto [d,u] = pq.top(); pq.pop();
    if (d > dist[u]) continue;
    for (auto [v,w] : adjW[u]) if (dist[v] > d + w) {
        dist[v] = d + w; pq.push({dist[v],v});
    }
}
```

· Bellman-Ford (handles negative edges) O(VE)
· Floyd-Warshall (all-pairs) O(V³)

Minimum Spanning Tree

· Prim O(E log V)
· Kruskal O(E log E) – uses Union-Find

Union-Find (Disjoint Set)

```cpp
vector<int> parent, rank;
int find(int x) { return parent[x]==x ? x : parent[x]=find(parent[x]); }
void unite(int x, int y) {
    int rx=find(x), ry=find(y);
    if (rx==ry) return;
    if (rank[rx] < rank[ry]) parent[rx]=ry;
    else if (rank[rx] > rank[ry]) parent[ry]=rx;
    else { parent[ry]=rx; rank[rx]++; }
}
```

Java:

```java
class UnionFind {
    int[] parent, rank;
    UnionFind(int n) {
        parent = new int[n]; rank = new int[n];
        for (int i=0; i<n; i++) parent[i]=i;
    }
    int find(int x) { return parent[x]==x ? x : (parent[x]=find(parent[x])); }
    void union(int x, int y) { /* same logic */ }
}
```

---

8. Recursion & Backtracking

Recursion

Function calls itself. Must have base case. Example: factorial, Fibonacci.

Backtracking

Systematically try all possibilities, undo (backtrack) when a path fails. Used for permutations, combinations, subsets, N-Queens, Sudoku.

Subsets (C++):

```cpp
void backtrack(vector<int>& nums, int start, vector<int>& cur, vector<vector<int>>& res) {
    res.push_back(cur);
    for (int i=start; i<nums.size(); i++) {
        cur.push_back(nums[i]);
        backtrack(nums, i+1, cur, res);
        cur.pop_back();
    }
}
```

---

9. Dynamic Programming

Key: overlapping subproblems and optimal substructure. Use memoization (top-down) or tabulation (bottom-up).

Classic problems:

· 0/1 Knapsack
· Longest Common Subsequence (LCS)
· Longest Increasing Subsequence (LIS)
· Coin Change
· Edit Distance
· Matrix Chain Multiplication

0/1 Knapsack DP:

```cpp
int knapsack(vector<int>& wt, vector<int>& val, int W) {
    int n = wt.size();
    vector<vector<int>> dp(n+1, vector<int>(W+1,0));
    for (int i=1; i<=n; i++) {
        for (int w=0; w<=W; w++) {
            if (wt[i-1] <= w)
                dp[i][w] = max(dp[i-1][w], val[i-1] + dp[i-1][w-wt[i-1]]);
            else
                dp[i][w] = dp[i-1][w];
        }
    }
    return dp[n][W];
}
```

Optimize space to 1D array.

---

10. Greedy Algorithms

Make locally optimal choice at each step. Works for problems with greedy-choice property and optimal substructure.

Examples: activity selection, fractional knapsack, Huffman coding, Dijkstra, Kruskal, Prim.

Interval scheduling: sort by finish time, choose non-overlapping.

---

11. Divide & Conquer

Divide problem into smaller subproblems, solve recursively, combine.
Examples: merge sort, quick sort, binary search, maximum subarray sum (O(n log n)).

---

12. Sorting Algorithms

Algorithm Best Average Worst Space Stable
Bubble O(n²) O(n²) O(n²) O(1) Yes
Selection O(n²) O(n²) O(n²) O(1) No
Insertion O(n) O(n²) O(n²) O(1) Yes
Merge O(n log n) O(n log n) O(n log n) O(n) Yes
Quick O(n log n) O(n log n) O(n²) O(log n) No
Heap O(n log n) O(n log n) O(n log n) O(1) No

C++: sort() uses introsort.
Java: Arrays.sort(primitive) uses dual-pivot quicksort; object[] uses Timsort (stable).

Merge Sort implementation:

```cpp
void merge(vector<int>& arr, int l, int m, int r) {
    vector<int> left(arr.begin()+l, arr.begin()+m+1);
    vector<int> right(arr.begin()+m+1, arr.begin()+r+1);
    int i=0,j=0,k=l;
    while (i<left.size() && j<right.size())
        arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
    while (i<left.size()) arr[k++] = left[i++];
    while (j<right.size()) arr[k++] = right[j++];
}
void mergeSort(vector<int>& arr, int l, int r) {
    if (l >= r) return;
    int m = l + (r-l)/2;
    mergeSort(arr, l, m);
    mergeSort(arr, m+1, r);
    merge(arr, l, m, r);
}
```

---

13. Searching Algorithms

· Linear Search O(n)
· Binary Search O(log n) – requires sorted array.

```cpp
int binarySearch(vector<int>& arr, int target) {
    int l=0, r=arr.size()-1;
    while (l <= r) {
        int mid = l + (r-l)/2;
        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) l = mid+1;
        else r = mid-1;
    }
    return -1;
}
```

Java identical.

---

14. Bit Manipulation

· Check if power of 2: (n & (n-1)) == 0
· Count set bits: __builtin_popcount (C++), Integer.bitCount (Java)
· XOR swap, get lowest set bit n & -n

---

15. Math & Number Theory

· GCD: Euclidean algorithm gcd(a,b) = gcd(b, a%b)
· LCM: a*b / gcd(a,b)
· Sieve of Eratosthenes for primes.
· Modular exponentiation (fast power):

```cpp
long long power(long long a, long long b, long long mod) {
    long long res = 1 % mod;
    while (b) {
        if (b & 1) res = res * a % mod;
        a = a * a % mod;
        b >>= 1;
    }
    return res;
}
```

· Combinatorics: nCr = n!/(r!(n-r)!) using modular inverse.

---

16. String Algorithms

· KMP: O(n+m) pattern matching using LPS array.
· Rabin-Karp: rolling hash.
· Z-algorithm: find occurrences.
· Trie: multiple pattern search.

KMP LPS:

```cpp
vector<int> computeLPS(string pat) {
    int m = pat.size();
    vector<int> lps(m,0);
    for (int i=1, len=0; i<m; ) {
        if (pat[i] == pat[len]) lps[i++] = ++len;
        else if (len) len = lps[len-1];
        else lps[i++] = 0;
    }
    return lps;
}
void KMP(string txt, string pat) {
    vector<int> lps = computeLPS(pat);
    for (int i=0,j=0; i<txt.size(); ) {
        if (txt[i] == pat[j]) { i++; j++; }
        if (j == pat.size()) { /* match at i-j */ j = lps[j-1]; }
        else if (i < txt.size() && txt[i] != pat[j]) {
            j ? j = lps[j-1] : i++;
        }
    }
}
```

---

17. Advanced Data Structures

· LRU Cache: hashmap + doubly linked list.
· Interval Tree / Segment Tree.
· Suffix Array / Automaton.
· Treap, Splay Tree.
· Bloom Filter.

LRU Cache (C++):

```cpp
class LRUCache {
    int cap;
    list<pair<int,int>> lst;
    unordered_map<int, list<pair<int,int>>::iterator> mp;
public:
    LRUCache(int cap) : cap(cap) {}
    int get(int key) {
        auto it = mp.find(key);
        if (it == mp.end()) return -1;
        lst.splice(lst.begin(), lst, it->second);
        return it->second->second;
    }
    void put(int key, int value) {
        if (mp.count(key)) {
            auto it = mp[key];
            it->second = value;
            lst.splice(lst.begin(), lst, it);
        } else {
            if (lst.size() == cap) {
                mp.erase(lst.back().first);
                lst.pop_back();
            }
            lst.push_front({key,value});
            mp[key] = lst.begin();
        }
    }
};
```

Java: LinkedHashMap or custom with DLinkedNode.

---

18. The 27 Coding Interview Patterns

1. Two Pointers

Description: two indices moving through array, often from opposite ends.
When: sorted arrays, pair sum, palindrome.
Problems: Two Sum II, 3Sum, Container With Most Water.

```cpp
bool hasPair(vector<int>& arr, int target) {
    int l=0, r=arr.size()-1;
    while (l<r) {
        int sum = arr[l]+arr[r];
        if (sum==target) return true;
        else if (sum<target) l++;
        else r--;
    }
    return false;
}
```

Java identical.

2. Sliding Window

Description: dynamic window over array/string to track a sub-range.
When: contiguous subarray/substring, K distinct, min window.
Problems: Max Sum Subarray of size K, Longest Substring Without Repeating Characters, Minimum Window Substring.

```cpp
int maxSumK(vector<int>& arr, int k) {
    int sum=0, mx=0;
    for (int i=0; i<arr.size(); i++) {
        sum+=arr[i];
        if (i>=k-1) { mx=max(mx,sum); sum-=arr[i-k+1]; }
    }
    return mx;
}
```

3. Fast & Slow Pointers

Description: two pointers moving at different speeds.
When: cycle detection, middle of linked list, palindrome list.
Problems: Linked List Cycle, Happy Number, Middle of Linked List.

```cpp
bool hasCycle(ListNode* head) {
    ListNode *s=head, *f=head;
    while (f && f->next) {
        s=s->next; f=f->next->next;
        if (s==f) return true;
    }
    return false;
}
```

Java identical.

4. Merge Intervals

Description: merge overlapping intervals after sorting by start.
When: interval overlap, meeting rooms.

```cpp
vector<vector<int>> merge(vector<vector<int>>& ivs) {
    sort(ivs.begin(), ivs.end());
    vector<vector<int>> res;
    for (auto& i : ivs) {
        if (res.empty() || res.back()[1] < i[0]) res.push_back(i);
        else res.back()[1] = max(res.back()[1], i[1]);
    }
    return res;
}
```

Java: use Arrays.sort(ivs, (a,b)->a[0]-b[0]).

5. Cyclic Sort

Description: sort array containing numbers in range 1..n by placing each at correct index.
When: missing/duplicate numbers in 1..n.

```cpp
int missingNumber(vector<int>& nums) {
    int i=0;
    while (i<nums.size()) {
        if (nums[i]<nums.size() && nums[i] != nums[nums[i]])
            swap(nums[i], nums[nums[i]]);
        else i++;
    }
    for (i=0;i<nums.size();i++) if (nums[i]!=i) return i;
    return nums.size();
}
```

6. In‑place Reversal of a Linked List

Description: reverse a sublist or entire list without extra space.

```cpp
ListNode* reverseList(ListNode* head) {
    ListNode *p=nullptr, *c=head, *n;
    while (c) { n=c->next; c->next=p; p=c; c=n; }
    return p;
}
```

7. Tree BFS (Level Order)

Description: use queue to process nodes level by level.

```cpp
vector<vector<int>> levelOrder(TreeNode* root) {
    vector<vector<int>> res;
    if (!root) return res;
    queue<TreeNode*> q; q.push(root);
    while (!q.empty()) {
        int sz=q.size();
        vector<int> lvl;
        for (int i=0;i<sz;i++) {
            TreeNode* t=q.front();q.pop();
            lvl.push_back(t->val);
            if (t->left) q.push(t->left);
            if (t->right) q.push(t->right);
        }
        res.push_back(lvl);
    }
    return res;
}
```

8. Tree DFS

Description: depth-first traversal for path sum, diameter, LCA.

```cpp
int maxDepth(TreeNode* root) {
    if (!root) return 0;
    return 1 + max(maxDepth(root->left), maxDepth(root->right));
}
```

9. Two Heaps

Description: maintain min-heap and max-heap for median of data stream.

```cpp
class MedianFinder {
    priority_queue<int> lo; // max-heap
    priority_queue<int, vector<int>, greater<int>> hi; // min-heap
public:
    void addNum(int num) {
        lo.push(num);
        hi.push(lo.top()); lo.pop();
        if (lo.size() < hi.size()) { lo.push(hi.top()); hi.pop(); }
    }
    double findMedian() {
        return lo.size()>hi.size() ? lo.top() : (lo.top()+hi.top())/2.0;
    }
};
```

Java: use PriorityQueue with Collections.reverseOrder() for max.

10. Subsets (Backtracking)

Description: generate all subsets/combinations via DFS.

```cpp
void backtrack(vector<int>& nums, int start, vector<int>& cur, vector<vector<int>>& res) {
    res.push_back(cur);
    for (int i=start; i<nums.size(); i++) {
        cur.push_back(nums[i]);
        backtrack(nums, i+1, cur, res);
        cur.pop_back();
    }
}
```

11. Modified Binary Search

Description: search in rotated array, find minimum in rotated.

```cpp
int searchRotated(vector<int>& nums, int target) {
    int l=0, r=nums.size()-1;
    while (l<=r) {
        int m = l+(r-l)/2;
        if (nums[m]==target) return m;
        if (nums[l]<=nums[m]) {
            if (target>=nums[l] && target<nums[m]) r=m-1;
            else l=m+1;
        } else {
            if (target>nums[m] && target<=nums[r]) l=m+1;
            else r=m-1;
        }
    }
    return -1;
}
```

12. Bitwise XOR

Description: use XOR for missing/single numbers.

```cpp
int singleNumber(vector<int>& nums) {
    int x=0; for (int n: nums) x^=n; return x;
}
```

13. Top K Elements

Description: use min-heap of size K.

```cpp
int findKthLargest(vector<int>& nums, int k) {
    priority_queue<int, vector<int>, greater<int>> pq;
    for (int x: nums) {
        pq.push(x);
        if (pq.size()>k) pq.pop();
    }
    return pq.top();
}
```

14. K‑way Merge

Description: merge K sorted lists using min-heap.

```cpp
ListNode* mergeKLists(vector<ListNode*>& lists) {
    auto cmp = [](ListNode* a, ListNode* b){ return a->val > b->val; };
    priority_queue<ListNode*, vector<ListNode*>, decltype(cmp)> pq(cmp);
    for (auto l: lists) if(l) pq.push(l);
    ListNode dummy(0), *t=&dummy;
    while (!pq.empty()) {
        t->next=pq.top(); pq.pop(); t=t->next;
        if (t->next) pq.push(t->next);
    }
    return dummy.next;
}
```

Java: PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val-b.val);

15. Topological Sort

Description: order vertices in DAG using indegree queue.

```cpp
vector<int> topologicalSort(int V, vector<vector<int>>& edges) {
    vector<int> indeg(V,0), order;
    vector<vector<int>> adj(V);
    for (auto& e: edges) { adj[e[0]].push_back(e[1]); indeg[e[1]]++; }
    queue<int> q;
    for (int i=0;i<V;i++) if(indeg[i]==0) q.push(i);
    while (!q.empty()) {
        int u = q.front(); q.pop(); order.push_back(u);
        for (int v: adj[u]) if (--indeg[v]==0) q.push(v);
    }
    return order;
}
```

16. Union‑Find

Description: connect components, detect cycles.

```cpp
class DSU {
    vector<int> p, r;
public:
    DSU(int n) { p.resize(n); r.resize(n,0); for (int i=0;i<n;i++) p[i]=i; }
    int find(int x) { return p[x]==x?x:p[x]=find(p[x]); }
    void unite(int x, int y) {
        int rx=find(x), ry=find(y);
        if(rx==ry) return;
        if(r[rx]<r[ry]) p[rx]=ry;
        else if(r[rx]>r[ry]) p[ry]=rx;
        else { p[ry]=rx; r[rx]++; }
    }
};
```

17. Trie

Description: prefix tree for efficient word storage/search. (Covered earlier)
Use case: autocomplete, spell checker.

18. 0/1 Knapsack (DP)

Description: choose items with weights and values to maximize total value within capacity.
Recurrence: dp[i][w] = max(dp[i-1][w], val[i-1] + dp[i-1][w-wt[i-1]])
Implementation: earlier DP section.

19. Unbounded Knapsack

Description: unlimited copies of each item.
Recurrence: dp[i][w] = max(dp[i-1][w], val[i-1] + dp[i][w-wt[i-1]])
Problems: coin change (ways or min coins), cutting rod.

20. Fibonacci Numbers (DP)

Description: sequence F(n)=F(n-1)+F(n-2). Use DP (bottom-up O(n)) or matrix exponentiation.

```cpp
int fib(int n) {
    if (n<=1) return n;
    int a=0,b=1,c;
    for (int i=2;i<=n;i++) { c=a+b; a=b; b=c; }
    return b;
}
```

Applications: climbing stairs, number of ways.

21. Palindromic Subsequence (DP)

Description: longest palindromic subsequence, longest palindromic substring.
LPS (subsequence): dp[i][j] = length of LPS from i to j.
If s[i]==s[j]: dp[i][j] = 2 + dp[i+1][j-1] else max(dp[i+1][j], dp[i][j-1]).

22. Longest Common Subsequence/Substring

LCS: dp[i][j] = if s1[i-1]==s2[j-1] then 1+dp[i-1][j-1] else max(dp[i-1][j], dp[i][j-1]).
Longest Common Substring: if match 1+dp[i-1][j-1] else 0, track max.

23. Monotonic Stack

Description: maintain elements in increasing/decreasing order.
When: next greater element, largest rectangle in histogram.

```cpp
vector<int> nextGreaterElement(vector<int>& nums) {
    stack<int> stk; vector<int> res(nums.size(), -1);
    for (int i=0; i<nums.size(); i++) {
        while (!stk.empty() && nums[stk.top()] < nums[i]) {
            res[stk.top()] = nums[i]; stk.pop();
        }
        stk.push(i);
    }
    return res;
}
```

24. Prefix Sum

Description: precompute cumulative sums for O(1) range sum queries.

```cpp
vector<int> prefix(nums.size()+1, 0);
for (int i=0; i<nums.size(); i++) prefix[i+1] = prefix[i] + nums[i];
// sum [l, r] = prefix[r+1] - prefix[l]
```

25. Greedy (Pattern)

Description: make optimal local choice at each step.
When: problems with greedy-choice property and optimal substructure.
Examples: activity selection, fractional knapsack, Dijkstra, Kruskal.

26. Divide & Conquer (Pattern)

Description: recursively divide problem, solve subproblems, combine.
Examples: merge sort, quick sort, binary search, closest pair.

27. Backtracking (General)

Description: systematic trial/error, undo decisions (backtrack).
Problems: permutations, combinations, N-Queens, Sudoku.

```cpp
void permute(vector<int>& nums, int start, vector<vector<int>>& res) {
    if (start == nums.size()) { res.push_back(nums); return; }
    for (int i=start; i<nums.size(); i++) {
        swap(nums[start], nums[i]);
        permute(nums, start+1, res);
        swap(nums[start], nums[i]);
    }
}
```

---

This comprehensive guide covers all data structures, algorithms, and 27 coding patterns with implementations in both C++ and Java. Master these and you'll be well-prepared for any coding interview.
