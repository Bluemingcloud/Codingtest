import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        boolean flag = false;
        for(int a : arr) {
            if(a == 2 && !flag) {
                flag = true;
            } else if(a == 2 && flag) {
                flag = false;
                list.add(a);
            }
            if(flag) {
                list.add(a);
            }
            
        }
        if(list.size() == 0) {
            return new int[] {-1};             
        }
        if(flag && list.size() > 1) {
            return new int[] {2};
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}