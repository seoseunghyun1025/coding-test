import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine());
       if(n >= 90){
           System.out.println("A");
           return;
       }else if(n >= 80){
           System.out.println("B");
           return;
       }else if(n >= 70){
           System.out.println("C");
           return;
       }else if(n >= 60){
           System.out.println("D");
           return;
       }else{
           System.out.println("F");
           return;
       }
    }
}