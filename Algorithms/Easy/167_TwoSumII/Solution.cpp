class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        int index1 = 0, index2 = numbers.size() - 1, sum;
        vector<int> answer;
        
        while(index1 < index2) {
            sum = numbers[index1] + numbers[index2];
            
            if(sum == target)
                break;
            else if(sum < target)
                index1++;
            else
                index2--;
        }
        
        answer.push_back(index1 + 1);
        answer.push_back(index2 + 1);
        
        return answer;
    }
};