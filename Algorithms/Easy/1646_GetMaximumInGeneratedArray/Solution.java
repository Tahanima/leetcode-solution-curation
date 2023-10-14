class Solution {
    public int getMaximumGenerated(int n) {
        int[] nums = new int[n + 1];
        int max = 0;

        for (int i = 0; i <= n; i++) {
            if (i < 2) {
                nums[i] = i;
            } else if (i % 2 == 0) {
                nums[i] = nums[i / 2];
            } else {
                nums[i] = nums[(i - 1) / 2] + nums[1 + (i - 1) / 2];
            }

            max = Math.max(max, nums[i]);
        }

        return max;
    }
}