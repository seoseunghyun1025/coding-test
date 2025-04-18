import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[100][100];
        int n = in.nextInt();
        int answer = 0;
        for(int i = 0; i<n; i++){
            int a = in.nextInt(), b = in.nextInt();
            for(int j = b; j < b + 10; j++){
                for(int k = a; k < a + 10; k++){
                    if(k > 99 || j > 99){
                        continue;
                    }
                    arr[j][k] = 1;
                }
            }
        }
        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                if(arr[i][j] == 1){
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}