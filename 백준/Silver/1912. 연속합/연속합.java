import java.io.*;
import java.util.*;

public class Main{
    static int[] arr;
    static Integer[] dp;
    static int max;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        dp = new Integer[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        max = arr[0];
        dp[0] = arr[0];
        wornl(n - 1);
        System.out.println(max);
    }
    static int wornl(int n){
        if(dp[n] == null){
            dp[n] = Math.max(wornl(n - 1) + arr[n], arr[n]);
            max = Math.max(max, dp[n]);
        }
        return dp[n];
    }
}