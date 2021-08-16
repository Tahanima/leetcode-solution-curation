class Solution(object):
    def isPalindrome(self, x): # type x : int & return type: bool
        if x < 0:
            return False
        b =int(str(x) [::-1])
        if b == x:
            return True
        return False