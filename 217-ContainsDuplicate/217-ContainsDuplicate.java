// Last updated: 17/07/2025, 11:26:31
class Solution {
    public boolean containsDuplicate(int[] nums) {
    //     for(int i = 0; i < nums.length - 1; i++){
    //         for(int j = i + 1; j < nums.length; j++){
    //             if(nums[i] == nums[j]){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 1; i < n; i++){
            if (nums[i] == nums[i-1])
                return true;
        }
        return false;
    }
}