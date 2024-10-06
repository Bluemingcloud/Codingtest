import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();
        
        for(int m : moves) {
            int i = 0;
            while(i < board.length) {
                if(board[i][m - 1] != 0) {
                    list.add(board[i][m - 1]);
                    board[i][m - 1] = 0;
                    break;
                }
                i++;
            }

            if(i == board.length) continue;
            
            if(list.size() >= 2 && list.get(list.size() - 1) == list.get(list.size() - 2)) {
                list.remove(list.size() - 1);
                list.remove(list.size() - 1);
                
                answer++;
            }
            
        }
        
        return answer * 2;
    }
}