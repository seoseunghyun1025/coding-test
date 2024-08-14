class Solution {
    public int[] solution(int[] emergency) {
        int[] array = new int[emergency.length];
        int[] answer = new int[emergency.length];
        int max = 0, index = 0;
        
        for(int i = 0; i < emergency.length; i++){
            array[i] = emergency[i];
        }
        
        for(int i = 0; i<emergency.length; i++){
            for(int j=0; j<emergency.length; j++){
                if(max < array[j]){
                    max = array[j];
                    index = j;
                }
            }
            array[index] = 0;
            answer[index] = i + 1;
            max = 0;
        }
        
        return answer;
    }
}