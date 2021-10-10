int sumOddLengthSubarrays(int* arr, int arrSize){
    int ans = 0;
    
    for (int len = 1; len <= arrSize; len += 2) {
        int sum = 0;
        
        for (int i = 0; i < len; i++) {
            sum += arr[i];
        }
        
        ans += sum;
        
        for (int i = len; i < arrSize; i++) {
            sum += (arr[i] - arr[i - len]);
            ans += sum;
        }
    }
        
    return ans;
}