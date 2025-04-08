import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int answer = 1;
        Stack<Integer> sta = new Stack<>();
        for(int i = 0; i < x; i++){
            sta.push(in.nextInt());
        }
        int a = sta.pop();
        while(!sta.isEmpty()){
            int b = sta.pop();
            if(a < b){
                a = b;
                answer++;
            }
        }
        System.out.println(answer);
        in.close();
    }
}