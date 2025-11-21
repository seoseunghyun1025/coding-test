import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	static boolean[] prime;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		prime = new boolean[1000001];
		makePrime();
		for(int i = 0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			int count = 0;
			for(int j = 2; j <= n / 2; j++) {
				if(!prime[j] && !prime[n - j]) {
					count++;
				}
			}	
			sb.append(count).append("\n");
		}		
		System.out.println(sb);
	}
	
	static void makePrime() {
		prime[0] = prime[1] = true;
		for(int i = 2; i < prime.length; i++) {
			if(prime[i] == true) {
				continue;
			}
			for(int j = 2; j * i < prime.length; j++ ) {
				prime[i * j] = true;
			}
		}
	}
	static boolean isPrime(int n) {
		if(n == 0 || n == 1) {
			return false;
		}
		for(int i = 2; i<=Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}