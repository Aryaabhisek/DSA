public class FrequencyInASortedArrayCN {
    public static int countOccurrences(int[] arr, int x) {
        int count = 0;
        for(int i = 0;i < arr.length;i++){
            if (arr[i] == x){
                while(i < arr.length && arr[i] == x){
                    count++;
                    i++;
                }
                break;
            }
        }
        return count;
    }
}