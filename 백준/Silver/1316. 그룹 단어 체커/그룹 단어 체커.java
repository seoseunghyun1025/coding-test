import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Set<Character> set = new HashSet<>();
        int n = in.nextInt();
        char pre = 'c', c = 'c';
        int count = 0, flag = 0;
        String[] s = new String[n];

        for(int i = 0; i < n; i++){
            s[i] = in.next();
        }

        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < s[i].length(); j++){
                c = s[i].charAt(j);
                if(set.contains(c)){
                    if(c != pre){
                        flag = 1;
                        break;
                    }else{
                        set.add(c);
                    }
                }else{
                    set.add(c);
                }
                pre = c;
            }
            if(flag == 0){
                count++;
            }
            set.clear();
            flag = 0;
        }
        System.out.println(count);
        in.close();
    }
}