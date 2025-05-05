import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), pre = 0;
        int[] arr = new int[n];
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        pre = arr[0];
        answer.add(arr[0]);
        for(int i = 1; i<n; i++){
            if(pre == arr[i]){
                continue;
            }
            answer.add(arr[i]);
            pre = arr[i];
        }

        for(int i = 0; i<answer.size(); i++){
            System.out.print(answer.get(i)+" ");
        }

        in.close();
    }
}