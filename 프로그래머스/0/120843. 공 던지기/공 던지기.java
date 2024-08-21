class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 1;
        if(numbers.length % 2 == 0){
            for(int i = 1; i<k; i++){
                answer += 2;
                if(answer >= numbers.length){
                    answer = 1;
                }
            }
        }else{
            for(int i = 1; i<k; i++){
                answer += 2;
                System.out.println("현재 값: " + answer);
                if(answer > numbers.length){
                    System.out.println("현재 값은: " + answer+"이고, if문 안에 들어옴");
                    if(answer % 2 == 1){
                        answer = 2;
                    }else{
                        answer = 1;
                    }
                }
            }
        }
        return answer;
    }
}