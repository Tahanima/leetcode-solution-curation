class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<pair<int,int>> valueIndexPair;
	    vector<int> returnVector;	
	    int index1, index2, sum;

        for(int k = 0; k < nums.size(); k++) {
            valueIndexPair.push_back(pair<int,int>(nums[k], k));
        }
        
        sort(valueIndexPair.begin(), valueIndexPair.end());
        
	    index1 = 0;
	    index2 = valueIndexPair.size() - 1;

        while(index1 < index2) {
            sum = valueIndexPair[index1].first + valueIndexPair[index2].first;
            
	        if(sum == target)
                break;
            else if(sum < target)
                index1++;
            else
                index2--;
        }
        
        returnVector.push_back(valueIndexPair[index1].second);
        returnVector.push_back(valueIndexPair[index2].second);
        
        return returnVector;
    }
};