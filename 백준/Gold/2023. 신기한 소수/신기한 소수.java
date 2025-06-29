import java.io.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static boolean isPrime(int i){
        if(i == 1 || i == 0){
            return false;
        }
        for(int j = 2; j < i; j++){
            if(i % j == 0){
                return false;
            }
        }
        return true;
    }
    static void backtracking(int q, int n){
        if(n == 0){
            sb.append(q + "\n");
            return;
        }
        for(int i = 0; i <= 9; i++){
            int now = q * 10 + i;
            if(!isPrime(now)) continue;
            backtracking(now, n - 1);
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        backtracking(0, n);
        System.out.println(sb);
    }
}