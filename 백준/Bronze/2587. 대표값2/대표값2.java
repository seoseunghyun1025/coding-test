import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0, avg = 0;

        for(int i = 0; i<arr.length; i++){
            arr[i] = in.nextInt();
        } 

        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        avg = sum / arr.length;

        System.out.println(avg);
        System.out.println(arr[arr.length/2]);
        in.close();
    }
}