import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**카운팅 소트
        *시간복잡도 상에서 제일 빠름
        *10억 10의 18승일 때는 느림
        *O(최대 배열 + n) 원소의 개수가 많으면 다른 알고리즘보다 느림
        */
         Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[2010];
        for(int i = 0; i < n; i++){
            int c = in.nextInt();
            c+=1000;
            arr[c]++;
        }
    
        for(int i = 0; i < 2010; i++){
            for(int j = 0; j < arr[i]; j++){
                System.out.println(i-1000);
            }
        }
    }
}