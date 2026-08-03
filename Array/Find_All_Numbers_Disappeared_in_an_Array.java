/* Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2] */


class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);

        int n = nums.length;
        int expected = 1;

        for (int i = 0; i < n; i++) {
            while (expected < nums[i]) {
                ans.add(expected);
                expected++;
            }

            if (expected == nums[i]) {
                expected++;
            }
        }

        while (expected <= n) {
            ans.add(expected);
            expected++;
        }

        return ans;
    }
}