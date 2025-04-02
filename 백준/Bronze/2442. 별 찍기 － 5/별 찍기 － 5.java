import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int star = in.nextInt();

        for(int i = 0; i < star; i++){
            for(int j = 0; j < star - i - 1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i * 2 + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        in.close();
    }
}