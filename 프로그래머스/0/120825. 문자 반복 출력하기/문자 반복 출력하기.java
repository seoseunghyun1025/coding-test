import java.util.ArrayList;
class Solution {
    public String solution(String my_string, int n) {
        ArrayList<String> list = new ArrayList<String>();
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            list.add(Character.toString(my_string.charAt(i)));
        }
        for(int i=0; i< my_string.length(); i++){
            for(int j=0; j<n; j++){
                answer += list.get(i);
            }
        }
        return answer;
    }
}