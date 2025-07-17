// Last updated: 17/07/2025, 11:26:15
class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1, mid;
        
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (nums[mid] == target){
                return mid;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}