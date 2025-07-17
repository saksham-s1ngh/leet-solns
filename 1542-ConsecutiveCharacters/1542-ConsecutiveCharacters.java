// Last updated: 17/07/2025, 11:25:54
class Solution {
    public int maxPower(String s) {
        if (s.length() == 1){
            return 1;
        }
        int power = 0, tempPower = 0;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                tempPower++;
            } else{
                tempPower = 0;
            }
            if (tempPower+1 > power){
                power = tempPower+1;
            }
        }
        return power;
    }
}