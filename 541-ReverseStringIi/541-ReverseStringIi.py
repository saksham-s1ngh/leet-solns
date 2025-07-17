# Last updated: 17/07/2025, 11:26:20
class Solution(object):
    def reverseStr(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: str
        """

        # SLICING SOLUTION
        # res = []
        # for i in range(0, len(s), 2*k) : # process 2*k character chunks
        #     res.append(s[i:i+k][::-1]) # slice k characters in a 2k chunk and then reverse the slice
        #     res.append(s[i+k:i+(2*k)]) # append the untouched chunk between k and 2k
        # return "".join(res)
            
        # TWO-POINTER SOLUTION
        s = list(s)
        for i in range(0, len(s), 2*k):
            l, r = i, min(i+k-1, len(s)-1) # -1 from both for off-by-one index, and min is used since the last chunk may go over the length and as such min will ensure we stay in bounds.
            while l < r:
                s[l], s[r] = s[r], s[l]
                l += 1
                r -= 1
        return "".join(s)