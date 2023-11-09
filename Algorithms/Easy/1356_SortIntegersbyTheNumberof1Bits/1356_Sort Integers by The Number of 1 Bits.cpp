#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    
    static bool cmp ( int a, int b )
    {
        int bitsa = 0;
        int bitsb = 0;
        int ta = a, tb = b;
        while( a != 0 )
        {
            if ( a%2 == 1 )
                bitsa++;
            a /= 2;
        }
        while( b != 0 )
        {
            if ( b%2 == 1 )
                bitsb++;
            b /= 2;
        }
        return ( bitsa != bitsb ? bitsa < bitsb : ta < tb);
    }
    
    vector<int> sortByBits ( vector<int>& arr ) {
        sort( arr.begin(), arr.end(), cmp );
        return arr;
    }
};
