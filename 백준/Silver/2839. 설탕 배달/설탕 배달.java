import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
/*

        Queue<Integer> que = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();

        for(int i = 1; i<=N; i++){
            que.add(i);
        }
        while(!que.isEmpty()){
            for(int i = 0; i < K; i++){
                if(i == K - 1){
                    list.add(que.poll());
                    continue;
                }
                que.add(que.poll());
            }
        }
        for(int i = 0; i < N; i++){
            System.out.println(list.get(i));
        }
        in.close();
*/

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int answer = N + 1;

        for(int i = 0; i <= N/5; i++){
            int t = 5 * i;

            if(((N - t) % 3) == 0){
                int x = (N - t) / 3;
                answer = Math.min(answer, x + i);
            }
        }
        if(answer == N + 1){
            System.out.println(-1);
            return;
        }
        System.out.println(answer);
    }
}