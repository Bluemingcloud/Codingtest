import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<String[]> strList = new ArrayList<>();
		int m = 0;
		
		try {
			while(scan.hasNextLine()) {	
				String[] str = scan.nextLine().split(""); 
				if(str.length > m) {
					m = str.length;
				}
				strList.add(str);
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} finally {
			scan.close();
		}
			
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < m; i++) {
			for (String[] strArray : strList) {
				if (i < strArray.length) {
					result.append(strArray[i]);
				}
			}
		}

		System.out.println(result.toString());				
	}
}