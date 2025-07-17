// Last updated: 17/07/2025, 11:25:34
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int category = -1, count = 0; //category variable to directly pick the index of the property we need to compare
        if(ruleKey.equals("type")){
            category = 0;
        } else if(ruleKey.equals("color")){
            category = 1;
        } else {
            category = 2;
        }
        
        int n = items.size();
        for(int i = 0; i < n; i++){ // iterate through the items list
            if(items.get(i).get(category).equals(ruleValue)){ //compare the ruleValue using the category variable to directly pick the required category mentioned in ruleKey
                count++;
            }
        }
        return count;
    }
}