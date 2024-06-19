import java.util.Arrays;
class Solution {
  public int[] solution(int[] arr, int k) {
    int[] answer = new int[k];
    Arrays.fill(answer, -1);
    int i = 0;
    for(int a : Arrays.stream(arr).distinct().toArray()) {
      answer[i++] = a;
      if(i == k) break;
    };
    return answer;
  }
}