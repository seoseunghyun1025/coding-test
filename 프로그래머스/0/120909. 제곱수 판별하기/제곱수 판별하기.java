class Solution {
    public int solution(int n) {
        for(int i = 0; i<1000000; i++){
            if(i * i == n){
                return 1;
            }
            if(i * i > n){
                return 2;
            }
        }
        return 2;
    }
}