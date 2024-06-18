import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		// 세탁소 사장 동혁
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb;
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0) {
			int c = Integer.parseInt(br.readLine());
			sb = new StringBuilder();
			sb.append(c/25).append(" ");
			c %= 25;
			sb.append(c / 10).append(" ");
			c %= 10;
			sb.append(c / 5).append(" ");
			sb.append(c % 5);
			
			bw.write("" + sb);
			bw.write("\n");			
		}
		bw.flush();
		bw.close();
		br.close();	
		
	}
}
