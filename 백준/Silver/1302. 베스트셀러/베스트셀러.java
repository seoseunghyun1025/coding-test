import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = 0, max = 0; 
		
		String[] s = new String[n];
		
		for(int i = 0; i<n; i++) {
			s[i] = in.next();
		}
		Arrays.sort(s);
		String w = s[0];
		String res = "";
		for(int i = 0; i<s.length; i++){
			if(s[i].equals(w)) {
				count++;
			}else {
				if(max < count) {
					res = w;
					max = count;
				}
				count = 1;
				w = s[i];
			}
		}
		if(count > max) {
			res = w;
		}
		System.out.println(res);
	}

}
