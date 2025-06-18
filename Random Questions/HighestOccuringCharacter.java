/* Problem statement
For a given a string(str), find and return the highest occurring character.

Example:
Input String: "abcdeapapqarr"
Expected Output: 'a'
Since 'a' has appeared four times in the string which happens to be the highest frequency character, the answer would be 'a'.
If there are two characters in the input string with the same frequency, return the character which comes first. */

public class Solution {

    public static char highestOccuringChar(String str) {

        str = str.toLowerCase();
        int[] frequency = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            frequency[c]++;
        }

        int max = -1;
        char result = ' ';
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > max) {
                max = frequency[i];
                result = (char) i;
            }
        }

        return result;
    }
}