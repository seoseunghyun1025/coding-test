import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int people = n; 
		int pos = m; 
		int round = 0;
		
		while(true) {
			round++;
			int out = k % people;
			if(out == 0) out = people;
			
			if(pos == out) {
				System.out.println(round);
				break;
			}
			if(pos > out) {
				pos = pos - out;
			}else {
				pos = pos + (people - out);
			}
			people--;
		}
	}
}