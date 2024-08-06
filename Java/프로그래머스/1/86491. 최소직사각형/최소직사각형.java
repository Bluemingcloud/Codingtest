class Solution {
    public int solution(int[][] sizes) {
        int w = 0;
        int h = 0;
        for(int i = 0; i < sizes.length; i++) {
            w = Math.min(sizes[i][0], sizes[i][1]) > w ? Math.min(sizes[i][0], sizes[i][1]) : w;
            h = Math.max(sizes[i][0], sizes[i][1]) > h ? Math.max(sizes[i][0], sizes[i][1]) : h;
        }
        return w * h;
    }
}