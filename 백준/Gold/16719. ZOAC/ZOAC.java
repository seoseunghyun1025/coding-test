import java.io.*;

public class Main {
    static StringBuilder sb;
    static String s;
    static boolean visit[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        s = br.readLine();
        visit = new boolean[s.length()];
        zoac(0, s.length() - 1);
        System.out.println(sb);
    }

    public static void zoac(int left, int right){
        if(left > right){
            return;
        }
        int min = left;
        for(int i = left; i<=right; i++){
            if(s.charAt(min) > s.charAt(i)){
                min = i;
            }
        }
        visit[min] = true;

        for(int i = 0; i<s.length(); i++){
            if(visit[i]){
                sb.append(s.charAt(i));
            }
        }
        sb.append("\n");

        zoac(min + 1, right);
        zoac(left, min - 1);
    }
}