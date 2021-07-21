class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int[] mark = new int[500];
        int len = s.length(), en = 0, mx = 0, cnt = 0;
        
        for (int st = 0; st < len; st++) {
            if (mark[s.charAt(st)] > 0) {
                for (; en < st; en++) {
                    if (s.charAt(en) == s.charAt(st)) {
                        en++;
                        break;
                    }
                    
                    cnt--;
                    mark[s.charAt(en)]--;
                }
            } else {
                cnt++;
                mark[s.charAt(st)]++;
                mx = Math.max(mx, cnt);
            }
        }              
        
        return mx; 
    }
}