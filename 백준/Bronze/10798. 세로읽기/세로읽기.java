import javax.sound.midi.SysexMessage;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] word = new String[5];
        String answer = "";
        for(int i = 0; i<word.length; i++){
            word[i] = in.nextLine();
        }

        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 5; j++){
                if(word[j].length() <= i){
                    continue;
                }
                answer += Character.toString(word[j].charAt(i));
            }
        }
        System.out.println(answer);
        in.close();
    }
}