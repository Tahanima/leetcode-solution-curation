public class Solution {
    public int LengthOfLongestSubstring(string s) {
        int[] mark = new int[500];
        int len = s.Length, en = 0, mx = 0, cnt = 0;
        
        for (int st = 0; st < len; st++) {
            if (mark[s[st]] > 0) {
                for (; en < st; en++) {
                    if (s[en] == s[st]) {
                        en++;
                        break;
                    }
                    
                    cnt--;
                    mark[s[en]]--;
                }
            } else {
                cnt++;
                mark[s[st]]++;
                mx = Math.Max(mx, cnt);
            }
        }              
        
        return mx; 
    }
}