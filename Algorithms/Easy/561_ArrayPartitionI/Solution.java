class Solution {
    public int arrayPairSum(int[] nums) {
        int n = nums.length, answer = 0;
        Arrays.sort(nums);
        
        for (int i = 0; i < n; i += 2)
            answer += nums[i];
        
        return answer;
    }
}