import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int answer = 0;
        int b = 0;
        int x = in.nextInt();
        int a = in.nextInt();
        for(int i = 0; i<x; i++){
            list.add(in.nextInt());
        }
        for(int i = 0; i < x; i++){
            for(int j = i + 1; j < x; j++){
                for(int k = j + 1; k < x; k++){
                    int t = list.get(i) + list.get(j) + list.get(k);
                    if(answer < t && t <= a){
                        answer = t;
                    }
                }
            }
        }
        System.out.println(answer);
        in.close();
    }
}