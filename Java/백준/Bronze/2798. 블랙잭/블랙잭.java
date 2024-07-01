import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int result = 0;
		int max = 0;
		first:for(int i = 0; i < arr.length - 2; i++) {
			for(int j = i + 1; j < arr.length - 1; j++) {
				for(int k = j + 1; k < arr.length; k++) {
					result = arr[i] + arr[j] + arr[k];
					if(result == m) {
						max = result;
						break first;
					} else if(result < m && result > max) {
						max = result;
					}
				}
			}
		}
		System.out.println(max);
		br.close();
		
	}

}