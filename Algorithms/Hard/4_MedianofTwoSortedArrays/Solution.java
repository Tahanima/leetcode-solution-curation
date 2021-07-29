class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0.0;
        int m = nums1.length;
        int n = nums2.length;
        int combinedArr[] = new int[m+n];
        int i = 0, j = 0, k = 0; 
        
        while (i < m && j < n) { 
            if (nums1[i] <= nums2[j]) { 
                combinedArr[k] = nums1[i]; 
                i++; 
            } 
            else { 
                combinedArr[k] = nums2[j]; 
                j++; 
            } 
            k++; 
        }
        
        while (i < m) { 
            combinedArr[k] = nums1[i]; 
            i++; 
            k++; 
        } 
        
        while (j < n) { 
            combinedArr[k] = nums2[j]; 
            j++; 
            k++; 
        }
        
        if(combinedArr.length%2 == 0){
            median = (combinedArr[(combinedArr.length/2)-1] + combinedArr[combinedArr.length/2]) / 2.0;
        }
        else{
            median = (combinedArr[combinedArr.length/2]) / 1.0;
        }
        return median;   
    }
}