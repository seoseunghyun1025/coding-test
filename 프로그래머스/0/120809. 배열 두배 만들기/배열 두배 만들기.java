import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i=0; i<numbers.length; i++){
            answer.add(numbers[i] * 2);
        }
        return answer;
    }
}