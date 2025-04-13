import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<Integer> que = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        int x = in.nextInt(), num = in.nextInt();
        int answer = 0;
        for(int i = 1; i<=num; i++){
            list.add(in.nextInt());
        }
        int count = 0, cnt = 0;
        for(int i = 1; i<=x; i++){
            que.add(i);
        }

        int i = 0;
        while(true){
            if(cnt == num){
                break;
            }
            int j = que.poll();
            int k = list.get(i);

            if(j == k){
                i++;
                cnt++;
                answer += Math.min(count,que.size() - count + 1);
                count = 0;
            }else{
                que.add(j);
                count++;
            }
        }

        System.out.println(answer);

        in.close();
    }
}
