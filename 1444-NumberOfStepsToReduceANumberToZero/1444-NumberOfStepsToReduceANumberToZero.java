// Last updated: 17/07/2025, 11:26:02
class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        while(num > 0){
            if( num % 2 == 0){
                num = num / 2;
                steps++;
            }
            else {
                num -= 1;
                steps++;
            }
        }
        return steps;
    }
}