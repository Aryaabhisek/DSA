/* Problem statement
You are given an array/list, 'arr’ of size ‘N’ update each element of the array
 by the value obtained by dividing the element by 4 (take only integer part). 
 If the value obtained by dividing element by 4 comes out to be 0, then update the element with value -1.

Note:
Do not return or print the array and make changes in the same array.
Example:
Let the array be [1,32,4], after dividing each number by 4 our array will become [0, 8, 1].
Now replace the 0 by -1 so that [0, 8, 1] -> [-1, 8, 1].
Hence the modified array will be [-1, 8, 1]. */

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
public class Solution {
    public static void divideByFour(ArrayList<Integer> arr){
        for(int i = 0; i < arr.size() ; i++){
            int val = arr.get(i);
            arr.set(i, val/4);
        }
        for(int i = 0; i < arr.size() ; i++){
            if(arr.get(i) == 0)arr.set(i, -1);
        }
    }
}