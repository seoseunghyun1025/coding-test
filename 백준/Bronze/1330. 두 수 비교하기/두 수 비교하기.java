import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]), b = Integer.parseInt(s[1]);
        
        if(a > b){
            System.out.println(">");
        }
        if(a < b){
            System.out.println("<");
        }
        if(a == b){
            System.out.println("==");
        }
    }
}