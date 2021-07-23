# @param {Integer[]} nums
# @return {Integer}
def array_pair_sum(nums)
    nums.sort!
    (nums.select!.with_index { |_,i| i.even? }).sum
end