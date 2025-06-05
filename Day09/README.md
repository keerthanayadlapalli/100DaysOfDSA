## Sort Colors (Dutch National Flag Algorithm)
## Problem Name
Sort Colors

## Description
This Java program sorts an array containing only the integers 0, 1, and 2, which represent colors red, white, and blue respectively. The goal is to sort the array in-place so that all 0s come first, followed by 1s, then 2s. This is a classic problem often referred to as the Dutch National Flag problem, originally proposed by Edsger Dijkstra.

## How it works
The algorithm uses three pointers: low, mid, and high.
Initially, low and mid start at index 0, and high starts at the end of the array.

While mid <= high:

If nums[mid] == 0: swap with nums[low], increment both low and mid.

If nums[mid] == 1: just move mid forward.

If nums[mid] == 2: swap with nums[high], and decrement high.

This approach ensures a single pass (O(n) time) and constant space (O(1) space).

## Example
For nums = [2, 0, 2, 1, 1, 0], the sorted output will be:
[0, 0, 1, 1, 2, 2]

## LeetCode Link
Sort Colors - LeetCode #75 https://leetcode.com/problems/sort-colors/

Status
Solved ✅