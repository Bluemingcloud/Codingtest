import java.util.*;
class Solution {
	    public int solution(String[] strArr) {
	        int answer = 0;
	        int[] count = new int[31];
	        for(String str : strArr) {
	            count[str.length()]++;
	        }
	        return Arrays.stream(count).max().getAsInt();
	    }
}