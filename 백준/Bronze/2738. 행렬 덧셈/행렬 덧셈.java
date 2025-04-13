import javax.sound.midi.SysexMessage;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt(), y = in.nextInt();
        int[][] arr1 = new int[x][y];
        int[][] arr2 = new int[x][y];
        int[][] answer = new int[x][y];

        for(int i = 0; i<x; i++){
            for(int j = 0; j<y; j++){
                arr1[i][j] = in.nextInt();
            }
        }

        for(int i = 0; i<x; i++){
            for(int j = 0; j<y; j++){
                arr2[i][j] = in.nextInt();
            }
        }

        for(int i = 0; i<x; i++){
            for(int j = 0; j<y; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for(int i = 0; i<x; i++){
            for(int j = 0; j<y; j++){
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }

        in.close();
    }
}