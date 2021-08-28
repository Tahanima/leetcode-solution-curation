public class Solution {
    public int[] ReplaceElements(int[] arr) {
        int size = arr.Length, maxVal = -1;
        int[] answer = new int[size];
        
        for (int i = size - 1; i >= 0; i--) {
            answer[i] = maxVal;
            maxVal = Math.Max(maxVal, arr[i]);
        }
        
        return answer; 
    }
}