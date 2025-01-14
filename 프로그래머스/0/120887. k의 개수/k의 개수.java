class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String word = Integer.toString(k);
        
        for(int index = i; index <= j; index++){
            String numStr = String.valueOf(index);
            String[] strArray = numStr.split("");
            for(int jedex = 0; jedex<strArray.length; jedex++){
                if(word.equals(strArray[jedex])){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}