import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int[] arr = new int[26];
        
        Arrays.fill(arr, Integer.MAX_VALUE);
        
        for(String key : keymap) {
            for(int i = 0; i < key.length(); i++) {
                arr[key.charAt(i) - 'A'] = Math.min(arr[key.charAt(i) - 'A'], i + 1);
            }
        }
        
        int idx = 0;
        for(String t : targets) {
            int cnt = 0;
            for(int i = 0; i < t.length(); i++) {
                if(arr[t.charAt(i) - 'A'] == Integer.MAX_VALUE) {
                    cnt = -1;
                    break;
                }
                cnt += arr[t.charAt(i) - 'A'];
            }
            answer[idx++] = cnt;
        }
        
        
        return answer;
    }
}
