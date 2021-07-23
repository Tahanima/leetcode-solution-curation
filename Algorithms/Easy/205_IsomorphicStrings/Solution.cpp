class Solution {
public:
    bool isIsomorphic(string s, string t) {
        int len = s.size();
        bool isIso = true;
        unordered_map<char, char> mapping;
        unordered_map<char, char> mappedTo;
        
        for (int i = 0; i < len; i++) {
            if (mapping.count(s[i])) {
                char ch = mapping[s[i]];
                
                if (t[i] != ch) {
                    isIso = false;
                    break;
                }
            } else {
                if (mappedTo.count(t[i])) {
                    isIso = false;
                    break;
                }
                
                mapping[s[i]] = t[i];
                mappedTo[t[i]] = s[i];
            }
        }
        
        return isIso;
    }
};