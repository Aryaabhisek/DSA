import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class ReverseTheArray 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        
       int left = m+1;

       int right = arr.size()-1;

       while(left<right){

           int temp =arr.get(left);

           arr.set(left,arr.get(right));

           arr.set(right,temp);

           left++;

           right--;

       } 
    }
}
