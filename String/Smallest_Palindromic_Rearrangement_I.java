/* You are given a palindromic string s.

Return the lexicographically smallest palindromic permutation of s.

 

Example 1:

Input: s = "z"

Output: "z"

Explanation:

A string of only one character is already the lexicographically smallest palindrome.

Example 2:

Input: s = "babab"

Output: "abbba"

Explanation:

Rearranging "babab" → "abbba" gives the smallest lexicographic palindrome.

Example 3:

Input: s = "daccad"

Output: "acddca"

Explanation:

Rearranging "daccad" → "acddca" gives the smallest lexicographic palindrome.a */






class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();

        char[] half = s.substring(0, n/2).toCharArray();
        Arrays.sort(half);

        String res = 
            new String(half) 
            + ((n & 1) == 1 ? s.charAt(n / 2): "") 
            + new StringBuilder(new String(half)).reverse();
            return res;
    }
}