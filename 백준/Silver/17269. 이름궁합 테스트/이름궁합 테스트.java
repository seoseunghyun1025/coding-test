import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String input = br.readLine();

        String[] part = input.split(" ");

        char[] name1 = part[0].toCharArray();
        char[] name2 = part[1].toCharArray();

        int maxLength = Math.max(name1.length, name2.length);

        List<Character> nameBox = new ArrayList<>();

        for(int i = 0 ; i < maxLength ; i++ ){
            if(i < name1.length) {
                nameBox.add(name1[i]);
            }

            if(i < name2.length ) {
                nameBox.add(name2[i]);
            }
            
        }        
        
        Map<Character, Integer> alphabet = new HashMap<>();

        alphabet.put('A', 3);
        alphabet.put('B', 2);
        alphabet.put('C', 1);
        alphabet.put('D', 2);
        alphabet.put('E', 4);
        alphabet.put('F', 3);
        alphabet.put('G', 1);
        alphabet.put('H', 3);
        alphabet.put('I', 1);
        alphabet.put('J', 1);
        alphabet.put('K', 3);
        alphabet.put('L', 1);
        alphabet.put('M', 3);
        alphabet.put('N', 2);
        alphabet.put('O', 1);
        alphabet.put('P', 2);
        alphabet.put('Q', 2);
        alphabet.put('R', 2);
        alphabet.put('S', 1);
        alphabet.put('T', 2);
        alphabet.put('U', 1);
        alphabet.put('V', 1);
        alphabet.put('W', 1);
        alphabet.put('X', 2);
        alphabet.put('Y', 2);
        alphabet.put('Z', 1);

        // 알파벳 숫자로 치환 
        List<Integer> numList = new ArrayList<>();

        for(int i = 0 ; i < nameBox.size() ; i++ ){
            numList.add(alphabet.get(nameBox.get(i)));

        }

        List<Integer> result = numList;

        while(result.size() > 2) {
            List<Integer> tempList = new ArrayList<>();

            for(int i = 0 ; i < result.size() - 1 ; i++) {
            int num = (result.get(i) + result.get(i+1)) % 10;
            tempList.add(num);
            }
            
            result = tempList;
        }

        String results = String.valueOf(result.get(0) * 10 + result.get(1));
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(results+"%");
        
        bw.flush();        
        bw.close();

    }
}