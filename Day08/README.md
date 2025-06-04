## Problem Name
3Sum

## Description
This Java program solves the 3Sum problem: finding all unique triplets in an array that sum to zero. It's a classic problem often used to practice array manipulation and the two-pointer technique.

## How it works
The input array is sorted to facilitate the two-pointer approach.

We iterate through each element, fixing one number at a time.

Two pointers (start and end) are used to find pairs that, along with the fixed number, sum up to zero.

Duplicate values are skipped to avoid repeated triplets.

The result is returned as a list of lists containing all unique triplets.

Example
For the input:
int[] nums = {-1, 0, 1, 2, -1, -4};

The output will be:
[−1, −1, 2]
[−1, 0, 1]

You can change the input array by modifying the nums variable in the main method.

## LeetCode Link
3Sum – LeetCode #15-https://leetcode.com/problems/3sum/

## Status
Solved
