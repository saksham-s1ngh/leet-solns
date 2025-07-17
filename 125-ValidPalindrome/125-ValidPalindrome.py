# Last updated: 17/07/2025, 11:26:28
class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """

        # # TWO-POINTER SOLUTION WITH FILTERED STRING
        # s = "".join(list(filter(lambda x: x.isalnum(), s.lower().strip())))
        # l, r = 0, len(s) - 1
        # while l < r:
        #     if not s[l] == s[r]:
        #           return False
        #     l += 1
        #     r -= 1
        # return True

        # TWO-POINTER SOLUTION WITHOUT FILTERING
        l, r = 0, len(s)-1
        s = s.lower()
        while l < r:
            if not s[l].isalnum():
                l += 1
                continue
            if not s[r].isalnum():
                r -= 1
                continue
            if s[l] != s[r]:
                return False
            l += 1
            r -= 1
        return True