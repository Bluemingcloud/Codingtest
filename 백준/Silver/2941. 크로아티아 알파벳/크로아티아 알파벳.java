import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		
		String[] croatiaArr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		int cnt = 0;
		for(String c : croatiaArr) {
			List<Integer> cntList = new ArrayList<>();
			int i = str.indexOf(c);
			while(i>=0) {
				if(c == "dz=") {
					cntList.add(i);
					i = str.indexOf(c, i+2);
				} else {
					cntList.add(i);
					i = str.indexOf(c, i+1);
				}
			}
			cnt += cntList.size();
		}
		System.out.println(str.length()-cnt);
	}
}