public class Solution {
    public int[] SumZero(int n) {
        int[] answer = new int[n];
        int index = 0;
    
        if (n % 2 == 1)
            answer[index++] = 0;
        
        n /= 2;
        
        for (int i = 1; i <= n; i++) {
            answer[index++] = i;
            answer[index++] = -i;
        }
        
        return answer;
    }
}