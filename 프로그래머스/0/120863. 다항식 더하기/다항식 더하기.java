class Solution {
    public String solution(String polynomial) {
        // 주어진 다항식을 공백 기준으로 나누어 부분 문자열 배열 생성
        String[] parts = polynomial.split(" ");
        
        int x = 0;  // 'x' 항의 계수를 저장할 변수
        int num = 0; // 상수를 저장할 변수

        // 부분 문자열 배열을 순회하여 'x' 항과 상수 항을 구분
        for (String s : parts) {
            if (s.contains("x")) { // 'x' 항일 때
                s = s.replace("x", ""); // 'x'를 제거하여 숫자만 남김
                if (s.length() == 0) // 'x'만 있는 경우 계수는 1
                    x++;
                else // 'x'와 숫자가 함께 있는 경우 숫자를 정수로 변환하여 계수에 추가
                    x += Integer.parseInt(s);
            } else if (!s.equals("+")) { // '+'가 아닌 나머지 문자열은 상수 항
                num += Integer.parseInt(s); // 상수 값을 정수로 변환하여 누적
            }
        }
        
        String result; // 최종 결과 문자열
        
        // 모든 항이 0인 경우
        if (x == 0 && num == 0) {
            return "0";
        }
        
        // 'x' 항이 1인 경우
        if (x == 1) {
            result = "x";
        } else { // 'x' 항이 1보다 큰 경우
            result = x + "x";
        }
        
        // 상수 항이 0인 경우
        if (num == 0) {
            return result;
        } else if (x == 0) { // 'x' 항이 없는 경우
            return "" + num;
        } else { // 'x' 항과 상수 항이 모두 있는 경우
            result += " + " + num;
        }
        
        return result; // 최종 결과 반환
    }
}