import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		Main m = new Main();
		int x = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i<x; i++) {
			String a = in.next();
			list.add(m.isVPS(a));
		}
		for(String s : list) {
			System.out.println(s);
		}
		
		in.close();
	}
	private String isVPS(String s) {
		Stack<Character> sta = new Stack<>();
		char c[] = s.toCharArray();
		
		for(int i = 0; i<c.length; i++) {
			if(c[i] == '(') {
				sta.push(c[i]);
			}
			if(c[i] == ')') {
				if(sta.isEmpty()) {
					return "NO";
				}
				sta.pop();
			}
		}
		if(sta.isEmpty()) {
			return "YES";
		}
		return "NO";
	}
}
