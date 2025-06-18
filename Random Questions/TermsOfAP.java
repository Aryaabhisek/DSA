/* Problem statement
Ayush is given a number ‘X’. He has been told that he has to find the first ‘X’ terms of the series 3 * ‘N’ + 2,
 which are not multiples of 4. Help Ayush to find it as he has not been able to answer.

Example: Given an ‘X’ = 4. The output array/list which must be passed to Ayush will be [ 5, 11, 14, 17 ].

Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= T <= 10^2
1 <= X <= 10^5

Time Limit: 1 sec */

import java.util.* ;
import java.io.*; 
public class Solution {
	public static int[] termsOfAP(int x){
		// Write your code here.
		int[] ans = new int[x];
		int i=1;
		int j=0;
		while(x>0){
			int y = 3*i+2;
			if(y%4!=0){
			ans[j++] = y;
			x--;
			i++;
			}
			else{
				i++;
			}
		}
		return ans;
	}
}