import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        int l = lcm(a.length(), b.length());
        int flag = 1;
        for(int i = 0; i < l; i++){
            char c = a.charAt(i % a.length());
            char d = b.charAt(i % b.length());

            if(c != d){
                flag = 0;
                break;
            }
        }
        System.out.println(flag);
    }
    static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
    static int lcm(int a, int b){
        return (a * b) / gcd(a,b);
    }
}