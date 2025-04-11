import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> sta = new Stack<>();
        List<String> list = new ArrayList<>();
        int x = in.nextInt();
        int curr = 1;
        int[] arr = new int[x];
        for(int i = 0; i < x; i++){
            arr[i] = in.nextInt();
        }

        for(int i = 0; i < x; i++){
            int t = arr[i];

            while(t >= curr){
                sta.push(curr);
                list.add("+");
                curr++;
            }

            if(t == sta.peek()){
                sta.pop();
                list.add("-");
            }else{
                System.out.println("NO");
                return;
            }
        }
        for(String i : list) {
            System.out.println(i);
        }
        in.close();
    }
}