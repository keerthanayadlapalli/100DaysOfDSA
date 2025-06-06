## 1. Maximum Product Subarray

### Problem Statement:
Given an integer array `nums`, find the contiguous subarray within an array (containing at least one number) which has the **largest product**, and return that product.

### Approach:
- Track `max`, `min`, and `maxproduct` while traversing.
- Since a negative number can flip the maximum and minimum, we maintain both.
- At each step, update `max`, `min`, and the overall `maxproduct`.


#### Example:
Input: nums = [2, 3, -2, 4]
Output: 6
Explanation: [2, 3] has the maximum product = 6.

### Leetcode Link
MaximumProductSubarray - Leetcode(152)(https://leetcode.com/problems/maximum-product-subarray/)
### Status
Solved

### 2.Merge Sorted Array
### Problem Statement:
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of initialized elements in nums1 and nums2, respectively.
Merge nums2 into nums1 as one sorted array in-place such that nums1 becomes a single sorted array.

### Approach:
Use three pointers:

p1 for the end of the initialized part of nums1

p2 for the end of nums2

p for the last index of nums1

Compare elements from the end and insert the larger one at the back.

Copy remaining elements from nums2 if any are left.

### Example:
Input:
nums1 = [1, 2, 3, 0, 0, 0], m = 3  
nums2 = [2, 5, 6],         n = 3
Output:
[1, 2, 2, 3, 5, 6]
### Leetcode Link
MergeSortedArray - Leetcode(88)
https://leetcode.com/problems/merge-sorted-array/

### Status
Solved

