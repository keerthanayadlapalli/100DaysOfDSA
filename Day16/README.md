### Koko Eating Bananas (Binary Search Approach)

### Problem Name
Koko Eating Bananas

### Description
This Java program solves the "Koko Eating Bananas" problem where you're given an array piles representing piles of bananas and an integer h representing the number of hours Koko has to eat them.

Koko eats bananas at a fixed speed k bananas/hour. If a pile has less than k bananas, she finishes it in less than an hour. If a pile has more, it takes her multiple hours. She can only eat from one pile per hour.

The task is to determine the minimum possible value of k such that she can eat all the bananas within h hours.

This program uses Binary Search to efficiently find the optimal speed.

### How it works
The maximum possible speed is the largest pile in the array since eating faster than the largest pile doesn’t reduce time.

The minimum speed is 1.

For each possible speed mid between low and high:

Use a helper function to calculate the required time to finish all piles at speed mid.

If the required time is less than or equal to h, try a lower speed.

If it’s more, try a higher speed.

The smallest value of mid that satisfies the time condition is the answer.

### Example
For piles = [3, 6, 7, 11] and h = 8, the output is:

Minimum eating speed: 4

Koko can eat all the bananas at a speed of 4 bananas/hour within 8 hours.

### LeetCode Link
Koko Eating Bananas – https://leetcode.com/problems/koko-eating-bananas/

### Status
Solved ✅