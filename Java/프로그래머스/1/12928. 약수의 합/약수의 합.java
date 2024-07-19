class Solution {
    public int solution(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int answer = n + 1;
        double limit = Math.sqrt(n);
        for(int i = 2; i < limit; i++) {
            if(n % i == 0) answer += i + n / i;            
        }
        if(Math.round(limit) == limit) answer += (int)limit;
        return answer;
    }
}