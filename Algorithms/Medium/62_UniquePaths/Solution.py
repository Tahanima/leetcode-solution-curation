class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        bottom_row = [1] * n
        
        for column in range(m - 1):
            new_row = [1] * n

            for i in range(n - 2, -1, -1):
                new_row[i] = new_row[i + 1] + bottom_row[i]
                
            bottom_row = new_row
        
        return bottom_row[0]
