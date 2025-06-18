/* Problem statement
You are given a sorted array 'arr' of distinct values and a target value 'm'.
 You need to search for the index of the target value in the array.

Note:
1. If the value is present in the array, return its index.
2. If the value is absent, determine the index,
 where it would be inserted in the array while maintaining the sorted order. 
3. The given array has distinct integers.
4. The given array may be empty.

Example:
Input:  arr = [1, 2, 4, 7],  m = 6 

Output: 3

Explanation: If the given array 'arr' is: [1, 2, 4, 7] and m = 6. 
We insert m = 6 in the array and get 'arr' as: [1, 2, 4, 6, 7]. 
The position of 6 is 3 (according to 0-based indexing) */

import java.util.ArrayList;
public class Solution {

    public static int searchInsert(int [] arr, int k){
        int l=0,h=arr.length-1;
        while(l<=h){
            int m=(l+h)/2;
            if(arr[m]==k) return m;
            if(arr[m]<k) l=m+1;
            else h=m-1;
        }
        return l;
    }
}