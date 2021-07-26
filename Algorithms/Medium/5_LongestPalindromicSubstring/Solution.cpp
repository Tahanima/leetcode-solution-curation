class Solution {
public:
    string longestPalindrome(string s) {
       
        int len=s.length();
        int dp[len+2][len+2];
        memset(dp, 0, sizeof(dp));
        
        int st,maxlen=0;
        
        for(int k=1;k<=len;k++)
        {
            for(int i=0;i<len-k+1;i++)
            {
                int j=i+k-1;
                
                if(i==j)
                    dp[i][j]=1;
                else if(i+1==j and s[i]==s[j])
                    dp[i][j]=1;
                else if(s[i]==s[j] and dp[i+1][j-1]==1)
                    dp[i][j]=1;
                
                if(dp[i][j]==1 and k>maxlen)
                {
                    st=i;
                    maxlen=k;
                }   
            }
        }
        
        string ret="";
        for(int i=st;i<st+maxlen;i++)
        {
            ret+=s[i];
        }
        
        return ret;
    }
};
