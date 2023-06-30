class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        count_t = {}
        count_s = {}
        
        for i in range(len(t)):
            count_t[t[i]] = count_t.get(t[i], 0) + 1
            count_s[s[i]] = count_s.get(s[i], 0) + 1
        
        for key in count_s.keys():
            if count_t.get(key) == None or count_t[key] != count_s[key]:
                return False

        return True 
