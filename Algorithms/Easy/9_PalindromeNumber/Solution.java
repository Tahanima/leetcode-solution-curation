class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        int reversedInteger = 0, lastDigit, temp;
        temp = x; // storing the original number to a temporary variable
        // Reversing the number
        while (temp != 0) {
            lastDigit = temp % 10;
            reversedInteger = reversedInteger * 10 + lastDigit;
            temp = temp / 10;
        }
        // checking if palindrome or not using condition
        if (reversedInteger == x)
            return true;
        else
            return false;
    }
}