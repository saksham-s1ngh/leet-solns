// Last updated: 17/07/2025, 11:25:37
class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}