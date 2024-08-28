import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        while (n > 1) {
            for (int i = 2; i <= n; i++) { // 2부터 시작하여 n을 나눌 수 있는 최소 소수를 찾음
                if (n % i == 0) { // n이 i로 나누어 떨어지면
                    n /= i; // n을 i로 나누어 줌
                    if (!list.contains(i)) { // 리스트에 없는 소인수라면 추가
                        list.add(i);
                    }
                    break; // 나누어 떨어지면 반복문을 종료하고 다음 소인수를 찾음
                }
            }
        }
        return list;
        
    }
}