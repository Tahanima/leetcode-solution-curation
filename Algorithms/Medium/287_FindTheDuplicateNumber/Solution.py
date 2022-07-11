from typing import List

class Solution:
    def _get_count_of_equal_or_less(self, num_arr: List[int], value: int) -> int:
        return len([num for num in num_arr if num <= value])

    def findDuplicate(self, nums: List[int]) -> int:        
        left = 1
        right = len(nums) - 1

        duplicate_number = -1

        while left <= right:
            mid = (left + right)//2

            equal_or_less_count = self._get_count_of_equal_or_less(num_arr=nums, value=mid)

            if equal_or_less_count > mid:
                right = mid - 1
                duplicate_number = mid
            else:
                left = mid + 1                    

        return duplicate_number
        