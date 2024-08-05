import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static StringBuilder sb;
	static int idx;
	static int[] queue;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		idx = -1;		
		
		int n = Integer.parseInt(br.readLine());
		queue =  new int[n];
		
		for(int i = 0; i < n; i++) {
			myStack(br.readLine());
		}
		br.close();
		System.out.println(sb);
		
	}
	private static void myStack(String str) {
		String s = str.substring(0, 2);
		switch (s) {
		case "pu":
			idx++;
			queue[idx] = Integer.parseInt((str.replace("push ", "")));
			break;
		case "ba":
			sb.append(idx == -1 ? -1 : queue[idx]);
			sb.append("\n");
			break;
		case "fr":
			sb.append(idx == -1 ? -1 : queue[0]);
			sb.append("\n");			
			break;
		case "si":
			sb.append(idx == -1 ? 0 : idx + 1);
			sb.append("\n");
			break;
		case "em":
			sb.append(idx == -1 ? 1 : 0);
			sb.append("\n");
			break;
		case "po":
			sb.append(idx == -1 ? -1 : queue[0]);
			if(idx != -1) {
                // 한 칸 씩 앞으로 덮어쓰기
			    for(int i = 1; i <= idx; i++) {
				    queue[i - 1] = queue[i];
			    }
                idx--;
            }
			sb.append("\n");
            			
			break;
		default:
			break;
		}
	}
}