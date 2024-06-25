class Solution {
    public int solution(int a, int b) {
        
    	b /= gcd(a, b);
        
        while(b % 2 == 0) {
        	b /= 2;
        }
        
        while(b % 5 == 0) {
        	b /= 5;
        }
        
        if(b == 1) return 1;
        
        return 2;
        
    }
    
    private static int gcd(int a, int b) {
    	if(b % a == 0) return a;
    	return gcd(b % a, a);
    }


}