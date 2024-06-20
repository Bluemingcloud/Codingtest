import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    br.close();

    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    int cnt = 0;
    int answer = 0;

    for(int i = 2; i <= n / 2; i++) {
      if(n % i == 0) cnt++;
      if(cnt == k - 1) {
        answer = i;
        break;
      }
    }
    if(cnt == k - 2) answer = n;
    if(k == 1) answer = 1;
    System.out.println(answer);

  }
}