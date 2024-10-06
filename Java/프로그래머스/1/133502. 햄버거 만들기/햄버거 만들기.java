import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        
        for(int i : ingredient) {
            list.add(i);
            if(list.size() >= 4 && isBurgerMake(list)) {
                int size = 4;
                while(size-- > 0) {
                    list.remove(list.size() - 1);
                }
                answer++;
            }
        }
        
        
        
        
        return answer;
    }
    
    boolean isBurgerMake(List<Integer> list) {
        return list.get(list.size() - 1) == 1 && 
            list.get(list.size() - 2) == 3 && 
            list.get(list.size() - 3) == 2 &&
            list.get(list.size() - 4) == 1;
    }
}