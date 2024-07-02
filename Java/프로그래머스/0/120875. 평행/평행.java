class Solution {
    public int solution(int[][] dots) {
        
        if(grad(dots[0], dots[1]) == grad(dots[2], dots[3])) return 1;
        if(grad(dots[0], dots[2]) == grad(dots[1], dots[3])) return 1;
        if(grad(dots[0], dots[3]) == grad(dots[1], dots[2])) return 1;

        return 0;
    }
    
    private double grad(int[] dot1, int[] dot2) {
        return ((double)dot1[0] - dot2[0]) / (dot1[1] - dot2[1]); // 축과 평행한 경우는 없음       
    }
}