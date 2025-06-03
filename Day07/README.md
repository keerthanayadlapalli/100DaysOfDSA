## Problem Name  
**Longest Consecutive Sequence**

## Description  
This Java program finds the length of the longest consecutive sequence in an unsorted array of integers.  
A consecutive sequence is a group of numbers that appear one after another in increasing order, regardless of their order in the input.

## How it works  
- The program uses a `HashSet` to store all elements for quick lookup.
- It iterates over each element in the set.
- For each number, it checks if it's the **start of a sequence** (i.e., `num - 1` is not in the set).
- If it is, it keeps counting the length of the consecutive sequence starting from that number.
- It keeps track of and returns the maximum sequence length found.

## Example  
For the input:
```java
int[] nums = {100, 4, 200, 1, 3, 2};
The output will be:
Longest consecutive sequence length: 4
Explanation: The longest consecutive sequence is [1, 2, 3, 4].

How to Use
You can change the input array by modifying the nums variable inside the main method.

LeetCode Link
🔗 Longest Consecutive Sequence - LeetCode #128 https://leetcode.com/problems/longest-consecutive-sequence/

Status
✅ Solved