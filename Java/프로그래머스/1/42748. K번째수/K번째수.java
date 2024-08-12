import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++) {
            Queue<Integer> queue = new PriorityQueue<>();
            for(int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                queue.offer(array[j]);
            }
            while(--commands[i][2] > 0) {
                queue.poll();
            }
            answer[i] = queue.poll();
        }
        
        return answer;
    }
}