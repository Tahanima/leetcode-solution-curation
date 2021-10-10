class Solution:
    def longestCommonSubsequence(self, text1: str, text2: str) -> int:
        text1_length = len(text1)
        text2_length = len(text2)

        lcs_array = self._get_initialized_lcs_array(text1_length, text2_length)
                
        for idx_2, text2_char in enumerate(text2):
            row = idx_2 + 1
            for idx_1, text1_char in enumerate(text1):
                col = idx_1 + 1
                if text1_char == text2_char:
                    lcs_array[row][col] = lcs_array[row-1][col-1] + 1
                else:
                    lcs_array[row][col] = max(lcs_array[row][col-1], lcs_array[row-1][col])

        return lcs_array[row][col]

    def _get_initialized_lcs_array(self, text1_length, text2_length):
        return [[0]*(text1_length+1) for _ in range(text2_length + 1)]
