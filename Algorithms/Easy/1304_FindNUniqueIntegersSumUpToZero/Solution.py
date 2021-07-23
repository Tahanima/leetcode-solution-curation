class Solution(object):
    def sumZero(self, n):
        """
        :type n: int
        :rtype: List[int]
        """
        answer = [i for i in range(1, (n // 2) + 1)]
        answer += [-i for i in answer]

        return answer if (n % 2 == 0) else answer + [0]