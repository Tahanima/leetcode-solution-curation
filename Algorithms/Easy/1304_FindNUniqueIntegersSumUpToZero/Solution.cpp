class Solution {
public:
    vector<int> sumZero(int n) {
        vector<int> answer;
    
        if (n % 2 == 1)
            answer.push_back(0);
        
        n /= 2;
    
        for (int i = 1; i <= n; i++) {
            answer.push_back(i);
            answer.push_back(-i);
        }
    
        return answer;
    }
};