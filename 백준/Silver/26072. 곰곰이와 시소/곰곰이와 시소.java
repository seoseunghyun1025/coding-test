import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), l = in.nextInt();
        double left = 0.0, right = l;
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }

        for(int i = 0; i< n; i++){
            arr1[i] = in.nextInt();
        }

        for(int i = 0; right - left > 1e-10; i++){
            double mid = (left + right) / 2;
            double Wl  = 0.0, Wr= 0.0;

            for(int j = 0; j < n; j++){
                if(mid > arr[j]){
                    Wl += (mid - arr[j]) * arr1[j];
                }else{
                    Wr += (arr[j] - mid) * arr1[j];
                }
            }
            if(Wl > Wr) {
                right = mid;
            } else{
                left = mid;
            }
        }

        System.out.printf("%.15f",left);
        in.close();
    }
}