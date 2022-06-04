class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        # go through the array,
        # if nth item and (n+1)th item match, pop nth item, but don't forward
        # otherwise go forward

        i = 1
        
        while i < len(nums):
            if nums[i - 1] == nums[i]:
                nums.pop(i - 1)
            else:
                i += 1

        return len(nums)
