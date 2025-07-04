/* Problem statement
Aahad and Harshit always have fun by solving problems.
Harshit took a sorted array consisting of distinct integers and rotated it clockwise by an unknown amount. 
For example, he took a sorted array = [1, 2, 3, 4, 5] and if he rotates it by 2, then the array becomes: [4, 5, 1, 2, 3].

After rotating a sorted array, Aahad needs to answer Q queries asked by Harshit, 
each of them is described by one integer Q[i]. which Harshit wanted him to search in the array. For each query, 
if he found it, he had to shout the index of the number, otherwise, he had to shout -1.

For each query, you have to complete the given method where 'key' denotes Q[i]. 
If the key exists in the array, return the index of the 'key', otherwise, return -1.

Note:

Can you solve each query in O(logN) ? */

public class Solution {
    public static int search(int arr[], int key) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] <= arr[high]) {

                if (key > arr[mid] && key <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {

                if (key >= arr[low] && key < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }

        return -1;
    }
}
