import java.io.IOException;
import java.util.*;

public class Main {
    static int[] count;
    static int M;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        M = m;
        count = new int[m + 2];
        count[m + 1] = 1;
        func(n, m);
        System.out.println(sb);
    }
    //n이 출력, m이 for문 개수
    static void func(int n, int m){
        if(m == 0){
            for(int i = M; i > 0; i--){
                sb.append(count[i] + " ");
            }
            sb.append("\n");
            return;
        }
        for(int i = count[m+1]; i <= n; i++){
            count[m] = i;
            func(n,m - 1);
        }
    }
}
