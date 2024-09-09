import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int plus = numbers[0] * numbers[1];
        int minus = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        if(plus > minus) {
            return plus;
        }else{
            return minus;
        }
    }
}