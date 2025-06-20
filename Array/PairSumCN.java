import java.util.* ;
public class PairSumCN{
    public static List<int[]> pairSum(int[] arr, int s) {

        List<int[]> list= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==s){
                    int[] d =new int[]{arr[i],arr[j]};
                    Arrays.sort(d);
                    list.add(d);
                }
            }
        }
        Collections.sort(list,(a,b)->a[0]==b[0]?a[1]-b[1]:a[0]-b[0]);
        return list;
    }
}