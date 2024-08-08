class Solution {
    public int solution(int[][] sizes) {
        int w = 0;
        int h = 0;
        for(int[] size : sizes) {
            w = Math.min(size[0], size[1]) > w ? Math.min(size[0], size[1]) : w;
            h = Math.max(size[0], size[1]) > h ? Math.max(size[0], size[1]) : h;
        }
        return w * h;
    }
}