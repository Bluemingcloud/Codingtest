import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] cnt = new int[8001];
		int sum = 0;
		int maxCnt = 1;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			
			sum += num;
			if(num > max) max = num;
			if(num < min) min = num;
			
			cnt[num + 4000]++;	
			
			if(cnt[num + 4000] > maxCnt) {
				maxCnt = cnt[num + 4000];
			}		
		}	
		br.close();

		int avg = (int)Math.round((double)sum / n);
		int median = 4001;
		int mode = 4001;
		int range = max - min;
		
		int chk = 0;
		int idx = 0;
		
		for(int i = -4000; i <= 4000; i++) {
			if(cnt[i + 4000] > 0) {
				if(idx < (n + 1) / 2) {
					median = i;					
					idx += cnt[i + 4000];
				}
				
				if(cnt[i + 4000] == maxCnt && chk < 2) {
					mode = i;
					chk++;
				}
				
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(avg).append("\n")
		.append(median).append("\n")
		.append(mode).append("\n")
		.append(range);
	
		System.out.println(sb);
	}
}