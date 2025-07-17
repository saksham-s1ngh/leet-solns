// Last updated: 17/07/2025, 11:26:12
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int current;
        for(int i = 1; i < A.length; i++){
            if(A[i]%2 == 0) {
                int k = i;
                current = A[i];
                while(k > 0) {
                    A[k] = A[k-1];
                    k--;
                }
                A[k] = current;
            }
        }
        return A;
    }
}