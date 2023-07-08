class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq_arr = [ [] for _ in range(len(nums))]
        elem_freq_map = {}

        for elem in nums: 
            elem_freq_map[elem] = elem_freq_map.get(elem, 0) + 1

        for elem, idx in elem_freq_map.items():
            freq_arr[idx - 1].append(elem)
        
        res = []

        for i in range(len(freq_arr) - 1, -1, -1):
            if freq_arr[i]: res.extend(freq_arr[i])
            if len(res) == k:
                return res

        return