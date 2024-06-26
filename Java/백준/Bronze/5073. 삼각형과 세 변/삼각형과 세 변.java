import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str;
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		while(!(str = br.readLine()).equals("0 0 0")) {
			 st = new StringTokenizer(str);
			
			int[] arr = new int[3];
			arr[0] = Integer.parseInt(st.nextToken());
			arr[1] = Integer.parseInt(st.nextToken());
			arr[2] = Integer.parseInt(st.nextToken());
			
			int cnt = (int)Arrays.stream(arr).distinct().count();
			int max = Arrays.stream(arr).max().getAsInt();
			if(Arrays.stream(arr).sum() > 2 * max) {
				if(cnt == 1) sb.append("Equilateral");
				if(cnt == 2) sb.append("Isosceles");
				if(cnt == 3) sb.append("Scalene");
			} else sb.append("Invalid");
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();	
	}
}