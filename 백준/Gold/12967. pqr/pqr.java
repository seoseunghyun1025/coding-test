import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		//gcd를 구해서 
		int g[] = new int[N];
		for(int i = 0; i< N; i++) {
			g[i] = gcd(arr[i], K);
		}
		
		//gcd가 몇 개 있는지 
		int cnt[] = new int[K + 1];
		for(int i = 0; i< N; i++) {
			cnt[g[i]]++;
		}
		
		int m = 0;
		int val[] = new int[N + 1]; //n들어가도 됨
		for(int i = 1; i <= K; i++) {
			if(cnt[i] > 0) {
				val[m++] = i;
			}
		}
		long answer = 0L;

		for (int i = 0; i < m; i++) {
		    for (int j = i; j < m; j++) {
		        for (int k = j; k < m; k++) {
		            long a = val[i];
		            long b = val[j];
		            long c = val[k];

		            if ((a * b * c) % K != 0) continue;  // 조건 안 맞으면 패스

		            if (i == j && j == k) {
		                int n = cnt[(int)a];
		                if (n >= 3) {
		                    answer += (long)n * (n - 1) * (n - 2) / 6;   // C(n,3)
		                }
		            } else if (i == j && j != k) {
		                int n1 = cnt[(int)a];
		                int n2 = cnt[(int)c];
		                if (n1 >= 2) {
		                    answer += (long)n1 * (n1 - 1) / 2 * n2;     // C(n1,2) * n2
		                }
		            } else if (i < j && j == k) {
		                int n1 = cnt[(int)a];
		                int n2 = cnt[(int)b];
		                if (n2 >= 2) {
		                    answer += (long)n1 * n2 * (n2 - 1) / 2;     // n1 * C(n2,2)
		                }
		            } else { // i < j < k
		                int n1 = cnt[(int)a];
		                int n2 = cnt[(int)b];
		                int n3 = cnt[(int)c];
		                answer += (long)n1 * n2 * n3;
		            }
		        }
		    }
		}

		System.out.println(answer);
		
	}
	static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a % b);
	}
}