import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int min = n;
		for(int i = 1; i < n; i++) {
			int chkSum = i;
			int temp = i;
			while(temp > 0) {    // i + i의 각 자리수(1의 자리수부터)
				chkSum += temp % 10;
				temp /= 10;
			}
			if(chkSum == n) {    // 최솟값 저장
				min = min > i ? i : min;
			}
		}
		System.out.println(min == n ? 0 : min);
	}
}