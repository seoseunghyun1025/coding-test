import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = in.nextInt();
        int count = 0;

        for(int i = 0; i < n; i++){
            list.add(in.nextInt());
        }
        Collections.sort(list);
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                count += list.get(i);
            }
        }
        System.out.println(count);
    }
}