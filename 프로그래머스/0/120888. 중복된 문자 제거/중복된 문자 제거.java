import java.util.Stack;
class Solution {
    public String solution(String my_string) {
        Stack<String> stack = new Stack<String>();
        String answer = "", word = "";
        for(int i=0;i<my_string.length(); i++){
            word = Character.toString(my_string.charAt(i));
            if(answer.contains(word)){
                System.out.println("if문 안에 들어옴: " + word);
                continue;
            }else{
                answer += word;
            }
        }
        return answer;
    }
}