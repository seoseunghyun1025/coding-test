import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt(), y = in.nextInt();
        int l = 1, r = 1000000000;
        int answer = 0;
        //오버플로우 방지
        int z = (int)((long)y * 100 / x);
        
        if(z >= 99){
            System.out.println(-1);
            return;
        }
        while(l <= r){
            int mid = (l + r) / 2;

            long newWin = y + mid;
            long newTotal = x + mid;
            int newZ = (int)(newWin * 100 / newTotal);
            if(newZ > z){
                answer = mid;
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        System.out.println(answer);
    }
}