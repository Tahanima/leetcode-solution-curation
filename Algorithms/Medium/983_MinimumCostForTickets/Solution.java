class Solution {
    int[] memo = new int[400];

    public int solve(int i, int[] days, int[] costs) {
        if (i >= days.length) {
            return 0;
        }

        if (memo[i] > 0) {
            return memo[i];
        }

        memo[i] = 1000000;
        for (int j = 0; j < 3; j++) {
            int next = days[i] + ((j == 0) ? 1 : ((j == 1) ? 7: 30));
            int k = i;
            
            while (k < days.length && days[k] < next) {
                k++;
            }
            
            memo[i] = Math.min(memo[i], costs[j] + solve(k, days, costs));
        }
        
        return memo[i];
    }

    public int mincostTickets(int[] days, int[] costs) {
        return solve(0, days, costs);
    }
}