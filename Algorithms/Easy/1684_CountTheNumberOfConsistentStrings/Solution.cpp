class Solution {
public:
    int markCharacters(string &word) {
        int marked = 0;
        
        for (char ch : word) {
            int position = ch - 'a';
            marked |= 1 << position;
        }
        
        return marked;
    }
        
    int countConsistentStrings(string allowed, vector<string>& words) {
        int markedAllowed = markCharacters(allowed);
        int answer = 0;
        
        for (string word : words) {
            int markedWord = markCharacters(word);
            
            if ((markedWord & markedAllowed) == markedWord)
                answer++;
        }
        
        return answer;
    }
};