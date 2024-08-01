class Solution {
    int i = 0;
    public int solution(int[] a, int[] b) {
        
        int answer = a[i] * b[i];
        i++;
        if(i >= a.length) return answer;
        return answer + solution(a, b);
    }
}