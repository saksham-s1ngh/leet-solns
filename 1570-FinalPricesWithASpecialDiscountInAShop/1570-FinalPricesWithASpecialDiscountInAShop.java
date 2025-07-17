// Last updated: 17/07/2025, 11:25:52
class Solution {
    public int[] finalPrices(int[] prices) {
        int[] discount = new int[prices.length];
        for(int i = 0; i < prices.length; i++){
            discount[i] = prices[i];
            
            
            int j = i+1;
            
            while(j < prices.length){
                if(prices[j] <= prices[i]){
                    discount[i] = prices[i]-prices[j];
                    break;
                }
                j++;
            }
        }
        return discount;
    }
}