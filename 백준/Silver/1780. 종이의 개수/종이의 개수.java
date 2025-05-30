import java.io.*;

public class Main {
    static int zero;
    static int minus;
    static int plus;
    static int arr[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        zero = 0;
        minus = 0;
        plus = 0;
        for(int i = 0; i < n; i++){
            String[] a = br.readLine().split(" ");
            for(int j = 0; j < n; j++){
                arr[i][j] = Integer.parseInt(a[j]);
            }
        }
        wornl(0,0,n);
        System.out.println(minus);
        System.out.println(zero);
        System.out.println(plus);
    }
    static void wornl(int x, int y, int size){
        int color = arr[x][y];
        boolean a = check(x, y, size);
        if(a) {
            if(color == 0) zero++;
            else if(color == 1) plus++;
            else minus++;
        }else{
            size /= 3;
            wornl(x, y, size);
            wornl(x, y + size, size);
            wornl(x + size, y, size);
            wornl(x + size * 2, y, size);
            wornl(x, y + size * 2, size);
            wornl(x + size, y + size, size);
            wornl(x + size * 2, y + size * 2, size);
            wornl(x + size, y + size * 2, size);
            wornl(x + size * 2, y + size, size);
        }
    }
    static boolean check(int x, int y, int size){
        int color = arr[x][y];
        for(int i = x; i < x + size; i++){
            for(int j = y; j < y + size; j++){
                if(color != arr[i][j]) return false;
            }
        }
        return true;
    }
}
