import java.util.*;
class Solution {
    public int solution(int[] array) {
        StringBuilder sb = new StringBuilder();
        for(int a : array) {
            sb.append(a);
        }
        int answer = 0;
        for(char c : sb.toString().toCharArray()) {
            if(c == '7') answer++;
        }
        return answer;
    }
}