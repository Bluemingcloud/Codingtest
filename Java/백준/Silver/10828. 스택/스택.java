import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	static StringBuilder sb;
	static Stack<String> stack;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		stack = new Stack<>();
		
		int n = Integer.parseInt(br.readLine());
		
		while(n-- > 0) {
			myStack(br.readLine());
		}
		br.close();
		System.out.println(sb);
		
	}
	private static void myStack(String str) {
		String s = str.substring(0, 2);
		switch (s) {
		case "pu":
			stack.push(str.replace("push ", ""));
			break;
		case "to":
			sb.append(stack.isEmpty() ? -1 : stack.peek());
			sb.append("\n");
			break;
		case "si":
			sb.append(stack.size());
			sb.append("\n");
			break;
		case "em":
			sb.append(stack.isEmpty() ? 1 : 0);
			sb.append("\n");
			break;
		case "po":
			sb.append(stack.isEmpty() ? -1 : stack.pop());
			sb.append("\n");
			break;
		default:
			break;
		}
	}
}