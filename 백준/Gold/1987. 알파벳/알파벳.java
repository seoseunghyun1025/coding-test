import java.io.*;
import java.util.*;

public class Main {
    static int board[][];
    static boolean alpha[];
    static int[] by = {-1, 0, 1, 0};
    static int[] bx = {0, 1, 0, -1};
    static int n;
    static int m;
    static int MAX = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        board = new int[n][m];
        alpha = new boolean[26];

        for(int i = 0; i < n; i++){
            String s = br.readLine();
            for(int j = 0; j < m; j++){
                board[i][j] = s.charAt(j) - 'A';
            }
        }

        backtracking(0,0,1);

        System.out.println(MAX);
    }
    static void backtracking(int y, int x, int length){
        alpha[board[y][x]] = true;
        MAX = Math.max(length, MAX);
        //사각 방향을 움직여야 됌 그래서 4번
        for(int i = 0; i < 4; i++){
            int ny = y + by[i];
            int nx = x + bx[i];
            if(ny >= 0 && nx >= 0 && ny < n && nx < m){
                if(!alpha[board[ny][nx]]){
                    backtracking(ny, nx, length + 1);
                    alpha[board[ny][nx]] = false;
                }
            }
        }
    }
}