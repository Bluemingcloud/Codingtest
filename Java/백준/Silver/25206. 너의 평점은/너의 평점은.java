import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double num = 0;
		double total = 0;
		for(int i = 0; i < 20; i++) {
			String[] str = scan.nextLine().split(" ");
			if(str[2].equals("P")) {
				continue;
			}
			switch(str[2]) {
			case "A+":
				num += 4.5 * Double.parseDouble(str[1]);
				break;
			case "A0":
				num += 4.0 * Double.parseDouble(str[1]);
				break;
			case "B+":
				num += 3.5 * Double.parseDouble(str[1]);
				break;
			case "B0":
				num += 3.0 * Double.parseDouble(str[1]);
				break;
			case "C+":
				num += 2.5 * Double.parseDouble(str[1]);
				break;
			case "C0":
				num += 2.0 * Double.parseDouble(str[1]);
				break;
			case "D+":
				num += 1.5 * Double.parseDouble(str[1]);
				break;
			case "D0":
				num += 1.0 * Double.parseDouble(str[1]);
				break;
			case "F":
				num += 0.0;
				break;
			default :
				break;			
			}
			total += Double.parseDouble(str[1]);			
		}
		System.out.println(num / total);
		scan.close();
	}
}