class Solution {
public:
    vector<int> findErrorNums(vector<int>& nums) {
        int n = nums.size(), sumXor = 0;
        int mark[n + 1];
        memset(mark, 0, sizeof(mark));
        vector<int> ans;
        
        for (int i = 0; i < n; i++) {
            sumXor ^= nums[i] ^ (i + 1);
            
            if (mark[nums[i]] == 1) {
                ans.push_back(nums[i]);
            }
            
            mark[nums[i]]++;
        }
        
        ans.push_back(sumXor ^ ans[0]);
        return ans;
    }
};