class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i = 0; i<= cipher.length(); i += code){
            if(i == 0){
                continue;
            }
            System.out.println("현재 i: " + i + " 현재 cipher의 길이: " + cipher.length());
            answer += Character.toString(cipher.charAt(i-1));
        }
        return answer;
    }
}