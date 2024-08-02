class Solution {
    public long solution(long n) {
        long answer = 0;
        if((long)Math.sqrt(n) == Math.sqrt(n)) answer = (long)(Math.sqrt(n) + 1);
        answer = answer * answer;
        
        return answer == 0 ? -1 : answer;
    }
}