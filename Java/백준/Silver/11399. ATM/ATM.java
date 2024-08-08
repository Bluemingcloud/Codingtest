import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
        
		Queue<Integer> queue = new PriorityQueue<>();
		for(int i = 0; i < n; i++) {
			queue.offer(Integer.parseInt(st.nextToken()));
		}
		
		int[] pArr = new int[queue.size() + 1];
		pArr[0] = 0;
		for(int i = 1; i < pArr.length; i++) {
			pArr[i] = pArr[i - 1] + queue.poll();
		}
		
		int result = 0;
		for(int p : pArr) {
			result += p;
		}
		System.out.println(result);
	}
}