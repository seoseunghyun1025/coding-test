import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> que = new PriorityQueue<>();
        for(int i = 0; i < n; i++){
            int a = Integer.parseInt(br.readLine());
            if(a == 0){
                if(que.isEmpty()){
                    sb.append(0 + "\n");
                }else{
                    sb.append(que.poll() + "\n");
                }
            }else{
                que.add(a);
            }
        }
        System.out.println(sb);
    }
}