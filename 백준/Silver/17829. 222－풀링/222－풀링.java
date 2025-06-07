import java.util.*;
import java.io.*;

public class Main {
    static int[][] arr;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        for(int i = 0; i<n; i++){
            String[] s = br.readLine().split(" ");
            for(int j = 0; j<n; j++){
                arr[i][j] = Integer.parseInt(s[j]);
            }
        }
        int answer = wornl(0,0,n);
        System.out.println(answer);
    }

    static int wornl(int x, int y, int n){
        int[] arr1 = new int[4];
        if(n == 2){
            arr1[0] = arr[x][y];
            arr1[1] = arr[x][y + 1];
            arr1[2] = arr[x + 1][y];
            arr1[3] = arr[x + 1][y + 1];
        }else{
            n /= 2;
            arr1[0] = wornl(x,y,n);
            arr1[1] = wornl(x,y + n, n);
            arr1[2] = wornl(x + n, y, n);
            arr1[3] = wornl(x + n, y + n, n);
        }
        Arrays.sort(arr1);
        return arr1[2];
    }
}