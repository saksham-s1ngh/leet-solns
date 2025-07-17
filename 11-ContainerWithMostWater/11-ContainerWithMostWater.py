# Last updated: 17/07/2025, 11:26:41
class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        # arrlen = len(height)
        # l, r = 0, arrlen - 1
        # capa = (r-l) * min(height[l], height[r])
        # for i in range(1, arrlen):
        #     if height[i] > height[l] and (r-i)*min(height[i], height[r]) > capa:
        #         l = i
        #         capa = (r-l) * min(height[l], height[r]) 
        #     if height[arrlen-i-1] > height[r] and ((arrlen-i-1)-l)*min(height[l], height[arrlen-i-1]) > capa:
        #         r = arrlen - i - 1
        #         capa = (r-l) * min(height[l], height[r]) 
        # return (r-l)*min(height[l], height[r]) # should return capa here

        # TWO POINTER SOLUTION
        l, r = 0, len(height) - 1
        capa = 0
        while l < r:
            capa = max(capa, (r - l) * min(height[l], height[r]) )
            if height[r] > height[l]:
                l += 1
            else:
                r -= 1
        return capa