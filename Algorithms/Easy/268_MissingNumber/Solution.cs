public class Solution {
    public int MissingNumber(int[] nums) {
        int n = nums.Length;
        int missing = n;
        
        for (int i = 0; i < n; i++)
            missing ^= i ^ nums[i];
        
        return missing;
    }
}