import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		if(Integer.parseInt(n) < 10) n = "0" + n;
		br.close();
		
		StringBuilder sb = new StringBuilder(n);
		StringBuilder temp = new StringBuilder();
		int cnt = 0;
		int num = 0;

		while(!temp.toString().equals(n)) {
			
			num = sb.charAt(0) + sb.charAt(1) - 2 * '0';
			
			temp.setLength(0);
			temp.append(sb.charAt(1)).append(num % 10);
			cnt++;
			
			sb.setLength(0);
			sb.append(temp);
			
		}
		
		System.out.println(cnt);
		
	}
}