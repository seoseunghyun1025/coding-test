import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long pre = 1, prepre = 1;
        long answer = 0;
        if(n == 0){
            System.out.println(0);
            return ;
        }else if(n == 1){
            System.out.println(pre);
            return ;
        }else if(n == 2){
            System.out.println(pre);
            return ;
        }

        for(int i = 3; i <= n; i++){
            answer = pre + prepre;
            prepre = pre;
            pre = answer;
        }
        System.out.println(answer);
        in.close();
    }
}