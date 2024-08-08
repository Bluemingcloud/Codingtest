import java.io.*;
import java.util.*;

public class Main {
	
	static StringBuilder sb;
	static boolean[] set;
    
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		sb = new StringBuilder();
		set = new boolean[21];
		int m = Integer.parseInt(br.readLine());
		for(int i = 0; i < m; i++) {
			emptySet(br.readLine());
		}
		br.close();
		System.out.println(sb);
	}
	private static void emptySet(String str) {
		StringTokenizer st = new StringTokenizer(str);
		String key = st.nextToken();
		
		int num = 0;
		switch (key) {
		case "add":
			num = Integer.parseInt(st.nextToken());
			set[num] = true;
			break;
		case "remove":
			num = Integer.parseInt(st.nextToken());
			set[num] = false;
			break;
		case "check":
			num = Integer.parseInt(st.nextToken());
			sb.append(set[num] ? 1 : 0).append("\n");
			break;
		case "toggle":
			num = Integer.parseInt(st.nextToken());
			set[num] = !set[num];
			break;
		case "all":
			for(int i = 1; i < set.length; i++) {
				set[i] = true;
			}
			break;
		case "empty":
			for(int i = 1; i < set.length; i++) {
				set[i] = false;
			}
			break;
		default:
			break;
		}
	}
}