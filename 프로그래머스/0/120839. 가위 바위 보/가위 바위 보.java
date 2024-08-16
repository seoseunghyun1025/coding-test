class Solution {
    public String solution(String rsp) {
        String answer = "", word = "";
        for(int i = 0; i<rsp.length(); i++){
            word = Character.toString(rsp.charAt(i));
            if(word.equals("0")){
                answer += "5";
            }else if(word.equals("2")){
                answer += "0";
            }else{
                answer += "2";
            }
        }
        return answer;
    }
}