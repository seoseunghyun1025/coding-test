import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                arr[i][j] = in.nextInt();
            }
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]!=o2[0] ? o1[0]-o2[0] : o1[1]-o2[1]; // 첫번째 기준 오름차순 > 두번째 기준 오름차순  : {1,30}{2,10}{3,50}{4,20}{5,40}{6,10}{6,20}{6,30}{6,40}{6,50}
            }
        });

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}