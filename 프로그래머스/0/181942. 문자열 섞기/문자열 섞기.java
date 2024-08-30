class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        char a;
        char b;
        for(int i=0; i<str1.length(); i++){
            a = str1.charAt(i);
            b = str2.charAt(i);
            answer = answer + a + b;
        }
        return answer;
    }
}