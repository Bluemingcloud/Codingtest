import java.util.*;
class Solution {
  public String[] solution(String my_str, int n) {
    if(my_str.length() == n) return new String[] {my_str};
    if(n == 1) return my_str.split("");
    StringBuilder sb = new StringBuilder(my_str);
    for(int i = n; i < my_str.length() + my_str.length() / n; i += n + 1) {
      sb.insert(i, " ");
    }
      
    StringTokenizer st = new StringTokenizer(sb.toString());
    String[] answer = new String[st.countTokens()];
    for(int i = 0; i < answer.length; i++) {
      answer[i] = st.nextToken();
    }

    return answer;
    
  }
}