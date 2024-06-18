import java.util.*;
class Solution {
  public int[] solution(int[] arr) {
    Stack<Integer> stack = new Stack<>();
    int i = 0;
    while(i < arr.length) {
      if(stack.isEmpty()) {
        stack.push(arr[i]);
        i++;
      }
      if(!stack.isEmpty() && i < arr.length && stack.peek() < arr[i]) {
        stack.push(arr[i]);
        i++;
      }
      if(!stack.isEmpty() && i < arr.length && stack.peek() >= arr[i]) {
        stack.pop();
      }
    }

    int[] answer = new int[stack.size()];

    int j = answer.length - 1;
    while(!stack.isEmpty()) {
      answer[j] = stack.pop();
      j--;
    }
    return answer;
  
  }
}