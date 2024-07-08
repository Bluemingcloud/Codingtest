import java.util.*;
class Solution {
    List<Long> list = new ArrayList<>();
    public int[] solution(long n) {
        if(n == 0) return list.stream().mapToInt(Long::intValue).toArray();
        list.add(n % 10);
        
        return solution(n / 10);
    }
}