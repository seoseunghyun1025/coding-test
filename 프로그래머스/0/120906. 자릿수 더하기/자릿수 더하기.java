class Solution {
    public int solution(int n) {
        String word = String.valueOf(n);
        int answer = 0;
        for(int i = 0; i<word.length(); i++){
            answer += Integer.valueOf(Character.toString(word.charAt(i)));
        }
        return answer;
    }
}