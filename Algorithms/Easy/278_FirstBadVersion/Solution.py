# The isBadVersion API is already defined for you.
# @param version, an integer
# @return an integer
# def isBadVersion(version):

class Solution:
    def firstBadVersion(self, n):
        """
        :type n: int
        :rtype: int
        """
        left_version = 1
        right_version = n
        
        while left_version < right_version:
            mid_version = (left_version + right_version)//2
            
            if isBadVersion(mid_version):
                right_version = mid_version
            else:
                left_version = mid_version + 1
        
        return left_version
