# Last updated: 21/07/2025, 22:39:27
from collections import deque
class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        reversed_int = []
        if x == 0: 
            return 0
        
        if x < 0:
            reversed_int.append("-")
            x *= -1
        while x > 0:
            reversed_int.append(str(x%10))
            x //= 10
        
        reversed_int = int("".join(reversed_int)) 
        return reversed_int if -2**31 <= reversed_int <= 2**31 - 1 else 0