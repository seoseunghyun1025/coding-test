import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        //소인수분해를 해서 5가 나오면 count++
        for(int i = 5; i <= n; i++){
            int now = i;
            while(now % 5 == 0){
                count++;
                now = now / 5;
            }
        }

        System.out.println(count);
        in.close();
    }
}