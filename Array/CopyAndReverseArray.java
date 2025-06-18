/* You are given an array 'ARR' consisting of 'N' non-negative integers,
 your task is to copy the elements of 'ARR' into another array 'COPY_ARR' in reverse order.

For example:
If 'ARR' contains the following elements [ 1, 2, 3, 4, 5 ], 
then you should return another array that is equal to [ 5, 4, 3, 2, 1]. */


import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] copyAndReverse(int[] arr, int n) {
        int p=n-1;
        for(int i=0;i<n/2;i++){

            int temp=arr[i];
            arr[i]=arr[p];
            arr[p]=temp;
            p--;
        }
        return arr;
    }
}