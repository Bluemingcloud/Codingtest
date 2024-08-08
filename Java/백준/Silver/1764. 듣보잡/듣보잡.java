import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> mapResult = new TreeMap<>();
		
		for(int i = 0; i < n; i++) {
			map.put(br.readLine(), i);
		}
		
		for(int i = 0; i < m; i++) {
			String name = br.readLine();
			if(map.containsKey(name)) {
				mapResult.put(name, i);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(mapResult.size()).append("\n");
		for(String key : mapResult.keySet()) {
            sb.append(key).append("\n");
        }
		System.out.println(sb.toString());
		br.close();
	}

}