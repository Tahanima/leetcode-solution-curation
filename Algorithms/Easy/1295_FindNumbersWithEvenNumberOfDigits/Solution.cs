public class Solution {
    public int CountDigit(int n) {
        return (int)Math.Floor(Math.Log10(n) + 1);
    }
    
    public int FindNumbers(int[] nums) {
        int ans = 0, n = nums.Length;
        for (int i = 0; i < n; i++) {
            if (CountDigit(nums[i]) % 2 == 0)
                ans++;
        }
        return ans;
    }
}