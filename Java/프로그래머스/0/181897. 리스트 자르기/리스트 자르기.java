import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {

    	int start = n == 1 ? 0 : slicer[0];
    	int end = n == 2 ? num_list.length - 1 : slicer[1];
    	int plus = n == 4 ? slicer[2] : 1;
    	
        int[] answer = new int[(end - start) / plus + 1];
        for(int i = start, j = 0; i <= end; i += plus) {
        	answer[j++] = num_list[i];
        }       
        
    	return answer;
    }
}