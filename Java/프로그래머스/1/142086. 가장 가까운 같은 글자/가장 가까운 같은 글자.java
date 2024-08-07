import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Arrays.fill(answer, -1);
        
        int[] locations = new int[26];
        
        for(int i = 0; i < s.length(); i++) {
            if(locations[s.charAt(i) - 97] != 0) {
                answer[i] = i + 1 - locations[s.charAt(i) - 97];
            }
            locations[s.charAt(i) - 97] = i + 1;
        }
        return answer;
    }
}