class Solution {
    int n;
    int[] memo = new int[50];

    private int solve(int step) {
        if (step == n) {
            return 1;
        } else if (step > n) {
            return 0;
        } else if (memo[step] != -1) {
            return memo[step];
        } else {
            memo[step] = solve(step + 1) + solve(step + 2);
            
            return memo[step];
        }
    }


    public int climbStairs(int n) {
        this.n = n;

        for (int i = 0; i < 50; i++) {
            memo[i] = -1;
        }

        return solve(0);
    }
}