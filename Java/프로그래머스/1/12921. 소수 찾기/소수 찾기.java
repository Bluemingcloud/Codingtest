import java.util.*;

class Solution {
    public int solution(int n) {
        
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(prime[i]) {
                for(int j = i*i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }
        
        int result = 0;
        for(boolean p : prime) {
            if(p) {
                result++;
            }
        }
        
        return result;
    }
}