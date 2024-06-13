import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		// 별찍기 - 7
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			
			for(int j = N - 1; j > i; j--) {
				sb.append(" ");
			}
			for(int j = 0; j < 2 * i + 1; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		for(int i = N - 1; i > 0 ; i--) {
			for(int j = N; j > i; j--) {
				sb.append(" ");
			}
			for(int j = 0; j < 2 * i - 1; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}