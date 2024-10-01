import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        int[] student = new int[32];
        boolean[] check = new boolean[31];
        
        for(int r : reserve) {
            student[r]++;
        }
        
        Arrays.sort(lost);
        for(int l : lost) {
            if(student[l] != 0) {
                student[l]--;
                check[l] = true;    
            }   
        }
        
        int cnt = 0;

        for(int l : lost) {
            if(check[l]) {
                continue;
            }
            if(student[l - 1] == 0 && student[l + 1] == 0) {
                cnt++;
            } else if(student[l - 1] == 0 && student[l + 1] != 0) {
                student[l + 1]--;
            } else if(student[l - 1] != 0 && student[l + 1] == 0) {
                student[l - 1]--;
            } else {
                student[l - 1]--;
            }
        }
        
        return n - cnt;
    }
}