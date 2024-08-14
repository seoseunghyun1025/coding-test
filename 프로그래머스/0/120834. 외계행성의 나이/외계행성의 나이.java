import java.util.HashMap;
class Solution {
    public String solution(int age) {
        String value = String.valueOf(age);
        String answer = "";
        HashMap<String,String> hash = new HashMap<String, String>();
        hash.put("0","a");
        hash.put("1","b");
        hash.put("2","c");
        hash.put("3","d");
        hash.put("4","e");
        hash.put("5","f");
        hash.put("6","g");
        hash.put("7","h");
        hash.put("8","i");
        hash.put("9","j");
        for(int i = 0; i<value.length(); i++){
            answer += hash.get(Character.toString(value.charAt(i)));
        }
        return answer;
    }
}