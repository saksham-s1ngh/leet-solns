# Last updated: 17/07/2025, 11:26:29
class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        single_num = []
        for num in nums:
            if num not in single_num:
                single_num.append(num)
            else:
                single_num.remove(num)

        return single_num[0]