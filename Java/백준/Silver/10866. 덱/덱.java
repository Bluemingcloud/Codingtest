import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static StringBuilder sb;
	static int idx;
	static int back;
	static int[] deque;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		idx = -1;		
		back = 0;
		int n = Integer.parseInt(br.readLine());
		deque =  new int[n];

		for(int i = 0; i < n; i++) {
			myDeque(br.readLine());
		}
		br.close();
		System.out.println(sb);
		
	}
	private static void myDeque(String str) {
		StringTokenizer st = new StringTokenizer(str);
		String s = st.nextToken();
		switch (s) {
		case "push_back":
			idx++;
			deque[idx] = Integer.parseInt(st.nextToken());
			break;
		case "push_front":
			idx++;
            for (int i = idx; i > 0; i--) {
                deque[i] = deque[i - 1];
            }
			deque[0] = Integer.parseInt(st.nextToken());
			break;
		case "back":
			sb.append(idx == -1 ? -1 : deque[idx]);
			sb.append("\n");
			break;
		case "front":
			sb.append(idx == -1 ? -1 : deque[0]);
			sb.append("\n");			
			break;
		case "size":
			int size = idx == -1 ? 0 : idx + 1;
			sb.append(size);
			sb.append("\n");
			break;
		case "empty":
			sb.append(idx == -1 ? 1 : 0);
			sb.append("\n");
			break;
		case "pop_front":
			sb.append(idx == -1 ? -1 : deque[0]);
			if (idx != -1) {
                for (int i = 0; i < idx; i++) {
                    deque[i] = deque[i + 1];
                }
                idx--;
            }
			sb.append("\n");			
			break;
		case "pop_back":
			sb.append(idx == -1 ? -1 : deque[idx]);
			if(idx != -1) {
                deque[idx] = 0;
			    idx--;
            }
			sb.append("\n");			
			break;
		default:
			break;
		}
	}
}