### Set Mismatch (Math-Based Approach)  
**Problem Name**  
Set Mismatch

### Description  
This Java program identifies the two errors in an array `nums` that is supposed to contain all integers from `1` to `n` exactly once. However, due to a data error:

- One number is **repeated** (duplicated).
- One number is **missing** (absent).

The goal is to find both numbers.

This problem can be efficiently solved using a **Mathematical approach** leveraging formulas for the **sum of first N natural numbers** and **sum of squares**. This reduces time and space complexity compared to using HashMaps or arrays for frequency counting.

### How it works  
Let:

- `s` = sum of elements in `nums`  
- `sn` = expected sum = `n(n+1)/2`  
- `s2` = sum of squares of elements in `nums`  
- `sn2` = expected sum of squares = `n(n+1)(2n+1)/6`  

Let:

- `x` = duplicated number  
- `y` = missing number  

From the equations:

- `x - y = s - sn`  
- `x² - y² = s2 - sn2` ⇒ `(x + y)(x - y)`  

Using these, we can solve and derive the values of `x` and `y`.

### Example  
For `nums = [1, 2, 2, 4]`, the output is:

- Duplicate: 2  
- Missing: 3  

Because the number `2` appears twice and the number `3` is missing.

### LeetCode Link  
Set Mismatch – [https://leetcode.com/problems/set-mismatch/]

### Status  
Solved ✅
