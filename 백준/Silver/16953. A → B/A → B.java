import java.util.*;
import java.io.*;

public class Main {
    static long a,b;
    static int cnt;

    static int bfs(){
        Queue<Long> q = new LinkedList<>();
        q.add(a);

        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0; i<size; i++){
                long tmp = q.poll();
                if(tmp==b)
                    return cnt+1;

                if(tmp*2<=b) q.add(tmp*2);
                if(tmp*10+1<=b) q.add(tmp*10+1);
            }
            cnt++;
        }
        return -1;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        a = Long.parseLong(s[0]);
        b = Long.parseLong(s[1]);

        System.out.println(bfs());
    }
}