class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        num_idx_map = {}

        for idx, num in enumerate(nums):
            difference = target - num            
            if difference in num_idx_map:                
                return [num_idx_map[difference], idx]
            else:
                num_idx_map[num] = idx