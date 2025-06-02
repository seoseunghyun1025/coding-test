import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	static String[] splitStr;
	static int idx;
	static Stack<String> stack = new Stack<String>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();		
		splitStr = str.split("");

		System.out.println(StrLength(0));
	}
	
	static int StrLength(int start) {
		int len = 0;
		for (int i=start; i<splitStr.length; i++){
			if (splitStr[i].equals("(")) {
				stack.push(splitStr[i]);
				len += Integer.parseInt(splitStr[i-1])*StrLength(i+1)-1;
				i = idx;;
	
			}else if(splitStr[i].equals(")")){
				if (!stack.empty() && stack.peek().equals("(")) {
					idx = i;
					stack.pop();
					return len;
				}
			}else {
				len++;
			}
		}
		return len;		
	}
}