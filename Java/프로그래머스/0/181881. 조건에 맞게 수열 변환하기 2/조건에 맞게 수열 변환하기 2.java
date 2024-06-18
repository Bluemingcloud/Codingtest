class Solution {
  public int solution(int[] arr) {
    int answer = 0;
    int odd = Integer.MAX_VALUE;
    int even = Integer.MIN_VALUE;
    for(int a : arr) {
      if(a < odd && a % 2 != 0 && a < 50) odd = a;
      if(a > even && a % 2 == 0 && a >= 50) even = a;
    }

    if(odd == Integer.MAX_VALUE) odd = 51;
    if(even == Integer.MIN_VALUE) even = 2;

    int oddCnt = 0;
    while(odd < 50) {
      odd = 2 * odd + 1;
      oddCnt++;
    }

    int evenCnt = 0;
    while(true) {
      int temp = even;
      if(even >= 50 && even % 2 == 0) {
        even /= 2;
        evenCnt++;
      }
      if(even < 50 && even % 2 != 0) {
        even *= 2;
        evenCnt++;
      }

      if(even == temp) break;
    }

    return Math.max(evenCnt, oddCnt);
  }
}