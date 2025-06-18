/* Problem statement
You are given two numbers 'a' and 'b' as input.
You must swap the values of 'a' and 'b'.
For Example:
Input: 
'a' = 8, 'b' = 5
Output:
5 8
Explanation:
Initially, the value of 'a' and 'b' is 8 and 5, respectively.
After swapping, the value of 'a' is 5, and the value of 'b' is 8. */

class Solution{
    public static void swapNumber(int []a, int []b) {
        for(int i=0;i<a.length;i++){
            int temp=a[i];
            a[i]=b[i];
            b[i]=temp;
        }
    }
}