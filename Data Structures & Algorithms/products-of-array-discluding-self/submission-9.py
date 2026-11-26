class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:

        res = []
        zero_cnt = 0

        for num in nums:
            if num == 0:
                zero_cnt += 1

        if zero_cnt > 1:
            return [0] * len(nums)

        prod = 1

        for num in nums:
            if num != 0:
                prod *= num

        for num in nums:
            if zero_cnt == 1:
                if num == 0:
                    res.append(prod)
                else:
                    res.append(0)
            else:
                res.append(prod // num)

        return res