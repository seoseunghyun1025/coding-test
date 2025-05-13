
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String w = in.nextLine();
        in.close();

        int startIndex = 0;
        int count = 0;
        while(true){
            int findIndex = s.indexOf(w, startIndex);
            if(findIndex < 0){
                break;
            }
            count++;
            startIndex = findIndex + w.length();
        }
        System.out.println(count);
    }
}