class Solution {
    public int maxArea(int[] height) {
     int i = 0;
     int j = height.length - 1;

     int maxArea = Integer.MIN_VALUE; 

     while(i < j) { 
         int h = Math.min(height[i], height[j]);
         int width = j - i;

         maxArea = Math.max(maxArea, h*width);

         if(height[i] > height[j]) {
             j--;
         } else {
             i++;
         }

     }

     return maxArea;

    }
}