import java.util.*;
class Solution {
    
    // 선택 정렬
    public int[] solution(int[] numlist, int n) {
    	
    	for(int i = 0; i < numlist.length - 1; i++) {
    		for(int j = i + 1; j < numlist.length; j++) {
                
    		    int a = Math.abs(numlist[i] - n);
    			int b = Math.abs(numlist[j] - n);
    			if(a > b || (a == b && numlist[i] < numlist[j])) {
    				
    				int temp = numlist[i];
    				numlist[i] = numlist[j];
    				numlist[j] = temp;
    				
    			}
    			
    		}
    	}
    	
    	return numlist;

    }
}