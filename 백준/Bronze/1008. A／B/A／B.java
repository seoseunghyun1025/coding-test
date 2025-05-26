import java.io.*;
public class Main {
    static int B[][];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] a = br.readLine().split(" ");
        double nanu = ((double)Integer.parseInt(a[0]) / Integer.parseInt(a[1]));
        System.out.println(nanu);
        br.close();
    }
}