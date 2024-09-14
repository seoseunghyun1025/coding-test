import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int[] spellCount = new int[26];
        int[] dicCount;
        
        for (char c : String.join("", spell).toCharArray()) {
            spellCount[c - 'a']++;
        }
        
        for (String word : dic) {
            dicCount = new int[26];
            for (char c : word.toCharArray()) {
                dicCount[c - 'a']++;
            }
            if (Arrays.equals(spellCount, dicCount)) {
                return 1;
            }
        }
        
        return 2;
    }
}