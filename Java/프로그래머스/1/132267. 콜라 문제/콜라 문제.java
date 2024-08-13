class Solution {
    public static int solution(int a, int b, int n) {
        if(n < a || n < 2) return 0;
        return solution(a, b, n % a + b * (n / a)) + b * (n / a);
    }
}