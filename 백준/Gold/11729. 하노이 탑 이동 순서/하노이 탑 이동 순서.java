import java.util.*;
import java.io.*;

public class Main {
    static StringBuilder sb;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        sb = new StringBuilder();
        System.out.println((1<<n)-1);
        f(n, 1, 2, 3);
        System.out.println(sb);
    }
    static void f(int n, int a, int b, int c){
        if(n == 0){
            return;
        }
        f(n - 1, a, c, b);
        sb.append(a).append(" ").append(c).append("\n");
        f(n - 1, b, a, c);
    }
}