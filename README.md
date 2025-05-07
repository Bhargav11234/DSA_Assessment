# DSA Test Solution

## Section 1

### 1. Find the Missing Number
- **Problem:** Given an array of size `n-1` containing distinct numbers from `1` to `n`, find the missing number.
- **Approach:** 
  - Used the formula for the sum of the first `n` natural numbers: `n*(n+1)/2`.
  - **Time Complexity:** O(n)

### 2. Longest Substring Without Repeating Characters
- **Problem:** Find the length of the longest substring without repeating characters in a given string `s`.
- **Approach:**
  - Implemented the **Brute Force** technique to track of unique characters.
  - **Time Complexity:** O(n)



## Section 2

### 3. Reverse a Linked List in Groups of K
- **Problem:** Given a singly linked list, reverse the nodes of the list in groups of `k`.
- **Approach:**
  - Maintained proper connections between groups after reversal.
  - **Time Complexity:** O(n)


## Section 3

### 4. Lowest Common Ancestor (LCA) of a Binary Tree
- **Problem:** Given a binary tree and two nodes, find their lowest common ancestor (LCA).
- **Approach:**
  - Used a recursive depth-first search approach.
  - **Time Complexity:** O(n)



## Section 4

### 5. Shortest Path in an Unweighted Graph
- **Problem:** Given an undirected, unweighted graph and a source node, find the shortest path to all other nodes.
- **Approach:**
  - Implemented **Breadth-First Search (BFS)** to explore the graph level by level.
  - Used a queue and a distance dictionary to track minimum distance from the source.
  - **Time Complexity:** O(V + E), where V = vertices and E = edges



## Section 5

### 6. Kth Smallest Element in an Array
- **Problem:** Find the `k`th smallest element in an unsorted array.
- **Approach:**
  - Implemented the **QuickSelect Algorithm**, a variant of QuickSort.
  - Used partitioning to narrow down the search to the kth position.
  - **Average Time Complexity:** O(n)




