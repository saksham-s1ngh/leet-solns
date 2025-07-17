# Last updated: 17/07/2025, 11:26:25
class Solution(object):
    def containsDuplicate(self, nums):
        # hashset = set()
        # for n in nums:
        #     if n in hashset:
        #         return True
        #     hashset.add(n)
        # return False
        return len(set(nums)) < len(nums)