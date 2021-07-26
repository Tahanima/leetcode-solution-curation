class Solution {
public:
    int minDistance(string word1, string word2) {
        
        int len1=word1.length(),len2=word2.length();
        
        int dp[len1+2][len2+2];
        
        dp[0][0]=0;
        
        for(int i=1;i<=len1;i++)   
            dp[i][0]=i;           
        for(int j=1;j<=len2;j++)   
            dp[0][j]=j;
        
        for(int i=1;i<=len1;i++)
        {
            for(int j=1;j<=len2;j++)
            {
                if(word1[i-1]==word2[j-1])
                    dp[i][j]=dp[i-1][j-1];
                else dp[i][j]=1+min(dp[i-1][j], min(dp[i][j-1],dp[i-1][j-1])); 
            }
        }
        
        return dp[len1][len2];
    }
};
