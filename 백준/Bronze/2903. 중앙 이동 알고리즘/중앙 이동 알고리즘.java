import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		// 중앙 이동 알고리즘
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[16];
		arr[0] = 2;
		
		for(int i = 0; i < n; i++) {
			arr[i + 1] = arr[i] + (int)Math.pow(2, i);
		}
		
		System.out.println(arr[n] * arr[n]);
	}

}