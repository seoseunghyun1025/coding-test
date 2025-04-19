import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Set<String> set1 = new HashSet<>();
        for(int i = 0; i<n; i++){
            String s = in.next();
            String w = in.next();
            if(w.equals("enter")){
                set1.add(s);
            }else{
                set1.remove(s);
            }
        }
        List<String> list = new ArrayList<>(set1);
        Collections.sort(list, Collections.reverseOrder());

        for(String i : list){
            System.out.println(i);
        }
    }
}