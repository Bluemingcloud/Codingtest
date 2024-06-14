import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
    	int a = slicer[0];
    	int b = slicer[1];
    	int c = slicer[2];
    	int length = 0;
    	int start = 0;
    	int end = num_list.length - 1;
    	int plus = 0;
    	
        if(n == 1) {
        	end = b;        	
        } else if(n == 2) {
        	start = a;     	
        } else if(n == 3) {
        	start = a;
        	end = b;        	
        } else {
        	start = a;
        	end = b;
        	plus = c - 1;
        }
        List<Integer> list = new ArrayList<Integer>();
        for(int i = start; i <= end; i += 1 + plus) {
        	list.add(num_list[i]);
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = list.get(i);
        }       
        
    	return answer;
    }
}