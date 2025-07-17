# Last updated: 17/07/2025, 11:26:18
class Solution(object):
    def findLHS(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
    
        lhs_dict = {}
        for num in nums:
            if num in lhs_dict:
                lhs_dict[num] += 1
            else:
                lhs_dict[num] = 1

        max_val = 0
        for key in lhs_dict:
            if key + 1 in lhs_dict:
                if lhs_dict[key] + lhs_dict[key + 1] > max_val:
                    max_val = lhs_dict[key] + lhs_dict[key + 1]

        return max_val
   