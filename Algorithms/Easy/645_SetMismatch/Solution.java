class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length, sumXor = 0;
        int mark[] = new int[n + 1];
        int ans[] = new int[2];
        
        for (int i = 0; i < n; i++) {
            sumXor ^= nums[i] ^ (i + 1);
            
            if (mark[nums[i]] == 1) {
                ans[0] = nums[i];
            }
            
            mark[nums[i]]++;
        }
        
        ans[1] = sumXor ^ ans[0];
        return ans;
    }
}