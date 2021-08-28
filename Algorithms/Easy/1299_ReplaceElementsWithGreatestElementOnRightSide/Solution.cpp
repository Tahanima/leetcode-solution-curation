class Solution {
public:
    vector<int> replaceElements(vector<int>& arr) {
        int size = arr.size(), maxVal = -1;
        vector<int> answer (size, 0);
        
        for (int i = size - 1; i >= 0; i--) {
            answer[i] = maxVal;
            maxVal = max(maxVal, arr[i]);
        }
        
        return answer;
    }
};