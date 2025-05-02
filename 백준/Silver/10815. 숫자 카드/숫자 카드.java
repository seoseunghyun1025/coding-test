import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();

        for(int i = 0; i < n; i++){
            set.add(in.nextInt());
        }
        int m = in.nextInt();
        int[] answer = new int[m];
        for(int i = 0; i < m; i++){
            int c = in.nextInt();
            if(set.contains(c)){
                answer[i]++;
            }
        }
        for(int i = 0; i < m; i++){
            System.out.print(answer[i] + " ");
        }
    }
}