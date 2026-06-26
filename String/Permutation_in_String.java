/* Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.

 

Example 1:

Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:

Input: s1 = "ab", s2 = "eidboaoo"
Output: false
 

Constraints:

1 <= s1.length, s2.length <= 104
s1 and s2 consist of lowercase English letters. */






class Solution {

    static boolean compareFreq(int[] count1, int[] count2) {
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] count1 = new int[26];

        // Frequency of s1
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int index = ch - 'a';
            count1[index]++;
        }

        int windowLength = s1.length();
        int[] count2 = new int[26];

        // First window
        int i = 0;
        for (; i < windowLength; i++) {
            char ch = s2.charAt(i);
            int index = ch - 'a';
            count2[index]++;
        }

        if (compareFreq(count1, count2)) {
            return true;
        }

        // Sliding window
        while (i < s2.length()) {
            char newChar = s2.charAt(i);
            int newCharIndex = newChar - 'a';
            count2[newCharIndex]++;

            int oldCharIndex = i - windowLength;
            char oldChar = s2.charAt(oldCharIndex);
            int oldIndex = oldChar - 'a';
            count2[oldIndex]--;

            if (compareFreq(count1, count2)) {
                return true;
            }

            i++;
        }

        return false;
    }
}