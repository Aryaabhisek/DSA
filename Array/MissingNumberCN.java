/* Problem statement
Given an array ‘a’ of size ‘n’-1 with elements of range 1 to ‘n’. 
The array does not contain any duplicates. Your task is to find the missing number.

For example:
Input:
'a' = [1, 2, 4, 5], 'n' = 5
Output :
3 */

public class MissingNumberCN {
    public static int missingNumber(int []a, int N) {
        //int N = a.length;
        int sum = 0;
        for (int i = 0;i < N;i++){
            sum = sum + a[i];
        }
        int realSum = N*(N+1) / 2;
        return (realSum - sum);
    }
    
}