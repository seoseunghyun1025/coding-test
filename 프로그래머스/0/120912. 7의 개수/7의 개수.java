class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String num = "";
        for(int i = 0; i<array.length; i++){
            num = String.valueOf(array[i]);
            for(int j = 0; j<num.length(); j++){
                if(Character.toString(num.charAt(j)).equals("7")){
                    answer++;
                }
            }
        }
        return answer;
    }
}