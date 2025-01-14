import java.util.*;
class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String[] word = new String[A.length()];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<A.length(); i++){
            word[i] = Character.toString(A.charAt(i));
        }
        
        for(int i = 0; i < word.length; i++){        
            //문자열 만들기
            for(int j = 0; j < word.length; j++){
                sb.append(word[j]);
            }
            //비교
            if(sb.toString().equals(B)){
                return answer;
            }
            sb.delete(0,word.length);
            //한 칸씩 밀기
            int N = word.length;
            String temp = word[0];
            word[0] = word[N - 1];
            for(int k = N - 2; k >= 0; k--){
                word[k + 1] = word[k];
            }
            word[1] = temp;
            answer++;
        }
        
        return -1;
    }
}