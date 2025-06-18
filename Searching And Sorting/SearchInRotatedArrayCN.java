/* Problem statement
You have been given a sorted array/list 'arr' consisting of ‘n’ elements.
 You are also given an integer ‘k’.
Now the array is rotated at some pivot point unknown to you.
For example, if 'arr' = [ 1, 3, 5, 7, 8], then after rotating 'arr' at index 3, 
the array will be 'arr' = [7, 8, 1, 3, 5].
Now, your task is to find the index at which ‘k’ is present in 'arr'.
Note :
1. If ‘k’ is not present in 'arr', then print -1.
2. There are no duplicate elements present in 'arr'. 
3. 'arr' can be rotated only in the right direction.
 */

import java.util.ArrayList;

public class Solution {
    public static int search(ArrayList<Integer> arr, int n, int k) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == k) {
                return i;
            }
        }
        return -1; 
    }
}
