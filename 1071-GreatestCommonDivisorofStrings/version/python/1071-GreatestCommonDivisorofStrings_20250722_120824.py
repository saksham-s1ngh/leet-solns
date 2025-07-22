# Last updated: 22/07/2025, 12:08:24
'''
Couldn't figure out how to resolve case of unmatched strings, and it was a pretty easy fix.
Aside from that, got to revise the Euclid algo to find GCD.
'''

class Solution(object):
    def gcdOfStrings(self, str1, str2):
        """
        :type str1: str
        :type str2: str
        :rtype: str
        """
        if str1 + str2 != str2 + str1:
            return ""
        
        l1, l2 = len(str1), len(str2)
        while l1 % l2 != 0:
            l1, l2 = l2, l1 % l2
        
        return str1[:l2]
        
        