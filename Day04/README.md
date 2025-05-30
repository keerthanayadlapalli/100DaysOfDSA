# Java Bitwise Operation Problems

---

## Problem 1: Single Number

### Description  
Find the single number in an integer array where every element appears **twice except for one**. The program uses the XOR bitwise operation to efficiently identify the unique number.

### How it works  
- XOR (`^`) operator cancels out duplicates because `x ^ x = 0`.
- XORing with 0 returns the number itself.
- Final XOR result is the unique number.

### Example  
For `nums = [4, 1, 2, 1, 2]`, output:  
`4`

### Link  
[Single Number - LeetCode #136](https://leetcode.com/problems/single-number/)

---

## Problem 2: Check Whether K-th Bit is Set

### Description  
Check if the k-th bit of an integer is set (1) or not using bitwise operations.

### How it works  
- Right shift the number `n` by `k` bits.
- Bitwise AND with 1 isolates the k-th bit.
- Returns true if the bit is 1; otherwise false.

### Example  
For `n = 5` (binary 0101) and `k = 2`, output:  
`true` (since the bit at position 2 is 1)

### Link  
[Check whether K-th bit is set or not - GeeksforGeeks](https://www.geeksforgeeks.org/problems/check-whether-k-th-bit-is-set-or-not-1587115620/1)

---

## Problem 3: Count Number of Set Bits (1 Bits)

### Description  
Count the number of set bits (1s) in the binary representation of an integer using Brian Kernighan’s Algorithm.

### How it works  
- Repeatedly flips the least significant set bit.
- Counts how many times this operation is performed until the number becomes zero.

### Example  
For `num = 29` (binary 11101), output:  
`4`

### Link  
[Count Set Bits - GeeksforGeeks](https://www.geeksforgeeks.org/problems/set-bits0143/1)

---

## Status  
All problems solved.
