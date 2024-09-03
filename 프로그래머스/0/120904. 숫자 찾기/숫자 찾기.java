class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String word = String.valueOf(num);
        for(int i = 0; i<word.length(); i++){
            String han = Character.toString(word.charAt(i));
            if(han.equals(String.valueOf(k))){
                return i + 1;
            }
                
        }
        return -1;
    }
}