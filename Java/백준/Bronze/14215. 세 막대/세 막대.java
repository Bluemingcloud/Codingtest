import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[3];
		arr[0] = Integer.parseInt(st.nextToken());
		arr[1] = Integer.parseInt(st.nextToken());
		arr[2] = Integer.parseInt(st.nextToken());
		
		int max = Arrays.stream(arr).max().getAsInt();
        int sum = Arrays.stream(arr).sum();
        
		if(sum <= 2 * max) sum -= 2 * max - sum + 1;
		System.out.println(sum);			
        br.close();
	}	
}
