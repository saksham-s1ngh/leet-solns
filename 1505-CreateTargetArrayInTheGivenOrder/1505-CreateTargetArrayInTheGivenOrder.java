// Last updated: 17/07/2025, 11:25:58
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> resultArray = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++){
            resultArray.add(index[i], nums[i]);
        }
        int[] targetArray = new int[resultArray.size()];
        for (int i = 0; i < targetArray.length; i++) {
            targetArray[i] = resultArray.get(i);
        }
        return targetArray;
    }
}