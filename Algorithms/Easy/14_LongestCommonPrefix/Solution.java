class Solution {
    public static boolean isCommonForLength(int size, String[] strs) {
        String substr = "";
        
        for (String s: strs) {
            if (s.length() < size) {
                return false;
            }
            
            if (substr.equals("")) {
                substr = s.substring(0, size);
            } else {
                if (!substr.equals(s.substring(0, size))) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public String longestCommonPrefix(String[] strs) {
        int lo = 0, hi = 201, mid = 0;
        
        for (int iter = 0; iter <= 8; iter++) {
            mid = (lo + hi) / 2;
            
            if (isCommonForLength(mid, strs)) {
                lo = mid;
            } else {
                hi = mid;
            }
        }
        
        return mid > 0 ? strs[0].substring(0, mid): ""; 
    }
}