import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int min = Integer.MAX_VALUE;
		int max = 1;
		for(int i = 0; i < n; i++) {
			int value = Integer.parseInt(st.nextToken());
			if(value > max) max = value;
			if(value < min) min = value;
		}
		
		System.out.println(max * min);
		br.close();
		
	}

}