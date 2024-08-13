class Solution {
    public int solution(double price) {
        int answer = 0;
        if(price >= 500000){
            return answer = (int)(price - (price * 0.2));
        }
        if(price >= 300000){
            return answer = (int)(price - (price * 0.1));
        }
        if(price >= 100000){
            return answer = (int)(price - (price * 0.05));
        }
        if(price < 100000){
            return (int)price;
        }
        return 1;
    }
}