import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[][] arr = new int[n + 2][2];
			arr[0][0] = 1;
			arr[0][1] = 0;
			arr[1][0] = 0;
			arr[1][1] = 1;
			for(int i = 2; i <= n; i++) {
				arr[i][0] = arr[i - 1][0] + arr[i - 2][0];
				arr[i][1] = arr[i - 1][1] + arr[i - 2][1];
			}
			sb.append(arr[n][0]).append(" ").append(arr[n][1]);
			sb.append("\n");
		}
		System.out.println(sb.toString());	
	}
}