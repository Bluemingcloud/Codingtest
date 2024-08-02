class Solution {
    long[] answer;
    int idx = 0;
    public long[] solution(int x, int n) {
        answer = new long[n];
        answer = makeList(x);
        return answer;
    }
    
    public long[] makeList(int x) {
        if(idx == answer.length) return answer;
        if(idx == 0) {
            answer[idx] = x;
            idx++;
            return makeList(x);
        }
        answer[idx] = answer[idx - 1] + x;
        idx++;
        return makeList(x);
    }
}