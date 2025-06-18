/* Problem statement
You have been given a 2-D array 'mat' of size 'M x N' where 'M' and 'N' denote the number of rows and columns, 
respectively. The elements of each row are sorted in non-decreasing order.
Moreover, the first element of a row is greater than the last element of the previous row (if it exists).
You are given an integer ‘target’, and your task is to find if it exists in the given 'mat' or not.

Example:
Input: ‘M’ = 3, 'N' = 4, ‘mat’ = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]], ‘target’ = 8

Output: true

Explanation: The output should be true as '8' exists in the matrix. */


import java.util.ArrayList;
public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        
        int n = mat.size();
        int m = mat.get(0).size();

        for (int i = 0; i < n; i++){
            for ( int j = 0;j < m; j++ ){
                if (mat.get(i).get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }
}
