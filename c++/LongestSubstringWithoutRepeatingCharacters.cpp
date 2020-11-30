class LongestSubstringWithoutRepeatingCharacters {
public:    
  int lengthOfLongestSubstring(string s) {
    int mark[500] = {0}, len = s.size(), en = 0, mx = 0, cnt = 0;
    
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
        mx = max(mx, cnt);
      }
    }  
    return mx;
  }
};