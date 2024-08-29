import java.util.*;

class Solution {
    public int solution(String s) {
        // 최종 결과를 저장할 변수 초기화
        int result = 0;
        
        // 숫자를 저장할 Stack 초기화
        Stack<Integer> stack = new Stack<>();
        
        // 문자열을 공백으로 분할하여 각 단어 처리
        for (String str : s.split(" ")) {
            if (str.equals("Z") && !stack.isEmpty()) {
                // "Z"를 만나면 스택에서 마지막 요소 제거
                stack.pop();
            } else {
                // 숫자를 스택에 추가
                stack.push(Integer.parseInt(str));
            }
        }
        
        // 스택에 남아 있는 모든 숫자를 합산하여 결과 계산
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        
        return result;
    }
}