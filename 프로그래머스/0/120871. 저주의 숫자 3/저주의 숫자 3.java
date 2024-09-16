class Solution {
    public int solution(int n) {
        int answer = 0;
        System.out.println(answer);
        for(int i = 0; i<n; i++){
            answer++;
            while(answer % 3 == 0 || String.valueOf(answer).contains("3")){
                answer++;
            }
            System.out.println("현재 i: " + i+ " answer: " + answer);
        }
        return answer;
    }
}
