// Last updated: 17/07/2025, 11:25:36
class Solution {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26){
            return false;
        }
        
        for(char i='a'; i<='z'; i++){ //we go from a to z, searching by each character in the string
            if(!(sentence.contains(String.valueOf(i)))){ //here we're checking each character by converting it into a string and then checking if the main string(sentence) contains it or not.
                return false; //this condition will hit when any alphabet isn't present in the sentence
            }
        }
        return true; // this condition only hits when all characters were present in the main string(sentence)
    }
}