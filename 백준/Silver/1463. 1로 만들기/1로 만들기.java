import java.io.*;

public class Main {
    static int MIN = Integer.MAX_VALUE;
    static boolean[] visit = new boolean[1000100];
    static int[] arr = new int[1000100];
    static int back(int a) {
        int z, y, x;
        x = y = z = Integer.MAX_VALUE;
        if (a == 1) {
            return 0;
        }

        if(visit[a]){
            return arr[a];
        }
        visit[a] = true;

        if (a % 3 == 0) {
            x = back(a / 3);
        }
        if (a % 2 == 0) {
            y = back(a / 2);
        }
        z = back(a - 1);

        return arr[a] = Math.min(Math.min(x, y), z) + 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        System.out.println(back(n));
    }
}