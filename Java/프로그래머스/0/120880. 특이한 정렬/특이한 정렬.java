import java.util.*;
class Solution {
    
    public int[] solution(int[] numlist, int n) {
    	
    	PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
    		@Override
    		public int compare(Integer o1, Integer o2) {
    			if(Math.abs(o1.intValue() - n) == Math.abs(o2.intValue() - n)) return o2.intValue() - o1.intValue();
    			return Math.abs(o1.intValue() - n) - Math.abs(o2.intValue() - n);
    		}
		});
    	
    	for(int num : numlist) {
    		queue.offer(num);
    	}
    	
        int[] answer = new int[numlist.length];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = queue.poll();
        }
        
    	return answer;
    }
}