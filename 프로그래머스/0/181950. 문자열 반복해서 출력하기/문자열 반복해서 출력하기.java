import java.io.*;
import java.util.*;

public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    br.close();
    String str = st.nextToken();
    int n = Integer.parseInt(st.nextToken());
    
    StringBuilder sb = new StringBuilder(str);
    while(n-- > 1) {
      sb.append(str);
    }
    System.out.println(sb.toString());
    
  }
}