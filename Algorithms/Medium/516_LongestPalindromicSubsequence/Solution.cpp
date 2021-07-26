class Solution {
public:
    int longestPalindromeSubseq(string s) {
        
        int len=s.length();
        
        int dp[len+1][len+1];
        memset(dp,0,sizeof(dp));
        
        for(int i=0;i<len;i++) dp[i][i]=1;
        
        for(int k=2;k<=len;k++)
        {
            for(int i=0;i<len-k+1;i++)
            {
                int j=i+k-1;
                if(s[i]==s[j])
                    dp[i][j]=2+dp[i+1][j-1];
                else dp[i][j]=max(dp[i+1][j],dp[i][j-1]);
            }
        }
        return dp[0][len-1];
    }
};
