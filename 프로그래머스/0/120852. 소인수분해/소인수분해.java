import java.util.*;
class Solution {
  public int[] solution(int n) {
    if(n == 2) return new int[] {2};
    if(n == 3) return new int[] {3};
    int num = n;
    List<Integer> list = new ArrayList<>();
    for(int i = 2; i <= Math.sqrt(n); i++) {
      if(num == 1) break;
      if(num % i == 0) {
        list.add(i);
        while(num % i == 0) {
          num /= i;
        }
      }
    }

    if(list.isEmpty()) return new int[] {n};
      
    if(num != 1) list.add(num);
      
    int[] answer = new int[list.size()];
    for(int i = 0; i < answer.length; i++) {
      answer[i] = list.get(i);
    }
    return answer;
  }
}