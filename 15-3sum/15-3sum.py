# Last updated: 17/07/2025, 11:26:39
class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        res = []
        
        #sort the array
        nums.sort()

        for i in range(len(nums)):
            if i > 0 and nums[i] == nums[i-1]:
                continue # compare neighbours and skip if equal (ignore duplicates)

            if nums[i] > 0:
                break

            l, r = i+1, len(nums)-1
            while l<r:
                total = nums[i]+ nums[l]+ nums[r]
                if total > 0:
                    r -= 1
                elif total < 0:    
                    l += 1
                else:
                    res.append([nums[i], nums[l], nums[r]])
                    l += 1
                    r -= 1
                    while nums[l] == nums[l-1] and l < r: # second dupe check
                        l += 1
        return res