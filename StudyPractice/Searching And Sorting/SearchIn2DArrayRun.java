public class SearchIn2DArrayRun {
    public static void main(String[] args){
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 76, 89, 34},
            {23, 45, 74, 89},
            {12, 43, 83, 57}
        };

        int target = 74;
        int[] ans = SearchIn2D(arr, target); 
        System.out.println("Target found at: [" + ans[0] + ", " + ans[1] + "]");
    }

    static int[] SearchIn2D(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
