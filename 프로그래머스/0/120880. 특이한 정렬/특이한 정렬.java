import java.util.*;

class Solution {
    public List<Integer> solution(int[] numlist, int n) {
        List<Pair> list = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i<numlist.length; i++){
            Pair p = new Pair(numlist[i] ,Math.abs(n - numlist[i]));
            list.add(p);
        }
        
        Collections.sort(list);
        
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i).key + ": " + list.get(i).value);
            answer.add(list.get(i).key);
        }
        
        return answer;
    }
}

class Pair implements Comparable<Pair>{
    int key;
    int value;
    
    public Pair(int key, int value){
        this.key = key;
        this.value = value;
    }
    
    @Override   
    public int compareTo(Pair input) {
        if (this.value != input.value) {
            return Integer.compare(this.value, input.value);
        }
        return Integer.compare(input.key, this.key);
    }
}