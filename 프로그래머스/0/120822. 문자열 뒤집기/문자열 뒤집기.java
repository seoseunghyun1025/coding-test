import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        ArrayList<String> list = new ArrayList<String>();
        
        for(int i = 0; i<my_string.length(); i++){
            list.add(Character.toString(my_string.charAt(i)));
        }
        Collections.reverse(list);
        
        for(int i = 0; i<my_string.length(); i++){
            answer += list.get(i);
        }
        return answer;
    }
}