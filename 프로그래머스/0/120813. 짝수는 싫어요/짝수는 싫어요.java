import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int i = 1;
        while(true){
            if(n < i){
                break;
            }
            if(i % 2 == 1){
                answer.add(i);
            }
            i++;
        }
        return answer;
    }
}