# Last updated: 17/07/2025, 11:25:43
class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int: 
        richest = sum(accounts[0])
        for i in range(1, len(accounts)):
            if sum(accounts[i]) > richest:
                richest = sum(accounts[i])
        return richest