class Solution {
    public int solution(int hp) {
        int answer = 0, mod = 0, 
            warlord = 0, sold = 0, work = 0;
        if(hp % 5 == 0){
            return answer = hp / 5;
        }else{
            warlord = hp / 5;
            mod = hp % 5;
            if(mod % 3 == 0){
                return answer = warlord + (mod / 3);
            }else{
                sold = mod / 3;
                work = mod % 3;
                return answer = warlord + sold + work;
            }
        }
    }
}