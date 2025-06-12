Find Peak Element (Binary Search Approach)
Problem Name
Find Peak Element

Description
This Java program solves the "Find Peak Element" problem where you're given an array nums, and your task is to find a peak element. A peak element is an element that is strictly greater than its neighbors.

The array may contain multiple peaks. The goal is to return any one peak.
This solution uses Binary Search, making it more efficient than a linear scan approach.

How it works
Let the length of the array be N.

If N == 1, then that single element is the peak (return index 0).

If the first element is greater than the second, it's a peak (return index 0).

If the last element is greater than the second last, it's a peak (return index N - 1).

Otherwise, perform a Binary Search between index 1 and N - 2.

While performing binary search:

If nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1], then mid is a peak.

If nums[mid + 1] > nums[mid], move to the right half (low = mid + 1).

Else, move to the left half (high = mid - 1).

This works because the array must have at least one peak due to the properties of increasing and decreasing sequences.

Example
For nums = [1, 2, 3, 1], the output is:

Peak element is at index: 2

Since 3 is greater than both its neighbors (2 and 1), it's a valid peak.

LeetCode Link
Find Peak Element – https://leetcode.com/problems/find-peak-element/

Status
Solved ✅