import java.util.*;
class Solution {
    public int solution(int n) {
    	
        int[] arr = new int[n];
        
        int num = 1;
        int idx = 0;
        while(idx < arr.length) {
        	if(num % 3 != 0 && !String.valueOf(num).contains("3")) {
                arr[idx] = num; 
                idx++;
            }    
            num++;
        }
        
        System.out.println(Arrays.toString(arr));
        return arr[n - 1];
    }
}