public class FindFirstandLastPositionofElementInSortedArrayCN {
    public static int[] searchRange(int[] arr, int x) {
        int[] ar = new int[2];
        ar[0] = -1;
        ar[1] = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ar[0] = i;
                for (int j = i; j < arr.length; j++) {
                    if (arr[j] == x) {
                        ar[1] = j;
                    } else {
                        break;
                    }
                }
                break;
            }
        }
        return ar;
    }
}
