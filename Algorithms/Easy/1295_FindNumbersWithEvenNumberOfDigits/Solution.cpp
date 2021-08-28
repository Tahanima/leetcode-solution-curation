class Solution {
public:
    int countDigit(int n) {
        return floor(log10(n) + 1);
    }
    
    int findNumbers(vector<int>& nums) {
        int ans = 0, n = nums.size();
        for (int i = 0; i < n; i++) {
            if (!(countDigit(nums[i]) & 1))
                ans++;
        }
        return ans;
    }
};