# Last updated: 17/07/2025, 11:26:22
class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        for i in range(0,len(s)//2):
            s[i], s[-1-i]= s[-1-i], s[i]
        return s