class Solution {
  public String[] solution(String[] str_list) {
    int idx = -1;
    boolean flag = false;
    for(int i = 0; i < str_list.length; i++) {
      if(str_list[i].equals("l")) {
        idx = i - 1;
        flag = true;
        break;
      }
      if(str_list[i].equals("r")) {
        idx = i + 1;
        break;
      }
    }
    if(idx == -1 || idx == str_list.length) return new String[] {};

    StringBuilder sb = new StringBuilder();
    int start = 0;
    int end = str_list.length - 1;
    if(flag) {
      end = idx;
    } else {
      start = idx;
    }
    
    for(int i = start; i <= end; i++) {
      sb.append(str_list[i]).append(" ");
    }
    
    return sb.toString().split(" ");
  }
}