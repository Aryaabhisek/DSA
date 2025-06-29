public class MultiplesOf2And3CN {
    public static int findSum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 || arr[i] % 3 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
