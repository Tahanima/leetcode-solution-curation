class Solution {
public:
    string greatestLetter(string s) {
        
        int up[26]={0};
        int low[26]={0};
        int temp;
        char c;
        
        for (int i=0;i<s.length();i++)
        {
            if (s[i]>=97)
            {
                low[s[i]-'a']++;
            }
            else
            {
                up[s[i]-'A']++;
            }
        }
        string ans;
        for (int i=25;i>=0;i--)
        {
            if(low[i]!=0 && up[i]!=0)
            {
                ans=i+'A';
                break;
            }
        }
        
        return ans;
        
        
    }
};
