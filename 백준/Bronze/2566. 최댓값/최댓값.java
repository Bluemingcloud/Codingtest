import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		try {
			
			int[][] arr = new int[9][9];
			
			for(int i = 0; i < arr.length; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < arr[i].length; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			int max = 0;
			int a = 1;
			int b = 1;
			int cntA = 1;
			
			for(int[] ar : arr) {	
				int cntB = 1;
				for(int num : ar) {					
					if(num > max) {
						max = num;
						a = cntA;
						b = cntB;
					}
					cntB++;
				}
				cntA++;
			}
			bw.write(max + "");
			bw.newLine();
			bw.write(a + " " + b);
			bw.flush();
			bw.close();
			br.close();			
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}