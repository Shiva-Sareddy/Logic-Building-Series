# Searching Algorithms

## Overview
This document covers two commonly used searching algorithms: **Linear Search** and **Binary Search**. These algorithms are essential for locating elements within data structures and have different use cases and performance characteristics.

---

## Table of Contents
1. [Introduction](#introduction)
2. [Linear Search](#linear-search)
3. [Binary Search](#binary-search)
4. [Time and Space Complexities](#time-and-space-complexities)

---

## Introduction
Searching algorithms are crucial in computer science for locating data within arrays or other structures. Below, we explore two widely-used search algorithms: **Linear Search**, suited for unsorted lists, and **Binary Search**, optimized for sorted arrays.

---

## 1. Linear Search
**Linear Search** is a sequential search algorithm that scans each element in the array until the target value is found. It has the following characteristics:

- **Traversal**: Linear Search traverses the array sequentially, comparing each element one by one.
- **Performance**: Linear Search has a higher time complexity and is generally best for small or unsorted lists.
- **Efficiency**: Due to the linear nature, it may take up to `n` comparisons in the worst case, making it inefficient for large datasets.

### Key Points:
- **Best Case**: `O(1)` - Target is found at the first position.
- **Average Case**: `O(n)` - Target is found somewhere in the middle.
- **Worst Case**: `O(n)` - Target is at the last position or not present.
- **Space Complexity**: `O(1)` - Constant space.
- **Average Comparisons**: `(n+1)/2`

---

## 2. Binary Search
**Binary Search** is an efficient algorithm based on the Divide-and-Conquer approach, used on sorted arrays. It works by dividing the search interval in half with each iteration.

- **Method**: Binary Search repeatedly divides the sorted array into two halves, comparing the target with the midpoint.
- **Performance**: It is faster than Linear Search for sorted arrays, requiring logarithmic time complexity.
- **Use Case**: Best suited for large, sorted datasets where efficient searching is required.

### Key Points:
- **Best Case**: `O(1)` - Target is at the midpoint.
- **Average Case**: `O(log n)` - Target is found after a few splits.
- **Worst Case**: `O(log n)` - Target is not present or at one end.
- **Space Complexity**: `O(1)` - Constant space.

---

## Time and Space Complexities

| **Algorithm**     | **Best Case** | **Average Case** | **Worst Case** | **Space Complexity** | **Description**                          |
|-------------------|---------------|-------------------|----------------|-----------------------|------------------------------------------|
| **Linear Search** | `O(1)`        | `O(n)`           | `O(n)`        | `O(1)`                | Sequential search across each element.   |
| **Binary Search** | `O(1)`        | `O(log n)`       | `O(log n)`    | `O(1)`                | Divides sorted array to locate target.   |

--- 
