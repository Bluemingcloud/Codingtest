class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int[] frac1 = div(numer1, denom1);
        int[] frac2 = div(numer2, denom2);
        
        int denom = lcm(frac1[1], frac2[1]);
        int numer = frac1[0] * denom / frac1[1] + frac2[0] * denom / frac2[1];
        
        return div(numer, denom);
        
    }
    private int gcd(int a, int b) {
        if(b % a == 0) return a;
        return gcd(b % a, a);
    }
    
    private int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
    
    
    
    private int[] div(int a, int b) {
        
        for(int i = 2; i <= Math.min(a, b); i++) {
            while(a % i == 0 && b % i == 0) {
                a /= i;
                b /= i;
            }   
        }
        return new int[] {a, b};
    }
    
}