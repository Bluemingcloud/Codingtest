import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		System.out.println(solution(n, 0));
			
		
	}
	private static int solution(int n, int result) {
		if(n % 5 == 0) return result + n / 5;
		n -= 3;
		result++;
        if(n == 0) return result;
		return n > 0 ? solution(n, result) : -1;
		
	}
}