class Solution {
  public String solution(String bin1, String bin2) {

//    return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
    int maxLength = Math.max(bin1.length(), bin2.length());
    int[] arr = new int[maxLength + 1];
    for(int i = 0; i < bin1.length(); i++) {
      if(bin1.charAt(bin1.length() - 1 - i) == '1') arr[i]++;
    }
    for(int i = 0; i < bin2.length(); i++) {
      if(bin2.charAt(bin2.length() - 1 - i) == '1') arr[i]++;
    }

    for (int i = 0; i < maxLength; i++) {
      if (arr[i] >= 2) {
        arr[i] -= 2;
        arr[i + 1]++;
      }
    }

    StringBuilder sb = new StringBuilder();
    boolean flag = false;
    for(int i = arr.length - 1; i > 0; i--) {
      if(!flag && arr[i] == 1) {
        flag = true;
      }
      if(flag) sb.append(arr[i]);
    }
    sb.append(arr[0]);

    return sb.toString();
  }

}