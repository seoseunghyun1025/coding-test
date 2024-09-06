class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int peo : array){
            if(peo > height){
                answer++;
            }
        }
        return answer;
    }
}