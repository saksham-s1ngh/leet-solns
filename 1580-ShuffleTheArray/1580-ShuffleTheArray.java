// Last updated: 17/07/2025, 11:25:51
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int i = 0, j = 0;
        while(j < nums.length/2){
            ans[i] = nums[j];
            ans[i+1] = nums[j+n];
            i+=2; j++;
        }
        return ans;
    }
}