import java.util.ArrayList;
class Solution {
    public int solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int answer = 0, max1 = 0, max2 = 0, index = 0;
        for(int i = 0; i<numbers.length; i++){
            list.add(numbers[i]);
        }
        for(int i=0; i<list.size(); i++){
            if(max1 < list.get(i)){
                max1 = list.get(i);
                index = i;
            }
        }
        list.remove(index);
        for(int i=0; i<list.size(); i++){
            if(max2 < list.get(i)){
                max2 = list.get(i);
                index = i;
            }
        }
        answer = max1 * max2;
        return answer;
    }
}