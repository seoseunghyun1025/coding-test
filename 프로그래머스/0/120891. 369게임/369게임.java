class Solution {
    public int solution(int order) {
        int answer = 0;
        String word = String.valueOf(order);
        
        for(int i = 0; i<word.length(); i++){
            String chara = Character.toString(word.charAt(i));
            if(chara.equals("3") || chara.equals("6") || chara.equals("9")){
                answer++;
            }
        }
        return answer;
    }
}