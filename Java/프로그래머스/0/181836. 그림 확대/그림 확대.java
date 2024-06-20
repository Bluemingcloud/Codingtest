class Solution {
  public String[] solution(String[] picture, int k) {
    StringBuilder sb = new StringBuilder();
    for(String p : picture) {
     for(int i = 0; i < k; i++) {
      for(int j = 0; j < p.length(); j++) {
        sb.append(String.valueOf(p.charAt(j)).repeat(k));
      }
      sb.append(" ");
     }
    }

    return sb.toString().split(" ");
  }
}