public class FindMinimumRun {
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5, 6, 8, 7, 9};
        int ans = FindMin(nums);  
        System.out.println(ans);  
    }

    static int FindMin(int[] arr) {
        if (arr.length == 0) {
            return -1; 
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
