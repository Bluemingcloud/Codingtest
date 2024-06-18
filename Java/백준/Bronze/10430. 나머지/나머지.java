import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    br.close();
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());

    int result1 = (a + b) % c;
    int result2 = ((a % c) + (b % c)) % c;
    int result3 = (a * b) % c;
    int result4 = ((a % c) * (b % c)) % c;
    
    StringBuilder sb = new StringBuilder();
    sb.append(result1).append("\n");
    sb.append(result2).append("\n");
    sb.append(result3).append("\n");
    sb.append(result4);

    System.out.println(sb.toString());
  }
}