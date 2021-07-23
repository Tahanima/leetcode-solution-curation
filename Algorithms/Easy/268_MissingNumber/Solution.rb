# @param {Integer[]} nums
# @return {Integer}
def missing_number(nums)
    n = nums.length()
    missing = n
    n.times { |i| missing ^= i ^ nums[i] }
    missing
end