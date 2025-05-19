import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Queue<Long> que = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        br.close();
        long a = Long.parseLong(input[0]), b = Long.parseLong(input[1]);
        int count = 0;
        que.add(a);
        while(!que.isEmpty()){
            int size = que.size();
            for(int i = 0; i<size; i++){
                long tmp = que.poll();
                if(tmp == b) {
                    count++;
                    System.out.println(count);
                    return;
                }
                if(tmp * 2 <= b) que.add(tmp * 2);
                if(tmp * 10 + 1 <= b) que.add(tmp * 10 + 1);
            }
            count++;
        }
        System.out.println(-1);
    }
}