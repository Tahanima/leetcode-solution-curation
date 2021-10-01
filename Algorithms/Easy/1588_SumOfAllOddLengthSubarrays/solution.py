
from typing import List


class Solution:
    def sumOddLengthSubarrays(self, arr: List[int]) -> int:
        result = 0
        array_size = len(arr)

        for i in range(array_size):
            j = i
            while j < array_size:
                k = i
                while k <= j:
                    result = result + arr[k]
                    k += 1
                j += 2
        
        return result

