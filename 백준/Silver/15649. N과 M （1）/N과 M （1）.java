import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visit;
    static List<Integer> list = new ArrayList<>();
    static int M;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]), m = Integer.parseInt(s[1]);
        M = m;
        visit = new boolean[n + 1];
        dfs(n , 0);
        System.out.println(sb);
    }
    static void dfs(int n, int m){
        if(m == M){
            for(int j = 0; j < list.size(); j++){
                sb.append(list.get(j)).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i = 1; i <= n; i++){
            if(visit[i]){
                continue;
            }visit[i] = true;
            list.add(i);
            dfs(n, m + 1);
            list.remove(list.size() - 1);
            visit[i] = false;
        }
    }
}