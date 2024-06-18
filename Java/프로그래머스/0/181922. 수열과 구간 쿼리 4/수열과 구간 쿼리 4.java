class Solution {
  public int[] solution(int[] arr, int[][] queries) {
    for(int[] q : queries) {
      if(q[2] == 0) continue;
      for(int i = q[0] % q[2] == 0 ? q[0] : q[0] - q[0] % q[2] + q[2]; i <= q[1]; i += q[2]) {
        arr[i]++;
      }
    }
    return arr;
  }
}