/* Problem statement
You are given an array/list ‘ARR’ of ‘N’ integers. You have to generate an array/list containing squares of each number in ‘ARR’, sorted in increasing order.

For example :

Input:
‘ARR’ = [-6,-3, 2, 1, 5] 

If we take a square of each element then the array/list will become [36, 9, 4, 1, 25].
Then the sorted array/list will be [1, 4, 9, 25, 36].

Output :
[1, 4, 9, 25, 36]. */

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Squares_of_a_sorted_arrayCN {
	public static ArrayList<Integer> sqsorted(ArrayList<Integer> arr) {
		
		int n = arr.size();
		ArrayList res = new ArrayList<>();
		for (int i = 0; i < n; i++){
			res.add(arr.get(i) * arr.get(i));
		}
		Collections.sort(res);
		return res;
	}
}