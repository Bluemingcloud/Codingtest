import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		// 마인크래프트
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
        // 입력받은 값을 통한 변수 초기화 
		int[][] field = new int[n][m];

		int max = 0;
		int min = 256;
        // 최초 블록 높이 입력
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				int height = Integer.parseInt(st.nextToken());
				field[i][j] = height;
                // 탐색의 범위를 좁히기 위한 작업
				if(height > max) max = height;    
				if(height < min) min = height;
			}
		}
		
		// 브루트포스 -> 가능한 모든 높이에 대해 확인
		int resultTime = Integer.MAX_VALUE;
		int resultHeight = min;
		for(int targetHeight = min; targetHeight <= max; targetHeight++) {
			int time = 0;
			int block = b;
			
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < m; k++) {
					int height = field[j][k];
					if(height < targetHeight) {
						time += targetHeight - height;
						block -= targetHeight - height;
					}
					if(height > targetHeight) {
						time += 2 * (height - targetHeight);
						block += height - targetHeight;
					}
				}
			}
			
			if(block >= 0) {
				if(time < resultTime || (time == resultTime && resultHeight < targetHeight)) {
					
					resultTime = time;
					resultHeight = targetHeight;
				}
			}
			
		}
        
		System.out.println(resultTime + " " + resultHeight);
	}
}