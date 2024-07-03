class Solution {
    boolean solution(String s) {
        
        int cntP = 0;
        int cntY = 0;
        for(char c : s.toLowerCase().toCharArray()) {
            if(c == 'p') cntP++;
            if(c == 'y') cntY++;
        }

        return cntP == cntY;
    }
}