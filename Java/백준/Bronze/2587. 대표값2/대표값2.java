import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int sum = 0;
    int[] arr = new int[5];
    for(int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(br.readLine());
      sum += arr[i];
    }
    br.close();
    
    for(int i = 1; i < arr.length; i++) {
        int target = arr[i];
        int j = i - 1;
        while(j >= 0 && target < arr[j]) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = target;
    }
      
      
     
    System.out.println(sum / 5);
    System.out.println(arr[2]);
  }
}