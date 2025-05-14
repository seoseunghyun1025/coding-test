import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 받은 값을 trim()으로 공백 제거 후 long으로 변환
        String input = br.readLine().trim();
        
        try {
            long s = Long.parseLong(input);  // 입력값을 long으로 변환

            long answer = 0, i = 1;
            while (answer + i <= s) {
                answer += i;
                i++;
            }

            System.out.println(i - 1);  // i가 1을 더한 상태이므로, i - 1이 최댓값
        } catch (NumberFormatException e) {
            System.out.println("잘못된 입력입니다. 숫자만 입력해주세요.");
        }

        br.close();
    }
}
