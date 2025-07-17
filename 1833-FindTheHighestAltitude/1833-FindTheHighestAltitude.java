// Last updated: 17/07/2025, 11:25:40
class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int result = 0;
        for(int i=0; i<gain.length; i++){
            result += gain[i];
            if(result > max){
                max = result;
            }
        }
        return max;
    }
}