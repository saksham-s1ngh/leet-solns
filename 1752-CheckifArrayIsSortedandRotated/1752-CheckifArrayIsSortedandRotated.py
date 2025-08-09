# Last updated: 09/08/2025, 16:03:25
class Solution(object):
    def check(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        size = len(nums)
        if size <= 1:
            return True

        cliffs = 0
        for index in range(1, size):
            if nums[index] < nums[index-1]:
                cliffs += 1
                if cliffs > 1:
                    return False

        if nums[0] < nums[-1]:
            cliffs += 1

        return cliffs <= 1