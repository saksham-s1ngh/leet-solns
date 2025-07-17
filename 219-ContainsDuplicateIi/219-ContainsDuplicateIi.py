# Last updated: 17/07/2025, 11:26:21
class Solution(object):
    def containsNearbyDuplicate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: bool
        """
        # NAIVE SOLUTION:
        # iterate over array
        # check if el1 == el2
        #   if true, check if math.abs(el1_index - el2_index) <= k
        #       return true
        #   if false, continue looking
        # return false, if no elements satisfying all conds. were found
        # for i in range(len(nums)):
        #     for j in range(i+1, len(nums)):
        #         if nums[i] == nums[j] and abs(i-j) <= k:
        #             return True
        # return False

        # sliding window approach
        seen = set()
        for i in range(len(nums)):
            if nums[i] in seen:
                return True
            seen.add(nums[i])
            if len(seen) > k:
                seen.remove(nums[i-k])
        return False

