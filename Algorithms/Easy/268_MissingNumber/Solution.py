class Solution(object):
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        missing = n
        
        for i in range(0, n):
            missing ^= i ^ nums[i]
        
        return missing