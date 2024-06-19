class Solution {
  public String solution(String my_string, int[][] queries) {
    StringBuilder answer = new StringBuilder(my_string);

    for(int[] q : queries) {
      StringBuilder sub = new StringBuilder(answer.substring(q[0], q[1] + 1));
      answer.replace(q[0], q[1] + 1, sub.reverse().toString());
    }
    return answer.toString();
  }
}