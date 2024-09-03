import java.util.*;
class Solution {
    public int solution(String my_string) {
        String[] word = my_string.split(" ");
        int answer = Integer.parseInt(word[0]);
        int yeon = 0;
        
        for(int i = 1; i<word.length; i++){
            if(i % 2 == 0){
                yeon *= Integer.parseInt(word[i]);
                answer += yeon;
            }
            else if(word[i].equals("+")){
                yeon = 1;
            }else{
                yeon = -1;
            }
        }
        return answer;
    }
}