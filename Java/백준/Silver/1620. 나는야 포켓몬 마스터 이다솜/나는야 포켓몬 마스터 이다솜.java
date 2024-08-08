import java.io.*;
import java.util.*;

public class Main {
	
		public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Map<Integer, String> mapInt = new HashMap<>();
		Map<String, Integer> mapStr = new HashMap<>();
		for(int i = 1; i <= n; i++) {
			String name = br.readLine();
			mapInt.put(i, name);
			mapStr.put(name, i);
		}
		
		for(int i = 0; i < m; i++) {
			String str = br.readLine(); 
			try {
				sb.append(mapInt.get(Integer.parseInt(str)));
			} catch (NumberFormatException e) {
				sb.append(mapStr.get(str));
			} finally {
				sb.append("\n");
			}
		}
		System.out.println(sb.toString());
		br.close();	
	}
}