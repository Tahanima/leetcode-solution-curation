// https://leetcode.com/problems/sum-of-unique-elements/

//Test  cases

// Example 1:
// Input: nums = [1,2,3,2]
// Output: 4
// Explanation: The unique elements are [1,3], and the sum is 4.

// Example 2:
// Input: nums = [1,1,1,1,1]
// Output: 0
// Explanation: There are no unique elements, and the sum is 0.

// Example 3:
// Input: nums = [1,2,3,4,5]
// Output: 15
// Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.

// Approach
/*
We will create an array of 101 elements, all sets to 0 and proceed to store the frequency there.

Despite looping through 100 elements at each run to update result in the second loop.
*/

// Code
class Solution
{
public:
    int sumOfUnique(vector<int> &nums)
    {
        // support variables
        int result = 0, arr[101] = {};
        // parsing nums
        for (int n : nums)
        {
            arr[n]++;
        }
        // updating result
        for (int i = 1; i < 101; i++)
        {
            result += arr[i] == 1 ? i : 0;
        }
        return result;
    }
};
