class Solution {
    public int[] replaceElements(int[] arr) {
        int size = arr.length, maxVal = -1;
        int[] answer = new int[size];
        
        for (int i = size - 1; i >= 0; i--) {
            answer[i] = maxVal;
            maxVal = Math.max(maxVal, arr[i]);
        }
        
        return answer;
    }
}