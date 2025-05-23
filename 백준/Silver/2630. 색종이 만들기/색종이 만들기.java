import java.io.*;

public class Main {
    static int B[][];
    static int wCnt;
    static int bCnt;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        B = new int[n][n];
        for(int i = 0; i < n; i++){
            String[] s = br.readLine().split(" ");
            for(int j = 0; j < n; j++){
                B[i][j] = Integer.parseInt(s[j]);
            }
        }

        wornl(0,0,n);
        System.out.println(wCnt);
        System.out.println(bCnt);
    }

    static void wornl(int x, int y, int size){
        int color = B[x][y];
        boolean a = check(x, y, size);
        if(a){
            if(color == 0) wCnt++;
            else bCnt++;
        }else{
            size /= 2;
            wornl(x, y, size);
            wornl(x + size, y, size);
            wornl(x, y + size, size);
            wornl(x + size, y + size, size);
        }
    }

    static boolean check(int x, int y, int size){
        int color = B[x][y];
        for(int i = x; i < x + size; i++){
            for(int j = y; j < y + size; j++){
                if(color != B[i][j]) return false;
            }
        }
        return true;
    }
}