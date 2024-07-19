import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		System.out.println(factorial(n));
		
	}
	private static long factorial(int n) {
		if(n == 0) return 1;
		return n * factorial(n - 1);
	}

}