class Solution {
  public int solution(String[] spell, String[] dic) {
    int count;
    for(String d : dic) {
      count = 0;
      for(String s : spell) {
        if(d.contains(s)) count++;
      }
      if(count == spell.length) return 1;
    }
    return 2;
  }
}