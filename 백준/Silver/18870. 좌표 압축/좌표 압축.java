import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer,Integer> map = new TreeMap<>();
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
            map.put(arr[i], 0);
        }
        int count = 0;
        for (int key : map.keySet()) {
            map.put(key, count++);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(map.get(arr[i])).append(" ");
        }

        System.out.println(sb);

        in.close();
    }
}