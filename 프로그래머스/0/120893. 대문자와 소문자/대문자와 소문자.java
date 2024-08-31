import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i =0; i< my_string.length(); i++){
            char word = my_string.charAt(i);
            if(Character.isUpperCase(word)){
                answer += Character.toLowerCase(word);
            }else{
                answer += Character.toUpperCase(word);
            }
        }
        return answer;
    }
}