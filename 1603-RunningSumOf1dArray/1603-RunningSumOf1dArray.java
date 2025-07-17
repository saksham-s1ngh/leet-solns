// Last updated: 17/07/2025, 11:25:55
class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans = nums;
        for(int i=1; i<nums.length; i++){
            ans[i] += ans[i-1];
        }
        return ans;
    }
}