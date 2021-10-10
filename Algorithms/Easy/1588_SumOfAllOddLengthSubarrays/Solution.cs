public class Solution {
    public int SumOddLengthSubarrays(int[] arr) {
        int ans = 0, n = arr.Length;
        
        for (int len = 1; len <= n; len += 2) {
            int sum = 0;
            for (int i = 0; i < len; i++) {
                sum += arr[i];
            }
            ans += sum;
            for (int i = len; i < n; i++) {
                sum += (arr[i] - arr[i - len]);
                ans += sum;
            }
        }
        
        return ans;
    }
}