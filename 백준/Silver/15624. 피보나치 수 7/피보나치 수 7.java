import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int pre = 1, prepre = 1, answer = 0;
        if(n == 1){
            System.out.println(0);
            return ;
        }else if(n == 2){
            System.out.println(pre);
            return ;
        }else if(n == 3){
            System.out.println(pre);
            return ;
        }

        for(int i = 4; i <= n; i++){
            answer = pre + prepre;
            prepre = pre;
            pre = answer;
        }
        System.out.println(answer);
        in.close();
    }
}