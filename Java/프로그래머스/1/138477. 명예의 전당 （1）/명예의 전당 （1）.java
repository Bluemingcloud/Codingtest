import java.util.*;
class Solution {
    public static int[] solution(int k, int[] score) {
    	int[] answer = new int[score.length];
        Queue<Integer> pq = new PriorityQueue<Integer>();
        for(int i = 0; i < score.length; i++) {
        	int temp = 0;
        	if(pq.size() == k) temp = pq.poll();
        	pq.offer(Math.max(temp, score[i]));
        	answer[i] = pq.peek();
        }
        return answer;
    }
}