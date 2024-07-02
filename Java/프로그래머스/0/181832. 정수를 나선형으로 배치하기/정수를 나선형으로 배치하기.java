import java.util.*;
class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int i = 0;
        int j = 0;
        int num = 1;
        int start = 0;
        int end = n - 1;
        while(start <= end && num <= n * n) {
            i = start;
            j = start;
            while(j < end) answer[i][j++] = num++;         
            
            while(i < end) answer[i++][j] = num++;
            end--;          
            
            while(j > start) answer[i][j--] = num++;           
            
            while(i > start) answer[i--][j] = num++;
            start++;
            
        }
        if(n % 2 != 0) answer[n / 2][n / 2] = n * n;        
        
        return answer;

    }
}