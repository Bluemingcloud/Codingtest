import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        while(n > 0) {
            stack.push(n % 3);
            n /= 3;
        }
        int p = 1;
        while(!stack.isEmpty()) {
            answer += stack.pop() * p;
            p *= 3;
        }
        
        return answer;
    }
}