# Last updated: 17/07/2025, 11:26:08
class Solution(object):
    def longestOnes(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        L = 0
        current_change_count = 0
        answer = 0

        for R in range(len(nums)):
            if nums[R] == 0:
                current_change_count += 1
            while current_change_count > k and L < len(nums):
                if nums[L] == 0:
                    current_change_count -= 1
                L += 1
            answer = max(answer, R - L + 1)
        return answer
