class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String namugi = "";
        
        String str = my_string.substring(0,s);
        String str1 = my_string.substring(s + overwrite_string.length());
        answer = answer + str + overwrite_string + str1;
        return answer;
    }
}