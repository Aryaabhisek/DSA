//Given an array ‘arr’ of size ‘n’ find the largest element in the array.
//Example:
//Input: 'n' = 5, 'arr' = [1, 2, 3, 4, 5]
//Output: 5
//Explanation: From the array {1, 2, 3, 4, 5}, the largest element is 5.

import java.util.* ;

import java.io.*; 
class Solution {
    static int largestElement(int[] arr, int n) {
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}