class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int count = 0;
        int diff = 0;

        for (int i = 2; i < n; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                diff += 1;
                count += diff; 
            } else {
                diff = 0;
            }
        }
        return count;
    }
}
