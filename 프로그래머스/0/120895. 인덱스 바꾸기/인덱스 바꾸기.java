class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        for(int i =0; i<my_string.length(); i++){
            String word = Character.toString(my_string.charAt(i));
            if(i == num1){
                answer += Character.toString(my_string.charAt(num2));
            }
            else if(i == num2){
                answer += Character.toString(my_string.charAt(num1));
            }else{
                answer += word;
            }
        }
        return answer;
    }
}