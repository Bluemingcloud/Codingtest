class Solution {
    public long solution(int a, int b) {
        return ((long)a + b) * (Math.abs(a - b) + 1) / 2;
    }
}