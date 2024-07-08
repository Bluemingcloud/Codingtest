import java.util.*;

public class Solution {
    int answer = 0;
    public int solution(int n) {
        
        if(n == 0) return answer;
        
        answer += n % 10;
        
        return solution(n / 10);
    }
}