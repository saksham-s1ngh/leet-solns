// Last updated: 17/07/2025, 11:26:06
class Solution {
    public int balancedStringSplit(String s) {
        int Lcounter=0, Rcounter=0, balancedStrings = 0;
        for(int i = 0; i < s.length(); i++){
            if(Lcounter == Rcounter && Lcounter != 0){
                balancedStrings++;
            }
            if(s.charAt(i)=='R'){
                Rcounter++;
            } else {
                Lcounter++;
            }
        }
        return balancedStrings+1;
    }
}