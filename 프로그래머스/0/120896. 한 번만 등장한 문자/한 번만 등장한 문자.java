class Solution {
    public String solution(String s) {
        String answer = "";
        int i = 0, cnt = 0;
        String[] str = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        while(i < str.length){
            for(int j = 0; j<s.length(); j++){
                if(Character.toString(s.charAt(j)).equals(str[i])){
                    cnt++;
                }
                if(cnt >= 2){
                    break;
                }
            }
            if(cnt == 1){
                answer += str[i];
            }
            cnt = 0;
            i++;
        }
        return answer;
    }
}