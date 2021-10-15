class Solution {
    public int thirdMax(int[] nums) {
        long max1 = -2147483649l;
        long max2 = -2147483649l;
        long max3 = -2147483649l;
        
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i] > max2 && nums[i] < max1) {
                max3 = max2;
                max2 = nums[i];
            } else if (nums[i] > max3 && nums[i] < max2) {
                max3 = nums[i];
            }
        }
            
        if (max3 == -2147483649l) {
            return (int)max1;
        }

        return (int)max3;
    }
}
