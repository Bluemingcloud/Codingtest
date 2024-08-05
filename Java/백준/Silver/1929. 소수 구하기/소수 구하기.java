import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static boolean[] prime;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		getPrime(n);
		
		for(int i = m; i <= n; i++) {
			if(!prime[i]) sb.append(i).append("\n");
		}
		System.out.println(sb);	
		
	}
	private static void getPrime(int n) {
		prime = new boolean[n + 1];
		prime[0] = true;
		prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(prime[i]) continue;
			for(int j = i*i; j <= n; j += i) {
				prime[j] = true;
			}
		}
	}
}