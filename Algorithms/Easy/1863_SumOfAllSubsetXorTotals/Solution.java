class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length, sum = 0;
        int limit = (1 << n) - 1;
        
        for (int mask = 1; mask <= limit; mask++) {
            int _xor = 0;
            for (int pos = 0; pos < n; pos++) {
                if ((mask & (1 << pos)) > 0) {
                    _xor ^= nums[pos];
                }
            }
            sum += _xor;
        }
        
        return sum;
    }
}