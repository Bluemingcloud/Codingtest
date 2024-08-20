import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for(int j = 0; j < index; j++) {
                c = c == 'z' ? 'a' : (char)(c + 1);
                while(skip.contains(String.valueOf(c))) {
                    c = c == 'z' ? 'a' : (char)(c + 1);
                }
            }
            
            answer.append(String.valueOf(c));
        }

        return answer.toString();
    }
}