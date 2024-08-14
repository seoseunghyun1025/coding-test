import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int[] numbers, int num1, int num2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = num1; i < numbers.length; i++){
            if(i == num2){
                list.add(numbers[i]);
                break;
            }
            list.add(numbers[i]);
        }
        return list;
    }
}