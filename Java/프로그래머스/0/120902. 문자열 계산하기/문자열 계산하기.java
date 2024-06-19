import java.util.*;
class Solution {
  public int solution(String my_string) {
    /*
    my_string 계산하기
    3 + 5 + 7 - 2 ... 
     */
    StringTokenizer st = new StringTokenizer(my_string);
    int answer = Integer.parseInt(st.nextToken());
    int idx = 1;
    while(st.hasMoreTokens()) {
      if(st.nextToken().equals("+")) {
        answer += Integer.parseInt(st.nextToken());
      } else {
        answer -= Integer.parseInt(st.nextToken());
      }
    }
    return answer;
  }
}