class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = String.valueOf(a) + String.valueOf(b); 
        int ba = 2 * a * b;
        int valueAb = Integer.parseInt(ab);
        
        if(valueAb >= ba){
            return valueAb;
        }else{
            return ba;
        }
    }
}