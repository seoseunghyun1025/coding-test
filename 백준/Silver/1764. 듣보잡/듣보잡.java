import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        List<String> list = new ArrayList<>();
        int answer = 0;

        for(int i = 0; i < n; i++){
            set1.add(in.next());
        }
        for(int i = 0; i < m; i++){
            set2.add(in.next());
        }
        Iterator<String> it = set1.iterator();

        while(it.hasNext()){
            String obj = it.next();
            if(set2.contains(obj)){
                list.add(obj);
                answer++;
            }
        }
        Collections.sort(list);
        System.out.println(answer);
        for(Object i : list){
            System.out.println(i);
        }
    }
}