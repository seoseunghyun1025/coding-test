class Solution {
    public int solution(int chicken) {
        int count = 0;
        int answer = 0;
        int coupon = chicken;
        int remainder = 0;

        while (coupon > 0) {
            count++;
            answer += coupon / 10;
            remainder += coupon % 10;
            coupon /= 10; 
            System.out.println(count + ". total: " + answer +"\n" + "   remain: " + remainder + "\n" + "   chick: " + coupon);
            System.out.println("");
        }
        
        while (remainder > 9){
            remainder = remainder + (remainder / 10);
            System.out.println(remainder);
            answer = answer + remainder / 10;
            remainder = remainder / 10;
            System.out.println("");
            System.out.println(remainder);
        }
        return answer;
    }
}