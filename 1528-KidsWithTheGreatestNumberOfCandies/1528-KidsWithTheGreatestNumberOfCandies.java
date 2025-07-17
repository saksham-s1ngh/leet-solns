// Last updated: 17/07/2025, 11:25:57
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>(Arrays.asList(new Boolean[candies.length]));
        int max = 0;
        for(int i = 0; i < candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= max){
                result.set(i, true);
            }
            else {
                result.set(i, false);
            }
        }
        return result;
    }
}