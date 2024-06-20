import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		// 소수
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		boolean[] primes = new boolean[n + 1];
		primes[1] = true;
		
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(primes[i]) continue;
			for(int j = i * i; j < n + 1; j += i) {
				primes[j] = true;
			}			
		}
		
		int min = 0;
		int sum = 0;
		for(int i = m; i <= n; i++) {
			if(!primes[i]) {
				if(min == 0) min = i;
				sum += i;
			}
		}
		
		System.out.println(sum != 0 ? sum + "\n" + min : -1);
		
	}
}
