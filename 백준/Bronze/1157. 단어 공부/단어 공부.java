import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String a = in.next();
        int flag = 0, max = -1, maxIn = 0;

        int[] arr = new int[255];
        char[] c = a.toCharArray();
        for(int i = 0; i<c.length; i++){
            int b = Character.toLowerCase(c[i]);
            arr[b]++;
        }

        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(flag == 2){
                System.out.println("?");
                return;
            }
            if(max == arr[i]){
                flag++;
                maxIn = i;
            }
        }
        System.out.println(Character.toString(maxIn).toUpperCase());
    }
}