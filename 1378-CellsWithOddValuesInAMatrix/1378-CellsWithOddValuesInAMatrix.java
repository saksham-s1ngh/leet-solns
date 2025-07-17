// Last updated: 17/07/2025, 11:26:05
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        int x = 0, oddvalcells = 0;
        for(int i = 0; i < indices.length; i++){
            int ri = indices[i][0];
            //System.out.println(ri);
            int ci = indices[i][1];
            //System.out.println(ci);
            while(x < n){
                arr[ri][x]++;
                x++;
            }
            x = 0;
            while(x < m){
                arr[x][ci]++;
                x++;
            }
            x = 0;
    
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                //System.out.print(arr[i][j]);
                if(arr[i][j]%2 > 0){
                    oddvalcells++;
                }
            }
            //System.out.println();
        }
        return oddvalcells;
    }
}