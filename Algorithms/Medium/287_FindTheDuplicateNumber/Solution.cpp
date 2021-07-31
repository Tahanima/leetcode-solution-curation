class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int n = nums.size();
        
        for (int i = 0; i < n - 1; i++)
        {
            if(nums[i] == nums[i + 1])
                return nums[i];
        }
        
        return -1;
    }
};

// Time Complexity: O(nlogn)
// Space Complexity: O(n)
