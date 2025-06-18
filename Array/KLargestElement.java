/* Problem statement
You are given an unsorted array containing ‘N’ integers.
 You need to find ‘K’ largest elements from the given array.
  Also, you need to return the elements in non-decreasing order.

Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= T <= 100
1 <= N <= 10^4  
1<= K <= N  
-10^9 <= ARR[i] <= 10^9

Where ‘T’ is the number of test cases, ‘N’ is the size of the array,
 ‘K’ is the number of elements you need to return as an answer and ARR[i] is the size of the array of elements.

Time Limit: 1 sec */

import java.util.Arrays;
public class Solution {
    public static int[] Klargest(int[] a, int k, int n) {
        Arrays.sort(a);
        int[] result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=a[n-k+i];
        }
       return result; 
    }
}