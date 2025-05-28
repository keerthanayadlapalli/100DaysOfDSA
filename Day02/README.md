# Prime Counter (Sieve of Eratosthenes)

## Problem Name
Count Primes

## Description
This Java program counts the number of prime numbers less than a given number `n`. It uses the **Sieve of Eratosthenes**, an efficient algorithm for finding all prime numbers up to any given limit.

## How it works
- A Boolean array `p[]` of size `n` is used where each index represents a number.
- All values are initialized as `true` (assuming all are prime).
- The values at index `0` and `1` are marked `false` (not prime).
- Starting from `i = 2`, for each prime number, its multiples are marked as `false`.
- Finally, the number of `true` values (which are primes) is counted and returned.

## Example
For `n = 5`, the output will be:
2

Explanation: The prime numbers less than 5 are `2` and `3`.

You can change the number `n` by modifying the `countPrimes(n)` call in the `main` method.

## LeetCode Link
[Count Primes - LeetCode #204](https://leetcode.com/problems/count-primes/)

## Status
Solved 
