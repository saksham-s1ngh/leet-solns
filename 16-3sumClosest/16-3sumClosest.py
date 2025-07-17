# Last updated: 17/07/2025, 11:26:38
class Solution(object):
    def threeSumClosest(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        nums.sort()
        closest_total = float('inf')

        for i in range(len(nums)):
            if i > 0 and nums[i] == nums[i-1]:
                continue

            l, r = i+1, len(nums)-1
            while l < r:
                total = nums[i] + nums[l] + nums[r]
                distance = total - target
                if distance < 0:
                    l += 1
                elif distance > 0:
                    r -= 1
                else:
                    # if a 3Sum is found which equals the target, then that is the best
                    #   we'll get. Thus we exit the method by returning the target since 
                    #   we need the sum of the closest triplet and here that 
                    #   triplet = target.
                    closest_total = total
                    return target

                """
                (closest_total - target), since we are trying to get the best distance 
                    from the target and closest_total - target is our current best total 
                    and the difference of it with the target gives us the distance 
                    from the target, and if we find a total sum of triplets that's 
                    lower than that, then that total is the closest and hence 
                    replaces the value in currently stored in closest_total.
                """
                if abs(distance) < abs(closest_total - target):
                        closest_total = total

        return closest_total