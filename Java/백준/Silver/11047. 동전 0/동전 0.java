import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] coins = new int[n];
		for(int i = 0; i < n; i++) {
			coins[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		
		int cnt = 0;
		int idx = coins.length - 1;
		while(k > 0) {
			if(coins[idx] <= k) {
				cnt += k / coins[idx];
				k %= coins[idx];
			}
			idx--;
		}
		
		System.out.println(cnt);
	}
}