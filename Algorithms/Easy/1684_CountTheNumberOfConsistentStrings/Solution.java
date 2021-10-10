class Solution {
    public int markCharacters(String word) {
        int marked = 0;
        
        for (char ch : word.toCharArray()) {
            int position = Character.getNumericValue(ch);
            marked |= 1 << position;
        }
        
        return marked;
    }
    
    public int countConsistentStrings(String allowed, String[] words) {
        int markedAllowed = markCharacters(allowed);
        int answer = 0;
        
        for (String word : words) {
            int markedWord = markCharacters(word);
            
            if ((markedWord & markedAllowed) == markedWord)
                answer++;
        }
        
        return answer;
    }
}