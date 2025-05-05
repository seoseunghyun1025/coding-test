import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer,Integer> map = new TreeMap<>();
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] origin = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        origin = arr.clone();
        int count = 0;
        Arrays.sort(arr);
        for(int i = 0; i < n; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], count);
                count++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int key : origin){
            sb.append(map.get(key)).append(" ");
        }
        System.out.println(sb);
        in.close();
    }
}