import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int i = 1;
		for(int value : arr) {
			while(i <= value) {
				stack.push(i);
				i++;
				sb.append("+").append("\n");
			}
			if(stack.size() == 0) {
				break;
			}
			int next = stack.peek();
			if(value == next) {
				stack.pop();
				sb.append("-").append("\n");
			}			
		}
		if(stack.size() == 0) {
			System.out.println(sb);
		} else {
			System.out.println("NO");
		}		
	}
}