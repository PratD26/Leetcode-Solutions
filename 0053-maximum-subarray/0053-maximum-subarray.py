class Solution:
    def maxSubArray(self, nums: List[int]) -> int:

        sum = 0
        max_sum = -inf

        for i in nums:
            sum = max(i, sum+i)
            max_sum = max(max_sum, sum)
    
        return max_sum