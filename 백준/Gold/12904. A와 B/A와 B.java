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
		String w = br.readLine();
		List<String> s = new ArrayList<>(Arrays.asList(w.split("")));
		String o = br.readLine();
		List<String> t = new ArrayList<>(Arrays.asList(o.split("")));
		int size = t.size();
		for(int i = 0; i < size; i++) {
			if(s.size() == t.size()) {
				break;
			}
			if(t.get(t.size() - 1).equals("A")) {
				t.remove(t.size() - 1);
			}else {
				t.remove(t.size() - 1);
				int jsize = t.size();
				Stack<String> sta = new Stack<>();
				for(int j = 0; j < jsize; j++) {
					sta.add(t.get(j));
				}
				for(int j = 0; j < jsize; j++){
					t.remove(0);
				}
				for(int j = 0; j < jsize; j++) {
					t.add(sta.pop());
				}
			}
		}
		boolean flag = true;
		for(int i = 0; i < s.size(); i++) {
			if(!s.get(i).equals(t.get(i))) {
				System.out.println(0);
				System.exit(0);
			}
		}
		System.out.println(1);
	}
}