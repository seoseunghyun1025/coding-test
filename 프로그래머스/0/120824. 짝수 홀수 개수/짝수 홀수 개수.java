class Solution {
    public int[] solution(int[] num_list) {
        int countOdd = 0, countEven = 0;
        for(int i = 0; i< num_list.length; i++){
            if(num_list[i] % 2 == 0){
                countEven++;
            }else{
                countOdd++;
            }
        }
        
        int[] answer = {countEven, countOdd};
        return answer;
    }
}