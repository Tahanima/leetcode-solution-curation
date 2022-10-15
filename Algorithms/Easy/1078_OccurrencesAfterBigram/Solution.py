class Solution:
    def findOcurrences(self, text: str, first: str, second: str) -> List[str]:
        array_of_words = text.split()
        third_words = list()

        for i in range(1, len(array_of_words) - 1):
            if array_of_words[i] == second and array_of_words[i - 1] == first:
                third_words.append(array_of_words[i + 1])

        return third_words         