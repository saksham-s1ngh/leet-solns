// Last updated: 17/07/2025, 11:25:41
class Solution {
    public int numSpecial(int[][] mat) {
        int count, special = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == 1){
                    count = helper(i, j, mat);
                    if(count == 2){
                        special++;
                    }
                }
            }
        }
        return special;
    }
    
    public int helper(int i, int j, int[][] mat){
        int count = 0;
        for(int x = 0; x < mat.length; x++){
            if(mat[x][j] == 1){
                count++;
            }
        }
        for(int x = 0; x < mat[0].length; x++){
            if(mat[i][x] == 1){
                count++;
            }
        }
        return count;
    }
}