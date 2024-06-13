import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		// 분수찾기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		br.close();

		int first = 2;
		int last = 2;
		int i = 2;
		
		while(x >= last) {
			first = last;
			last += i;
			i++;						
		}
		int numerator = (i - 1) % 2 == 0 ? x - first + 1: last - x;
		int denominator = i - numerator;

		System.out.println(numerator + "/" + denominator);	
	}
}