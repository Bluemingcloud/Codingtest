class Solution {
    public long solution(long n) {
        long answer = 0;
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        for(char i = '9'; i >= '0'; i--) {
            for(int j = 0; j < sb.length(); j++) {
                if(sb.charAt(j) == i) {
                    answer = answer * 10 + sb.charAt(j) - '0';
                }
            }
        }
        return answer;
    }
}