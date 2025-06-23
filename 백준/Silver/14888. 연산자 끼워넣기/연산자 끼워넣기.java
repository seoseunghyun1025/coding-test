import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int num[];
    static int operator[] = new int[4];
    static int MAX = Integer.MIN_VALUE;
    static int MIN = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        num = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i<N; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i<4; i++){
            operator[i] = Integer.parseInt(st.nextToken());
        }
        //맨 앞부터 탐색, 한 개만 썼다
        backtracking(num[0], 1);
        System.out.println(MAX);
        System.out.println(MIN);
    }

    private static void backtracking(int now, int index){
        //맨 끝까지 왔는지
        if(index == N){
            //now는 계속 업데이트 됨
            MAX = Math.max(MAX, now);
            MIN = Math.min(MIN, now);
            return;
        }

        if(operator[0] > 0){
            operator[0]--;
            backtracking(now + num[index], index+1);
            operator[0]++;
        }
        if(operator[1] > 0){
            operator[1]--;
            backtracking(now - num[index], index+1);
            operator[1]++;
        }
        if(operator[2] > 0){
            operator[2]--;
            backtracking(now * num[index], index+1);
            operator[2]++;
        }
        if(operator[3] > 0){
            operator[3]--;
            backtracking(now / num[index], index+1);
            operator[3]++;
        }

    }

}