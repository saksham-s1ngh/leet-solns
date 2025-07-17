// Last updated: 17/07/2025, 11:25:59
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smallerCounter = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int x = 0, count=0;
            while(x < nums.length){
                if(nums[x] < nums[i]){
                    count++;
                }
                x++;
            }
            smallerCounter[i] = count;
        }
        return smallerCounter;
    }
}