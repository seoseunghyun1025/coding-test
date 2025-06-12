import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        Stack<Integer> sta = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            int a = Integer.parseInt(br.readLine());
            if(a == 0){
                sta.pop();
                continue;
            }
            sta.push(a);
        }
        int sum = 0, size = sta.size();
        //sum += sta.pop();
        //bw.write(sta.size()+ "\n");
        for(int i = 0; i<size; i++){
            int b = sta.pop();
            sum += b;
        }
        bw.write("" + sum);
        bw.flush();
        bw.close();
    }
}