import java.io.*;

public class Main {
    static boolean[] primeArray = new boolean[1000001];

    //입력&출력 부분
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        findPrime();

        int T = Integer.parseInt(br.readLine()); //테스트의 개수
        
        for(int i = 0; i < T; i++){
        
            int N  = Integer.parseInt(br.readLine()); //2보다 큰 짝수

            int partitionCount = 0; // 파티션의 짝수

            if(N % 2 == 0 && N != 0) { //짝수인 경우만
            // 순서만 다르고 두 소수가 같은 경우는 같은 파티션임으로 N/2한다.
                for (int j = 2; j <= N / 2; j++) {
                    // 두 수의 합이 N일때 그 두수가 모두 소수일 때
                    if (!primeArray[j]) { // 소수일 때
                        if (!primeArray[N - j]) { // N- 소수 = 소수일때
                            partitionCount++;
                        }
                    }
                }
                bw.write(partitionCount + "\n");
            }else{
                bw.write(0 + " \n");
            }
        }

        br.close();

        bw.flush();
        bw.close();
    }
    
    //소수 판별 배열 만다는 메소드
    static void findPrime(){
        primeArray[0] = primeArray[1] = true;

        for (int i = 2; i < primeArray.length; i++) { // 미리 골드바흐의 추측에 따른 소수값 구하기

            if (primeArray[i] == false) {

                for (int j = 2; i * j < primeArray.length; j++) {
                    primeArray[i * j] = true;
                }
            }

        }
    }
}