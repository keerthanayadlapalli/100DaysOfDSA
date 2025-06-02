# Majority Element Finder (n/3 times)

## Problem Name
Majority Element II

## Description
This Java program finds all elements in an array that appear more than ⌊n/3⌋ times. According to the problem's constraints, at most **two** elements can satisfy this condition.

It uses the **Boyer-Moore Voting Algorithm**, an efficient approach that works in linear time and constant space.

## How it Works
- The algorithm maintains two potential candidates (`ele1`, `ele2`) and their respective frequencies (`f1`, `f2`).
- In the **first pass**, it identifies the candidates that could potentially appear more than ⌊n/3⌋ times.
- In the **second pass**, it verifies whether those candidates truly occur more than ⌊n/3⌋ times.
- The verified majority elements are added to a list and returned.

## Example
### Input
```java
nums = [1, 1, 1, 3, 3, 2, 2, 2]
Ouput:
[1, 2]

## LeetCode Link
Majority Element || - [LeetCode #229](https://leetcode.com/problems/majority-element-ii/)

## Status
Solved