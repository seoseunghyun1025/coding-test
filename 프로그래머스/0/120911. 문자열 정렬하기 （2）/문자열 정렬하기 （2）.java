import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i<my_string.length(); i++){
            char word = my_string.charAt(i);
            if(!Character.isLowerCase(word)){
                answer += Character.toString(Character.toLowerCase(word));
            }else{
                answer += Character.toString(word);
            }
        }
        String[] arrWord = answer.split("");
        answer = "";
        Arrays.sort(arrWord);
        for(String s : arrWord){
            answer += s;
        }
        return answer;
    }
}