class Solution:
    def maxArea(self, height: List[int]) -> int:
        max_area = 0
        a_pointer, b_pointer = 0, len(height) - 1

        while a_pointer < b_pointer:
            if height[a_pointer] < height[b_pointer]:
                max_area = max(max_area, height[a_pointer] * (b_pointer - a_pointer)) 
                a_pointer += 1
            else:
                max_area = max(max_area, height[b_pointer] * (b_pointer - a_pointer)) 
                b_pointer -= 1

        return max_area