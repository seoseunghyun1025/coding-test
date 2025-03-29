import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {

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
        System.out.print("<");
        for(int i = 0; i < N; i++){
            if(i == N - 1){
                System.out.print(list.get(i));
                continue;
            }
            System.out.print(list.get(i) + ", ");
        }
        System.out.print(">");
        in.close();
    }
}