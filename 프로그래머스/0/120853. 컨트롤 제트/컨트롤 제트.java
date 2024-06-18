import java.util.*;
class Solution {
  public int solution(String s) {
    StringTokenizer st = new StringTokenizer(s);
    Stack<Integer> stack = new Stack<>();
    while(st.hasMoreTokens()) {
      String str = st.nextToken();
      if(!str.equals("Z")) {
        stack.push(Integer.parseInt(str));
      } else {
        stack.pop();
      }
    }
    int answer = 0;
    for(Integer num : stack) {
      answer += num;
    }
    return answer;
  }
}