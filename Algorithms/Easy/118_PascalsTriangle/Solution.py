class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        triangle = []
        first_row = [1]

        triangle.append(first_row)

        for i in range(1, numRows):
            prev_row = triangle[i - 1]
            new_row = [1]

            for j in range(1, i):
                new_row.append(prev_row[j - 1] + prev_row[j])
            
            new_row.append(1)
            triangle.append(new_row)
        
        return triangle