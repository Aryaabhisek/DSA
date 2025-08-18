/* Problem statement
You are given a sorted integer array 'arr' of size 'n'.
You need to remove the duplicates from the array such that each element appears only once.
Return the length of this new array.

For example:
'n' = 5, 'arr' = [1 2 2 2 3].
The new array will be [1 2 3].
So our answer is 3.
 */

 public class RemoveDuplicatesFromSortedArrayCN {
    public static int removeDuplicates(int[] arr, int n) {
        if (n == 0){
            return 0;
        }
        int i = 0;
        for (int j = 1; j < n; j++) {  
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j]; 
            }
        }
        return i + 1; 
    }
}
