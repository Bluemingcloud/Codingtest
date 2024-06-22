class Solution {
    public int solution(int M, int N) {
        
    	int a = Math.max(M, N) - 1;
    	int b = (a + 1) * (Math.min(M, N) - 1);
        
        return a + b;
    }
}