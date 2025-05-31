# Rearranged Array Generator

## Problem Name  
**Rearrange Array Elements by Sign**

## Description  
This Java program rearranges the elements of an array such that positive and negative numbers alternate while maintaining their original relative order within their group.  

If the count of positive and negative numbers is not equal, the remaining elements are added at the end.

## How it works  
- The program separates the original array into two lists:
  - One for **positive** numbers
  - One for **negative** numbers  
- It then places them alternately in a new array.
- Any remaining elements (if one list is longer) are added at the end.

## Example  
For the input:  
```java
nums = {3, 1, -2, -5, 2, -4}

output:[3, -2, 1, -5, 2, -4]
 
 ## LeetCode Link
Rearrange array elements by sign - [LeetCode #2149] 
URL:https://leetcode.com/problems/rearrange-array-elements-by-sign/
## Status
Solved