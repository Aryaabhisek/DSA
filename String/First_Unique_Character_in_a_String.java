/* Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:
Input: s = "leetcode"
Output: 0
Explanation:
The character 'l' at index 0 is the first character that does not occur at any other index.
Example 2:
Input: s = "loveleetcode"
Output: 2
Example 3:
Input: s = "aabb"
Output: -1
 */

 
class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26]; // for 'a' to 'z'
        // Step 1: Count frequency of each char
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        // Step 2: Find the first index with freq = 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1; // no unique character
    }
}
