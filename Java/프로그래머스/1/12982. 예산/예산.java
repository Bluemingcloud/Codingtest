import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        while(budget > 0) {
            budget -= d[answer++];
            if(answer == d.length) break;
        }
        
        return budget < 0 ? answer - 1 : answer;
    }
}