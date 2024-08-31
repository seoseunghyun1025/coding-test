class Solution {
    public int solution(int n) {
        int answer = 0;
        int ans = 0;
        if(n % 2 == 1){
            while(n > 0){
                answer = answer + n;
                n -= 2;
            }
        }else{
            while(n > 0){
                ans = n * n;
                answer += ans;
                n -= 2;
            }
        }
        return answer;
    }
}