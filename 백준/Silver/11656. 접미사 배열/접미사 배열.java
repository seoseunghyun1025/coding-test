import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        String word = "";
        char[] c = n.toCharArray();
        List<String> list = new ArrayList<>();

        for(int i = 0; i < n.length(); i++){
            for(int j = i; j < n.length(); j++){
                  word += c[j];
            }
            list.add(word);
            word = "";
        }

        Collections.sort(list, new Comparator<String>(){
            public int compare(String s1, String s2){
                return s1.compareTo(s2);
            }
        });

        for(String s : list){
            System.out.println(s);
        }
        in.close();
    }
}