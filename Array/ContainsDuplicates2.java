class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0;i < n - 1;i++){
            for (int j = i + 1; j <= i + k && j < n;j++){
                if (nums[i] == nums[j]){
                    return true;
                    
                }
            }

        }
     return false;   
    }
}