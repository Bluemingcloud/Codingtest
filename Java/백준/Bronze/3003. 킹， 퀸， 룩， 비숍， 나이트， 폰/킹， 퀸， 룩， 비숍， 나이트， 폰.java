import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] trueChess = {1, 1, 2, 2, 2, 8};
		int[] chkChess = new int[6];
		int[] resultChess = new int[6];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i<6; i++) {
			chkChess[i] = Integer.parseInt(st.nextToken());
			resultChess[i] = trueChess[i] - chkChess[i];
		}
		br.close();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < resultChess.length; i++) {
			sb.append(resultChess[i] + " ");
		}	
		System.out.println(sb);
	}
}