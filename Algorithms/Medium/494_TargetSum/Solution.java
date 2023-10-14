class Solution {
    int[] nums;
    int n, target;
    HashMap<ArrayList<Integer>, Integer> dp = new HashMap<>();

    private int solve(int pos, int sum) {
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(pos);
        aList.add(sum);

        if (pos >= n) {
            if (sum == target) {
                return 1;
            }

            return 0;
        } else if (dp.containsKey(aList)) {
            return dp.get(aList);
        } else {
            int ans = solve(pos + 1, sum + nums[pos]);
            ans += solve(pos + 1, sum - nums[pos]);
            dp.put(aList, ans);

            return ans;
        }
    }

    public int findTargetSumWays(int[] nums, int target) {
        this.nums = nums;
        n = nums.length;
        this.target = target;

        return solve(1, nums[0]) + solve(1, -nums[0]);
    }
}