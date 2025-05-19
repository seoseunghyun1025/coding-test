import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());
        solve1(n,t); // 바깥쪽에서 안쪽
    }

    // 바깥쪽에서 안쪽으로 돌기
    static void solve1(int n, int t) {
        int[][] map = new int[n][n];
        int value = n*n;
        int x=0,y=0;
        int time=0;
        int limit =n;
        while(value>0) {
            x=time;
            for(int i=y; i<limit; i++) {
                map[i][x] = value--;
            }

            y=limit-1;
            for(int i=x+1; i<limit; i++) {
                map[y][i] = value--;
            }

            x=limit-1;
            for(int i=y-1; i>=time; i--) {
                map[i][x] = value--;
            }

            y=time;
            for(int i=x-1; i>time; i--) {
                map[y][i] = value--;
            }
            time++;
            limit--;
            y=time;
        } 

        StringBuilder sb = new StringBuilder();
        int tx=0, ty=0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(t==map[i][j]) {
                    ty=i+1;
                    tx=j+1;
                }
                sb.append(map[i][j] +" ");
            }
            sb.append("\n");
        }
        sb.append(ty+" "+tx);
        System.out.println(sb.toString());
    }
}