import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
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
				bw.write(mapInt.get(Integer.parseInt(str)));
			} catch (NumberFormatException e) {
				bw.write(mapStr.get(str).toString());
			} finally {
				bw.write("\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();	
	}
}