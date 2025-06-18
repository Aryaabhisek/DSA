//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

//You must implement a solution with a linear runtime complexity and use only constant extra space.


class Solution {
    public int singleNumber(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            k = k ^ nums[i];
        }
        return k;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4, 1, 2, 1, 2}; // Example input
        int result = solution.singleNumber(nums);
        System.out.println("The single number is: " + result);
    }
}