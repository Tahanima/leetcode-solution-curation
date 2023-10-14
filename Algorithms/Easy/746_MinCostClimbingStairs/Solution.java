class Solution {
    int[] cost;
    int[] memo;
    int n;

    private int solve(int pos) {
        if (pos >= n) {
            return 0;
        } else if (memo[pos] != -1) {
            return memo[pos];
        } else {
            memo[pos] = cost[pos] + Math.min(solve(pos + 1), solve(pos + 2));

            return memo[pos];
        }
    }

    public int minCostClimbingStairs(int[] cost) {
        this.cost = cost;
        n = cost.length;
        memo = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            memo[i] = -1;
        }

        return Math.min(solve(0), solve(1));
    }
}