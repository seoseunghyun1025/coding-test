import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public ArrayList<Integer> solution(int[] num_list) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < num_list.length; i++){
            list.add(num_list[i]);
        }
        Collections.reverse(list);
        return list;
    }
}