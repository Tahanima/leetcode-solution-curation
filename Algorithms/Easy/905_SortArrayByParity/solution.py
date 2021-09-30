from typing import List


class Solution:
    def sortArrayByParity(self, nums: List[int]) -> List[int]:
        l, r = 0, len(nums) - 1
        while l < r:
            if nums[l] % 2:
                while l < r and nums[r] % 2:
                    r -= 1
                nums[l], nums[r] = nums[r], nums[l]
            l += 1
        return nums