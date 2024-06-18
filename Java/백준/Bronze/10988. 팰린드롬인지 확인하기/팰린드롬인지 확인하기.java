import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		
		// 팰린드롬 확인하기
		// 팰린드롬 : 앞으로 읽어도 뒤로 읽어도 같은 단어.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(br.readLine());
		br.close();
		
		String temp = sb.toString();
		sb.reverse();
		System.out.println(temp.equals(sb.toString()) ? 1 : 0);		
		
	}
}