import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> map = new HashMap<>();
		Queue<String> queue = new PriorityQueue<>();
		
		for(int i = 0; i < n; i++) {
			map.put(br.readLine(), i);
		}
		
		for(int i = 0; i < m; i++) {
			String name = br.readLine();
			if(map.containsKey(name)) {
				queue.offer(name);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(queue.size()).append("\n");
		while(queue.size() != 0) {
			sb.append(queue.poll()).append("\n");
		}
		System.out.println(sb.toString());
		br.close();
	}

}