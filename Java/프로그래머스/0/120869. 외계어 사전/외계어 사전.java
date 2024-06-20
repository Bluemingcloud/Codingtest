class Solution {
  public int solution(String[] spell, String[] dic) {
    int[] count = new int[26];

    for(String s : spell) {
      count[s.charAt(0) - 'a']++;
    }

    StringBuilder sb = new StringBuilder();
    for(String d : dic) {
      sb.setLength(0);
      for(int i = 0; i < d.length(); i++) {
        if(count[d.charAt(i) - 'a'] == 1) {
          sb.append(d.charAt(i));
        }
      }
      if(sb.length() == spell.length) {
        boolean flag = false;
        for(String s : spell) {
          if(sb.indexOf(s) != sb.lastIndexOf(s)) {
            flag = true;
            break;
          }
        }
        if(!flag) return 1;
      }
    }

    return 2;
  }  
}