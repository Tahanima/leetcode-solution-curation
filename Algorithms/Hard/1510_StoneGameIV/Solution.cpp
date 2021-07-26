class Solution {
public:

    bool dp[int(1e5)];
    bool vis[int(1e5)];
    
    bool solve(int n)
    {
        if(n==0) return false;
        if(vis[n]) return dp[n];
        
        vis[n]=1;
        bool winner=false;
        
        for(int i=1;i*i<=n;i++)
        {
            if(solve(n-(i*i))==false)
            {
                winner=true;
                break;
            }
        }
               
        return dp[n]=winner;
        
    }
    bool winnerSquareGame(int n) {
    
       memset(dp,0,sizeof(dp));
       memset(dp,0,sizeof(vis));
       
       return solve(n);
    }
};
