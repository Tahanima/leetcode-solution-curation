public class Solution {
    public int ArrayPairSum(int[] nums) {
        int n = nums.Length, answer = 0;
        Array.Sort(nums);
        
        for (int i = 0; i < n; i += 2)
            answer += nums[i];
        
        return answer;
    }
}