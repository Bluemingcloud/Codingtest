import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		br.close(); 
		
		StringBuilder sb = new StringBuilder();
		while(n >= b) {
			sb.append(n % b < 10 ? n % b : "" + (char)(n % b - 10 + 'A'));
			
			n /= b;			
		}
		if(n != 0) sb.append(n < 10 ? n : "" + (char)(n - 10 + 'A'));
		sb.reverse();

		System.out.println(sb);		
		
	}
}
