class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n = nums.size();

        if(n == 1 && nums[0] != 0) {
            return 0;
        }

        unordered_map<int, int> m;

        for(int i=0; i<n; i++) {
            m[nums[i]]++;
        }

        for(int i=0; i<=n; i++) {
            if(m.find(i) == m.end()) {
                return i;
            }
        }
        return -1;
    }
};