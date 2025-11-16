import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        int count = 0;
        while(a < b){
            if(b % 10 == 1){
                b /= 10;
            }else if(b % 2 == 0){
                b /= 2;
            }else {
                break;
            }
            count++;
        }

        if(a == b){
            System.out.println(count + 1);
        }else{
            System.out.println(-1);
        }
    }
}