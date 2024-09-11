import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String word = "";
        List<String> sta = new ArrayList<String>();
        my_string = my_string.replaceAll("[A-Z,a-z]"," ");
        for(int i = 0; i<my_string.length(); i++){
            sta.add(Character.toString(my_string.charAt(i)));
            System.out.println(sta.get(i));
        }
        sta.add(" ");
        for(int  i = 0; i<sta.size(); i++){
            String num = sta.get(i);
            if(!num.equals(" ")){
                word += num;
            }else if(!word.equals("")){
                answer += Integer.parseInt(word);
                word = "";
            }
        }
        return answer;
    }
}