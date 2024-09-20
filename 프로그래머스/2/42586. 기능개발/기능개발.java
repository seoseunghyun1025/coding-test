import java.util.*;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> answer = new ArrayList<Integer>();
        int namu = 0;
        for(int i = 0; i<progresses.length; i++){
            if((100 - progresses[i]) % speeds[i] == 0){
                namu = (100 - progresses[i]) / speeds[i];
            }else{
                namu = ((100 - progresses[i]) / speeds[i]) + 1; 
            }
            list.add(namu);
        }
        
        int x = list.get(0);
        int count=1;
        for(int i=1;i<list.size();i++){

            if(x>=list.get(i)){
                count++;
            }else{
                answer.add(count);
                count = 1;
                x = list.get(i);
            }
        }
        answer.add(count);
        
        return answer;
    }
}