import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        br.close();
        int n = Integer.parseInt(input[0]), m = Integer.parseInt(input[1]);

        primeNumber(n,m);
    }
    static void primeNumber(int n, int m){
        int[] arr = new int[n + 1];
        for(int i = 2; i <= n; i++){
            arr[i] = i;
        }
        for(int i = 2; i <= n; i++){
            if(arr[i] == 0){
                continue;
            }
            for(int j = i; j <= n; j += i){
                if(arr[j] != 0){
                    arr[j] = 0;
                    m--;
                    if(m == 0){
                        System.out.println(j);
                        return;
                    }
                }
            }
        }
    }
}