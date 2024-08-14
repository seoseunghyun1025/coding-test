import java.util.ArrayList;
class Solution {
    public String solution(String my_string, String letter) {
        ArrayList<String> list = new ArrayList<String>();
        String answer = "";
        for(int i=0; i< my_string.length(); i++){
            if(Character.toString(my_string.charAt(i)).equals(letter)){
                continue;
            }
            list.add(Character.toString(my_string.charAt(i)));
        }
        for(int i = 0; i<list.size(); i++){
            answer += list.get(i);
        }
        return answer;
    }
}