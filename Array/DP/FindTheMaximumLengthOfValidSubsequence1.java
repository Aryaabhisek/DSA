/* Medium
Topics
premium lock icon
Companies
Hint
You are given an integer array nums.
A subsequence sub of nums with length x is called valid if it satisfies:

(sub[0] + sub[1]) % 2 == (sub[1] + sub[2]) % 2 == ... == (sub[x - 2] + sub[x - 1]) % 2.
Return the length of the longest valid subsequence of nums.

A subsequence is an array that can be derived from another array by deleting some or 
no elements without changing the order of the remaining elements.

Example 1:
Input: nums = [1,2,3,4]

Output: 4
Explanation:
The longest valid subsequence is [1, 2, 3, 4]. */

class Solution {
    public int maximumLength(int[] nums) {
        int countEven = 0, countOdd = 0;
        int countAlt = 0;
        int lastParity = -1;

        for (int num : nums) {
            int currentParity = num % 2;
            if (currentParity == 0) 
            countEven++;
            else countOdd++;

            if (currentParity != lastParity) {
                countAlt++;
                lastParity = currentParity;
            }
        }

        return Math.max(Math.max(countEven, countOdd), countAlt);
    }
}

