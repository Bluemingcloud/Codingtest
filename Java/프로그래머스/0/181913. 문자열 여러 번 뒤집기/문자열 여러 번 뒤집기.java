class Solution {
  public String solution(String my_string, int[][] queries) {
    StringBuilder answer = new StringBuilder(my_string);
    StringBuilder sub = new StringBuilder();
    for(int[] q : queries) {
      sub.append(answer.substring(q[0], q[1] + 1));
      answer.replace(q[0], q[1] + 1, sub.reverse().toString());
      sub.setLength(0);
    }
    return answer.toString();
  }
}