import java.math.BigInteger;
class Solution {
  public int solution(int balls, int share) {
    if(balls == share) return 1;
    if(share == 1) return balls;
    if(balls - share == 1) return balls;
    BigInteger[] arr = new BigInteger[balls + 1];
    arr[1] = new BigInteger("1");
    for(int i = 2; i < arr.length; i++) {
      arr[i] = new BigInteger(String.valueOf(i)).multiply(arr[i - 1]);
    }
    BigInteger answer = arr[balls].divide(arr[balls - share]).divide(arr[share]);
    return answer.intValue();
  }
}