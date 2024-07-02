import java.util.*;
class Solution {
    
    int[] counts = new int[7];
    
    public int solution(int a, int b, int c, int d) {

        
        int[] dices = {a, b, c, d};
        
        for(int dice : dices) {
            counts[dice]++;
        }
        
        int cntMax = Arrays.stream(counts).max().getAsInt();
        int check = (int)Arrays.stream(dices).distinct().count();
        
        if(cntMax == 4) return 1111 * a;
        if(cntMax == 3) {
            int[] result = method(3, 1, dices);
            int p = result[0];
            int q = result[1];
            return (10 * p + q) * (10 * p + q);
            
        }
        if(cntMax == 2 && check == 2) {
            int[] result = method(2, dices);
            int p = result[0];
            int q = result[1];
            return (p + q) * (p > q ? p - q : q - p);
        }
        if(cntMax == 2 && check == 3) {
            int[] result = method(1, dices);
            int q = result[0];
            int r = result[1];
            
            return q * r;
        }
        return Arrays.stream(dices).min().getAsInt();
    }
    
    private int[] method(int cnt1, int cnt2, int[] dices) {
        int p = 0;
        int q = 0;
        for(int dice : dices) {
            if(counts[dice] == cnt1) p = dice;
            if(counts[dice] == cnt2) q = dice;
        }
        return new int[] {p, q};
    }
    
    private int[] method(int cnt, int[] dices) {
        int p = 0;
        int q = 0;
        for(int dice : dices) {
            if(counts[dice] == cnt) {
                if(p == 0) p = dice;
                if(dice != p) q = dice;
            }
        }
        return new int[] {p, q};
    }

}