import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String a = sc.next();
        sc.close();
        char[] arr = a.toCharArray();
        for(int i = 0; i < arr.length; i++) {
        	if('a' <= arr[i] && arr[i] <= 'z') {
        		arr[i] -= 'a' - 'A';
        	} else {
        		arr[i] += 'a' - 'A';
        	}
        }
        String result = "";
        for(char c : arr) {
        	result += c + "";
        }
        System.out.println(result);
	
	}

}