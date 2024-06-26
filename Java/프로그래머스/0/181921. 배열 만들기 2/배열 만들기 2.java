import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        
        List<Integer> list = new ArrayList<>();

        int p = 1;
        int i = 5;
        while(i <= r) {
        	
        	if(i >= l) list.add(i);
        	i = Integer.parseInt(Integer.toBinaryString(++p)) * 5;
        	
        }
        if(list.isEmpty()) return new int[] {-1};
        return list.stream().mapToInt(Integer::intValue).toArray();
        
    }
}