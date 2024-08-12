class Solution {
    public int solution(int n) {
        int answer = 0, i = 1;
        while(true){
            if((i * 6) % n == 0){
                answer = i;
                return answer;
            }
            i++;
        }
    }
}