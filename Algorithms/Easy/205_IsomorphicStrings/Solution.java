class Solution {
    public boolean isIsomorphic(String s, String t) {
        int len = s.length();
        boolean isIso = true;
        int[] mapping = new int[130];
        int[] mappedTo = new int[130];
        
        for (int i = 0; i < len; i++) {
            if (mapping[s.codePointAt(i)] > 0) {
                int val = mapping[s.codePointAt(i)];
                
                if (t.codePointAt(i) != val) {
                    isIso = false;
                    break;
                }
            } else {
                if (mappedTo[t.codePointAt(i)] > 0) {
                    isIso = false;
                    break;
                }
                
                mapping[s.codePointAt(i)] = t.codePointAt(i);
                mappedTo[t.codePointAt(i)] = s.codePointAt(i);
            }
        }
        
        return isIso;
    }
}