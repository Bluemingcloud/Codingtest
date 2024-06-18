import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// 그룹 단어 체커
		// 연속되는 알파벳이 아닐때만 비교.
		// 연속되는 알파벳을 하나의 알파벳으로 바꿔주는 작업 필요.
		// 비교대상과 일치하지 않으면 카운트.
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.nextLine();
		String str;
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			str = scan.nextLine();
			String temp = "";
			int check = 0;
			for(int j = 0; j < str.length(); j++) {
				if(j + 1 == str.length()) {
					temp += str.charAt(j);
					break;
				}
				if(str.charAt(j) == str.charAt(j + 1)) {
					continue;
				} else {
					temp += str.charAt(j);
				}
			}

			for(int j = 0; j < temp.length() - 1; j++) {
				if(temp.substring(j+1).contains(temp.substring(j,j+1)) != true) {
					check++;
				}
			}
			
			if(check == temp.length() - 1) {
				cnt++;
			}
		}	
			
		System.out.println(cnt);
		
		scan.close();		
	}
}