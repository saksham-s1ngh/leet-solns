# Last updated: 17/07/2025, 11:26:36
class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        i = j = 1
        k = 1
        while i < len(nums) and j < len(nums):
            if nums[j] != nums[i-1]:
                nums[i] = nums[j]
                i += 1
                k += 1
            else:
                j += 1
        
        return k