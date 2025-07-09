import java.util.*;
import java.io.*;

public class Main{
    static int[][] dp;
    static int[][] cost;
    static int red = 0;
    static int green = 1;
    static int blue = 2;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new int[n][3];
        cost = new int[n][3];
        StringTokenizer st;
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            cost[i][red] = Integer.parseInt(st.nextToken());
            cost[i][green] = Integer.parseInt(st.nextToken());
            cost[i][blue] = Integer.parseInt(st.nextToken());
        }

        dp[0][red] = cost[0][red];
        dp[0][green] = cost[0][green];
        dp[0][blue] = cost[0][blue];

        System.out.println(Math.min(wornl(n - 1, red), Math.min(wornl(n - 1, green), wornl(n - 1, blue))));
    }

    static int wornl(int N, int color){
        if(dp[N][color] == 0){
            if(color == red){
                dp[N][color] = Math.min(wornl(N - 1, green), wornl(N - 1, blue)) + cost[N][color];
            }
            if(color == green){
                dp[N][color] = Math.min(wornl(N - 1, red), wornl(N - 1, blue)) + cost[N][color];
            }
            if(color == blue){
                dp[N][color] = Math.min(wornl(N - 1, green), wornl(N - 1, red)) + cost[N][color];
            }
        }

        return dp[N][color];
    }
}