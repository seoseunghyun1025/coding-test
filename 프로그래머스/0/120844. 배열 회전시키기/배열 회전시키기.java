class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int firstPara = 0, finalPara = 0;
        if(direction.equals("right")){
            answer[0] = numbers[numbers.length - 1];
            for(int i = 1; i<=numbers.length - 1; i++){
                answer[i] = numbers[i-1];
            }
        }else{
            answer[answer.length - 1] = numbers[0];
            for(int i=0; i<numbers.length - 1; i++){
                answer[i] = numbers[i + 1];
            }
        }
        
        return answer;
    }
}