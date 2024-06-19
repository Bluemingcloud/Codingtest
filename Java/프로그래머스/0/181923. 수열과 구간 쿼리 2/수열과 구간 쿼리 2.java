import java.util.*;
class Solution {
  public int[] solution(int[] arr, int[][] queries) {
    int[] answer = new int[queries.length];
    Arrays.fill(answer, -1);
    int s = 0;
    int e = 0;
    int k = 0;
      
    for(int i = 0; i < answer.length; i++) {
      s = queries[i][0];
      e = queries[i][1];
      k = queries[i][2];
      int min = Integer.MAX_VALUE;
      
      for(int j = s; j <= e; j++) {
        if(arr[j] > k && arr[j] < min) {
          answer[i] = arr[j];
          min = arr[j];
        }
      }
    }
    return answer;
  }
}