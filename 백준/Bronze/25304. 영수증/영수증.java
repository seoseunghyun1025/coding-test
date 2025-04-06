import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();
        int answer = 0;
        for(int i = 0; i<n; i++){
            int price = in.nextInt();
            int 곱 = in.nextInt();
            answer += price * 곱;
        }
        if(x == answer){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        in.close();
    }
}