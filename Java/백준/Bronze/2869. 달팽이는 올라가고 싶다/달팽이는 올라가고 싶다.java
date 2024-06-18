import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		// 달팽이는 올라가고 싶다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		int day = (v - a) / (a - b) + 1;
		int remain = (v - a) % (a - b) + a;
		
		day += moveWood(a,b,remain);		
	 
		System.out.println(day);
		
	}
	public static int moveWood(int a, int b, int remain) {
		int day = 0;
		while(remain > 0) {
			remain -= a;
			if(remain <= 0) {
				break;
			}
			remain += b;
			day++;
		}		
		return day;
	}
}
