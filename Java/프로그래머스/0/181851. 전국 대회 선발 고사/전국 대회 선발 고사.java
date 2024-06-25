import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        
    	Map<Integer, Integer> map = new HashMap<>();
    	
    	for(int i = 0; i < rank.length; i++) {
    		if(attendance[i]) map.put(rank[i], i);    		
    	}
    	
    	int cnt = 0;
    	int num = 10000;
    	int answer = 0;
    	for(int i = 1; i <= rank.length && cnt < 3; i++) {
            if(map.containsKey(i)) {
                answer += map.get(i) * num;
    		    cnt++;
    		    num /= 100;  
            }
    	}
        
    	return answer;
        
    }
}