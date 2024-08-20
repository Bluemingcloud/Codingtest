class Solution {
    public int solution(String s) {
        int answer = 0;
        char x = ' ';
        int check = 0;
        for(char c : s.toCharArray()) {
            if(check == 0) x = c;
            
            if(x == c) check++;
            else check--;
            
            if(check == 0) {
                answer++;
            }
            
        }
        
        
        return check > 0 ? answer + 1 : answer;
    }
}