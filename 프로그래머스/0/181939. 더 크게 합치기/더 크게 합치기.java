class Solution {
    public int solution(int a, int b) {
        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);
        
        int 에이비 = Integer.parseInt(ab);
        int 비에이 = Integer.parseInt(ba);
        
        if(에이비 >= 비에이){
            return 에이비;
        }else{
            return 비에이;
        }
    }
}