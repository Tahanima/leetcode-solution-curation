class Solution:
    def fib(self, n: int) -> int:
        dp = [0 for x in range(n+1)]
        dp[0] = 0
        if n >= 1:
            dp[1] = 1
            for x in range(2,n+1):
                dp[x] = dp[x-1]+dp[x-2]
        return dp[-1]
        