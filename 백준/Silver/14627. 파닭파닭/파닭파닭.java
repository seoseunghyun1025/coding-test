import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        long answer = 0;
        int left = 1, right = 1000000000;

        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }

        while(left <= right){
            int mid = (left + right) / 2;
            answer = 0;
            for(int i = 0; i < n; i++){
                answer += arr[i] / mid;
            }
            if(answer < m){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        answer = 0;
        for(int i = 0; i<n; i++){
            answer += arr[i];
        }
        answer -= (long)m * (left - 1);
        System.out.println(answer);
        in.close();
    }
}