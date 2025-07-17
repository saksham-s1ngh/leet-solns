# Last updated: 17/07/2025, 11:25:50
class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        running_sum = []
        
        for i in range(0,len(nums)):
            running_sum.append(nums[i]+sum(nums[0:i]))
        
        return running_sum