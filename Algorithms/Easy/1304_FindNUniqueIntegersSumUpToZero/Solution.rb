# @param {Integer} n
# @return {Integer[]}
def sum_zero(n)
    answer = []
    answer << 0 if (n % 2 == 1)
    n /= 2
    n.times { |i| answer << (i + 1) << -(i + 1) }
    answer
end