// Last updated: 17/07/2025, 11:26:01
class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = grid[i].length-1; j > -1; j--){
                if(grid[i][j] > -1){
                    break;
                }
                count++;
            }
        }
        return count;
    }
}