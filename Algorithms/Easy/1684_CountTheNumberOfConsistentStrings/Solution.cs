public class Solution {
    public int MarkCharacters(String word) {
        int marked = 0;
        
        foreach (char ch in word.ToCharArray()) {
            int position = ch - 'a';
            marked |= 1 << position;
        }
        
        return marked;
    }
    
    public int CountConsistentStrings(string allowed, string[] words) {
        int markedAllowed = MarkCharacters(allowed);
        int answer = 0;
        
        foreach (String word in words) {
            int markedWord = MarkCharacters(word);
            
            if ((markedWord & markedAllowed) == markedWord)
                answer++;
        }
        
        return answer;
    }
}