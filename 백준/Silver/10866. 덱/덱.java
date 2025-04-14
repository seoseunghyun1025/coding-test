import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Deque<Integer> deque = new LinkedList<>();
		int n = in.nextInt();
		
		for(int i = 0; i < n; i++) {
			String word = in.next();
			if(word.equals("push_front")) {
				deque.addFirst(in.nextInt());
			}else if(word.equals("push_back")) {
				deque.addLast(in.nextInt());
			}else if(word.equals("pop_front")) {
				if(deque.isEmpty()) {
					System.out.println(-1);
					continue;
				}
				System.out.println(deque.pollFirst());
			}else if(word.equals("pop_back")) {
				if(deque.isEmpty()) {
					System.out.println(-1);
					continue;
				}
				System.out.println(deque.pollLast());
			}else if(word.equals("front")) {
				if(deque.isEmpty()) {
					System.out.println(-1);
					continue;
				}
				System.out.println(deque.peekFirst());
			}else if(word.equals("back")) {
				if(deque.isEmpty()) {
					System.out.println(-1);
					continue;
				}
				System.out.println(deque.peekLast());
			}else if(word.equals("empty")) {
				if(deque.isEmpty() == true) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			}else if(word.equals("size")) {
				System.out.println(deque.size());
			}
			
		}
		in.close();
	}

}
