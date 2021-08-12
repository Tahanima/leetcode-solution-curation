# This solution is for python3, may or may not work for other versions

class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        nums3 = nums1 + nums2
        nums3.sort()

        if len(nums3) % 2 != 0:
            return nums3[(len(nums3) // 2)]
        else:
            return (
                nums3[(len(nums3) // 2)-1] +
                nums3[(len(nums3) // 2)]
            ) / 2
