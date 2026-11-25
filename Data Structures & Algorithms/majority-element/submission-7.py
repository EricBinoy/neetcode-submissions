class Solution:
    def majorityElement(self, nums: List[int]) -> int:

        count = defaultdict(int)
        
        max = 0

        for num in nums:
            count[num] += 1
            if max < count[num]:
                res = num
                max = count[num]
        return res