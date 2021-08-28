class Solution {
    public int countDigit(int n) {
        return (int)Math.floor(Math.log10(n) + 1);
    }
    
    public int findNumbers(int[] nums) {
        int ans = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            if (countDigit(nums[i]) % 2 == 0)
                ans++;
        }
        return ans;
    }
}