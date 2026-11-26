class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:

        a = len(nums1)

        d = nums1[:m] + nums2

        d.sort()

        for i in range(a):
            nums1[i] = d[i]