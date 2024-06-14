import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        boolean flag = false;
        int last = 0;
        int first = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
            	if(!flag) first = i;
                flag = true;    
                last = i;
            }
            if(flag) {
                list.add(arr[i]);
            }            
        }
        if(list.size() == 0) {
            return new int[] {-1};             
        }
        while(list.size() > last - first + 1) {
        	list.remove(list.size() - 1);
        }

        
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}