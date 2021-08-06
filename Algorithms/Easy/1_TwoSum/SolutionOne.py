class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # creating a list with their respective indices
        num_with_idx = [(num, idx) for idx, num in enumerate(nums)]
        # sorting list of tuple based on their first value
        num_with_idx = sorted(num_with_idx, key=lambda x: x[0])

        # Two-Pointer approach
        left_idx = 0
        right_idx = len(nums) - 1

        while left_idx < right_idx:
            sum_result = num_with_idx[left_idx][0] + num_with_idx[right_idx][0]
            if sum_result > target:
                right_idx -= 1
            elif sum_result < target:
                left_idx += 1
            elif sum_result == target:
                return [num_with_idx[left_idx][1], num_with_idx[right_idx][1]]        