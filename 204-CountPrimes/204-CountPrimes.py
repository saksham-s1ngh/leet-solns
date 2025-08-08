# Last updated: 08/08/2025, 13:14:18
class Solution(object):
    def countPrimes(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n < 2:
            return 0
        
        count_pr = [True]*n 
        count_pr[0] = count_pr[1] = False
        for i in range(2, int(n**0.5)+1):
            if count_pr[i]:
                for j in range(i*2, n, i):
                    count_pr[j] = False
        return sum(count_pr)       

        