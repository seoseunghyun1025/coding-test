import java.util.*;
import java.lang.*;

public class Solution {
    public int solution(int n) {
        int m = 0;
        int answer = 0;
        while(n > 0){
            m = n % 10;
            n /= 10;
            answer += m;
        }
        return answer;
    }
}