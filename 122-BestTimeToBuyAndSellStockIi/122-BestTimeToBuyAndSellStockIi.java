// Last updated: 17/07/2025, 11:26:32
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, i = 0;
        while (i < prices.length) {
        // find next local minimum
            while (i < prices.length-1 && prices[i+1] <= prices[i]){
                i++;
            }
            int min = prices[i++]; // need increment to avoid infinite loop for "[1]"
            // find next local maximum
            while (i < prices.length-1 && prices[i+1] >= prices[i]){
                i++;
            }        
            profit += i < prices.length ? prices[i++] - min : 0;
        }
    return profit;
    }
}