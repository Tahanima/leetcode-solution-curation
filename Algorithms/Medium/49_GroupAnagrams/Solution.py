class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        grp_anagrams = {}

        for string in strs:
            count = [0] * 26

            for char in string:
                count[ord(char) - ord("a")] += 1
            
            count = tuple(count)
            
            if grp_anagrams.get(count) == None:
                grp_anagrams[count] = []
            
            grp_anagrams[count].append(string)
        
        return grp_anagrams.values()