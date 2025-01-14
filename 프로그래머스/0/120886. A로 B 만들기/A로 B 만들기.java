import java.util.*;
class Solution {
    public int solution(String before, String after) {
        List<Character> list = new ArrayList<>();
        for(int i = 0; i<before.length(); i++){
            list.add(before.charAt(i));    
        }
        
        for(int i = 0; i<before.length(); i++){
            for(int j = 0; j<list.size(); j++){
                if(after.charAt(i) == list.get(j)){
                    list.remove(j);
                    break;
                }
            }
        }
        
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        if(list.size() == 0){
            return 1;
        }
        return 0;
    }
}