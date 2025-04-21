import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        LinkedHashSet<String> set  = new LinkedHashSet<>();
        int n = in.nextInt(), m = in.nextInt();
        int count = 0;

        for(int i = 0; i < m; i++){
            String s = in.next();
            if(!set.contains(s)){
                set.add(s);
            }else{
                set.remove(s);
                set.add(s);
            }
        }
        Iterator<String> it = set.iterator();
        while(it.hasNext() && count < n){
            String s = it.next();
            System.out.println(s);
            count++;
        }
        in.close();
    }
}