import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int com = 1, pre = 0, count = 1;
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        pre = arr[0];
        if(arr[0] != 0){
            System.out.println(0);
            return;
        }
        for(int i = 1; i < n; i++){
            if(pre == arr[i]){
                if(count >= 2){
                    System.out.println(0);
                    return;
                }
                count++;
            }else{
                if(!(arr[i] - pre <= 1)) {
                    System.out.println(0);
                    return;
                }
                count = 1;
                pre = arr[i];
            }
        }
        int ans[] = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == arr[j]){
                    sum++;
                }
            }
            ans[i] = sum;
            sum = 0;
            if(i - 1 != -1){
                if(ans[i - 1] < ans[i]){
                    System.out.println(0);
                    System.exit(0);
                }
            }
        }
        boolean flag = false;

        for(int i = 0; i < n; i++){
            if(ans[i] == 0){
                continue;
            }else if(ans[i] == 1) {
                flag = true;
            }else{
                com *= 2;
            }
        }
        if(flag) {
            com *= 2;
        }

        System.out.println(com);
    }
}