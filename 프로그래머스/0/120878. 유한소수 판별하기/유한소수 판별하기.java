
class Solution {
    public int solution(int a, int b) {
        int finalB = b / GCD(a, b);
        
        while( finalB != 1) {
            if(finalB % 2 == 0) {
                finalB /= 2;
            }else if (finalB % 5 == 0) {
                finalB /= 5;
            }else {
                return 2;
            }
        }
        
        return 1;
    }
    private int GCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }
}