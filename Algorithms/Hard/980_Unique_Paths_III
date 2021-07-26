class Solution {
public:
    int m,n;
    pair<int,int>st,en;
    vector< vector< vector<int> > >dp;
    
    int x[4]={-1 , 0 , 1 , 0};
    int y[4]={0 , 1 , 0 , -1};
    
    int pop_bit(int i,int j,int mask )
    {
        return mask|(1<<(i*n+j));
    }
    bool valid(int i,int j,int mask,vector<vector<int>>& grid)
    {
        if(i>=0 and i<m and j>=0 and j<n and (mask&(1<<(i*n+j)))==0 and grid[i][j]!=-1) return true;
        
        return false; 
    }
    
    
    int solve(int i,int j,int mask,vector<vector<int>>& grid)
    {
        
        if(__builtin_popcount(mask)==m*n and i==en.first and j==en.second)
            return 1;
        
        int &ret=dp[i][j][mask];
        if(ret!=-1) return ret;
        int res=0;
        
        for(int k=0;k<4;k++)
        {
            int nxt_i=i+x[k];
            int nxt_j=j+y[k];
            
            if(valid(nxt_i,nxt_j,mask,grid))
                res+=solve(nxt_i,nxt_j,mask|(1<<(nxt_i*n+nxt_j)),grid);
            
        }
        
        return ret=res;
    }
        
    int uniquePathsIII(vector<vector<int>>& grid) {
        
        m=grid.size(),n=grid[0].size();
        int mask=0;
       
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                {
                    st={i,j};
                    mask=pop_bit(i,j,mask);
                }
                else if(grid[i][j]==2)
                {
                    en={i,j};
                }
                else if(grid[i][j]==-1)
                {
                    mask=pop_bit(i,j,mask);
                }
            }
        }
        
        vector<vector<vector<int>>>new_dp(m,vector<vector<int>>(n,vector<int>(1<<(n*m),-1)));
        dp=new_dp;
        
        return solve(st.first,st.second,mask,grid);
    }
};
