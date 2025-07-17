# Last updated: 17/07/2025, 11:26:35
class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        # # SIMPLEST METHOD:
        # i = m; j = 0
        # while j < len(nums2):
        #     nums1[i] = nums2[j]
        #     i += 1
        #     j += 1
        # nums1.sort()

        
        midx = m-1
        nidx = n-1
        r = m + n - 1

        while nidx >= 0:
            if midx >= 0 and nums1[midx] > nums2[nidx]:
                nums1[r] = nums1[midx]
                midx -= 1
            else:
                nums1[r] = nums2[nidx]
                nidx -= 1
            r -= 1