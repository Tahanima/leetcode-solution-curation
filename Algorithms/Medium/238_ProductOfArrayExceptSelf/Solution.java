class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] ans = new int[size];
        int product = 1;
        
        for (int i = 0; i < size; i++) {
            ans[i] = product;
            product *= nums[i];
        }
        
        product = 1;
        for (int i = size - 1; i >= 0; i--) {
            ans[i] *= product;
            product *= nums[i];
        }
        
        
        return ans;
    }
}