class Solution:
    def romanToInt(self, s: str) -> int:
        # Integer values of the roman numbers
        values = { "I": 1 , "V": 5 , "X": 10 , "L": 50 , "C": 100 , "D": 500 , "M": 1000 }

        num = 0

        left = 0

        size = len(s)

        for i in range(size-1, -1, -1):
            current = values[s[i]]

            if (current >= left):
                num += current
            else:
                num -= current
            left = current

        return num
