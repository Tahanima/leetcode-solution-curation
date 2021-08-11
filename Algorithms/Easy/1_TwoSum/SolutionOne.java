class SolutionOne {
    public int[] twoSum(int[] nums, int target) {
        // Outer for loop
        for (int i = 0; i < nums.length; i++) {
            // Inner for loop
            for (int j = 0; j < nums.length; j++) {
                // Comparing if they are not the same numbers
                if ((i != j) && (nums[i] + nums[j] == target)) {
                    return new int[] { i, j };
                }
            }
        }
        // Returning an empty int array (only if the target has not been found)
        return new int[0];
    }
}