import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        Integer[] arr = Arrays.stream(numlist).boxed().toArray(Integer[]::new);
        
        Arrays.sort(arr, new Comparator<Integer>() {
        	@Override
        	public int compare(Integer o1, Integer o2) {
        		if(Math.abs(o1.intValue() - n) == Math.abs(o2.intValue() - n)) {
        			return o2.intValue() - o1.intValue();
        		}
        		return Math.abs(o1.intValue() - n) - Math.abs(o2.intValue() - n);
        	}
        });
        
        return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
    }
}