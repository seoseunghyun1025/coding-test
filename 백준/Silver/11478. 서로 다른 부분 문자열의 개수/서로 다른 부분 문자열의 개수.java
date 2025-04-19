import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        String str = in.next();
        int answer = 0;
        for(int i = 0; i < str.length(); i++){
            String w = Character.toString(str.charAt(i));
            set.add(w);
            for(int j = i + 1; j < str.length(); j++){
              w += Character.toString(str.charAt(j));
              set.add(w);
            }
        }
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String s = it.next();
            answer++;
        }
        System.out.println(answer);
    }
}