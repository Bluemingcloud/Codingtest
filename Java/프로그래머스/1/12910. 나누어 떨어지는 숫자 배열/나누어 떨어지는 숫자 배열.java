import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        for(int a : arr) {
            if(a % divisor == 0) list.add(a);
        }
        
        if(list.isEmpty()) return new int[] {-1};
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}