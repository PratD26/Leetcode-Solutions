class Solution:
    def findClosestNumber(self, nums: List[int]) -> int:
        close = nums[0]

        for num in nums:
            if abs(num)<abs(close):
                close = num
            
        if(close<0 and abs(close) in nums): 
            return abs(close) 
        else:
            return close
        