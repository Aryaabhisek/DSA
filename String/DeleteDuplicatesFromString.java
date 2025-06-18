/* Problem statement
Given a string S, remove consecutive duplicates from it recursively.
Sample Input 1 :
aabccba
Sample Output 1 :
abcba */

public class Solution {

	public static String removeConsecutiveDuplicates(String s) {
		String op ="";
		op+=s.charAt(0);
		for (int i = 1; i < s.length();i++){
			if (s.charAt(i) != s.charAt(i-1) ){
				op+=s.charAt(i);

			}
		}
		return op;

	}

}