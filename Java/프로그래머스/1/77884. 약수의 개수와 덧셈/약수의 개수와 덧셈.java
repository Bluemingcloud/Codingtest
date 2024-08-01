class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++) {
            if(countDivisors(i) % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        
        return answer;
    }
    public int countDivisors(int num) {
        if(num == 1) return 1;
        if(num == 2 || num == 3) return 2;
        int result = 1;
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) result++;
        }
        result *= 2;
        if((int)Math.sqrt(num) == Math.sqrt(num)) result--;
        return result;
    }
}