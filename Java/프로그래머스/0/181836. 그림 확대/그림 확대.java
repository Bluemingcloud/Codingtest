class Solution {
  public String[] solution(String[] picture, int k) {
    StringBuilder sb = new StringBuilder();
    StringBuilder sbX = new StringBuilder();
    StringBuilder sbDot = new StringBuilder();
    StringBuilder temp = new StringBuilder();
    for(int i = 0; i < k; i++) {
      sbX.append("x");
      sbDot.append(".");
    }

    for(String p : picture) {
      temp.setLength(0);
      for(int i = 0; i < p.length(); i++) {
        if(p.charAt(i) == 'x') {
          temp.append(sbX.toString());
        } else {
          temp.append(sbDot.toString());
        }
      }
      for(int i = 0; i < k; i++) {
        sb.append(temp.toString()).append(" ");        
      }
    }

    return sb.toString().split(" ");
  }
}