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
		char[][] arr = new char[n][m];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = br.readLine().toCharArray();
		}
        
		int min = 64;
		for(int i = 0; i <= arr.length - 8; i++) {
			for(int j = 0; j <= arr[i].length - 8; j++) {
				int cnt1 = 0;
				int cnt2 = 0;
				for(int k = 0; k < 8; k++) {
					for(int l = 0; l < 8; l++) {
						if((i + k + j + l) % 2 == 0) {
							if(arr[i + k][j + l] == 'W') {
								cnt1++;
							} else {
								cnt2++;
							}
						} else {
							if(arr[i + k][j + l] == 'W') {
								cnt2++;
							} else {
								cnt1++;
							}
						}
					}
				}
				
				if(64 - cnt1 < min | 64 - cnt2 < min) {
					if(64 - cnt1 >= 64 - cnt2) {
						min = 64 - cnt2;
					} else {
						min = 64 - cnt1;
					}
				}
			}			
		}
		System.out.println(min);
		br.close();
	}
}