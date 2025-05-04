import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int r = 1000000001, l = 0;

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        while(l <= r){
            long dap = 0;
            int mid = (l + r) / 2;
            for(int i = 0; i < n; i++){
                if(arr[i] - mid < 0){
                    continue;
                }
                dap += arr[i] - mid;
            }
            if(dap >= m){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }

        System.out.println(l - 1);

        in.close();
    }
}