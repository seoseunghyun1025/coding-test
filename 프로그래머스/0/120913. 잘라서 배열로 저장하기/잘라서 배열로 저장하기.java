import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer;
        int num = 0, index = 0;
        if(my_str.length() % n == 0){
            answer = new String[my_str.length() / n];
        }else{
            answer = new String[my_str.length() / n + 1];
        }
        num = answer.length * n;
        for(int i = 0; i<num; i+=n){
            if (i + n < my_str.length()) {
                answer[index++] = my_str.substring(i, i + n);
            } else {
                answer[index++] = my_str.substring(i, my_str.length());
            }
        }
        
        return answer; 
    }
}