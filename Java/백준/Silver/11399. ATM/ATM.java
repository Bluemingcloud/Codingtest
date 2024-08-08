import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
        
		int[] pArr = new int[n];
		for(int i = 0; i < n; i++) {
			pArr[i] = Integer.parseInt(st.nextToken());
		}
        
        Arrays.sort(pArr);
        
        int result = pArr[0];
		for(int i = 1; i < pArr.length; i++) {
			pArr[i] += pArr[i - 1];
            result += pArr[i];
		}

		System.out.println(result);
	}
}