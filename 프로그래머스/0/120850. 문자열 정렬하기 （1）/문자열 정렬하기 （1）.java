import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        String num = my_string.replaceAll("[^0-9]", "");
        int[] answer = new int[num.length()];
        for(int i =0; i<num.length(); i++){
            answer[i] = Integer.valueOf(Character.toString(num.charAt(i)));
        }
        Arrays.sort(answer);
        return answer;
    }
}