### Reverse Pairs (Modified Merge Sort)
Problem Name
Reverse Pairs

### Description
This Java program counts the number of reverse pairs in an array, where a reverse pair is defined as a pair (i, j) such that 0 <= i < j < nums.length and nums[i] > 2 * nums[j].

This is a well-known problem that can be efficiently solved using a Modified Merge Sort technique, reducing the time complexity from O(n²) (brute force) to O(n log n).

### How it works
The algorithm follows the classic divide-and-conquer merge sort pattern with an added step:

Divide: Recursively split the array into halves.

Conquer: Count the reverse pairs in the left and right halves.

Combine: Count the cross pairs (where the first element is in the left half and the second in the right), using a two-pointer approach before merging the two halves.

The core logic involves:

For each element in the left half, advance the right pointer until nums[i] > 2 * nums[j] fails.

The number of valid js for that i is right - (mid + 1).

Finally, merge the two sorted halves.

This ensures a time complexity of O(n log n) and space complexity of O(n).

### Example
For nums = [1, 3, 2, 3, 1], the reverse pairs are:

(1, 4) → 3 > 2×1

(3, 4) → 3 > 2×1

So the output will be:
2

### LeetCode Link
Reverse Pairs - LeetCode #493
https://leetcode.com/problems/reverse-pairs/

Status
Solved ✅ 