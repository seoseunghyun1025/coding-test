import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int a = 0, b = 0, c = 0, answer = x, count = 0;
        while(true){
            a = answer / 10;
            b = answer % 10;
            c = (a + b) % 10;
            b *= 10;
            answer = b + c;
            count++;
            if(x == answer){
                break;
            }
        }
        System.out.println(count);
        in.close();
    }
}