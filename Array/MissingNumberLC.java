class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0 ;i < n ;i++){
            sum=sum + nums[i];

        }
        int realSum = (n * (n+1)) / 2;
        return (realSum - sum);
    }
}