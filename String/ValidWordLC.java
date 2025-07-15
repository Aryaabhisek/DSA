/* A word is considered valid if:

It contains a minimum of 3 characters.
It contains only digits (0-9), and English letters (uppercase and lowercase).
It includes at least one vowel.
It includes at least one consonant.
You are given a string word. 
Return true if word is valid, otherwise, return false.

Example 1:

Input: word = "234Adas"
Output: true
Explanation:
This word satisfies the conditions. */

class Solution {
    public boolean isValid(String word) {

        int n = word.length();
        if (n < 3){
            return false;
        }

        int vowels = 0;
        int consonants = 0;

        for (char c : word.toCharArray()){
            if (Character.isLetter(c)){
                if ("aeiouAEIOU".indexOf(c) != -1){
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (!Character.isDigit(c)){
                return false;  
            }
        }

        return vowels >= 1 && consonants >= 1;
    }
}
