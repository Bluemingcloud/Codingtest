import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		// 배수와 약수
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();		
		String str;
		
		while(!(str = br.readLine()).equals("0 0")) {
			StringTokenizer st = new StringTokenizer(str);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(b % a == 0) {
				sb.append("factor");
			} else if(a % b == 0) {
				sb.append("multiple");
			} else {
				sb.append("neither");
			}
			sb.append("\n");
		}
		System.out.println(sb);
		br.close();
		
	}

}
