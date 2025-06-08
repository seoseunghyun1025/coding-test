import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n == 1 || n == 2){
            System.out.println(1);
            return;
        }else if(n == 0){
            System.out.println(0);
            return;
        }
        int answer = wornl(n);
        System.out.println(answer);
    }

    static int wornl(int n){
        if(n == 1){
            return 1;
        }else if(n == 0){
            return 0;
        }
        else{
            return wornl(n - 1) + wornl(n - 2);
        }
    }
}