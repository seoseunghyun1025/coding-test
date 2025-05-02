import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int answer = 0;
        String[] s = new String[m];
        Set<String> set1 = new HashSet<>();

        for(int i = 0; i < n; i++){
            set1.add(in.next());
        }
        for(int i = 0; i < m; i++){
            s[i] = in.next();
        }
        for(int i = 0; i < m; i++){
            if(set1.contains(s[i])){
                answer++;
            }
        }
        System.out.println(answer);
    }
}