import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());

		int cnt = 1;
		int room = 1;
		while(true) {
			if(n == 1) {
				System.out.println(1);
				break;
			}
			if(room < n && n <= room + cnt * 6) {
				sb.append(cnt + 1);
				break;				
			}
			room += cnt * 6;
			cnt++;
		}		
		bw.write(""+sb);
		bw.flush();
		bw.close();
		br.close();
	}
}
