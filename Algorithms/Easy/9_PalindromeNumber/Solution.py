class Solution(object):
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
            
        b =int(str(x) [::-1])
        if b == x:
            return True
        return False