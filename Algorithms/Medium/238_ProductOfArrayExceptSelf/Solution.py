class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        prefix_prod = 1
        postfix_prod = 1
        res = []

        for i in range(len(nums)):
            res.append(prefix_prod)
            prefix_prod *= nums[i]
        
        for i in range(len(nums) - 1, -1, -1):
            res[i] = res[i] * postfix_prod
            postfix_prod *= nums[i]
        
        return res