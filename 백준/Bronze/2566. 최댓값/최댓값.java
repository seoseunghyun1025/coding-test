
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int max = 0, i = 0, j = 0, maxI = 0, maxJ = 0;
        for(i = 0; i < arr.length; i++){
            for(j = 0; j < arr[i].length; j++){
                arr[i][j] = in.nextInt();
            }
        }
        for(i = 0; i < arr.length; i++){
            for(j = 0; j < arr[i].length; j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        System.out.println(max);
        System.out.println((maxI + 1) + " " + (maxJ + 1));
    }
}