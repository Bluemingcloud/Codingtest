import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//1 ≤ A, B, C ≤ 10^12 인 값 -> long 을 써야한다.
		long A = scan.nextLong();
		long B = scan.nextLong();
		long C = scan.nextLong();
		
		System.out.println(A + B + C);
		
		scan.close();
	}
}
