import java.util.*;
class Solution {
    public int solution(int[] nums) {
    	Set<Integer> set = new HashSet<Integer>();
    	for(int n : nums) {
    		set.add(n);
    	}
    	return Math.min(set.size(), nums.length / 2);
    }
}