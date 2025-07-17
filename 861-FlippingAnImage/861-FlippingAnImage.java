// Last updated: 17/07/2025, 11:26:13
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        int temp;
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length/2; j++) {
                temp = image[i][j];
                image[i][j] = image[i][image[i].length - j - 1];
                image[i][image[i].length - j - 1] = temp;
            }
        }
        
        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image.length; j++){
                if(image[i][j] == 0){
                    image[i][j] = 1;
                } else {
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }
    
}