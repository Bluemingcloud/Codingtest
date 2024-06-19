import java.util.*;
class Solution {
  public int[] solution(int[] arr) {
    
    List<Boolean> list = new ArrayList<>();
    for(int a : arr) {
      if(list.isEmpty()) {
        list.add(a == 1);
      } else if(list.get(list.size() - 1) == (a == 1)) {
        list.remove(list.size() - 1);
      } else {
        list.add(a == 1);
      }
    }
    
    if(list.isEmpty()) return new int[] {-1};
    
    int[] answer = new int[list.size()];
    
    for(int i = 0; i < answer.length; i++) {
      if(list.get(i)) {
        answer[i]++;
      }
    }
    
    return answer;
  }
}