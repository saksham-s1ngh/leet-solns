// Last updated: 17/07/2025, 11:26:34
class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int max = 0;
        for(int i = 1; i < prices.length; i++) 
        {
            if(prices[i]-min>max)
               max=prices[i]-min;
            if(prices[i]<min)
               min=prices[i];
        }
        if(max < 0){
            return 0;
        }
        return max;
    }
}