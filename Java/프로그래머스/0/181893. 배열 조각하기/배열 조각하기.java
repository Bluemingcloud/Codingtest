import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
    	
        Deque<Integer> queue = new LinkedList<Integer>();
        for(int a : arr) {
        	queue.offer(a);
        }
        
        for(int i = 0; i < query.length; i++) {
            int size = queue.size();
        	if(i % 2 == 0) {
        		while(queue.size() > query[i] + 1) {
        			queue.pollLast();
        		}
        	} else {
        		while(queue.size() > size - query[i]) {
        			queue.pollFirst();
        		}
        	}
        }
        
    	
    	return queue.stream().mapToInt(Integer::intValue).toArray();

    }
}