class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        const int MX = 1e6 + 5;
        bitset<MX> mask;
        
        for (int i = 0; i < nums.size(); i++) {
            if (mask[nums[i]] == 1) return nums[i];
            mask[nums[i]] = 1;
        }
        return 0;
    }
};
