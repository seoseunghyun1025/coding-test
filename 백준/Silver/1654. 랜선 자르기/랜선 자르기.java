import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        long r = 3000000001l, l = 1;

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        while(l <= r){
            long mid = (l + r) / 2;
            long dap = 0;
            for(int i = 0; i < arr.length; i++){
                dap += arr[i] / mid;
            }
            if(dap >= m){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }

        System.out.println(r);
        in.close();
    }
}