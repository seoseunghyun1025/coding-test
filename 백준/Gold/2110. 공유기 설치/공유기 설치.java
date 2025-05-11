import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int left = 0, right = 0;

        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        right = arr[n - 1];

        while(left <= right){
            ArrayList<Integer> list = new ArrayList<>();
            int mid = (left + right) / 2;
            list.add(arr[0]);
            for(int i = 1; i<n; i++){
                if(arr[i] - list.get(list.size() - 1) >= mid){
                    list.add(arr[i]);
                }
            }
            if(list.size() >= m){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        System.out.println(left - 1);
        in.close();
    }
}