// Last updated: 17/07/2025, 11:26:09
class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        
        for(int i = 0; i < len; i++){
            char ch = s.charAt(i);
            if(!isSpecial(ch)){
                sb.append(ch);
            }
        }
        sb.reverse();
        
        for(int i = 0; i < len; i++){
            char ch = s.charAt(i);
            if(isSpecial(ch)){
                sb.insert(i, ch);
            }
        }
        return sb.toString();
    }
    
    boolean isSpecial(char ch)
    {
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
            return false;
        return true;
    }
}