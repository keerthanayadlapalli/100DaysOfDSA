# Maximum Subarray Sum

## Problem Name
Maximum Subarray (Kadane's Algorithm)

## Description
This Java program finds the contiguous subarray within a one-dimensional array of numbers which has the largest sum.

The maximum subarray problem is a classic algorithmic problem with an efficient solution called Kadane's algorithm, which runs in O(n) time.

## How it works
- Iterate through the array, keeping track of the current subarray sum.
- If the current sum becomes negative, reset it to zero to start a new subarray.
- Keep track of the maximum sum found so far.
- Also track the start and end indices of the maximum sum subarray.
- Finally, print the subarray with the maximum sum and return that sum.

## Example
For the input array: `[-2,1,-3,4,-1,2,1,-5,4]`

The output will be the subarray with maximum sum:
4 -1 2 1
And the maximum sum is:
6

## LeetCode Link
[Maximum Subarray - LeetCode #53](https://leetcode.com/problems/maximum-subarray/)

## Status
Solved.
