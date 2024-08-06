import java.util.*;
class Solution {
    int answer = 0;
    int[] visited;
    public int solution(int[] number) {
        visited = new int[number.length];
        method(0, 0, 0, number);
        return answer;
    }
    
    public void method(int depth, int start, int sum, int[] number) {
        
        if(depth == 3) {
            if(sum == 0) answer++;
            return;
        }
        
        for(int i = start; i < number.length; i++) {
            if(visited[i] == 0) {
                visited[i] = 1;
                method(depth + 1, i + 1, sum + number[i], number);    
                visited[i] = 0;
            }
        }
    
    }
}