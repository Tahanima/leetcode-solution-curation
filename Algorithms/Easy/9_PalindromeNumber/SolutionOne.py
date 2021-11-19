class Solution:
    def isPalindrome(self, x: int) -> bool:
        x_str = str(x)
        left_idx = 0        
        right_idx = len(x_str) - 1
        
        while left_idx < right_idx:
            if x_str[left_idx] != x_str[right_idx]:
                return False
            
            left_idx += 1
            right_idx -= 1
            
        return True