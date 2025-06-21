import java.util.ArrayList;

public class RotateArrayCN {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        int n=arr.size(); 
       ArrayList<Integer> temp=new ArrayList<>();
        for(int i=0;i<k;i++){
            temp.add(i, arr.get(i));
        }
        for(int i=k;i<n;i++){
            arr.set(i-k, arr.get(i));
        }
        for(int i=n-k;i<n;i++){
            arr.set(i, temp.get(i-(n-k)));
        }
        return arr;    
    }
}