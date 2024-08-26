import java.util.ArrayList;
class Solution {
    public int solution(int n) {
        int result = 1;
        int num = 1;
        
        while (n > num) {
            result++;
            num *= result;
        }
        
        if (n == num) {
            return result;
        }
        
        return result - 1;
    }
}