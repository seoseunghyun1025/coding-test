import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = array[0];
        int diff = Math.abs(array[0] - n);
        for(int i = 1; i<array.length; i++){
            int currentDiff = Math.abs(array[i] - n);
            if(currentDiff < diff){
                diff = currentDiff;
                answer = array[i];
            }
        }
        return answer;
    }
}