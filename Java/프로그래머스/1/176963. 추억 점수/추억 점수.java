import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i < name.length; i++) {
        	map.put(name[i], yearning[i]);
        }
        
        int[] answer = new int[photo.length];
        for(int i = 0; i < photo.length; i++) {
        	for(String p : photo[i]) {
        		answer[i] += map.containsKey(p) ? map.get(p) : 0;
        	}
        }
        
        return answer;
    }
}