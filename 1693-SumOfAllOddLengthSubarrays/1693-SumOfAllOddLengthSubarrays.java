// Last updated: 17/07/2025, 11:25:44
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int n = arr.length;
        for(int i = 0; i< n; i++) {
            int start = n - i;
            int end = i + 1;
            int total = start * end;
            int odd = total/2;
            if (total % 2 == 1) {
                odd++;
            }
            sum += odd * arr[i];
        }
        return sum;
    }
}