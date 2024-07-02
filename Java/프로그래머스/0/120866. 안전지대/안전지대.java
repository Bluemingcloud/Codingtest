import java.util.*;
class Solution {
    public int solution(int[][] board) {

        List<Integer[]> list = new ArrayList<>();
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 1) list.add(new Integer[] {i, j});
            }
        }
        
        for(Integer[] arr : list) {
            for(int i = -1; i <= 1; i++) {
                int x = arr[0] + i;
                if(x < 0 || x >= board.length) continue;
                for(int j = -1; j <= 1; j++) {
                    int y = arr[1] + j;
                    if(y < 0 || y >= board.length) continue;
                    if(board[x][y] == 0) board[x][y]++;
                }
            }
        }
        
        int answer = 0;
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 0) answer++;
            }
        }

        return answer;
    }
}