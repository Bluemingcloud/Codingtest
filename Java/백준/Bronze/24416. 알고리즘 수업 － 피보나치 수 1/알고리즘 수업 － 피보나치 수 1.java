import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		fib(n);
		fibonacci(n);
		System.out.println(cnt1 + " " + cnt2);
	}
	
	static int cnt1 = 0;
	
	private static int fib(int n) {
		
		if(n == 1 || n == 2) {
			cnt1++;
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}
	
	static int cnt2 = 0;
	
	private static int fibonacci(int n) {
		int[] arr = new int[n + 1];
		arr[1] = 1;
		arr[2] = 1;
		
		for(int i = 3; i <= n; i++) {
			cnt2++;
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		
		return arr[n];
	}

}