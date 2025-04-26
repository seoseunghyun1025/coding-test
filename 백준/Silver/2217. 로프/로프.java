import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int answer = 0;

        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        for(int i = n - 1; i >= 0; i--){
            int k = n - i;  //개수를 곱하기 위해 k선언
            answer = Math.max(answer, arr[i] * k);
        }

        System.out.println(answer);
        in.close();
    }
}