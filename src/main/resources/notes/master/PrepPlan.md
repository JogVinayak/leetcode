# FAANG Preparation 

<details>
<summary> Arrays Preparation</summary>

1. Basic Array Operations:
    - [Declaring and initializing arrays](../Declaring%20and%20initializing%20arrays.md) 
    - [Accessing elements (indexing)](../Accessing%20elements.md)
    - Modifying elements
    - Finding the length of the array

2. Multi-dimensional Arrays:
    - 2D arrays (matrices)
    - 3D arrays (cubes)

3. Dynamic Arrays:
    - Resizing arrays
    - Amortized analysis of dynamic arrays

4. Array Traversal Techniques:
    - Linear traversal (looping through elements one by one)
    - Reverse traversal

5. Array Searching:
    - Linear search (sequential search)
    - Binary search (for sorted arrays)

6. Array Sorting:
    - Bubble Sort
    - Selection Sort
    - Insertion Sort
    - Merge Sort
    - Quick Sort

7. Array Operations and Algorithms:
    - Subarray (contiguous segment) operations
    - Array rotation
    - Finding maximum and minimum elements
    - Finding duplicates or unique elements
    - Finding the majority element

8. Special Arrays:
    - Sparse Arrays (efficient representation of arrays with mostly empty elements)
    - Bit Arrays (using individual bits to represent boolean values)
    - Circular Arrays (using modular arithmetic)

9. Array Problems and Techniques:
    - Two-pointer technique
    - Sliding window technique

10. Array Manipulation:
    - Prefix sum array
    - Difference array

</details>

<details>
<summary>Linked List</summary>

1. Singly Linked List:
    - Definition and characteristics
    - Node structure
    - Insertion and deletion operations
    - Traversal (iterative and recursive)
    - Searching for an element

2. Doubly Linked List:
    - Node structure with references to both the next and previous nodes
    - Insertion and deletion operations
    - Traversal (forward and backward)
    - Searching for an element

3. Circular Linked List:
    - Singly or doubly linked list with the last node pointing to the first node (circular structure)
    - Insertion and deletion operations in a circular manner
    - Traversal in a circular manner

4. Operations on Linked Lists:
    - Concatenation of two linked lists
    - Splitting a linked list into two or more based on a value

5. Special Linked Lists:
    - Skip List (a probabilistic data structure)
    - Self-adjusting linked lists (e.g., Move-to-front linked list, Transpose linked list)

6. Doubly-Linked Circular List:
    - Combining the features of doubly linked lists and circular linked lists

7. Circular Doubly-Linked List:
    - A doubly linked list with the last node pointing to the first node (circular structure)

8. Linked List Problems and Techniques:
    - Reversing a linked list
    - Detecting a loop in a linked list (Floyd's cycle detection algorithm)
    - Finding the middle node
    - Merging two sorted linked lists

9. Implementing Data Structures Using Linked Lists:
    - Stacks using linked lists
    - Queues using linked lists

10. Memory Management and Linked Lists:
    - Dynamic memory allocation for linked list nodes
    - Freeing memory (deleting linked lists) to avoid memory leaks

</details>

<details>
<summary>Stacks and Queues</summary>

**Stacks:**

1. Definition and Characteristics:
    - LIFO (Last-In-First-Out) principle
    - Stack operations: push (insertion) and pop (deletion)

2. Implementation:
    - Using arrays to implement a stack
    - Using linked lists to implement a stack

3. Common Operations and Methods:
    - peek/top: Get the top element without removing it
    - isEmpty: Check if the stack is empty
    - size: Get the number of elements in the stack

4. Special Applications:
    - Function call stack (used in recursion and managing function calls)
    - Expression evaluation using stacks (e.g., infix to postfix conversion, evaluating postfix expressions)

5. Problems and Techniques:
    - Validating balanced parentheses or brackets using a stack
    - Next greater element using a stack
    - Implementing a stack that supports the minimum element in O(1) time (minimum stack)

**Queues:**

1. Definition and Characteristics:
    - FIFO (First-In-First-Out) principle
    - Queue operations: enqueue (insertion) and dequeue (deletion)

2. Implementation:
    - Using arrays to implement a queue
    - Using linked lists to implement a queue

3. Common Operations and Methods:
    - front: Get the front (first) element without removing it
    - rear: Get the rear (last) element without removing it
    - isEmpty: Check if the queue is empty
    - size: Get the number of elements in the queue

4. Types of Queues:
    - Circular Queue: Efficiently handling queue overflow and underflow using circular indexing
    - Priority Queue: A variation of the queue where elements have priorities and dequeue based on priority

5. Problems and Techniques:
    - Implementing a queue using stacks
    - Sliding window maximum using a queue
    - Level order traversal of a binary tree using a queue

</details>

<details>
<summary>Trees (Binary Trees, Binary Search Trees, AVL Trees, etc.)</summary>

**Binary Trees:**

1. Definition and Characteristics:
    - A tree in which each node can have at most two children, referred to as left child and right child.

2. Binary Tree Traversal:
    - In-order traversal
    - Pre-order traversal
    - Post-order traversal

3. Types of Binary Trees:
    - Full Binary Tree: A binary tree in which each node has either zero or two children.
    - Complete Binary Tree: A binary tree in which all levels are filled, except possibly the last level, and nodes are left-justified.
    - Perfect Binary Tree: A binary tree in which all levels are completely filled with nodes.

4. Binary Tree Operations and Problems:
    - Finding the height of a binary tree
    - Finding the number of nodes (size) in a binary tree
    - Checking if a binary tree is balanced
    - Finding the lowest common ancestor (LCA) of two nodes
    - Finding the diameter (longest path between two nodes) of a binary tree
    - Constructing a binary tree from its traversals or given properties

**Binary Search Trees (BST):**

1. Definition and Characteristics:
    - A binary tree where each node's left child has a value less than the node's value, and the right child has a value greater than the node's value.

2. BST Operations:
    - Insertion of a new node
    - Deletion of a node
    - Searching for a node with a specific value

3. BST Traversal:
    - In-order traversal of a BST gives elements in sorted order.

4. BST Applications:
    - Efficient searching and insertion
    - Implementing dynamic sets and dictionaries

**Balanced Binary Search Trees (AVL Trees, Red-Black Trees, etc.):**

1. AVL Trees:
    - A self-balancing binary search tree where the heights of the two child subtrees of any node differ by at most one.

2. Red-Black Trees:
    - Another self-balancing binary search tree with constraints on node coloring to maintain balance.

3. Balanced BST Operations and Problems:
    - Rotation operations (single and double rotations) to maintain balance
    - Insertion and deletion operations in balanced BSTs
    - Finding the kth smallest/largest element in a balanced BST

</details>

<details>
<summary>Graphs (Traversal algorithms, Shortest path algorithms, etc.)</summary>

Graphs are versatile data structures that consist of nodes (vertices) connected by edges. Here are some sub-topics related to graphs and their algorithms:

**Graph Representation:**

1. Adjacency Matrix:
    - Representing graphs using a 2D matrix to show connections between vertices.

2. Adjacency List:
    - Representing graphs using a list of lists or a hashmap to store the neighbors of each vertex.

**Graph Traversal Algorithms:**

1. Depth-First Search (DFS):
    - Visiting vertices as deeply as possible along each branch before backtracking.
    - Applications: Finding connected components, topological sorting.

2. Breadth-First Search (BFS):
    - Visiting vertices level by level, exploring neighbors before moving to deeper levels.
    - Applications: Shortest path algorithms, finding the shortest distance between nodes.

**Shortest Path Algorithms:**

1. Dijkstra's Algorithm:
    - Finding the shortest path from a single source vertex to all other vertices in a weighted graph with non-negative edge weights.

2. Bellman-Ford Algorithm:
    - Finding the shortest path from a single source vertex to all other vertices in a graph, even when edge weights are negative.

3. Floyd-Warshall Algorithm:
    - Finding the shortest path between all pairs of vertices in a weighted graph (both positive and negative weights).

**Minimum Spanning Tree (MST) Algorithms:**

1. Prim's Algorithm:
    - Finding the minimum spanning tree of a connected, undirected graph with weighted edges.

2. Kruskal's Algorithm:
    - Finding the minimum spanning tree of a connected, undirected graph with weighted edges using a greedy approach.

**Graph Cycle Detection:**

1. Detecting Cycles in Directed Graphs:
    - Algorithms like Depth-First Search can be used to detect cycles in directed graphs.

2. Detecting Cycles in Undirected Graphs:
    - Algorithms like Depth-First Search can be used to detect cycles in undirected graphs.

**Network Flow Algorithms:**

1. Max Flow-Min Cut Theorem:
    - Finding the maximum flow in a flow network.

2. Ford-Fulkerson Algorithm:
    - Finding the maximum flow in a flow network using augmenting paths.

**Graph Coloring:**

1. Vertex Coloring:
    - Assigning colors to the vertices of a graph such that no two adjacent vertices have the same color.

2. Edge Coloring:
    - Assigning colors to the edges of a graph such that no two adjacent edges have the same color.

</details>

<details>
<summary>Hash Tables</summary>

Hash tables, also known as hash maps or associative arrays, are data structures that allow efficient insertion, deletion, and retrieval of key-value pairs. They use a technique called hashing to store and access data quickly. Here are some sub-topics related to hash tables:

**Hashing:**

1. Hash Function:
    - A function that takes a key as input and produces an index (hash value) within the range of the array (the hash table).

2. Collision Handling:
    - Collision occurs when two keys are mapped to the same index by the hash function. Various collision resolution techniques include:
        - Separate Chaining: Using linked lists or other data structures to store multiple key-value pairs at the same index.
        - Open Addressing: Probing for alternative empty slots within the hash table when a collision occurs.

**Hash Table Operations:**

1. Insertion (or put):
    - Adding a key-value pair to the hash table.

2. Deletion (or remove):
    - Removing a key-value pair from the hash table.

3. Retrieval (or get):
    - Accessing the value associated with a specific key.

4. Searching:
    - Checking if a key exists in the hash table.

**Load Factor and Rehashing:**

1. Load Factor:
    - The ratio of the number of elements stored in the hash table to the size of the table.

2. Rehashing:
    - Resizing the hash table and rehashing the elements when the load factor exceeds a certain threshold.

**Hash Table Applications:**

1. Dictionaries:
    - Implementing a dictionary data structure with key-value pairs.

2. Caching:
    - Caching frequently used data to improve performance.

3. Unique Element Detection:
    - Efficiently finding duplicates in a dataset.

**Hash Functions:**

1. Good Hash Functions:
    - Properties of a good hash function, such as uniform distribution and minimal collisions.

2. Hashing Algorithms:
    - Commonly used hashing algorithms, such as division method, multiplication method, and universal hashing.

**Hash Table Complexity:**

1. Average Case and Worst Case Complexity:
    - Analyzing the average case and worst-case time complexity of hash table operations.

</details>


<details>
<summary>Heaps (Min Heap, Max Heap, Priority Queue)</summary>

Heaps are specialized tree-based data structures that satisfy the heap property. They are often implemented as binary trees, with each node satisfying a specific ordering rule. Here are some sub-topics related to heaps:

**Heap Property:**

1. Min Heap:
    - In a min heap, for any given node, the value of the node is less than or equal to the values of its children.

2. Max Heap:
    - In a max heap, for any given node, the value of the node is greater than or equal to the values of its children.

**Heap Operations:**

1. Heapify:
    - Reestablishing the heap property by percolating down a node to its proper position in the heap.

2. Insertion:
    - Adding a new element to the heap while maintaining the heap property.

3. Deletion:
    - Removing the root element (minimum or maximum, depending on the heap type) and reorganizing the heap.

4. Build Heap:
    - Creating a heap from an unsorted array in an efficient manner.

**Priority Queue:**

1. Priority Queue using Heap:
    - Implementing a priority queue using a heap data structure to efficiently perform insertions and extractions of minimum or maximum elements.

**Heap Applications:**

1. Heap Sort:
    - Sorting an array using a heap data structure.

2. Dijkstra's Shortest Path Algorithm:
    - Using a min heap to efficiently find the shortest path in a weighted graph.

3. Prim's Minimum Spanning Tree Algorithm:
    - Using a min heap to find the minimum spanning tree in a connected, undirected graph.

4. Heap-based Selection Algorithms:
    - Finding the kth smallest or largest element in an array using a heap.

**Complexity of Heap Operations:**

1. Time Complexity:
    - Analyzing the time complexity of heap operations like insertion, deletion, and building a heap.

**Heaps vs. Binary Search Trees (BSTs):**

1. Comparison with BSTs:
    - Understanding the differences between heaps and binary search trees in terms of their characteristics and use cases.

**Heap Implementation:**

1. Array Representation:
    - Representing heaps using arrays and leveraging the binary tree structure.

</details>

<details>
<summary>Sorting algorithms</summary>

- Bubble Sort
- Selection Sort
- Insertion Sort
- Merge Sort
- Quick Sort
- Heap Sort
- Counting Sort
- Radix Sort
- Bucket Sort
- Shell Sort
- Cocktail Shaker Sort (Bidirectional Bubble Sort)
- Comb Sort
- Gnome Sort
- Cycle Sort
- Tim Sort
- Bogo Sort (Permutation Sort)
- Bogosort (Randomized Sorting)
- Pancake Sort
- Stooge Sort

</details>

<details>
<summary>Searching Algorithms (Binary Search, Linear Search)</summary>

1. Linear Search in Arrays:
    - The most common form, where each element in the array is checked one by one until the target element is found.

2. Linear Search in Linked Lists:
    - Similar to searching in arrays, but in the context of linked lists.

3. Sentinel Linear Search:
    - A variation of linear search where a sentinel (a known unique element not in the list) is placed at the end of the list to avoid a separate check for the end condition.

4. Recursive Linear Search:
    - Linear search implemented using a recursive function to search through the list.

5. Bidirectional Linear Search:
    - Searching from both ends of the list simultaneously, potentially reducing the search time in certain cases.

6. Unordered Linear Search:
    - Searching for an element without any assumption about the order of elements in the list.


**1. Classic Binary Search:**
- The standard binary search algorithm that searches for a target element in a sorted list by dividing the list in half repeatedly.
- Time complexity: O(log n) in the worst case, where n is the number of elements in the sorted list.

**2. Lower Bound Binary Search:**
- A variation that returns the index of the first occurrence of the target element if it exists in the list. If the target element is not found, it returns the index of the first element that is greater than the target.
- Useful for finding the leftmost occurrence of an element in a sorted list with duplicates.

**3. Upper Bound Binary Search:**
- A variation that returns the index of the first element greater than the target element.
- Useful for finding the rightmost occurrence of an element in a sorted list with duplicates.

**4. Recursive Binary Search:**
- An implementation of binary search using a recursive function to search through the list.
- Can be less efficient in some programming languages due to function call overhead.

**5. Iterative Binary Search:**
- The standard implementation of binary search using loops instead of recursion.
- Typically more efficient in terms of space and may have better performance in some programming languages.

**6. Hybrid Binary Search:**
- A combination of binary search and linear search that is useful for small search spaces or when the target element is likely to be close to the start of the list.
- It starts with binary search and switches to linear search when the search space becomes small enough.

</details>

<details>
<summary>Dynamic Programming</summary>

1. Introduction to Dynamic Programming:
    - Understanding the concept and motivation behind dynamic programming.
    - Recognizing problems suitable for dynamic programming.

2. Memoization:
    - Using memoization to store the results of subproblems to avoid redundant calculations.
    - Implementing memoization using recursion and memo tables.

3. Tabulation:
    - Using tabulation to build solutions iteratively, typically with the help of an array or table.
    - Implementing tabulation using loops.

4. 0/1 Knapsack Problem:
    - Solving the classic knapsack problem with constraints on the total weight or capacity.
    - Applying both memoization and tabulation techniques.

5. Longest Common Subsequence (LCS):
    - Finding the longest common subsequence of two or more sequences.
    - Applying dynamic programming to solve LCS problems.

6. Longest Increasing Subsequence (LIS):
    - Finding the longest increasing subsequence in an array.
    - Solving LIS problems using dynamic programming.

7. Coin Change Problem:
    - Determining the minimum number of coins required to make a certain amount of change.
    - Applying dynamic programming to solve the coin change problem.

8. Matrix Chain Multiplication:
    - Finding the most efficient way to multiply a chain of matrices.
    - Using dynamic programming to optimize matrix chain multiplication.

9. Edit Distance:
    - Finding the minimum number of operations (insertion, deletion, or substitution) to transform one string into another.
    - Solving edit distance problems using dynamic programming.

10. Subset Sum Problem:
    - Determining whether a subset of elements in an array adds up to a given sum.
    - Applying dynamic programming to solve the subset sum problem.

11. Bitmasking and Dynamic Programming:
    - Combining bitmasking techniques with dynamic programming to optimize solutions for certain problems.

12. Advanced Dynamic Programming Techniques:
    - Understanding more complex dynamic programming problems and techniques.

</details>

<details>
<summary>Greedy Algorithms</summary>

1. Introduction to Greedy Algorithms:
    - Understanding the basic concept of making locally optimal choices.
    - Recognizing problems suitable for a greedy approach.

2. Activity Selection Problem:
    - Solving the problem of selecting the maximum number of non-overlapping activities given their start and end times.
    - Implementing the greedy algorithm for activity selection.

3. Fractional Knapsack Problem:
    - Finding the maximum value of items that can be included in a knapsack with a certain weight capacity.
    - Applying the greedy approach to the fractional knapsack problem.

4. Huffman Coding:
    - Creating an efficient variable-length encoding for data using a greedy algorithm.
    - Understanding the construction of Huffman codes for data compression.

5. Coin Change Problem (Greedy Approach):
    - Solving the coin change problem using a greedy algorithm when coin denominations are in certain conditions.

6. Minimum Spanning Tree (MST) Algorithms:
    - Understanding Prim's and Kruskal's algorithms for finding the minimum spanning tree in a weighted graph.
    - Applying the greedy approach to construct MSTs.

7. Dijkstra's Algorithm (Greedy Approach):
    - Finding the shortest path from a single source vertex to all other vertices in a weighted graph using a greedy approach.

8. Shortest Superstring Problem:
    - Combining strings to create a shortest superstring using a greedy algorithm.

9. Interval Scheduling Problem:
    - Finding the maximum number of intervals that do not overlap using a greedy approach.

10. Subset Sum Problem (Greedy Approach):
    - Finding a subset of elements in an array that adds up to a given sum using a greedy algorithm.

</details>

<details>
<summary>Backtracking</summary>

1. Introduction to Backtracking:
    - Understanding the concept and motivation behind backtracking.
    - Recognizing problems suitable for a backtracking approach.

2. Recursive Backtracking:
    - Implementing backtracking using recursive function calls.
    - Understanding the backtracking template and how to backtrack through different choices.

3. Subset Generation:
    - Generating all possible subsets of elements from a given set using backtracking.

4. Permutations:
    - Generating all possible permutations of elements using backtracking.

5. Combinations:
    - Generating all possible combinations of elements using backtracking.

6. N-Queens Problem:
    - Placing N queens on an N×N chessboard such that no two queens threaten each other.
    - Applying backtracking to solve the N-Queens problem.

7. Sudoku Solver:
    - Solving a Sudoku puzzle using backtracking.

8. Knight's Tour Problem:
    - Finding a tour for a knight on a chessboard to visit every square exactly once.

9. Word Search:
    - Searching for a given word in a 2D board of letters using backtracking.

10. Hamiltonian Cycle:
    - Finding a Hamiltonian cycle (a cycle that visits every vertex exactly once) in a graph.

11. Subset Sum Problem (Backtracking Approach):
    - Finding a subset of elements in an array that adds up to a given sum using backtracking.


</details>


<details>
<summary>Divide and Conquer</summary>

1. Introduction to Divide and Conquer:
    - Understanding the concept and motivation behind divide and conquer.
    - Recognizing problems suitable for a divide and conquer approach.

2. Recursive Divide and Conquer:
    - Implementing the divide and conquer approach using recursive function calls.
    - Understanding the divide and conquer template and how to combine solutions from subproblems.

3. Merge Sort:
    - Sorting an array using the divide and conquer approach to merge sorted subarrays.
    - Analyzing the time complexity of Merge Sort.

4. Quick Sort:
    - Sorting an array using the divide and conquer approach to partition the array around a pivot element.
    - Analyzing the time complexity of Quick Sort.

5. Binary Search:
    - Searching for a target element in a sorted array using the divide and conquer approach.

6. Closest Pair of Points:
    - Finding the closest pair of points in a given set using the divide and conquer approach.

7. Strassen's Matrix Multiplication:
    - Multiplying two matrices using a more efficient divide and conquer algorithm.

8. Karatsuba Multiplication:
    - Multiplying two large integers using the divide and conquer approach.

9. Maximum Subarray Sum:
    - Finding the contiguous subarray with the largest sum using the divide and conquer approach.

10. Counting Inversions:
    - Counting the number of inversions in an array using the divide and conquer approach.

</details>

<details>
<summary>Graph Algorithms (BFS, DFS, Dijkstra's Algorithm, etc.)</summary>

1. **Breadth-First Search (BFS):**
    - Traverses a graph level by level, exploring all neighbors of a node before moving to the next level.
    - Applications: Shortest path in an unweighted graph, connected components, finding cycles.

2. **Depth-First Search (DFS):**
    - Traverses a graph by exploring as far as possible along each branch before backtracking.
    - Applications: Topological sorting, finding cycles, connected components, and more.

3. **Dijkstra's Algorithm:**
    - Finds the shortest path from a single source vertex to all other vertices in a weighted graph with non-negative edge weights.
    - Applications: Finding the shortest route, network routing, GPS navigation.

4. **Bellman-Ford Algorithm:**
    - Finds the shortest path from a single source vertex to all other vertices in a graph, even with negative edge weights (but no negative cycles).
    - Applications: Similar to Dijkstra's algorithm but handles graphs with negative weights.

5. **Floyd-Warshall Algorithm:**
    - Finds the shortest path between all pairs of vertices in a weighted graph (both positive and negative weights).
    - Applications: Finding all shortest paths in a graph.

6. **Prim's Algorithm:**
    - Finds the minimum spanning tree (MST) of a connected, undirected graph with weighted edges.
    - Applications: Network design, finding the minimum cost of connecting all nodes.

7. **Kruskal's Algorithm:**
    - Finds the minimum spanning tree (MST) of a connected, undirected graph with weighted edges using a greedy approach.
    - Applications: Similar to Prim's algorithm, used for finding the minimum cost spanning tree.

8. **Articulation Points and Bridges:**
    - Identifies critical nodes (articulation points) and edges (bridges) in a graph.
    - Applications: Network reliability, network design, and robustness analysis.

9. **Strongly Connected Components (SCC):**
    - Identifies groups of nodes that are mutually reachable within a directed graph.
    - Applications: Compiler optimizations, graph clustering.

10. **Eulerian Path and Circuit:**
    - Identifies whether a graph has an Eulerian path or circuit (traversal that covers all edges exactly once).
    - Applications: Route planning, circuit board testing.

11. **Hamiltonian Path and Circuit:**
    - Identifies whether a graph has a Hamiltonian path or circuit (traversal that visits all nodes exactly once).
    - Applications: Traveling salesman problem, network routing.
    
</details>

<details>
<summary>String Algorithms (Pattern matching, String manipulation, etc.)</summary>

1. **Pattern Matching:**
    - String matching algorithms to find occurrences of a pattern (substring) within a larger text (string).
    - Algorithms include:
        - Naive Pattern Matching
        - Knuth-Morris-Pratt (KMP) Algorithm
        - Rabin-Karp Algorithm
        - Boyer-Moore Algorithm

2. **String Manipulation:**
    - Algorithms for basic string operations and modifications.
    - Operations include:
        - String Concatenation
        - String Reversal
        - String Rotation
        - String Compression

3. **Longest Common Subsequence (LCS):**
    - Finding the longest common subsequence of two or more strings.
    - Applications: DNA sequence analysis, plagiarism detection.

4. **Longest Common Prefix (LCP):**
    - Finding the longest common prefix of an array of strings.
    - Applications: Trie construction, dictionary search optimization.

5. **Edit Distance (Levenshtein Distance):**
    - Measuring the similarity between two strings by finding the minimum number of edit operations (insertion, deletion, substitution) required to transform one string into another.
    - Applications: Spelling correction, bioinformatics.

6. **Anagram Detection:**
    - Detecting if two strings are anagrams (contain the same characters in the same frequency).
    - Applications: Word games, cryptanalysis.

7. **Palindrome Detection:**
    - Determining if a string is a palindrome (reads the same forward and backward).
    - Applications: Text processing, language analysis.

8. **Regular Expression Matching:**
    - Matching strings against patterns defined by regular expressions.
    - Applications: Pattern validation, text search and replace.

9. **Trie (Prefix Tree):**
    - An efficient data structure for storing and searching a dynamic set of strings.
    - Applications: Autocomplete, dictionary lookups.

10. **Substring Search:**
    - Algorithms to find all occurrences of a pattern (substring) in a text (string).
    - Algorithms include:
        - Naive Substring Search
        - Knuth-Morris-Pratt (KMP) Substring Search
        - Rabin-Karp Substring Search
        - Boyer-Moore Substring Search

</details>


<details>
<summary>
Trie Data Structure
</summary>

1. **Node Structure:**
    - Each node of the Trie represents a single character or letter.
    - Each node can have multiple children, each corresponding to a possible next character in the string.

2. **Root Node:**
    - The topmost node of the Trie is called the root node.
    - The root node represents an empty string or the null character.

3. **Leaf Nodes:**
    - The leaf nodes represent the end of a string or word.
    - Each leaf node typically has a flag or marker indicating the end of a valid string.

4. **Path from Root to Leaf:**
    - The path from the root to any leaf node represents a complete string formed by concatenating the characters along the path.

5. **Prefix Matching:**
    - Trie allows efficient prefix matching of strings.
    - Given a prefix, you can quickly find all strings in the Trie that start with that prefix.

6. **Space Efficiency:**
    - The Trie optimally stores strings with common prefixes, resulting in space-efficient storage.

7. **Time Complexity:**
    - The time complexity for insertion, deletion, and searching in the Trie is O(m), where m is the length of the string.

8. **Applications:**
    - Autocomplete and suggestion systems.
    - Dictionary lookups and spell checking.
    - Searching for all words that match a given prefix.
    - Text indexing and information retrieval tasks.
    - IP routing and IP address-based lookups.

9. **Drawbacks:**
    - Tries can consume a considerable amount of memory for large vocabularies.
    - It may be less efficient than other data structures for certain tasks, such as range searches.

</details>
<details>
<summary>Disjoint Set Union (Union-Find)</summary>

1. **Basic Operations:**
    - Union: Merges two disjoint sets into a single set.
    - Find: Determines which set a particular element belongs to and identifies its representative or root element.

2. **Representative Element (Root):**
    - Each set has one representative element that serves as the identifier of the entire set.
    - All elements in the same set point to the same representative element.

3. **Union-Find Data Structure:**
    - Typically implemented using an array or a forest of trees (disjoint sets).
    - The elements of the array represent the elements in the input set, and the array values indicate the parent (or root) of each element in the set.

4. **Union by Rank (or Size) and Path Compression:**
    - Union by Rank: The smaller tree is attached to the root of the larger tree during the union operation, which helps to maintain the balance of the tree and optimize the time complexity.
    - Path Compression: During the Find operation, the elements along the path to the root are updated to directly point to the root, reducing future search times.

5. **Time Complexity:**
    - Union and Find operations have a nearly constant time complexity on average, often denoted as O(α(n)), where α is the inverse Ackermann function, which grows very slowly and can be considered constant for practical purposes.

6. **Applications:**
    - Kruskal's algorithm for finding the minimum spanning tree of a graph.
    - Detecting cycles in an undirected graph.
    - Finding connected components in a graph.
    - Dynamic connectivity in graphs.

</details>


<details>
<summary>Segment Trees</summary>

Segment Trees are a versatile data structure used to efficiently query and update intervals in an array or list. They are particularly useful for tasks involving range queries, such as finding the sum, minimum, maximum, or any other associative function of elements within a specified range. Segment Trees are based on a binary tree structure and provide a balance between memory usage and query/update efficiency. Here are some key points to understand about Segment Trees:

1. **Structure:**
    - Segment Trees are binary trees where each node represents an interval (segment) of the array.
    - The root of the tree represents the entire array, and each node divides its interval into two equal halves.

2. **Leaf Nodes:**
    - The leaf nodes represent single elements of the array.

3. **Lazy Propagation:**
    - To optimize the update operation, Segment Trees often use a technique called lazy propagation.
    - Instead of updating all nodes along the path from the root to the leaf, the updates are delayed and performed only when necessary.

4. **Range Queries:**
    - Segment Trees support various range queries, such as finding the sum, minimum, maximum, or any other associative function of elements within a given range.

5. **Time Complexity:**
    - Constructing a Segment Tree takes O(n) time, where n is the number of elements in the array.
    - Query and update operations take O(log n) time, where n is the number of elements in the array.

6. **Applications:**
    - Range queries and updates in arrays or lists.
    - Finding the sum, minimum, or maximum of elements within a specified range.
    - Interval modifications and range-based statistics.

7. **Extension to Higher Dimensions:**
    - Segment Trees can be extended to handle higher-dimensional data, such as 2D or 3D arrays.

Segment Trees are widely used in competitive programming and various algorithms involving range queries and updates. They provide a balance between memory usage and query/update efficiency, making them a powerful tool for solving a wide range of problems that involve interval-based computations.
</details>


<details>
<summary>Fenwick Trees (Binary Indexed Trees)</summary>


</details>

<details>
<summary>Topological Sorting</summary>summary>


Fenwick Trees, also known as Binary Indexed Trees (BIT), are a specialized data structure used to efficiently perform prefix sum queries and single element updates in an array. They are particularly useful when dealing with dynamic cumulative frequency or sum computations. Fenwick Trees offer a compact representation and provide fast access to prefix sums, making them ideal for scenarios where frequent range queries and updates are required. Here are some key points to understand about Fenwick Trees:

1. **Representation:**
    - Fenwick Trees are represented using an array of size n, where n is the number of elements in the original array.
    - The elements of the array are initialized to zero.

2. **Binary Representation:**
    - Each element of the Fenwick Tree corresponds to a specific range of the original array, and the indices are based on the binary representation of the index.

3. **Parent-Child Relationship:**
    - Each element at index i in the Fenwick Tree has a parent at index i - (i & -i).
    - The child of an element at index i is at index i + (i & -i).

4. **Prefix Sum Computation:**
    - To compute the prefix sum of the first k elements in the original array, one needs to follow the parent chain up to the root of the Fenwick Tree.

5. **Single Element Update:**
    - To update the value of a single element in the original array, the corresponding element in the Fenwick Tree and its ancestors need to be updated.

6. **Time Complexity:**
    - Constructing a Fenwick Tree takes O(n log n) time, where n is the number of elements in the array.
    - Query and update operations take O(log n) time.

7. **Applications:**
    - Cumulative frequency queries in arrays or lists.
    - Finding the sum of elements within a specified range.
    - Computing inversion counts in an array.

Fenwick Trees are an efficient alternative to Segment Trees when dealing with prefix sum queries and single element updates. They are well-suited for handling dynamic cumulative frequency computations in scenarios where both query and update operations are required frequently.
</details>




