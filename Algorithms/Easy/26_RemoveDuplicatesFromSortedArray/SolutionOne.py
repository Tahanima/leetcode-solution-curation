class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        # travers through the array
        # keep count of unique elements k
        # first one is always unique, so let k=1
        # if two number doesn't match store 2nd number on k'th index of nums

        k = 1
        for i in range(len(nums) - 1):
            if nums[i] != nums[i + 1]:
                nums[k]  = nums[i + 1]
                k += 1
        
        return k