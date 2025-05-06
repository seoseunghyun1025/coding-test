import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][2];
        int answer = 0;
        for(int i = 0; i < n; i++){
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        Arrays.sort(arr, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2){
                return o1[0] != o2[0] ? o1[0] - o2[0] : o1[1] - o2[1];
            }
        });



        int pre = answer = arr[0][0] + arr[0][1];
        for(int i = 1; i < n; i++){
            int c = arr[i][0] + arr[i][1];
            if(pre >= arr[i][0]){
                answer += arr[i][1];
                pre = answer;
                continue;
            }
            pre = c;
            answer = c;
        }

        System.out.println(answer);

        in.close();
    }
}