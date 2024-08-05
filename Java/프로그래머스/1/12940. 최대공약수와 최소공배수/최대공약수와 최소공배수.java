class Solution {
    public int[] solution(int n, int m) {
        int a = Math.min(n, m);
        int b = Math.max(n, m);
        if(b % a == 0) {
            return new int[] {a, b};
        }
        
        int[] answer = new int[2];
        for(int i = a / 2; i > 1; i--) {
            if(a % i == 0 && b % i == 0) {
                answer[0] = i;
                break;
            }
        }
        
        answer[1] = answer[0] != 0 ? m * n / answer[0] : m * n;
        answer[0] = answer[0] != 0 ? answer[0] : 1;
        return answer;
    }
}