import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        for(int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
        }
        int m = in.nextInt();
        int [] arrm = new int[m];
        for(int i = 0; i < m; i++) {
            arrm[i] = in.nextInt();
        }

        for(int i = 0; i<n; i++) {
            arr[i] = arr[i] - arr1[i];
        }
        int pre = arr[0];
        for(int i = 1; i<n; i++){
            if(pre < arr[i]){
                arr[i] = pre;
                pre = arr[i];
            }
            pre = arr[i];
        }

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i< m; i++){
            int l = 0, r = arr.length - 1;
            while(l <= r){
                int mid = (l + r) / 2;
                if(arr[mid] < arrm[i]){
                    r = mid - 1;
                }else{
                    l = mid + 1;
                }
            }
            list.add(r + 1);
        }

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}