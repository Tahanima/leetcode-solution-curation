class Solution {
public:

    static bool cmp(const pair< pair<int,int>,int> &a, const pair<pair<int,int>,int> &b)
    {
         return a.first.second<b.first.second;
    }
    
    vector< pair<pair<int,int>,int> > v;
    
    int bs(int i)
    {
        int lo=0,hi=i-1,mid;
        while(lo<=hi)
        {
            mid=(lo+hi)>>1;
            
            if(v[mid].first.second<=v[i].first.first)
            {
                if(v[mid+1].first.second<=v[i].first.first)
                    lo=mid+1;
                else return mid;
            }
            else
                hi=mid-1;
        }
        
        return -1;
    }
    
    int jobScheduling(vector<int>& startTime, vector<int>& endTime, vector<int>& profit) {
   
        for(int i=0;i<startTime.size();i++)
        {
            v.push_back({{startTime[i],endTime[i]},profit[i]});
        }
        
        sort(v.begin(),v.end(),cmp);
        
        int n=startTime.size();
        int dp[n];
        
        dp[0]=v[0].second;
        
        for(int i=1;i<v.size();i++)
        {
            int curr=v[i].second;
            int id=bs(i);
            
            if(id!=-1)
                curr+=dp[id];
            
            dp[i]=max(curr,dp[i-1]);
        }
        
        return dp[n-1];
    }
};
