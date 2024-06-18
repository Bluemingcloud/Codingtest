class Solution {
  public int[] solution(String my_string) {
    int[] answer = new int['Z' - 'A' + 'z' - 'a' + 2];
    for(char c : my_string.toCharArray()) {
      if('A' <= c && c <= 'Z') {
        answer[c - 'A']++;
      } else {
        answer[c - 'a' + 'Z' - 'A' + 1]++;
      }
      
    }
    return answer;
  }
}