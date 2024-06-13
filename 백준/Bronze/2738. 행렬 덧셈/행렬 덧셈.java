import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) {
		
		// 행렬 덧셈
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		try {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			int[][] arrA = setArr(n, m, br, st);
			int[][] arrB = setArr(n, m, br, st);
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					bw.write(arrA[i][j] + arrB[i][j] + " ");
				}
				bw.newLine();
				bw.flush();
			}			
			
			br.close();
			bw.close();			
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public static int[][] setArr(int n, int m, BufferedReader br, StringTokenizer st) throws IOException {
		int[][] arr = new int[n][m];
		for(int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		return arr;
	}
}