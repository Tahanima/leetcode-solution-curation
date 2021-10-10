class Solution {
public:
    vector<int> sortArrayByParity(vector<int>& nums) {
        vector<int> even, odd, ans;
        int n = nums.size();
        
        for (int i = 0; i < n; i++) {
            if (nums[i] & 1)
                odd.push_back(nums[i]);
            else
                even.push_back(nums[i]);
        }
        
        for (int i = 0; i < even.size(); ans.push_back(even[i]), i++);
        for (int i = 0; i < odd.size(); ans.push_back(odd[i]), i++);
        
        return ans;
    }
};