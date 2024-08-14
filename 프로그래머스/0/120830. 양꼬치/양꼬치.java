class Solution {
    public int solution(int n, int k) {
        int answer = 0, namu = 0;
        if(n >= 10){
            namu = n / 10;
            System.out.print(namu);
            answer = answer + (12000 * n) + (2000 * k) - (2000 * namu);
        }
        else{
            answer = answer +(12000 * n) + (2000 * k);
        }
        return answer;
    }
}