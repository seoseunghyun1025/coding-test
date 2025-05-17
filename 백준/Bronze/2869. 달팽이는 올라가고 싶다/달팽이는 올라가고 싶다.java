import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int up = Integer.parseInt(s[0]), down = Integer.parseInt(s[1]), length = Integer.parseInt(s[2]);
        int count = 0, answer = 0,  i = 0;
        int day = (length - down) / (up - down);
        if ((length - down) % (up - down) != 0)
            day++;

        System.out.println(day);
    }
}