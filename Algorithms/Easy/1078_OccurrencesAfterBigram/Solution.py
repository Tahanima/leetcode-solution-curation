class Solution:
    def findOcurrences(self, text: str, first: str, second: str) -> List[str]:
        arrayOfWords = text.split()
        thirdWords = list()
        for i in range(1, len(arrayOfWords) - 1):
            if arrayOfWords[i] == second and arrayOfWords[i-1] == first:
                thirdWords.append(arrayOfWords[i+1])
        return thirdWords
                