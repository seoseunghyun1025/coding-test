
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int answer = 0;
        int[] s = new int[n];
        for(int i = 0; i<n; i++){
            s[i] = in.nextInt();
        }
        int v = in.nextInt();

        for(int i = 0; i < n; i++){
            if(s[i] == v){
                answer++;
            }
        }
        System.out.println(answer);
    }
}