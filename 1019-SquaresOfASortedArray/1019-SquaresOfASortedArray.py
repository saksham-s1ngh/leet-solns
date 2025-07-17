# Last updated: 17/07/2025, 11:26:11
class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        for i in range(len(nums)):
            nums[i] *= nums[i]
            
        nums.sort()
        return nums