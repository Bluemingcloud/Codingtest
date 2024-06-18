import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] paper = new int[100][100];
		int l = 10;
		
		int n = scan.nextInt();
		int result = 0;
		for(int i = 0; i < n; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			for(int j = 0; j < l; j++) {
				for(int k = 0; k < l; k++) {
					if(paper[k+y-1][j+x-1] != 1) {
						paper[k+y-1][j+x-1] = 1;
						result++;
					}
				}				
			}			
		}
		scan.close();
		System.out.println(result);		
	}
}