import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String n = scan.next();
		String[] arr = n.split("");
		double b = scan.nextDouble();
		for(int i = 0; i < n.length(); i++) {
			if('A' <= n.charAt(i) && n.charAt(i) <= 'Z') {
				 arr[i] = n.charAt(i) - 55 + "";
			}
		}		
		scan.close();		
		
		int result = 0;
		for(int i = 0; i < arr.length; i++) {
			result += Math.pow(b, arr.length - (i + 1)) * Double.parseDouble(arr[i]);
		}
		System.out.println(result);	
	}
}