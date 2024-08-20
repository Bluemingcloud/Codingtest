import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;
        int count = 0;
        int[] number = new int[46];
        for(int l : lottos) {
            if(l == 0) zero++;
            else number[l]++;
        }
        
        for(int num : win_nums) {
            if(number[num] != 0) count++;
        }
        int[] answer = new int[2];
        answer[0] = count + zero != 0 ? 7 - (count + zero) : 6;
        answer[1] = count != 0 ? 7 - count : 6;
        
        return answer;
    }
}