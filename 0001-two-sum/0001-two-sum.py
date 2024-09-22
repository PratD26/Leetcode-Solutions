class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        resMap = {}

        for i in range(len(nums)):
            j = target - nums[i]
            if j in resMap:
                return [i, resMap[j]]
            resMap[nums[i]] = i

        return []
