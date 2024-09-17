import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 1;
        int[] flag = new int[dic.length];
        for(int i =0; i < dic.length; i++){
            for(int j = 0; j<spell.length; j++){
                if(!dic[i].contains(spell[j])){
                    flag[i] = 2;
                    break;
                }
            }
        }
        for(int i = 0; i<flag.length; i++){
            if(flag[i] == 0){
                answer = 1;
                break;
            }else{
                answer = 2;
            }
        }
        return answer;
    }
}