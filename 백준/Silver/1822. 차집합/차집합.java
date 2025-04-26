import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int n = in.nextInt(), m = in.nextInt();

        for(int i=0; i < n; i++){
            set1.add(in.nextInt());
        }
        for(int i=0; i < m; i++){
            set2.add(in.nextInt());
        }
        set1.removeAll(set2);
        System.out.println(set1.size());
        List<Integer> list = new ArrayList<>(set1);
        Collections.sort(list);
        for(int i : list){
            System.out.print(i + " ");
        }
        in.close();
    }
}