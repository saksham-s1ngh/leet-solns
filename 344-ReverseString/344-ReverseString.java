// Last updated: 17/07/2025, 11:26:27
class Solution {
    public void reverseString(char[] s) {
        for(int i = 0; i < (s.length/2); i++){
            char temp = s[i];
            s[i] = s[s.length-(i+1)];
            s[s.length-(i+1)] = temp;
        }
    }
}