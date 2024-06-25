class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int maxX = -256;
        int minX = 256;
        int maxY = -256;
        int minY = 256;
        for(int[] d : dots) {
            if(d[0] > maxX) maxX = d[0];
            if(d[0] < minX) minX = d[0];
            if(d[1] > maxY) maxY = d[1];
            if(d[1] < minY) minY = d[1];
        }
        
        return Math.abs(maxX - minX) * Math.abs(maxY - minY);
    }
}