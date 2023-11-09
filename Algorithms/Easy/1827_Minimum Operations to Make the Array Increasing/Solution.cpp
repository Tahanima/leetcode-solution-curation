// https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/

// Test Case

// Input: nums = [1,1,1]
// Output: 3
// Explanation: You can do the following operations:
// 1) Increment nums[2], so nums becomes [1,1,2].
// 2) Increment nums[1], so nums becomes [1,2,2].
// 3) Increment nums[2], so nums becomes [1,2,3].

// Approach
/*
The problem can be solved as -
    1. Just iterate over the array.
    2. If at any point, nums[i] <= nums[i - 1], then we need to increment nums[i] to make the array strictly increasing. The number of increments needed is given by - nums[i - 1] + nums[i] + 1. Basically, it is the number of increments needed to take nums[i] to atleast nums[i - 1] + 1.
    3.Return the number of increments.
*/

// Code
int minOperations(vector<int> &nums)
{
    int count = 0;
    for (int i = 1; i < nums.size(); i++)
        if (nums[i] <= nums[i - 1])
        {
            count += (nums[i - 1] - nums[i] + 1), // nums[i] must be made atleast equal to nums[i-1]+1
                nums[i] = nums[i - 1] + 1;
        }
    return count;
}

// Time Complexity : O(N)
// Space Complexity : O(1)
