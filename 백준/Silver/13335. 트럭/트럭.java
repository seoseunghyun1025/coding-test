
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //n이 트럭 개수, w가 길이, l이 무게
        int n = in.nextInt(), w = in.nextInt(), l = in.nextInt();
        Queue<Integer> que = new LinkedList<>();
        int[] a = new int[n];
        int time = 0;
        int currentWeight = 0; //현재 무게
        
        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        in.close();

        for (int i = 0; i < w; i++) {
            que.add(0);
        }

        int i = 0;
        while(i < n){
            time++;
            if(!que.isEmpty()){
                currentWeight = currentWeight - que.poll();
            }
            if(currentWeight + a[i] <= l){
                que.add(a[i]);
                currentWeight += a[i];
                i++;
            }else{
                que.add(0);
            }
        }

        while(currentWeight > 0){
            time++;
            currentWeight -= que.poll();
        }
        System.out.println(time);
    }
}