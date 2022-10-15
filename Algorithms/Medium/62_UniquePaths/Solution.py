class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        
        bottomRow = [1]*n
        
        for column in range(m - 1):
            newRow = [1]*n
            for i in range(n-2, -1, -1):
                newRow[i] = newRow[i + 1] + bottomRow[i]
            bottomRow = newRow
        
        return bottomRow[0]