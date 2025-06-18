/* Problem statement
You are given an array of integers 'ARR' of size 'N' and another integer 'K'.
Your task is to find and return 'K'th smallest value present in the array.
Note: All the elements in the array are distinct.
Example
If 'N' is 5 and 'K' is 3 and the array is 7, 2, 6, 1, 9

Sorting the array we get 1, 2, 6, 7, 9

Hence the 3rd smallest number is 6. */
class Solution {
    public static int kthSmallest(int n,int k, int[]arr) {
        int temp;
        for(int i = 0;i < n - 1;i++){
            for(int j = i+1;j < n;j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
    return arr[k - 1];
    }    
}
