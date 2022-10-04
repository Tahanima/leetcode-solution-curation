class Solution {
    public boolean isOverlapping(int s0, int e0, int s1, int e1) {
        if (s0 <= s1 && e0 >= e1) {
            return true;
        } else if (s0 >= s1 && e0 <= e1) {
            return true;
        } else if (e0 >= s1 && e0 <= e1) {
            return true;
        } else if (s0 >= s1 && s0 <= e1) {
            return true;
        } else {
            return false;
        }
    }
    
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[] tempInterval = new int[100005];
        int minStart = newInterval[0];
        int maxStart = newInterval[0];
        int size = 0;
        
        for (int i = 0; i < 100005; tempInterval[i] = -1, i++);
        
        for (int[] interval: intervals) {
            minStart = Math.min(minStart, interval[0]);
            maxStart = Math.max(maxStart, interval[0]);
            
            if (isOverlapping(interval[0], interval[1], newInterval[0], newInterval[1])) {
                newInterval[0] = Math.min(interval[0], newInterval[0]);
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            } else {
                tempInterval[interval[0]] = interval[1];
                size++;
            }
        }
        
        tempInterval[newInterval[0]] = newInterval[1];
        size++;
        
        int[][] answer = new int[size][2];

        for (int i = minStart, j = 0; i <= maxStart; i++) {
            if (tempInterval[i] >= 0) {
                answer[j][0] = i;
                answer[j++][1] = tempInterval[i];
            }
        }
        
        return answer;
    }
}