### Inversion Count (Modified Merge Sort)  
**Problem Name**  
Count Inversions

### Description  
This Java program counts the number of **inversions** in an array, where an inversion is defined as a pair `(i, j)` such that `0 <= i < j < arr.length` and `arr[i] > arr[j]`.

This is a classic problem that can be solved efficiently using a **Modified Merge Sort** technique, reducing the time complexity from **O(n²)** (brute force) to **O(n log n)**.

### How it works  
The algorithm is based on the divide-and-conquer approach of Merge Sort:

- **Divide**: Recursively split the array into two halves.  
- **Conquer**: Count inversions in the left and right halves independently.  
- **Combine**: Count **cross inversions** (where one element is in the left half and the other in the right half) during the merge step.

The key idea during merging is:

- When merging two sorted halves, if `arr[left] > arr[right]`, then all remaining elements from `left` to `mid` will also be greater than `arr[right]`, contributing to the inversion count.

This optimization ensures a time complexity of **O(n log n)** and space complexity of **O(n)**.

### Example  
For `arr = [2, 4, 1, 3, 5]`, the inversions are:

- (2, 1) → 2 > 1  
- (4, 1) → 4 > 1  
- (4, 3) → 4 > 3  

So the output will be:  
3

### GFG Link  
count Inversions(https://www.geeksforgeeks.org/problems/inversion-of-array-1587115620/1)
**Status**  
Solved ✅
