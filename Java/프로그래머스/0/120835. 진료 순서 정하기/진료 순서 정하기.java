import java.util.*;

class Solution {
    public static int[] solution(int[] emergency) {
    	Map<Integer, Integer> map = new HashMap<>();
    	Integer[] temp = new Integer[emergency.length];
    	for(int i = 0; i < temp.length; i++) {
    		temp[i] = emergency[i];
    	}
    	Arrays.sort(temp, Collections.reverseOrder());
    	for(int i = 1; i <= temp.length; i++) {
    		map.put(temp[i - 1], i);
    	}
    	temp = null;
        int[] answer = new int[emergency.length];
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = map.get(emergency[i]);
        }
        return answer;
    }
}