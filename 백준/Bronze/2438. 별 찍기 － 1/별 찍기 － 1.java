import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int star = in.nextInt();

        for(int i = 0; i<star; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        in.close();
    }
}