# Maximum Subarray Sum

## Problem Name
Maximum Subarray (Kadane's Algorithm)

## Description
This Java program finds the contiguous subarray within a one-dimensional array of numbers which has the largest sum.

The Maximum Subarray Problem is a classic algorithmic challenge. The most efficient solution uses **Kadane's Algorithm**, which runs in linear time **O(n)**.


## How It Works

1. Initialize two variables:
   - `maxSum`: Tracks the maximum sum found so far.
   - `currentSum`: Tracks the sum of the current subarray.

2. Traverse the array:
   - Add each element to `currentSum`.
   - If `currentSum` becomes greater than `maxSum`, update `maxSum`.
   - If `currentSum` drops below 0, reset it to 0 to start a new subarray.

3. Optionally, track the start and end indices of the maximum sum subarray for printing.

---

## Example

### Input:
[-2, 1, -3, 4, -1, 2, 1, -5, 4]

### Output:
Subarray with maximum sum: [4, -1, 2, 1]
Maximum sum: 6

## LeetCode Link
🔗 [Maximum Subarray - LeetCode #53](https://leetcode.com/problems/sort-an-array/)\


## Time and Space Complexity

| Metric         | Value   |
|----------------|---------|
| Time Complexity | O(n)    |
| Space Complexity | O(1)   |


## Status
✅ Solved

