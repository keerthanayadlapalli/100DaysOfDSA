# Pascal Triangle Generator

## Problem Name
Pascal's Triangle

## Description
This Java program generates Pascal's Triangle up to a specified number of rows. Pascal's Triangle is a triangular array of binomial coefficients, where each number is the sum of the two numbers directly above it.

## How it works
- The program uses a 2D array to build the triangle.
- Each row starts with 1.
- Each subsequent element in the row is calculated by summing the two elements above it.
- The program returns a list of lists representing the triangle.

## Example
For `numRows = 5`, the output will be:
[1]
[1, 1]
[1, 2, 1]
[1, 3, 3, 1]
[1, 4, 6, 4, 1]

3. You can change the number of rows by modifying the `numRows` variable in the `main` method.

## LeetCode Link
[Pascal's Triangle - LeetCode #118](https://leetcode.com/problems/pascals-triangle/)

## Status
Solved
