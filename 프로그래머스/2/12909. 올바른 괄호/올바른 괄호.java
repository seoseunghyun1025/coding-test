import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<String> sta = new Stack<String>();
        for(int i = 0; i<s.length(); i++){
            String word = Character.toString(s.charAt(i));
            if(sta.isEmpty() && word.equals(")")){
                return false;
            }
            if(word.equals("(")){
                sta.add(word);
            }else{
                sta.pop();
            }
            
        }     
        if(sta.size() == 0){
            return true;
        }else{
            return false;
        }
    }
}