class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        
        String target = board[h][w];
        
        int[][] arounds = {{h - 1, w}, {h + 1, w}, {h, w - 1}, {h, w + 1}};
        
        
        for(int[] a : arounds) {
            int temph = a[0];
            int tempw = a[1];
            try {
                if(board[temph][tempw].equals(target)) answer++;
            } catch(Exception e) {
            }
        }
            
        
        
        return answer;
    }
}