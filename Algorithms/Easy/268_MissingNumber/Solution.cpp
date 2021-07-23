class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n = nums.size();
        int missing = n;
        
        for (int i = 0; i < n; i++)
            missing ^= i ^ nums[i];
        
        return missing;
    }
};