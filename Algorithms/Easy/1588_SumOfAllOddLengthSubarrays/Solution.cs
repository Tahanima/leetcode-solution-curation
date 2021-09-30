public class Solution {
    public int SumOddLengthSubarrays(int[] arr) {
        int sum = 0;

        int l = arr.Length;

        for (int i = 0; i < l; i++) 
            for (int j = i; j < l; j += 2) 
                for (int k = i; k <= j; k++) 
                    sum += arr[k];

        return sum; 
        
    }
}