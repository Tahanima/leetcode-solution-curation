class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        boolean hasWordCountStarted = false;
        
        for (int i = s.length() - 1; i > -1; i--) {
            if (s.charAt(i) == ' ' && hasWordCountStarted) 
                return len;
            
            if (s.charAt(i) != ' ') {
                hasWordCountStarted = true;
                len++;
            }
        }
        
        return len;
    }
}
