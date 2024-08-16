import java.util.HashMap;
class Solution {
    public String solution(String letter) {
        HashMap<String, String> map = new HashMap<String, String>();
        String[] morseArr = {".- a", "-... b","-.-. c", "-.. d", ". e", "..-. f",
                         "--. g", ".... h", ".. i", ".--- j", "-.- k", ".-.. l",
                         "-- m", "-. n", "--- o", ".--. p", "--.- q", ".-. r",
                         "... s", "- t", "..- u", "...- v", ".-- w", "-..- x",
                         "-.-- y", "--.. z"};
        String answer = "";
        for(String morse: morseArr){
            String[] splitMorse = morse.split(" ");
            map.put(splitMorse[0],splitMorse[1]);
            
        }
        for(String morse : letter.split(" ")){
            answer += map.get(morse);   
        }
        
        return answer;
    }
}